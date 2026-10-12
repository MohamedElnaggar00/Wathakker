.class public final Lcom/example/fajr/calculation/PrayerTimesCalculator;
.super Ljava/lang/Object;
.source "PrayerTimesCalculator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;,
        Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002J \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0002J(\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/example/fajr/calculation/PrayerTimesCalculator;",
        "",
        "<init>",
        "()V",
        "solarParams",
        "Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;",
        "calendar",
        "Ljava/util/Calendar;",
        "longitude",
        "",
        "hourAngleBelowHorizon",
        "angle",
        "latitude",
        "declination",
        "hourAngleAboveHorizon",
        "altitude",
        "hoursToMillis",
        "",
        "utcHours",
        "calculateFajrTime",
        "method",
        "Lcom/example/fajr/calculation/CalculationMethod;",
        "calculateAll",
        "Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;",
        "fixAngle",
        "DayPrayerTimes",
        "SolarParams",
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

.field public static final INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/example/fajr/calculation/PrayerTimesCalculator;

    invoke-direct {v0}, Lcom/example/fajr/calculation/PrayerTimesCalculator;-><init>()V

    sput-object v0, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic calculateAll$default(Lcom/example/fajr/calculation/PrayerTimesCalculator;Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;ILjava/lang/Object;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;
    .locals 7

    .line 121
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    .line 125
    sget-object p6, Lcom/example/fajr/calculation/CalculationMethod;->EGYPTIAN:Lcom/example/fajr/calculation/CalculationMethod;

    move-object v6, p6

    goto :goto_0

    .line 121
    :cond_0
    move-object v6, p6

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateAll(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic calculateFajrTime$default(Lcom/example/fajr/calculation/PrayerTimesCalculator;Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;ILjava/lang/Object;)J
    .locals 7

    .line 106
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    .line 110
    sget-object p6, Lcom/example/fajr/calculation/CalculationMethod;->EGYPTIAN:Lcom/example/fajr/calculation/CalculationMethod;

    move-object v6, p6

    goto :goto_0

    .line 106
    :cond_0
    move-object v6, p6

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateFajrTime(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final fixAngle(D)D
    .locals 6
    .param p1, "angle"    # D

    .line 154
    const-wide v0, 0x4076800000000000L    # 360.0

    rem-double v2, p1, v0

    .line 155
    .local v2, "a":D
    const-wide/16 v4, 0x0

    cmpg-double v4, v2, v4

    if-gez v4, :cond_0

    add-double/2addr v2, v0

    .line 156
    :cond_0
    return-wide v2
.end method

.method private final hourAngleAboveHorizon(DDD)D
    .locals 6
    .param p1, "altitude"    # D
    .param p3, "latitude"    # D
    .param p5, "declination"    # D

    .line 79
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {p5, p6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    .line 80
    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    invoke-static {p5, p6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    .line 79
    div-double/2addr v0, v2

    .line 81
    .local v0, "cosH":D
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpg-double v2, v2, v0

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, v0, v4

    if-gtz v2, :cond_0

    const/4 v3, 0x1

    :cond_0
    if-eqz v3, :cond_1

    .line 82
    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v2

    goto :goto_0

    .line 84
    :cond_1
    const-wide v2, 0x4036800000000000L    # 22.5

    .line 81
    :goto_0
    return-wide v2
.end method

.method private final hourAngleBelowHorizon(DDD)D
    .locals 6
    .param p1, "angle"    # D
    .param p3, "latitude"    # D
    .param p5, "declination"    # D

    .line 67
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    neg-double v0, v0

    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {p5, p6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    .line 68
    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    invoke-static {p5, p6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    .line 67
    div-double/2addr v0, v2

    .line 69
    .local v0, "cosH":D
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpg-double v2, v2, v0

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, v0, v4

    if-gtz v2, :cond_0

    const/4 v3, 0x1

    :cond_0
    if-eqz v3, :cond_1

    .line 70
    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v2

    goto :goto_0

    .line 73
    :cond_1
    const-wide v2, 0x4036800000000000L    # 22.5

    .line 69
    :goto_0
    return-wide v2
.end method

.method private final hoursToMillis(Ljava/util/Calendar;D)J
    .locals 9
    .param p1, "calendar"    # Ljava/util/Calendar;
    .param p2, "utcHours"    # D

    .line 89
    invoke-virtual {p1}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.util.Calendar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Calendar;

    .line 90
    .local v0, "targetCal":Ljava/util/Calendar;
    invoke-static {p2, p3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    .line 91
    .local v1, "hours":I
    int-to-double v2, v1

    sub-double v2, p2, v2

    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    mul-double/2addr v2, v4

    .line 92
    .local v2, "minutesDouble":D
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v6, v6

    .line 93
    .local v6, "minutes":I
    int-to-double v7, v6

    sub-double v7, v2, v7

    mul-double/2addr v7, v4

    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v4, v4

    .line 95
    .local v4, "seconds":I
    const/16 v5, 0xb

    invoke-virtual {v0, v5, v1}, Ljava/util/Calendar;->set(II)V

    .line 96
    const/16 v5, 0xc

    invoke-virtual {v0, v5, v6}, Ljava/util/Calendar;->set(II)V

    .line 97
    const/16 v5, 0xd

    invoke-virtual {v0, v5, v4}, Ljava/util/Calendar;->set(II)V

    .line 98
    const/16 v5, 0xe

    const/4 v7, 0x0

    invoke-virtual {v0, v5, v7}, Ljava/util/Calendar;->set(II)V

    .line 99
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v7

    return-wide v7
.end method

.method private final solarParams(Ljava/util/Calendar;D)Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;
    .locals 29
    .param p1, "calendar"    # Ljava/util/Calendar;
    .param p2, "longitude"    # D

    .line 40
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 41
    .local v3, "year":I
    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/2addr v4, v2

    .line 42
    .local v4, "month":I
    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 45
    .local v2, "day":I
    const-wide v5, 0x4076f00000000000L    # 367.0

    int-to-double v7, v3

    mul-double/2addr v7, v5

    int-to-double v5, v3

    int-to-double v9, v4

    const-wide/high16 v11, 0x4022000000000000L    # 9.0

    add-double/2addr v9, v11

    const-wide/high16 v13, 0x4028000000000000L    # 12.0

    div-double/2addr v9, v13

    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v9

    add-double/2addr v5, v9

    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    mul-double/2addr v5, v9

    const-wide/high16 v9, 0x4010000000000000L    # 4.0

    div-double/2addr v5, v9

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    sub-double/2addr v7, v5

    .line 46
    const-wide v5, 0x4071300000000000L    # 275.0

    int-to-double v9, v4

    mul-double/2addr v9, v5

    div-double/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    .line 45
    add-double/2addr v7, v5

    .line 46
    int-to-double v5, v2

    .line 45
    add-double/2addr v7, v5

    .line 46
    nop

    .line 45
    const-wide v5, 0x41264b4700000000L    # 730531.5

    sub-double/2addr v7, v5

    .line 48
    .local v7, "d":D
    const-wide v5, 0x3fef8a099930e901L    # 0.98560028

    mul-double/2addr v5, v7

    const-wide v9, 0x40765876c8b43958L    # 357.529

    add-double/2addr v5, v9

    invoke-direct {v0, v5, v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->fixAngle(D)D

    move-result-wide v5

    .line 49
    .local v5, "g":D
    const-wide v9, 0x3fef8a6c5512d6f2L    # 0.98564736

    mul-double/2addr v9, v7

    const-wide v11, 0x4071875810624dd3L    # 280.459

    add-double/2addr v9, v11

    invoke-direct {v0, v9, v10}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->fixAngle(D)D

    move-result-wide v9

    .line 50
    .local v9, "q":D
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    const-wide v15, 0x3ffea3d70a3d70a4L    # 1.915

    mul-double/2addr v11, v15

    add-double/2addr v11, v9

    const-wide/high16 v15, 0x4000000000000000L    # 2.0

    mul-double/2addr v15, v5

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    const-wide v17, 0x3f947ae147ae147bL    # 0.02

    mul-double v15, v15, v17

    add-double/2addr v11, v15

    invoke-direct {v0, v11, v12}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->fixAngle(D)D

    move-result-wide v11

    .line 52
    .local v11, "l":D
    const-wide v15, 0x3e9828c0be769dc1L    # 3.6E-7

    mul-double/2addr v15, v7

    const-wide v17, 0x403770624dd2f1aaL    # 23.439

    sub-double v17, v17, v15

    .line 53
    .local v17, "e":D
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v15

    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sin(D)D

    move-result-wide v19

    move-wide/from16 v21, v13

    mul-double v13, v15, v19

    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    move/from16 v19, v2

    .end local v2    # "day":I
    .local v19, "day":I
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    invoke-static {v13, v14, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->fixAngle(D)D

    move-result-wide v1

    const-wide/high16 v13, 0x402e000000000000L    # 15.0

    div-double/2addr v1, v13

    .line 55
    .local v1, "ra":D
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->sin(D)D

    move-result-wide v23

    mul-double v15, v15, v23

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->asin(D)D

    move-result-wide v15

    move-wide/from16 v23, v13

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v13

    .line 56
    .local v13, "declination":D
    div-double v15, v9, v23

    sub-double/2addr v15, v1

    .line 58
    .local v15, "eqOfTime":D
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    move-wide/from16 v25, v1

    .end local v1    # "ra":D
    .local v25, "ra":D
    invoke-virtual/range {p1 .. p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    int-to-double v0, v0

    const-wide v27, 0x414b774000000000L    # 3600000.0

    div-double v0, v0, v27

    .line 61
    .local v0, "timeZoneOffsetHours":D
    mul-double v27, v0, v23

    sub-double v27, v27, p2

    div-double v27, v27, v23

    add-double v27, v27, v21

    move-wide/from16 v20, v0

    .end local v0    # "timeZoneOffsetHours":D
    .local v20, "timeZoneOffsetHours":D
    sub-double v0, v27, v15

    .line 62
    .local v0, "transit":D
    new-instance v2, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;

    invoke-direct {v2, v0, v1, v13, v14}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;-><init>(DD)V

    return-object v2
.end method


# virtual methods
.method public final calculateAll(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;
    .locals 36
    .param p1, "calendar"    # Ljava/util/Calendar;
    .param p2, "latitude"    # D
    .param p4, "longitude"    # D
    .param p6, "method"    # Lcom/example/fajr/calculation/CalculationMethod;

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "calendar"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "method"

    move-object/from16 v8, p6

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    move-wide/from16 v9, p4

    invoke-direct {v0, v7, v9, v10}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->solarParams(Ljava/util/Calendar;D)Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->component1()D

    move-result-wide v11

    .local v11, "transit":D
    invoke-virtual {v1}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->component2()D

    move-result-wide v5

    .line 129
    .local v5, "declination":D
    invoke-virtual {v8}, Lcom/example/fajr/calculation/CalculationMethod;->getFajrAngle()D

    move-result-wide v1

    move-wide/from16 v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hourAngleBelowHorizon(DDD)D

    move-result-wide v13

    .line 130
    .local v13, "fajrH":D
    const-wide v1, 0x3feaa7ef9db22d0eL    # 0.833

    invoke-direct/range {v0 .. v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hourAngleBelowHorizon(DDD)D

    move-result-wide v15

    .line 132
    .local v15, "sunH":D
    sub-double v0, p2, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v1

    .line 133
    .local v1, "asrAltitude":D
    move-object/from16 v0, p0

    move-wide/from16 v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hourAngleAboveHorizon(DDD)D

    move-result-wide v17

    .line 135
    move-wide/from16 v19, v1

    .end local v1    # "asrAltitude":D
    .local v17, "asrH":D
    .local v19, "asrAltitude":D
    const-wide/high16 v21, 0x402e000000000000L    # 15.0

    div-double v1, v15, v21

    add-double/2addr v1, v11

    invoke-direct {v0, v7, v1, v2}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hoursToMillis(Ljava/util/Calendar;D)J

    move-result-wide v32

    .line 136
    .local v32, "maghrib":J
    invoke-virtual {v8}, Lcom/example/fajr/calculation/CalculationMethod;->getIshaMinutesAfterMaghrib()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 137
    invoke-virtual {v8}, Lcom/example/fajr/calculation/CalculationMethod;->getIshaMinutesAfterMaghrib()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    const-wide/32 v3, 0xea60

    mul-long/2addr v1, v3

    add-long v1, v32, v1

    move-wide/from16 v34, v1

    goto :goto_1

    .line 139
    :cond_0
    invoke-virtual {v8}, Lcom/example/fajr/calculation/CalculationMethod;->getIshaAngle()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    goto :goto_0

    :cond_1
    const-wide/high16 v1, 0x4031000000000000L    # 17.0

    :goto_0
    move-wide/from16 v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hourAngleBelowHorizon(DDD)D

    move-result-wide v1

    .line 140
    .local v1, "ishaH":D
    div-double v3, v1, v21

    add-double/2addr v3, v11

    invoke-direct {v0, v7, v3, v4}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hoursToMillis(Ljava/util/Calendar;D)J

    move-result-wide v3

    move-wide/from16 v34, v3

    .line 136
    .end local v1    # "ishaH":D
    :goto_1
    nop

    .line 143
    .local v34, "isha":J
    new-instance v23, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;

    .line 144
    div-double v1, v13, v21

    sub-double v1, v11, v1

    invoke-direct {v0, v7, v1, v2}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hoursToMillis(Ljava/util/Calendar;D)J

    move-result-wide v24

    .line 145
    div-double v1, v15, v21

    sub-double v1, v11, v1

    invoke-direct {v0, v7, v1, v2}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hoursToMillis(Ljava/util/Calendar;D)J

    move-result-wide v26

    .line 146
    invoke-direct {v0, v7, v11, v12}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hoursToMillis(Ljava/util/Calendar;D)J

    move-result-wide v28

    .line 147
    div-double v1, v17, v21

    add-double/2addr v1, v11

    invoke-direct {v0, v7, v1, v2}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hoursToMillis(Ljava/util/Calendar;D)J

    move-result-wide v30

    .line 148
    nop

    .line 149
    nop

    .line 143
    invoke-direct/range {v23 .. v35}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;-><init>(JJJJJJ)V

    return-object v23
.end method

.method public final calculateFajrTime(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)J
    .locals 12
    .param p1, "calendar"    # Ljava/util/Calendar;
    .param p2, "latitude"    # D
    .param p4, "longitude"    # D
    .param p6, "method"    # Lcom/example/fajr/calculation/CalculationMethod;

    const-string v1, "calendar"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "method"

    move-object/from16 v7, p6

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    move-wide/from16 v8, p4

    invoke-direct {p0, p1, v8, v9}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->solarParams(Ljava/util/Calendar;D)Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->component1()D

    move-result-wide v10

    .local v10, "transit":D
    invoke-virtual {v1}, Lcom/example/fajr/calculation/PrayerTimesCalculator$SolarParams;->component2()D

    move-result-wide v5

    .line 113
    .local v5, "declination":D
    invoke-virtual {v7}, Lcom/example/fajr/calculation/CalculationMethod;->getFajrAngle()D

    move-result-wide v1

    move-object v0, p0

    move-wide v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hourAngleBelowHorizon(DDD)D

    move-result-wide v1

    .line 114
    .local v1, "h":D
    const-wide/high16 v3, 0x402e000000000000L    # 15.0

    div-double v3, v1, v3

    sub-double v3, v10, v3

    invoke-direct {p0, p1, v3, v4}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->hoursToMillis(Ljava/util/Calendar;D)J

    move-result-wide v3

    return-wide v3
.end method
