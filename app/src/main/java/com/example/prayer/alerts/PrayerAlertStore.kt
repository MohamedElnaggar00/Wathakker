package com.example.prayer.alerts

import android.content.Context
import com.example.fajr.data.FajrPreferences

/**
 * Per-prayer alert (bell) settings for 3.1.0. Per-prayer: enable, timing (minutes
 * before adhan, 0 = at adhan), iqama reminder. Bells are always ordinary notifications
 * (no alarm mode). Sound/vibration stay SHARED in FajrPreferences (user decision).
 * Prayer index: 0 Fajr, 1 Shuruq, 2 Dhuhr, 3 Asr, 4 Maghrib, 5 Isha.
 */
object PrayerAlertStore {
    private const val PREFS = "prayer_alerts"

    private fun p(context: Context) = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    fun isEnabled(context: Context, prayer: Int): Boolean {
        migrate(context)
        return p(context).getBoolean("enabled_$prayer", false)
    }

    fun setEnabled(context: Context, prayer: Int, enabled: Boolean) {
        migrate(context)
        p(context).edit().putBoolean("enabled_$prayer", enabled).apply()
    }

    /** Minutes before adhan; 0 = exactly at adhan. */
    fun offsetMinutes(context: Context, prayer: Int): Int {
        migrate(context)
        return p(context).getInt("offset_$prayer", 0)
    }

    fun setOffsetMinutes(context: Context, prayer: Int, minutes: Int) {
        migrate(context)
        p(context).edit().putInt("offset_$prayer", minutes.coerceIn(0, 60)).apply()
    }

    /** Auto-DND during adhan -> iqama window (gap item 3). */
    fun autoDnd(context: Context, prayer: Int): Boolean {
        migrate(context)
        return p(context).getBoolean("dnd_" + prayer, false)
    }

    fun setAutoDnd(context: Context, prayer: Int, enabled: Boolean) {
        migrate(context)
        p(context).edit().putBoolean("dnd_" + prayer, enabled).apply()
    }

    fun iqamaReminder(context: Context, prayer: Int): Boolean {
        migrate(context)
        return p(context).getBoolean("iqama_$prayer", false)
    }

    fun setIqamaReminder(context: Context, prayer: Int, enabled: Boolean) {
        migrate(context)
        p(context).edit().putBoolean("iqama_$prayer", enabled).apply()
    }

    /** Legacy alarm path gate: always false after migration silenced the legacy flag. */
    fun isFajrAlarmActive(context: Context): Boolean {
        migrate(context)
        return FajrPreferences(context).isAlarmEnabled
    }

    /** One-time migration: an enabled legacy Fajr alarm becomes the Fajr bell in alarm mode. */
    @Synchronized
    fun migrate(context: Context) {
        val prefs = p(context)
        if (prefs.getBoolean("migrated_v1", false)) return
        val legacy = FajrPreferences(context)
        if (legacy.isAlarmEnabled) {
            prefs.edit()
                .putBoolean("enabled_0", true)
                .apply()
            // Silence the legacy scheduler path so only the new bell fires.
            legacy.isAlarmEnabled = false
        }
        prefs.edit().putBoolean("migrated_v1", true).apply()
    }
}
