package com.example.fajr.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.example.fajr.calculation.CalculationMethod;
import com.example.fajr.calculation.PrayerTimesCalculator;
import com.example.fajr.data.FajrPreferences;
import com.example.fajr.ui.FajrAlarmActivity;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FajrAlarmScheduler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/fajr/alarm/FajrAlarmScheduler;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "alarmManager", "Landroid/app/AlarmManager;", "prefs", "Lcom/example/fajr/data/FajrPreferences;", "scheduleNextFajrAlarm", "", "scheduleSnooze", "", "snoozeMinutes", "", "setExactAlarm", "triggerAtMillis", "requestCode", "cancelAllAlarms", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FajrAlarmScheduler {
    public static final String ACTION_FAJR_ALARM = "com.example.fajr.ACTION_FAJR_ALARM";
    public static final int ALARM_REQUEST_CODE = 88001;
    public static final int SNOOZE_REQUEST_CODE = 88002;
    private final AlarmManager alarmManager;
    private final Context context;
    private final FajrPreferences prefs;
    public static final int $stable = 8;

    public FajrAlarmScheduler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = this.context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.alarmManager = (AlarmManager) systemService;
        this.prefs = new FajrPreferences(this.context);
    }

    public final long scheduleNextFajrAlarm() {
        if (!this.prefs.isAlarmEnabled()) {
            cancelAllAlarms();
            return 0L;
        }
        long now = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        CalculationMethod method = CalculationMethod.INSTANCE.fromId(this.prefs.getCalculationMethodId());
        PrayerTimesCalculator prayerTimesCalculator = PrayerTimesCalculator.INSTANCE;
        Intrinsics.checkNotNull(calendar);
        long fajrTime = com.example.fajr.calculation.PrayerAdjustments.INSTANCE.fajrTime(this.context, calendar, this.prefs.getLatitude(), this.prefs.getLongitude(), method);
        if (fajrTime <= now) {
            calendar.add(6, 1);
            fajrTime = com.example.fajr.calculation.PrayerAdjustments.INSTANCE.fajrTime(this.context, calendar, this.prefs.getLatitude(), this.prefs.getLongitude(), method);
        }
        this.prefs.setLastCalculatedFajrTimeMillis(fajrTime);
        setExactAlarm(fajrTime, ALARM_REQUEST_CODE);
        return fajrTime;
    }

    public final void scheduleSnooze(int snoozeMinutes) {
        long triggerAtMillis = System.currentTimeMillis() + (snoozeMinutes * 60 * 1000);
        setExactAlarm(triggerAtMillis, SNOOZE_REQUEST_CODE);
    }

    private final void setExactAlarm(long triggerAtMillis, int requestCode) {
        Intent intent = new Intent(this.context, (Class<?>) FajrAlarmReceiver.class);
        intent.setAction(requestCode == 88002 ? "ACTION_SNOOZE_TRIGGER" : ACTION_FAJR_ALARM);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.context, requestCode, intent, 201326592);
        Intent showIntent = new Intent(this.context, (Class<?>) FajrAlarmActivity.class);
        showIntent.setFlags(335544320);
        PendingIntent showPendingIntent = PendingIntent.getActivity(this.context, requestCode + 10, showIntent, 201326592);
        if (Build.VERSION.SDK_INT >= 31) {
            if (this.alarmManager.canScheduleExactAlarms()) {
                AlarmManager.AlarmClockInfo alarmClockInfo = new AlarmManager.AlarmClockInfo(triggerAtMillis, showPendingIntent);
                this.alarmManager.setAlarmClock(alarmClockInfo, pendingIntent);
                return;
            } else {
                this.alarmManager.setAndAllowWhileIdle(0, triggerAtMillis, pendingIntent);
                return;
            }
        }
        AlarmManager.AlarmClockInfo alarmClockInfo2 = new AlarmManager.AlarmClockInfo(triggerAtMillis, showPendingIntent);
        this.alarmManager.setAlarmClock(alarmClockInfo2, pendingIntent);
    }

    public final void cancelAllAlarms() {
        Intent intent = new Intent(this.context, (Class<?>) FajrAlarmReceiver.class);
        intent.setAction(ACTION_FAJR_ALARM);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.context, ALARM_REQUEST_CODE, intent, 603979776);
        if (pendingIntent != null) {
            this.alarmManager.cancel(pendingIntent);
            pendingIntent.cancel();
        }
        PendingIntent snoozeIntent = PendingIntent.getBroadcast(this.context, SNOOZE_REQUEST_CODE, intent, 603979776);
        if (snoozeIntent != null) {
            this.alarmManager.cancel(snoozeIntent);
            snoozeIntent.cancel();
        }
    }
}

