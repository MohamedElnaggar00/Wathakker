package com.example

import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetManager
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout

/** Debug-only (branch-only): hosts already-bound check widgets in cells of exactly the drawn dp size times k, one per row. */
class IqamaSizedCheck : Activity() {
    private lateinit var host: AppWidgetHost
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        host = AppWidgetHost(this, 4242)
        val mgr = AppWidgetManager.getInstance(this)
        val sp = getSharedPreferences("hostcheck", MODE_PRIVATE)
        val k = intent?.getFloatExtra("k", 1f) ?: 1f
        com.example.lockwidgets.HomeWidgets.updateAll(this)
        val d = resources.displayMetrics.density
        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setBackgroundColor(0xFF808890.toInt()) }
        // kind index in WidgetHostCheck.PROVIDERS, drawn dp size (HomeWidgets.updateBatch defaults)
        val rows = listOf(Triple("Hero", 330, 90), Triple("OneUI", 330, 90), Triple("NextPrayer", 110, 90), Triple("PrayerBar", 110, 90), Triple("Clock", 250, 90))
        for ((name, w, h) in rows) {
            val i = WidgetHostCheck.PROVIDERS.indexOf(name)
            val id = sp.getInt("id$i", 0)
            val info = mgr.getAppWidgetInfo(id) ?: continue
            val cell = FrameLayout(this)
            cell.addView(host.createView(this, id, info))
            val lp = LinearLayout.LayoutParams((w * d * k).toInt(), (h * d * k).toInt())
            lp.gravity = Gravity.CENTER_HORIZONTAL
            lp.topMargin = (6 * d).toInt()
            root.addView(cell, lp)
        }
        setContentView(root)
    }
    override fun onStart() { super.onStart(); host.startListening() }
    override fun onStop() { super.onStop(); host.stopListening() }
}
