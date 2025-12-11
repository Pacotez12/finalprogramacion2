package com.ciudad.reportes

import android.app.Application
import androidx.room.Room
import com.ciudad.reportes.data.local.AppDatabase
import com.ciudad.reportes.data.remote.ApiService
import com.ciudad.reportes.data.repository.ReporteRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ReporteApplication : Application() {
    val database by lazy {
        Room.databaseBuilder(this, AppDatabase::class.java, "reportes_db").build()
    }
    
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://webhook.site/0f518304-e3ab-4722-95d3-566e7e5f0d45/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    val webhookService by lazy {
        retrofit.create(com.ciudad.reportes.data.remote.WebhookService::class.java)
    }

    val repository by lazy {
        ReporteRepository(database.reporteDao(), database.logEventoDao(), apiService, webhookService)
    }
}