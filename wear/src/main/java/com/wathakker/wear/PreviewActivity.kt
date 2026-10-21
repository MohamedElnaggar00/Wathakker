package com.wathakker.wear

import androidx.compose.ui.graphics.toArgb
import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.wear.protolayout.LayoutElementBuilders
import androidx.wear.protolayout.ResourceBuilders
import androidx.wear.tiles.renderer.TileRenderer
import androidx.wear.watchface.complications.data.ComplicationType
import androidx.wear.watchface.complications.rendering.ComplicationDrawable

private class PreviewTile(c: Context) : PrayerTileService() { init { attachBaseContext(c) } }
private class PreviewComp(c: Context, val k: Int) : PrayerComplicationService() { init { attachBaseContext(c) }; override val kind get() = k }

/** Debug preview: draws the real tile layout with the Tiles renderer, and the real complication data with the platform complication renderer. */
class PreviewActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mode = intent.getStringExtra("mode") ?: "tile"
        val root = FrameLayout(this).apply { setBackgroundColor(Color.BLACK) }
        setContentView(root)
        // iqama_demo: pretend "now" is 3 minutes after the upcoming adhan so the iqama window is active.
        val demo = intent.getBooleanExtra("iqama_demo", false)
        val now0 = if (demo) (Prayer.nextAdhan(this)?.at ?: System.currentTimeMillis()) + 3 * 60000L else System.currentTimeMillis()
        val s = Prayer.compute(this, now0)
        val iq = Prayer.iqamaNow(this, now0)
        if (mode == "tile") {
            val layout = LayoutElementBuilders.Layout.Builder().setRoot(PreviewTile(this).layout(s, iq)).build()
            val res = ResourceBuilders.Resources.Builder().setVersion("1").build()
            // Note: the bundled TileRenderer mirrors the arc under an RTL system locale while the real
            // watch (sysui) does not; a per-renderer LTR context does NOT override that (verified on
            // emulator), so arc-accurate tile captures are taken under an en-US system locale instead.
            val r = TileRenderer(this, ContextCompat.getMainExecutor(this)) { }
            r.inflateAsync(layout, res, root)
        } else {
            val k = intent.getIntExtra("kind", 0)
            val type = if (k == 3) ComplicationType.LONG_TEXT else if (mode == "short" || k > 0) ComplicationType.SHORT_TEXT else ComplicationType.RANGED_VALUE
            val data = if (mode == "prev") PreviewComp(this, k).getPreviewData(type)!! else PreviewComp(this, k).build(type, s, iq = iq)!!
            val cd = ComplicationDrawable(this)
            cd.activeStyle.rangedValuePrimaryColor = WTheme.cur.main.toArgb()
            cd.activeStyle.rangedValueSecondaryColor = 0xFF3A3420.toInt()
            cd.activeStyle.textColor = Color.WHITE
            cd.activeStyle.titleColor = WTheme.cur.main.toArgb()
            cd.setComplicationData(data, true)
            root.addView(object : View(this) {
                override fun onDraw(canvas: Canvas) {
                    val sz = (width * 0.40f).toInt(); val cx = width / 2; val cy = height / 2
                    cd.bounds = Rect(cx - sz / 2, cy - sz / 2, cx + sz / 2, cy + sz / 2)
                    cd.currentTime = java.time.Instant.now()
                    cd.draw(canvas)
                    postInvalidateDelayed(1000)
                }
            }, ViewGroup.LayoutParams(-1, -1))
        }
    }
}
