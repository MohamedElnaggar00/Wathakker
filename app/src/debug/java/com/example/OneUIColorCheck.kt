package com.example

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import com.example.lockwidgets.HomeWidgets

/** Debug-only (3.3.3): renders the OneUI widget at 330x170 in all four accent themes
 *  (ids 9310-9313 = yellow/turquoise/blue/green) for emulator screenshots. Run under
 *  `cmd uimode night yes/no` to capture the dark and light variants. */
class OneUIColorCheck : Activity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE)
        val e = sp.edit()
        for (i in 0..3) e.putInt("widget_oneui_color_" + (9310 + i), i)
        e.commit()
        val g = GridLayout(this); g.columnCount = 1
        g.setBackgroundColor(Color.parseColor("#C9D6E8")); g.setPadding(8, 40, 8, 8)
        for (i in 0..3) {
            val bmp = HomeWidgets.renderKind(this, "OneUI", 330, 170, 9310 + i)
            val iv = ImageView(this); iv.setImageBitmap(bmp); iv.setPadding(6, 6, 6, 6)
            g.addView(iv, ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        }
        setContentView(g)
    }
}
