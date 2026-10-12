.class public final Lcom/example/fajr/ui/FajrSettingsState;
.super Ljava/lang/Object;
.source "FajrViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008,\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0008H\u00c6\u0003J\t\u0010.\u001a\u00020\u0008H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u000cH\u00c6\u0003J\t\u00101\u001a\u00020\u000eH\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0012H\u00c6\u0003J\t\u00105\u001a\u00020\u0012H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u009f\u0001\u00109\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010:\u001a\u00020\u00032\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0012H\u00d6\u0001J\t\u0010=\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\'R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u0019\u00a8\u0006>"
    }
    d2 = {
        "Lcom/example/fajr/ui/FajrSettingsState;",
        "",
        "isAlarmEnabled",
        "",
        "useCurrentLocation",
        "cityName",
        "",
        "latitude",
        "",
        "longitude",
        "nextFajrTimeFormatted",
        "nextFajrMillis",
        "",
        "calculationMethod",
        "Lcom/example/fajr/calculation/CalculationMethod;",
        "ringtoneTitle",
        "isVibrationEnabled",
        "maxDurationMinutes",
        "",
        "alarmVolume",
        "isRefreshing",
        "isGpsAvailable",
        "hasLocationPermission",
        "<init>",
        "(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZ)V",
        "()Z",
        "getUseCurrentLocation",
        "getCityName",
        "()Ljava/lang/String;",
        "getLatitude",
        "()D",
        "getLongitude",
        "getNextFajrTimeFormatted",
        "getNextFajrMillis",
        "()J",
        "getCalculationMethod",
        "()Lcom/example/fajr/calculation/CalculationMethod;",
        "getRingtoneTitle",
        "getMaxDurationMinutes",
        "()I",
        "getAlarmVolume",
        "getHasLocationPermission",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field private final alarmVolume:I

.field private final calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

.field private final cityName:Ljava/lang/String;

.field private final hasLocationPermission:Z

.field private final isAlarmEnabled:Z

.field private final isGpsAvailable:Z

.field private final isRefreshing:Z

.field private final isVibrationEnabled:Z

.field private final latitude:D

.field private final longitude:D

.field private final maxDurationMinutes:I

.field private final nextFajrMillis:J

.field private final nextFajrTimeFormatted:Ljava/lang/String;

.field private final ringtoneTitle:Ljava/lang/String;

.field private final useCurrentLocation:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 21

    const/16 v19, 0x7fff

    const/16 v20, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v20}, Lcom/example/fajr/ui/FajrSettingsState;-><init>(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZ)V
    .locals 16
    .param p1, "isAlarmEnabled"    # Z
    .param p2, "useCurrentLocation"    # Z
    .param p3, "cityName"    # Ljava/lang/String;
    .param p4, "latitude"    # D
    .param p6, "longitude"    # D
    .param p8, "nextFajrTimeFormatted"    # Ljava/lang/String;
    .param p9, "nextFajrMillis"    # J
    .param p11, "calculationMethod"    # Lcom/example/fajr/calculation/CalculationMethod;
    .param p12, "ringtoneTitle"    # Ljava/lang/String;
    .param p13, "isVibrationEnabled"    # Z
    .param p14, "maxDurationMinutes"    # I
    .param p15, "alarmVolume"    # I
    .param p16, "isRefreshing"    # Z
    .param p17, "isGpsAvailable"    # Z
    .param p18, "hasLocationPermission"    # Z

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p8

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    const-string v5, "cityName"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "nextFajrTimeFormatted"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "calculationMethod"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "ringtoneTitle"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    move/from16 v5, p1

    iput-boolean v5, v0, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    .line 26
    move/from16 v6, p2

    iput-boolean v6, v0, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    .line 27
    iput-object v1, v0, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    .line 28
    move-wide/from16 v7, p4

    iput-wide v7, v0, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    .line 29
    move-wide/from16 v9, p6

    iput-wide v9, v0, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    .line 30
    iput-object v2, v0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    .line 31
    move-wide/from16 v11, p9

    iput-wide v11, v0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    .line 32
    iput-object v3, v0, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    .line 33
    iput-object v4, v0, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    .line 34
    move/from16 v13, p13

    iput-boolean v13, v0, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    .line 35
    move/from16 v14, p14

    iput v14, v0, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    .line 36
    move/from16 v15, p15

    iput v15, v0, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    .line 37
    move/from16 v1, p16

    iput-boolean v1, v0, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    .line 38
    move/from16 v1, p17

    iput-boolean v1, v0, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    .line 39
    move/from16 v1, p18

    iput-boolean v1, v0, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    .line 24
    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    .line 24
    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 25
    const/4 v1, 0x0

    goto :goto_0

    .line 24
    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 26
    const/4 v3, 0x1

    goto :goto_1

    .line 24
    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    .line 27
    const-string v5, "\u0627\u0644\u0642\u0627\u0647\u0631\u0629\u060c \u0645\u0635\u0631"

    goto :goto_2

    .line 24
    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    .line 28
    const-wide v6, 0x403e0b5dcc63f141L    # 30.0444

    goto :goto_3

    .line 24
    :cond_3
    move-wide/from16 v6, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    .line 29
    const-wide v8, 0x403f3c56d5cfaaceL    # 31.2357

    goto :goto_4

    .line 24
    :cond_4
    move-wide/from16 v8, p6

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    .line 30
    const-string v10, "--:--"

    goto :goto_5

    .line 24
    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    .line 31
    const-wide/16 v11, 0x0

    goto :goto_6

    .line 24
    :cond_6
    move-wide/from16 v11, p9

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    .line 32
    sget-object v13, Lcom/example/fajr/calculation/CalculationMethod;->EGYPTIAN:Lcom/example/fajr/calculation/CalculationMethod;

    goto :goto_7

    .line 24
    :cond_7
    move-object/from16 v13, p11

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    .line 33
    const-string v14, "\u0646\u063a\u0645\u0629 \u0627\u0644\u0645\u0646\u0628\u0647 \u0627\u0644\u0627\u0641\u062a\u0631\u0627\u0636\u064a\u0629"

    goto :goto_8

    .line 24
    :cond_8
    move-object/from16 v14, p12

    :goto_8
    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    .line 34
    const/4 v15, 0x1

    goto :goto_9

    .line 24
    :cond_9
    move/from16 v15, p13

    :goto_9
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_a

    .line 35
    const/4 v2, 0x5

    goto :goto_a

    .line 24
    :cond_a
    move/from16 v2, p14

    :goto_a
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_b

    .line 36
    const/16 v4, 0x50

    goto :goto_b

    .line 24
    :cond_b
    move/from16 v4, p15

    :goto_b
    move/from16 v16, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    .line 37
    const/4 v1, 0x0

    goto :goto_c

    .line 24
    :cond_c
    move/from16 v1, p16

    :goto_c
    move/from16 p2, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    .line 38
    const/4 v1, 0x1

    goto :goto_d

    .line 24
    :cond_d
    move/from16 v1, p17

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    .line 39
    const/4 v0, 0x0

    goto :goto_e

    .line 24
    :cond_e
    move/from16 v0, p18

    :goto_e
    move-object/from16 p1, p0

    move/from16 p17, p2

    move/from16 p19, v0

    move/from16 p18, v1

    move/from16 p15, v2

    move/from16 p3, v3

    move/from16 p16, v4

    move-object/from16 p4, v5

    move-wide/from16 p5, v6

    move-wide/from16 p7, v8

    move-object/from16 p9, v10

    move-wide/from16 p10, v11

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move/from16 p14, v15

    move/from16 p2, v16

    invoke-direct/range {p1 .. p19}, Lcom/example/fajr/ui/FajrSettingsState;-><init>(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZ)V

    .line 40
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, v0, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-wide v10, v0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    goto :goto_6

    :cond_6
    move-wide/from16 v10, p9

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget-object v12, v0, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    goto :goto_7

    :cond_7
    move-object/from16 v12, p11

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-object v13, v0, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget-boolean v14, v0, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    goto :goto_9

    :cond_9
    move/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget v15, v0, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget v2, v0, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    goto :goto_b

    :cond_b
    move/from16 v2, p15

    :goto_b
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-boolean v2, v0, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    goto :goto_c

    :cond_c
    move/from16 v2, p16

    :goto_c
    move/from16 p3, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-boolean v2, v0, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    goto :goto_d

    :cond_d
    move/from16 v2, p17

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-boolean v1, v0, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    move/from16 p19, v1

    goto :goto_e

    :cond_e
    move/from16 p19, p18

    :goto_e
    move/from16 p16, p2

    move/from16 p17, p3

    move/from16 p18, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-wide/from16 p5, v5

    move-wide/from16 p7, v7

    move-object/from16 p9, v9

    move-wide/from16 p10, v10

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p19}, Lcom/example/fajr/ui/FajrSettingsState;->copy(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZ)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    return-wide v0
.end method

