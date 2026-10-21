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

fun themeName(i: Int) = T(WTheme.defs[i].name, listOf("Gold", "Turquoise", "Blue", "Green")[i])
fun patName(id: Int): String { val i = Settings.patterns.indexOfFirst { it.first == id }.coerceAtLeast(0); return T(Settings.patterns[i].second, listOf("Rub el Hizb", "Stars and diamonds", "Hex grid", "Crossed octagram", "Round arabesque")[i]) }

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
                .then(if (selected) Modifier.background(WTheme.cur.brush()) else Modifier.background(Pill)).clickable { onClick() }.padding(horizontal = (w * 0.06f).dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (lead != null) { lead(); Spacer(Modifier.width((w * 0.03f).dp)) }
            Text1(title, tx(w * 0.062f, if (selected) Ink else Color.White, selected))
            Spacer(Modifier.weight(1f))
            if (value != null) Text1(value, tx(w * 0.05f, if (selected) Ink else SoftGrey))
        }
    }

    val title = if (langTick < 0) "" else when (sub) { 1 -> T("الزخرفة", "Pattern"); 2 -> T("لون السمة", "Theme color"); 3 -> T("مصدر الموقع", "Location source"); 4 -> T("الأذونات", "Permissions"); 5 -> T("اللغة", "Language"); else -> T("الإعدادات", "Settings") }
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        ScalingLazyColumn(Modifier.fillMaxSize()) {
            item { Text1(title, tx(w * 0.07f, Color(0xFFB9B9BE)), Modifier.padding(top = (w * 0.07f).dp, bottom = (w * 0.04f).dp)) }
            when (sub) {
                0 -> {
                    item { Row1(T("اللغة", "Language"), listOf(T("مزامنة", "Sync"), "عربي", "English")[Loc.mode(ctx)], { sub = 5 }) }
                    item { Row1(T("الزخرفة", "Pattern"), patName(starPattern), { sub = 1 }) }
                    item { Row1(T("لون السمة", "Theme color"), themeName(WTheme.idx), { sub = 2 }) }
                    item { Row1(T("مصدر الموقع", "Location source"), if (locMode == 0) T("من الهاتف", "Phone") else T("تلقائي", "Auto"), { sub = 3 }) }
                    item { var on by remember { mutableIntStateOf(if (Adhan.enabled(ctx)) 1 else 0) }; Row1(T("تنبيه الأذان", "Adhan alert"), if (on == 1) T("تشغيل", "On") else T("إيقاف", "Off"), { on = 1 - on; Adhan.setEnabled(ctx, on == 1) }, selected = on == 1) }
                    item { Row1(T("الأذونات", "Permissions"), null, { sub = 4 }) }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                1 -> {
                    items(Settings.patterns.size) { i ->
                        val id = Settings.patterns[i].first; val name = patName(id)
                        Row1(name, null, { Settings.savePattern(ctx, id) }, selected = starPattern == id, lead = {
                            Box(Modifier.size((w * 0.11f).dp).clip(CircleShape).background(Color.Black)) { StarField(Modifier.fillMaxSize(), id, 3f) }
                        })
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                2 -> {
                    items(WTheme.defs.size) { i ->
                        val d = WTheme.defs[i]
                        Row1(themeName(i), null, { Settings.saveTheme(ctx, i) }, selected = WTheme.idx == i, lead = {
                            Box(Modifier.size((w * 0.09f).dp).clip(CircleShape).background(d.brush()))
                        })
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                3 -> {
                    item { Row1(T("مزامنة مع الهاتف", "Sync with phone"), null, { locMode = 0; Settings.saveLocMode(ctx, 0) }, selected = locMode == 0) }
                    item {
                        Row1(T("تلقائي (GPS)", "Automatic (GPS)"), null, {
                            locMode = 1; Settings.saveLocMode(ctx, 1)
                            if (!locOk) locLauncher.launch(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)) else refreshGps(ctx)
                        }, selected = locMode == 1)
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                5 -> {
                    item { Row1(T("مزامنة (الافتراضي)", "Sync (default)"), null, { Loc.save(ctx, 0) }, selected = Loc.mode(ctx) == 0 && langTick >= 0) }
                    item { Row1("عربي", null, { Loc.save(ctx, 1) }, selected = Loc.mode(ctx) == 1 && langTick >= 0) }
                    item { Row1("English", null, { Loc.save(ctx, 2) }, selected = Loc.mode(ctx) == 2 && langTick >= 0) }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                else -> {
                    item {
                        Row1(T("الموقع", "Location"), if (locOk) T("مسموح", "Allowed") else T("غير مسموح", "Not allowed"), {
                            if (!locOk) locLauncher.launch(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION))
                        })
                    }
                    item {
                        Row1(T("الإشعارات", "Notifications"), if (notifOk) T("مسموح", "Allowed") else T("غير مسموح", "Not allowed"), {
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
