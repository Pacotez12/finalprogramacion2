package com.ciudad.reportes.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ciudad.reportes.data.model.LogEvento
import com.ciudad.reportes.data.model.Reporte

@Dao
interface ReporteDao {
    @Query("SELECT * FROM reportes ORDER BY id DESC")
    fun getAllReportes(): LiveData<List<Reporte>>

    @Query("SELECT * FROM reportes WHERE id = :id")
    fun getReporteById(id: Int): LiveData<Reporte>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReporte(reporte: Reporte)

    @Update
    suspend fun updateReporte(reporte: Reporte)

    @Delete
    suspend fun deleteReporte(reporte: Reporte)
}