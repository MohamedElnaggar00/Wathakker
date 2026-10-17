package com.example

import android.app.Activity
import android.graphics.Bitmap
import android.os.Bundle
import com.example.lockwidgets.HomeWidgets
import java.io.File
import java.io.FileOutputStream

/** Debug-only render harness: draws every home widget kind in three background modes
 *  (explicit light, explicit dark, unset/default) using the real renderer, and saves PNGs. */
class WidgetRenderCheck : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sp = getSharedPreferences("fajr_prefs", 0)
        sp.edit()
            .putString("widget_bg_color_991", "white")
            .putString("widget_bar_color_991", "blue")
            .putString("widget_bg_color_992", "black")
            .remove("widget_bg_color_993")
            .remove("widget_bar_color_993")
            .apply()
        val out = getExternalFilesDir(null)!!
        val dims = mapOf(
            "Hero" to (330 to 90), "HeroLarge" to (330 to 160), "Schedule" to (330 to 90),
            "Clock" to (250 to 90), "Hijri" to (90 to 90), "Gregorian" to (90 to 90),
            "NextPrayer" to (110 to 90), "PrayerBar" to (110 to 90),
            "DayPrayer" to (110 to 90), "Pill" to (110 to 90)
        )
        val kinds = listOf("Hero", "NextPrayer", "PrayerBar", "Schedule", "Clock", "DayPrayer", "Pill", "Hijri", "Gregorian")
        for ((id, tag) in listOf(991 to "light", 992 to "dark", 993 to "default")) {
            for (kind in kinds) {
                try {
                    val (w, h) = dims[kind] ?: (110 to 90)
                    val bmp = HomeWidgets.renderKind(this, kind, w, h, id)
                    FileOutputStream(File(out, "widget_${tag}_${kind}.png")).use {
                        bmp.compress(Bitmap.CompressFormat.PNG, 100, it)
                    }
                } catch (e: Exception) {
                    File(out, "widget_${tag}_${kind}.err").writeText(e.toString())
                }
            }
        }
        File(out, "widget_prefs.txt").writeText(sp.all.toSortedMap().toString())
        finish()
    }
}
