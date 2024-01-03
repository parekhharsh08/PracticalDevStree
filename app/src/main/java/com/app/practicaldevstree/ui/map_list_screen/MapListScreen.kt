package com.app.practicaldevstree.ui.map_list_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.app.practicaldevstree.adapter.LocationAdapter
import com.app.practicaldevstree.adapter.onClickDeleteListener
import com.app.practicaldevstree.adapter.onClickEditListener
import com.app.practicaldevstree.data.model.PlaceEntity
import com.app.practicaldevstree.databinding.ActivityMapListScreenBinding
import com.app.practicaldevstree.ui.map_screen.MapScreen
import com.app.practicaldevstree.ui.path_draw_screen.PathDrawScreen
import com.app.practicaldevstree.utils.locationDataKey
import com.app.practicaldevstree.utils.locationListKey
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MapListScreen : AppCompatActivity() {
    private lateinit var binding: ActivityMapListScreenBinding
    private val locationViewModel: LocationViewModel by viewModels()
    private var adapter: LocationAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapListScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpUi()
        setUpObserver()
    }

    private fun setUpObserver() {
        locationViewModel.getAllLocations().observe(this) {
            if (it.isEmpty()) {
                binding.txtNoPlace.isVisible = true
                binding.btnAddPlace.isVisible = true
                binding.rvLocation.isGone = true
                binding.btnDuAddPlace.isGone = true
            } else {
                binding.txtNoPlace.isVisible = false
                binding.btnAddPlace.isVisible = false
                binding.rvLocation.isVisible = true
                binding.btnDuAddPlace.isVisible = true
                Log.e(javaClass.simpleName, "setUpObserver: ${ArrayList(it)}")
                if (it.size >= 4) {
                    binding.btnDirection.visibility = View.VISIBLE
                } else {
                    binding.btnDirection.visibility = View.GONE
                }
                adapter!!.updateList(ArrayList(it))
            }
        }
    }

    private fun setUpUi() {
        setToolbarData()
        binding.txtNoPlace.isVisible = true
        binding.btnAddPlace.isVisible = true

        onCLick()
        setAdapter()
    }

    private fun setAdapter() {
        adapter = LocationAdapter(arrayListOf(), listenerEdit = object : onClickEditListener {
            override fun onClickEdit(model: PlaceEntity) {
                val intent = Intent(this@MapListScreen, MapScreen::class.java)
                intent.putExtra(locationDataKey, model)
                startActivity(intent)
            }

        }, listenerDelete = object : onClickDeleteListener {
            override fun onClickDelete(model : PlaceEntity) {
                dialogForDeleteLocation(model)
            }

        })
        binding.rvLocation.adapter = adapter
    }

    private fun onCLick() {
        binding.btnAddPlace.setOnClickListener {
            val intent = Intent(this, MapScreen::class.java)
            startActivity(intent)
        }

        binding.btnDuAddPlace.setOnClickListener {
            val intent = Intent(this, MapScreen::class.java)
            startActivity(intent)
        }

        binding.btnDirection.setOnClickListener {
            val locationList = adapter?.list ?: emptyList()
            if (locationList.size >= 4) {
                val intent = Intent(this, PathDrawScreen::class.java)
                intent.putParcelableArrayListExtra(locationListKey, ArrayList(locationList))
                startActivity(intent)
            }
        }
    }

    private fun dialogForDeleteLocation(removeLocationData: PlaceEntity) {
        val alertDialogBuilder = AlertDialog.Builder(this@MapListScreen)
        alertDialogBuilder.setTitle("Delete Location")
        alertDialogBuilder.setMessage("Are you sure you want to delete this location?")
        alertDialogBuilder.setCancelable(false)
        alertDialogBuilder.setPositiveButton("Yes") { _, _ ->
            lifecycleScope.launch {
                locationViewModel.deleteLocation(removeLocationData)
            }
        }
        alertDialogBuilder.setNegativeButton("No") { dialog, _ ->
            dialog.dismiss()
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    private fun setToolbarData() {
        setSupportActionBar(binding.toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Location Source"
    }
}