package com.example.prayer

import android.icu.util.IslamicCalendar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.RestartAlt
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S
import com.example.ui.oneui.OneUICard
import com.example.ui.oneui.OneUIDialog
import com.example.ui.oneui.OneUIDivider
import com.example.ui.oneui.OneUIIconBadge
import com.example.ui.oneui.OneUIRow
import com.example.ui.oneui.OneUIScreen
import com.example.ui.oneui.SectionLabel
import java.text.DateFormatSymbols
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

private const val G_YEAR_MIN = 1900
private const val G_YEAR_MAX = 2100
private const val H_YEAR_MIN = 1300
private const val H_YEAR_MAX = 1600

private fun newUmalqura(): IslamicCalendar {
    val ic = IslamicCalendar()
    ic.setCalculationType(IslamicCalendar.CalculationType.ISLAMIC_UMALQURA)
    return ic
}

private fun gregorianMaxDay(year: Int, month1: Int): Int {
    val cal = Calendar.getInstance()
    cal.set(year, month1 - 1, 1)
    return cal.getActualMaximum(Calendar.DAY_OF_MONTH)
}

private fun hijriMaxDay(year: Int, month1: Int): Int {
    val ic = newUmalqura()
    ic.set(year, month1 - 1, 1)
    return ic.getActualMaximum(Calendar.DAY_OF_MONTH)
}

private fun hijriToGregorian(year: Int, month1: Int, day: Int): Calendar {
    val ic = newUmalqura()
    ic.set(year, month1 - 1, day)
    val cal = Calendar.getInstance()
    cal.time = ic.time
    return cal
}

private fun gregorianMonths(locale: Locale): List<String> =
    DateFormatSymbols.getInstance(locale).months.toList().filter { it.isNotEmpty() }

private fun weekdayOf(cal: Calendar, locale: Locale): String =
    SimpleDateFormat("EEEE", locale).format(cal.time)

private fun gregorianText(cal: Calendar, locale: Locale): String =
    SimpleDateFormat("d MMMM yyyy", locale).format(cal.time)

