package com.app.practicaldevstree.ui.path_draw_screen;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0002J \u0010\u0016\u001a\u00020\u000f2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/app/practicaldevstree/ui/path_draw_screen/PathDrawScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/app/practicaldevstree/databinding/ActivityPathDrawScreenBinding;", "isMapReady", "", "locationList", "Ljava/util/ArrayList;", "Lcom/app/practicaldevstree/data/model/PlaceEntity;", "Lkotlin/collections/ArrayList;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "addMarker", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "title", "", "adjustCamera", "", "drawPolylineWithMarkers", "initMap", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "setToolBarData", "setUpUi", "app_debug"})
public final class PathDrawScreen extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.app.practicaldevstree.databinding.ActivityPathDrawScreenBinding binding;
    private com.google.android.gms.maps.GoogleMap mMap;
    private boolean isMapReady = false;
    @org.jetbrains.annotations.Nullable
    private java.util.ArrayList<com.app.practicaldevstree.data.model.PlaceEntity> locationList;
    
    public PathDrawScreen() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpUi() {
    }
    
    private final void onClick() {
    }
    
    private final void setToolBarData() {
    }
    
    @java.lang.Override
    public void onMapReady(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void initMap() {
    }
    
    private final void drawPolylineWithMarkers(java.util.ArrayList<com.app.practicaldevstree.data.model.PlaceEntity> locationList) {
    }
    
    private final void addMarker(com.google.android.gms.maps.model.LatLng latLng, java.lang.String title) {
    }
    
    private final void adjustCamera(java.util.List<com.app.practicaldevstree.data.model.PlaceEntity> locationList) {
    }
}