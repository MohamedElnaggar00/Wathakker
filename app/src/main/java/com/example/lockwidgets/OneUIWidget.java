package com.example.lockwidgets;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.*;
import android.text.*;
import java.util.Locale;

/** One UI style prayer progress card with a yellow date tile (mockup v4). Drawn like the other home widgets. */
final class OneUIWidget {
    private OneUIWidget() {}

    private static float lerp(float a, float b, float t) { return a + (b - a) * t; }

    static Bitmap render(Context c, HomeWidgets.State s, int wd, int ht) {
        float d = c.getResources().getDisplayMetrics().density;
        Bitmap bmp = Bitmap.createBitmap(Math.max(1, (int) (wd * d)), Math.max(1, (int) (ht * d)), Bitmap.Config.ARGB_8888);
        Canvas cv = new Canvas(bmp);
        boolean night = (c.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;
        float W = wd, H = ht;
        float t = Math.max(0f, Math.min(1f, (H - 80f) / 100f)); // 0 = 4x1, 1 = 4x2
        float gap = Math.max(6f, W * 0.02f);
        float tileW = Math.min(H * 0.93f, W * 0.225f);
        float cardW = W - tileW - gap;
        float corner = Math.min(H * 0.30f, 34f);
        RectF card = new RectF(0, 0, cardW, H);
        RectF tile = new RectF(cardW + gap, 0, W, H);
        Typeface reg = HomeWidgets.face(c, false, s.rtl), bold = HomeWidgets.face(c, true, s.rtl);

        int cardTop = night ? 0xFF2B2C30 : 0xFFFFFFFF, cardBot = night ? 0xFF222326 : 0xFFF1F2F5;
        int ink = night ? 0xFFFFFFFF : 0xFF1C1C1E;
        int soft = night ? 0xFFB4B4BA : 0xFF6C6C74;
        int track = night ? 0xFF4A4A4F : 0xFFDEDEE2;
        int barA = night ? 0xFFFFD85C : 0xFF55A0FF, barB = night ? 0xFFF5B800 : 0xFF2A6BF0;
        if (s.iqama) { barA = 0xFFE5B455; barB = 0xFFE5B455; }

        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        // card
        p.setShader(new LinearGradient(0, 0, 0, H * d, cardTop, cardBot, Shader.TileMode.CLAMP));
        cv.drawRoundRect(new RectF(card.left * d, card.top * d, card.right * d, card.bottom * d), corner * d, corner * d, p);
        p.setShader(null);
        // stars, fading from the bottom-left corner
        cv.saveLayer(0, 0, cardW * d, H * d, null);
        Path clip = new Path();
        clip.addRoundRect(new RectF(0, 0, cardW * d, H * d), corner * d, corner * d, Path.Direction.CW);
        cv.clipPath(clip);
        Paint sp = new Paint(Paint.ANTI_ALIAS_FLAG);
        sp.setStyle(Paint.Style.STROKE);
        sp.setStrokeWidth(Math.max(0.8f, 0.9f * d));
        sp.setColor(night ? 0xFFFFFFFF : 0xFF7C8396);
        sp.setAlpha(night ? 48 : 70);
        float R = H * lerp(0.115f, 0.092f, t);
        float step = R * 1.7f;
        for (float cy = H + R * 0.2f, row = 0; cy > -R; cy -= step * 0.78f, row++) {
            for (float cx = (row % 2 == 0 ? 0 : step / 2); cx < cardW + R; cx += step) {
                star(cv, cx * d, cy * d, R * d, sp);
            }
        }
        Paint fade = new Paint();
        fade.setShader(new LinearGradient(0, H * d, cardW * d * 0.9f, 0, 0xFF000000, 0x00000000, Shader.TileMode.CLAMP));
        fade.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        cv.drawRect(0, 0, cardW * d, H * d, fade);
        cv.restore();

        // text rows (fractions of card height, interpolated between 4x1 and 4x2)
        float nameY = H * lerp(0.21f, 0.20f, t), barY = H * lerp(0.385f, 0.43f, t), timeY = H * lerp(0.565f, 0.63f, t), remY = H * lerp(0.795f, 0.84f, t);
        float nameSz = H * lerp(0.162f, 0.116f, t), timeSz = H * lerp(0.152f, 0.096f, t), remSz = H * lerp(0.132f, 0.086f, t);
        float padX = Math.min(24f, cardW * 0.06f), inner = cardW - 2 * padX, side = inner * 0.46f;
        boolean rtl = s.rtl;
        String nextName = s.targetName, prevName = s.names[s.previous];
        String nextTime = time(c, s, s.at), prevTime = time(c, s, s.prev);
        float xNext = padX + inner - side, xPrev = padX; // previous prayer on the left, next on the right, as in the mockup
        Layout.Alignment nextA = Layout.Alignment.ALIGN_OPPOSITE;
        Layout.Alignment prevA = Layout.Alignment.ALIGN_NORMAL;
        line(cv, nextName, xNext, nameY, side, nameSz, bold, ink, nextA, d);
        line(cv, prevName, xPrev, nameY, side, nameSz, bold, ink, prevA, d);
        line(cv, nextTime, xNext, timeY, side, timeSz, reg, ink, nextA, d);
        line(cv, prevTime, xPrev, timeY, side, timeSz, reg, ink, prevA, d);

        // progress bar
        float bh = Math.max(6f, H * lerp(0.125f, 0.10f, t));
        float progress = Math.max(0.02f, Math.min(1f, (s.now - s.prev) / (float) Math.max(1, s.at - s.prev)));
        RectF tr = new RectF(padX * d, (barY - bh / 2) * d, (padX + inner) * d, (barY + bh / 2) * d);
        p.setColor(track);
        cv.drawRoundRect(tr, bh * d / 2, bh * d / 2, p);
        float fw = inner * progress;
        RectF fr = new RectF(padX * d, tr.top, (padX + fw) * d, tr.bottom); // fills left to right
        Paint glow = new Paint(Paint.ANTI_ALIAS_FLAG);
        glow.setColor(barB);
        glow.setAlpha(night ? 70 : 60);
        glow.setMaskFilter(new BlurMaskFilter(bh * d * 0.9f, BlurMaskFilter.Blur.NORMAL));
        cv.drawRoundRect(fr, bh * d / 2, bh * d / 2, glow);
        p.setShader(new LinearGradient(fr.left, 0, fr.right, 0, barA, barB, Shader.TileMode.CLAMP));
        cv.drawRoundRect(fr, bh * d / 2, bh * d / 2, p);
        p.setShader(null);

        // remaining line: gray label + bold value (iqama: native ticking countdown replaces the value)
        long mins = Math.max(0, (s.at - s.now) / 60000);
        String prefix = HomeWidgets.remPrefix(s.code, ": ");
        String value = s.iqama ? "\u2066" + HomeWidgets.mmss(s.at - s.now) + "\u2069" : HomeWidgets.durText(mins, s.code);
        remaining(cv, prefix, value, padX, remY, inner, remSz, reg, bold, soft, ink, d);

        // date tile
        int tA = night ? 0xFFFFD85C : 0xFFFFE58F, tB = night ? 0xFFEBA800 : 0xFFFFC93A;
        int tInk = night ? 0xFF2A2200 : 0xFF3A2E00;
        RectF tp = new RectF(tile.left * d, 0, tile.right * d, H * d);
        p.setShader(new LinearGradient(0, 0, 0, H * d, tA, tB, Shader.TileMode.CLAMP));
        cv.drawRoundRect(tp, corner * d * 1.05f, corner * d * 1.05f, p);
        p.setShader(null);
        float tcx = tile.left + tileW / 2;
        float wdSz = H * lerp(0.127f, 0.07f, t), numSz = H * lerp(0.42f, 0.245f, t), mSz = H * lerp(0.118f, 0.065f, t);
        line(cv, s.day, tile.left + 4, H * lerp(0.20f, 0.30f, t), tileW - 8, wdSz, reg, tInk, Layout.Alignment.ALIGN_CENTER, d);
        line(cv, s.hday, tile.left + 4, H * lerp(0.50f, 0.50f, t), tileW - 8, numSz, bold, tInk, Layout.Alignment.ALIGN_CENTER, d);
        line(cv, s.hmonth, tile.left + 4, H * lerp(0.80f, 0.70f, t), tileW - 8, mSz, reg, tInk, Layout.Alignment.ALIGN_CENTER, d);
        return bmp;
    }

    private static String time(Context c, HomeWidgets.State s, long at) {
        if (!s.code.startsWith("ar")) return HomeWidgets.tm(at, s.code);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTimeInMillis(at);
        String m = cal.get(java.util.Calendar.AM_PM) == 0 ? "ص" : "م";
        String hm = new java.text.SimpleDateFormat("hh:mm", Locale.ENGLISH).format(new java.util.Date(at));
        return "\u2066" + hm + "\u2069 " + m;
    }

    private static void star(Canvas cv, float cx, float cy, float r, Paint p) {
        Path path = new Path();
        float inner = r * 0.45f;
        for (int i = 0; i < 10; i++) {
            double a = -Math.PI / 2 + i * Math.PI / 5;
            float rr = (i % 2 == 0) ? r : inner;
            float x = cx + (float) Math.cos(a) * rr, y = cy + (float) Math.sin(a) * rr;
            if (i == 0) path.moveTo(x, y); else path.lineTo(x, y);
        }
        path.close();
        cv.drawPath(path, p);
    }

    private static void line(Canvas cv, String s, float x, float cy, float w, float size, Typeface f, int color, Layout.Alignment a, float d) {
        HomeWidgets.heroText(cv, s, x, cy, w, size, f, color, a, d);
    }

    private static void remaining(Canvas cv, String prefix, String value, float x, float cy, float w, float size, Typeface reg, Typeface bold, int soft, int ink, float d) {
        String full = prefix + value;
        if (HomeWidgets.capture(full, (x + w / 2) * d, cy * d, w * d, size * d, ink)) return;
        SpannableString sp = new SpannableString(full);
        sp.setSpan(new android.text.style.ForegroundColorSpan(soft), 0, prefix.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sp.setSpan(new android.text.style.ForegroundColorSpan(ink), prefix.length(), full.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sp.setSpan(new CustomTypefaceSpan(bold), prefix.length(), full.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextPaint tp = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        tp.setTypeface(reg);
        tp.setTextSize(size * d);
        tp.setColor(soft);
        while (tp.measureText(full) > w * d && tp.getTextSize() > 8 * d) tp.setTextSize(tp.getTextSize() - 0.5f * d);
        StaticLayout l = StaticLayout.Builder.obtain(sp, 0, sp.length(), tp, Math.max(1, (int) (w * d)))
                .setAlignment(Layout.Alignment.ALIGN_CENTER).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR)
                .setIncludePad(false).setMaxLines(1).build();
        cv.save();
        cv.translate(x * d, cy * d - l.getHeight() / 2f);
        l.draw(cv);
        cv.restore();
    }

    private static final class CustomTypefaceSpan extends android.text.style.MetricAffectingSpan {
        private final Typeface tf;
        CustomTypefaceSpan(Typeface tf) { this.tf = tf; }
        @Override public void updateDrawState(TextPaint p) { p.setTypeface(tf); }
        @Override public void updateMeasureState(TextPaint p) { p.setTypeface(tf); }
    }
}
