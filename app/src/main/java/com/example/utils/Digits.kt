package com.example.utils

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Single place that decides how digits look. Choice: Hindi-Indic digits (١٢٣) or Latin (1234).
 * Applies only while the app language is Arabic. Phone app, home/lock widgets and previews use
 * this. Notifications and the watch do not.
 */
object Digits {
    private const val PREFS = "app_prefs"
    const val KEY = "digits_style"
    const val HINDI = "hindi"
    const val LATIN = "latin"

    private var hindiPref by mutableStateOf(false)

    /** Last value read for non-Compose callers (widgets). */
    @Volatile private var widgetHindi = false

    fun init(context: Context) {
        hindiPref = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(KEY, LATIN) == HINDI
    }

    fun set(context: Context, hindi: Boolean) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putString(KEY, if (hindi) HINDI else LATIN).apply()
        hindiPref = hindi
    }

    /** True when the choice is Hindi digits (regardless of language, for the setting UI). */
    val isHindiChoice: Boolean get() = hindiPref

    /** Active in Compose: Hindi digits chosen and app language is Arabic. */
    val active: Boolean get() = hindiPref && com.example.ui.i18n.L10n.lang == com.example.ui.i18n.Lang.AR

    /** Re-read the setting for drawing code outside Compose (widgets, previews). Call at the start of a render batch. */
    @JvmStatic
    fun refresh(context: Context) {
        val p = context.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val lang = p.getString("language", "ar") ?: "ar"
        widgetHindi = lang.startsWith("ar") && p.getString(KEY, LATIN) == HINDI
    }

    @JvmStatic
    fun map(s: String): String = convert(s)

    /** For widgets and previews, after refresh(). */
    @JvmStatic
    fun forWidget(s: String?): String? = if (s == null || !widgetHindi) s else convert(s)

    @JvmStatic
    fun forWidget(s: CharSequence): CharSequence = if (!widgetHindi) s else convert(s.toString())

    /** For Compose text. */
    fun ui(s: String): String = if (active) convert(s) else s

    fun ui(s: AnnotatedString): AnnotatedString {
        if (!active) return s
        val t = convert(s.text)
        return AnnotatedString(t, s.spanStyles, s.paragraphStyles)
    }

    private fun convert(s: String): String {
        var needs = false
        for (c in s) if (c in '0'..'9') { needs = true; break }
        if (!needs) return s
        val sb = StringBuilder(s.length)
        for (c in s) sb.append(if (c in '0'..'9') ('\u0660' + (c - '0')) else c)
        return sb.toString()
    }

    /** Shows Hindi digits in text fields without changing the typed value (1:1 characters). */
    val visual = VisualTransformation { text ->
        TransformedText(ui(text), OffsetMapping.Identity)
    }
}
