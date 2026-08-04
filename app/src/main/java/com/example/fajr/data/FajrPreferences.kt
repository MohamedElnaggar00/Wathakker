package com.example.fajr.data

import android.content.Context
import android.content.SharedPreferences
import com.example.fajr.calculation.CalculationMethod

class FajrPreferences(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences("fajr_alarm_prefs", Context.MODE_PRIVATE)

    var isAlarmEnabled: Boolean
        get() = prefs.getBoolean("is_alarm_enabled", false)
        set(value) = prefs.edit().putBoolean("is_alarm_enabled", value).apply()

    var useCurrentLocation: Boolean
        get() = prefs.getBoolean("use_current_location", true)
        set(value) = prefs.edit().putBoolean("use_current_location", value).apply()

    var latitude: Double
        get() = prefs.getFloat("latitude", 30.0444f).toDouble()
        set(value) = prefs.edit().putFloat("latitude", value.toFloat()).apply()

    var longitude: Double
        get() = prefs.getFloat("longitude", 31.2357f).toDouble()
        set(value) = prefs.edit().putFloat("longitude", value.toFloat()).apply()

    var cityName: String
        get() = prefs.getString("city_name", "القاهرة، مصر") ?: "القاهرة، مصر"
        set(value) = prefs.edit().putString("city_name", value).apply()

    var countryName: String
        get() = prefs.getString("country_name", "مصر") ?: "مصر"
        set(value) = prefs.edit().putString("country_name", value).apply()

    var calculationMethodId: Int
        get() = prefs.getInt("calculation_method_id", CalculationMethod.EGYPTIAN.id)
        set(value) = prefs.edit().putInt("calculation_method_id", value).apply()

    var ringtoneUri: String
        get() = prefs.getString("ringtone_uri", "") ?: ""
        set(value) = prefs.edit().putString("ringtone_uri", value).apply()

    var ringtoneTitle: String
        get() = prefs.getString("ringtone_title", "نغمة المنبه الافتراضية") ?: "نغمة المنبه الافتراضية"
        set(value) = prefs.edit().putString("ringtone_title", value).apply()

    var isVibrationEnabled: Boolean
        get() = prefs.getBoolean("is_vibration_enabled", true)
        set(value) = prefs.edit().putBoolean("is_vibration_enabled", value).apply()

    var maxDurationMinutes: Int
        get() = prefs.getInt("max_duration_minutes", 5)
        set(value) = prefs.edit().putInt("max_duration_minutes", value).apply()

    var alarmVolume: Int
        get() = prefs.getInt("alarm_volume", 80)
        set(value) = prefs.edit().putInt("alarm_volume", value).apply()

    var lastCalculatedFajrTimeMillis: Long
        get() = prefs.getLong("last_calculated_fajr_millis", 0L)
        set(value) = prefs.edit().putLong("last_calculated_fajr_millis", value).apply()

    var lastAlarmTriggeredDate: String
        get() = prefs.getString("last_alarm_triggered_date", "") ?: ""
        set(value) = prefs.edit().putString("last_alarm_triggered_date", value).apply()
}
