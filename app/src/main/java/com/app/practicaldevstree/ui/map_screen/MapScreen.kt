package com.app.practicaldevstree.ui.map_screen

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.app.practicaldevstree.R
import com.app.practicaldevstree.data.model.PlaceEntity
import com.app.practicaldevstree.databinding.ActivityMapScreenBinding
import com.app.practicaldevstree.ui.map_list_screen.LocationViewModel
import com.app.practicaldevstree.ui.map_list_screen.MapListScreen
import com.app.practicaldevstree.utils.initPlacesApi
import com.app.practicaldevstree.utils.locationDataKey
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MapScreen : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapScreenBinding
    private lateinit var mMap: GoogleMap
    private var latlng = LatLng(0.0, 0.0)
    private var placeName: String = ""
    private var placeAddress: String = ""
    private val locationViewModel: LocationViewModel by viewModels()
    private var placeEntity: PlaceEntity? = null
    private var isLocationModified = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpUi()
    }

    private fun setUpUi() {
        initPlacesApi(this)
        initMap()
        onClick()
        setToolBar()

        placeEntity = intent.getParcelableExtra(locationDataKey)
        if (placeEntity != null) {
            binding.layoutDialog.root.isVisible = true
            binding.layoutDialog.txtSave.text = getString(R.string.label_update)
        }
    }

    private fun setToolBar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Search Places"
    }

    private fun onClick() {
        binding.etAddress.setOnClickListener {
            searchAddressIntent()
        }

        binding.toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.layoutDialog.txtSave.setOnClickListener {
            binding.layoutDialog.root.isGone = true

            if (placeEntity != null) {
                placeEntity!!.name = placeName
                placeEntity!!.address = placeAddress
                placeEntity!!.latitude = latlng.latitude
                placeEntity!!.longitude = latlng.longitude

                if (isLocationModified) {
                    lifecycleScope.launch {
                        locationViewModel.updateLocation(placeEntity!!)
                        val intent = Intent(this@MapScreen, MapListScreen::class.java)
                        startActivity(intent)
                    }
                } else {
                    val intent = Intent(this@MapScreen, MapListScreen::class.java)
                    startActivity(intent)
                }
            } else {
                val data = PlaceEntity(
                    name = placeName,
                    address = placeAddress,
                    latitude = latlng.latitude,
                    longitude = latlng.longitude
                )

                lifecycleScope.launch {
                    locationViewModel.insertLocation(data)
                    val intent = Intent(this@MapScreen, MapListScreen::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    private fun initMap() {
        val mapFragment =
            supportFragmentManager.findFragmentById(R.id.google_map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    private fun searchAddressIntent() {
        val fields: List<Place.Field> = listOf(
            Place.Field.ID,
            Place.Field.NAME,
            Place.Field.LAT_LNG,
            Place.Field.ADDRESS
        )

        val intent: Intent = Autocomplete.IntentBuilder(
            AutocompleteActivityMode.FULLSCREEN, fields
        ).setCountry("")
            .build(this@MapScreen)
        addressPickerLauncher.launch(
            intent
        )
    }

    private val addressPickerLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        { result: ActivityResult ->
            if (result.data == null)
                return@registerForActivityResult
            when (result.resultCode) {
                Activity.RESULT_OK -> {
                    val place = Autocomplete.getPlaceFromIntent(result.data!!)
                    Log.e("TAG", "Place: " + place.name + ", " + place.id)

                    if (place.latLng != null) {
                        latlng = place.latLng!!
                        placeName = place.name!!
                        placeAddress = place.address!!
                        addMarker(latlng, place.name!!)
                        isLocationModified = true
                    }
                    binding.etAddress.setText(place.address!!.toString())
                }

                AutocompleteActivity.RESULT_ERROR -> {
                    val status = Autocomplete.getStatusFromIntent(result.data!!)
                    Log.e("TAG", "${status.statusMessage}")
                }

                Activity.RESULT_CANCELED -> {
                    binding.etAddress.setText("")
                }
            }
        }

    private fun addMarker(latLng: LatLng, title: String) {
        mMap.clear()
        mMap.addMarker(MarkerOptions().position(latLng).title(title))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15f))
        binding.layoutDialog.root.isVisible = true
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        if (placeEntity != null) {
            addMarker(LatLng(placeEntity!!.latitude, placeEntity!!.longitude), placeEntity!!.name)
        }
    }
}