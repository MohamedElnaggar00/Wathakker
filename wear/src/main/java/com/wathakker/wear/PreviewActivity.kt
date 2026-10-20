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
private class PreviewComp(c: Context) : PrayerComplicationService() { init { attachBaseContext(c) } }

/** Debug preview: draws the real tile layout with the Tiles renderer, and the real complication data with the platform complication renderer. */
class PreviewActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mode = intent.getStringExtra("mode") ?: "tile"
        val root = FrameLayout(this).apply { setBackgroundColor(Color.BLACK) }
        setContentView(root)
        val s = Prayer.compute(this)
        if (mode == "tile") {
            val layout = LayoutElementBuilders.Layout.Builder().setRoot(PreviewTile(this).layout(s)).build()
            val res = ResourceBuilders.Resources.Builder().setVersion("1").build()
            val r = TileRenderer(this, ContextCompat.getMainExecutor(this)) { }
            r.inflateAsync(layout, res, root)
        } else {
            val type = if (mode == "short") ComplicationType.SHORT_TEXT else ComplicationType.RANGED_VALUE
            val data = PreviewComp(this).build(type, s)!!
            val cd = ComplicationDrawable(this)
            cd.activeStyle.rangedValuePrimaryColor = WTheme.cur.main.toArgb()
            cd.activeStyle.rangedValueSecondaryColor = 0xFF3A3420.toInt()
            cd.activeStyle.textColor = Color.WHITE
            cd.activeStyle.titleColor = WTheme.cur.main.toArgb()
            cd.setComplicationData(data, true)
            root.addView(object : View(this) {
                override fun onDraw(canvas: Canvas) {
                    val sz = (width * 0.30f).toInt(); val cx = width / 2; val cy = height / 2
                    cd.bounds = Rect(cx - sz / 2, cy - sz / 2, cx + sz / 2, cy + sz / 2)
                    cd.currentTime = java.time.Instant.now()
                    cd.draw(canvas)
                    postInvalidateDelayed(1000)
                }
            }, ViewGroup.LayoutParams(-1, -1))
        }
    }
}
