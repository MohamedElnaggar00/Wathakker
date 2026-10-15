package com.example.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.SizeF;
import android.widget.RemoteViews;
import com.example.MainActivity;
import com.example.R;
import com.example.fajr.calculation.CalculationMethod;
import com.example.fajr.calculation.PrayerTimesCalculator;
import com.example.fajr.data.FajrPreferences;
import com.example.lockwidgets.HomeWidgets;
import com.example.prayer.HijriDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: WidgetUpdater.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u000245B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J(\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010\"\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J0\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0016\u0010'\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0005J,\u0010)\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-H\u0002J(\u0010.\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010/\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J \u00100\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\nH\u0002J \u00101\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J \u00102\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J(\u00103\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H\u0002R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/example/widget/WidgetUpdater;", "", "<init>", "()V", "formatTime", "", "millis", "", "formatTimeShort", "computeState", "Lcom/example/widget/WidgetUpdater$PrayerState;", "context", "Landroid/content/Context;", "launchIntent", "Landroid/app/PendingIntent;", "updateAll", "", "iqamaOffsets", "", "", "barVariants", "barLayout", "base", "compactRemaining", "computeIqamaState", "Lcom/example/widget/WidgetUpdater$IqamaState;", "state", "now", "updateIqama", "mgr", "Landroid/appwidget/AppWidgetManager;", "updateIqamaSmall", "formatRemaining", "updateHero", "updatePill", "updateClockCountdown", "updateWideBar", "cal", "Ljava/util/Calendar;", "pushFaceWidget", "pageId", "applyToAll", "cls", "Ljava/lang/Class;", "views", "Landroid/widget/RemoteViews;", "updateNextPrayer", "updatePrayerBar", "updateSchedule", "updateHijri", "updateGregorian", "updateDayPrayer", "PrayerState", "IqamaState", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WidgetUpdater {
    public static final WidgetUpdater INSTANCE = new WidgetUpdater();
    private static final Map<String, Integer> iqamaOffsets = MapsKt.mapOf(TuplesKt.to("الفجر", 25), TuplesKt.to("الظهر", 20), TuplesKt.to("العصر", 15), TuplesKt.to("المغرب", 10), TuplesKt.to("العشاء", 15));
    private static final Map<Integer, Map<String, Integer>> barVariants = MapsKt.mapOf(TuplesKt.to(Integer.valueOf(R.layout.widget_hero), MapsKt.mapOf(TuplesKt.to("amber", Integer.valueOf(R.layout.widget_hero_amber)), TuplesKt.to("blue", Integer.valueOf(R.layout.widget_hero_blue)), TuplesKt.to("green", Integer.valueOf(R.layout.widget_hero_green)))), TuplesKt.to(Integer.valueOf(R.layout.widget_hero_compact), MapsKt.mapOf(TuplesKt.to("amber", Integer.valueOf(R.layout.widget_hero_compact_amber)), TuplesKt.to("blue", Integer.valueOf(R.layout.widget_hero_compact_blue)), TuplesKt.to("green", Integer.valueOf(R.layout.widget_hero_compact_green)))), TuplesKt.to(Integer.valueOf(R.layout.widget_iqama), MapsKt.mapOf(TuplesKt.to("white", Integer.valueOf(R.layout.widget_iqama_white)), TuplesKt.to("blue", Integer.valueOf(R.layout.widget_iqama_blue)), TuplesKt.to("green", Integer.valueOf(R.layout.widget_iqama_green)))), TuplesKt.to(Integer.valueOf(R.layout.widget_iqama_small), MapsKt.mapOf(TuplesKt.to("white", Integer.valueOf(R.layout.widget_iqama_small_white)), TuplesKt.to("blue", Integer.valueOf(R.layout.widget_iqama_small_blue)), TuplesKt.to("green", Integer.valueOf(R.layout.widget_iqama_small_green)))), TuplesKt.to(Integer.valueOf(R.layout.widget_prayer_bar), MapsKt.mapOf(TuplesKt.to("amber", Integer.valueOf(R.layout.widget_prayer_bar_amber)), TuplesKt.to("blue", Integer.valueOf(R.layout.widget_prayer_bar_blue)), TuplesKt.to("green", Integer.valueOf(R.layout.widget_prayer_bar_green)))), TuplesKt.to(Integer.valueOf(R.layout.widget_wide_bar), MapsKt.mapOf(TuplesKt.to("amber", Integer.valueOf(R.layout.widget_wide_bar_amber)), TuplesKt.to("blue", Integer.valueOf(R.layout.widget_wide_bar_blue)), TuplesKt.to("green", Integer.valueOf(R.layout.widget_wide_bar_green)))));
    public static final int $stable = 8;

    public final void updateAll(Context context) {
        HomeWidgets.updateAll(context);
        try {
            pushFaceWidget(context, FaceWidgetReceiver.PAGE_ID_PRAYER);
        } catch (Exception e) {
        }
    }

    private WidgetUpdater() {
    }

    private final String formatTime(long millis) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(millis);
        String ampm = cal.get(9) == 0 ? "ص" : "م";
        return new SimpleDateFormat("h:mm", Locale.US).format(cal.getTime()) + " " + ampm;
    }

    private final String formatTimeShort(long millis) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm", Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WidgetUpdater.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003Je\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u0006*"}, d2 = {"Lcom/example/widget/WidgetUpdater$PrayerState;", "", "names", "", "", "times", "", "nextIndex", "", "nextName", "nextMillis", "prevName", "prevMillis", "city", "<init>", "(Ljava/util/List;Ljava/util/List;ILjava/lang/String;JLjava/lang/String;JLjava/lang/String;)V", "getNames", "()Ljava/util/List;", "getTimes", "getNextIndex", "()I", "getNextName", "()Ljava/lang/String;", "getNextMillis", "()J", "getPrevName", "getPrevMillis", "getCity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class PrayerState {
        private final String city;
        private final List<String> names;
        private final int nextIndex;
        private final long nextMillis;
        private final String nextName;
        private final long prevMillis;
        private final String prevName;
        private final List<Long> times;

        public static /* synthetic */ PrayerState copy$default(PrayerState prayerState, List list, List list2, int i, String str, long j, String str2, long j2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = prayerState.names;
            }
            if ((i2 & 2) != 0) {
                list2 = prayerState.times;
            }
            if ((i2 & 4) != 0) {
                i = prayerState.nextIndex;
            }
            if ((i2 & 8) != 0) {
                str = prayerState.nextName;
            }
            if ((i2 & 16) != 0) {
                j = prayerState.nextMillis;
            }
            if ((i2 & 32) != 0) {
                str2 = prayerState.prevName;
            }
            if ((i2 & 64) != 0) {
                j2 = prayerState.prevMillis;
            }
            if ((i2 & 128) != 0) {
                str3 = prayerState.city;
            }
            String str4 = str2;
            long j3 = j;
            int i3 = i;
            String str5 = str;
            return prayerState.copy(list, list2, i3, str5, j3, str4, j2, str3);
        }

        public final List<String> component1() {
            return this.names;
        }

        public final List<Long> component2() {
            return this.times;
        }

        public final PrayerState copy(List<String> names, List<Long> times, int nextIndex, String nextName, long nextMillis, String prevName, long prevMillis, String city) {
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(times, "times");
            Intrinsics.checkNotNullParameter(nextName, "nextName");
            Intrinsics.checkNotNullParameter(prevName, "prevName");
            Intrinsics.checkNotNullParameter(city, "city");
            return new PrayerState(names, times, nextIndex, nextName, nextMillis, prevName, prevMillis, city);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrayerState)) {
                return false;
            }
            PrayerState prayerState = (PrayerState) other;
            return Intrinsics.areEqual(this.names, prayerState.names) && Intrinsics.areEqual(this.times, prayerState.times) && this.nextIndex == prayerState.nextIndex && Intrinsics.areEqual(this.nextName, prayerState.nextName) && this.nextMillis == prayerState.nextMillis && Intrinsics.areEqual(this.prevName, prayerState.prevName) && this.prevMillis == prayerState.prevMillis && Intrinsics.areEqual(this.city, prayerState.city);
        }

        public int hashCode() {
            return (((((((((((((this.names.hashCode() * 31) + this.times.hashCode()) * 31) + this.nextIndex) * 31) + this.nextName.hashCode()) * 31) + WidgetUpdater$IqamaState$$ExternalSyntheticBackport0.m(this.nextMillis)) * 31) + this.prevName.hashCode()) * 31) + WidgetUpdater$IqamaState$$ExternalSyntheticBackport0.m(this.prevMillis)) * 31) + this.city.hashCode();
        }

        public String toString() {
            return "PrayerState(names=" + this.names + ", times=" + this.times + ", nextIndex=" + this.nextIndex + ", nextName=" + this.nextName + ", nextMillis=" + this.nextMillis + ", prevName=" + this.prevName + ", prevMillis=" + this.prevMillis + ", city=" + this.city + ")";
        }

        public PrayerState(List<String> names, List<Long> times, int nextIndex, String nextName, long nextMillis, String prevName, long prevMillis, String city) {
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(times, "times");
            Intrinsics.checkNotNullParameter(nextName, "nextName");
            Intrinsics.checkNotNullParameter(prevName, "prevName");
            Intrinsics.checkNotNullParameter(city, "city");
            this.names = names;
            this.times = times;
            this.nextIndex = nextIndex;
            this.nextName = nextName;
            this.nextMillis = nextMillis;
            this.prevName = prevName;
            this.prevMillis = prevMillis;
            this.city = city;
        }

        public final List<String> getNames() {
            return this.names;
        }

        public final List<Long> getTimes() {
            return this.times;
        }

        public final int getNextIndex() {
            return this.nextIndex;
        }

        public final long getNextMillis() {
            return this.nextMillis;
        }

        public final String getNextName() {
            return this.nextName;
        }

        public final long getPrevMillis() {
            return this.prevMillis;
        }

        public final String getPrevName() {
            return this.prevName;
        }

        public final String getCity() {
            return this.city;
        }
    }

    private final PrayerState computeState(Context context) {
        FajrPreferences prefs;
        boolean z;
        String str;
        List names;
        int nextIndex;
        String nextName;
        long nextMillis;
        int i;
        int i2;
        String prevName;
        long prevMillis;
        FajrPreferences prefs2 = new FajrPreferences(context);
        CalculationMethod method = CalculationMethod.INSTANCE.fromId(prefs2.getCalculationMethodId());
        long now = System.currentTimeMillis();
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(now);
        PrayerTimesCalculator prayerTimesCalculator = PrayerTimesCalculator.INSTANCE;
        Intrinsics.checkNotNull(cal);
        PrayerTimesCalculator.DayPrayerTimes today = prayerTimesCalculator.calculateAll(cal, prefs2.getLatitude(), prefs2.getLongitude(), method);
        List times = CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(today.getFajr()), Long.valueOf(today.getSunrise()), Long.valueOf(today.getDhuhr()), Long.valueOf(today.getAsr()), Long.valueOf(today.getMaghrib()), Long.valueOf(today.getIsha())});
        List names2 = CollectionsKt.listOf((Object[]) new String[]{"الفجر", "الشروق", "الظهر", "العصر", "المغرب", "العشاء"});
        int i3 = 0;
        Iterator it = times.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Number) it.next()).longValue() > now) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        int nextIndex2 = i3;
        if (nextIndex2 == -1) {
            Object clone = cal.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.Calendar");
            Calendar calendar = (Calendar) clone;
            calendar.add(6, 1);
            PrayerTimesCalculator prayerTimesCalculator2 = PrayerTimesCalculator.INSTANCE;
            double latitude = prefs2.getLatitude();
            z = true;
            double longitude = prefs2.getLongitude();
            prefs = prefs2;
            names = names2;
            str = "null cannot be cast to non-null type java.util.Calendar";
            PrayerTimesCalculator.DayPrayerTimes tomorrow = prayerTimesCalculator2.calculateAll(calendar, latitude, longitude, method);
            long nextMillis2 = tomorrow.getFajr();
            nextIndex = 0;
            nextName = "الفجر";
            nextMillis = nextMillis2;
            i = -1;
        } else {
            prefs = prefs2;
            z = true;
            str = "null cannot be cast to non-null type java.util.Calendar";
            names = names2;
            long nextMillis3 = ((Number) times.get(nextIndex2)).longValue();
            nextIndex = nextIndex2;
            nextName = (String) names.get(nextIndex2);
            nextMillis = nextMillis3;
            i = -1;
        }
        ListIterator listIterator = times.listIterator(times.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((Number) listIterator.previous()).longValue() <= now ? z : false) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            } else {
                i2 = i;
                break;
            }
        }
        int prevIndex = i2;
        if (prevIndex == i) {
            Object clone2 = cal.clone();
            Intrinsics.checkNotNull(clone2, str);
            Calendar yesterdayCal = (Calendar) clone2;
            yesterdayCal.add(6, i);
            long prevMillis2 = PrayerTimesCalculator.INSTANCE.calculateAll(yesterdayCal, prefs.getLatitude(), prefs.getLongitude(), method).getIsha();
            prevName = "العشاء";
            prevMillis = prevMillis2;
        } else {
            long prevMillis3 = ((Number) times.get(prevIndex)).longValue();
            prevName = (String) names.get(prevIndex);
            prevMillis = prevMillis3;
        }
        return new PrayerState(names, times, nextIndex, nextName, nextMillis, prevName, prevMillis, prefs.getCityName());
    }

    private final PendingIntent launchIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    private final int barLayout(Context context, int base) {
        Map<String, Integer> map;
        Integer num;
        String c = new FajrPreferences(context).getWidgetBarColor();
        return (Intrinsics.areEqual(c, "default") || (map = barVariants.get(Integer.valueOf(base))) == null || (num = map.get(c)) == null) ? base : num.intValue();
    }

    private final String compactRemaining(long millis) {
        int totalMinutes = RangesKt.coerceAtLeast((int) (millis / 60000), 0);
        int h = totalMinutes / 60;
        int m = totalMinutes % 60;
        return (h <= 0 ? new StringBuilder() : new StringBuilder().append(h).append(" س ")).append(m).append(" د").toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WidgetUpdater.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/example/widget/WidgetUpdater$IqamaState;", "", "prayerName", "", "adhanMillis", "", "iqamaMillis", "progressPct", "", "nextIqamaMillis", "<init>", "(Ljava/lang/String;JJIJ)V", "getPrayerName", "()Ljava/lang/String;", "getAdhanMillis", "()J", "getIqamaMillis", "getProgressPct", "()I", "getNextIqamaMillis", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class IqamaState {
        private final long adhanMillis;
        private final long iqamaMillis;
        private final long nextIqamaMillis;
        private final String prayerName;
        private final int progressPct;

        public static /* synthetic */ IqamaState copy$default(IqamaState iqamaState, String str, long j, long j2, int i, long j3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = iqamaState.prayerName;
            }
            if ((i2 & 2) != 0) {
                j = iqamaState.adhanMillis;
            }
            if ((i2 & 4) != 0) {
                j2 = iqamaState.iqamaMillis;
            }
            if ((i2 & 8) != 0) {
                i = iqamaState.progressPct;
            }
            if ((i2 & 16) != 0) {
                j3 = iqamaState.nextIqamaMillis;
            }
            int i3 = i;
            long j4 = j2;
            return iqamaState.copy(str, j, j4, i3, j3);
        }

        public final IqamaState copy(String prayerName, long adhanMillis, long iqamaMillis, int progressPct, long nextIqamaMillis) {
            Intrinsics.checkNotNullParameter(prayerName, "prayerName");
            return new IqamaState(prayerName, adhanMillis, iqamaMillis, progressPct, nextIqamaMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IqamaState)) {
                return false;
            }
            IqamaState iqamaState = (IqamaState) other;
            return Intrinsics.areEqual(this.prayerName, iqamaState.prayerName) && this.adhanMillis == iqamaState.adhanMillis && this.iqamaMillis == iqamaState.iqamaMillis && this.progressPct == iqamaState.progressPct && this.nextIqamaMillis == iqamaState.nextIqamaMillis;
        }

        public int hashCode() {
            return (((((((this.prayerName.hashCode() * 31) + WidgetUpdater$IqamaState$$ExternalSyntheticBackport0.m(this.adhanMillis)) * 31) + WidgetUpdater$IqamaState$$ExternalSyntheticBackport0.m(this.iqamaMillis)) * 31) + this.progressPct) * 31) + WidgetUpdater$IqamaState$$ExternalSyntheticBackport0.m(this.nextIqamaMillis);
        }

        public String toString() {
            return "IqamaState(prayerName=" + this.prayerName + ", adhanMillis=" + this.adhanMillis + ", iqamaMillis=" + this.iqamaMillis + ", progressPct=" + this.progressPct + ", nextIqamaMillis=" + this.nextIqamaMillis + ")";
        }

        public IqamaState(String prayerName, long adhanMillis, long iqamaMillis, int progressPct, long nextIqamaMillis) {
            Intrinsics.checkNotNullParameter(prayerName, "prayerName");
            this.prayerName = prayerName;
            this.adhanMillis = adhanMillis;
            this.iqamaMillis = iqamaMillis;
            this.progressPct = progressPct;
            this.nextIqamaMillis = nextIqamaMillis;
        }

        public final long getAdhanMillis() {
            return this.adhanMillis;
        }

        public final long getIqamaMillis() {
            return this.iqamaMillis;
        }

        public final String getPrayerName() {
            return this.prayerName;
        }

        public final long getNextIqamaMillis() {
            return this.nextIqamaMillis;
        }

        public final int getProgressPct() {
            return this.progressPct;
        }
    }

    private final IqamaState computeIqamaState(Context context, PrayerState state, long now) {
        Object obj;
        Object obj2;
        Object obj3;
        W active;
        W nextAfter;
        List iqamaPrayers = CollectionsKt.listOf((Object[]) new String[]{"الفجر", "الظهر", "العصر", "المغرب", "العشاء"});
        List windows = new ArrayList();
        int size = state.getNames().size();
        for (int i = 0; i < size; i++) {
            String n = state.getNames().get(i);
            if (iqamaPrayers.contains(n)) {
                windows.add(new W(n, state.getTimes().get(i).longValue(), computeIqamaState$iqamaOf(n, state.getTimes().get(i).longValue())));
            }
        }
        FajrPreferences prefs = new FajrPreferences(context);
        CalculationMethod method = CalculationMethod.INSTANCE.fromId(prefs.getCalculationMethodId());
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(now);
        PrayerTimesCalculator prayerTimesCalculator = PrayerTimesCalculator.INSTANCE;
        Object clone = cal.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) clone;
        calendar.add(6, -1);
        PrayerTimesCalculator.DayPrayerTimes yesterday = prayerTimesCalculator.calculateAll(calendar, prefs.getLatitude(), prefs.getLongitude(), method);
        W yIsha = new W("العشاء", yesterday.getIsha(), computeIqamaState$iqamaOf("العشاء", yesterday.getIsha()));
        PrayerTimesCalculator prayerTimesCalculator2 = PrayerTimesCalculator.INSTANCE;
        Object clone2 = cal.clone();
        Intrinsics.checkNotNull(clone2, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) clone2;
        calendar2.add(6, 1);
        PrayerTimesCalculator.DayPrayerTimes tomorrow = prayerTimesCalculator2.calculateAll(calendar2, prefs.getLatitude(), prefs.getLongitude(), method);
        W tFajr = new W("الفجر", tomorrow.getFajr(), computeIqamaState$iqamaOf("الفجر", tomorrow.getFajr()));
        List all = CollectionsKt.sortedWith(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(yIsha), (Iterable) windows), (Iterable) CollectionsKt.listOf(tFajr)), new Comparator() { // from class: com.example.widget.WidgetUpdater$computeIqamaState$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(Object t, Object t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((W) t).getAdhan()), Long.valueOf(((W) t2).getAdhan()));
            }
        });
        ListIterator listIterator = all.listIterator(all.size());
        while (true) {
            obj = null;
            if (listIterator.hasPrevious()) {
                obj2 = listIterator.previous();
                if ((((W) obj2).getAdhan() <= now ? 1 : null) != null) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        W current = (W) obj2;
        if (current == null) {
            return null;
        }
        if (now <= current.getIqama()) {
            active = current;
            Iterator it = all.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((((W) next).getAdhan() > current.getAdhan() ? 1 : null) != null) {
                    obj = next;
                    break;
                }
            }
            nextAfter = (W) obj;
        } else {
            Iterator it2 = all.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj3 = it2.next();
                    if ((((W) obj3).getAdhan() > now ? 1 : null) != null) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            W w = (W) obj3;
            if (w == null) {
                return null;
            }
            active = w;
            Iterator it3 = all.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if ((((W) next2).getAdhan() > active.getAdhan() ? 1 : null) != null) {
                    obj = next2;
                    break;
                }
            }
            nextAfter = (W) obj;
        }
        long interval = RangesKt.coerceAtLeast(active.getIqama() - active.getAdhan(), 1L);
        int pct = RangesKt.coerceIn((int) (((now - active.getAdhan()) * 100) / interval), 0, 100);
        return new IqamaState(active.getName(), active.getAdhan(), active.getIqama(), pct, nextAfter != null ? nextAfter.getIqama() : active.getIqama());
    }

    private static final long computeIqamaState$iqamaOf(String name, long adhan) {
        return ((iqamaOffsets.get(name) != null ? r0.intValue() : 15) * 60000) + adhan;
    }

    private final void updateIqama(Context context, AppWidgetManager mgr, PrayerState state, long now) {
        IqamaState iq = computeIqamaState(context, state, now);
        if (iq == null) {
            return;
        }
        RemoteViews views = new RemoteViews(context.getPackageName(), barLayout(context, R.layout.widget_iqama));
        views.setTextViewText(R.id.widget_iqama_countdown, formatRemaining(iq.getIqamaMillis() - now));
        views.setTextViewText(R.id.widget_iqama_adhan, iq.getPrayerName() + " " + formatTimeShort(iq.getAdhanMillis()));
        views.setTextViewText(R.id.widget_iqama_time, "الإقامة " + formatTimeShort(iq.getIqamaMillis()));
        views.setTextViewText(R.id.widget_iqama_next, "الإقامة " + formatTimeShort(iq.getNextIqamaMillis()));
        views.setProgressBar(R.id.widget_iqama_progress, 100, iq.getProgressPct(), false);
        views.setOnClickPendingIntent(R.id.widget_iqama_countdown, launchIntent(context));
        applyToAll(context, mgr, IqamaWidgetProvider.class, views);
    }

    private final void updateIqamaSmall(Context context, AppWidgetManager mgr, PrayerState state, long now) {
        IqamaState iq = computeIqamaState(context, state, now);
        if (iq == null) {
            return;
        }
        RemoteViews views = new RemoteViews(context.getPackageName(), barLayout(context, R.layout.widget_iqama_small));
        views.setTextViewText(R.id.widget_iqama_small_time, formatTimeShort(iq.getIqamaMillis()));
        views.setProgressBar(R.id.widget_iqama_small_progress, 100, iq.getProgressPct(), false);
        views.setOnClickPendingIntent(R.id.widget_iqama_small_time, launchIntent(context));
        applyToAll(context, mgr, IqamaSmallWidgetProvider.class, views);
    }

    private final String formatRemaining(long millis) {
        int totalMinutes = RangesKt.coerceAtLeast((int) (millis / 60000), 0);
        int h = totalMinutes / 60;
        int m = totalMinutes % 60;
        if (h <= 0) {
            return formatRemaining$minutesText(totalMinutes);
        }
        String str = "ساعتان";
        if (m == 0) {
            switch (h) {
                case 1:
                    return "ساعة واحدة";
                case 2:
                    return "ساعتان";
                default:
                    return h + " ساعات";
            }
        }
        switch (h) {
            case 1:
                str = "ساعة";
                break;
            case 2:
                break;
            default:
                str = h + " ساعات";
                break;
        }
        return str + " و" + formatRemaining$minutesText(m);
    }

    private static final String formatRemaining$minutesText(int n) {
        if (n == 1) {
            return "دقيقة واحدة";
        }
        if (n == 2) {
            return "دقيقتان";
        }
        return 3 <= n && n < 11 ? n + " دقائق" : n + " دقيقة";
    }

    private final void updateHero(Context context, AppWidgetManager mgr, PrayerState state, long now) {
        RemoteViews views;
        long interval = RangesKt.coerceAtLeast(state.getNextMillis() - state.getPrevMillis(), 1L);
        int pct = RangesKt.coerceIn((int) (((now - state.getPrevMillis()) * 100) / interval), 0, 100);
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(now);
        RemoteViews full = new RemoteViews(context.getPackageName(), barLayout(context, R.layout.widget_hero));
        full.setTextViewText(R.id.widget_hero_prev_name, state.getPrevName());
        full.setTextViewText(R.id.widget_hero_next_name, state.getNextName());
        full.setTextViewText(R.id.widget_hero_prev_time, formatTimeShort(state.getPrevMillis()));
        full.setTextViewText(R.id.widget_hero_next_time, formatTimeShort(state.getNextMillis()));
        full.setTextViewText(R.id.widget_hero_remaining, "باقي على صلاة " + state.getNextName() + " " + compactRemaining(state.getNextMillis() - now));
        full.setProgressBar(R.id.widget_hero_progress, 100, pct, false);
        int i = R.id.widget_hero_hijri;
        HijriDate hijriDate = HijriDate.INSTANCE;
        Intrinsics.checkNotNull(cal);
        full.setTextViewText(i, StringsKt.removeSuffix(hijriDate.format(cal), (CharSequence) " هـ"));
        full.setTextViewText(R.id.widget_hero_greg, new SimpleDateFormat("d MMMM yyyy", new Locale("ar", "EG")).format(cal.getTime()));
        full.setOnClickPendingIntent(R.id.widget_hero_root, launchIntent(context));
        RemoteViews compact = new RemoteViews(context.getPackageName(), barLayout(context, R.layout.widget_hero_compact));
        compact.setTextViewText(R.id.widget_hero_compact_name, state.getNextName() + " " + formatTime(state.getNextMillis()));
        compact.setTextViewText(R.id.widget_hero_compact_remaining, "باقي " + compactRemaining(state.getNextMillis() - now));
        compact.setProgressBar(R.id.widget_hero_compact_progress, 100, pct, false);
        compact.setOnClickPendingIntent(R.id.widget_hero_compact_root, launchIntent(context));
        if (Build.VERSION.SDK_INT >= 31) {
            views = new RemoteViews((Map<SizeF, RemoteViews>) MapsKt.mapOf(TuplesKt.to(new SizeF(250.0f, 110.0f), full), TuplesKt.to(new SizeF(250.0f, 40.0f), compact)));
        } else {
            views = full;
        }
        applyToAll(context, mgr, HeroWidgetProvider.class, views);
    }

    private final void updatePill(Context context, AppWidgetManager mgr, PrayerState state, long now) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_pill);
        views.setTextViewText(R.id.widget_pill_text, "أذان " + state.getNextName() + " بعد " + formatRemaining(state.getNextMillis() - now));
        views.setOnClickPendingIntent(R.id.widget_pill_text, launchIntent(context));
        applyToAll(context, mgr, PillWidgetProvider.class, views);
    }

    private final void updateClockCountdown(Context context, AppWidgetManager mgr, PrayerState state, long now) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_clock);
        views.setTextViewText(R.id.widget_clock_prev_name, state.getPrevName());
        views.setTextViewText(R.id.widget_clock_prev_time, formatTimeShort(state.getPrevMillis()));
        views.setTextViewText(R.id.widget_clock_next_name, state.getNextName());
        views.setTextViewText(R.id.widget_clock_next_time, formatTimeShort(state.getNextMillis()));
        if (Build.VERSION.SDK_INT >= 24) {
            views.setChronometerCountDown(R.id.widget_clock_countdown, true);
        }
        views.setChronometer(R.id.widget_clock_countdown, (state.getNextMillis() - now) + SystemClock.elapsedRealtime(), "%s", true);
        views.setOnClickPendingIntent(R.id.widget_clock_countdown, launchIntent(context));
        applyToAll(context, mgr, ClockWidgetProvider.class, views);
    }

    private final void updateWideBar(Context context, AppWidgetManager mgr, PrayerState state, Calendar cal, long now) {
        RemoteViews views = new RemoteViews(context.getPackageName(), barLayout(context, R.layout.widget_wide_bar));
        views.setTextViewText(R.id.widget_wide_day, new SimpleDateFormat("EEEE", new Locale("ar", "EG")).format(cal.getTime()));
        views.setTextViewText(R.id.widget_wide_city, state.getCity());
        views.setTextViewText(R.id.widget_wide_next_name, state.getNextName());
        views.setTextViewText(R.id.widget_wide_prev_name, state.getPrevName());
        views.setTextViewText(R.id.widget_wide_next_time, formatTimeShort(state.getNextMillis()));
        views.setTextViewText(R.id.widget_wide_prev_time, formatTimeShort(state.getPrevMillis()));
        views.setTextViewText(R.id.widget_wide_remaining, "باقي على " + state.getNextName() + " " + formatRemaining(state.getNextMillis() - now));
        long interval = RangesKt.coerceAtLeast(state.getNextMillis() - state.getPrevMillis(), 1L);
        int pct = RangesKt.coerceIn((int) (((now - state.getPrevMillis()) * 100) / interval), 0, 100);
        views.setProgressBar(R.id.widget_wide_progress, 100, pct, false);
        views.setTextViewText(R.id.widget_wide_hijri, StringsKt.removeSuffix(HijriDate.INSTANCE.format(cal), (CharSequence) " هـ"));
        views.setTextViewText(R.id.widget_wide_greg, new SimpleDateFormat("d MMMM yyyy", new Locale("ar", "EG")).format(cal.getTime()));
        views.setOnClickPendingIntent(R.id.widget_wide_remaining, launchIntent(context));
        applyToAll(context, mgr, WideBarWidgetProvider.class, views);
    }

    public final void pushFaceWidget(Context context, String pageId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        if (Intrinsics.areEqual(pageId, FaceWidgetReceiver.PAGE_ID_PRAYER)) {
            PrayerState state = computeState(context);
            long now = System.currentTimeMillis();
            long interval = RangesKt.coerceAtLeast(state.getNextMillis() - state.getPrevMillis(), 1L);
            int pct = RangesKt.coerceIn((int) (((now - state.getPrevMillis()) * 100) / interval), 0, 100);
            String remaining = "باقي على صلاة " + state.getNextName() + " " + compactRemaining(state.getNextMillis() - now);
            Intent resp = new Intent(FaceWidgetReceiver.ACTION_RESPONSE);
            resp.setPackage("com.android.systemui");
            resp.putExtra("package", context.getPackageName());
            resp.putExtra("pageId", pageId);
            resp.putExtra("show", true);
            resp.putExtra("origin", pushFaceWidget$build(context, state, remaining, pct, R.layout.facewidget_prayer));
            resp.putExtra("aod", pushFaceWidget$build(context, state, remaining, pct, R.layout.facewidget_prayer_aod));
            context.sendBroadcast(resp);
        }
    }

    private static final RemoteViews pushFaceWidget$build(Context $context, PrayerState state, String remaining, int pct, int layoutId) {
        RemoteViews views = new RemoteViews($context.getPackageName(), layoutId);
        views.setTextViewText(R.id.facewidget_prayer_name, state.getNextName());
        views.setTextViewText(R.id.facewidget_prayer_time, INSTANCE.formatTime(state.getNextMillis()));
        views.setTextViewText(R.id.facewidget_remaining, remaining);
        views.setProgressBar(R.id.facewidget_progress, 100, pct, false);
        views.setOnClickPendingIntent(R.id.facewidget_root, INSTANCE.launchIntent($context));
        return views;
    }

    private final void applyToAll(Context context, AppWidgetManager mgr, Class<?> cls, RemoteViews views) {
        int[] ids = mgr.getAppWidgetIds(new ComponentName(context, cls));
        Intrinsics.checkNotNull(ids);
        if (!(ids.length == 0)) {
            mgr.updateAppWidget(ids, views);
        }
    }

    private final void updateNextPrayer(Context context, AppWidgetManager mgr, PrayerState state, long now) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_next_prayer);
        views.setTextViewText(R.id.widget_prayer_name, state.getNextName());
        views.setTextViewText(R.id.widget_prayer_time, formatTime(state.getNextMillis()));
        if (Build.VERSION.SDK_INT >= 24) {
            views.setChronometerCountDown(R.id.widget_countdown, true);
        }
        views.setChronometer(R.id.widget_countdown, (state.getNextMillis() - now) + SystemClock.elapsedRealtime(), "باقي %s", true);
        views.setOnClickPendingIntent(R.id.widget_prayer_name, launchIntent(context));
        views.setOnClickPendingIntent(R.id.widget_prayer_time, launchIntent(context));
        applyToAll(context, mgr, NextPrayerWidgetProvider.class, views);
    }

    private final void updatePrayerBar(Context context, AppWidgetManager mgr, PrayerState state, long now) {
        RemoteViews views = new RemoteViews(context.getPackageName(), barLayout(context, R.layout.widget_prayer_bar));
        views.setTextViewText(R.id.widget_bar_name, state.getNextName());
        views.setTextViewText(R.id.widget_bar_time, formatTime(state.getNextMillis()));
        long interval = RangesKt.coerceAtLeast(state.getNextMillis() - state.getPrevMillis(), 1L);
        int pct = RangesKt.coerceIn((int) (((now - state.getPrevMillis()) * 100) / interval), 0, 100);
        views.setProgressBar(R.id.widget_bar_progress, 100, pct, false);
        views.setOnClickPendingIntent(R.id.widget_bar_name, launchIntent(context));
        views.setOnClickPendingIntent(R.id.widget_bar_time, launchIntent(context));
        applyToAll(context, mgr, PrayerBarWidgetProvider.class, views);
    }

    private final void updateSchedule(Context context, AppWidgetManager mgr, PrayerState state) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_schedule);
        List nameIds = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.id.widget_name_0), Integer.valueOf(R.id.widget_name_1), Integer.valueOf(R.id.widget_name_2), Integer.valueOf(R.id.widget_name_3), Integer.valueOf(R.id.widget_name_4), Integer.valueOf(R.id.widget_name_5)});
        List timeIds = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.id.widget_time_0), Integer.valueOf(R.id.widget_time_1), Integer.valueOf(R.id.widget_time_2), Integer.valueOf(R.id.widget_time_3), Integer.valueOf(R.id.widget_time_4), Integer.valueOf(R.id.widget_time_5)});
        int i = 0;
        while (i < 6) {
            views.setTextViewText(((Number) nameIds.get(i)).intValue(), state.getNames().get(i));
            views.setTextViewText(((Number) timeIds.get(i)).intValue(), formatTimeShort(state.getTimes().get(i).longValue()));
            int nameColor = -12676609;
            int color = i == state.getNextIndex() ? -12676609 : -1;
            if (i != state.getNextIndex()) {
                nameColor = -5855578;
            }
            views.setTextColor(((Number) timeIds.get(i)).intValue(), color);
            views.setTextColor(((Number) nameIds.get(i)).intValue(), nameColor);
            i++;
        }
        int i2 = R.id.widget_name_0;
        views.setOnClickPendingIntent(i2, launchIntent(context));
        applyToAll(context, mgr, ScheduleWidgetProvider.class, views);
    }

    private final void updateHijri(Context context, AppWidgetManager mgr, Calendar cal) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_hijri);
        Triple<Integer, Integer, Integer> hijriYmd = HijriDate.INSTANCE.hijriYmd(cal);
        int y = hijriYmd.component1().intValue();
        int m = hijriYmd.component2().intValue();
        int d = hijriYmd.component3().intValue();
        views.setTextViewText(R.id.widget_hijri_day, String.valueOf(d));
        views.setTextViewText(R.id.widget_hijri_month, HijriDate.INSTANCE.monthName(m));
        views.setTextViewText(R.id.widget_hijri_year, y + " هـ");
        views.setOnClickPendingIntent(R.id.widget_hijri_day, launchIntent(context));
        applyToAll(context, mgr, HijriWidgetProvider.class, views);
    }

    private final void updateGregorian(Context context, AppWidgetManager mgr, Calendar cal) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_gregorian);
        views.setTextViewText(R.id.widget_greg_day, String.valueOf(cal.get(5)));
        views.setTextViewText(R.id.widget_greg_month, new SimpleDateFormat("MMMM", new Locale("ar", "EG")).format(cal.getTime()));
        views.setTextViewText(R.id.widget_greg_year, String.valueOf(cal.get(1)));
        views.setOnClickPendingIntent(R.id.widget_greg_day, launchIntent(context));
        applyToAll(context, mgr, GregorianWidgetProvider.class, views);
    }

    private final void updateDayPrayer(Context context, AppWidgetManager mgr, PrayerState state, Calendar cal) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_day_prayer);
        views.setTextViewText(R.id.widget_day_name, new SimpleDateFormat("EEEE", new Locale("ar", "EG")).format(cal.getTime()));
        views.setTextViewText(R.id.widget_day_prayer, state.getNextName() + " " + formatTime(state.getNextMillis()));
        views.setOnClickPendingIntent(R.id.widget_day_name, launchIntent(context));
        applyToAll(context, mgr, DayPrayerWidgetProvider.class, views);
    }
}
