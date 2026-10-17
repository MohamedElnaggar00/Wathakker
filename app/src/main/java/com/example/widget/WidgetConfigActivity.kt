package com.example.widget

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.example.fajr.data.FajrPreferences
import androidx.compose.foundation.background
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S

private val muted = Color(0xFFA6A6A6)
private val accent = Color(0xFF3E91FF)

/** Progress-bar colour choices: key stored in preferences, Arabic label, swatch colour. */
private val options: List<Pair<String, Pair<String, Color>>> = listOf(
    "default" to (L10n.t(S.Default) to Color(0xFFA6A6A6)),
    "white" to (L10n.t(S.ColorWhite) to Color(0xFFFFFFFF)),
    "amber" to (L10n.t(S.ColorAmber) to Color(0xFFE5B455)),
    "blue" to (L10n.t(S.ColorBlue) to Color(0xFF3E91FF)),
    "green" to (L10n.t(S.ColorGreen) to Color(0xFF34C759))
)

private val bgOptions: List<Pair<String, Pair<String, Color>>> = listOf(
    "default" to (L10n.t(S.Default) to Color(0xFF171719)),
    "black" to (L10n.t(S.ColorBlack) to Color(0xFF000000)),
    "gray" to (L10n.t(S.ColorGray) to Color(0xFF2B2B2B)),
    "blue" to (L10n.t(S.ColorBlueDark) to Color(0xFF12263D)),
    "green" to (L10n.t(S.ColorGreenDark) to Color(0xFF123626)),
    "white" to (L10n.t(S.Light) to Color(0xFFF6F6F6))
)

@Composable
fun ColorSection(title: String, options: List<Pair<String, Pair<String, Color>>>, current: String, onPick: (String) -> Unit) {
    Text(title, color = muted, fontSize = 13.sp)
    Spacer(Modifier.height(8.dp))
    options.forEach { (key, labelAndColor) ->
        val (label, swatch) = labelAndColor
        val selected = key == current
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(14.dp))
                .background(if (selected) Color(0xFF2C2C2E) else Color.Transparent)
                .clickable { onPick(key) }
                .padding(horizontal = 12.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(22.dp)
                    .clip(CircleShape)
                    .background(swatch)
                    .then(if (selected) Modifier.border(2.dp, accent, CircleShape) else Modifier)
            )
            Text(
                label,
                color = if (selected) Color.White else muted,
                fontSize = 15.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal
            )
        }
    }
}

@Composable
fun ConfigScreen(current: String, currentBg: String, onPick: (String) -> Unit, onPickBg: (String) -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xFF101012)).padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(24.dp))
                .background(Color(0xFF1C1C1E))
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            Text(L10n.t(S.WidgetSettings), color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(12.dp))
            ColorSection(L10n.t(S.BarColor), options, current, onPick)
            Spacer(Modifier.height(16.dp))
            ColorSection(L10n.t(S.BgColor), bgOptions, currentBg, onPickBg)
        }
    }
}

/** Configure screen shown when a widget is added: picks the progress-bar colour. */
class WidgetConfigActivity : ComponentActivity() {
    private var appWidgetId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        L10n.init(this)
        setResult(RESULT_CANCELED)
        appWidgetId = intent?.getIntExtra("appWidgetId", 0) ?: 0
        val prefs = FajrPreferences(this)
        setContent {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                ConfigScreen(
                    current = prefs.widgetBarColor,
                    currentBg = getSharedPreferences("fajr_prefs", MODE_PRIVATE).getString("widget_bg_color", "default") ?: "default",
                    onPick = { choice ->
                        prefs.widgetBarColor = choice
                        WidgetUpdater.INSTANCE.updateAll(this@WidgetConfigActivity)
                        com.example.lockwidgets.HomeWidgets.updateAll(this@WidgetConfigActivity)
                        setResult(RESULT_OK, Intent().putExtra("appWidgetId", appWidgetId))
                        finish()
                    },
                    onPickBg = { choice ->
                        getSharedPreferences("fajr_prefs", MODE_PRIVATE).edit().putString("widget_bg_color", choice).apply()
                        WidgetUpdater.INSTANCE.updateAll(this@WidgetConfigActivity)
                        com.example.lockwidgets.HomeWidgets.updateAll(this@WidgetConfigActivity)
                        setResult(RESULT_OK, Intent().putExtra("appWidgetId", appWidgetId))
                        finish()
                    }
                )
            }
        }
    }
}

