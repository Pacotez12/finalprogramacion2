package com.ciudad.reportes.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0018\u001a\u00020\bJ(\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bJ\u0006\u0010 \u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J0\u0010\"\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/ciudad/reportes/ui/viewmodel/ReporteViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ciudad/reportes/data/repository/ReporteRepository;", "(Lcom/ciudad/reportes/data/repository/ReporteRepository;)V", "_syncingIds", "Landroidx/lifecycle/MutableLiveData;", "", "", "allLogs", "Landroidx/lifecycle/LiveData;", "", "Lcom/ciudad/reportes/data/model/LogEvento;", "getAllLogs", "()Landroidx/lifecycle/LiveData;", "allReportes", "Lcom/ciudad/reportes/data/model/Reporte;", "getAllReportes", "syncingIds", "getSyncingIds", "delete", "", "reporte", "getReporteById", "id", "guardar", "descripcion", "", "lat", "", "lon", "rutaFoto", "syncAllReports", "syncReporte", "update", "app_debug"})
public final class ReporteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ciudad.reportes.data.repository.ReporteRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ciudad.reportes.data.model.Reporte>> allReportes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ciudad.reportes.data.model.LogEvento>> allLogs = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.Set<java.lang.Integer>> _syncingIds = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.Set<java.lang.Integer>> syncingIds = null;
    
    public ReporteViewModel(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.repository.ReporteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ciudad.reportes.data.model.Reporte>> getAllReportes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ciudad.reportes.data.model.LogEvento>> getAllLogs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Set<java.lang.Integer>> getSyncingIds() {
        return null;
    }
    
    public final void guardar(@org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, double lat, double lon, @org.jetbrains.annotations.Nullable()
    java.lang.String rutaFoto) {
    }
    
    public final void update(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, double lat, double lon, @org.jetbrains.annotations.Nullable()
    java.lang.String rutaFoto) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte) {
    }
    
    public final void syncReporte(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte) {
    }
    
    public final void syncAllReports() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ciudad.reportes.data.model.Reporte> getReporteById(int id) {
        return null;
    }
}