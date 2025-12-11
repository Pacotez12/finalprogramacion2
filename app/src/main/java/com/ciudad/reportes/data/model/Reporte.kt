package com.ciudad.reportes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reportes")
data class Reporte(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val descripcion: String,
    val fechaHora: String,
    val latitud: Double,
    val longitud: Double,
    val rutaFoto: String?,
    val sincronizado: Boolean = false
)