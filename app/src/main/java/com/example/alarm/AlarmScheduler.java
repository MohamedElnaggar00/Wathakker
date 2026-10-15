package com.example.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.example.data.Dhikr;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AlarmScheduler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ(\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/alarm/AlarmScheduler;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "alarmManager", "Landroid/app/AlarmManager;", "schedule", "", "dhikr", "Lcom/example/data/Dhikr;", "scheduleSnooze", "id", "", "title", "", "content", "minutes", "cancel", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AlarmScheduler {
    private static final int MAX_TIMES_PER_DHIKR = 20;
    private static final String TAG = "AlarmScheduler";
    private final AlarmManager alarmManager;
    private final Context context;
    public static final int $stable = 8;

    public AlarmScheduler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = this.context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
    }

    public final void schedule(Dhikr dhikr) {
        Iterable iterable;
        int i;
        Iterator it;
        AlarmScheduler alarmScheduler = this;
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        if (alarmScheduler.alarmManager == null) {
            return;
        }
        cancel(dhikr);
        Iterable reminderTimes = dhikr.getReminderTimes();
        int i2 = 0;
        int i3 = 0;
        Iterator it2 = reminderTimes.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i5 = i3;
            List split$default = StringsKt.split((CharSequence) next, new String[]{":"}, false, 0);
            if (split$default.size() != 2) {
                iterable = reminderTimes;
                i = i2;
                it = it2;
            } else {
                Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
                if (intOrNull == null) {
                    iterable = reminderTimes;
                    i = i2;
                    it = it2;
                } else {
                    int intValue = intOrNull.intValue();
                    Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
                    if (intOrNull2 == null) {
                        iterable = reminderTimes;
                        i = i2;
                        it = it2;
                    } else {
                        int intValue2 = intOrNull2.intValue();
                        Intent intent = new Intent(alarmScheduler.context, (Class<?>) AlarmReceiver.class);
                        iterable = reminderTimes;
                        intent.putExtra("DHIKR_ID", dhikr.getId());
                        intent.putExtra("DHIKR_TITLE", dhikr.getTitle());
                        intent.putExtra("DHIKR_CONTENT", dhikr.getContent());
                        PendingIntent broadcast = PendingIntent.getBroadcast(alarmScheduler.context, (dhikr.getId() * 100) + i5, intent, 201326592);
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(11, intValue);
                        calendar.set(12, intValue2);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        if (calendar.before(Calendar.getInstance())) {
                            calendar.add(5, 1);
                        }
                        try {
                            int i6 = Build.VERSION.SDK_INT;
                            AlarmManager alarmManager = alarmScheduler.alarmManager;
                            if (i6 >= 31) {
                                boolean canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                                AlarmManager alarmManager2 = alarmScheduler.alarmManager;
                                if (canScheduleExactAlarms) {
                                    i = i2;
                                    it = it2;
                                    try {
                                    } catch (Exception e) {
                                        e = e;
                                        Log.e(TAG, "Error scheduling alarm for Dhikr id=" + dhikr.getId(), e);
                                        try {
                                            try {
                                                alarmScheduler.alarmManager.setAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                                                Unit unit = Unit.INSTANCE;
                                            } catch (Exception e2) {
                                                e = e2;
                                                Integer.valueOf(Log.e(TAG, "Fallback alarm scheduling failed", e));
                                                alarmScheduler = this;
                                                i3 = i4;
                                                i2 = i;
                                                it2 = it;
                                                reminderTimes = iterable;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                        alarmScheduler = this;
                                        i3 = i4;
                                        i2 = i;
                                        it2 = it;
                                        reminderTimes = iterable;
                                    }
                                    try {
                                        alarmManager2.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                                    } catch (Exception e4) {
                                        e = e4;
                                        Log.e(TAG, "Error scheduling alarm for Dhikr id=" + dhikr.getId(), e);
                                        alarmScheduler.alarmManager.setAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                                        Unit unit2 = Unit.INSTANCE;
                                        alarmScheduler = this;
                                        i3 = i4;
                                        i2 = i;
                                        it2 = it;
                                        reminderTimes = iterable;
                                    }
                                } else {
                                    i = i2;
                                    it = it2;
                                    alarmManager2.setAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                                }
                            } else {
                                i = i2;
                                it = it2;
                                alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                            }
                            Unit unit3 = Unit.INSTANCE;
                        } catch (Exception e5) {
                            e = e5;
                            i = i2;
                            it = it2;
                        }
                    }
                }
            }
            alarmScheduler = this;
            i3 = i4;
            i2 = i;
            it2 = it;
            reminderTimes = iterable;
        }
    }

    public static /* synthetic */ void scheduleSnooze$default(AlarmScheduler alarmScheduler, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 10;
        }
        alarmScheduler.scheduleSnooze(i, str, str2, i2);
    }

    public final void scheduleSnooze(int id, String title, String content, int minutes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.alarmManager == null) {
            return;
        }
        long triggerAtMillis = System.currentTimeMillis() + (minutes * 60 * 1000);
        Intent intent = new Intent(this.context, (Class<?>) AlarmReceiver.class);
        intent.putExtra("DHIKR_ID", id);
        intent.putExtra("DHIKR_TITLE", title);
        intent.putExtra("DHIKR_CONTENT", content);
        intent.putExtra("IS_SNOOZE", true);
        int requestCode = (id * 100) + 99;
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.context, requestCode, intent, 201326592);
        try {
            int i = Build.VERSION.SDK_INT;
            AlarmManager alarmManager = this.alarmManager;
            if (i >= 31) {
                boolean canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                AlarmManager alarmManager2 = this.alarmManager;
                if (canScheduleExactAlarms) {
                    alarmManager2.setExactAndAllowWhileIdle(0, triggerAtMillis, pendingIntent);
                } else {
                    alarmManager2.setAndAllowWhileIdle(0, triggerAtMillis, pendingIntent);
                }
            } else {
                alarmManager.setExactAndAllowWhileIdle(0, triggerAtMillis, pendingIntent);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error scheduling snooze alarm for Dhikr id=" + id, e);
        }
    }

    public final void cancel(Dhikr dhikr) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        if (this.alarmManager == null) {
            return;
        }
        for (int index = 0; index < 20; index++) {
            Intent intent = new Intent(this.context, (Class<?>) AlarmReceiver.class);
            int requestCode = (dhikr.getId() * 100) + index;
            PendingIntent pendingIntent = PendingIntent.getBroadcast(this.context, requestCode, intent, 603979776);
            if (pendingIntent != null) {
                this.alarmManager.cancel(pendingIntent);
                pendingIntent.cancel();
            }
        }
    }
}
