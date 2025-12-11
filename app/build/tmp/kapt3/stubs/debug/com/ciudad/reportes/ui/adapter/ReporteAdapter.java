package com.ciudad.reportes.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ciudad/reportes/ui/adapter/ReporteAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ciudad/reportes/data/model/Reporte;", "Lcom/ciudad/reportes/ui/adapter/ReporteAdapter$ReporteViewHolder;", "onItemClicked", "Lkotlin/Function1;", "", "onDeleteClicked", "onSyncClicked", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "syncingIds", "", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSyncingIds", "ids", "ReporteViewHolder", "app_debug"})
public final class ReporteAdapter extends androidx.recyclerview.widget.ListAdapter<com.ciudad.reportes.data.model.Reporte, com.ciudad.reportes.ui.adapter.ReporteAdapter.ReporteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.ciudad.reportes.data.model.Reporte, kotlin.Unit> onItemClicked = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.ciudad.reportes.data.model.Reporte, kotlin.Unit> onDeleteClicked = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.ciudad.reportes.data.model.Reporte, kotlin.Unit> onSyncClicked = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.Integer> syncingIds;
    
    public ReporteAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ciudad.reportes.data.model.Reporte, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ciudad.reportes.data.model.Reporte, kotlin.Unit> onDeleteClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ciudad.reportes.data.model.Reporte, kotlin.Unit> onSyncClicked) {
        super(null);
    }
    
    public final void setSyncingIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Integer> ids) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ciudad.reportes.ui.adapter.ReporteAdapter.ReporteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ciudad.reportes.ui.adapter.ReporteAdapter.ReporteViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ciudad/reportes/ui/adapter/ReporteAdapter$ReporteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "deleteIcon", "Landroid/widget/ImageView;", "getDeleteIcon", "()Landroid/widget/ImageView;", "descripcion", "Landroid/widget/TextView;", "estado", "getEstado", "()Landroid/widget/TextView;", "syncStatusGroup", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bind", "", "reporte", "Lcom/ciudad/reportes/data/model/Reporte;", "isSyncing", "", "app_debug"})
    public static final class ReporteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView descripcion = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView estado = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView deleteIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.widget.ConstraintLayout syncStatusGroup = null;
        
        public ReporteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEstado() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getDeleteIcon() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ciudad.reportes.data.model.Reporte reporte, boolean isSyncing) {
        }
    }
}