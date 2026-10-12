package com.example.lockwidgets;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
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
        To view partially-correct add '--show-bad-code' argument
    */
    static void updateBatch(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.lockwidgets.HomeWidgets.updateBatch(android.content.Context):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    static com.example.lockwidgets.HomeWidgets.State state(android.content.Context r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.lockwidgets.HomeWidgets.state(android.content.Context):com.example.lockwidgets.HomeWidgets$State");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap renderKind(android.content.Context r38, java.lang.String r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.lockwidgets.HomeWidgets.renderKind(android.content.Context, java.lang.String, int, int):android.graphics.Bitmap");
    }
}