.method public final component8()Lcom/example/fajr/calculation/CalculationMethod;
    .locals 1

    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZ)Lcom/example/fajr/ui/FajrSettingsState;
    .locals 20

    const-string v0, "cityName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextFajrTimeFormatted"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calculationMethod"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ringtoneTitle"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/example/fajr/ui/FajrSettingsState;

    move/from16 v2, p1

    move/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v10, p9

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    invoke-direct/range {v1 .. v19}, Lcom/example/fajr/ui/FajrSettingsState;-><init>(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/fajr/ui/FajrSettingsState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/example/fajr/ui/FajrSettingsState;

    iget-boolean v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    iget-boolean v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    iget-boolean v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    iget-object v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    iget-wide v5, v1, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    iget-wide v5, v1, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    iget-object v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    iget-wide v5, v1, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_8

    return v2

    :cond_8
    iget-object v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    iget-object v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    if-eq v3, v4, :cond_9

    return v2

    :cond_9
    iget-object v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    iget-object v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    return v2

    :cond_a
    iget-boolean v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    iget-boolean v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    if-eq v3, v4, :cond_b

    return v2

    :cond_b
    iget v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    iget v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    if-eq v3, v4, :cond_c

    return v2

    :cond_c
    iget v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    iget v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    if-eq v3, v4, :cond_d

    return v2

    :cond_d
    iget-boolean v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    iget-boolean v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    if-eq v3, v4, :cond_e

    return v2

    :cond_e
    iget-boolean v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    iget-boolean v4, v1, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    if-eq v3, v4, :cond_f

    return v2

    :cond_f
    iget-boolean v3, p0, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    iget-boolean v1, v1, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    if-eq v3, v1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getAlarmVolume()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    return v0
.end method

.method public final getCalculationMethod()Lcom/example/fajr/calculation/CalculationMethod;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    return-object v0
.end method

.method public final getCityName()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasLocationPermission()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    return v0
.end method

.method public final getLatitude()D
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    return-wide v0
.end method

.method public final getMaxDurationMinutes()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    return v0
.end method

.method public final getNextFajrMillis()J
    .locals 2

    .line 31
    iget-wide v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    return-wide v0
.end method

.method public final getNextFajrTimeFormatted()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    return-object v0
.end method

.method public final getRingtoneTitle()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getUseCurrentLocation()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    invoke-static {v0}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport0;->m(Z)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    invoke-static {v2}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport0;->m(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    invoke-static {v2, v3}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport1;->m(D)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    invoke-static {v2, v3}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport1;->m(D)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    invoke-static {v2, v3}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport2;->m(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    invoke-virtual {v2}, Lcom/example/fajr/calculation/CalculationMethod;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    invoke-static {v2}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport0;->m(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    invoke-static {v2}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport0;->m(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    invoke-static {v2}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport0;->m(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    invoke-static {v2}, Lcom/example/fajr/ui/FajrSettingsState$$ExternalSyntheticBackport0;->m(Z)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public final isAlarmEnabled()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    return v0
.end method

.method public final isGpsAvailable()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    return v0
.end method

.method public final isRefreshing()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    return v0
.end method

.method public final isVibrationEnabled()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/example/fajr/ui/FajrSettingsState;->isAlarmEnabled:Z

    iget-boolean v2, v0, Lcom/example/fajr/ui/FajrSettingsState;->useCurrentLocation:Z

    iget-object v3, v0, Lcom/example/fajr/ui/FajrSettingsState;->cityName:Ljava/lang/String;

    iget-wide v4, v0, Lcom/example/fajr/ui/FajrSettingsState;->latitude:D

    iget-wide v6, v0, Lcom/example/fajr/ui/FajrSettingsState;->longitude:D

    iget-object v8, v0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrTimeFormatted:Ljava/lang/String;

    iget-wide v9, v0, Lcom/example/fajr/ui/FajrSettingsState;->nextFajrMillis:J

    iget-object v11, v0, Lcom/example/fajr/ui/FajrSettingsState;->calculationMethod:Lcom/example/fajr/calculation/CalculationMethod;

    iget-object v12, v0, Lcom/example/fajr/ui/FajrSettingsState;->ringtoneTitle:Ljava/lang/String;

    iget-boolean v13, v0, Lcom/example/fajr/ui/FajrSettingsState;->isVibrationEnabled:Z

    iget v14, v0, Lcom/example/fajr/ui/FajrSettingsState;->maxDurationMinutes:I

    iget v15, v0, Lcom/example/fajr/ui/FajrSettingsState;->alarmVolume:I

    move/from16 v16, v15

    iget-boolean v15, v0, Lcom/example/fajr/ui/FajrSettingsState;->isRefreshing:Z

    move/from16 v17, v15

    iget-boolean v15, v0, Lcom/example/fajr/ui/FajrSettingsState;->isGpsAvailable:Z

    move/from16 v18, v15

    iget-boolean v15, v0, Lcom/example/fajr/ui/FajrSettingsState;->hasLocationPermission:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v19, v15

    const-string v15, "FajrSettingsState(isAlarmEnabled="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", useCurrentLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nextFajrTimeFormatted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nextFajrMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", calculationMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ringtoneTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isVibrationEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDurationMinutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", alarmVolume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isRefreshing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isGpsAvailable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hasLocationPermission="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
