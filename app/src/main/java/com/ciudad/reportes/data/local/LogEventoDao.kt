package com.ciudad.reportes.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ciudad.reportes.data.model.LogEvento

@Dao
interface LogEventoDao {
    @Insert
    suspend fun insertLog(log: LogEvento)

    @Query("SELECT * FROM logs_evento ORDER BY id DESC")
    fun getLogs(): LiveData<List<LogEvento>>
}
