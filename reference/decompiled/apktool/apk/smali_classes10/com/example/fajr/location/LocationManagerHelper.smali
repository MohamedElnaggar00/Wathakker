.class public final Lcom/example/fajr/location/LocationManagerHelper;
.super Ljava/lang/Object;
.source "LocationManagerHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0008\u001a\u00020\u0007J\u0008\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/example/fajr/location/LocationManagerHelper;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "hasLocationPermission",
        "",
        "isGpsEnabled",
        "getLastKnownLocation",
        "Landroid/location/Location;",
        "getCityNameFromCoordinates",
        "",
        "latitude",
        "",
        "longitude",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/fajr/location/LocationManagerHelper;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/location/LocationManagerHelper;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getCityNameFromCoordinates(DD)Ljava/lang/String;
    .locals 18
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .line 49
    const-string v1, ")"

    const-string v2, "\u0645\u0648\u0642\u0639\u0643 \u0627\u0644\u062d\u0627\u0644\u064a ("

    const-string v3, "format(...)"

    const-string v4, "%.2f, %.2f"

    .line 50
    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    :try_start_0
    new-instance v0, Landroid/location/Geocoder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v8, p0

    :try_start_1
    iget-object v9, v8, Lcom/example/fajr/location/LocationManagerHelper;->context:Landroid/content/Context;

    new-instance v10, Ljava/util/Locale;

    const-string v11, "ar"

    invoke-direct {v10, v11}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v9, v10}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    move-object v12, v0

    .line 52
    .local v12, "geocoder":Landroid/location/Geocoder;
    const/16 v17, 0x1

    move-wide/from16 v13, p1

    move-wide/from16 v15, p3

    invoke-virtual/range {v12 .. v17}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v0

    .line 51
    nop

    .line 53
    .local v0, "addresses":Ljava/util/List;
    move-object v9, v0

    check-cast v9, Ljava/util/Collection;

    if-eqz v9, :cond_1

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_0

    :cond_0
    move v9, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v9, v6

    :goto_1
    if-nez v9, :cond_9

    .line 54
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/location/Address;

    .line 55
    .local v9, "address":Landroid/location/Address;
    invoke-virtual {v9}, Landroid/location/Address;->getLocality()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_2

    invoke-virtual {v9}, Landroid/location/Address;->getSubAdminArea()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_2

    invoke-virtual {v9}, Landroid/location/Address;->getAdminArea()Ljava/lang/String;

    move-result-object v10

    .line 56
    .local v10, "city":Ljava/lang/String;
    :cond_2
    invoke-virtual {v9}, Landroid/location/Address;->getCountryName()Ljava/lang/String;

    move-result-object v11

    .line 57
    .local v11, "country":Ljava/lang/String;
    move-object v13, v10

    check-cast v13, Ljava/lang/CharSequence;

    if-eqz v13, :cond_4

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-nez v13, :cond_3

    goto :goto_2

    :cond_3
    move v13, v7

    goto :goto_3

    :cond_4
    :goto_2
    move v13, v6

    :goto_3
    if-nez v13, :cond_7

    move-object v13, v11

    check-cast v13, Ljava/lang/CharSequence;

    if-eqz v13, :cond_6

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-nez v13, :cond_5

    goto :goto_4

    :cond_5
    move v13, v7

    goto :goto_5

    :cond_6
    :goto_4
    move v13, v6

    :goto_5
    if-nez v13, :cond_7

    .line 58
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\u060c "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v10, v1

    goto :goto_6

    .line 59
    :cond_7
    if-nez v11, :cond_8

    if-nez v10, :cond_a

    const-string v1, "\u0645\u0648\u0642\u0639\u0643 \u0627\u0644\u062d\u0627\u0644\u064a"

    move-object v10, v1

    .end local v9    # "address":Landroid/location/Address;
    .end local v10    # "city":Ljava/lang/String;
    .end local v11    # "country":Ljava/lang/String;
    goto :goto_6

    .restart local v9    # "address":Landroid/location/Address;
    .restart local v10    # "city":Ljava/lang/String;
    .restart local v11    # "country":Ljava/lang/String;
    :cond_8
    move-object v10, v11

    goto :goto_6

    .line 61
    .end local v9    # "address":Landroid/location/Address;
    .end local v10    # "city":Ljava/lang/String;
    .end local v11    # "country":Ljava/lang/String;
    :cond_9
    sget-object v9, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static/range {p3 .. p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    new-array v13, v5, [Ljava/lang/Object;

    aput-object v10, v13, v7

    aput-object v11, v13, v6

    invoke-static {v13, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v4, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .end local v0    # "addresses":Ljava/util/List;
    .end local v12    # "geocoder":Landroid/location/Geocoder;
    :cond_a
    :goto_6
    goto :goto_8

    .line 63
    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    move-object/from16 v8, p0

    .line 64
    .local v0, "e":Ljava/lang/Exception;
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 65
    sget-object v9, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static/range {p3 .. p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    new-array v12, v5, [Ljava/lang/Object;

    aput-object v10, v12, v7

    aput-object v11, v12, v6

    invoke-static {v12, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 49
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_8
    return-object v10
.end method

.method public final getLastKnownLocation()Landroid/location/Location;
    .locals 7

    .line 27
    const-string v0, "passive"

    const-string v1, "network"

    const-string v2, "gps"

    invoke-virtual {p0}, Lcom/example/fajr/location/LocationManagerHelper;->hasLocationPermission()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return-object v4

    .line 28
    :cond_0
    iget-object v3, p0, Lcom/example/fajr/location/LocationManagerHelper;->context:Landroid/content/Context;

    const-string v5, "location"

    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Landroid/location/LocationManager;

    if-eqz v5, :cond_1

    check-cast v3, Landroid/location/LocationManager;

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-nez v3, :cond_2

    return-object v4

    .line 30
    .local v3, "locationManager":Landroid/location/LocationManager;
    :cond_2
    nop

    .line 31
    const/4 v5, 0x0

    .line 32
    .local v5, "location":Landroid/location/Location;
    :try_start_0
    invoke-virtual {v3, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 33
    invoke-virtual {v3, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v2

    move-object v5, v2

    .line 35
    :cond_3
    if-nez v5, :cond_4

    invoke-virtual {v3, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 36
    invoke-virtual {v3, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v1

    move-object v5, v1

    .line 38
    :cond_4
    if-nez v5, :cond_5

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 39
    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .end local v5    # "location":Landroid/location/Location;
    .local v0, "location":Landroid/location/Location;
    goto :goto_1

    .line 41
    .end local v0    # "location":Landroid/location/Location;
    .restart local v5    # "location":Landroid/location/Location;
    :cond_5
    move-object v4, v5

    .end local v5    # "location":Landroid/location/Location;
    .local v4, "location":Landroid/location/Location;
    :goto_1
    nop

    .end local v4    # "location":Landroid/location/Location;
    goto :goto_2

    .line 42
    :catch_0
    move-exception v0

    .line 43
    .local v0, "e":Ljava/lang/SecurityException;
    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    .line 44
    nop

    .line 30
    .end local v0    # "e":Ljava/lang/SecurityException;
    :goto_2
    return-object v4
.end method

.method public final hasLocationPermission()Z
    .locals 5

    .line 15
    iget-object v0, p0, Lcom/example/fajr/location/LocationManagerHelper;->context:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 16
    .local v0, "fine":Z
    :goto_0
    iget-object v3, p0, Lcom/example/fajr/location/LocationManagerHelper;->context:Landroid/content/Context;

    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    .line 17
    .local v3, "coarse":Z
    :goto_1
    if-nez v0, :cond_3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :cond_3
    :goto_2
    return v1
.end method

.method public final isGpsEnabled()Z
    .locals 3

    .line 21
    iget-object v0, p0, Lcom/example/fajr/location/LocationManagerHelper;->context:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/location/LocationManager;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/location/LocationManager;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 22
    .local v0, "locationManager":Landroid/location/LocationManager;
    :cond_1
    const-string v2, "gps"

    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 23
    const-string v2, "network"

    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    const/4 v1, 0x1

    .line 22
    :cond_3
    return v1
.end method
