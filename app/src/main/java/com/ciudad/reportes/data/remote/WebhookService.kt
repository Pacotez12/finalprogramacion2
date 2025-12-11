package com.ciudad.reportes.data.remote

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface WebhookService {
    @POST("https://webhook.site/0f518304-e3ab-4722-95d3-566e7e5f0d45/") // Webhook endpoint is the base URL
    suspend fun sendReport(@Body reporte: ReporteRequest): Response<Unit>
}