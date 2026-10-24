package com.example

import android.app.Activity
import android.graphics.Bitmap
import android.os.Bundle
import com.example.lockwidgets.HomeWidgets
import java.io.File
import java.io.FileOutputStream

/** Debug-only: renders every kind at a wide size and at one launcher unit narrower (same height) with the real renderer. */
class NarrowSheetCheck : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        com.example.utils.Digits.refresh(this)
        com.example.fajr.data.FajrPreferences(this).apply { latitude = 30.0444; longitude = 31.2357 }
        getSharedPreferences("fajr_prefs", 0).edit().putString("language", "ar").apply()
        val out = getExternalFilesDir(null) ?: File(filesDir, "ns"); out.mkdirs()
        // kind to (wideW, narrowW, h) in dp
        val cases = listOf(
            Triple("Hijri", 90 to 64, 84), Triple("NextPrayer", 196 to 144, 84), Triple("Hero", 408 to 304, 84),
            Triple("OneUI", 302 to 224, 84), Triple("Clock", 330 to 260, 84), Triple("DayPrayer", 250 to 180, 84),
            Triple("Pill", 330 to 260, 84), Triple("Schedule", 330 to 250, 84), Triple("PrayerBar", 330 to 250, 84),
            Triple("Gregorian", 180 to 110, 84)
        )
        for ((kind, ws, h) in cases) for ((tag, w) in listOf("wide" to ws.first, "narrow" to ws.second)) {
            try {
                val bmp = HomeWidgets.renderKind(this, kind, w, h, 995)
                FileOutputStream(File(out, "ns_${kind}_${tag}_${w}x$h.png")).use { bmp.compress(Bitmap.CompressFormat.PNG, 100, it) }
            } catch (e: Exception) { File(out, "ns_${kind}_${tag}.err").writeText(e.toString()) }
        }
        File(out, "done.txt").writeText("done")
    }
}
