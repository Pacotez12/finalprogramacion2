package com.ciudad.reportes.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\fH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\n0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006'"}, d2 = {"Lcom/ciudad/reportes/ui/FormActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnGuardar", "Landroid/widget/Button;", "cameraLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "currentPhotoPath", "", "currentReporte", "Lcom/ciudad/reportes/data/model/Reporte;", "currentReporteId", "", "etDesc", "Landroid/widget/EditText;", "imgPreview", "Landroid/widget/ImageView;", "photoUri", "requestPermissionLauncher", "viewModel", "Lcom/ciudad/reportes/ui/viewmodel/ReporteViewModel;", "getViewModel", "()Lcom/ciudad/reportes/ui/viewmodel/ReporteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createImageFile", "Ljava/io/File;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "populateForm", "reporte", "solicitarPermisoCamara", "subscribeUi", "tomarFoto", "Companion", "app_debug"})
public final class FormActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri photoUri;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentPhotoPath;
    @org.jetbrains.annotations.Nullable()
    private com.ciudad.reportes.data.model.Reporte currentReporte;
    private int currentReporteId = -1;
    private android.widget.EditText etDesc;
    private android.widget.ImageView imgPreview;
    private android.widget.Button btnGuardar;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> cameraLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REPORTE_ID = "REPORTE_ID";
    @org.jetbrains.annotations.NotNull()
    public static final com.ciudad.reportes.ui.FormActivity.Companion Companion = null;
    
    public FormActivity() {
        super();
    }
    
    private final com.ciudad.reportes.ui.viewmodel.ReporteViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeUi() {
    }
    
    private final void populateForm(com.ciudad.reportes.data.model.Reporte reporte) {
    }
    
    private final void solicitarPermisoCamara() {
    }
    
    private final void tomarFoto() {
    }
    
    private final java.io.File createImageFile() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ciudad/reportes/ui/FormActivity$Companion;", "", "()V", "EXTRA_REPORTE_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}