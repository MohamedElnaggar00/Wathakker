cat << 'INNER' > app/src/main/java/com/example/fajr/data/FajrPreferences.kt
package com.example.fajr.data

import android.content.Context
import android.content.SharedPreferences

class FajrPreferences(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("fajr_prefs", Context.MODE_PRIVATE)

    var isAlarmEnabled: Boolean
        get() = prefs.getBoolean("is_alarm_enabled", false)
        set(value) = prefs.edit().putBoolean("is_alarm_enabled", value).apply()

    var calculationMethodId: Int
        get() = prefs.getInt("calculation_method", 1) // 1 = Egyptian General Authority of Survey
        set(value) = prefs.edit().putInt("calculation_method", value).apply()

    var ringtoneUri: String
        get() = prefs.getString("ringtone_uri", "") ?: ""
        set(value) = prefs.edit().putString("ringtone_uri", value).apply()

    var ringtoneTitle: String
        get() = prefs.getString("ringtone_title", "الافتراضي") ?: "الافتراضي"
        set(value) = prefs.edit().putString("ringtone_title", value).apply()

    var alarmVolume: Int
        get() = prefs.getInt("alarm_volume", 80)
        set(value) = prefs.edit().putInt("alarm_volume", value).apply()

    var isVibrationEnabled: Boolean
        get() = prefs.getBoolean("is_vibration_enabled", true)
        set(value) = prefs.edit().putBoolean("is_vibration_enabled", value).apply()

    var maxDurationMinutes: Int
        get() = prefs.getInt("max_duration_minutes", 5) // Now represents SNOOZE duration
        set(value) = prefs.edit().putInt("max_duration_minutes", value).apply()

    var latitude: Double
        get() = prefs.getFloat("latitude", 30.0444f).toDouble()
        set(value) = prefs.edit().putFloat("latitude", value.toFloat()).apply()

    var longitude: Double
        get() = prefs.getFloat("longitude", 31.2357f).toDouble()
        set(value) = prefs.edit().putFloat("longitude", value.toFloat()).apply()

    var cityName: String
        get() = prefs.getString("city_name", "القاهرة") ?: "القاهرة"
        set(value) = prefs.edit().putString("city_name", value).apply()
        
    var lastCalculatedFajrTimeMillis: Long
        get() = prefs.getLong("last_fajr_time", 0L)
        set(value) = prefs.edit().putLong("last_fajr_time", value).apply()

    var lastAlarmTriggeredDate: String
        get() = prefs.getString("last_alarm_triggered_date", "") ?: ""
        set(value) = prefs.edit().putString("last_alarm_triggered_date", value).apply()

    var snoozeCount: Int
        get() = prefs.getInt("snooze_count", 0)
        set(value) = prefs.edit().putInt("snooze_count", value).apply()
}
INNER
