package com.app.practicaldevstree.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.app.practicaldevstree.data.model.PlaceEntity
import com.app.practicaldevstree.utils.dbLocation

@Dao
interface LocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(model: PlaceEntity)

    @Delete
    fun delete(model: PlaceEntity) : Int

    @Update
    fun update(placeEntity: PlaceEntity) : Int

    @Query("SELECT * FROM $dbLocation")
    fun getAllLocation(): LiveData<List<PlaceEntity>>
}