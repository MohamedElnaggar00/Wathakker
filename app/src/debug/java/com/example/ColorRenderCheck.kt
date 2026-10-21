package com.example

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.lockwidgets.HomeWidgets

/** Debug-only: verifies widget color prefs actually change the rendered widget. */
class ColorRenderCheck : Activity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        getSharedPreferences("fajr_prefs", MODE_PRIVATE).edit()
            .putString("widget_bar_color_9102", "green").putString("widget_bg_color_9102", "white")
            .putString("widget_bar_color_9103", "purple").putString("widget_bg_color_9103", "black")
            .putString("widget_bar_color_9202", "purple").putString("widget_bg_color_9202", "white")
            .commit()
        val heroDefault = HomeWidgets.renderKind(this, "Hero", 330, 90, 9101)
        val heroGreenWhite = HomeWidgets.renderKind(this, "Hero", 330, 90, 9102)
        val heroPurpleBlack = HomeWidgets.renderKind(this, "Hero", 330, 90, 9103)
        val oneuiDefault = HomeWidgets.renderKind(this, "OneUI", 330, 90, 9201)
        val oneuiColored = HomeWidgets.renderKind(this, "OneUI", 330, 90, 9202)
        Log.i("ColorCheck", "hero default vs green+white identical=" + heroDefault.sameAs(heroGreenWhite))
        Log.i("ColorCheck", "hero default vs purple+black identical=" + heroDefault.sameAs(heroPurpleBlack))
        Log.i("ColorCheck", "oneui default vs colored-prefs identical=" + oneuiDefault.sameAs(oneuiColored))
        val col = LinearLayout(this); col.orientation = LinearLayout.VERTICAL
        col.setBackgroundColor(Color.parseColor("#C9D6E8")); col.setPadding(8, 40, 8, 8)
        for (bmp in listOf(heroDefault, heroGreenWhite, heroPurpleBlack, oneuiDefault, oneuiColored)) {
            val iv = ImageView(this); iv.setImageBitmap(bmp); iv.setPadding(6, 6, 6, 6)
            col.addView(iv, ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        }
        setContentView(col)
    }
}
