package com.app.practicaldevstree.ui.map_screen;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/app/practicaldevstree/ui/map_screen/MapScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "addressPickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "binding", "Lcom/app/practicaldevstree/databinding/ActivityMapScreenBinding;", "latlng", "Lcom/google/android/gms/maps/model/LatLng;", "locationViewModel", "Lcom/app/practicaldevstree/ui/map_list_screen/LocationViewModel;", "getLocationViewModel", "()Lcom/app/practicaldevstree/ui/map_list_screen/LocationViewModel;", "locationViewModel$delegate", "Lkotlin/Lazy;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "placeAddress", "", "placeEntity", "Lcom/app/practicaldevstree/data/model/PlaceEntity;", "placeName", "addMarker", "", "latLng", "title", "initMap", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "searchAddressIntent", "setToolBar", "setUpUi", "app_debug"})
public final class MapScreen extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.app.practicaldevstree.databinding.ActivityMapScreenBinding binding;
    private com.google.android.gms.maps.GoogleMap mMap;
    @org.jetbrains.annotations.NotNull
    private com.google.android.gms.maps.model.LatLng latlng;
    @org.jetbrains.annotations.NotNull
    private java.lang.String placeName = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String placeAddress = "";
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy locationViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.app.practicaldevstree.data.model.PlaceEntity placeEntity;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> addressPickerLauncher = null;
    
    public MapScreen() {
        super();
    }
    
    private final com.app.practicaldevstree.ui.map_list_screen.LocationViewModel getLocationViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpUi() {
    }
    
    private final void setToolBar() {
    }
    
    private final void onClick() {
    }
    
    private final void initMap() {
    }
    
    private final void searchAddressIntent() {
    }
    
    private final void addMarker(com.google.android.gms.maps.model.LatLng latLng, java.lang.String title) {
    }
    
    @java.lang.Override
    public void onMapReady(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
}