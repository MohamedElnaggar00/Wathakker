package com.example.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.alarm.AlarmScheduler
import com.example.data.AppDatabase
import com.example.fajr.alarm.FajrAlarmScheduler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.action
        if (action == Intent.ACTION_BOOT_COMPLETED ||
            action == "android.intent.action.QUICKBOOT_POWERON" ||
            action == Intent.ACTION_TIMEZONE_CHANGED ||
            action == Intent.ACTION_TIME_CHANGED ||
            action == Intent.ACTION_MY_PACKAGE_REPLACED
        ) {
            val pendingResult = goAsync()
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    // Reschedule Dhikr alarms
                    val db = AppDatabase.getDatabase(context)
                    val dao = db.dhikrDao()
                    val enabledDhikrs = dao.getEnabledDhikrSync()
                    val scheduler = AlarmScheduler(context)
                    enabledDhikrs.forEach { dhikr ->
                        scheduler.schedule(dhikr)
                    }

                    // Reschedule Fajr Prayer Alarm
                    val fajrScheduler = FajrAlarmScheduler(context)
                    fajrScheduler.scheduleNextFajrAlarm()
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    pendingResult.finish()
                }
            }
        }
    }
}
