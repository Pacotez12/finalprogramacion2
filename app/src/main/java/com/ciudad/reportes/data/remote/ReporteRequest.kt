package com.ciudad.reportes.data.remote

import com.google.gson.annotations.SerializedName

data class ReporteRequest(
    @SerializedName("descripcion") val descripcion: String,
    @SerializedName("fechaHora") val fechaHora: String,
    @SerializedName("latitud") val latitud: Double,
    @SerializedName("longitud") val longitud: Double,
    @SerializedName("rutaFoto") val rutaFoto: String?
)