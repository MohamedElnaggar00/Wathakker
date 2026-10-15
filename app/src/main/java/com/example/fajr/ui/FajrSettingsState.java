package com.example.fajr.ui;

import com.example.fajr.calculation.CalculationMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FajrViewModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0012HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0012HÖ\u0001J\t\u0010=\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006>"}, d2 = {"Lcom/example/fajr/ui/FajrSettingsState;", "", "isAlarmEnabled", "", "useCurrentLocation", "cityName", "", "latitude", "", "longitude", "nextFajrTimeFormatted", "nextFajrMillis", "", "calculationMethod", "Lcom/example/fajr/calculation/CalculationMethod;", "ringtoneTitle", "isVibrationEnabled", "maxDurationMinutes", "", "alarmVolume", "isRefreshing", "isGpsAvailable", "hasLocationPermission", "<init>", "(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZ)V", "()Z", "getUseCurrentLocation", "getCityName", "()Ljava/lang/String;", "getLatitude", "()D", "getLongitude", "getNextFajrTimeFormatted", "getNextFajrMillis", "()J", "getCalculationMethod", "()Lcom/example/fajr/calculation/CalculationMethod;", "getRingtoneTitle", "getMaxDurationMinutes", "()I", "getAlarmVolume", "getHasLocationPermission", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FajrSettingsState {
    public static final int $stable = 0;
    private final int alarmVolume;
    private final CalculationMethod calculationMethod;
    private final String cityName;
    private final boolean hasLocationPermission;
    private final boolean isAlarmEnabled;
    private final boolean isGpsAvailable;
    private final boolean isRefreshing;
    private final boolean isVibrationEnabled;
    private final double latitude;
    private final double longitude;
    private final int maxDurationMinutes;
    private final long nextFajrMillis;
    private final String nextFajrTimeFormatted;
    private final String ringtoneTitle;
    private final boolean useCurrentLocation;

    public FajrSettingsState() {
        this(false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, false, false, false, 32767, null);
    }

    public static /* synthetic */ FajrSettingsState copy$default(FajrSettingsState fajrSettingsState, boolean z, boolean z2, String str, double d, double d2, String str2, long j, CalculationMethod calculationMethod, String str3, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, Object obj) {
        boolean z7 = (i3 & 1) != 0 ? fajrSettingsState.isAlarmEnabled : z;
        return fajrSettingsState.copy(z7, (i3 & 2) != 0 ? fajrSettingsState.useCurrentLocation : z2, (i3 & 4) != 0 ? fajrSettingsState.cityName : str, (i3 & 8) != 0 ? fajrSettingsState.latitude : d, (i3 & 16) != 0 ? fajrSettingsState.longitude : d2, (i3 & 32) != 0 ? fajrSettingsState.nextFajrTimeFormatted : str2, (i3 & 64) != 0 ? fajrSettingsState.nextFajrMillis : j, (i3 & 128) != 0 ? fajrSettingsState.calculationMethod : calculationMethod, (i3 & 256) != 0 ? fajrSettingsState.ringtoneTitle : str3, (i3 & 512) != 0 ? fajrSettingsState.isVibrationEnabled : z3, (i3 & 1024) != 0 ? fajrSettingsState.maxDurationMinutes : i, (i3 & 2048) != 0 ? fajrSettingsState.alarmVolume : i2, (i3 & 4096) != 0 ? fajrSettingsState.isRefreshing : z4, (i3 & 8192) != 0 ? fajrSettingsState.isGpsAvailable : z5, (i3 & 16384) != 0 ? fajrSettingsState.hasLocationPermission : z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAlarmEnabled() {
        return this.isAlarmEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsVibrationEnabled() {
        return this.isVibrationEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsGpsAvailable() {
        return this.isGpsAvailable;
    }

    public final FajrSettingsState copy(boolean isAlarmEnabled, boolean useCurrentLocation, String cityName, double latitude, double longitude, String nextFajrTimeFormatted, long nextFajrMillis, CalculationMethod calculationMethod, String ringtoneTitle, boolean isVibrationEnabled, int maxDurationMinutes, int alarmVolume, boolean isRefreshing, boolean isGpsAvailable, boolean hasLocationPermission) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(nextFajrTimeFormatted, "nextFajrTimeFormatted");
        Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
        Intrinsics.checkNotNullParameter(ringtoneTitle, "ringtoneTitle");
        return new FajrSettingsState(isAlarmEnabled, useCurrentLocation, cityName, latitude, longitude, nextFajrTimeFormatted, nextFajrMillis, calculationMethod, ringtoneTitle, isVibrationEnabled, maxDurationMinutes, alarmVolume, isRefreshing, isGpsAvailable, hasLocationPermission);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FajrSettingsState)) {
            return false;
        }
        FajrSettingsState fajrSettingsState = (FajrSettingsState) other;
        return this.isAlarmEnabled == fajrSettingsState.isAlarmEnabled && this.useCurrentLocation == fajrSettingsState.useCurrentLocation && Intrinsics.areEqual(this.cityName, fajrSettingsState.cityName) && Double.compare(this.latitude, fajrSettingsState.latitude) == 0 && Double.compare(this.longitude, fajrSettingsState.longitude) == 0 && Intrinsics.areEqual(this.nextFajrTimeFormatted, fajrSettingsState.nextFajrTimeFormatted) && this.nextFajrMillis == fajrSettingsState.nextFajrMillis && this.calculationMethod == fajrSettingsState.calculationMethod && Intrinsics.areEqual(this.ringtoneTitle, fajrSettingsState.ringtoneTitle) && this.isVibrationEnabled == fajrSettingsState.isVibrationEnabled && this.maxDurationMinutes == fajrSettingsState.maxDurationMinutes && this.alarmVolume == fajrSettingsState.alarmVolume && this.isRefreshing == fajrSettingsState.isRefreshing && this.isGpsAvailable == fajrSettingsState.isGpsAvailable && this.hasLocationPermission == fajrSettingsState.hasLocationPermission;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((FajrSettingsState$$ExternalSyntheticBackport0.m(this.isAlarmEnabled) * 31) + FajrSettingsState$$ExternalSyntheticBackport0.m(this.useCurrentLocation)) * 31) + this.cityName.hashCode()) * 31) + FajrSettingsState$$ExternalSyntheticBackport1.m(this.latitude)) * 31) + FajrSettingsState$$ExternalSyntheticBackport1.m(this.longitude)) * 31) + this.nextFajrTimeFormatted.hashCode()) * 31) + FajrSettingsState$$ExternalSyntheticBackport2.m(this.nextFajrMillis)) * 31) + this.calculationMethod.hashCode()) * 31) + this.ringtoneTitle.hashCode()) * 31) + FajrSettingsState$$ExternalSyntheticBackport0.m(this.isVibrationEnabled)) * 31) + this.maxDurationMinutes) * 31) + this.alarmVolume) * 31) + FajrSettingsState$$ExternalSyntheticBackport0.m(this.isRefreshing)) * 31) + FajrSettingsState$$ExternalSyntheticBackport0.m(this.isGpsAvailable)) * 31) + FajrSettingsState$$ExternalSyntheticBackport0.m(this.hasLocationPermission);
    }

    public String toString() {
        return "FajrSettingsState(isAlarmEnabled=" + this.isAlarmEnabled + ", useCurrentLocation=" + this.useCurrentLocation + ", cityName=" + this.cityName + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", nextFajrTimeFormatted=" + this.nextFajrTimeFormatted + ", nextFajrMillis=" + this.nextFajrMillis + ", calculationMethod=" + this.calculationMethod + ", ringtoneTitle=" + this.ringtoneTitle + ", isVibrationEnabled=" + this.isVibrationEnabled + ", maxDurationMinutes=" + this.maxDurationMinutes + ", alarmVolume=" + this.alarmVolume + ", isRefreshing=" + this.isRefreshing + ", isGpsAvailable=" + this.isGpsAvailable + ", hasLocationPermission=" + this.hasLocationPermission + ")";
    }

    public FajrSettingsState(boolean isAlarmEnabled, boolean useCurrentLocation, String cityName, double latitude, double longitude, String nextFajrTimeFormatted, long nextFajrMillis, CalculationMethod calculationMethod, String ringtoneTitle, boolean isVibrationEnabled, int maxDurationMinutes, int alarmVolume, boolean isRefreshing, boolean isGpsAvailable, boolean hasLocationPermission) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(nextFajrTimeFormatted, "nextFajrTimeFormatted");
        Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
        Intrinsics.checkNotNullParameter(ringtoneTitle, "ringtoneTitle");
        this.isAlarmEnabled = isAlarmEnabled;
        this.useCurrentLocation = useCurrentLocation;
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.nextFajrTimeFormatted = nextFajrTimeFormatted;
        this.nextFajrMillis = nextFajrMillis;
        this.calculationMethod = calculationMethod;
        this.ringtoneTitle = ringtoneTitle;
        this.isVibrationEnabled = isVibrationEnabled;
        this.maxDurationMinutes = maxDurationMinutes;
        this.alarmVolume = alarmVolume;
        this.isRefreshing = isRefreshing;
        this.isGpsAvailable = isGpsAvailable;
        this.hasLocationPermission = hasLocationPermission;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FajrSettingsState(boolean z, boolean z2, String str, double d, double d2, String str2, long j, CalculationMethod calculationMethod, String str3, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? "\u0627\u0644\u0642\u0627\u0647\u0631\u0629\u060c \u0645\u0635\u0631" : str, (i3 & 8) != 0 ? 30.0444d : d, (i3 & 16) != 0 ? 31.2357d : d2, (i3 & 32) != 0 ? "--:--" : str2, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? CalculationMethod.EGYPTIAN : calculationMethod, (i3 & 256) != 0 ? "\u0646\u063a\u0645\u0629 \u0627\u0644\u0645\u0646\u0628\u0647 \u0627\u0644\u0627\u0641\u062a\u0631\u0627\u0636\u064a\u0629" : str3, (i3 & 512) != 0 ? true : z3, (i3 & 1024) != 0 ? 5 : i, (i3 & 2048) != 0 ? 80 : i2, (i3 & 4096) != 0 ? false : z4, (i3 & 8192) != 0 ? true : z5, (i3 & 16384) != 0 ? false : z6);
    }


    public final boolean isAlarmEnabled() {
        return this.isAlarmEnabled;
    }

    public final boolean getUseCurrentLocation() {
        return this.useCurrentLocation;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getNextFajrTimeFormatted() {
        return this.nextFajrTimeFormatted;
    }

    public final long getNextFajrMillis() {
        return this.nextFajrMillis;
    }

    public final CalculationMethod getCalculationMethod() {
        return this.calculationMethod;
    }

    public final String getRingtoneTitle() {
        return this.ringtoneTitle;
    }

    public final boolean isVibrationEnabled() {
        return this.isVibrationEnabled;
    }

    public final int getMaxDurationMinutes() {
        return this.maxDurationMinutes;
    }

    public final int getAlarmVolume() {
        return this.alarmVolume;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final boolean isGpsAvailable() {
        return this.isGpsAvailable;
    }

    public final boolean getHasLocationPermission() {
        return this.hasLocationPermission;
    }
}
