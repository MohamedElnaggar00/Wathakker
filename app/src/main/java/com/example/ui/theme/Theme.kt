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
    onPrimary = OneUIBlack,
    primaryContainer = OneUIContainerDark,
    onPrimaryContainer = OneUIWhite,
    secondary = OneUILightGray,
    onSecondary = OneUIBlack,
    secondaryContainer = OneUISurfaceVariantDark,
    onSecondaryContainer = OneUIWhite,
    tertiary = OneUIGray,
    onTertiary = OneUIWhite,
    tertiaryContainer = OneUISurfaceDark,
    onTertiaryContainer = OneUIWhite,
    background = OneUIDarkCanvas,
    onBackground = OneUITextPrimaryDark,
    surface = OneUISurfaceDark,
    onSurface = OneUITextPrimaryDark,
    surfaceVariant = OneUISurfaceVariantDark,
    onSurfaceVariant = OneUITextSecondaryDark,
    outline = OneUIBorderDark,
    outlineVariant = OneUIContainerDark,
    error = Color(0xFFE53935),
    onError = OneUIWhite
)

private val LightColorScheme = lightColorScheme(
    primary = OneUIAccentLight,
    onPrimary = OneUIWhite,
    primaryContainer = OneUIContainerLight,
    onPrimaryContainer = OneUITextPrimaryLight,
    secondary = OneUIDarkGray,
    onSecondary = OneUIWhite,
    secondaryContainer = OneUISurfaceVariantLight,
    onSecondaryContainer = OneUITextPrimaryLight,
    tertiary = OneUIGray,
    onTertiary = OneUIWhite,
    tertiaryContainer = OneUIBackgroundLight,
    onTertiaryContainer = OneUITextPrimaryLight,
    background = OneUIBackgroundLight,
    onBackground = OneUITextPrimaryLight,
    surface = OneUISurfaceLight,
    onSurface = OneUITextPrimaryLight,
    surfaceVariant = OneUISurfaceVariantLight,
    onSurfaceVariant = OneUITextSecondaryLight,
    outline = OneUIBorderLight,
    outlineVariant = OneUIContainerLight,
    error = Color(0xFFD32F2F),
    onError = OneUIWhite
)

val OneUIShapes = Shapes(
    extraSmall = RoundedCornerShape(16.dp),
    small = RoundedCornerShape(20.dp),
    medium = RoundedCornerShape(24.dp),
    large = RoundedCornerShape(32.dp)
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
