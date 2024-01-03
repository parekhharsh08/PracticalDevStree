package com.app.practicaldevstree.utils

import android.content.Context
import android.util.Log
import com.app.practicaldevstree.R
import com.google.android.libraries.places.api.Places

fun initPlacesApi(context: Context) {
    try {
        val apiKey = context.resources.getString(R.string.google_map_key)
        Log.e("api key : ",apiKey)
        Places.initialize(context, apiKey)
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
}