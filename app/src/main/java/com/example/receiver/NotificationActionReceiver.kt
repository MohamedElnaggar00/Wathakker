package com.example.receiver

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.alarm.AlarmScheduler
import com.example.data.AppDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NotificationActionReceiver : BroadcastReceiver() {

    companion object {
        const val ACTION_MARK_AS_READ = "com.example.ACTION_MARK_AS_READ"
        const val ACTION_SNOOZE = "com.example.ACTION_SNOOZE"
    }

    override fun onReceive(context: Context, intent: Intent) {
        val notificationId = intent.getIntExtra("NOTIFICATION_ID", -1)
        val dhikrId = intent.getIntExtra("DHIKR_ID", -1)

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager
        if (notificationId != -1) {
            manager?.cancel(notificationId)
        }

        when (intent.action) {
            ACTION_MARK_AS_READ -> {
                if (dhikrId != -1) {
                    val pendingResult = goAsync()
                    CoroutineScope(Dispatchers.IO).launch {
                        try {
                            val db = AppDatabase.getDatabase(context)
                            val repo = com.example.data.DhikrRepository(db.dhikrDao(), db.tagDao(), db.historyDao())
                            repo.markAsRead(dhikrId)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        } finally {
                            pendingResult.finish()
                        }
                    }
                }
            }
            ACTION_SNOOZE -> {
                if (dhikrId != -1) {
                    val title = intent.getStringExtra("DHIKR_TITLE") ?: "تذكير"
                    val content = intent.getStringExtra("DHIKR_CONTENT") ?: ""
                    AlarmScheduler(context).scheduleSnooze(dhikrId, title, content, minutes = 10)
                }
            }
        }
    }
}
