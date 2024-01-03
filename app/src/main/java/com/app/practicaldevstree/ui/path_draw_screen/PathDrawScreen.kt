package com.app.practicaldevstree.ui.path_draw_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import com.app.practicaldevstree.R
import com.app.practicaldevstree.data.model.PlaceEntity
import com.app.practicaldevstree.databinding.ActivityPathDrawScreenBinding
import com.app.practicaldevstree.utils.locationListKey
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PathDrawScreen : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityPathDrawScreenBinding
    private lateinit var mMap: GoogleMap
    private var isMapReady = false
    private var locationList: ArrayList<PlaceEntity>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPathDrawScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpUi()
    }

    private fun setUpUi() {
        initMap()
        setToolBarData()
        onClick()

         locationList =
            intent.getParcelableArrayListExtra(locationListKey)
        if (locationList != null && locationList!!.size >= 4) {
            if (isMapReady) {
                drawPolylineWithMarkers(locationList!!)
            } else {
                isMapReady = true
            }
        }
    }

    private fun onClick() {
        binding.toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun setToolBarData() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Routing"
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        Log.e(javaClass.simpleName, "onMapReady: ")

        if (isMapReady) {
            locationList?.let { drawPolylineWithMarkers(it) }
            isMapReady = false
        }
    }

    private fun initMap() {
        val mapFragment =
            supportFragmentManager.findFragmentById(R.id.google_map_path) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    private fun drawPolylineWithMarkers(locationList: ArrayList<PlaceEntity>) {
        val polylineOptions = PolylineOptions()
        polylineOptions.color(ContextCompat.getColor(this, R.color.blue))
        polylineOptions.width(5f)

        mMap.clear()

        if (locationList.size >= 2) {
            addMarker(LatLng(locationList[0].latitude, locationList[0].longitude), locationList[0].name)

            for (i in 0 until locationList.size - 1) {
                val currentLatLng = LatLng(locationList[i].latitude, locationList[i].longitude)
                val nextLatLng = LatLng(locationList[i + 1].latitude, locationList[i + 1].longitude)

                mMap.addPolyline(polylineOptions.add(currentLatLng, nextLatLng))

                if (i < locationList.size - 2 &&
                    locationList[i].latitude != locationList[i + 1].latitude ||
                    locationList[i].longitude != locationList[i + 1].longitude
                ) {
                    addMarker(nextLatLng, locationList[i].name)
                }
            }

            addMarker(
                LatLng(locationList.last().latitude, locationList.last().longitude),
                locationList.last().name
            )
        }

        if (locationList.isNotEmpty()) {
            adjustCamera(locationList)
        }
    }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
    }

    private fun adjustCamera(locationList: List<PlaceEntity>) {
        val boundsBuilder = LatLngBounds.builder()
        for (location in locationList) {
            boundsBuilder.include(LatLng(location.latitude, location.longitude))
        }
        val bounds = boundsBuilder.build()
        val padding = 100
        val cameraUpdate = CameraUpdateFactory.newLatLngBounds(bounds, padding)
        mMap.moveCamera(cameraUpdate)
    }

}