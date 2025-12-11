package com.ciudad.reportes.ui

import android.Manifest
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.core.net.toUri
import com.ciudad.reportes.R
import com.ciudad.reportes.ReporteApplication
import com.ciudad.reportes.data.model.Reporte
import com.ciudad.reportes.ui.viewmodel.ReporteViewModel
import com.ciudad.reportes.ui.viewmodel.ReporteViewModelFactory
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class FormActivity : AppCompatActivity() {

    private val viewModel: ReporteViewModel by viewModels {
        ReporteViewModelFactory((application as ReporteApplication).repository)
    }

    private var photoUri: Uri? = null
    private var currentPhotoPath: String? = null
    private var currentReporte: Reporte? = null
    private var currentReporteId: Int = -1

    private lateinit var etDesc: EditText
    private lateinit var imgPreview: ImageView
    private lateinit var btnGuardar: Button

    private val cameraLauncher = registerForActivityResult(ActivityResultContracts.TakePicture()) { success ->
        if (success) {
            imgPreview.setImageURI(photoUri)
        } else {
            // Si se cancela la foto nueva, pero ya había una, mantenemos la original.
            if (currentReporte?.rutaFoto == null) {
                currentPhotoPath = null
            }
            Toast.makeText(this, "Captura de foto cancelada.", Toast.LENGTH_SHORT).show()
        }
    }

    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted: Boolean ->
            if (isGranted) {
                tomarFoto()
            } else {
                Toast.makeText(this, "El permiso de cámara es necesario para tomar fotos.", Toast.LENGTH_LONG).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        etDesc = findViewById(R.id.etDescripcion)
        val btnFoto = findViewById<Button>(R.id.btnTomarFoto)
        btnGuardar = findViewById(R.id.btnGuardar)
        imgPreview = findViewById(R.id.imgPreview)

        currentReporteId = intent.getIntExtra(EXTRA_REPORTE_ID, -1)

        if (currentReporteId != -1) {
            subscribeUi()
        }

        btnFoto.setOnClickListener { solicitarPermisoCamara() }

        btnGuardar.setOnClickListener {
            val desc = etDesc.text.toString()
            if (desc.isNotEmpty()) {
                if (currentReporte == null) { // Modo Creación
                    viewModel.guardar(desc, -25.2637, -57.5759, currentPhotoPath)
                } else { // Modo Edición
                    viewModel.update(currentReporte!!.id, desc, currentReporte!!.latitud, currentReporte!!.longitud, currentPhotoPath)
                }
                finish()
            } else {
                Toast.makeText(this, "La descripción es obligatoria", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun subscribeUi() {
        viewModel.getReporteById(currentReporteId).observe(this) { reporte ->
            reporte?.let {
                currentReporte = it
                populateForm(it)
            }
        }
    }

    private fun populateForm(reporte: Reporte) {
        etDesc.setText(reporte.descripcion)
        btnGuardar.text = "Actualizar Reporte"
        if (reporte.rutaFoto != null) {
            currentPhotoPath = reporte.rutaFoto
            imgPreview.setImageURI(File(reporte.rutaFoto).toUri())
        }
    }

    private fun solicitarPermisoCamara() {
        when {
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED -> {
                tomarFoto()
            }
            shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA)
            }
            else -> {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA)
            }
        }
    }

    private fun tomarFoto() {
        val photoFile = createImageFile()
        photoUri = FileProvider.getUriForFile(
            this,
            "com.ciudad.reportes.fileprovider",
            photoFile
        )
        cameraLauncher.launch(photoUri)
    }

    private fun createImageFile(): File {
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        val storageDir: File? = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile("JPEG_${timeStamp}_", ".jpg", storageDir).apply {
            currentPhotoPath = absolutePath
        }
    }

    companion object {
        const val EXTRA_REPORTE_ID = "REPORTE_ID"
    }
}