/** Hijri <-> Gregorian date converter (gap item 7). */
@Composable
fun HijriConverterScreen(onBack: (() -> Unit)? = null) {
    val cs = MaterialTheme.colorScheme
    val langCode = L10n.lang.code
    val locale = remember(langCode) { Locale(langCode) }

    val today = remember { Calendar.getInstance() }
    val todayHijri = remember { HijriDate.INSTANCE.hijriYmd(today) }

    var gDay by remember { mutableIntStateOf(today.get(Calendar.DAY_OF_MONTH)) }
    var gMonth by remember { mutableIntStateOf(today.get(Calendar.MONTH) + 1) }
    var gYear by remember { mutableIntStateOf(today.get(Calendar.YEAR)) }

    var hDay by remember { mutableIntStateOf(todayHijri.third!!) }
    var hMonth by remember { mutableIntStateOf(todayHijri.second!!) }
    var hYear by remember { mutableIntStateOf(todayHijri.first!!) }

    var picker by remember { mutableStateOf("") }

    val gMonths = gregorianMonths(locale)
    val hMonths = (1..12).map { HijriDate.INSTANCE.monthName(it, langCode) }

    val resultHijriCal = Calendar.getInstance()
    resultHijriCal.set(gYear, gMonth - 1, gDay)
    val resultHijriText = HijriDate.INSTANCE.format(resultHijriCal, langCode)
    val resultHijriWeekday = weekdayOf(resultHijriCal, locale)

    val resultGregCal = hijriToGregorian(hYear, hMonth, hDay)
    val resultGregText = gregorianText(resultGregCal, locale)
    val resultGregWeekday = weekdayOf(resultGregCal, locale)

    OneUIScreen(title = L10n.t(S.HijriConvTitle), onBack = onBack) {
        item(key = "explainer") {
            Text(
                L10n.t(S.HijriConvSub),
                color = cs.onSurfaceVariant, fontSize = 13.sp,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )
        }
        item(key = "g2h-label") { SectionLabel(L10n.t(S.GregToHijri)) }
        item(key = "g2h") {
            OneUICard {
                OneUIRow(
                    title = L10n.t(S.DayLabel),
                    summary = "$gDay",
                    onClick = { picker = "gday" }
                )
                OneUIDivider(20.dp)
                OneUIRow(
                    title = L10n.t(S.MonthLabel),
                    summary = gMonths.getOrElse(gMonth - 1) { "$gMonth" },
                    onClick = { picker = "gmonth" }
                )
                OneUIDivider(20.dp)
                OneUIRow(
                    title = L10n.t(S.YearLabel),
                    summary = "$gYear",
                    onClick = { picker = "gyear" }
                )
                OneUIDivider(20.dp)
                ConverterResult(resultHijriWeekday, resultHijriText)
            }
        }
        item(key = "h2g-label") { SectionLabel(L10n.t(S.HijriToGreg)) }
        item(key = "h2g") {
            OneUICard {
                OneUIRow(
                    title = L10n.t(S.DayLabel),
                    summary = "$hDay",
                    onClick = { picker = "hday" }
                )
                OneUIDivider(20.dp)
                OneUIRow(
                    title = L10n.t(S.MonthLabel),
                    summary = hMonths.getOrElse(hMonth - 1) { "$hMonth" },
                    onClick = { picker = "hmonth" }
                )
                OneUIDivider(20.dp)
                OneUIRow(
                    title = L10n.t(S.YearLabel),
                    summary = "$hYear",
                    onClick = { picker = "hyear" }
                )
                OneUIDivider(20.dp)
                ConverterResult(resultGregWeekday, resultGregText)
            }
        }
        item(key = "reset") {
            OneUICard {
                OneUIRow(
                    title = L10n.t(S.Today),
                    leading = { OneUIIconBadge(Icons.Outlined.RestartAlt) },
                    onClick = {
                        val now = Calendar.getInstance()
                        gDay = now.get(Calendar.DAY_OF_MONTH)
                        gMonth = now.get(Calendar.MONTH) + 1
                        gYear = now.get(Calendar.YEAR)
                        val hy = HijriDate.INSTANCE.hijriYmd(now)
                        hDay = hy.third!!
                        hMonth = hy.second!!
                        hYear = hy.first!!
                    }
                )
            }
        }
        item(key = "pad") { Spacer(Modifier.height(24.dp)) }
    }

    when (picker) {
        "gday" -> ConvPickerDialog(
            title = L10n.t(S.DayLabel),
            options = (1..gregorianMaxDay(gYear, gMonth)).map { "$it" },
            selected = gDay - 1,
            onDismiss = { picker = "" },
            onPick = { gDay = it + 1; picker = "" }
        )
        "gmonth" -> ConvPickerDialog(
            title = L10n.t(S.MonthLabel),
            options = gMonths,
            selected = gMonth - 1,
            onDismiss = { picker = "" },
            onPick = {
                gMonth = it + 1
                val max = gregorianMaxDay(gYear, gMonth)
                if (gDay > max) gDay = max
                picker = ""
            }
        )
        "gyear" -> ConvPickerDialog(
            title = L10n.t(S.YearLabel),
            options = (G_YEAR_MIN..G_YEAR_MAX).map { "$it" },
            selected = gYear - G_YEAR_MIN,
            onDismiss = { picker = "" },
            onPick = {
                gYear = G_YEAR_MIN + it
                val max = gregorianMaxDay(gYear, gMonth)
                if (gDay > max) gDay = max
                picker = ""
            }
        )
        "hday" -> ConvPickerDialog(
            title = L10n.t(S.DayLabel),
            options = (1..hijriMaxDay(hYear, hMonth)).map { "$it" },
            selected = hDay - 1,
            onDismiss = { picker = "" },
            onPick = { hDay = it + 1; picker = "" }
        )
        "hmonth" -> ConvPickerDialog(
            title = L10n.t(S.MonthLabel),
            options = hMonths,
            selected = hMonth - 1,
            onDismiss = { picker = "" },
            onPick = {
                hMonth = it + 1
                val max = hijriMaxDay(hYear, hMonth)
                if (hDay > max) hDay = max
                picker = ""
            }
        )
        "hyear" -> ConvPickerDialog(
            title = L10n.t(S.YearLabel),
            options = (H_YEAR_MIN..H_YEAR_MAX).map { "$it" },
            selected = hYear - H_YEAR_MIN,
            onDismiss = { picker = "" },
            onPick = {
                hYear = H_YEAR_MIN + it
                val max = hijriMaxDay(hYear, hMonth)
                if (hDay > max) hDay = max
                picker = ""
            }
        )
    }
}

@Composable
private fun ConverterResult(weekday: String, dateText: String) {
    val cs = MaterialTheme.colorScheme
    Column(
        modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(weekday, color = cs.onSurfaceVariant, fontSize = 14.sp, textAlign = TextAlign.Center)
        Spacer(Modifier.height(4.dp))
        Text(
            dateText,
            color = cs.primary,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun ConvPickerDialog(title: String, options: List<String>, selected: Int, onDismiss: () -> Unit, onPick: (Int) -> Unit) {
    val cs = MaterialTheme.colorScheme
    OneUIDialog(title = title, onDismiss = onDismiss) {
        options.forEachIndexed { index, label ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .clickable { onPick(index) }
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(label, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                if (index == selected) {
                    Icon(Icons.Outlined.Check, null, tint = cs.primary)
                }
            }
        }
    }
}
