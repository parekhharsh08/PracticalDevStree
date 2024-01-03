package com.app.practicaldevstree.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/app/practicaldevstree/data/local/LocationDao;", "", "delete", "", "model", "Lcom/app/practicaldevstree/data/model/PlaceEntity;", "getAllLocation", "Landroidx/lifecycle/LiveData;", "", "insert", "", "update", "placeEntity", "app_debug"})
@androidx.room.Dao
public abstract interface LocationDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.data.model.PlaceEntity model);
    
    @androidx.room.Delete
    public abstract int delete(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.data.model.PlaceEntity model);
    
    @androidx.room.Update
    public abstract int update(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.data.model.PlaceEntity placeEntity);
    
    @androidx.room.Query(value = "SELECT * FROM db_location")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.app.practicaldevstree.data.model.PlaceEntity>> getAllLocation();
}