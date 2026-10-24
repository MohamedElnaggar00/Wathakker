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
        val spx = getSharedPreferences("fajr_prefs", 0)
        val states = listOf(410 to 84, 302 to 84, 224 to 84, 302 to 170, 224 to 170)
        val variants = listOf("base" to (false to false), "tile" to (true to false), "tiletext" to (true to true))
        for ((v, f) in variants) {
            spx.edit().putBoolean("dbg_tilefix", f.first).putBoolean("dbg_textfix", f.second).apply()
            for ((w, h) in states) try {
                val bmp = HomeWidgets.renderKind(this, "OneUI", w, h, 995)
                FileOutputStream(File(out, "v_${v}_${w}x$h.png")).use { bmp.compress(Bitmap.CompressFormat.PNG, 100, it) }
            } catch (e: Exception) { File(out, "v_${v}_${w}x$h.err").writeText(e.toString()) }
        }
        File(out, "done.txt").writeText("done")
    }
}
