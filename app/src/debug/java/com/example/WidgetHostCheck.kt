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
 * Debug-only widget host used by CI: hosts two real NextPrayer widgets (two distinct ids) so the tap
 * behaviour can be tested end to end. Extras "a"/"b" ("open" or "none") write widget_tap_<id> exactly
 * like the widget settings screen does and then run the normal HomeWidgets.updateAll refresh.
 */
class WidgetHostCheck : Activity() {
    private lateinit var host: AppWidgetHost
    private val ids = IntArray(2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        host = AppWidgetHost(this, 4242)
        val mgr = AppWidgetManager.getInstance(this)
        val cn = ComponentName(this, "com.example.widget.NextPrayerWidgetProvider")
        val sp = getSharedPreferences("hostcheck", MODE_PRIVATE)
        val root = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
        setContentView(root)
        for (i in 0..1) {
            var id = sp.getInt("id$i", 0)
            if (id == 0) {
                id = host.allocateAppWidgetId()
                sp.edit().putInt("id$i", id).apply()
            }
            ids[i] = id
            if (mgr.getAppWidgetInfo(id) == null) {
                val ok = mgr.bindAppWidgetIdIfAllowed(id, cn)
                Log.i("HOSTCHECK", "bind id=$id ok=$ok")
                if (!ok) {
                    // Supported route: the system "Allow this app to create widgets" dialog (CI taps Create).
                    startActivityForResult(
                        Intent(AppWidgetManager.ACTION_APPWIDGET_BIND)
                            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, id)
                            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_PROVIDER, cn), 7
                    )
                    return
                }
            }
            val info = mgr.getAppWidgetInfo(id)
            val frame = FrameLayout(this)
            if (info != null) frame.addView(host.createView(this, id, info))
            root.addView(frame, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f))
        }
        Log.i("HOSTCHECK", "ids=" + ids[0] + "," + ids[1])
        handle(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.i("HOSTCHECK", "bind dialog result=$resultCode")
        recreate()
    }

    override fun onNewIntent(intent: Intent) { super.onNewIntent(intent); handle(intent) }

    private fun handle(intent: Intent?) {
        val a = intent?.getStringExtra("a"); val b = intent?.getStringExtra("b")
        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE).edit()
        if (a != null) sp.putString("widget_tap_" + ids[0], a)
        if (b != null) sp.putString("widget_tap_" + ids[1], b)
        sp.apply()
        if (a != null || b != null) {
            com.example.lockwidgets.HomeWidgets.updateAll(this)
            Log.i("HOSTCHECK", "applied a=$a b=$b")
        }
    }

    override fun onStart() { super.onStart(); host.startListening() }
    override fun onStop() { super.onStop(); host.stopListening() }
}
