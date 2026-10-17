package com.example

import android.content.Context
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/** App-wide theme mode (auto/light/dark), persisted in app_prefs. */
object ThemeSettings {
    const val AUTO = "auto"
    const val LIGHT = "light"
    const val DARK = "dark"

    private const val PREFS = "app_prefs"
    private const val KEY = "theme_mode"

    private val _mode = MutableStateFlow(AUTO)
    val mode: StateFlow<String> = _mode

    fun init(context: Context) {
        _mode.value = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(KEY, AUTO) ?: AUTO
    }

    fun set(context: Context, value: String) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putString(KEY, value).apply()
        _mode.value = value
    }

    @Composable
    fun isDark(): Boolean {
        val m by mode.collectAsState()
        val system = isSystemInDarkTheme()
        return when (m) {
            DARK -> true
            LIGHT -> false
            else -> system
        }
    }
}
