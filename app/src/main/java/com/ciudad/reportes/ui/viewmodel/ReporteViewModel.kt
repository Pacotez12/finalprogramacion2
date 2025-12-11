package com.ciudad.reportes.ui.viewmodel

import androidx.lifecycle.*
import com.ciudad.reportes.data.model.LogEvento
import com.ciudad.reportes.data.model.Reporte
import com.ciudad.reportes.data.repository.ReporteRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ReporteViewModel(private val repository: ReporteRepository) : ViewModel() {

    val allReportes: LiveData<List<Reporte>> = repository.allReportes
    val allLogs: LiveData<List<LogEvento>> = repository.allLogs

    private val _syncingIds = MutableLiveData<Set<Int>>(emptySet())
    val syncingIds: LiveData<Set<Int>> = _syncingIds

    fun guardar(descripcion: String, lat: Double, lon: Double, rutaFoto: String?) {
        val nuevo = Reporte(
            descripcion = descripcion,
            fechaHora = java.util.Date().toString(),
            latitud = lat,
            longitud = lon,
            rutaFoto = rutaFoto,
            sincronizado = false
        )
        viewModelScope.launch {
            repository.guardarReporte(nuevo)
        }
    }

    fun update(id: Int, descripcion: String, lat: Double, lon: Double, rutaFoto: String?) {
        val reporteActualizado = Reporte(
            id = id,
            descripcion = descripcion,
            fechaHora = java.util.Date().toString(), // o mantener la fecha original si se prefiere
            latitud = lat,
            longitud = lon,
            rutaFoto = rutaFoto,
            sincronizado = false // Asumimos que una actualización requiere re-sincronización
        )
        viewModelScope.launch {
            repository.updateReporte(reporteActualizado)
        }
    }

    fun delete(reporte: Reporte) {
        viewModelScope.launch {
            repository.deleteReporte(reporte)
        }
    }

    fun syncReporte(reporte: Reporte) {
        viewModelScope.launch {
            _syncingIds.value = _syncingIds.value?.plus(reporte.id)
            val success = repository.sendReportToWebhook(reporte) // Call webhook

            _syncingIds.value = _syncingIds.value?.minus(reporte.id)
        }
    }

    fun syncAllReports() {
        viewModelScope.launch {
            val unsyncedReports = repository.allReportes.value?.filter { !it.sincronizado } ?: emptyList()
            if (unsyncedReports.isNotEmpty()) {
                val currentSyncing = _syncingIds.value.orEmpty()
                _syncingIds.value = currentSyncing.plus(unsyncedReports.map { it.id })

                unsyncedReports.forEach { reporte ->
                    repository.sendReportToWebhook(reporte) // Call webhook, repository handles local update

                    _syncingIds.value = _syncingIds.value?.minus(reporte.id)
                }
            }
        }
    }


    fun getReporteById(id: Int): LiveData<Reporte> {
        return repository.getReporteById(id)
    }
}

class ReporteViewModelFactory(private val repository: ReporteRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ReporteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ReporteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}