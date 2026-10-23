package com.example

import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout

/**
 * Debug-only CI check for decorated-widget sharpness. Hosts the OneUI (decorated) widget and the PrayerBar widget
 * at a fixed tablet-like size in dp, then logs the pixel size of the bitmap each widget draws versus the pixel
 * size of the view that shows it. Extras: w (width dp), h1 (OneUI height dp), h2 (other height dp).
 */
class WidgetSharpCheck : Activity() {
    private lateinit var host: AppWidgetHost
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        host = AppWidgetHost(this, 4343)
        val mgr = AppWidgetManager.getInstance(this)
        val sp = getSharedPreferences("sharpcheck", MODE_PRIVATE)
        val names = listOf("PrayerBar", "OneUI")
        val wdp = intent.getIntExtra("w", 800)
        val hs = intArrayOf(intent.getIntExtra("h2", 204), intent.getIntExtra("h1", 157))
        val d = resources.displayMetrics.density
        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setBackgroundColor(0xFF607080.toInt()) }
        val views = ArrayList<View>()
        for (i in names.indices) {
            var id = sp.getInt("id$i", 0)
            if (id == 0) { id = host.allocateAppWidgetId(); sp.edit().putInt("id$i", id).apply() }
            if (mgr.getAppWidgetInfo(id) == null) {
                val ok = mgr.bindAppWidgetIdIfAllowed(id, ComponentName(this, "com.example.widget." + names[i] + "WidgetProvider"))
                Log.i("SHARP", "bind ${names[i]} ok=$ok")
            }
            val info = mgr.getAppWidgetInfo(id) ?: continue
            val v = host.createView(this, id, info)
            val lp = LinearLayout.LayoutParams((wdp * d).toInt(), (hs[i] * d).toInt()).apply { topMargin = (24 * d).toInt() }
            root.addView(v, lp); views.add(v)
        }
        setContentView(root)
        com.example.lockwidgets.HomeWidgets.updateAll(this)
        root.postDelayed({
            for ((i, v) in views.withIndex()) {
                val iv = find(v)
                val dr = iv?.drawable
                Log.i("SHARP", "${names[i]} view=${v.width}x${v.height}px density=$d image=${iv?.width}x${iv?.height} bitmap=${dr?.intrinsicWidth}x${dr?.intrinsicHeight} scale=${if (iv != null && dr != null && dr.intrinsicWidth > 0) iv.width.toFloat() / dr.intrinsicWidth else -1f}")
            }
        }, 6000)
    }
    private fun find(v: View): ImageView? {
        if (v is ImageView) return v
        if (v is ViewGroup) for (i in 0 until v.childCount) find(v.getChildAt(i))?.let { return it }
        return null
    }
    override fun onStart() { super.onStart(); host.startListening() }
    override fun onStop() { super.onStop(); host.stopListening() }
}
