package com.example.fajr.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CitiesDatabase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, d2 = {"Lcom/example/fajr/data/CityItem;", "", "cityNameAr", "", "cityNameEn", "countryNameAr", "countryNameEn", "latitude", "", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getCityNameAr", "()Ljava/lang/String;", "getCityNameEn", "getCountryNameAr", "getCountryNameEn", "getLatitude", "()D", "getLongitude", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CityItem {
    public static final int $stable = 0;
    private final String cityNameAr;
    private final String cityNameEn;
    private final String countryNameAr;
    private final String countryNameEn;
    private final double latitude;
    private final double longitude;

    public static /* synthetic */ CityItem copy$default(CityItem cityItem, String str, String str2, String str3, String str4, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cityItem.cityNameAr;
        }
        if ((i & 2) != 0) {
            str2 = cityItem.cityNameEn;
        }
        if ((i & 4) != 0) {
            str3 = cityItem.countryNameAr;
        }
        if ((i & 8) != 0) {
            str4 = cityItem.countryNameEn;
        }
        if ((i & 16) != 0) {
            d = cityItem.latitude;
        }
        if ((i & 32) != 0) {
            d2 = cityItem.longitude;
        }
        double d3 = d2;
        double d4 = d;
        return cityItem.copy(str, str2, str3, str4, d4, d3);
    }

    public final CityItem copy(String cityNameAr, String cityNameEn, String countryNameAr, String countryNameEn, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(cityNameAr, "cityNameAr");
        Intrinsics.checkNotNullParameter(cityNameEn, "cityNameEn");
        Intrinsics.checkNotNullParameter(countryNameAr, "countryNameAr");
        Intrinsics.checkNotNullParameter(countryNameEn, "countryNameEn");
        return new CityItem(cityNameAr, cityNameEn, countryNameAr, countryNameEn, latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityItem)) {
            return false;
        }
        CityItem cityItem = (CityItem) other;
        return Intrinsics.areEqual(this.cityNameAr, cityItem.cityNameAr) && Intrinsics.areEqual(this.cityNameEn, cityItem.cityNameEn) && Intrinsics.areEqual(this.countryNameAr, cityItem.countryNameAr) && Intrinsics.areEqual(this.countryNameEn, cityItem.countryNameEn) && Double.compare(this.latitude, cityItem.latitude) == 0 && Double.compare(this.longitude, cityItem.longitude) == 0;
    }

    public int hashCode() {
        return (((((((((this.cityNameAr.hashCode() * 31) + this.cityNameEn.hashCode()) * 31) + this.countryNameAr.hashCode()) * 31) + this.countryNameEn.hashCode()) * 31) + CityItem$$ExternalSyntheticBackport0.m(this.latitude)) * 31) + CityItem$$ExternalSyntheticBackport0.m(this.longitude);
    }

    public String toString() {
        return "CityItem(cityNameAr=" + this.cityNameAr + ", cityNameEn=" + this.cityNameEn + ", countryNameAr=" + this.countryNameAr + ", countryNameEn=" + this.countryNameEn + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    public CityItem(String cityNameAr, String cityNameEn, String countryNameAr, String countryNameEn, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(cityNameAr, "cityNameAr");
        Intrinsics.checkNotNullParameter(cityNameEn, "cityNameEn");
        Intrinsics.checkNotNullParameter(countryNameAr, "countryNameAr");
        Intrinsics.checkNotNullParameter(countryNameEn, "countryNameEn");
        this.cityNameAr = cityNameAr;
        this.cityNameEn = cityNameEn;
        this.countryNameAr = countryNameAr;
        this.countryNameEn = countryNameEn;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public final String getCityNameAr() {
        return this.cityNameAr;
    }

    public final String getCityNameEn() {
        return this.cityNameEn;
    }

    public final String getCountryNameAr() {
        return this.countryNameAr;
    }

    public final String getCountryNameEn() {
        return this.countryNameEn;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }
}
