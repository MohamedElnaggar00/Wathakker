package com.example.fajr.location;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.ContextCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: LocationManagerHelper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/fajr/location/LocationManagerHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "hasLocationPermission", "", "isGpsEnabled", "getLastKnownLocation", "Landroid/location/Location;", "getCityNameFromCoordinates", "", "latitude", "", "longitude", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LocationManagerHelper {
    public static final int $stable = 8;
    private final Context context;

    public LocationManagerHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final boolean hasLocationPermission() {
        boolean fine = ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean coarse = ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        return fine || coarse;
    }

    public final boolean isGpsEnabled() {
        Object systemService = this.context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return false;
        }
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public final Location getLastKnownLocation() {
        if (!hasLocationPermission()) {
            return null;
        }
        Object systemService = this.context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return null;
        }
        Location location = null;
        try {
            if (locationManager.isProviderEnabled("gps")) {
                location = locationManager.getLastKnownLocation("gps");
            }
            if (location == null && locationManager.isProviderEnabled("network")) {
                location = locationManager.getLastKnownLocation("network");
            }
            if (location == null && locationManager.isProviderEnabled("passive")) {
                return locationManager.getLastKnownLocation("passive");
            }
            return location;
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    /** Stable structural identity of the geocoded place (English-locale geocode): "g|<countryCode>|<adminArea>|<locality|subAdmin>", normalized. Null when the geocoder cannot resolve - callers must skip alias save/apply in that case. */
    public final String getPlaceKeyFromCoordinates(double latitude, double longitude) {
        try {
            Geocoder geocoder = new Geocoder(this.context, Locale.ENGLISH);
            List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);
            if (addresses == null || addresses.isEmpty()) {
                return null;
            }
            Address address = addresses.get(0);
            String country = address.getCountryCode();
            String admin = address.getAdminArea();
            String local = address.getLocality();
            if (local == null) {
                local = address.getSubAdminArea();
            }
            if (country == null && admin == null && local == null) {
                return null;
            }
            return "g|" + normPlacePart(country) + "|" + normPlacePart(admin) + "|" + normPlacePart(local);
        } catch (Exception e) {
            return null;
        }
    }

    private static String normPlacePart(String s) {
        return s == null ? "" : s.trim().toLowerCase(Locale.US).replaceAll("\\s+", " ");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:6:0x000f, B:8:0x002c, B:13:0x0038, B:15:0x0044, B:17:0x004a, B:18:0x004e, B:20:0x0057, B:25:0x0063, B:27:0x0068, B:32:0x0074, B:44:0x0097), top: B:5:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:6:0x000f, B:8:0x002c, B:13:0x0038, B:15:0x0044, B:17:0x004a, B:18:0x004e, B:20:0x0057, B:25:0x0063, B:27:0x0068, B:32:0x0074, B:44:0x0097), top: B:5:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:6:0x000f, B:8:0x002c, B:13:0x0038, B:15:0x0044, B:17:0x004a, B:18:0x004e, B:20:0x0057, B:25:0x0063, B:27:0x0068, B:32:0x0074, B:44:0x0097), top: B:5:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097 A[Catch: Exception -> 0x00ca, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ca, blocks: (B:6:0x000f, B:8:0x002c, B:13:0x0038, B:15:0x0044, B:17:0x004a, B:18:0x004e, B:20:0x0057, B:25:0x0063, B:27:0x0068, B:32:0x0074, B:44:0x0097), top: B:5:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getCityNameFromCoordinates(double latitude, double longitude) {
        return getCityNameFromCoordinates(latitude, longitude, new Locale("ar"));
    }

    public final String getCityNameFromCoordinates(double latitude, double longitude, Locale locale) {
        boolean ar = "ar".equals(locale.getLanguage());
        String unknown = ar ? "\u0645\u0648\u0642\u0639\u0643 \u0627\u0644\u062d\u0627\u0644\u064a" : "Current location";
        try {
            Geocoder geocoder = new Geocoder(this.context, locale);
            List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);
            if (addresses != null && !addresses.isEmpty()) {
                Address address = addresses.get(0);
                String city = address.getLocality();
                if (city == null) {
                    city = address.getSubAdminArea();
                }
                if (city == null) {
                    city = address.getAdminArea();
                }
                String country = address.getCountryName();
                if (city != null && city.length() != 0 && country != null && country.length() != 0) {
                    return ar ? city + "\u060c " + country : city + ", " + country;
                }
                if (country == null) {
                    return city == null ? unknown : city;
                }
                return country;
            }
            return unknown + " (" + String.format(Locale.US, "%.2f, %.2f", Double.valueOf(latitude), Double.valueOf(longitude)) + ")";
        } catch (Exception e) {
            e.printStackTrace();
            return unknown + " (" + String.format(Locale.US, "%.2f, %.2f", Double.valueOf(latitude), Double.valueOf(longitude)) + ")";
        }
    }
}

