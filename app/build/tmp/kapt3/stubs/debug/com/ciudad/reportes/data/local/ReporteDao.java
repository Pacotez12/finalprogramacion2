package com.ciudad.reportes.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000b\u001a\u00020\fH'J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/ciudad/reportes/data/local/ReporteDao;", "", "deleteReporte", "", "reporte", "Lcom/ciudad/reportes/data/model/Reporte;", "(Lcom/ciudad/reportes/data/model/Reporte;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllReportes", "Landroidx/lifecycle/LiveData;", "", "getReporteById", "id", "", "insertReporte", "updateReporte", "app_debug"})
@androidx.room.Dao()
public abstract interface ReporteDao {
    
    @androidx.room.Query(value = "SELECT * FROM reportes ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ciudad.reportes.data.model.Reporte>> getAllReportes();
    
    @androidx.room.Query(value = "SELECT * FROM reportes WHERE id = :id")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.ciudad.reportes.data.model.Reporte> getReporteById(int id);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertReporte(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateReporte(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteReporte(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.data.model.Reporte reporte, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}