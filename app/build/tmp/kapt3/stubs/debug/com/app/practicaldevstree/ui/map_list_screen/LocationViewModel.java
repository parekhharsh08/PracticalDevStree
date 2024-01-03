package com.app.practicaldevstree.ui.map_list_screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/app/practicaldevstree/ui/map_list_screen/LocationViewModel;", "Landroidx/lifecycle/ViewModel;", "locationRepository", "Lcom/app/practicaldevstree/data/repo/LocationRepository;", "(Lcom/app/practicaldevstree/data/repo/LocationRepository;)V", "deleteLocation", "", "placeEntity", "Lcom/app/practicaldevstree/data/model/PlaceEntity;", "(Lcom/app/practicaldevstree/data/model/PlaceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocations", "Landroidx/lifecycle/LiveData;", "", "insertLocation", "updateLocation", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LocationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.app.practicaldevstree.data.repo.LocationRepository locationRepository = null;
    
    @javax.inject.Inject
    public LocationViewModel(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.data.repo.LocationRepository locationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertLocation(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.data.model.PlaceEntity placeEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.app.practicaldevstree.data.model.PlaceEntity>> getAllLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteLocation(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.data.model.PlaceEntity placeEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void updateLocation(@org.jetbrains.annotations.NotNull
    com.app.practicaldevstree.data.model.PlaceEntity placeEntity) {
    }
}