package com.app.practicaldevstree.data.repo

import androidx.lifecycle.LiveData
import com.app.practicaldevstree.data.local.LocationDao
import com.app.practicaldevstree.data.model.PlaceEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationRepository @Inject constructor(private val locationDao: LocationDao) {

    suspend fun insertLocation(placeEntity: PlaceEntity) {
        withContext(Dispatchers.IO) {
            locationDao.insert(placeEntity)
        }
    }

    fun getAllLocations(): LiveData<List<PlaceEntity>> {
        return locationDao.getAllLocation()
    }

    suspend fun deleteLocation(placeEntity: PlaceEntity){
        withContext(Dispatchers.IO) {
            locationDao.delete(placeEntity)
        }
    }

    suspend fun updateLocation(placeEntity: PlaceEntity) {
        withContext(Dispatchers.IO) {
            locationDao.update(placeEntity)
        }
    }

}