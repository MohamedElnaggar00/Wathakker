package com.example

import android.app.Activity
import android.appwidget.AppWidgetHostView
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.util.SizeF
import android.view.View
import android.widget.RemoteViews
import com.example.lockwidgets.HomeWidgets
import java.io.File
import java.io.FileOutputStream

/** Debug-only: proves which RemoteViews entry a REAL AppWidgetHostView picks from a SizeF map at given laid-out box sizes (empty OPTION_APPWIDGET_SIZES case). Selected entry is identified by exact pixel equality against single-entry hosts. */
class HostSelectCheck : Activity() {
    private fun rv(kind: String, w: Int, h: Int): RemoteViews {
        val r = resources
        val lay = r.getIdentifier("home_prayer_art_fit", "layout", packageName)
        val img = r.getIdentifier("home_prayer_image", "id", packageName)
        val v = RemoteViews(packageName, lay)
        v.setImageViewBitmap(img, HomeWidgets.renderKind(this, kind, w, h, 995))
        return v
    }
    private fun draw(rvv: RemoteViews, wpx: Int, hpx: Int): Bitmap {
        val host = AppWidgetHostView(this)
        host.updateAppWidget(rvv)
        host.measure(View.MeasureSpec.makeMeasureSpec(wpx, View.MeasureSpec.EXACTLY), View.MeasureSpec.makeMeasureSpec(hpx, View.MeasureSpec.EXACTLY))
        host.layout(0, 0, wpx, hpx)
        val b = Bitmap.createBitmap(wpx, hpx, Bitmap.Config.ARGB_8888)
        val c = Canvas(b); c.drawColor(0xFF555555.toInt()); host.draw(c)
        return b
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        com.example.utils.Digits.refresh(this)
        com.example.fajr.data.FajrPreferences(this).apply { latitude = 30.0444; longitude = 31.2357 }
        val out = getExternalFilesDir(null) ?: File(filesDir, "hs"); out.mkdirs()
        val d = resources.displayMetrics.density
        File(out, "config.txt").writeText("density=$d sw=${resources.configuration.smallestScreenWidthDp}")
        // kind, MAXW, MINH, MAXH (Honor-reported), measured content box dp (frame minus ~4dp border each side)
        data class K(val kind: String, val maxW: Int, val minH: Int, val maxH: Int, val mw: Int, val mh: Int)
        val ks = listOf(K("Hero", 408, 58, 84, 613, 117), K("NextPrayer", 196, 60, 84, 302, 117), K("Hijri", 90, 60, 84, 146, 117), K("OneUI", 302, 60, 84, 457, 117))
        val log = StringBuilder()
        for (k in ks) {
            val candA = Pair(k.maxW, k.minH); val candB = Pair(k.maxW, k.maxH)
            val rvA = rv(k.kind, candA.first, candA.second); val rvB = rv(k.kind, candB.first, candB.second)
            val map = LinkedHashMap<SizeF, RemoteViews>()
            map[SizeF(candA.first.toFloat(), candA.second.toFloat())] = rvA
            map[SizeF(candB.first.toFloat(), candB.second.toFloat())] = rvB
            val boxes = listOf("measured" to Pair(k.mw, k.mh), "maxWxmaxH" to Pair(k.maxW, k.maxH), "maxWxminH" to Pair(k.maxW, k.minH), "tiny" to Pair(k.maxW / 2, k.minH / 2))
            for ((bn, bx) in boxes) {
                try {
                    val wpx = Math.round(bx.first * d); val hpx = Math.round(bx.second * d)
                    val m = draw(RemoteViews(map), wpx, hpx)
                    val a = draw(rvA, wpx, hpx); val b = draw(rvB, wpx, hpx)
                    val sa = m.sameAs(a); val sb = m.sameAs(b)
                    // expected by AOSP rule: largest area with w<=box w-1 and h<=box h-1, else smallest
                    val fits = listOf(candA, candB).filter { it.first <= bx.first - 1 && it.second <= bx.second - 1 }
                    val exp = if (fits.isEmpty()) "smallest(A)" else if (fits.maxByOrNull { it.first * it.second } == candB) "B" else "A"
                    log.append("${k.kind} box=$bn ${bx.first}x${bx.second}dp host==A(${candA.first}x${candA.second}):$sa host==B(${candB.first}x${candB.second}):$sb expectedByRule=$exp\n")
                    FileOutputStream(File(out, "hs_${k.kind}_${bn}_map.png")).use { m.compress(Bitmap.CompressFormat.PNG, 100, it) }
                    FileOutputStream(File(out, "hs_${k.kind}_${bn}_singleA.png")).use { a.compress(Bitmap.CompressFormat.PNG, 100, it) }
                } catch (e: Throwable) { log.append("${k.kind} box=$bn ERR $e\n") }
            }
        }
        File(out, "selection.txt").writeText(log.toString())
        File(out, "done.txt").writeText("done")
        finish()
    }
}
