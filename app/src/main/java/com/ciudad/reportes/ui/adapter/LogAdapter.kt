package com.ciudad.reportes.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ciudad.reportes.R
import com.ciudad.reportes.data.model.LogEvento

class LogAdapter : RecyclerView.Adapter<LogAdapter.LogViewHolder>() {

    private var logs = emptyList<LogEvento>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_log, parent, false)
        return LogViewHolder(view)
    }

    override fun onBindViewHolder(holder: LogViewHolder, position: Int) {
        val current = logs[position]
        holder.bind(current)
    }

    override fun getItemCount() = logs.size

    fun setLogs(logs: List<LogEvento>) {
        this.logs = logs
        notifyDataSetChanged()
    }

    class LogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val eventoTextView: TextView = itemView.findViewById(R.id.log_evento_textview)
        private val detalleTextView: TextView = itemView.findViewById(R.id.log_detalle_textview)
        private val fechaTextView: TextView = itemView.findViewById(R.id.log_fecha_textview)

        fun bind(log: LogEvento) {
            eventoTextView.text = log.evento
            detalleTextView.text = log.detalle
            fechaTextView.text = log.fechaHora
        }
    }
}
