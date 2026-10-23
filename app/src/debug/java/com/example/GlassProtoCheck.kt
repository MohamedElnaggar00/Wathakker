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
            Triple("light", "فاتحة", lightWall(W, H)),
            Triple("dark", "داكنة", darkWall(W, H)),
            Triple("busy", "مزدحمة", busyWall(W, H))
        )
        val cards = listOf(
            "الزجاج — الشكل الحالي" to "glass",
            "زجاج ١ — صبغة خفيفة ثابتة (Morphe)" to "protoGlass1",
            "زجاج ٢ — ضبابية خفيفة من ألوان الخلفية" to "protoGlass2",
            "الضبابي — الشكل الحالي" to "frosted",
            "ضبابي ٢ — طبقة حليبية أوضح (Samsung)" to "protoFrost1"
        )
        val access = if (why.startsWith("getDrawable ok")) "wallpaper read: OK"
            else "wallpaper read: BLOCKED (Android 13+) - boards inject each wallpaper's colour mesh"
        Log.i("GlassProto", "boards: " + access)
        val outDir = getExternalFilesDir(null)
        val sp = getSharedPreferences("fajr_prefs", MODE_PRIVATE)
        val capFace = try { android.graphics.Typeface.createFromAsset(assets, "homefonts/expoarabic_medium.ttf") }
            catch (t: Throwable) { android.graphics.Typeface.DEFAULT }
        var first: Bitmap? = null
        for ((wfile, wname, wall) in walls) {
            HomeWidgets.debugOverrideMeshForReview(this, meshOf(wall))
            val sheet = Bitmap.createBitmap(W, H, Bitmap.Config.ARGB_8888)
            val sc = Canvas(sheet)
            sc.drawBitmap(wall, 0f, 0f, null)
            val txt = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                color = if (night) Color.WHITE else Color.BLACK
                textSize = 30f; typeface = capFace
            }
            val pill = Paint(Paint.ANTI_ALIAS_FLAG)
            val cx = W / 2f
            var y = 34 * dm
            // Header: what this board is - plain Arabic, no diagnostics.
            run {
                val t = "معاينة تجريبية — خلفية " + wname + " — " + (if (night) "الوضع الداكن" else "الوضع الفاتح")
                val w = txt.measureText(t)
                pill.color = if (night) 0x99000000.toInt() else 0x99FFFFFF.toInt()
                sc.drawRoundRect(RectF(cx - w / 2 - 8 * dm, y - 32 * dm, cx + w / 2 + 8 * dm, y + 9 * dm), 9 * dm, 9 * dm, pill)
                sc.drawText(t, cx - w / 2, y, txt)
                y += 34 * dm
            }
            val cardW = 330; val cardH = 88
            val x = ((W - cardW * dm) / 2).toInt()
            for ((name, key) in cards) {
                sp.edit().putString("widget_bg_color_996", key).commit()
                val card = HomeWidgets.renderKind(this, "Hero", cardW, cardH, 996)
                sc.drawBitmap(card, x.toFloat(), y, null)
                y += cardH * dm
                // Caption fully inside the gap below its card: baseline 36dp under the card so
                // the pill (30dp ascent + 8dp descent) never touches widget pixels.
                val base = y + 36 * dm
                val w = txt.measureText(name)
                pill.color = if (night) 0xB3000000.toInt() else 0xB3FFFFFF.toInt()
                sc.drawRoundRect(RectF(cx - w / 2 - 8 * dm, base - 30 * dm, cx + w / 2 + 8 * dm, base + 8 * dm), 9 * dm, 9 * dm, pill)
                sc.drawText(name, cx - w / 2, base, txt)
                y = base + 16 * dm
            }
            // Honest footnote: simulated backgrounds; the effect is generated from the user's own wallpaper colours.
            val note = "خلفيات تجريبية للمحاكاة — التأثير يتولّد تلقائيًا من ألوان خلفيتك دون أي صلاحية"
            txt.textSize = 24f
            val nw = txt.measureText(note)
            pill.color = if (night) 0x99000000.toInt() else 0x99FFFFFF.toInt()
            sc.drawRoundRect(RectF(cx - nw / 2 - 6 * dm, y - 26 * dm, cx + nw / 2 + 6 * dm, y + 8 * dm), 8 * dm, 8 * dm, pill)
            sc.drawText(note, cx - nw / 2, y, txt)
            if (first == null) first = sheet
            try {
                FileOutputStream(File(outDir, "glass_board_" + wfile + (if (night) "_night" else "_day") + ".png")).use {
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
