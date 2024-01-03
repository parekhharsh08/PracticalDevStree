package com.app.practicaldevstree.utils

import android.content.Context
import android.util.Log
import com.app.practicaldevstree.R
import com.google.android.libraries.places.api.Places
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

fun initPlacesApi(context: Context) {
    try {
        val apiKey = context.resources.getString(R.string.google_map_key)
        Log.e("api key : ",apiKey)
        Places.initialize(context, apiKey)
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
}

fun calculateDistanceInKm(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
    val R = 6371.0

    val lat1Rad = Math.toRadians(lat1)
    val lon1Rad = Math.toRadians(lon1)
    val lat2Rad = Math.toRadians(lat2)
    val lon2Rad = Math.toRadians(lon2)

    val dLat = lat2Rad - lat1Rad
    val dLon = lon2Rad - lon1Rad

    val a = sin(dLat / 2) * sin(dLat / 2) +
            cos(lat1Rad) * cos(lat2Rad) *
            sin(dLon / 2) * sin(dLon / 2)

    val c = 2 * atan2(sqrt(a), sqrt(1 - a))

    return R * c
}