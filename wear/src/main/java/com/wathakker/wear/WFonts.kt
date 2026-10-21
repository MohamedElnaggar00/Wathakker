package com.wathakker.wear

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

/** Font selection mirroring the phone app picker exactly (same ids, same Arabic names, same 9 size steps,
 *  live per-option preview). Applies to the watch app screens. The tile can only take size/bold (the
 *  platform forbids custom typefaces inside tiles); complications are fully system-rendered. */
object WFonts {
    class Choice(val id: String, val ar: String, val en: String, val family: FontFamily?) {
        val label get() = T(ar, en)
    }

    private fun fam(vararg pairs: Pair<Int, FontWeight>) = FontFamily(pairs.map { Font(it.first, it.second) })

    val choices = listOf(
        Choice("app", "خط التطبيق", "App font", fam(R.font.tajawal to FontWeight.Normal, R.font.tajawal_bold to FontWeight.Bold)),
        Choice("app_light", "خط التطبيق الخفيف", "App font light", fam(R.font.expoarabic_book to FontWeight.Normal, R.font.expoarabic_medium to FontWeight.Bold)),
        Choice("app_bold", "خط التطبيق العريض", "App font bold", fam(R.font.expoarabic_bold to FontWeight.Normal, R.font.expoarabic_bold to FontWeight.Bold)),
        Choice("system", "خط النظام", "System font", null),
        Choice("cairo", "خط القاهرة", "Cairo", fam(R.font.cairo to FontWeight.Normal, R.font.cairo_bold to FontWeight.Bold)),
        Choice("naskh", "خط النسخ", "Naskh", fam(R.font.noto_naskh to FontWeight.Normal, R.font.noto_naskh_bold to FontWeight.Bold)),
        Choice("amiri", "خط أميري", "Amiri", fam(R.font.amiri to FontWeight.Normal, R.font.amiri_bold to FontWeight.Bold)),
        Choice("ruqaa", "خط الرقعة (للمناسبات)", "Ruqaa (occasions)", fam(R.font.aref_ruqaa to FontWeight.Normal, R.font.aref_ruqaa_bold to FontWeight.Bold))
    )

    /** Same 9 steps as the phone (FontScaleSettings.STEPS). */
    val STEPS = floatArrayOf(0.8f, 0.9f, 1.0f, 1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f)

    var idx by mutableIntStateOf(0)
    var scale by mutableFloatStateOf(1f)
    var bold by mutableStateOf(false)
    val cur get() = choices[idx.coerceIn(0, choices.size - 1)]
    val stepIdx get() = STEPS.indices.minByOrNull { kotlin.math.abs(STEPS[it] - scale) } ?: 2

    fun load(c: Context) {
        val p = c.getSharedPreferences("wear_prefs", Context.MODE_PRIVATE)
        idx = p.getInt("font_choice", 0)
        scale = p.getFloat("font_scale", 1f)
        bold = p.getBoolean("font_bold", false)
    }

    fun saveChoice(c: Context, i: Int) { idx = i; c.getSharedPreferences("wear_prefs", Context.MODE_PRIVATE).edit().putInt("font_choice", i).apply() }
    fun saveScale(c: Context, v: Float) { scale = v; c.getSharedPreferences("wear_prefs", Context.MODE_PRIVATE).edit().putFloat("font_scale", v).apply() }
    fun saveBold(c: Context, v: Boolean) { bold = v; c.getSharedPreferences("wear_prefs", Context.MODE_PRIVATE).edit().putBoolean("font_bold", v).apply() }

    /** Same labels as the phone. */
    fun scaleLabel(v: Float) = when {
        v < 0.95f -> T("صغير", "Small")
        v < 1.05f -> T("افتراضي", "Default")
        v < 1.25f -> T("كبير", "Large")
        else -> T("أكبر", "Largest")
    }
}
