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
import com.example.fajr.calculation.PrayerAdjustments
import com.example.fajr.calculation.PrayerTimesCalculator
import com.example.fajr.ui.CitySearchDialog
import com.example.ui.oneui.OneUICard
import com.example.ui.oneui.OneUIDivider
import com.example.ui.oneui.OneUIProgressBar
import com.example.ui.oneui.OneUIScreen
import com.example.ui.theme.OneUIActiveGreen
import com.example.ui.theme.OneUITimeCyan
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
fun PrayerTimesScreen(onMenu: (() -> Unit)? = null) {
    val context: Context = LocalContext.current
    val prefs = remember { FajrPreferences(context) }
    var latitude by remember { mutableDoubleStateOf(prefs.latitude) }
    var longitude by remember { mutableDoubleStateOf(prefs.longitude) }
    var city by remember { mutableStateOf(prefs.cityName) }
    var country by remember { mutableStateOf(prefs.countryName) }
    var showCitySearch by remember { mutableStateOf(false) }
    var now by remember { mutableLongStateOf(System.currentTimeMillis()) }
    LaunchedEffect(Unit) {
        while (true) {
            now = System.currentTimeMillis()
            delay(1000L)
        }
    }

    val method = CalculationMethod.INSTANCE.fromId(prefs.calculationMethodId)
    val cal = Calendar.getInstance().apply { timeInMillis = now }
    // Heavy astronomy math: once per day/location/method, not every second of countdown.
    val dayKey = cal.get(Calendar.YEAR) * 1000 + cal.get(Calendar.DAY_OF_YEAR)
    val days = remember(dayKey, latitude, longitude, method) {
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
    val ordered: List<Triple<String, Long, ImageVector>> = listOf(
        Triple(L10n.t(S.PrayerFajr), today.fajr, Icons.Outlined.WbTwilight),
        Triple(L10n.t(S.PrayerShuruq), today.sunrise, Icons.Outlined.WbSunny),
        Triple(L10n.t(S.PrayerDhuhr), today.dhuhr, Icons.Outlined.LightMode),
        Triple(L10n.t(S.PrayerAsr), today.asr, Icons.Outlined.FilterDrama),
        Triple(L10n.t(S.PrayerMaghrib), today.maghrib, Icons.Outlined.NightsStay),
        Triple(L10n.t(S.PrayerIsha), today.isha, Icons.Outlined.DarkMode)
    )
    val next = ordered.firstOrNull { it.second > now }
        ?: Triple(L10n.t(S.PrayerFajr), days.second.fajr, Icons.Outlined.WbTwilight)
    val prev = ordered.lastOrNull { it.second <= now }
        ?: Triple(L10n.t(S.PrayerIsha), days.third.isha, Icons.Outlined.DarkMode)
    val interval = (next.second - prev.second).coerceAtLeast(1L)
    val progress = ((now - prev.second).toFloat() / interval.toFloat()).coerceIn(0f, 1f)
    val remaining = (next.second - now).coerceAtLeast(0L)
    val gregorian = remember(dayKey, L10n.lang) { if (L10n.lang == Lang.AR) SimpleDateFormat("EEEE، d MMMM yyyy", Locale("ar", "EG")).format(cal.time) else SimpleDateFormat("EEEE, d MMMM yyyy", Locale.forLanguageTag(L10n.lang.code)).format(cal.time) }
    val hijri = remember(dayKey, L10n.lang) { HijriDate.INSTANCE.format(cal, L10n.lang.code) }

    PrayerTimesContent(
        city = city,
        country = country,
        hijriText = hijri,
        gregorianText = gregorian,
        nextPrayerName = next.first,
        nextPrayerTime = formatPrayerTime(next.second),
        countdownText = formatCountdown(remaining),
        progress = progress,
        rows = ordered.map { (name, time, icon) ->
            PrayerRowDisplay(name, formatPrayerTime(time), name == next.first && time == next.second, icon)
        },
        onChangeCity = { showCitySearch = true },
        onMenu = onMenu
    )

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

@Composable
fun PrayerTimesContent(
    city: String,
    country: String,
    hijriText: String,
    gregorianText: String,
    nextPrayerName: String,
    nextPrayerTime: String,
    countdownText: String,
    progress: Float,
    rows: List<PrayerRowDisplay>,
    onChangeCity: () -> Unit,
    onMenu: (() -> Unit)? = null
) {
    val cs = MaterialTheme.colorScheme
    OneUIScreen(title = L10n.t(S.PrayerTimes), onMenu = onMenu) {
        item(key = "prayer-overview") {
            // One card: date and location, a divider, then the next-prayer block.
            OneUICard(padding = PaddingValues(20.dp)) {
                Text(
                    hijriText,
                    color = cs.onSurface,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(Modifier.height(4.dp))
                Text(gregorianText, color = cs.onSurfaceVariant, style = MaterialTheme.typography.bodyMedium)
                Spacer(Modifier.height(12.dp))
                Row(
                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).clickable(onClick = onChangeCity).padding(vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Outlined.LocationOn,
                        null,
                        modifier = Modifier.size(40.dp).padding(11.dp),
                        tint = cs.onSurfaceVariant
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(SavedCity(), color = cs.onSurfaceVariant, style = MaterialTheme.typography.labelLarge)
                }
                OneUIDivider(12.dp)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier.size(40.dp).clip(CircleShape).background(cs.surfaceVariant),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Outlined.Mosque, null, modifier = Modifier.size(22.dp), tint = OneUIActiveGreen)
                    }
                    Spacer(Modifier.width(12.dp))
                    Text(
                        L10n.t(S.NextPrayer),
                        modifier = Modifier.offset(0.dp, 6.dp),
                        color = cs.onSurfaceVariant,
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                Spacer(Modifier.height(18.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        countdownText,
                        color = OneUITimeCyan,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Column(horizontalAlignment = Alignment.End) {
                        Text(
                            nextPrayerName,
                            color = cs.onSurface,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(nextPrayerTime, color = cs.onSurfaceVariant, style = MaterialTheme.typography.bodyMedium)
                    }
                }
                Spacer(Modifier.height(14.dp))
                OneUIProgressBar(progress, color = OneUIActiveGreen)
            }
        }
        item(key = "prayer-list") {
            OneUICard {
                rows.forEachIndexed { index, row ->
                    if (index > 0 && !row.isNext && !rows[index - 1].isNext) OneUIDivider()
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
                                .background(if (row.isNext) OneUIActiveGreen.copy(alpha = 0.18f) else cs.surfaceVariant),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                row.icon,
                                null,
                                modifier = Modifier.size(20.dp),
                                tint = if (row.isNext) OneUIActiveGreen else cs.onSurfaceVariant
                            )
                        }
                        Spacer(Modifier.width(14.dp))
                        Text(
                            row.name,
                            color = if (row.isNext) OneUIActiveGreen else cs.onSurface,
                            fontWeight = if (row.isNext) FontWeight.Bold else FontWeight.Normal,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Spacer(Modifier.weight(1f))
                        Text(
                            row.timeText,
                            color = if (row.isNext) cs.primary else cs.onSurface,
                            fontWeight = if (row.isNext) FontWeight.Bold else FontWeight.Normal,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }
        }
    }
}

