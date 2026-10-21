package com.example

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import com.example.lockwidgets.HomeWidgets

/** Debug-only: renders the OneUI widget bitmap for each pattern at a given size, for emulator screenshots. */
class PatternRenderCheck : Activity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        val mode = intent.getIntExtra("s", 0)
        if (mode == 3) {
            val bmp = HomeWidgets.renderKind(this, "OneUI", 330, 170, 9301)
            val iv = ImageView(this); iv.setImageBitmap(bmp); iv.setPadding(8, 40, 8, 8)
            setContentView(iv); return
        }
        val (w, h, cols) = when (mode) { 0 -> Triple(330, 90, 1); 1 -> Triple(165, 165, 2); else -> Triple(330, 170, 1) }
        val pats = if (mode == 2) intArrayOf(1, 10, 0) else intArrayOf(1, 8, 9, 10, 11, 0)
        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE)
        val e = sp.edit(); pats.forEachIndexed { i, p -> e.putInt("widget_pattern_" + (9001 + i), p) }; e.commit()
        val g = GridLayout(this); g.columnCount = cols; g.setBackgroundColor(Color.parseColor("#C9D6E8")); g.setPadding(8, 40, 8, 8)
        pats.forEachIndexed { i, _ ->
            val bmp = HomeWidgets.renderKind(this, "OneUI", w, h, 9001 + i)
            val iv = ImageView(this); iv.setImageBitmap(bmp); iv.setPadding(6, 6, 6, 6)
            g.addView(iv, ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        }
        setContentView(g)
    }
}
