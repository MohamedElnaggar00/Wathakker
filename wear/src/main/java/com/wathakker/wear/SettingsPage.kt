package com.wathakker.wear

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.LocationManager
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn

/** sub: 0 root, 1 pattern list, 2 theme colors, 3 location source, 4 permissions. */
@Composable
fun SettingsPage(w: Float, startSub: Int = 0) {
    val ctx = LocalContext.current
    var sub by remember { mutableIntStateOf(startSub) }
    var locMode by remember { mutableIntStateOf(Settings.locMode(ctx)) }
    var perm by remember { mutableIntStateOf(0) }
    BackHandler(enabled = sub != 0) { sub = 0 }
    val locLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { perm++; refreshGps(ctx) }
    val notifLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { perm++ }
    fun has(p: String) = ContextCompat.checkSelfPermission(ctx, p) == PackageManager.PERMISSION_GRANTED
    val locOk = perm >= 0 && has(Manifest.permission.ACCESS_COARSE_LOCATION)
    val notifOk = perm >= 0 && has(Manifest.permission.POST_NOTIFICATIONS)

    @Composable
    fun Row1(title: String, value: String?, onClick: () -> Unit, lead: @Composable (() -> Unit)? = null, selected: Boolean = false) {
        Row(
            Modifier.fillMaxWidth().height((w * 0.17f).dp).clip(RoundedCornerShape(50))
                .background(if (selected) Gold else Pill).clickable { onClick() }.padding(horizontal = (w * 0.06f).dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (lead != null) { lead(); Spacer(Modifier.width((w * 0.03f).dp)) }
            Text1(title, tx(w * 0.062f, if (selected) Ink else Color.White, selected))
            Spacer(Modifier.weight(1f))
            if (value != null) Text1(value, tx(w * 0.05f, if (selected) Ink else SoftGrey))
        }
    }

    val title = when (sub) { 1 -> "الزخرفة"; 2 -> "لون السمة"; 3 -> "مصدر الموقع"; 4 -> "الأذونات"; else -> "الإعدادات" }
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        ScalingLazyColumn(Modifier.fillMaxSize()) {
            item { Text1(title, tx(w * 0.07f, Color(0xFFB9B9BE)), Modifier.padding(top = (w * 0.07f).dp, bottom = (w * 0.04f).dp)) }
            when (sub) {
                0 -> {
                    item { Row1("الزخرفة", Settings.patterns.firstOrNull { it.first == starPattern }?.second ?: "", { sub = 1 }) }
                    item { Row1("لون السمة", WTheme.cur.name, { sub = 2 }) }
                    item { Row1("مصدر الموقع", if (locMode == 0) "من الهاتف" else "تلقائي", { sub = 3 }) }
                    item { var on by remember { mutableIntStateOf(if (Adhan.enabled(ctx)) 1 else 0) }; Row1("تنبيه الأذان", if (on == 1) "تشغيل" else "إيقاف", { on = 1 - on; Adhan.setEnabled(ctx, on == 1) }, selected = on == 1) }
                    item { Row1("الأذونات", null, { sub = 4 }) }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                1 -> {
                    items(Settings.patterns.size) { i ->
                        val (id, name) = Settings.patterns[i]
                        Row1(name, null, { Settings.savePattern(ctx, id) }, selected = starPattern == id, lead = {
                            Box(Modifier.size((w * 0.11f).dp).clip(CircleShape).background(Color.Black)) { StarField(Modifier.fillMaxSize(), id, 3f) }
                        })
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                2 -> {
                    items(WTheme.defs.size) { i ->
                        val d = WTheme.defs[i]
                        Row1(d.name, null, { Settings.saveTheme(ctx, i) }, selected = WTheme.idx == i, lead = {
                            Box(Modifier.size((w * 0.09f).dp).clip(CircleShape).background(d.brush()))
                        })
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                3 -> {
                    item { Row1("مزامنة مع الهاتف", null, { locMode = 0; Settings.saveLocMode(ctx, 0) }, selected = locMode == 0) }
                    item {
                        Row1("تلقائي (GPS)", null, {
                            locMode = 1; Settings.saveLocMode(ctx, 1)
                            if (!locOk) locLauncher.launch(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)) else refreshGps(ctx)
                        }, selected = locMode == 1)
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                else -> {
                    item {
                        Row1("الموقع", if (locOk) "مسموح" else "غير مسموح", {
                            if (!locOk) locLauncher.launch(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION))
                        })
                    }
                    item {
                        Row1("الإشعارات", if (notifOk) "مسموح" else "غير مسموح", {
                            if (!notifOk) notifLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
                        })
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
            }
        }
    }
}

@android.annotation.SuppressLint("MissingPermission")
fun refreshGps(c: Context) {
    try {
        if (ContextCompat.checkSelfPermission(c, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) return
        val lm = c.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val l = lm.getProviders(true).mapNotNull { lm.getLastKnownLocation(it) }.maxByOrNull { it.time }
        if (l != null) Settings.saveGps(c, l.latitude, l.longitude)
    } catch (_: Throwable) {}
}
