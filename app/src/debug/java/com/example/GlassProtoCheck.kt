package com.example

import android.app.Activity
import android.app.WallpaperManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.example.lockwidgets.HomeWidgets

/** Debug-only (3.3.3 review): glass/frosted widget-background candidates over the REAL wallpaper.
 *  Full-screen sheet = actual wallpaper; cards = Hero rendered through the production renderer
 *  with current and prototype background keys, so transparency/blur read truthfully.
 *  Logs runtime wallpaper-access facts under the GlassProto tag. */
class GlassProtoCheck : Activity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        com.example.utils.Digits.refresh(this)
        com.example.fajr.data.FajrPreferences(this).apply { latitude = 30.0444; longitude = 31.2357 }

        val wm = WallpaperManager.getInstance(this)
        var wall: Bitmap? = null
        var why = ""
        try {
            val id = wm.getWallpaperId(WallpaperManager.FLAG_SYSTEM)
            val live = wm.getWallpaperInfo() != null
            val d = wm.getDrawable()
            if (d != null) {
                val w = if (d.intrinsicWidth > 0) d.intrinsicWidth else 720
                val h = if (d.intrinsicHeight > 0) d.intrinsicHeight else 1280
                val bm = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
                val cv = Canvas(bm); d.setBounds(0, 0, w, h); d.draw(cv)
                wall = bm
                why = "getDrawable ok id=$id live=$live ${w}x$h cls=${d.javaClass.simpleName}"
            } else why = "getDrawable=null"
        } catch (t: Throwable) { why = "getDrawable threw $t" }
        why += try {
            val pfd = wm.getWallpaperFile(WallpaperManager.FLAG_SYSTEM); pfd?.close(); " | getWallpaperFile ok"
        } catch (t: Throwable) { " | getWallpaperFile threw: $t" }
        Log.i("GlassProto", why)

        val night = (resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) ==
            android.content.res.Configuration.UI_MODE_NIGHT_YES
        val W = resources.displayMetrics.widthPixels
        val H = resources.displayMetrics.heightPixels
        val sheet = Bitmap.createBitmap(W, H, Bitmap.Config.ARGB_8888)
        val sc = Canvas(sheet)
        if (wall != null) {
            val s = Math.max(W.toFloat() / wall!!.width, H.toFloat() / wall!!.height)
            val dw = wall!!.width * s; val dh = wall!!.height * s
            sc.drawBitmap(wall!!, null, RectF((W - dw) / 2, (H - dh) / 2, (W + dw) / 2, (H + dh) / 2), Paint(Paint.FILTER_BITMAP_FLAG))
        } else sc.drawColor(if (night) 0xFF14161C.toInt() else 0xFFC9D6E8.toInt())

        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE)
        // Labels must say what the sample actually IS: on Android 13+ the wallpaper read is
        // blocked for this app, so every blur sample is a colour-mesh SIMULATION, not a true
        // backdrop blur (Main's review note). The access fact is drawn on the sheet itself.
        val access = if (wall != null) "wallpaper read: OK - real wallpaper behind cards"
            else "wallpaper read: BLOCKED (Android 13+) - blur samples are colour-mesh simulations"
        val cards = listOf(
            "glass current (sharp, 58/70%)" to "glass",
            "glass p1: tint only, lighter" to "protoGlass1",
            "glass p2: light blur + tint (Morphe, mesh sim)" to "protoGlass2",
            "frosted current (colour mesh, no wallpaper read)" to "frosted",
            "frosted p1: Samsung-style heavy blur (mesh simulation)" to "wallblur",
            "frosted p2: mesh + uniform milk scrim (legibility)" to "protoFrost1"
        )
        val label = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = if (night) Color.WHITE else Color.BLACK; textSize = 34f }
        val dm = resources.displayMetrics.density
        var y = (40 * dm).toInt()
        sc.drawText("REVIEW PROTOTYPES - not shipped", (40 * dm), y.toFloat(), label); y += (16 * dm).toInt()
        sc.drawText(access, (40 * dm), y.toFloat(), label); y += (24 * dm).toInt()
        val cardW = 330; val cardH = 90
        val x = ((W - cardW * dm) / 2).toInt()
        for ((name, key) in cards) {
            sp.edit().putString("widget_bg_color_996", key).commit()
            val card = HomeWidgets.renderKind(this, "Hero", cardW, cardH, 996)
            sc.drawText(name, x.toFloat(), y.toFloat(), label)
            y += (14 * dm).toInt()
            sc.drawBitmap(card, x.toFloat(), y.toFloat(), null)
            y += (cardH * dm).toInt() + (26 * dm).toInt()
        }
        sp.edit().remove("widget_bg_color_996").commit()
        val iv = ImageView(this)
        iv.setImageBitmap(sheet)
        setContentView(iv)
    }
}
