package com.example.fajr.data;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FajrPreferences.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R$\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR$\u0010\"\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R$\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020%2\u0006\u0010\b\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u0010.\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R$\u00102\u001a\u0002012\u0006\u0010\b\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R$\u0010:\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010\u0013R$\u0010=\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u000b\"\u0004\b?\u0010\rR$\u0010@\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u0017\"\u0004\bB\u0010\u0019R$\u0010C\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0017\"\u0004\bE\u0010\u0019¨\u0006F"}, d2 = {"Lcom/example/fajr/data/FajrPreferences;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "value", "", "isAlarmEnabled", "()Z", "setAlarmEnabled", "(Z)V", "", "calculationMethodId", "getCalculationMethodId", "()I", "setCalculationMethodId", "(I)V", "", "ringtoneUri", "getRingtoneUri", "()Ljava/lang/String;", "setRingtoneUri", "(Ljava/lang/String;)V", "ringtoneTitle", "getRingtoneTitle", "setRingtoneTitle", "alarmVolume", "getAlarmVolume", "setAlarmVolume", "isVibrationEnabled", "setVibrationEnabled", "maxDurationMinutes", "getMaxDurationMinutes", "setMaxDurationMinutes", "", "latitude", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "cityName", "getCityName", "setCityName", "", "lastCalculatedFajrTimeMillis", "getLastCalculatedFajrTimeMillis", "()J", "setLastCalculatedFajrTimeMillis", "(J)V", "lastAlarmTriggeredDate", "getLastAlarmTriggeredDate", "setLastAlarmTriggeredDate", "snoozeCount", "getSnoozeCount", "setSnoozeCount", "useCurrentLocation", "getUseCurrentLocation", "setUseCurrentLocation", "countryName", "getCountryName", "setCountryName", "widgetBarColor", "getWidgetBarColor", "setWidgetBarColor", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FajrPreferences {
    public static final int $stable = 8;
    private final SharedPreferences prefs;

    public FajrPreferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("fajr_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    public final boolean isAlarmEnabled() {
        return this.prefs.getBoolean("is_alarm_enabled", false);
    }

    public final void setAlarmEnabled(boolean value) {
        this.prefs.edit().putBoolean("is_alarm_enabled", value).apply();
    }

    public final int getCalculationMethodId() {
        return this.prefs.getInt("calculation_method", 1);
    }

    public final void setCalculationMethodId(int value) {
        this.prefs.edit().putInt("calculation_method", value).apply();
    }

    public final String getRingtoneUri() {
        String string = this.prefs.getString("ringtone_uri", "");
        return string == null ? "" : string;
    }

    public final void setRingtoneUri(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefs.edit().putString("ringtone_uri", value).apply();
    }

    public final String getRingtoneTitle() {
        String string = this.prefs.getString("ringtone_title", "الافتراضي");
        return string == null ? "الافتراضي" : string;
    }

    public final void setRingtoneTitle(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefs.edit().putString("ringtone_title", value).apply();
    }

    public final int getAlarmVolume() {
        return this.prefs.getInt("alarm_volume", 80);
    }

    public final void setAlarmVolume(int value) {
        this.prefs.edit().putInt("alarm_volume", value).apply();
    }

    public final boolean isVibrationEnabled() {
        return this.prefs.getBoolean("is_vibration_enabled", true);
    }

    public final void setVibrationEnabled(boolean value) {
        this.prefs.edit().putBoolean("is_vibration_enabled", value).apply();
    }

    public final int getMaxDurationMinutes() {
        return this.prefs.getInt("max_duration_minutes", 5);
    }

    public final void setMaxDurationMinutes(int value) {
        this.prefs.edit().putInt("max_duration_minutes", value).apply();
    }

    public final double getLatitude() {
        return this.prefs.getFloat("latitude", 30.0444f);
    }

    public final void setLatitude(double value) {
        this.prefs.edit().putFloat("latitude", (float) value).apply();
    }

    public final double getLongitude() {
        return this.prefs.getFloat("longitude", 31.2357f);
    }

    public final void setLongitude(double value) {
        this.prefs.edit().putFloat("longitude", (float) value).apply();
    }

    public final String getCityName() {
        String string = this.prefs.getString("city_name", "القاهرة");
        return string == null ? "القاهرة" : string;
    }

    public final void setCityName(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefs.edit().putString("city_name", value).apply();
    }

    public final String getCityNameLocalized(String lang) {
        String legacy = getCityName();
        if ("ar".equals(lang)) {
            String v = this.prefs.getString("city_name_ar", legacy);
            return v == null ? legacy : v;
        }
        String en = this.prefs.getString("city_name_en", null);
        if (en == null) {
            String ar = this.prefs.getString("city_name_ar", legacy);
            return ar == null ? legacy : ar;
        }
        return en;
    }

    public final void setCityNames(String arTitle, String enTitle) {
        setCityName(arTitle);
        this.prefs.edit().putString("city_name_ar", arTitle).putString("city_name_en", enTitle).apply();
    }

    public final String getPlaceKey() {
        return this.prefs.getString("place_key", null);
    }

    public final void setPlaceKey(String value) {
        this.prefs.edit().putString("place_key", value).apply();
    }

    public final String getCityNameArOrig() {
        return this.prefs.getString("city_name_ar_orig", null);
    }

    public final String getCityNameEnOrig() {
        return this.prefs.getString("city_name_en_orig", null);
    }

    public final void setCityNamesOrig(String arTitle, String enTitle) {
        this.prefs.edit().putString("city_name_ar_orig", arTitle).putString("city_name_en_orig", enTitle).apply();
    }

    public final void clearCityNamesOrig() {
        this.prefs.edit().remove("city_name_ar_orig").remove("city_name_en_orig").apply();
    }

    public final long getLastCalculatedFajrTimeMillis() {
        return this.prefs.getLong("last_fajr_time", 0L);
    }

    public final void setLastCalculatedFajrTimeMillis(long value) {
        this.prefs.edit().putLong("last_fajr_time", value).apply();
    }

    public final String getLastAlarmTriggeredDate() {
        String string = this.prefs.getString("last_alarm_triggered_date", "");
        return string == null ? "" : string;
    }

    public final void setLastAlarmTriggeredDate(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefs.edit().putString("last_alarm_triggered_date", value).apply();
    }

    public final int getSnoozeCount() {
        return this.prefs.getInt("snooze_count", 0);
    }

    public final void setSnoozeCount(int value) {
        this.prefs.edit().putInt("snooze_count", value).apply();
    }

    public final boolean getUseCurrentLocation() {
        return this.prefs.getBoolean("use_current_location", true);
    }

    public final void setUseCurrentLocation(boolean value) {
        this.prefs.edit().putBoolean("use_current_location", value).apply();
    }

    public final String getCountryName() {
        String string = this.prefs.getString("country_name", "مصر");
        return string == null ? "مصر" : string;
    }

    public final void setCountryName(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefs.edit().putString("country_name", value).apply();
    }

    public final String getWidgetBarColor() {
        String string = this.prefs.getString("widget_bar_color", "default");
        return string == null ? "default" : string;
    }

    public final void setWidgetBarColor(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefs.edit().putString("widget_bar_color", value).apply();
    }

    // 3.3.0 alarm timing / snooze options
    public final int getAlarmBeforeMin() { return this.prefs.getInt("alarm_before_min", 0); }
    public final void setAlarmBeforeMin(int v) { this.prefs.edit().putInt("alarm_before_min", v).apply(); }
    public final int getAlarmAfterMin() { return this.prefs.getInt("alarm_after_min", 0); }
    public final void setAlarmAfterMin(int v) { this.prefs.edit().putInt("alarm_after_min", v).apply(); }
    public final int getSnoozeMinutes() { return this.prefs.getInt("snooze_minutes", 10); }
    public final void setSnoozeMinutes(int v) { this.prefs.edit().putInt("snooze_minutes", v).apply(); }
    public final String getSlotDate(String slot) { String s = this.prefs.getString("alarm_slot_date_" + slot, ""); return s == null ? "" : s; }
    public final void setSlotDate(String slot, String date) { this.prefs.edit().putString("alarm_slot_date_" + slot, date).apply(); }
}
