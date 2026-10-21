package com.example

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.lockwidgets.HomeWidgets

/** Debug-only: proves which widget kinds honour the per-widget pattern pref. */
class PatternScopeCheck : Activity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        val kinds = arrayOf("Hero", "PrayerBar", "Schedule", "Clock", "NextPrayer", "OneUI")
        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE)
        val col = LinearLayout(this); col.orientation = LinearLayout.VERTICAL
        col.setBackgroundColor(Color.parseColor("#C9D6E8")); col.setPadding(8, 40, 8, 8)
        kinds.forEachIndexed { i, k ->
            val idNone = 9600 + i * 2; val idPat = idNone + 1
            sp.edit().putInt("widget_pattern_$idNone", 0).putInt("widget_pattern_$idPat", 10).commit()
            val a = HomeWidgets.renderKind(this, k, 330, 90, idNone)
            val c = HomeWidgets.renderKind(this, k, 330, 90, idPat)
            Log.i("PatternScope", "$k pattern-none-vs-10 identical=" + a.sameAs(c))
            val iv = ImageView(this); iv.setImageBitmap(c); iv.setPadding(6, 6, 6, 6)
            col.addView(iv, ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        }
        setContentView(col)
    }
}
