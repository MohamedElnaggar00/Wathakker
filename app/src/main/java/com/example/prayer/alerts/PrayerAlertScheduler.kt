package com.example.prayer.alerts

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import com.example.fajr.calculation.CalculationMethod
import com.example.fajr.calculation.PrayerAdjustments
import com.example.fajr.data.FajrPreferences
import java.util.Calendar

/**
 * Schedules per-prayer alerts (bells) as exact alarms. Rescheduled after every fire,
 * on boot/timezone/time-set (BootReceiver hook), and on any settings change.
 * Request codes: adhan alert = 100+i, iqama reminder = 200+i (i = prayer index 0..5).
 */
object PrayerAlertScheduler {
    const val EXTRA_PRAYER = "prayer_index"
    const val EXTRA_KIND = "alert_kind"
    const val KIND_ADHAN = 0
    const val KIND_IQAMA = 1

    private val IQAMA_OFFSETS = intArrayOf(25, 0, 20, 20, 10, 20) // Shuruq has no iqama

    fun scheduleAll(context: Context) {
        PrayerAlertStore.migrate(context)
        val prefs = FajrPreferences(context)
        val method = CalculationMethod.fromId(prefs.calculationMethodId)
        val now = System.currentTimeMillis()
        val today = PrayerAdjustments.calculateAll(
            context, Calendar.getInstance(), prefs.latitude, prefs.longitude, method
        )
        val times = longArrayOf(today.fajr, today.sunrise, today.dhuhr, today.asr, today.maghrib, today.isha)
        for (i in 0..5) {
            scheduleOne(context, i, nextOccurrence(context, i, times, now, prefs, method), now)
        }
    }

    private fun nextOccurrence(
        context: Context, prayer: Int, times: LongArray, now: Long,
        prefs: FajrPreferences, method: CalculationMethod
    ): Long {
        val offsetMs = PrayerAlertStore.offsetMinutes(context, prayer) * 60000L
        var trigger = times[prayer] - offsetMs
        if (trigger <= now) {
            val tomorrow = Calendar.getInstance().apply { add(Calendar.DATE, 1) }
            val t = PrayerAdjustments.calculateAll(context, tomorrow, prefs.latitude, prefs.longitude, method)
            val arr = longArrayOf(t.fajr, t.sunrise, t.dhuhr, t.asr, t.maghrib, t.isha)
            trigger = arr[prayer] - offsetMs
        }
        return trigger
    }

    private fun scheduleOne(context: Context, prayer: Int, adhanTrigger: Long, now: Long) {
        val am = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        // Always replace both pending intents for this prayer.
        am.cancel(pending(context, prayer, KIND_ADHAN))
        am.cancel(pending(context, prayer, KIND_IQAMA))
        if (!PrayerAlertStore.isEnabled(context, prayer)) return
        setExact(am, adhanTrigger, pending(context, prayer, KIND_ADHAN))
        if (PrayerAlertStore.iqamaReminder(context, prayer) && IQAMA_OFFSETS[prayer] > 0) {
            val iqamaTrigger = adhanTrigger + IQAMA_OFFSETS[prayer] * 60000L +
                PrayerAlertStore.offsetMinutes(context, prayer) * 60000L
            if (iqamaTrigger > now) {
                setExact(am, iqamaTrigger, pending(context, prayer, KIND_IQAMA))
            }
        }
    }

    private fun setExact(am: AlarmManager, triggerAtMillis: Long, pi: PendingIntent) {
        try {
            am.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMillis, pi)
        } catch (se: SecurityException) {
            try { am.setAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMillis, pi) } catch (_: Exception) {}
        } catch (_: Exception) {}
    }

    private fun pending(context: Context, prayer: Int, kind: Int): PendingIntent {
        val intent = Intent(context, PrayerAlertReceiver::class.java)
            .putExtra(EXTRA_PRAYER, prayer)
            .putExtra(EXTRA_KIND, kind)
        return PendingIntent.getBroadcast(
            context, if (kind == KIND_ADHAN) 100 + prayer else 200 + prayer,
            intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }

    fun cancelAll(context: Context) {
        val am = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        for (i in 0..5) {
            am.cancel(pending(context, i, KIND_ADHAN))
            am.cancel(pending(context, i, KIND_IQAMA))
        }
    }
}
