package com.example.prayer

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.FilterDrama
import androidx.compose.material.icons.outlined.Mosque
import androidx.compose.foundation.layout.offset
import com.example.ui.oneui.OneUIDimens
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.NightsStay
import androidx.compose.material.icons.outlined.WbSunny
import androidx.compose.material.icons.outlined.WbTwilight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fajr.calculation.CalculationMethod
import com.example.fajr.data.FajrPreferences
import androidx.compose.foundation.combinedClickable
import androidx.compose.material.icons.outlined.Brightness2
import androidx.compose.material.icons.outlined.Brightness3
import androidx.compose.material.icons.outlined.Brightness5
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.NotificationsActive
import androidx.compose.material.icons.outlined.NotificationsOff
import com.example.prayer.alerts.PrayerAlertScheduler
import com.example.prayer.alerts.PrayerAlertStore
import com.example.fajr.calculation.PrayerAdjustments
import com.example.fajr.calculation.PrayerTimesCalculator
import com.example.fajr.ui.CitySearchDialog
import com.example.ui.oneui.OneUICard
import com.example.ui.oneui.OneUIDivider
import com.example.ui.oneui.OneUIProgressBar
import com.example.ui.oneui.OneUIIconAction
import com.example.ui.oneui.OneUIScreen
import com.example.ui.theme.OneUIActiveGreen
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S
import com.example.ui.i18n.Lang

@Composable
fun SavedCity(): String = FajrPreferences(LocalContext.current).cityName

