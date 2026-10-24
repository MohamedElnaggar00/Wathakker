package com.example

import android.app.Activity
import android.appwidget.AppWidgetHostView
import android.appwidget.AppWidgetManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.util.SizeF
import android.view.View
import android.widget.RemoteViews
import com.example.lockwidgets.HomeWidgets
import java.io.File
import java.io.FileOutputStream

/** Debug-only: (1) dumps installed provider metadata; (2) proves which RemoteViews entry a REAL AppWidgetHostView picks from the production corner-size map, at launcher-dp boxes. Entry identified by exact pixel equality. */
class HostSelectCheck : Activity() {
    private fun rv(kind: String, w: Int, h: Int): RemoteViews {
        val lay = resources.getIdentifier("home_prayer_art_fit", "layout", packageName)
        val img = resources.getIdentifier("home_prayer_image", "id", packageName)
        val v = RemoteViews(packageName, lay)
        v.setImageViewBitmap(img, HomeWidgets.renderKind(this, kind, Math.max(50, w), Math.max(if (kind == "Hero") 40 else 60, h), 995))
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
        val pi = StringBuilder()
        for (p in AppWidgetManager.getInstance(this).getInstalledProvidersForPackage(packageName, null).sortedBy { it.provider.className }) {
            pi.append("${p.provider.shortClassName} minW=${p.minWidth} minH=${p.minHeight} minResW=${p.minResizeWidth} minResH=${p.minResizeHeight} maxResW=${p.maxResizeWidth} maxResH=${p.maxResizeHeight} target=${p.targetCellWidth}x${p.targetCellHeight} cat=${p.widgetCategory}\n")
        }
        File(out, "providers.txt").writeText(pi.toString())
        // kind, MIN_W, MAX_W, MIN_H, MAX_H as the Honor launcher reported (launcher dp)
        data class K(val kind: String, val mnW: Int, val mxW: Int, val mnH: Int, val mxH: Int)
        val ks = listOf(K("Hero", 304, 408, 58, 84), K("NextPrayer", 144, 196, 58, 84), K("Hijri", 64, 90, 58, 84), K("OneUI", 224, 302, 58, 84))
        val log = StringBuilder()
        for (k in ks) {
            val corners = HomeWidgets.cornerSizes(k.mnW, k.mxW, k.mnH, k.mxH)
            val map = LinkedHashMap<SizeF, RemoteViews>(); val single = LinkedHashMap<SizeF, RemoteViews>()
            for (z in corners) { val r = rv(k.kind, Math.round(z.width), Math.round(z.height)); map[z] = r; single[z] = rv(k.kind, Math.round(z.width), Math.round(z.height)) }
            val boxes = listOf(
                "MAXWxMAXH" to Pair(k.mxW, k.mxH), "MAXW-1xMAXH-1" to Pair(k.mxW - 1, k.mxH - 1), "MAXWxMINH(doc landscape)" to Pair(k.mxW, k.mnH),
                "MINWxMAXH(doc portrait)" to Pair(k.mnW, k.mxH), "MINWxMINH" to Pair(k.mnW, k.mnH), "MAXWxMid" to Pair(k.mxW, (k.mnH + k.mxH) / 2)
            )
            for ((bn, bx) in boxes) {
                try {
                    val wpx = Math.round(bx.first * d); val hpx = Math.round(bx.second * d)
                    val m = draw(RemoteViews(map), wpx, hpx)
                    val matches = corners.filter { z -> m.sameAs(draw(single[z]!!, wpx, hpx)) }.map { "${z.width.toInt()}x${z.height.toInt()}" }
                    val fits = corners.filter { it.width <= bx.first + 0f && it.height <= bx.second + 0f }
                    val exp = fits.maxByOrNull { it.width * it.height }?.let { "${it.width.toInt()}x${it.height.toInt()}" } ?: "smallest"
                    log.append("${k.kind} box=$bn ${bx.first}x${bx.second} host picked=$matches ruleExpects=$exp\n")
                    FileOutputStream(File(out, "hs_${k.kind}_${bn.filter { it.isLetterOrDigit() }}.png")).use { m.compress(Bitmap.CompressFormat.PNG, 100, it) }
                } catch (e: Throwable) { log.append("${k.kind} box=$bn ERR $e\n") }
            }
        }
        File(out, "selection.txt").writeText(log.toString())
        File(out, "done.txt").writeText("done")
        finish()
    }
}
