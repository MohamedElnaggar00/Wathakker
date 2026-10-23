package com.example

import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout

/**
 * Debug-only widget host used by CI. Hosts one real widget of EACH enabled Home widget provider
 * (10 widgets, distinct ids) in a 2x5 grid so tap behaviour can be tested end to end.
 * Extra "m" (10 chars, one per widget, 'o' = open app, 'n' = nothing) writes widget_tap_<id> exactly like
 * the widget settings screen does and then runs the normal HomeWidgets.updateAll refresh.
 */
class WidgetHostCheck : Activity() {
    private lateinit var host: AppWidgetHost
    private val ids = IntArray(PROVIDERS.size)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        host = AppWidgetHost(this, 4242)
        val mgr = AppWidgetManager.getInstance(this)
        val sp = getSharedPreferences("hostcheck", MODE_PRIVATE)
        for (i in PROVIDERS.indices) {
            var id = sp.getInt("id$i", 0)
            if (id == 0) {
                id = host.allocateAppWidgetId()
                sp.edit().putInt("id$i", id).apply()
            }
            ids[i] = id
            if (mgr.getAppWidgetInfo(id) == null) {
                val cn = ComponentName(this, "com.example.widget." + PROVIDERS[i] + "WidgetProvider")
                val ok = mgr.bindAppWidgetIdIfAllowed(id, cn)
                Log.i("HOSTCHECK", "bind " + PROVIDERS[i] + " id=" + id + " ok=" + ok)
                if (!ok) {
                    startActivityForResult(
                        Intent(AppWidgetManager.ACTION_APPWIDGET_BIND)
                            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, id)
                            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_PROVIDER, cn), 7
                    )
                    return
                }
            }
        }
        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        for (row in 0..1) {
            val line = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
            for (col in 0..4) {
                val i = row * 5 + col
                val info = mgr.getAppWidgetInfo(ids[i])
                val frame = FrameLayout(this)
                if (info != null) frame.addView(host.createView(this, ids[i], info))
                line.addView(frame, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f))
            }
            root.addView(line, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))
        }
        setContentView(root)
        Log.i("HOSTCHECK", "ids=" + ids.joinToString(","))
        handle(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.i("HOSTCHECK", "bind dialog result=$resultCode")
        recreate()
    }

    override fun onNewIntent(intent: Intent) { super.onNewIntent(intent); handle(intent) }

    private fun handle(intent: Intent?) {
        val m = intent?.getStringExtra("m") ?: return
        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE).edit()
        for (i in ids.indices) if (i < m.length) sp.putString("widget_tap_" + ids[i], if (m[i] == 'n') "none" else "open")
        sp.apply()
        com.example.lockwidgets.HomeWidgets.updateAll(this)
        Log.i("HOSTCHECK", "applied m=$m")
    }

    override fun onStart() { super.onStart(); host.startListening() }
    override fun onStop() { super.onStop(); host.stopListening() }

    companion object {
        val PROVIDERS = listOf("NextPrayer", "PrayerBar", "Schedule", "DayPrayer", "Pill", "Clock", "Hijri", "Gregorian", "Hero", "OneUI")
    }
}
