package com.wathakker.wear

import android.content.Context
import com.example.fajr.calculation.CalculationMethod
import com.example.fajr.calculation.PrayerTimesCalculator
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sin

/** One prayer time. [id] is 0 Fajr, 1 Sunrise, 2 Dhuhr, 3 Asr, 4 Maghrib, 5 Isha. */
data class Slot(val id: Int, val name: String, val at: Long)

class PrayerState(
    val now: Long,
    val today: List<Slot>,      // six slots for today
    val prev: Slot,             // last time that already passed
    val next: Slot,             // next time (may be tomorrow's Fajr)
    val nextFajrTomorrow: Slot
) {
    val progress: Float get() = max(0.02f, min(1f, (now - prev.at).toFloat() / max(1L, next.at - prev.at).toFloat()))
}

object Prayer {
    val names = listOf("الفجر", "الشروق", "الظهر", "العصر", "المغرب", "العشاء")
    // Default location until a phone sync exists: Cairo.
    const val DEFAULT_LAT = 30.0444
    const val DEFAULT_LON = 31.2357
    const val DEFAULT_CITY = "القاهرة"

    private fun coords(c: Context): Pair<Double, Double> {
        val p = c.getSharedPreferences("wear_prefs", Context.MODE_PRIVATE)
        return Pair(
            java.lang.Double.longBitsToDouble(p.getLong("lat", java.lang.Double.doubleToLongBits(DEFAULT_LAT))),
            java.lang.Double.longBitsToDouble(p.getLong("lon", java.lang.Double.doubleToLongBits(DEFAULT_LON)))
        )
    }

    private fun day(c: Context, offsetDays: Int, now: Long): List<Slot> {
        val (lat, lon) = coords(c)
        val cal = Calendar.getInstance(TimeZone.getDefault())
        cal.timeInMillis = now
        cal.add(Calendar.DAY_OF_YEAR, offsetDays)
        cal.set(Calendar.HOUR_OF_DAY, 12); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0)
        val d = PrayerTimesCalculator.INSTANCE.calculateAll(cal, lat, lon, CalculationMethod.EGYPTIAN, 1, 0, intArrayOf(0, 0, 0, 0, 0, 0))
        val t = longArrayOf(d.fajr, d.sunrise, d.dhuhr, d.asr, d.maghrib, d.isha)
        return t.mapIndexed { i, v -> Slot(i, names[i], v) }
    }

    @Volatile var h24 = false

    fun compute(c: Context, now: Long = System.currentTimeMillis()): PrayerState {
        h24 = c.getSharedPreferences("wear_prefs", Context.MODE_PRIVATE).getBoolean("h24", false)
        val y = day(c, -1, now); val t = day(c, 0, now); val n = day(c, 1, now)
        val all = y + t + n
        val next = all.first { it.at > now }
        val prev = all.last { it.at <= now }
        return PrayerState(now, t, prev, next, n[0])
    }

    private fun fmt(p: String, ms: Long): String =
        SimpleDateFormat(p, Locale.ENGLISH).format(Date(ms))

    /** "05:32 ص" */
    fun time12(ms: Long): String {
        if (h24) return fmt("HH:mm", ms)
        val cal = Calendar.getInstance(); cal.timeInMillis = ms
        val ap = if (cal.get(Calendar.HOUR_OF_DAY) < 12) "ص" else "م"
        return fmt("hh:mm", ms) + " " + ap
    }

    fun time24(ms: Long): String = fmt("HH:mm", ms)

    /** HH:MM remaining. */
    fun hhmm(deltaMs: Long): String {
        val m = max(0L, deltaMs / 60000)
        return String.format(Locale.ENGLISH, "%02d:%02d", m / 60, m % 60)
    }

    private fun hours(h: Long) = when {
        h == 1L -> "ساعة"; h == 2L -> "ساعتان"; h in 3..10 -> "$h ساعات"; else -> "$h ساعة"
    }
    private fun mins(m: Long) = when {
        m == 1L -> "دقيقة"; m == 2L -> "دقيقتان"; m in 3..10 -> "$m دقائق"; else -> "$m دقيقة"
    }

    /** "ساعتان و 29 دقيقة", same wording as the phone widget. */
    fun remainingText(deltaMs: Long): String {
        val total = max(0L, deltaMs / 60000)
        val h = total / 60; val m = total % 60
        return when {
            h == 0L -> mins(m)
            m == 0L -> hours(h)
            else -> hours(h) + " و " + mins(m)
        }
    }

    private val weekdays = listOf("الأحد", "الإثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت")
    private val gregMonths = listOf("يناير", "فبراير", "مارس", "أبريل", "مايو", "يونيو", "يوليو", "أغسطس", "سبتمبر", "أكتوبر", "نوفمبر", "ديسمبر")
    private val hijriMonths = listOf("محرم", "صفر", "ربيع الأول", "ربيع الآخر", "جمادى الأولى", "جمادى الآخرة", "رجب", "شعبان", "رمضان", "شوال", "ذو القعدة", "ذو الحجة")

    fun weekday(ms: Long): String { val c = Calendar.getInstance(); c.timeInMillis = ms; return weekdays[c.get(Calendar.DAY_OF_WEEK) - 1] }
    fun gregDate(ms: Long): String { val c = Calendar.getInstance(); c.timeInMillis = ms; return "${c.get(Calendar.DAY_OF_MONTH)} ${gregMonths[c.get(Calendar.MONTH)]}" }
    fun hijri(ms: Long): String {
        val h = java.time.chrono.HijrahDate.from(java.time.Instant.ofEpochMilli(ms).atZone(java.time.ZoneId.systemDefault()))
        return "${h.get(java.time.temporal.ChronoField.DAY_OF_MONTH)} ${hijriMonths[h.get(java.time.temporal.ChronoField.MONTH_OF_YEAR) - 1]}"
    }

    /** Initial great-circle bearing to the Kaaba, degrees 0..360. */
    fun qiblaBearing(c: Context): Float {
        val (lat, lon) = coords(c)
        val kLat = Math.toRadians(21.4225); val kLon = Math.toRadians(39.8262)
        val p1 = Math.toRadians(lat); val dl = kLon - Math.toRadians(lon)
        val y = sin(dl) * cos(kLat)
        val x = cos(p1) * sin(kLat) - sin(p1) * cos(kLat) * cos(dl)
        return ((Math.toDegrees(atan2(y, x)) + 360.0) % 360.0).toFloat()
    }

    private val dirs = listOf("شمال", "شمال شرق", "شرق", "جنوب شرق", "جنوب", "جنوب غرب", "غرب", "شمال غرب")
    fun directionName(deg: Float): String = dirs[(((deg + 22.5f) % 360f) / 45f).toInt().coerceIn(0, 7)]
}
