package com.example.alarm

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.R
import com.example.data.AppDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

import android.app.PendingIntent
import com.example.MainActivity
import com.example.receiver.NotificationActionReceiver

class AlarmReceiver : BroadcastReceiver() {

    companion object {
        const val CHANNEL_ID = "dhikr_channel"
        const val CHANNEL_NAME = "Dhikr Reminders"

        fun createNotificationChannel(context: Context) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager
                val channel = NotificationChannel(
                    CHANNEL_ID,
                    CHANNEL_NAME,
                    NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = "إشعارات تذكير الأذكار"
                }
                manager?.createNotificationChannel(channel)
            }
        }
    }

    override fun onReceive(context: Context, intent: Intent) {
        val id = intent.getIntExtra("DHIKR_ID", -1)
        val title = intent.getStringExtra("DHIKR_TITLE") ?: "تذكير"
        val content = intent.getStringExtra("DHIKR_CONTENT") ?: ""
        val isSnooze = intent.getBooleanExtra("IS_SNOOZE", false)

        if (id != -1) {
            showNotification(context, id, title, content)
            
            // Reschedule for next day only if it's a standard daily alarm (not a snooze trigger)
            if (!isSnooze) {
                val pendingResult = goAsync()
                CoroutineScope(Dispatchers.IO).launch {
                    try {
                        val db = AppDatabase.getDatabase(context)
                        val dhikr = db.dhikrDao().getDhikrById(id)
                        if (dhikr != null && dhikr.isEnabled) {
                            AlarmScheduler(context).schedule(dhikr)
                        }
                    } finally {
                        pendingResult.finish()
                    }
                }
            }
        }
    }

    private fun showNotification(context: Context, id: Int, title: String, content: String) {
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager ?: return
        createNotificationChannel(context)

        // 1. Content Intent (Tapping Notification Body)
        val openAppIntent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            putExtra("DHIKR_ID", id)
            putExtra("NOTIFICATION_ID", id)
        }
        val contentPendingIntent = PendingIntent.getActivity(
            context,
            id * 10 + 1,
            openAppIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        // 2. Action 1: "تم القراءة" (Mark as Read)
        val markReadIntent = Intent(context, NotificationActionReceiver::class.java).apply {
            action = NotificationActionReceiver.ACTION_MARK_AS_READ
            putExtra("DHIKR_ID", id)
            putExtra("NOTIFICATION_ID", id)
        }
        val markReadPendingIntent = PendingIntent.getBroadcast(
            context,
            id * 10 + 2,
            markReadIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        // 3. Action 2: "ذكرني بعد 10 دقائق" (Snooze)
        val snoozeIntent = Intent(context, NotificationActionReceiver::class.java).apply {
            action = NotificationActionReceiver.ACTION_SNOOZE
            putExtra("DHIKR_ID", id)
            putExtra("DHIKR_TITLE", title)
            putExtra("DHIKR_CONTENT", content)
            putExtra("NOTIFICATION_ID", id)
        }
        val snoozePendingIntent = PendingIntent.getBroadcast(
            context,
            id * 10 + 3,
            snoozeIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        // 4. Action 3: "فتح التطبيق" (Open App Action)
        val openAppPendingIntent = PendingIntent.getActivity(
            context,
            id * 10 + 4,
            openAppIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle(title)
            .setContentText(content)
            .setSmallIcon(R.drawable.ic_notification)
            .setStyle(NotificationCompat.BigTextStyle().bigText(content))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(contentPendingIntent)
            .addAction(0, "تم القراءة", markReadPendingIntent)
            .addAction(0, "ذكرني بعد 10 دقائق", snoozePendingIntent)
            .addAction(0, "فتح التطبيق", openAppPendingIntent)
            .build()

        manager.notify(id, notification)
    }
}
