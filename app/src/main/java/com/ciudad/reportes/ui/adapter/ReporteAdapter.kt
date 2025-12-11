package com.ciudad.reportes.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ciudad.reportes.R
import com.ciudad.reportes.data.model.Reporte

class ReporteAdapter(
    private val onItemClicked: (Reporte) -> Unit,
    private val onDeleteClicked: (Reporte) -> Unit,
    private val onSyncClicked: (Reporte) -> Unit
) : ListAdapter<Reporte, ReporteAdapter.ReporteViewHolder>(ReporteDiffCallback()) {

    private var syncingIds = setOf<Int>()

    fun setSyncingIds(ids: Set<Int>) {
        syncingIds = ids
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReporteViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_reporte, parent, false)
        return ReporteViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReporteViewHolder, position: Int) {
        val reporte = getItem(position)
        val isSyncing = syncingIds.contains(reporte.id)

        holder.bind(reporte, isSyncing)

        holder.itemView.setOnClickListener {
            onItemClicked(reporte)
        }
        holder.deleteIcon.setOnClickListener {
            // Aquí mantenemos el diálogo de confirmación que ya existía
            com.google.android.material.dialog.MaterialAlertDialogBuilder(holder.itemView.context)
                .setTitle("Confirmar Eliminación")
                .setMessage("¿Estás seguro de que deseas eliminar este reporte?")
                .setNegativeButton("Cancelar") { dialog, _ -> dialog.dismiss() }
                .setPositiveButton("Eliminar") { dialog, _ ->
                    onDeleteClicked(reporte)
                    dialog.dismiss()
                }
                .show()
        }
        
        holder.estado.setOnClickListener {
            if (!reporte.sincronizado && !isSyncing) {
                onSyncClicked(reporte)
            }
        }
    }

    class ReporteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val descripcion: TextView = itemView.findViewById(R.id.tvDescripcion)
        val estado: TextView = itemView.findViewById(R.id.tvEstado)
        val deleteIcon: ImageView = itemView.findViewById(R.id.ivDelete)
        private val syncStatusGroup: ConstraintLayout = itemView.findViewById(R.id.syncStatusGroup)

        fun bind(reporte: Reporte, isSyncing: Boolean) {
            descripcion.text = reporte.descripcion

            when {
                isSyncing -> {
                    syncStatusGroup.visibility = View.VISIBLE
                    estado.visibility = View.GONE
                }
                reporte.sincronizado -> {
                    syncStatusGroup.visibility = View.GONE
                    estado.visibility = View.VISIBLE
                    estado.text = "Sincronizado"
                    estado.isClickable = false
                }
                else -> { // No sincronizado
                    syncStatusGroup.visibility = View.GONE
                    estado.visibility = View.VISIBLE
                    estado.text = "Pendiente"
                    estado.isClickable = true
                }
            }
        }
    }
}

class ReporteDiffCallback : DiffUtil.ItemCallback<Reporte>() {
    override fun areItemsTheSame(oldItem: Reporte, newItem: Reporte): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Reporte, newItem: Reporte): Boolean {
        return oldItem == newItem
    }
}