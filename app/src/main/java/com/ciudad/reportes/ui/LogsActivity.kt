package com.ciudad.reportes.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ciudad.reportes.R
import com.ciudad.reportes.ReporteApplication
import com.ciudad.reportes.ui.adapter.LogAdapter
import com.ciudad.reportes.ui.viewmodel.ReporteViewModel
import com.ciudad.reportes.ui.viewmodel.ReporteViewModelFactory

class LogsActivity : AppCompatActivity() {

    private val viewModel: ReporteViewModel by viewModels {
        ReporteViewModelFactory((application as ReporteApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logs)

        val recyclerView = findViewById<RecyclerView>(R.id.logs_recyclerview)
        val adapter = LogAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.allLogs.observe(this) { logs ->
            logs?.let { adapter.setLogs(it) }
        }
    }
}
