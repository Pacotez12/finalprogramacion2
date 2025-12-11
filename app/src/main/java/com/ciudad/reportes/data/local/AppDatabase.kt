package com.ciudad.reportes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ciudad.reportes.data.model.LogEvento
import com.ciudad.reportes.data.model.Reporte

@Database(entities = [Reporte::class, LogEvento::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun reporteDao(): ReporteDao
    abstract fun logEventoDao(): LogEventoDao
}