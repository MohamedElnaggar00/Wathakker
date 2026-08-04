package com.example.fajr.sound

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.net.Uri
import android.provider.OpenableColumns
import android.provider.Settings
import com.example.fajr.data.FajrPreferences

class RingtoneHelper(private val context: Context) {

    private var mediaPlayer: MediaPlayer? = null

    fun getValidRingtoneUri(prefs: FajrPreferences): Uri {
        val savedUriStr = prefs.ringtoneUri
        if (savedUriStr.isNotEmpty()) {
            val uri = Uri.parse(savedUriStr)
            if (isUriAccessible(uri)) {
                return uri
            }
        }
        // Fallback to system default alarm
        return RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
            ?: RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
            ?: Settings.System.DEFAULT_ALARM_ALERT_URI
    }

    private fun isUriAccessible(uri: Uri): Boolean {
        return try {
            val pfd = context.contentResolver.openFileDescriptor(uri, "r")
            pfd?.close()
            true
        } catch (e: Exception) {
            false
        }
    }

    fun getRingtoneTitle(uri: Uri): String {
        try {
            // Check content resolver
            context.contentResolver.query(uri, null, null, null, null)?.use { cursor ->
                if (cursor.moveToFirst()) {
                    val nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                    if (nameIndex != -1) {
                        val name = cursor.getString(nameIndex)
                        if (!name.isNullOrEmpty()) return name
                    }
                }
            }
            // Check RingtoneManager
            val ringtone = RingtoneManager.getRingtone(context, uri)
            val title = ringtone?.getTitle(context)
            if (!title.isNullOrEmpty()) return title
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return "نغمة المنبه الافتراضية"
    }

    fun playPreview(uri: Uri, volume: Float = 0.8f) {
        stopPreview()
        try {
            mediaPlayer = MediaPlayer().apply {
                setAudioAttributes(
                    AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_ALARM)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build()
                )
                setDataSource(context, uri)
                setVolume(volume, volume)
                prepare()
                start()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            // Try fallback
            try {
                val defaultUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
                mediaPlayer = MediaPlayer.create(context, defaultUri)?.apply {
                    setVolume(volume, volume)
                    start()
                }
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }

    fun stopPreview() {
        try {
            mediaPlayer?.let {
                if (it.isPlaying) {
                    it.stop()
                }
                it.release()
            }
            mediaPlayer = null
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
