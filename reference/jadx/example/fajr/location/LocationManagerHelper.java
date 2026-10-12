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
        boolean z;
        boolean z2;
        boolean z3;
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            Geocoder geocoder = new Geocoder(this.context, new Locale("ar"));
            List addresses = geocoder.getFromLocation(latitude, longitude, 1);
            List list = addresses;
            if (list != null && !list.isEmpty()) {
                z = false;
                if (z) {
                    Address address = addresses.get(0);
                    String city = address.getLocality();
                    if (city == null && (city = address.getSubAdminArea()) == null) {
                        city = address.getAdminArea();
                    }
                    String country = address.getCountryName();
                    String str = city;
                    if (str != null && str.length() != 0) {
                        z2 = false;
                        if (!z2) {
                            String str2 = country;
                            if (str2 != null && str2.length() != 0) {
                                z3 = false;
                                if (!z3) {
                                    return city + "، " + country;
                                }
                            }
                            z3 = true;
                            if (!z3) {
                            }
                        }
                        return country != null ? city == null ? "موقعك الحالي" : city : country;
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    if (country != null) {
                    }
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.US, "%.2f, %.2f", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(longitude)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return "موقعك الحالي (" + format + ")";
                }
            }
            z = true;
            if (z) {
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.US, "%.2f, %.2f", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(longitude)}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return "موقعك الحالي (" + format2 + ")";
        }
    }
}