@Composable
fun PrayerTimesScreen(onQibla: (() -> Unit)? = null, onMenu: (() -> Unit)? = null) {
    val context: Context = LocalContext.current
    val prefs = remember { FajrPreferences(context) }
    var latitude by remember { mutableDoubleStateOf(prefs.latitude) }
    var longitude by remember { mutableDoubleStateOf(prefs.longitude) }
    var city by remember { mutableStateOf(prefs.cityName) }
    var country by remember { mutableStateOf(prefs.countryName) }
    var showCitySearch by remember { mutableStateOf(false) }
    var alertDialogPrayer by remember { mutableStateOf<Int?>(null) }
    var bellTick by remember { mutableIntStateOf(0) }
    // 1 Hz tick for the countdown only. The state object is passed down and read inside the
    // overview card, so only that card recomposes every second - not the whole screen.
    val nowState = remember { mutableLongStateOf(System.currentTimeMillis()) }
    LaunchedEffect(Unit) {
        while (true) {
            nowState.longValue = System.currentTimeMillis()
            delay(1000L)
        }
    }
    // Real refresh when returning from Settings / Location & calculation (city, method,
    // offsets, optional rows, bells) instead of relying on the per-second recomposition.
    var resumeTick by remember { mutableIntStateOf(0) }
    val lifecycleOwner = androidx.lifecycle.compose.LocalLifecycleOwner.current
    androidx.compose.runtime.DisposableEffect(lifecycleOwner) {
        val obs = androidx.lifecycle.LifecycleEventObserver { _, event ->
            if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) resumeTick++
        }
        lifecycleOwner.lifecycle.addObserver(obs)
        onDispose { lifecycleOwner.lifecycle.removeObserver(obs) }
    }
    LaunchedEffect(resumeTick) {
        latitude = prefs.latitude
        longitude = prefs.longitude
        city = prefs.cityName
        country = prefs.countryName
    }

    val method = remember(resumeTick) { CalculationMethod.INSTANCE.fromId(prefs.calculationMethodId) }
    // Heavy astronomy math: once per day/location/method, not every second of countdown.
    val dayKey by remember {
        androidx.compose.runtime.derivedStateOf {
            val c = Calendar.getInstance().apply { timeInMillis = nowState.longValue }
            c.get(Calendar.YEAR) * 1000 + c.get(Calendar.DAY_OF_YEAR)
        }
    }
    val cal = remember(dayKey) { Calendar.getInstance() }
    val days = remember(dayKey, latitude, longitude, method, resumeTick) {
        val todayCal = Calendar.getInstance()
        val t = PrayerAdjustments.calculateAll(context, todayCal, latitude, longitude, method)
        val tomorrowCal = todayCal.clone() as Calendar
        tomorrowCal.add(Calendar.DAY_OF_YEAR, 1)
        val tm = PrayerAdjustments.calculateAll(context, tomorrowCal, latitude, longitude, method)
        val yesterdayCal = todayCal.clone() as Calendar
        yesterdayCal.add(Calendar.DAY_OF_YEAR, -1)
        val y = PrayerAdjustments.calculateAll(context, yesterdayCal, latitude, longitude, method)
        Triple(t, tm, y)
    }
    val today = days.first
    val nightLen = (days.second.fajr - today.maghrib).coerceAtLeast(1L)
    val ordered: List<Triple<String, Long, ImageVector>> = listOf(
        Triple(L10n.t(S.PrayerFajr), today.fajr, Icons.Outlined.WbTwilight),
        Triple(L10n.t(S.PrayerShuruq), today.sunrise, Icons.Outlined.WbSunny),
        Triple(L10n.t(S.PrayerDhuhr), today.dhuhr, Icons.Outlined.LightMode),
        Triple(L10n.t(S.PrayerAsr), today.asr, Icons.Outlined.FilterDrama),
        Triple(L10n.t(S.PrayerMaghrib), today.maghrib, Icons.Outlined.NightsStay),
        Triple(L10n.t(S.PrayerIsha), today.isha, Icons.Outlined.DarkMode)
    )
    val nextPrev by remember(days, L10n.lang) {
        androidx.compose.runtime.derivedStateOf {
            val n = nowState.longValue
            val nx = ordered.firstOrNull { it.second > n }
                ?: Triple(L10n.t(S.PrayerFajr), days.second.fajr, Icons.Outlined.WbTwilight)
            val pv = ordered.lastOrNull { it.second <= n }
                ?: Triple(L10n.t(S.PrayerIsha), days.third.isha, Icons.Outlined.DarkMode)
            nx to pv
        }
    }
    val next = nextPrev.first
    val prev = nextPrev.second
    val gregorian = remember(dayKey, L10n.lang) { if (L10n.lang == Lang.AR) SimpleDateFormat("EEEE، d MMMM yyyy", Locale("ar", "EG")).format(cal.time) else SimpleDateFormat("EEEE, d MMMM yyyy", Locale.forLanguageTag(L10n.lang.code)).format(cal.time) }
    val hijri = remember(dayKey, L10n.lang, resumeTick) {
        val off = PrayerAdjustments.hijriOffsetDays(context)
        val hcal = if (off != 0) (cal.clone() as Calendar).apply { add(Calendar.DATE, off) } else cal
        HijriDate.INSTANCE.format(hcal, L10n.lang.code)
    }

    val optionalOn = remember(resumeTick) {
        listOf("imsak", "duha", "midnight", "qiyam").map { PrayerAdjustments.optionalRow(context, it) }
    }
    val displayRows = mutableListOf<Triple<String, Long, ImageVector>>()
    val rowBells = mutableListOf<Int?>()
    if (optionalOn[0]) {
        displayRows.add(Triple(L10n.t(S.Imsak), today.fajr - 10 * 60000L, Icons.Outlined.Brightness2)); rowBells.add(null)
    }
    ordered.forEachIndexed { i, t ->
        displayRows.add(t); rowBells.add(i)
        if (i == 1 && optionalOn[1]) {
            displayRows.add(Triple(L10n.t(S.Duha), today.sunrise + 15 * 60000L, Icons.Outlined.Brightness5)); rowBells.add(null)
        }
    }
    if (optionalOn[2]) {
        displayRows.add(Triple(L10n.t(S.Midnight), today.maghrib + nightLen / 2, Icons.Outlined.Bedtime)); rowBells.add(null)
    }
    if (optionalOn[3]) {
        displayRows.add(Triple(L10n.t(S.Qiyam), today.maghrib + nightLen * 2 / 3, Icons.Outlined.Brightness3)); rowBells.add(null)
    }

    // Time-of-day sky (v3.2.0): period flips at each prayer-time boundary; the
    // background crossfades between the six bundled skies. Keyed on `days` so a
    // day/location/method change re-reads the right prayer times.
    val period by remember(days) {
        androidx.compose.runtime.derivedStateOf {
            val t = days.first
            DayPeriod.forTime(nowState.longValue, t.fajr, t.sunrise, t.dhuhr, t.asr, t.maghrib, t.isha)
        }
    }

    PrayerTimesContent(
        period = period,
        city = city,
        country = country,
        hijriText = hijri,
        gregorianText = gregorian,
        nextPrayerName = next.first,
        nextPrayerTime = formatPrayerTime(next.second),
        prevMillis = prev.second,
        nextMillis = next.second,
        nowState = nowState,
        rows = displayRows.map { (name, time, icon) ->
            PrayerRowDisplay(name, formatPrayerTime(time), name == next.first && time == next.second, icon)
        },
        rowBells = rowBells,
        onChangeCity = { showCitySearch = true },
        onMenu = onMenu,
        onQibla = onQibla,
        bellStates = remember(bellTick, resumeTick, L10n.lang) { (0..5).map { PrayerAlertStore.isEnabled(context, it) } },
        onBellClick = { idx ->
            PrayerAlertStore.setEnabled(context, idx, !PrayerAlertStore.isEnabled(context, idx))
            PrayerAlertScheduler.scheduleAll(context)
            bellTick++
        },
        onBellLongClick = { idx -> alertDialogPrayer = idx }
    )


    alertDialogPrayer?.let { idx ->
        val names = listOf(S.PrayerFajr, S.PrayerShuruq, S.PrayerDhuhr, S.PrayerAsr, S.PrayerMaghrib, S.PrayerIsha)
        PrayerAlertDialog(
            prayer = idx,
            prayerName = L10n.t(names[idx]),
            onDismiss = { alertDialogPrayer = null; bellTick++ }
        )
    }

    if (showCitySearch) {
        CitySearchDialog(
            onDismiss = { showCitySearch = false },
            onCitySelected = { item ->
                prefs.latitude = item.latitude
                prefs.longitude = item.longitude
                prefs.cityName = item.cityNameAr
                prefs.countryName = item.countryNameAr
                prefs.setUseCurrentLocation(false)
                latitude = item.latitude
                longitude = item.longitude
                city = item.cityNameAr
                country = item.countryNameAr
                showCitySearch = false
            }
        )
    }
}

