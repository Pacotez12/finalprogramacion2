package com.ciudad.reportes.data.repository

import androidx.lifecycle.LiveData
import com.ciudad.reportes.data.local.LogEventoDao
import com.ciudad.reportes.data.local.ReporteDao
import com.ciudad.reportes.data.model.LogEvento
import com.ciudad.reportes.data.model.Reporte
import com.ciudad.reportes.data.remote.ApiService
import com.ciudad.reportes.data.remote.ReporteRequest // Import the new data class
import com.ciudad.reportes.data.remote.WebhookService // Import the new service
import java.util.Date
import retrofit2.HttpException // Import for error handling

class ReporteRepository(
    private val reporteDao: ReporteDao,
    private val logEventoDao: LogEventoDao,
    private val apiService: ApiService,
    private val webhookService: WebhookService // ADDED
) {
    val allReportes: LiveData<List<Reporte>> = reporteDao.getAllReportes()
    val allLogs: LiveData<List<LogEvento>> = logEventoDao.getLogs()

    suspend fun guardarReporte(reporte: Reporte) {
        reporteDao.insertReporte(reporte)
        registrarLog("CREACION", "Reporte creado localmente: ${reporte.descripcion}")
    }

    suspend fun updateReporte(reporte: Reporte) {
        reporteDao.updateReporte(reporte)
        registrarLog("EDICION", "Reporte actualizado localmente: ${reporte.descripcion}")
    }

    suspend fun deleteReporte(reporte: Reporte) {
        reporteDao.deleteReporte(reporte)
        registrarLog("ELIMINACION", "Reporte eliminado localmente: ${reporte.descripcion}")
    }

    fun getReporteById(id: Int): LiveData<Reporte> {
        return reporteDao.getReporteById(id)
    }

    // ADDED: Send report to webhook
    suspend fun sendReportToWebhook(reporte: Reporte): Boolean {
        return try {
            val reporteRequest = ReporteRequest(
                descripcion = reporte.descripcion,
                fechaHora = reporte.fechaHora,
                latitud = reporte.latitud,
                longitud = reporte.longitud,
                rutaFoto = reporte.rutaFoto
            )
            val response = webhookService.sendReport(reporteRequest)
            if (response.isSuccessful) {
                // Update the local report to mark it as synchronized
                val updatedReporte = reporte.copy(sincronizado = true)
                reporteDao.updateReporte(updatedReporte)
                registrarLog("SINCRONIZACION_EXITOSA", "Reporte sincronizado y actualizado localmente: ${reporte.descripcion}")
                true
            } else {
                val errorBody = response.errorBody()?.string()
                registrarLog("ERROR_SINCRONIZACION", "Fallo al enviar reporte al webhook: ${reporte.descripcion}. Código: ${response.code()}. Error Body: $errorBody")
                false
            }
        } catch (e: HttpException) {
            registrarLog("ERROR_HTTP", "Error HTTP al enviar reporte: ${e.message()}. Detalles: ${e.response()?.errorBody()?.string()}")
            false
        } catch (e: Exception) {
            registrarLog("ERROR_RED", "Error de red o desconocido al enviar reporte: ${e.localizedMessage}. StackTrace: ${e.stackTraceToString()}")
            false
        }
    }


    private suspend fun registrarLog(evento: String, detalle: String) {
        val log = LogEvento(evento = evento, detalle = detalle, fechaHora = Date().toString())
        logEventoDao.insertLog(log)
    }
}