package com.ciudad.reportes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u001a0\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, d2 = {"Lcom/ciudad/reportes/ReporteApplication;", "Landroid/app/Application;", "()V", "apiService", "Lcom/ciudad/reportes/data/remote/ApiService;", "kotlin.jvm.PlatformType", "getApiService", "()Lcom/ciudad/reportes/data/remote/ApiService;", "apiService$delegate", "Lkotlin/Lazy;", "database", "Lcom/ciudad/reportes/data/local/AppDatabase;", "getDatabase", "()Lcom/ciudad/reportes/data/local/AppDatabase;", "database$delegate", "repository", "Lcom/ciudad/reportes/data/repository/ReporteRepository;", "getRepository", "()Lcom/ciudad/reportes/data/repository/ReporteRepository;", "repository$delegate", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "webhookService", "Lcom/ciudad/reportes/data/remote/WebhookService;", "getWebhookService", "()Lcom/ciudad/reportes/data/remote/WebhookService;", "webhookService$delegate", "app_debug"})
public final class ReporteApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy retrofit$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy apiService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy webhookService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    
    public ReporteApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ciudad.reportes.data.local.AppDatabase getDatabase() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final com.ciudad.reportes.data.remote.ApiService getApiService() {
        return null;
    }
    
    public final com.ciudad.reportes.data.remote.WebhookService getWebhookService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ciudad.reportes.data.repository.ReporteRepository getRepository() {
        return null;
    }
}