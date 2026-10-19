package com.example.utils

import android.content.Context
import com.example.fajr.data.FajrPreferences
import com.google.android.gms.wearable.PutDataMapRequest
import com.google.android.gms.wearable.Wearable

/** Sends the saved prayer location to a paired watch (Data Layer item /wathakker/location). */
object WearSync {
    fun push(context: Context) {
        try {
            val p = FajrPreferences(context.applicationContext)
            val req = PutDataMapRequest.create("/wathakker/location")
            req.dataMap.putDouble("lat", p.latitude)
            req.dataMap.putDouble("lon", p.longitude)
            req.dataMap.putString("city", p.cityName)
            req.dataMap.putLong("ts", System.currentTimeMillis())
            Wearable.getDataClient(context.applicationContext).putDataItem(req.asPutDataRequest().setUrgent())
        } catch (_: Throwable) {
        }
    }
}