private fun formatPrayerTime(millis: Long): String {
    val cal = Calendar.getInstance()
    cal.timeInMillis = millis
    val ampm = if (cal.get(Calendar.AM_PM) == 0) L10n.t(S.AmMarker) else L10n.t(S.PmMarker)
    return SimpleDateFormat("hh:mm", Locale.US).format(cal.time) + " " + ampm
}

private fun formatCountdown(millis: Long): String {
    val totalSeconds = millis / 1000
    val h = totalSeconds / 3600
    val m = (totalSeconds % 3600) / 60
    val s = totalSeconds % 60
    return String.format("%d:%02d:%02d", h, m, s)
}

@OptIn(androidx.compose.foundation.ExperimentalFoundationApi::class)
@Composable
fun PrayerTimesContent(
    period: DayPeriod,
    city: String,
    country: String,
    hijriText: String,
    gregorianText: String,
    nextPrayerName: String,
    nextPrayerTime: String,
    prevMillis: Long,
    nextMillis: Long,
    nowState: androidx.compose.runtime.State<Long>,
    rows: List<PrayerRowDisplay>,
    onChangeCity: () -> Unit,
    onMenu: (() -> Unit)? = null,
    onQibla: (() -> Unit)? = null,
    bellStates: List<Boolean> = List(6) { false },
    rowBells: List<Int?> = List(rows.size) { it },
    onBellClick: (Int) -> Unit = {},
    onBellLongClick: (Int) -> Unit = {}
) {
    // Per-scene content colors keep text legible over bright and dark skies.
    // Header buttons/icons and the bottom bar are intentionally untouched (user scope):
    // they keep their theme-driven tints. Only the big title follows the scene.
    val sc = sceneColors(period.darkScene)
    val skyHaze = dev.chrisbanes.haze.rememberHazeState()
    Box(Modifier.fillMaxSize()) {
        TimeOfDayBackground(period, skyHaze)
        SkyStatusBarEffect(period.darkScene)
        OneUIScreen(
        title = L10n.t(S.PrayerTimes),
        onMenu = onMenu,
        containerColor = Color.Transparent,
        titleColor = sc.textPrimary,
        actions = if (onQibla != null) {
            { OneUIIconAction(Icons.Outlined.Explore, L10n.t(S.QiblaTitle), onQibla) }
        } else null
    ) {
        item(key = "prayer-overview") {
            // One card: date and location, a divider, then the next-prayer block.
            OneUICard(
                modifier = Modifier.skyGlass(RoundedCornerShape(OneUIDimens.CardRadius), skyHaze, sc),
                padding = PaddingValues(20.dp),
                color = Color.Transparent
            ) {
                Text(
                    hijriText,
                    color = sc.textPrimary,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(Modifier.height(4.dp))
                Text(gregorianText, color = sc.textSecondary, style = MaterialTheme.typography.bodyMedium)
                Spacer(Modifier.height(12.dp))
                Row(
                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).clickable(onClick = onChangeCity).padding(vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Outlined.LocationOn,
                        null,
                        modifier = Modifier.size(40.dp).padding(11.dp),
                        tint = sc.textSecondary
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(SavedCity(), color = sc.textSecondary, style = MaterialTheme.typography.labelLarge)
                }
                // Divider spans the full content width so its ends line up with the icon
                // circles above/below; the row gets real vertical padding (the circle must not
                // touch the divider) and the label is centered with the circle, no offset hack.
                OneUIDivider(0.dp, color = sc.divider)
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp), verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier.size(40.dp).clip(CircleShape).background(sc.chip),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Outlined.Mosque, null, modifier = Modifier.size(22.dp), tint = OneUIActiveGreen)
                    }
                    Spacer(Modifier.width(12.dp))
                    Text(
                        L10n.t(S.NextPrayer),
                        color = sc.textSecondary,
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                Spacer(Modifier.height(18.dp))
                // Reads nowState here, inside this card: the 1 Hz tick recomposes only this block.
                val now = nowState.value
                val interval = (nextMillis - prevMillis).coerceAtLeast(1L)
                val progressNow = ((now - prevMillis).toFloat() / interval.toFloat()).coerceIn(0f, 1f)
                val countdown = formatCountdown((nextMillis - now).coerceAtLeast(0L))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        countdown,
                        color = sc.countdown,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Column(horizontalAlignment = Alignment.End) {
                        Text(
                            nextPrayerName,
                            color = sc.textPrimary,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(nextPrayerTime, color = sc.textSecondary, style = MaterialTheme.typography.bodyMedium)
                    }
                }
                Spacer(Modifier.height(14.dp))
                OneUIProgressBar(
                    progressNow,
                    color = OneUIActiveGreen,
                    trackColor = sc.track,
                    gradient = listOf(Color(0xFF5BC950), Color(0xFF24C55E))
                )
            }
        }
        item(key = "prayer-list") {
            OneUICard(
                modifier = Modifier.skyGlass(RoundedCornerShape(OneUIDimens.CardRadius), skyHaze, sc),
                color = Color.Transparent
            ) {
                rows.forEachIndexed { index, row ->
                    if (index > 0 && !row.isNext && !rows[index - 1].isNext) OneUIDivider(color = sc.divider)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                            .clip(RoundedCornerShape(OneUIDimens.CardRadius))
                            .background(if (row.isNext) OneUIActiveGreen.copy(alpha = 0.14f) else Color.Transparent)
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(38.dp)
                                .clip(CircleShape)
                                .background(if (row.isNext) OneUIActiveGreen.copy(alpha = 0.18f) else sc.chip),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                row.icon,
                                null,
                                modifier = Modifier.size(20.dp),
                                tint = if (row.isNext) OneUIActiveGreen else sc.textSecondary
                            )
                        }
                        Spacer(Modifier.width(14.dp))
                        Text(
                            row.name,
                            color = if (row.isNext) OneUIActiveGreen else sc.textPrimary,
                            fontWeight = if (row.isNext) FontWeight.Bold else FontWeight.Normal,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Spacer(Modifier.weight(1f))
                        val bellIndex = rowBells.getOrNull(index)
                        val bellOn = bellIndex != null && bellStates.getOrElse(bellIndex) { false }
                        Text(
                            row.timeText,
                            color = if (row.isNext) sc.accent else sc.textPrimary,
                            fontWeight = if (row.isNext) FontWeight.Bold else FontWeight.Normal,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Spacer(Modifier.width(8.dp))
                        // Fixed-size slot at the row's trailing edge: bells form one straight
                        // column, and bell-less optional rows keep their times aligned.
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .then(
                                    if (bellIndex != null) {
                                        Modifier.combinedClickable(
                                            onClick = { onBellClick(bellIndex) },
                                            onLongClick = { onBellLongClick(bellIndex) }
                                        )
                                    } else Modifier
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            if (bellIndex != null) {
                                Icon(
                                    if (bellOn) Icons.Outlined.NotificationsActive else Icons.Outlined.NotificationsOff,
                                    contentDescription = "bell_" + bellIndex,
                                    modifier = Modifier.size(19.dp),
                                    tint = if (bellOn) sc.accent else sc.textSecondary.copy(alpha = 0.45f)
                                )
                            }
                        }
                    }
                }
            }
        }
        }
    }
}

