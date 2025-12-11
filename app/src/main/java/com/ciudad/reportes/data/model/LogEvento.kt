package com.ciudad.reportes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "logs_evento")
data class LogEvento(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val evento: String,
    val detalle: String,
    val fechaHora: String
)