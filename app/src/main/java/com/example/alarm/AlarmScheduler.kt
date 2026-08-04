package com.example.alarm

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import com.example.data.Dhikr
import java.util.Calendar

class AlarmScheduler(private val context: Context) {
    private val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as? AlarmManager

    companion object {
        private const val TAG = "AlarmScheduler"
        private const val MAX_TIMES_PER_DHIKR = 20
    }

    fun schedule(dhikr: Dhikr) {
        if (alarmManager == null) return
        cancel(dhikr) // cancel existing first
        
        dhikr.reminderTimes.forEachIndexed { index, timeStr ->
            val parts = timeStr.split(":")
            if (parts.size == 2) {
                val hour = parts[0].toIntOrNull() ?: return@forEachIndexed
                val minute = parts[1].toIntOrNull() ?: return@forEachIndexed

                val intent = Intent(context, AlarmReceiver::class.java).apply {
                    putExtra("DHIKR_ID", dhikr.id)
                    putExtra("DHIKR_TITLE", dhikr.title)
                    putExtra("DHIKR_CONTENT", dhikr.content)
                }

                val requestCode = dhikr.id * 100 + index
                val pendingIntent = PendingIntent.getBroadcast(
                    context,
                    requestCode,
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
                )

                val calendar = Calendar.getInstance().apply {
                    set(Calendar.HOUR_OF_DAY, hour)
                    set(Calendar.MINUTE, minute)
                    set(Calendar.SECOND, 0)
                    set(Calendar.MILLISECOND, 0)
                    
                    if (before(Calendar.getInstance())) {
                        add(Calendar.DATE, 1)
                    }
                }

                try {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                        if (alarmManager.canScheduleExactAlarms()) {
                            alarmManager.setExactAndAllowWhileIdle(
                                AlarmManager.RTC_WAKEUP,
                                calendar.timeInMillis,
                                pendingIntent
                            )
                        } else {
                            alarmManager.setAndAllowWhileIdle(
                                AlarmManager.RTC_WAKEUP,
                                calendar.timeInMillis,
                                pendingIntent
                            )
                        }
                    } else {
                        alarmManager.setExactAndAllowWhileIdle(
                            AlarmManager.RTC_WAKEUP,
                            calendar.timeInMillis,
                            pendingIntent
                        )
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "Error scheduling alarm for Dhikr id=${dhikr.id}", e)
                    try {
                        alarmManager.setAndAllowWhileIdle(
                            AlarmManager.RTC_WAKEUP,
                            calendar.timeInMillis,
                            pendingIntent
                        )
                    } catch (e2: Exception) {
                        Log.e(TAG, "Fallback alarm scheduling failed", e2)
                    }
                }
            }
        }
    }

    fun scheduleSnooze(id: Int, title: String, content: String, minutes: Int = 10) {
        if (alarmManager == null) return
        val triggerAtMillis = System.currentTimeMillis() + (minutes * 60 * 1000L)
        val intent = Intent(context, AlarmReceiver::class.java).apply {
            putExtra("DHIKR_ID", id)
            putExtra("DHIKR_TITLE", title)
            putExtra("DHIKR_CONTENT", content)
            putExtra("IS_SNOOZE", true)
        }

        val requestCode = id * 100 + 99
        val pendingIntent = PendingIntent.getBroadcast(
            context,
            requestCode,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                if (alarmManager.canScheduleExactAlarms()) {
                    alarmManager.setExactAndAllowWhileIdle(
                        AlarmManager.RTC_WAKEUP,
                        triggerAtMillis,
                        pendingIntent
                    )
                } else {
                    alarmManager.setAndAllowWhileIdle(
                        AlarmManager.RTC_WAKEUP,
                        triggerAtMillis,
                        pendingIntent
                    )
                }
            } else {
                alarmManager.setExactAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP,
                    triggerAtMillis,
                    pendingIntent
                )
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error scheduling snooze alarm for Dhikr id=$id", e)
        }
    }

    fun cancel(dhikr: Dhikr) {
        if (alarmManager == null) return
        for (index in 0 until MAX_TIMES_PER_DHIKR) {
            val intent = Intent(context, AlarmReceiver::class.java)
            val requestCode = dhikr.id * 100 + index
            val pendingIntent = PendingIntent.getBroadcast(
                context,
                requestCode,
                intent,
                PendingIntent.FLAG_NO_CREATE or PendingIntent.FLAG_IMMUTABLE
            )
            
            if (pendingIntent != null) {
                alarmManager.cancel(pendingIntent)
                pendingIntent.cancel()
            }
        }
    }
}
