package com.example

import android.app.Activity
import android.app.WallpaperManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.RectF
import android.graphics.Shader
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.example.lockwidgets.HomeWidgets
import java.io.File
import java.io.FileOutputStream

/** Debug-only (3.3.3 review): MOCK glass/frosted widget backgrounds over SYNTHETIC wallpapers.
 *  The user chose a simulated treatment that should suit any wallpaper (2026-10-23) - no real
 *  wallpaper read, no permissions, no image picker. Each board injects the colour mesh that the
 *  shown wallpaper would produce (same downscale the production mesh path applies) through a
 *  debug-only hook, then renders every candidate with the production widget renderer, so each
 *  board shows exactly how the treatment adapts to that wallpaper. Boards are saved as PNG files
 *  for the CI evidence pull; the first board is also shown on screen for the screencap. */
class GlassProtoCheck : Activity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        com.example.utils.Digits.refresh(this)
        com.example.fajr.data.FajrPreferences(this).apply { latitude = 30.0444; longitude = 31.2357 }

        // Runtime wallpaper-access fact, kept for the review report.
        val wm = WallpaperManager.getInstance(this)
        var why = ""
        try {
            val d = wm.getDrawable()
            why = if (d != null) "getDrawable ok" else "getDrawable=null"
        } catch (t: Throwable) { why = "getDrawable threw $t" }
        why += try {
            wm.getWallpaperFile(WallpaperManager.FLAG_SYSTEM)?.close(); " | getWallpaperFile ok"
        } catch (t: Throwable) { " | getWallpaperFile threw: $t" }
        Log.i("GlassProto", why)

        val night = (resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) ==
            android.content.res.Configuration.UI_MODE_NIGHT_YES
        val W = resources.displayMetrics.widthPixels
        val H = resources.displayMetrics.heightPixels
        val dm = resources.displayMetrics.density

        val walls = listOf(
            "light" to lightWall(W, H),
            "dark" to darkWall(W, H),
            "busy" to busyWall(W, H)
        )
        val cards = listOf(
            "glass current (shipped, flat tint)" to "glass",
            "glass p1: tint only (Morphe) - suits any wallpaper" to "protoGlass1",
            "glass p2: light blur of wallpaper colours + tint" to "protoGlass2",
            "frosted current: colour mesh + sheen/grain" to "frosted",
            "frosted p2: colour mesh + milk scrim (Samsung legibility)" to "protoFrost1"
        )
        val access = if (why.startsWith("getDrawable ok")) "wallpaper read: OK"
            else "wallpaper read: BLOCKED (Android 13+) - boards inject each wallpaper's colour mesh"
        val outDir = getExternalFilesDir(null)
        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE)
        var first: Bitmap? = null
        for ((wname, wall) in walls) {
            HomeWidgets.debugOverrideMeshForReview(this, meshOf(wall))
            val sheet = Bitmap.createBitmap(W, H, Bitmap.Config.ARGB_8888)
            val sc = Canvas(sheet)
            sc.drawBitmap(wall, 0f, 0f, null)
            val label = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = if (night) Color.WHITE else Color.BLACK; textSize = 30f }
            val pill = Paint(Paint.ANTI_ALIAS_FLAG)
            var y = (34 * dm).toInt()
            fun line(s: String) {
                val w = label.measureText(s)
                pill.color = if (night) 0x99000000.toInt() else 0x99FFFFFF.toInt()
                sc.drawRoundRect(RectF(30 * dm, y - 34 * dm, 42 * dm + w, y + 10 * dm), 8 * dm, 8 * dm, pill)
                sc.drawText(s, 36 * dm, y.toFloat(), label)
                y += (20 * dm).toInt()
            }
            line("MOCK REVIEW - $wname wallpaper - " + (if (night) "dark theme" else "light theme"))
            line(access)
            y += (4 * dm).toInt()
            val cardW = 330; val cardH = 90
            val x = ((W - cardW * dm) / 2).toInt()
            for ((name, key) in cards) {
                sp.edit().putString("widget_bg_color_996", key).commit()
                val card = HomeWidgets.renderKind(this, "Hero", cardW, cardH, 996)
                line(name)
                y += (4 * dm).toInt()
                sc.drawBitmap(card, x.toFloat(), y.toFloat(), null)
                y += (cardH * dm).toInt() + (14 * dm).toInt()
            }
            if (first == null) first = sheet
            try {
                FileOutputStream(File(outDir, "glass_board_" + wname + (if (night) "_night" else "_day") + ".png")).use {
                    sheet.compress(Bitmap.CompressFormat.PNG, 100, it)
                }
            } catch (t: Throwable) { Log.w("GlassProto", "save failed", t) }
        }
        sp.edit().remove("widget_bg_color_996").commit()
        HomeWidgets.debugOverrideMeshForReview(this, null)
        val iv = ImageView(this)
        iv.setImageBitmap(first)
        setContentView(iv)
    }

    /** Approximate the production colour mesh for a wallpaper: heavy downscale; the renderer
     *  up-scales it smoothly at draw time, which reads as a blur of the wallpaper's colours. */
    private fun meshOf(wall: Bitmap): Bitmap {
        val small = Bitmap.createScaledBitmap(wall, 48, Math.max(1, 48 * wall.height / wall.width), true)
        return Bitmap.createScaledBitmap(small, 14, Math.max(1, 14 * small.height / small.width), true)
    }

    private fun lightWall(w: Int, h: Int): Bitmap {
        val b = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888); val c = Canvas(b)
        val p = Paint(Paint.ANTI_ALIAS_FLAG)
        p.shader = LinearGradient(0f, 0f, 0f, h.toFloat(), 0xFFF8FBFF.toInt(), 0xFFD7E6F6.toInt(), Shader.TileMode.CLAMP)
        c.drawRect(0f, 0f, w.toFloat(), h.toFloat(), p)
        p.shader = RadialGradient(w * 0.72f, h * 0.22f, w * 0.55f, 0xB3FFFFFF.toInt(), 0x00FFFFFF, Shader.TileMode.CLAMP)
        c.drawRect(0f, 0f, w.toFloat(), h.toFloat(), p)
        return b
    }

    private fun darkWall(w: Int, h: Int): Bitmap {
        val b = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888); val c = Canvas(b)
        val p = Paint(Paint.ANTI_ALIAS_FLAG)
        p.shader = LinearGradient(0f, 0f, 0f, h.toFloat(), 0xFF0D1B33.toInt(), 0xFF02040A.toInt(), Shader.TileMode.CLAMP)
        c.drawRect(0f, 0f, w.toFloat(), h.toFloat(), p)
        p.shader = null
        val rnd = java.util.Random(11)
        for (i in 0 until 90) {
            p.color = 0x66FFFFFF
            c.drawCircle(rnd.nextFloat() * w, rnd.nextFloat() * h, 1f + rnd.nextFloat() * 2f, p)
        }
        return b
    }

    private fun busyWall(w: Int, h: Int): Bitmap {
        val b = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888); val c = Canvas(b)
        c.drawColor(0xFF2E6E6A.toInt())
        val p = Paint(Paint.ANTI_ALIAS_FLAG)
        val blobs = listOf(
            floatArrayOf(0.2f, 0.18f, 0.42f) to 0xFFE4572E.toInt(),
            floatArrayOf(0.82f, 0.3f, 0.4f) to 0xFFF3A712.toInt(),
            floatArrayOf(0.3f, 0.55f, 0.45f) to 0xFF7FB069.toInt(),
            floatArrayOf(0.78f, 0.68f, 0.44f) to 0xFF9B5DE5.toInt(),
            floatArrayOf(0.5f, 0.92f, 0.5f) to 0xFF00BBF9.toInt(),
            floatArrayOf(0.1f, 0.85f, 0.35f) to 0xFFF15BB5.toInt()
        )
        for ((pos, col) in blobs) {
            p.shader = RadialGradient(pos[0] * w, pos[1] * h, pos[2] * w, col, col and 0x00FFFFFF, Shader.TileMode.CLAMP)
            c.drawRect(0f, 0f, w.toFloat(), h.toFloat(), p)
        }
        return b
    }
}
