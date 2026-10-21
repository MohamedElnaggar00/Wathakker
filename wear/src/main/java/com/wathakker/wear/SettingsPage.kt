package com.wathakker.wear

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.LocationManager
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn

fun themeName(i: Int) = T(WTheme.defs[i].name, listOf("Gold", "Turquoise", "Blue", "Green")[i])
fun patName(id: Int): String { val i = Settings.patterns.indexOfFirst { it.first == id }.coerceAtLeast(0); return T(Settings.patterns[i].second, listOf("Rub el Hizb", "Stars and diamonds", "Hex grid", "Crossed octagram", "Round arabesque")[i]) }

/** Small "open externally" glyph: a square with an arrow leaving its top-right corner. */
@Composable
private fun ExternalIcon(w: Float, color: Color) {
    Canvas(Modifier.size((w * 0.055f).dp)) {
        val m = size.minDimension; val sw = m * 0.14f
        val box = Path().apply {
            moveTo(m * 0.10f, m * 0.32f); lineTo(m * 0.10f, m * 0.90f); lineTo(m * 0.68f, m * 0.90f); lineTo(m * 0.68f, m * 0.60f)
        }
        drawPath(box, color, style = Stroke(width = sw, cap = StrokeCap.Round))
        drawLine(color, Offset(m * 0.42f, m * 0.58f), Offset(m * 0.88f, m * 0.12f), strokeWidth = sw, cap = StrokeCap.Round)
        val head = Path().apply { moveTo(m * 0.52f, m * 0.12f); lineTo(m * 0.88f, m * 0.12f); lineTo(m * 0.88f, m * 0.48f) }
        drawPath(head, color, style = Stroke(width = sw, cap = StrokeCap.Round))
    }
}

/** sub: 0 root, 1 pattern list, 2 theme colors, 3 location source, 4 permissions, 5 language.
 *  The swipe-back gesture is handled by the single swipe-to-dismiss level in WearApp; here the forward
 *  navigation slides the sub-screen in (native Wear direction), while returning to the root is instant
 *  because the dismiss gesture already showed the visual transition. */
@Composable
fun SettingsPage(w: Float, sub: Int, go: (Int) -> Unit) {
    BackHandler(enabled = sub != 0) { go(0) }
    AnimatedContent(
        targetState = sub,
        transitionSpec = {
            if (initialState == 0 && targetState != 0) (slideInHorizontally { it } + fadeIn()) togetherWith (slideOutHorizontally { -it } + fadeOut())
            else androidx.compose.animation.EnterTransition.None togetherWith androidx.compose.animation.ExitTransition.None
        },
        label = "settingsSub"
    ) { target ->
        SettingsContent(target, w, go)
    }
}

