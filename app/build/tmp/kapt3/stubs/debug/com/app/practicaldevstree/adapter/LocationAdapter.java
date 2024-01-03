package com.app.practicaldevstree.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u001e\u0010\u001e\u001a\u00020\u00172\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/app/practicaldevstree/adapter/LocationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/practicaldevstree/adapter/LocationAdapter$ViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/app/practicaldevstree/data/model/PlaceEntity;", "Lkotlin/collections/ArrayList;", "listenerEdit", "Lcom/app/practicaldevstree/adapter/onClickEditListener;", "listenerDelete", "Lcom/app/practicaldevstree/adapter/onClickDeleteListener;", "(Ljava/util/ArrayList;Lcom/app/practicaldevstree/adapter/onClickEditListener;Lcom/app/practicaldevstree/adapter/onClickDeleteListener;)V", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getListenerDelete", "()Lcom/app/practicaldevstree/adapter/onClickDeleteListener;", "getListenerEdit", "()Lcom/app/practicaldevstree/adapter/onClickEditListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "ViewHolder", "app_debug"})
public final class LocationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.practicaldevstree.adapter.LocationAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.app.practicaldevstree.data.model.PlaceEntity> list;
    @org.jetbrains.annotations.NotNull
    private final com.app.practicaldevstree.adapter.onClickEditListener listenerEdit = null;
    @org.jetbrains.annotations.NotNull
    private final com.app.practicaldevstree.adapter.onClickDeleteListener listenerDelete = null;
    
    public LocationAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.app.practicaldevstree.data.model.PlaceEntity> list, @org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.adapter.onClickEditListener listenerEdit, @org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.adapter.onClickDeleteListener listenerDelete) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.app.practicaldevstree.data.model.PlaceEntity> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.app.practicaldevstree.data.model.PlaceEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.practicaldevstree.adapter.onClickEditListener getListenerEdit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.practicaldevstree.adapter.onClickDeleteListener getListenerDelete() {
        return null;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.app.practicaldevstree.data.model.PlaceEntity> newList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.app.practicaldevstree.adapter.LocationAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.adapter.LocationAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/app/practicaldevstree/adapter/LocationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/app/practicaldevstree/databinding/RowLocationListBinding;", "(Lcom/app/practicaldevstree/adapter/LocationAdapter;Lcom/app/practicaldevstree/databinding/RowLocationListBinding;)V", "getBinding", "()Lcom/app/practicaldevstree/databinding/RowLocationListBinding;", "bind", "", "model", "Lcom/app/practicaldevstree/data/model/PlaceEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.app.practicaldevstree.databinding.RowLocationListBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.app.practicaldevstree.databinding.RowLocationListBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.app.practicaldevstree.databinding.RowLocationListBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.app.practicaldevstree.data.model.PlaceEntity model) {
        }
    }
}