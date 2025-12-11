package com.ciudad.reportes.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ciudad.reportes.R
import com.ciudad.reportes.ReporteApplication
import com.ciudad.reportes.ui.adapter.ReporteAdapter
import com.ciudad.reportes.ui.viewmodel.ReporteViewModel
import com.ciudad.reportes.ui.viewmodel.ReporteViewModelFactory

class MainActivity : AppCompatActivity() {

    private val viewModel: ReporteViewModel by viewModels {
        ReporteViewModelFactory((application as ReporteApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerReportes)
        val btnNuevo = findViewById<Button>(R.id.btnNuevoReporte)
        val btnLogs = findViewById<Button>(R.id.btnVerLogs)
        val btnSincronizar = findViewById<Button>(R.id.btnSincronizar) // ADDED

        val adapter = ReporteAdapter(
            onItemClicked = { reporte ->
                val intent = Intent(this, FormActivity::class.java).apply {
                    putExtra(FormActivity.EXTRA_REPORTE_ID, reporte.id)
                }
                startActivity(intent)
            },
            onDeleteClicked = { reporte ->
                viewModel.delete(reporte)
            },
            onSyncClicked = { reporte ->
                viewModel.syncReporte(reporte)
            }
        )
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter

        viewModel.allReportes.observe(this) { reportes ->
            reportes?.let {
                adapter.submitList(it)
            }
        }

        viewModel.syncingIds.observe(this) { ids ->
            ids?.let {
                adapter.setSyncingIds(it)
            }
        }

        btnNuevo.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }

        btnLogs.setOnClickListener {
            startActivity(Intent(this, LogsActivity::class.java))
        }

        btnSincronizar.setOnClickListener { // ADDED
            viewModel.syncAllReports() // ADDED
        }
    }
}
