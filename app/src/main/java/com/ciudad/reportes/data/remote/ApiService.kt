package com.ciudad.reportes.data.remote

import com.ciudad.reportes.data.model.Reporte
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    // Endpoint mock
    @POST(".") 
    suspend fun enviarReporte(@Body reporte: Reporte): Response<Void>
}