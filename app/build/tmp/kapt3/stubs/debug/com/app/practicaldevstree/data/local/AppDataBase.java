package com.app.practicaldevstree.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/practicaldevstree/data/local/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "locationDao", "Lcom/app/practicaldevstree/data/local/LocationDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.app.practicaldevstree.data.model.PlaceEntity.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.app.practicaldevstree.data.local.AppDataBase instance;
    @org.jetbrains.annotations.NotNull
    public static final com.app.practicaldevstree.data.local.AppDataBase.Companion Companion = null;
    
    public AppDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.app.practicaldevstree.data.local.LocationDao locationDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/app/practicaldevstree/data/local/AppDataBase$Companion;", "", "()V", "instance", "Lcom/app/practicaldevstree/data/local/AppDataBase;", "buildDatabase", "appContext", "Landroid/content/Context;", "getDatabase", "context", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.app.practicaldevstree.data.local.AppDataBase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.app.practicaldevstree.data.local.AppDataBase buildDatabase(android.content.Context appContext) {
            return null;
        }
    }
}