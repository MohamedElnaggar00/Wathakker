package com.example.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.core.view.WindowCompat
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = OneUIAccentDark,
    onPrimary = Color.White,
    primaryContainer = Color(0xFF1E3A8A), // Dark blue container
    onPrimaryContainer = Color(0xFFD1E4FF),
    secondary = Color(0xFF818181),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFF333333),
    onSecondaryContainer = Color(0xFFE0E0E0),
    tertiary = Color(0xFF818181),
    background = OneUIBackgroundDark,
    onBackground = OneUITextPrimaryDark,
    surface = OneUISurfaceDark,
    onSurface = OneUITextPrimaryDark,
    surfaceVariant = OneUISurfaceVariantDark,
    onSurfaceVariant = OneUITextSecondaryDark,
    outline = Color(0xFF555555)
)

private val LightColorScheme = lightColorScheme(
    primary = OneUIAccentLight,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFD1E4FF), // Light blue container
    onPrimaryContainer = Color(0xFF001D36),
    secondary = Color(0xFF818181),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFE0E0E0),
    onSecondaryContainer = Color(0xFF333333),
    tertiary = Color(0xFF818181),
    background = OneUIBackgroundLight,
    onBackground = OneUITextPrimaryLight,
    surface = OneUISurfaceLight,
    onSurface = OneUITextPrimaryLight,
    surfaceVariant = OneUISurfaceVariantLight,
    onSurfaceVariant = OneUITextSecondaryLight,
    outline = Color(0xFFCCCCCC)
)

val OneUIShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp), // Was 24.dp, causing pills
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp)
)

@Composable
fun MyApplicationTheme(
    useDeviceFont: Boolean = false,
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            var context = view.context
            while (context is android.content.ContextWrapper) {
                if (context is Activity) break
                context = context.baseContext
            }
            val window = (context as? Activity)?.window
            if (window != null) {
                WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = getTypography(useDeviceFont),
        shapes = OneUIShapes
    ) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            content()
        }
    }
}
