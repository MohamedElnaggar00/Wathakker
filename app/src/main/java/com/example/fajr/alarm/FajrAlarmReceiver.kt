package com.example.fajr.alarm

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.R
import com.example.fajr.data.FajrPreferences
import com.example.fajr.ui.FajrAlarmActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class FajrAlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val prefs = FajrPreferences(context)
        if (!prefs.isAlarmEnabled) return

        val todayDate = SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Date())

        // Check if alarm was already triggered today
        if (prefs.lastAlarmTriggeredDate == todayDate && intent.action != "ACTION_SNOOZE_TRIGGER") {
            // Re-schedule for tomorrow to be safe
            FajrAlarmScheduler(context).scheduleNextFajrAlarm()
            return
        }

        if (intent.action != "ACTION_SNOOZE_TRIGGER") {
            prefs.lastAlarmTriggeredDate = todayDate
        }

        // Show Full Screen Notification and Launch Alarm Activity
        val alarmIntent = Intent(context, FajrAlarmActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or
                    Intent.FLAG_ACTIVITY_CLEAR_TOP or
                    Intent.FLAG_ACTIVITY_SINGLE_TOP
        }

        val fullScreenPendingIntent = PendingIntent.getActivity(
            context,
            0,
            alarmIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val channelId = "fajr_alarm_channel"
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "منبه صلاة الفجر",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "قناة تنبيهات صلاة الفجر"
                setBypassDnd(true)
                enableVibration(true)
                setShowBadge(true)
            }
            notificationManager.createNotificationChannel(channel)
        }

        val notification = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("صلاة الفجر")
            .setContentText("حان الآن موعد صلاة الفجر")
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .setCategory(NotificationCompat.CATEGORY_ALARM)
            .setFullScreenIntent(fullScreenPendingIntent, true)
            .setAutoCancel(true)
            .build()

        notificationManager.notify(88001, notification)

        // Launch activity directly
        try {
            context.startActivity(alarmIntent)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // Automatically reschedule next Fajr alarm for tomorrow
        FajrAlarmScheduler(context).scheduleNextFajrAlarm()
    }
}
