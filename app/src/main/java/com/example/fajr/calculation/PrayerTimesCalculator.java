package com.example.fajr.calculation;

import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrayerTimesCalculator.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0002J(\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0015J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\u001b"}, d2 = {"Lcom/example/fajr/calculation/PrayerTimesCalculator;", "", "<init>", "()V", "solarParams", "Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;", "calendar", "Ljava/util/Calendar;", "longitude", "", "hourAngleBelowHorizon", "angle", "latitude", "declination", "hourAngleAboveHorizon", "altitude", "hoursToMillis", "", "utcHours", "calculateFajrTime", "method", "Lcom/example/fajr/calculation/CalculationMethod;", "calculateAll", "Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;", "fixAngle", "DayPrayerTimes", "SolarParams", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrayerTimesCalculator {
    public static final int $stable = 0;
    public static final PrayerTimesCalculator INSTANCE = new PrayerTimesCalculator();

    private PrayerTimesCalculator() {
    }

    /* compiled from: PrayerTimesCalculator.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;", "", "fajr", "", "sunrise", "dhuhr", "asr", "maghrib", "isha", "<init>", "(JJJJJJ)V", "getFajr", "()J", "getSunrise", "getDhuhr", "getAsr", "getMaghrib", "getIsha", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class DayPrayerTimes {
        public static final int $stable = 0;
        private final long asr;
        private final long dhuhr;
        private final long fajr;
        private final long isha;
        private final long maghrib;
        private final long sunrise;

        public static /* synthetic */ DayPrayerTimes copy$default(DayPrayerTimes dayPrayerTimes, long j, long j2, long j3, long j4, long j5, long j6, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dayPrayerTimes.fajr;
            }
            return dayPrayerTimes.copy(j, (i & 2) != 0 ? dayPrayerTimes.sunrise : j2, (i & 4) != 0 ? dayPrayerTimes.dhuhr : j3, (i & 8) != 0 ? dayPrayerTimes.asr : j4, (i & 16) != 0 ? dayPrayerTimes.maghrib : j5, (i & 32) != 0 ? dayPrayerTimes.isha : j6);
        }

        public final DayPrayerTimes copy(long fajr, long sunrise, long dhuhr, long asr, long maghrib, long isha) {
            return new DayPrayerTimes(fajr, sunrise, dhuhr, asr, maghrib, isha);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DayPrayerTimes)) {
                return false;
            }
            DayPrayerTimes dayPrayerTimes = (DayPrayerTimes) other;
            return this.fajr == dayPrayerTimes.fajr && this.sunrise == dayPrayerTimes.sunrise && this.dhuhr == dayPrayerTimes.dhuhr && this.asr == dayPrayerTimes.asr && this.maghrib == dayPrayerTimes.maghrib && this.isha == dayPrayerTimes.isha;
        }

        public int hashCode() {
            return (((((((((PrayerTimesCalculator$DayPrayerTimes$$ExternalSyntheticBackport0.m(this.fajr) * 31) + PrayerTimesCalculator$DayPrayerTimes$$ExternalSyntheticBackport0.m(this.sunrise)) * 31) + PrayerTimesCalculator$DayPrayerTimes$$ExternalSyntheticBackport0.m(this.dhuhr)) * 31) + PrayerTimesCalculator$DayPrayerTimes$$ExternalSyntheticBackport0.m(this.asr)) * 31) + PrayerTimesCalculator$DayPrayerTimes$$ExternalSyntheticBackport0.m(this.maghrib)) * 31) + PrayerTimesCalculator$DayPrayerTimes$$ExternalSyntheticBackport0.m(this.isha);
        }

        public String toString() {
            return "DayPrayerTimes(fajr=" + this.fajr + ", sunrise=" + this.sunrise + ", dhuhr=" + this.dhuhr + ", asr=" + this.asr + ", maghrib=" + this.maghrib + ", isha=" + this.isha + ")";
        }

        public DayPrayerTimes(long fajr, long sunrise, long dhuhr, long asr, long maghrib, long isha) {
            this.fajr = fajr;
            this.sunrise = sunrise;
            this.dhuhr = dhuhr;
            this.asr = asr;
            this.maghrib = maghrib;
            this.isha = isha;
        }

        public final long getFajr() {
            return this.fajr;
        }

        public final long getSunrise() {
            return this.sunrise;
        }

        public final long getDhuhr() {
            return this.dhuhr;
        }

        public final long getAsr() {
            return this.asr;
        }

        public final long getMaghrib() {
            return this.maghrib;
        }

        public final long getIsha() {
            return this.isha;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PrayerTimesCalculator.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;", "", "transit", "", "declination", "<init>", "(DD)V", "getTransit", "()D", "getDeclination", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class SolarParams {
        private final double declination;
        private final double transit;

        public static /* synthetic */ SolarParams copy$default(SolarParams solarParams, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = solarParams.transit;
            }
            if ((i & 2) != 0) {
                d2 = solarParams.declination;
            }
            return solarParams.copy(d, d2);
        }

        public final SolarParams copy(double transit, double declination) {
            return new SolarParams(transit, declination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SolarParams)) {
                return false;
            }
            SolarParams solarParams = (SolarParams) other;
            return Double.compare(this.transit, solarParams.transit) == 0 && Double.compare(this.declination, solarParams.declination) == 0;
        }

        public int hashCode() {
            return (PrayerTimesCalculator$SolarParams$$ExternalSyntheticBackport0.m(this.transit) * 31) + PrayerTimesCalculator$SolarParams$$ExternalSyntheticBackport0.m(this.declination);
        }

        public String toString() {
            return "SolarParams(transit=" + this.transit + ", declination=" + this.declination + ")";
        }

        public SolarParams(double transit, double declination) {
            this.transit = transit;
            this.declination = declination;
        }

        public final double getDeclination() {
            return this.declination;
        }

        public final double getTransit() {
            return this.transit;
        }
    }

    private final SolarParams solarParams(Calendar calendar, double longitude) {
        int year = calendar.get(1);
        int month = calendar.get(2) + 1;
        int day = calendar.get(5);
        double d = ((((year * 367.0d) - Math.floor(((year + Math.floor((month + 9.0d) / 12.0d)) * 7.0d) / 4.0d)) + Math.floor((month * 275.0d) / 9.0d)) + day) - 730531.5d;
        double g = fixAngle((0.98560028d * d) + 357.529d);
        double q = fixAngle((0.98564736d * d) + 280.459d);
        double l = fixAngle((Math.sin(Math.toRadians(g)) * 1.915d) + q + (Math.sin(Math.toRadians(2.0d * g)) * 0.02d));
        double e = 23.439d - (3.6E-7d * d);
        double ra = fixAngle(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(e)) * Math.sin(Math.toRadians(l)), Math.cos(Math.toRadians(l))))) / 15.0d;
        double declination = Math.toDegrees(Math.asin(Math.sin(Math.toRadians(e)) * Math.sin(Math.toRadians(l))));
        double eqOfTime = (q / 15.0d) - ra;
        double timeZoneOffsetHours = TimeZone.getDefault().getOffset(calendar.getTimeInMillis()) / 3600000.0d;
        return new SolarParams(((((timeZoneOffsetHours * 15.0d) - longitude) / 15.0d) + 12.0d) - eqOfTime, declination);
    }

    private final double hourAngleBelowHorizon(double angle, double latitude, double declination) {
        double cosH = ((-Math.sin(Math.toRadians(angle))) - (Math.sin(Math.toRadians(latitude)) * Math.sin(Math.toRadians(declination)))) / (Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(declination)));
        boolean z = false;
        if (-1.0d <= cosH && cosH <= 1.0d) {
            z = true;
        }
        if (z) {
            return Math.toDegrees(Math.acos(cosH));
        }
        return 22.5d;
    }

    private final double hourAngleAboveHorizon(double altitude, double latitude, double declination) {
        double cosH = (Math.sin(Math.toRadians(altitude)) - (Math.sin(Math.toRadians(latitude)) * Math.sin(Math.toRadians(declination)))) / (Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(declination)));
        boolean z = false;
        if (-1.0d <= cosH && cosH <= 1.0d) {
            z = true;
        }
        if (z) {
            return Math.toDegrees(Math.acos(cosH));
        }
        return 22.5d;
    }

    private final long hoursToMillis(Calendar calendar, double utcHours) {
        Object clone = calendar.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar targetCal = (Calendar) clone;
        int hours = (int) Math.floor(utcHours);
        double minutesDouble = (utcHours - hours) * 60.0d;
        int minutes = (int) Math.floor(minutesDouble);
        int seconds = (int) Math.floor((minutesDouble - minutes) * 60.0d);
        targetCal.set(11, hours);
        targetCal.set(12, minutes);
        targetCal.set(13, seconds);
        targetCal.set(14, 0);
        return targetCal.getTimeInMillis();
    }

    public static /* synthetic */ long calculateFajrTime$default(PrayerTimesCalculator prayerTimesCalculator, Calendar calendar, double d, double d2, CalculationMethod calculationMethod, int i, Object obj) {
        CalculationMethod calculationMethod2;
        if ((i & 8) == 0) {
            calculationMethod2 = calculationMethod;
        } else {
            calculationMethod2 = CalculationMethod.EGYPTIAN;
        }
        return prayerTimesCalculator.calculateFajrTime(calendar, d, d2, calculationMethod2);
    }

    public final long calculateFajrTime(Calendar calendar, double latitude, double longitude, CalculationMethod method) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(method, "method");
        SolarParams solarParams = solarParams(calendar, longitude);
        double transit = solarParams.getTransit();
        double declination = solarParams.getDeclination();
        double h = hourAngleBelowHorizon(method.getFajrAngle(), latitude, declination);
        return hoursToMillis(calendar, transit - (h / 15.0d));
    }

    public static /* synthetic */ DayPrayerTimes calculateAll$default(PrayerTimesCalculator prayerTimesCalculator, Calendar calendar, double d, double d2, CalculationMethod calculationMethod, int i, Object obj) {
        CalculationMethod calculationMethod2;
        if ((i & 8) == 0) {
            calculationMethod2 = calculationMethod;
        } else {
            calculationMethod2 = CalculationMethod.EGYPTIAN;
        }
        return prayerTimesCalculator.calculateAll(calendar, d, d2, calculationMethod2);
    }

    public final DayPrayerTimes calculateAll(Calendar calendar, double latitude, double longitude, CalculationMethod method) {
        long isha;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(method, "method");
        SolarParams solarParams = solarParams(calendar, longitude);
        double transit = solarParams.getTransit();
        double declination = solarParams.getDeclination();
        double fajrH = hourAngleBelowHorizon(method.getFajrAngle(), latitude, declination);
        double sunH = hourAngleBelowHorizon(0.833d, latitude, declination);
        double asrAltitude = Math.toDegrees(Math.atan(1.0d / (Math.tan(Math.toRadians(Math.abs(latitude - declination))) + 1.0d)));
        double asrH = hourAngleAboveHorizon(asrAltitude, latitude, declination);
        long maghrib = hoursToMillis(calendar, (sunH / 15.0d) + transit);
        if (method.getIshaMinutesAfterMaghrib() != null) {
            isha = maghrib + (method.getIshaMinutesAfterMaghrib().intValue() * 60000);
        } else {
            Double ishaAngle = method.getIshaAngle();
            double ishaH = hourAngleBelowHorizon(ishaAngle != null ? ishaAngle.doubleValue() : 17.0d, latitude, declination);
            isha = hoursToMillis(calendar, (ishaH / 15.0d) + transit);
        }
        return new DayPrayerTimes(hoursToMillis(calendar, transit - (fajrH / 15.0d)), hoursToMillis(calendar, transit - (sunH / 15.0d)), hoursToMillis(calendar, transit), hoursToMillis(calendar, (asrH / 15.0d) + transit), maghrib, isha);
    }

    private final double fixAngle(double angle) {
        double a = angle % 360.0d;
        if (a < 0.0d) {
            return a + 360.0d;
        }
        return a;
    }
}
