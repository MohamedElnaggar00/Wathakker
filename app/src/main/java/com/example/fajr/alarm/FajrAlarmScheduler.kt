package com.example.fajr.alarm

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import com.example.fajr.calculation.CalculationMethod
import com.example.fajr.calculation.PrayerTimesCalculator
import com.example.fajr.data.FajrPreferences
import com.example.fajr.ui.FajrAlarmActivity
import java.util.Calendar

class FajrAlarmScheduler(private val context: Context) {

    private val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    private val prefs = FajrPreferences(context)

    companion object {
        const val ALARM_REQUEST_CODE = 88001
        const val SNOOZE_REQUEST_CODE = 88002
        const val ACTION_FAJR_ALARM = "com.example.fajr.ACTION_FAJR_ALARM"
    }

    fun scheduleNextFajrAlarm(): Long {
        if (!prefs.isAlarmEnabled) {
            cancelAllAlarms()
            return 0L
        }

        val now = System.currentTimeMillis()
        val calendar = Calendar.getInstance()

        // Calculate today's Fajr
        val method = CalculationMethod.fromId(prefs.calculationMethodId)
        var fajrTime = PrayerTimesCalculator.calculateFajrTime(
            calendar = calendar,
            latitude = prefs.latitude,
            longitude = prefs.longitude,
            method = method
        )

        // If today's Fajr has already passed, schedule for tomorrow
        if (fajrTime <= now) {
            calendar.add(Calendar.DAY_OF_YEAR, 1)
            fajrTime = PrayerTimesCalculator.calculateFajrTime(
                calendar = calendar,
                latitude = prefs.latitude,
                longitude = prefs.longitude,
                method = method
            )
        }

        prefs.lastCalculatedFajrTimeMillis = fajrTime
        setExactAlarm(fajrTime, ALARM_REQUEST_CODE)
        return fajrTime
    }

    fun scheduleSnooze(snoozeMinutes: Int) {
        val triggerAtMillis = System.currentTimeMillis() + (snoozeMinutes * 60 * 1000L)
        setExactAlarm(triggerAtMillis, SNOOZE_REQUEST_CODE)
    }

    private fun setExactAlarm(triggerAtMillis: Long, requestCode: Int) {
        val intent = Intent(context, FajrAlarmReceiver::class.java).apply {
            action = ACTION_FAJR_ALARM
        }

        val pendingIntent = PendingIntent.getBroadcast(
            context,
            requestCode,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        // Create showIntent for setAlarmClock (brings full-screen activity when clicked or triggered)
        val showIntent = Intent(context, FajrAlarmActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        val showPendingIntent = PendingIntent.getActivity(
            context,
            requestCode + 10,
            showIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            if (alarmManager.canScheduleExactAlarms()) {
                val alarmClockInfo = AlarmManager.AlarmClockInfo(triggerAtMillis, showPendingIntent)
                alarmManager.setAlarmClock(alarmClockInfo, pendingIntent)
            } else {
                alarmManager.setAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMillis, pendingIntent)
            }
        } else {
            val alarmClockInfo = AlarmManager.AlarmClockInfo(triggerAtMillis, showPendingIntent)
            alarmManager.setAlarmClock(alarmClockInfo, pendingIntent)
        }
    }

    fun cancelAllAlarms() {
        val intent = Intent(context, FajrAlarmReceiver::class.java).apply {
            action = ACTION_FAJR_ALARM
        }
        val pendingIntent = PendingIntent.getBroadcast(
            context,
            ALARM_REQUEST_CODE,
            intent,
            PendingIntent.FLAG_NO_CREATE or PendingIntent.FLAG_IMMUTABLE
        )
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent)
            pendingIntent.cancel()
        }

        val snoozeIntent = PendingIntent.getBroadcast(
            context,
            SNOOZE_REQUEST_CODE,
            intent,
            PendingIntent.FLAG_NO_CREATE or PendingIntent.FLAG_IMMUTABLE
        )
        if (snoozeIntent != null) {
            alarmManager.cancel(snoozeIntent)
            snoozeIntent.cancel()
        }
    }
}
