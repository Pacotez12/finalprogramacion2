package com.ciudad.reportes.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0017R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/ciudad/reportes/data/repository/ReporteRepository;", "", "reporteDao", "Lcom/ciudad/reportes/data/local/ReporteDao;", "logEventoDao", "Lcom/ciudad/reportes/data/local/LogEventoDao;", "apiService", "Lcom/ciudad/reportes/data/remote/ApiService;", "webhookService", "Lcom/ciudad/reportes/data/remote/WebhookService;", "(Lcom/ciudad/reportes/data/local/ReporteDao;Lcom/ciudad/reportes/data/local/LogEventoDao;Lcom/ciudad/reportes/data/remote/ApiService;Lcom/ciudad/reportes/data/remote/WebhookService;)V", "allLogs", "Landroidx/lifecycle/LiveData;", "", "Lcom/ciudad/reportes/data/model/LogEvento;", "getAllLogs", "()Landroidx/lifecycle/LiveData;", "allReportes", "Lcom/ciudad/reportes/data/model/Reporte;", "getAllReportes", "deleteReporte", "", "reporte", "(Lcom/ciudad/reportes/data/model/Reporte;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReporteById", "id", "", "guardarReporte", "registrarLog", "evento", "", "detalle", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendReportToWebhook", "", "updateReporte", "app_debug"})
public final class ReporteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.ciudad.reportes.data.local.ReporteDao reporteDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ciudad.reportes.data.local.LogEventoDao logEventoDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ciudad.reportes.data.remote.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ciudad.reportes.data.remote.WebhookService webhookService = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ciudad.reportes.data.model.Reporte>> allReportes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.ciudad.reportes.data.model.LogEvento>> allLogs = null;
    
    public ReporteRepository(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.local.ReporteDao reporteDao, @org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.local.LogEventoDao logEventoDao, @org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.remote.WebhookService webhookService) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object guardarReporte(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateReporte(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteReporte(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ciudad.reportes.data.model.Reporte> getReporteById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReportToWebhook(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final java.lang.Object registrarLog(java.lang.String evento, java.lang.String detalle, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}