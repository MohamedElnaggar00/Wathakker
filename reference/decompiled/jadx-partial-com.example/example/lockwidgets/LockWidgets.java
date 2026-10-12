package com.example.lockwidgets;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes15.dex */
public class LockWidgets extends AppWidgetProvider {
    private static final Class<?>[] TYPES = {Day.class, Tasbih.class, Hijri.class, Gregorian.class, Next.class, Bar.class, Countdown.class, CountdownClean.class};
    private static SharedPreferences.OnSharedPreferenceChangeListener languageListener;

    /* loaded from: classes15.dex */
    public static class Bar extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class Countdown extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class CountdownClean extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class Day extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class Gregorian extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class Hijri extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class Next extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class Prayers extends LockWidgets {
    }

    /* loaded from: classes15.dex */
    public static class Tasbih extends LockWidgets {
    }

    private static String action(Context context, String str) {
        return context.getPackageName() + ".lockwidgets." + str;
    }

    private static int res(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str2, str, context.getPackageName());
    }

    private static boolean arabic(Context context) {
        return context.getSharedPreferences("app_prefs", 0).getString("language", "ar").startsWith("ar");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$watchLanguage$0(Context context, SharedPreferences sharedPreferences, String str) {
        if ("language".equals(str)) {
            updateAll(context);
        }
    }

    private static void watchLanguage(Context context) {
        if (languageListener == null) {
            final Context applicationContext = context.getApplicationContext();
            languageListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.example.lockwidgets.LockWidgets$$ExternalSyntheticLambda0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    LockWidgets.lambda$watchLanguage$0(applicationContext, sharedPreferences, str);
                }
            };
            applicationContext.getSharedPreferences("app_prefs", 0).registerOnSharedPreferenceChangeListener(languageListener);
        }
    }

    private static Locale locale(Context context) {
        return arabic(context) ? new Locale("ar") : Locale.ENGLISH;
    }

    private static PendingIntent pulse(Context context) {
        return PendingIntent.getBroadcast(context, 700001, new Intent(context, (Class<?>) LockWidgets.class).setAction(action(context, "TICK")), 201326592);
    }

    private static boolean active(Context context) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        for (Class<?> cls : TYPES) {
            if (appWidgetManager.getAppWidgetIds(new ComponentName(context, cls)).length > 0) {
                return true;
            }
        }
        return false;
    }

    private static void schedule(Context context) {
        watchLanguage(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (active(context)) {
            alarmManager.setInexactRepeating(1, System.currentTimeMillis() + 60000, 60000L, pulse(context));
        } else {
            alarmManager.cancel(pulse(context));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            update(context, appWidgetManager, i, getClass());
        }
        schedule(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        schedule(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        schedule(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        for (int i : iArr) {
            context.getSharedPreferences("lock_tasbih", 0).edit().remove("count_" + i).apply();
        }
        schedule(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        update(context, appWidgetManager, i, getClass());
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action(context, "TAP").equals(action)) {
            int intExtra = intent.getIntExtra("appWidgetId", -1);
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
            if (appWidgetInfo == null || !appWidgetInfo.provider.equals(new ComponentName(context, (Class<?>) Tasbih.class))) {
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("lock_tasbih", 0);
            String str = "count_" + intExtra;
            sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
            update(context, AppWidgetManager.getInstance(context), intExtra, Tasbih.class);
            return;
        }
        if (action(context, "TICK").equals(action) || "android.intent.action.BOOT_COMPLETED".equals(action) || "android.intent.action.TIME_SET".equals(action) || "android.intent.action.TIMEZONE_CHANGED".equals(action) || "android.intent.action.DATE_CHANGED".equals(action) || "android.intent.action.MY_PACKAGE_REPLACED".equals(action)) {
            updateAll(context);
            schedule(context);
        } else {
            super.onReceive(context, intent);
        }
    }

    public static void updateAll(Context context) {
        watchLanguage(context);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        for (Class<?> cls : TYPES) {
            for (int i : appWidgetManager.getAppWidgetIds(new ComponentName(context, cls))) {
                update(context, appWidgetManager, i, cls);
            }
        }
    }

    private static void update(Context context, AppWidgetManager appWidgetManager, int i, Class<?> cls) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), res(context, "layout", "lock_widget_image"));
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
        int i2 = appWidgetOptions.getInt("appWidgetMinWidth", 123);
        remoteViews.setImageViewBitmap(res(context, "id", "lock_widget_art"), renderSize(context, cls, i, i2 > 0 && appWidgetOptions.getInt("appWidgetMaxWidth", i2) <= 80 && (cls == Hijri.class || cls == Gregorian.class || cls == Next.class)));
        remoteViews.setInt(res(context, "id", "lock_widget_art"), "setLayoutDirection", arabic(context) ? 1 : 0);
        remoteViews.setOnClickPendingIntent(res(context, "id", "lock_widget_art"), null);
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    private static long[] times(Context context, Calendar calendar) throws Exception {
        Class<?> cls = Class.forName("com.example.fajr.data.FajrPreferences");
        Object newInstance = cls.getConstructor(Context.class).newInstance(context);
        double doubleValue = ((Double) cls.getMethod("getLatitude", new Class[0]).invoke(newInstance, new Object[0])).doubleValue();
        double doubleValue2 = ((Double) cls.getMethod("getLongitude", new Class[0]).invoke(newInstance, new Object[0])).doubleValue();
        int intValue = ((Integer) cls.getMethod("getCalculationMethodId", new Class[0]).invoke(newInstance, new Object[0])).intValue();
        Class<?> cls2 = Class.forName("com.example.fajr.calculation.CalculationMethod");
        Object obj = cls2.getField("Companion").get(null);
        Object invoke = obj.getClass().getMethod("fromId", Integer.TYPE).invoke(obj, Integer.valueOf(intValue));
        Class<?> cls3 = Class.forName("com.example.fajr.calculation.PrayerTimesCalculator");
        Object invoke2 = cls3.getMethod("calculateAll", Calendar.class, Double.TYPE, Double.TYPE, cls2).invoke(cls3.getField("INSTANCE").get(null), calendar, Double.valueOf(doubleValue), Double.valueOf(doubleValue2), invoke);
        String[] strArr = {"getFajr", "getSunrise", "getDhuhr", "getAsr", "getMaghrib", "getIsha"};
        long[] jArr = new long[6];
        for (int i = 0; i < 6; i++) {
            jArr[i] = ((Long) invoke2.getClass().getMethod(strArr[i], new Class[0]).invoke(invoke2, new Object[0])).longValue();
        }
        return jArr;
    }

    private static String time(long j, Locale locale) {
        return HomeWidgets.tm(j, locale.getLanguage().equals("ar"));
    }

    private static String number(long j, Locale locale) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
        integerInstance.setGroupingUsed(false);
        return integerInstance.format(j);
    }

    private static Typeface font(Context context, String str) {
        return Typeface.createFromAsset(context.getAssets(), "lockfonts/" + str + ".ttf");
    }

    private static TextPaint paint(Typeface typeface, float f, float f2, int i) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f * f2);
        textPaint.setColor(i);
        textPaint.setShadowLayer(3.0f * f2, 0.0f, f2, 1711276032);
        return textPaint;
    }

    private static void lines(Canvas canvas, int i, int i2, float f, String[] strArr, float[] fArr, Typeface[] typefaceArr) {
        int length = strArr.length;
        StaticLayout[] staticLayoutArr = new StaticLayout[length];
        float f2 = 0.0f;
        int i3 = 0;
        while (i3 < strArr.length) {
            TextPaint paint = paint(typefaceArr[i3], fArr[i3], f, i3 == 0 ? -1 : -419430401);
            float measureText = paint.measureText(strArr[i3]);
            float f3 = i - (4.0f * f);
            if (measureText > f3) {
                paint.setTextSize((paint.getTextSize() * f3) / measureText);
            }
            staticLayoutArr[i3] = StaticLayout.Builder.obtain(strArr[i3], 0, strArr[i3].length(), paint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).build();
            f2 += staticLayoutArr[i3].getHeight();
            i3++;
        }
        float max = Math.max(0.0f, (i2 - (f2 + (((strArr.length - 1) * 2) * f))) / 2.0f);
        for (int i4 = 0; i4 < length; i4++) {
            StaticLayout staticLayout = staticLayoutArr[i4];
            canvas.save();
            canvas.translate(0.0f, max);
            staticLayout.draw(canvas);
            canvas.restore();
            max += staticLayout.getHeight() + (f * 2.0f);
        }
    }

    public static Bitmap render(Context context, Class<?> cls, int i) {
        return renderSize(context, cls, i, false);
    }

    private static void centered(Canvas canvas, String str, float f, float f2, TextPaint textPaint, float f3) {
        float measureText = textPaint.measureText(str);
        if (measureText > f3) {
            textPaint.setTextSize((textPaint.getTextSize() * f3) / measureText);
        }
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, (int) f3).setAlignment(Layout.Alignment.ALIGN_CENTER).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setIncludePad(false).build();
        canvas.save();
        canvas.translate(f - (f3 / 2.0f), f2 - (build.getHeight() / 2.0f));
        build.draw(canvas);
        canvas.restore();
    }

    public static long[] iqamaWindow(long[] jArr, long[] jArr2, long j) {
        int[] iArr = {25, 0, 20, 15, 10, 15};
        for (int i = 5; i >= 0; i--) {
            if (i != 1 && jArr[i] <= j && j < jArr[i] + (iArr[i] * 60000)) {
                return new long[]{i, jArr[i], jArr[i] + (iArr[i] * 60000)};
            }
        }
        if (jArr2 == null || jArr2[5] > j || j >= jArr2[5] + 900000) {
            return null;
        }
        return new long[]{5, jArr2[5], jArr2[5] + 900000};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x047e, code lost:
    
        if (r13 == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0480, code lost:
    
        r0 = "الإقامة";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0488, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x048b, code lost:
    
        if (r41 != com.example.lockwidgets.LockWidgets.Prayers.class) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x048d, code lost:
    
        r1 = 0;
        r9 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0493, code lost:
    
        r0 = new int[]{0, 2, 3, 4, 5};
        r8 = r4;
        r19 = (r8 - (r11 * 2.0f)) / 5.0f;
        r10 = 0;
        r13 = r13;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04a1, code lost:
    
        if (r10 >= r9) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04a3, code lost:
    
        r12 = r0[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04a5, code lost:
    
        if (r13 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04a7, code lost:
    
        r20 = (r8 - r11) - ((r10 + 0.5f) * r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04bc, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04cc, code lost:
    
        r22 = r19 - (r6 * 1.0f);
        r1 = r2;
        r2 = r11;
        r7 = r17;
        r40 = r0;
        r27 = 0;
        r22 = r13;
        r9 = r20;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04eb, code lost:
    
        centered(r7, r32[r12], r9, 20.0f * r6, paint(r14, 7.0f, r6, -1), r22);
        centered(r7, time(r1[r12], r3), r9, r6 * 34.0f, paint(r15, 8.0f, r6, -1), r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04ff, code lost:
    
        if (r12 != r5) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0501, code lost:
    
        r0 = new android.graphics.Paint(1);
        r0.setColor(-1);
        r10 = 0.35f * r19;
        r7.drawRoundRect(new android.graphics.RectF(r9 - r10, 41.0f * r6, r9 + r10, 42.5f * r6), r6, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0520, code lost:
    
        r10 = r20 + 1;
        r0 = r40;
        r11 = r2;
        r8 = r1;
        r13 = r22;
        r9 = 5;
        r2 = r1;
        r17 = r7;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x07b9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x07ba, code lost:
    
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0532, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x07be, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04b3, code lost:
    
        r20 = r11 + ((r10 + 0.5f) * r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0537, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0538, code lost:
    
        r27 = r1;
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0540, code lost:
    
        r22 = r13 == true ? 1 : 0;
        r7 = r17;
        r13 = -1;
        r27 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0550, code lost:
    
        if (r41 == com.example.lockwidgets.LockWidgets.Countdown.class) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0554, code lost:
    
        if (r41 != com.example.lockwidgets.LockWidgets.CountdownClean.class) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0556, code lost:
    
        r38 = r28;
        r28 = r9;
        r9 = r38;
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x06b7, code lost:
    
        r0 = r4;
        r5 = r6 * 25.0f;
        r22 = r9;
        r10 = r6 * 12.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x06c6, code lost:
    
        centered(r7, r8, (r0 - r11) - r5, r10, paint(r15, 13.0f, r6, -1), 48.0f * r6);
        centered(r7, time(r22, r3), r11 + (26.0f * r6), r10, paint(r14, 12.0f, r6, -1), 54.0f * r6);
        r3 = new android.graphics.Paint(1);
        r12 = r0 - (r11 * 2.0f);
        r8 = 3.0f * r6;
        r3.setColor(1090519039);
        r11 = r11 + r12;
        r10 = r5 + r8;
        r0 = r8 / 2.0f;
        r7.drawRoundRect(new android.graphics.RectF(r11, r5, r11, r10), r0, r0, r3);
        r1 = java.lang.Math.max(r8, r12 * java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, ((float) (r28 - r30)) / ((float) java.lang.Math.max(1L, r22 - r30)))));
        r3.setColor(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x073d, code lost:
    
        if (r13 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x073f, code lost:
    
        r11 = r11 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0744, code lost:
    
        if (r13 == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0746, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x074b, code lost:
    
        r7.drawRoundRect(new android.graphics.RectF(r11, r5, r1, r10), r0, r0, r3);
        r0 = java.lang.Math.max(0L, (r22 - r28) / 60000);
        r0 = java.lang.String.format(java.util.Locale.ENGLISH, "%02d:%02d", java.lang.Long.valueOf(r0 / 60), java.lang.Long.valueOf(r0 % 60));
        r1 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x077f, code lost:
    
        if (r41 != com.example.lockwidgets.LockWidgets.Countdown.class) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0781, code lost:
    
        if (r13 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0783, code lost:
    
        r2 = "متبقي: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x078b, code lost:
    
        centered(r7, r1.append(r2).append("\u2066").append(r0).append("\u2069").toString(), r0 / 2.0f, r6 * 41.0f, paint(r14, 12.0f, r6, -1), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0786, code lost:
    
        r2 = "Remaining: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0789, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0749, code lost:
    
        r1 = r11 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0742, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0562, code lost:
    
        if (r41 != com.example.lockwidgets.LockWidgets.Bar.class) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0564, code lost:
    
        r0 = r4;
        r9 = r0 / 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x056b, code lost:
    
        r12 = r0 - (r11 * 2.0f);
        r0 = r28;
        centered(r7, r8, r9, r6 * 13.0f, paint(r15, 13.0f, r6, -1), r12);
        centered(r7, time(r0, r3), r9, r6 * 42.0f, paint(r14, 12.0f, r6, -1), r12);
        r3 = new android.graphics.Paint(1);
        r5 = 26.0f * r6;
        r8 = 4.0f * r6;
        r3.setColor(1090519039);
        r11 = r11 + r12;
        r10 = r5 + r8;
        r15 = r8 / 2.0f;
        r7.drawRoundRect(new android.graphics.RectF(r11, r5, r11, r10), r15, r15, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x05b2, code lost:
    
        r0 = java.lang.Math.max(r8, r12 * java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, ((float) (r9 - r30)) / ((float) java.lang.Math.max(1L, r0 - r30)))));
        r3.setColor(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x05ce, code lost:
    
        if (r22 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x05d0, code lost:
    
        r8 = r11 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x05d4, code lost:
    
        if (r22 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x05d9, code lost:
    
        r7.drawRoundRect(new android.graphics.RectF(r8, r5, r11, r10), r15, r15, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x05d7, code lost:
    
        r11 = r11 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x05d3, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05e6, code lost:
    
        r25 = r14;
        r0 = r28;
        r9 = java.lang.Math.max(0L, (r0 - r9) / 60000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05fb, code lost:
    
        if (r9 < 60) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05fd, code lost:
    
        r2 = new java.lang.StringBuilder().append(number(r9 / 60, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x060c, code lost:
    
        if (r22 == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x060e, code lost:
    
        r5 = " ساعات ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0613, code lost:
    
        r2 = r2.append(r5).append(number(r9 % 60, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0621, code lost:
    
        if (r22 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0623, code lost:
    
        r5 = " دقيقة";
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0628, code lost:
    
        r2 = r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0645, code lost:
    
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0649, code lost:
    
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x064b, code lost:
    
        r5 = com.example.lockwidgets.HomeWidgets.remaining(r9, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x064f, code lost:
    
        if (r43 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0651, code lost:
    
        r0 = new java.lang.String[]{r8, time(r0, r3), r2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0677, code lost:
    
        if (r43 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0679, code lost:
    
        r1 = new float[]{12.0f, 11.0f, 9.0f};
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0686, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0687, code lost:
    
        if (r43 == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0689, code lost:
    
        r14 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x068b, code lost:
    
        r1 = new android.graphics.Typeface[]{r15, r14, r14};
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x069b, code lost:
    
        lines(r7, r4, r21, r6, r0, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x06a0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x06a1, code lost:
    
        r7 = r7;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0690, code lost:
    
        r14 = r25;
        r1 = new android.graphics.Typeface[]{r15, r14};
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0680, code lost:
    
        r1 = new float[]{13.0f, 9.0f};
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x065a, code lost:
    
        r0 = new java.lang.String[]{r8 + " " + time(r0, r3), r5};
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x06a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06ab, code lost:
    
        r14 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0626, code lost:
    
        r5 = " minutes";
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0611, code lost:
    
        r5 = " hours ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x062d, code lost:
    
        r2 = new java.lang.StringBuilder().append(number(r9, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x063a, code lost:
    
        if (r22 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x063c, code lost:
    
        r5 = " دقيقة";
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0641, code lost:
    
        r2 = r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x063f, code lost:
    
        r5 = "m";
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x06a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x06a9, code lost:
    
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x06af, code lost:
    
        r38 = r28;
        r28 = r9;
        r9 = r38;
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x07b7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0483, code lost:
    
        r0 = "Iqama";
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0486, code lost:
    
        r0 = r32[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x044f, code lost:
    
        r7 = (java.util.Calendar) r2.clone();
        r42 = r2;
        r32 = r5;
        r7.add(5, -1);
        r0 = iqamaWindow(r8, times(r40, r7), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0466, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0468, code lost:
    
        r2 = r8;
        r5 = (int) r0[0];
        r30 = r0[1];
        r28 = r0[2];
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0478, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0430, code lost:
    
        r32 = "Fajr";
        r33 = "Sunrise";
        r34 = "Dhuhr";
        r35 = "Asr";
        r36 = "Maghrib";
        r37 = "Isha";
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0405, code lost:
    
        r5 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x040a, code lost:
    
        r5 = (java.util.Calendar) r2.clone();
        r5.add(5, -1);
        r2 = r2;
        r30 = times(r40, r5)[5];
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03dc, code lost:
    
        r2 = (java.util.Calendar) r2.clone();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03e2, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03e6, code lost:
    
        r2.add(5, 1);
        r28 = times(r40, r2)[0];
        r30 = r8[5];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x07bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03da, code lost:
    
        if (r2 >= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03fa, code lost:
    
        r17 = r7;
        r28 = r8[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03fe, code lost:
    
        if (r2 <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0401, code lost:
    
        if (r2 != 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0403, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0407, code lost:
    
        r30 = r8[r5];
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0421, code lost:
    
        if (r13 == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0423, code lost:
    
        r32 = "الفجر";
        r33 = "الشروق";
        r34 = "الظهر";
        r35 = "العصر";
        r36 = "المغرب";
        r37 = "العشاء";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x043c, code lost:
    
        r5 = new java.lang.String[]{r32, r33, r34, r35, r36, r37};
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0442, code lost:
    
        if (r41 == com.example.lockwidgets.LockWidgets.Bar.class) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0446, code lost:
    
        if (r41 != com.example.lockwidgets.LockWidgets.Next.class) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0449, code lost:
    
        r42 = r2;
        r32 = r5;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0479, code lost:
    
        r5 = r42;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x047c, code lost:
    
        if (r0 == false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07d2  */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap renderSize(android.content.Context r40, java.lang.Class<?> r41, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.lockwidgets.LockWidgets.renderSize(android.content.Context, java.lang.Class, int, boolean):android.graphics.Bitmap");
    }
}
