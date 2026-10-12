package com.example.lockwidgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.icu.util.IslamicCalendar;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.widget.RemoteViews;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class HomeWidgets {
    static volatile Typeface boldFace;
    static volatile Typeface regularFace;
    public static boolean openPrayer = false;
    static final ThreadLocal<State> batchState = new ThreadLocal<>();

    public static int initialPage() {
        return 0;
    }

    public static boolean handleIntent(Intent intent) {
        openPrayer = intent != null && "com.wathakker.locktest.OPEN_PRAYER".equals(intent.getAction());
        return openPrayer;
    }

    static int res(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str2, str, context.getPackageName());
    }

    static PendingIntent open(Context context, boolean z) {
        return PendingIntent.getActivity(context, z ? 91212 : 91213, new Intent().setClassName(context.getPackageName(), "com.example.MainActivity").setAction(z ? "com.wathakker.locktest.OPEN_PRAYER" : "android.intent.action.MAIN").setFlags(603979776), 201326592);
    }

    public static synchronized void updateAll(Context context) {
        synchronized (HomeWidgets.class) {
            try {
                batchState.set(state(context));
            } catch (Exception e) {
            }
            try {
                updateBatch(context);
            } finally {
                batchState.remove();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:6|(3:7|8|9)|(3:49|50|(1:52)(20:53|(1:55)(3:56|(1:61)|62)|12|(1:14)|15|16|17|(1:19)(1:45)|20|21|22|23|24|25|(1:27)(1:37)|28|(1:36)(1:32)|33|34|35))|11|12|(0)|15|16|17|(0)(0)|20|21|22|23|24|25|(0)(0)|28|(1:30)|36|33|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void updateBatch(Context context) {
        String str;
        String[] strArr;
        int i;
        int[] iArr;
        int i2;
        Bundle appWidgetOptions;
        int i3;
        String str2 = "Hero";
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        String[] strArr2 = {"Hero", "HeroLarge", "NextPrayer", "PrayerBar", "Schedule", "DayPrayer", "Pill", "Clock", "Hijri", "Gregorian"};
        int i4 = 0;
        while (i4 < 10) {
            String str3 = strArr2[i4];
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, "com.example.widget." + str3 + "WidgetProvider"));
            int length = appWidgetIds.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = appWidgetIds[i5];
                try {
                    appWidgetOptions = appWidgetManager.getAppWidgetOptions(i6);
                    strArr = strArr2;
                } catch (Exception e) {
                    e = e;
                    str = str2;
                    strArr = strArr2;
                }
                if (!str3.startsWith(str2)) {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        str = str2;
                        i = i4;
                        iArr = appWidgetIds;
                        i2 = length;
                        Log.e("WathakkerHome", "Update failed: " + str3, e);
                        i5++;
                        strArr2 = strArr;
                        appWidgetIds = iArr;
                        i4 = i;
                        str2 = str;
                        length = i2;
                    }
                    if (!str3.equals("Schedule")) {
                        if (str3.equals("Clock")) {
                            i3 = 250;
                        } else {
                            if (!str3.equals("Hijri") && !str3.equals("Gregorian")) {
                                i3 = 110;
                            }
                            i3 = 90;
                        }
                        i = i4;
                        int i7 = str3.equals("HeroLarge") ? 160 : 90;
                        iArr = appWidgetIds;
                        int max = Math.max(50, appWidgetOptions.getInt("appWidgetMinWidth", i3));
                        str = str2;
                        int max2 = Math.max(!str3.equals(str2) ? 40 : 60, appWidgetOptions.getInt("appWidgetMinHeight", i7));
                        i2 = length;
                        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), res(context, "layout", "home_prayer_art"));
                        remoteViews.setImageViewBitmap(res(context, "id", "home_prayer_image"), renderKind(context, !str3.equals("HeroLarge") ? str : str3, max, max2));
                        remoteViews.setOnClickPendingIntent(res(context, "id", "home_prayer_image"), open(context, str3.equals("Hijri") && !str3.equals("Gregorian")));
                        appWidgetManager.updateAppWidget(i6, remoteViews);
                        i5++;
                        strArr2 = strArr;
                        appWidgetIds = iArr;
                        i4 = i;
                        str2 = str;
                        length = i2;
                    }
                }
                i3 = 330;
                i = i4;
                int i72 = str3.equals("HeroLarge") ? 160 : 90;
                iArr = appWidgetIds;
                int max3 = Math.max(50, appWidgetOptions.getInt("appWidgetMinWidth", i3));
                str = str2;
                int max22 = Math.max(!str3.equals(str2) ? 40 : 60, appWidgetOptions.getInt("appWidgetMinHeight", i72));
                i2 = length;
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), res(context, "layout", "home_prayer_art"));
                remoteViews2.setImageViewBitmap(res(context, "id", "home_prayer_image"), renderKind(context, !str3.equals("HeroLarge") ? str : str3, max3, max22));
                remoteViews2.setOnClickPendingIntent(res(context, "id", "home_prayer_image"), open(context, str3.equals("Hijri") && !str3.equals("Gregorian")));
                appWidgetManager.updateAppWidget(i6, remoteViews2);
                i5++;
                strArr2 = strArr;
                appWidgetIds = iArr;
                i4 = i;
                str2 = str;
                length = i2;
            }
            i4++;
        }
    }

    static long[] times(Context context, Calendar calendar) throws Exception {
        Method declaredMethod = LockWidgets.class.getDeclaredMethod("times", Context.class, Calendar.class);
        declaredMethod.setAccessible(true);
        return (long[]) declaredMethod.invoke(null, context, calendar);
    }

    static boolean ar(Context context) {
        return context.getSharedPreferences("app_prefs", 0).getString("language", "ar").startsWith("ar");
    }

    static Typeface face(Context context, boolean z) {
        Typeface typeface = z ? boldFace : regularFace;
        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), "homefonts/expoarabic_" + (z ? "semibold" : "medium") + ".ttf");
            if (z) {
                boldFace = typeface;
            } else {
                regularFace = typeface;
            }
        }
        return typeface;
    }

    static void text(Canvas canvas, String str, float f, float f2, float f3, float f4, Typeface typeface, int i, Layout.Alignment alignment, float f5) {
        StaticLayout build;
        Layout.Alignment alignment2 = alignment;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f4 * f5);
        textPaint.setColor(i);
        while (textPaint.measureText(str) > Math.max(1.0f, f3 - 2.0f) * f5 && textPaint.getTextSize() > f5 * 6.0f) {
            textPaint.setTextSize(textPaint.getTextSize() - (0.25f * f5));
        }
        if (TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(str, 0, str.length())) {
            if (alignment2 == Layout.Alignment.ALIGN_NORMAL) {
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (alignment2 == Layout.Alignment.ALIGN_OPPOSITE) {
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
            }
        }
        int i2 = (int) (f3 * f5);
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, Math.max(1, i2)).setAlignment(alignment2).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setIncludePad(false);
        while (true) {
            build = includePad.setMaxLines(2).build();
            if (build.getLineCount() <= 1 || textPaint.getTextSize() <= f5 * 6.0f) {
                break;
            }
            textPaint.setTextSize(textPaint.getTextSize() - (f5 * 0.25f));
            includePad = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, Math.max(1, i2)).setAlignment(alignment2).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setIncludePad(false);
        }
        canvas.save();
        canvas.translate(f * f5, (f2 * f5) - (build.getHeight() / 2.0f));
        build.draw(canvas);
        canvas.restore();
    }

    static void heroText(Canvas canvas, String str, float f, float f2, float f3, float f4, Typeface typeface, int i, Layout.Alignment alignment, float f5) {
        float f6;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f4 * f5);
        textPaint.setColor(i);
        while (true) {
            f6 = f3 * f5;
            if (textPaint.measureText(str) <= f6 || textPaint.getTextSize() <= 8.0f * f5 * Math.min(1.0f, f4 / 12.0f)) {
                break;
            } else {
                textPaint.setTextSize(textPaint.getTextSize() - (0.5f * f5));
            }
        }
        if (TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(str, 0, str.length())) {
            if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
        }
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, Math.max(1, (int) f6)).setAlignment(alignment).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setIncludePad(false).setMaxLines(1).build();
        canvas.save();
        canvas.translate(f * f5, (f2 * f5) - (build.getHeight() / 2.0f));
        build.draw(canvas);
        canvas.restore();
    }

    public static String tm(long j, boolean z) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        StringBuilder append = new StringBuilder().append("\u2066").append(new SimpleDateFormat("h:mm", Locale.ENGLISH).format(new Date(j))).append("\u2069 ");
        int i = calendar.get(9);
        return append.append(z ? i == 0 ? "ص" : "م" : i == 0 ? "AM" : "PM").toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes15.dex */
    public static final class State {
        boolean arabic;
        long at;
        String city;
        String day;
        String gday;
        String gmonth;
        String greg;
        String gyear;
        String hday;
        String hijri;
        String hmonth;
        String hyear;
        String[] names;
        int next;
        long now = System.currentTimeMillis();
        long prev;
        int previous;
        long[] ts;

        State() {
        }
    }

    public static String remaining(long j, boolean z) {
        StringBuilder append;
        String str;
        if (z) {
            append = new StringBuilder().append("المتبقي ").append(j / 60).append(" ساعات و ").append(j % 60);
            str = " دقيقة";
        } else {
            append = new StringBuilder().append("Remaining ").append(j / 60).append(" hours and ").append(j % 60);
            str = " minutes";
        }
        return append.append(str).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static State state(Context context) throws Exception {
        char c;
        char c2;
        long j;
        String[] strArr;
        State state = new State();
        state.arabic = ar(context);
        Locale locale = state.arabic ? new Locale("ar") : Locale.ENGLISH;
        Calendar calendar = Calendar.getInstance();
        state.ts = times(context, calendar);
        char c3 = 4;
        char c4 = 3;
        state.names = state.arabic ? new String[]{"الفجر", "الشروق", "الظهر", "العصر", "المغرب", "العشاء"} : new String[]{"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha"};
        state.next = -1;
        int i = 0;
        while (true) {
            if (i >= 6) {
                c = c3;
                c2 = c4;
                break;
            }
            if (i != 1) {
                c = c3;
                c2 = c4;
                if (state.ts[i] > state.now) {
                    state.next = i;
                    break;
                }
            } else {
                c = c3;
                c2 = c4;
            }
            i++;
            c3 = c;
            c4 = c2;
        }
        if (state.next < 0) {
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.add(5, 1);
            state.at = times(context, calendar2)[0];
            state.next = 0;
            j = state.ts[5];
        } else {
            state.at = state.ts[state.next];
            state.previous = state.next == 2 ? 0 : state.next - 1;
            if (state.next != 0) {
                state.prev = state.ts[state.previous];
                state.city = (String) Class.forName("com.example.fajr.data.FajrPreferences").getMethod("getCityName", new Class[0]).invoke(Class.forName("com.example.fajr.data.FajrPreferences").getConstructor(Context.class).newInstance(context), new Object[0]);
                state.day = new SimpleDateFormat("EEEE", locale).format(new Date());
                IslamicCalendar islamicCalendar = new IslamicCalendar();
                islamicCalendar.setCalculationType(IslamicCalendar.CalculationType.ISLAMIC_UMALQURA);
                if (state.arabic) {
                    strArr = new String[12];
                    strArr[0] = "Muharram";
                    strArr[1] = "Safar";
                    strArr[2] = "Rabi I";
                    strArr[c2] = "Rabi II";
                    strArr[c] = "Jumada I";
                    strArr[5] = "Jumada II";
                    strArr[6] = "Rajab";
                    strArr[7] = "Sha'ban";
                    strArr[8] = "Ramadan";
                    strArr[9] = "Shawwal";
                    strArr[10] = "Dhul Qadah";
                    strArr[11] = "Dhul Hijjah";
                } else {
                    strArr = new String[12];
                    strArr[0] = "محرم";
                    strArr[1] = "صفر";
                    strArr[2] = "ربيع الأول";
                    strArr[c2] = "ربيع الآخر";
                    strArr[c] = "جمادى الأولى";
                    strArr[5] = "جمادى الآخرة";
                    strArr[6] = "رجب";
                    strArr[7] = "شعبان";
                    strArr[8] = "رمضان";
                    strArr[9] = "شوال";
                    strArr[10] = "ذو القعدة";
                    strArr[11] = "ذو الحجة";
                }
                state.hday = "" + islamicCalendar.get(5);
                state.hyear = "" + islamicCalendar.get(1);
                state.hmonth = strArr[islamicCalendar.get(2)];
                state.hijri = state.hday + " " + state.hmonth;
                state.greg = new SimpleDateFormat("d MMMM", locale).format(new Date());
                state.gday = new SimpleDateFormat("d", Locale.ENGLISH).format(new Date());
                state.gmonth = new SimpleDateFormat("MMMM", locale).format(new Date());
                state.gyear = "" + calendar.get(1);
                return state;
            }
            Calendar calendar3 = (Calendar) calendar.clone();
            calendar3.add(5, -1);
            j = times(context, calendar3)[5];
        }
        state.prev = j;
        state.previous = 5;
        state.city = (String) Class.forName("com.example.fajr.data.FajrPreferences").getMethod("getCityName", new Class[0]).invoke(Class.forName("com.example.fajr.data.FajrPreferences").getConstructor(Context.class).newInstance(context), new Object[0]);
        state.day = new SimpleDateFormat("EEEE", locale).format(new Date());
        IslamicCalendar islamicCalendar2 = new IslamicCalendar();
        islamicCalendar2.setCalculationType(IslamicCalendar.CalculationType.ISLAMIC_UMALQURA);
        if (state.arabic) {
        }
        state.hday = "" + islamicCalendar2.get(5);
        state.hyear = "" + islamicCalendar2.get(1);
        state.hmonth = strArr[islamicCalendar2.get(2)];
        state.hijri = state.hday + " " + state.hmonth;
        state.greg = new SimpleDateFormat("d MMMM", locale).format(new Date());
        state.gday = new SimpleDateFormat("d", Locale.ENGLISH).format(new Date());
        state.gmonth = new SimpleDateFormat("MMMM", locale).format(new Date());
        state.gyear = "" + calendar.get(1);
        return state;
    }

    static void bar(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, float f6) {
        paint.setColor(-11776946);
        float f7 = f2 * f6;
        float f8 = f3 - f;
        float f9 = f8 * f6;
        float f10 = (f2 + f4) * f6;
        float f11 = (f4 * f6) / 2.0f;
        canvas.drawRoundRect(new RectF(f * f6, f7, f9, f10), f11, f11, paint);
        float max = Math.max(f4, (f3 - (f * 2.0f)) * Math.max(0.0f, Math.min(1.0f, f5)));
        paint.setColor(-1);
        canvas.drawRoundRect(new RectF((f8 - max) * f6, f7, f9, f10), f11, f11, paint);
    }

    public static Bitmap render(Context context, int i, int i2) {
        return renderKind(context, "Hero", i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0622  */
    /* JADX WARN: Type inference failed for: r11v15, types: [float] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v22 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v12, types: [long] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v35, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap renderKind(Context context, String str, int i, int i2) {
        Bitmap bitmap;
        float f;
        ?? r5;
        int i3;
        State state;
        ?? r4;
        float f2;
        float f3;
        boolean z;
        boolean z2;
        float min;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float f9;
        State state2;
        float f10;
        float f11;
        float f12 = context.getResources().getDisplayMetrics().density;
        float f13 = i;
        float f14 = f13 * f12;
        float f15 = i2;
        float f16 = f15 * f12;
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, (int) f14), Math.max(1, (int) f16), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-15263975);
        RectF rectF = new RectF(0.0f, 0.0f, f14, f16);
        float f17 = f15 / 4.0f;
        canvas.drawRoundRect(rectF, Math.min(24.0f, f17) * f12, Math.min(24.0f, f17) * f12, paint);
        Typeface face = face(context, false);
        Typeface face2 = face(context, true);
        try {
            state = batchState.get();
            if (state == null) {
                state = state(context);
            }
            try {
                bitmap = createBitmap;
            } catch (Exception e) {
                e = e;
                f = f15;
                r5 = canvas;
                bitmap = createBitmap;
            }
        } catch (Exception e2) {
            e = e2;
            bitmap = createBitmap;
        }
        try {
            r5 = Math.max(0L, (state.at - state.now) / 60000);
            float min2 = Math.min(18.0f, f13 * 0.06f);
            float f18 = f13 - (min2 * 2.0f);
            try {
                float max = ((float) (state.now - state.prev)) / ((float) Math.max(1L, state.at - state.prev));
                String remaining = remaining(r5, state.arabic);
                try {
                    try {
                        if (str.equals("Hero")) {
                            float f19 = f15 * 0.389f;
                            float f20 = f15 * 0.57f;
                            float f21 = (i2 < 70 ? 0.78f : 0.844f) * f15;
                            float f22 = f15 * 0.133f;
                            float f23 = 0.389f * f15;
                            float f24 = 0.22f * f18;
                            try {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                                alignment2 = Layout.Alignment.ALIGN_CENTER;
                                String str2 = state.names[state.next];
                                f9 = f15 / 70.0f;
                                float min3 = Math.min(1.0f, f9) * 18.0f;
                                f = f15;
                                f12 = f12;
                                state2 = state;
                                r5 = canvas;
                                heroText(r5, str2, min2, f19, f24, min3, face, -1, alignment, f12);
                                f10 = f13 - min2;
                                f11 = f10 - f24;
                                heroText(r5, state2.names[state2.previous], f11, f19, f24, Math.min(1.0f, f9) * 18.0f, face, -1, alignment2, f12);
                                i3 = -1;
                                try {
                                    try {
                                        bar(r5, paint, min2, f20, f13, Math.min(8.0f, f * 0.09f), max, f12);
                                    } catch (Exception e3) {
                                        e = e3;
                                        f12 = f12;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                f = f15;
                                r4 = canvas;
                                f12 = f12;
                                i3 = -1;
                                r5 = r4;
                                Log.e("WathakkerHome", "Render failed", e);
                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                return bitmap;
                            }
                            try {
                                heroText(r5, tm(state2.at, state2.arabic), min2, f21, f24, Math.min(1.0f, f9) * 21.0f, face2, -1, alignment, f12);
                                heroText(r5, tm(state2.prev, state2.arabic), f11, f21, f24, Math.min(1.0f, f9) * 21.0f, face2, -1, alignment2, f12);
                                i3 = -1;
                                float f25 = f18 * 0.48f;
                                face = face;
                                heroText(r5, state2.hijri, min2, f22, f25, Math.min(1.0f, f9) * 12.0f, face, -6908258, Layout.Alignment.ALIGN_NORMAL, f12);
                                heroText(r5, state2.greg, f10 - f25, f22, f25, Math.min(1.0f, f9) * 12.0f, face, -6908258, Layout.Alignment.ALIGN_OPPOSITE, f12);
                                min2 = Float.NaN;
                                heroText(r5, remaining, min2 + (0.24f * f18), f23, f18 * 0.52f, Math.min(1.0f, f9) * 15.0f, face, -1723307, Layout.Alignment.ALIGN_CENTER, f12);
                            } catch (Exception e6) {
                                e = e6;
                                i3 = -1;
                                face = face;
                                Log.e("WathakkerHome", "Render failed", e);
                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                return bitmap;
                            }
                        } else {
                            f = f15;
                            State state3 = state;
                            float f26 = min2;
                            Typeface typeface = face2;
                            f12 = f12;
                            i3 = -1;
                            r4 = canvas;
                            try {
                                min2 = Float.NaN;
                                i4 = -3552818;
                                try {
                                } catch (Exception e7) {
                                    e = e7;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                r5 = r4;
                                Log.e("WathakkerHome", "Render failed", e);
                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                return bitmap;
                            }
                            try {
                                try {
                                    try {
                                        if (str.equals("NextPrayer")) {
                                            f2 = f26;
                                            f3 = f18;
                                            z = false;
                                        } else if (str.equals("PrayerBar")) {
                                            f2 = f26;
                                            f3 = f18;
                                            z = false;
                                        } else {
                                            r5 = str.equals("Schedule");
                                            try {
                                                try {
                                                    try {
                                                        if (r5 != 0) {
                                                            float f27 = f18 / 6.0f;
                                                            int i5 = 0;
                                                            Canvas canvas2 = r4;
                                                            Canvas canvas3 = r5;
                                                            face = face;
                                                            while (true) {
                                                                r4 = canvas2;
                                                                r5 = canvas3;
                                                                face = face;
                                                                min2 = i4;
                                                                if (i5 < 6) {
                                                                    int i6 = i5 + 1;
                                                                    try {
                                                                        float f28 = ((f13 - f26) - (i6 * f27)) + 2.0f;
                                                                        float f29 = f27 - 4.0f;
                                                                        Canvas canvas4 = canvas2;
                                                                        text(canvas4, state3.names[i5], f28, f * 0.3f, f29, 13.0f, face, i4, Layout.Alignment.ALIGN_CENTER, f12);
                                                                        Typeface typeface2 = face;
                                                                        int i7 = i4;
                                                                        text(canvas4, tm(state3.ts[i5], state3.arabic), f28, f * 0.69f, f29, 13.0f, typeface, -1, Layout.Alignment.ALIGN_CENTER, f12);
                                                                        face = typeface2;
                                                                        canvas2 = canvas4;
                                                                        i5 = i6;
                                                                        i4 = i7 == true ? 1 : 0;
                                                                        canvas3 = canvas4;
                                                                    } catch (Exception e9) {
                                                                        e = e9;
                                                                        r5 = canvas2;
                                                                        Log.e("WathakkerHome", "Render failed", e);
                                                                        text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                                        return bitmap;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            r5 = r4;
                                                            r4 = face;
                                                            try {
                                                                try {
                                                                    if (str.equals("Clock")) {
                                                                        float f30 = f18 * 0.23f;
                                                                        int i8 = 0;
                                                                        while (i8 < 2) {
                                                                            float f31 = i8 == 0 ? f26 : (f13 - f26) - f30;
                                                                            try {
                                                                                f8 = f26;
                                                                                face = r4;
                                                                            } catch (Exception e10) {
                                                                                e = e10;
                                                                                face = r4;
                                                                                Log.e("WathakkerHome", "Render failed", e);
                                                                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                return bitmap;
                                                                            }
                                                                            try {
                                                                                text(r5, state3.names[i8 == 0 ? state3.next : state3.previous], f31, f * 0.28f, f30, 13.0f, face, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                Typeface typeface3 = typeface;
                                                                                int i9 = i3;
                                                                                text(r5, tm(i8 == 0 ? state3.at : state3.prev, state3.arabic), f31, f * 0.7f, f30, 15.0f, typeface3, i9, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                i8++;
                                                                                f26 = f8;
                                                                                typeface = typeface3;
                                                                                i3 = i9;
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                                Log.e("WathakkerHome", "Render failed", e);
                                                                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                return bitmap;
                                                                            }
                                                                        }
                                                                        Typeface typeface4 = typeface;
                                                                        int i10 = i3;
                                                                        long max2 = Math.max(0L, (state3.at - state3.now) / 1000);
                                                                        text(r5, String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf(max2 / 3600), Long.valueOf((max2 / 60) % 60), Long.valueOf(max2 % 60)), f26 + f30, f * 0.5f, f18 - (f30 * 2.0f), 26.0f, typeface4, i10, Layout.Alignment.ALIGN_CENTER, f12);
                                                                        r4 = r4;
                                                                        r5 = r5;
                                                                        face = typeface4;
                                                                        min2 = i10;
                                                                    } else {
                                                                        face = typeface;
                                                                        min2 = Float.NaN;
                                                                        try {
                                                                            try {
                                                                                if (str.equals("DayPrayer")) {
                                                                                    Typeface typeface5 = r4;
                                                                                    text(r5, state3.day, f26, f * 0.33f, f18, Math.min(1.0f, f / 60.0f) * 20.0f, typeface5, -1, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                    i3 = -1;
                                                                                    StringBuilder sb = new StringBuilder();
                                                                                    String[] strArr = state3.names;
                                                                                    int i11 = state3.next;
                                                                                    min2 = Float.NaN;
                                                                                    text(r5, sb.append(strArr[i11]).append(" ").append(tm(state3.at, state3.arabic)).toString(), f26, f * 0.7f, f18, Math.min(1.0f, f / 70.0f) * 14.0f, typeface5, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                    r4 = i11;
                                                                                    r5 = r5;
                                                                                    face = typeface5;
                                                                                } else {
                                                                                    i3 = -1;
                                                                                    if (str.equals("Pill")) {
                                                                                        Typeface typeface6 = r4;
                                                                                        text(r5, (state3.arabic ? new StringBuilder().append("أذان ").append(state3.names[state3.next]) : new StringBuilder().append(state3.names[state3.next]).append(" Adhan")).toString(), f26, f * 0.32f, f18, Math.min(1.0f, f / 60.0f) * 15.0f, typeface6, -1, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                        min2 = Float.NaN;
                                                                                        text(r5, remaining, f26, f * 0.68f, f18, Math.min(1.0f, f / 70.0f) * 12.0f, typeface6, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                        r4 = r4;
                                                                                        r5 = r5;
                                                                                        face = typeface6;
                                                                                    } else {
                                                                                        boolean equals = str.equals("Hijri");
                                                                                        float f32 = f / 70.0f;
                                                                                        min2 = Float.NaN;
                                                                                        text(r5, equals ? state3.hday : state3.gday, f26, f * 0.25f, f18, Math.min(1.0f, f32) * 26.0f, face, -1, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                        Typeface typeface7 = r4;
                                                                                        text(r5, equals ? state3.hmonth : state3.gmonth, f26, 0.55f * f, f18, Math.min(1.0f, f32) * 14.0f, typeface7, -1, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                        i3 = -1;
                                                                                        min2 = Float.NaN;
                                                                                        text(r5, equals ? state3.hyear + " هـ" : state3.gyear, f26, f * 0.8f, f18, Math.min(1.0f, f32) * 12.0f, typeface7, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                        r4 = r4;
                                                                                        r5 = r5;
                                                                                        face = typeface7;
                                                                                    }
                                                                                }
                                                                            } catch (Exception e12) {
                                                                                e = e12;
                                                                                i3 = min2;
                                                                                Log.e("WathakkerHome", "Render failed", e);
                                                                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                                                return bitmap;
                                                                            }
                                                                        } catch (Exception e13) {
                                                                            e = e13;
                                                                            face = r4;
                                                                            i3 = min2;
                                                                            Log.e("WathakkerHome", "Render failed", e);
                                                                            text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                                            return bitmap;
                                                                        }
                                                                    }
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    face = r4;
                                                                    i3 = min2;
                                                                    Log.e("WathakkerHome", "Render failed", e);
                                                                    text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                                    return bitmap;
                                                                }
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                face = r4;
                                                                Log.e("WathakkerHome", "Render failed", e);
                                                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                                return bitmap;
                                                            }
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                i3 = -3552818;
                                            }
                                        }
                                        if (str.equals("PrayerBar")) {
                                            float f33 = f12;
                                            ?? r11 = max;
                                            try {
                                                bar(r5, paint, f2, f * 0.422f, f13, min, r11, f33);
                                                r4 = f7;
                                                r5 = r5;
                                                face = r11;
                                                min2 = f33;
                                            } catch (Exception e19) {
                                                e = e19;
                                                f12 = f33;
                                                face = face;
                                                Log.e("WathakkerHome", "Render failed", e);
                                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                                return bitmap;
                                            }
                                        } else if (z2) {
                                            Typeface typeface8 = face;
                                            text(r5, state3.arabic ? "المتبقي" : "Remaining", f2, f * 0.537f, f3, Math.min(1.0f, f7) * 11.0f, typeface8, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                            text(r5, (r5 / 60) + (state3.arabic ? " ساعات" : " hours"), f2, f * 0.681f, f3, Math.min(1.0f, f7) * 11.0f, typeface8, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                            min2 = Float.NaN;
                                            text(r5, (state3.arabic ? "و " : "and ") + (r5 % 60) + (state3.arabic ? " دقيقة" : " minutes"), f2, f * 0.837f, f3, Math.min(1.0f, f7) * 11.0f, typeface8, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                            r4 = f7;
                                            r5 = r5;
                                            face = typeface8;
                                        } else {
                                            Typeface typeface9 = face;
                                            min2 = Float.NaN;
                                            text(r5, remaining, f2, f * 0.73f, f3, Math.min(1.0f, f7) * 12.0f, typeface9, -3552818, Layout.Alignment.ALIGN_CENTER, f12);
                                            r4 = f7;
                                            r5 = r5;
                                            face = typeface9;
                                        }
                                    } catch (Exception e20) {
                                        e = e20;
                                    }
                                    text(r5, tm(state3.at, state3.arabic), f2, f5, f3, Math.min(1.0f, f7) * (str.equals("PrayerBar") ? 16 : 18), typeface, -1, Layout.Alignment.ALIGN_CENTER, f12);
                                    i3 = -1;
                                } catch (Exception e21) {
                                    e = e21;
                                    i3 = -1;
                                }
                                text(r5, state3.names[state3.next], f2, f4, f3, Math.min(1.0f, f6) * 14.0f, face, -1, Layout.Alignment.ALIGN_CENTER, f12);
                            } catch (Exception e22) {
                                e = e22;
                                i3 = min2;
                                Log.e("WathakkerHome", "Render failed", e);
                                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                                return bitmap;
                            }
                            z2 = f13 >= 1.45f * f ? z : true;
                            min = Math.min(10.0f, 0.11f * f);
                            f4 = (str.equals("PrayerBar") ? 0.21f : z2 ? 0.13f : 0.26f) * f;
                            f5 = (str.equals("PrayerBar") ? 0.79f : z2 ? 0.326f : 0.493f) * f;
                            f6 = f / 70.0f;
                            r5 = r4;
                            f7 = f6;
                            min2 = Float.NaN;
                        }
                    } catch (Exception e23) {
                        e = e23;
                    }
                } catch (Exception e24) {
                    e = e24;
                }
            } catch (Exception e25) {
                e = e25;
                f = f15;
                r5 = canvas;
                f12 = f12;
                i3 = -1;
                Log.e("WathakkerHome", "Render failed", e);
                text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
                return bitmap;
            }
        } catch (Exception e26) {
            e = e26;
            f = f15;
            r5 = canvas;
            i3 = -1;
            Log.e("WathakkerHome", "Render failed", e);
            text(r5, !ar(context) ? "تعذر حساب الصلاة" : "Prayer time unavailable", 5.0f, f / 2.0f, i - 10, 12.0f, face, i3, Layout.Alignment.ALIGN_CENTER, f12);
            return bitmap;
        }
        return bitmap;
    }
}
