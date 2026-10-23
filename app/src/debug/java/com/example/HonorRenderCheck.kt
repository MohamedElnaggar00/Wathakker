package com.example

import android.app.Activity
import android.graphics.Bitmap
import android.os.Bundle
import com.example.lockwidgets.HomeWidgets
import java.io.File
import java.io.FileOutputStream

/** Debug-only diagnostic: renders the six widgets with the real renderer at the exact dp sizes the Honor launcher reported (default placement), plus the same kinds at 1.5x those dp for comparison. Light and dark. */
class HonorRenderCheck : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        com.example.utils.Digits.refresh(this)
        com.example.fajr.data.FajrPreferences(this).apply { latitude = 30.0444; longitude = 31.2357 }
        val out = getExternalFilesDir(null) ?: File(filesDir, "honor")
        out.mkdirs()
        File(out, "config.txt").writeText("density=${resources.displayMetrics.density} sw=${resources.configuration.smallestScreenWidthDp} px=${resources.displayMetrics.widthPixels}x${resources.displayMetrics.heightPixels}")
        val sizes = listOf(
            Triple("Hero", 408, 58), Triple("Schedule", 408, 60), Triple("NextPrayer", 196, 60),
            Triple("PrayerBar", 196, 60), Triple("Hijri", 90, 60), Triple("OneUI", 302, 60)
        )
        for ((tag, nightFlag) in listOf("light" to android.content.res.Configuration.UI_MODE_NIGHT_NO, "dark" to android.content.res.Configuration.UI_MODE_NIGHT_YES)) {
            val cfg = android.content.res.Configuration(resources.configuration)
            cfg.uiMode = (cfg.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK.inv()) or nightFlag
            val ctx = createConfigurationContext(cfg)
            for ((kind, w, h) in sizes) {
                for ((lab, f) in listOf("drawn" to 1.0f, "x15" to 1.5f)) {
                    try {
                        val bmp = HomeWidgets.renderKind(ctx, kind, Math.round(w * f), Math.round(h * f), 995)
                        FileOutputStream(File(out, "h_${tag}_${kind}_${lab}.png")).use { bmp.compress(Bitmap.CompressFormat.PNG, 100, it) }
                    } catch (e: Throwable) {
                        File(out, "h_${tag}_${kind}_${lab}.err").writeText(e.toString())
                    }
                }
            }
        }
        File(out, "done.txt").writeText("done")
        finish()
    }
}