@Composable
fun SettingsContent(sub: Int, w: Float, go: (Int) -> Unit) {
    val ctx = LocalContext.current
    var locMode by remember { mutableIntStateOf(Settings.locMode(ctx)) }
    var perm by remember { mutableIntStateOf(0) }
    val locLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { perm++; refreshGps(ctx) }
    val notifLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { perm++ }
    fun has(p: String) = ContextCompat.checkSelfPermission(ctx, p) == PackageManager.PERMISSION_GRANTED
    val locOk = perm >= 0 && has(Manifest.permission.ACCESS_COARSE_LOCATION)
    val notifOk = perm >= 0 && has(Manifest.permission.POST_NOTIFICATIONS)

    @Composable
    fun Row1(title: String, value: String?, onClick: () -> Unit, lead: @Composable (() -> Unit)? = null, selected: Boolean = false, trail: @Composable (() -> Unit)? = null) {
        Row(
            Modifier.fillMaxWidth().height((w * 0.17f).dp).clip(RoundedCornerShape(50))
                .then(if (selected) Modifier.background(WTheme.cur.brush()) else Modifier.background(Pill)).clickable { onClick() }.padding(horizontal = (w * 0.06f).dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (lead != null) { lead(); Spacer(Modifier.width((w * 0.03f).dp)) }
            Text1(title, tx(w * 0.062f, if (selected) Ink else Color.White, selected))
            Spacer(Modifier.weight(1f))
            if (value != null) Text1(value, tx(w * 0.05f, if (selected) Ink else SoftGrey))
            if (trail != null) { Spacer(Modifier.width((w * 0.02f).dp)); trail() }
        }
    }

    // One UI Watch switch, geometry measured from the owner's own watch screenshots
    // (track 73x40px and knob 35px on a 450px screen). Track color follows the app theme accent.
    @Composable
    fun OneUiSwitch(on: Boolean, onChange: (Boolean) -> Unit, w: Float) {
        val tw = w * 0.162f; val th = w * 0.089f; val knob = w * 0.078f
        Box(
            Modifier.size(width = tw.dp, height = th.dp).clip(RoundedCornerShape(th.dp))
                .background(if (on) Gold else Color(0xFF5A5A60))
                .clickable { onChange(!on) }.padding(((th - knob) / 2f).dp),
            contentAlignment = if (on) Alignment.CenterEnd else Alignment.CenterStart
        ) {
            Box(Modifier.size(knob.dp).clip(CircleShape).background(Color.White))
        }
    }

    // One UI Watch radio option (reference: system radio pickers), ring + filled dot in app accent.
    @Composable
    fun OneUiRadio(on: Boolean, w: Float) {
        val d = w * 0.067f
        Canvas(Modifier.size(d.dp)) {
            val r = size.minDimension / 2f
            if (on) {
                drawCircle(Gold, radius = r)
                drawCircle(Color(0xFF26262B), radius = r * 0.42f)
            } else {
                drawCircle(Color(0xFF8E8E93), radius = r * 0.82f, style = Stroke(width = r * 0.22f))
            }
        }
    }

    @Composable
    fun OneUiDivider(w: Float) {
        Box(Modifier.fillMaxWidth().padding(horizontal = (w * 0.08f).dp).height(1.dp).background(Color(0xFF3A3A3E)))
    }

    class RadioOpt(val label: String, val selected: Boolean, val onClick: () -> Unit, val lead: (@Composable () -> Unit)? = null)

    // One UI Watch radio-list card in app colors: dark rounded card, dividers, accent radio rings.
    // Row geometry measured from the owner's watch: row ~110px and label ~34px on a 450px screen.
    @Composable
    fun OneUiRadioCard(w: Float, options: List<RadioOpt>) {
        Column(Modifier.fillMaxWidth().padding(horizontal = (w * 0.027f).dp).clip(RoundedCornerShape((w * 0.09f).dp)).background(Color(0xFF26262B))) {
            options.forEachIndexed { i, opt ->
                if (i > 0) OneUiDivider(w)
                Row(Modifier.fillMaxWidth().heightIn(min = (w * 0.244f).dp).clickable { opt.onClick() }.padding(horizontal = (w * 0.08f).dp, vertical = (w * 0.03f).dp), verticalAlignment = Alignment.CenterVertically) {
                    OneUiRadio(opt.selected, w)
                    Spacer(Modifier.width((w * 0.05f).dp))
                    if (opt.lead != null) { opt.lead(); Spacer(Modifier.width((w * 0.05f).dp)) }
                    Text1(opt.label, tx(w * 0.073f, Color.White), maxLines = 2)
                }
            }
        }
    }

    // One UI Watch settings card row: tall row (~120px on 450), white title, value under it in the
    // app accent color (Samsung renders it blue; we keep the app identity per owner).
    @Composable
    fun OneUiRow(w: Float, title: String, value: String?, onClick: () -> Unit, trail: (@Composable () -> Unit)? = null) {
        Row(Modifier.fillMaxWidth().heightIn(min = (w * 0.267f).dp).clickable { onClick() }.padding(horizontal = (w * 0.08f).dp, vertical = (w * 0.03f).dp), verticalAlignment = Alignment.CenterVertically) {
            Column(Modifier.weight(1f, fill = false)) {
                Text1(title, tx(w * 0.076f, Color.White), maxLines = 2)
                if (value != null) Text1(value, tx(w * 0.058f, Gold), maxLines = 2)
            }
            if (trail != null) { Spacer(Modifier.weight(1f)); trail() }
        }
    }

    // Thin vertical separator before a trailing switch, as in the One UI connections screen.
    @Composable
    fun OneUiVertDivider(w: Float) {
        Box(Modifier.padding(horizontal = (w * 0.04f).dp).width(1.dp).height((w * 0.11f).dp).background(Color(0xFF3A3A3E)))
    }

    val title = if (langTick < 0) "" else when (sub) { 1 -> T("الزخرفة", "Pattern"); 2 -> T("لون السمة", "Theme color"); 3 -> T("مصدر الموقع", "Location source"); 4 -> T("الأذونات", "Permissions"); 5 -> T("اللغة", "Language"); 6 -> T("نوع التنبيه", "Alert style"); else -> T("الإعدادات", "Settings") }
    Box(Modifier.fillMaxSize().background(Color.Black)) {
        ScalingLazyColumn(Modifier.fillMaxSize()) {
            item { Text1(title, tx(w * 0.08f, Color(0xFFB9B9BE)), Modifier.padding(top = (w * 0.07f).dp, bottom = (w * 0.05f).dp)) }
            when (sub) {
                0 -> {
                    item {
                        var on by remember { mutableIntStateOf(if (Adhan.enabled(ctx)) 1 else 0) }
                        var fs by remember { mutableIntStateOf(if (Adhan.fullScreen(ctx)) 1 else 0) }
                        Column(Modifier.fillMaxWidth().padding(horizontal = (w * 0.027f).dp).clip(RoundedCornerShape((w * 0.09f).dp)).background(Color(0xFF26262B))) {
                            OneUiRow(w, T("اللغة", "Language"), listOf(T("مزامنة", "Sync"), "عربي", "English")[Loc.mode(ctx)], { go(5) })
                            OneUiDivider(w)
                            OneUiRow(w, T("الزخرفة", "Pattern"), patName(starPattern), { go(1) })
                            OneUiDivider(w)
                            OneUiRow(w, T("لون السمة", "Theme color"), themeName(WTheme.idx), { go(2) })
                            OneUiDivider(w)
                            OneUiRow(w, T("مصدر الموقع", "Location source"), if (locMode == 0) T("من الهاتف", "Phone") else T("تلقائي", "Auto"), { go(3) })
                            OneUiDivider(w)
                            OneUiRow(w, T("تنبيه الأذان", "Adhan alert"), null, { on = 1 - on; Adhan.setEnabled(ctx, on == 1) }, trail = {
                                OneUiVertDivider(w)
                                OneUiSwitch(on == 1, { want -> on = if (want) 1 else 0; Adhan.setEnabled(ctx, want) }, w)
                            })
                            OneUiDivider(w)
                            OneUiRow(w, T("نوع التنبيه", "Alert style"), if (fs == 1) T("تنبيه إشعار بملء الشاشة", "Full-screen notification alert") else T("تنبيه إشعار", "Notification alert"), { go(6) })
                            OneUiDivider(w)
                            OneUiRow(w, T("الأذونات", "Permissions"), null, { go(4) })
                            OneUiDivider(w)
                            OneUiRow(w, T("فتح في الجهاز", "Open on phone"), null, { openOnPhone(ctx) {} }, trail = { ExternalIcon(w, SoftGrey) })
                        }
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                6 -> {
                    item {
                        var fs by remember { mutableIntStateOf(if (Adhan.fullScreen(ctx)) 1 else 0) }
                        OneUiRadioCard(w, listOf(
                            RadioOpt(T("تنبيه إشعار", "Notification alert"), fs == 0, onClick = { fs = 0; Adhan.setFullScreen(ctx, false) }),
                            RadioOpt(T("تنبيه إشعار بملء الشاشة", "Full-screen notification alert"), fs == 1, onClick = { fs = 1; Adhan.setFullScreen(ctx, true) })
                        ))
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                1 -> {
                    item {
                        OneUiRadioCard(w, Settings.patterns.map { (id, _) ->
                            RadioOpt(patName(id), starPattern == id, { Settings.savePattern(ctx, id) }, lead = {
                                Box(Modifier.size((w * 0.1f).dp).clip(CircleShape).background(Color.Black)) { StarField(Modifier.fillMaxSize(), id, 3f) }
                            })
                        })
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                2 -> {
                    item {
                        OneUiRadioCard(w, WTheme.defs.mapIndexed { i, d ->
                            RadioOpt(themeName(i), WTheme.idx == i, { Settings.saveTheme(ctx, i) }, lead = {
                                Box(Modifier.size((w * 0.09f).dp).clip(CircleShape).background(d.brush()))
                            })
                        })
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                3 -> {
                    item {
                        OneUiRadioCard(w, listOf(
                            RadioOpt(T("مزامنة مع الهاتف", "Sync with phone"), locMode == 0, onClick = { locMode = 0; Settings.saveLocMode(ctx, 0) }),
                            RadioOpt(T("تلقائي (GPS)", "Automatic (GPS)"), locMode == 1, onClick = {
                                locMode = 1; Settings.saveLocMode(ctx, 1)
                                if (!locOk) locLauncher.launch(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)) else refreshGps(ctx)
                            })
                        ))
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                5 -> {
                    item {
                        OneUiRadioCard(w, listOf(
                            RadioOpt(T("مزامنة (الافتراضي)", "Sync (default)"), Loc.mode(ctx) == 0 && langTick >= 0, onClick = { Loc.save(ctx, 0) }),
                            RadioOpt("عربي", Loc.mode(ctx) == 1 && langTick >= 0, onClick = { Loc.save(ctx, 1) }),
                            RadioOpt("English", Loc.mode(ctx) == 2 && langTick >= 0, onClick = { Loc.save(ctx, 2) })
                        ))
                    }
                    item { Spacer(Modifier.height((w * 0.12f).dp)) }
                }
                else -> {
                    item {
                        Column(Modifier.fillMaxWidth().padding(horizontal = (w * 0.027f).dp).clip(RoundedCornerShape((w * 0.09f).dp)).background(Color(0xFF26262B))) {
                            OneUiRow(w, T("الموقع", "Location"), if (locOk) T("مسموح", "Allowed") else T("غير مسموح", "Not allowed"), {
                                if (!locOk) locLauncher.launch(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION))
                            })
                            OneUiDivider(w)
                            OneUiRow(w, T("الإشعارات", "Notifications"), if (notifOk) T("مسموح", "Allowed") else T("غير مسموح", "Not allowed"), {
                                if (!notifOk) notifLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
                            })
                        }
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
