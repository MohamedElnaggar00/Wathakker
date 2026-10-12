.class public final Lcom/example/fajr/ui/FajrViewModel;
.super Landroidx/lifecycle/AndroidViewModel;
.source "FajrViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020+J\u0006\u0010.\u001a\u00020\u0016J\u0008\u0010/\u001a\u00020\u0016H\u0002J\u000e\u00100\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J\u0006\u00101\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u00062"
    }
    d2 = {
        "Lcom/example/fajr/ui/FajrViewModel;",
        "Landroidx/lifecycle/AndroidViewModel;",
        "application",
        "Landroid/app/Application;",
        "<init>",
        "(Landroid/app/Application;)V",
        "prefs",
        "Lcom/example/fajr/data/FajrPreferences;",
        "scheduler",
        "Lcom/example/fajr/alarm/FajrAlarmScheduler;",
        "locationHelper",
        "Lcom/example/fajr/location/LocationManagerHelper;",
        "ringtoneHelper",
        "Lcom/example/fajr/sound/RingtoneHelper;",
        "_uiState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/example/fajr/ui/FajrSettingsState;",
        "uiState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getUiState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "loadSettings",
        "",
        "toggleAlarm",
        "enabled",
        "",
        "setUseCurrentLocation",
        "useGps",
        "updateLocationFromGps",
        "setCity",
        "city",
        "Lcom/example/fajr/data/CityItem;",
        "setCalculationMethod",
        "method",
        "Lcom/example/fajr/calculation/CalculationMethod;",
        "setRingtone",
        "uri",
        "Landroid/net/Uri;",
        "title",
        "",
        "toggleVibration",
        "setMaxDuration",
        "minutes",
        "",
        "setAlarmVolume",
        "volume",
        "refreshFajrTimeManually",
        "refreshFajrTimeInternal",
        "playRingtonePreview",
        "stopRingtonePreview",
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
.field private final _uiState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/example/fajr/ui/FajrSettingsState;",
            ">;"
        }
    .end annotation
.end field

.field private final locationHelper:Lcom/example/fajr/location/LocationManagerHelper;

.field private final prefs:Lcom/example/fajr/data/FajrPreferences;

.field private final ringtoneHelper:Lcom/example/fajr/sound/RingtoneHelper;

.field private final scheduler:Lcom/example/fajr/alarm/FajrAlarmScheduler;

.field private final uiState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/example/fajr/ui/FajrSettingsState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/fajr/ui/FajrViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 25
    .param p1, "application"    # Landroid/app/Application;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct/range {p0 .. p1}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 44
    new-instance v2, Lcom/example/fajr/data/FajrPreferences;

    move-object v3, v1

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    .line 45
    new-instance v2, Lcom/example/fajr/alarm/FajrAlarmScheduler;

    move-object v3, v1

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/example/fajr/alarm/FajrAlarmScheduler;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->scheduler:Lcom/example/fajr/alarm/FajrAlarmScheduler;

    .line 46
    new-instance v2, Lcom/example/fajr/location/LocationManagerHelper;

    move-object v3, v1

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/example/fajr/location/LocationManagerHelper;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->locationHelper:Lcom/example/fajr/location/LocationManagerHelper;

    .line 47
    new-instance v2, Lcom/example/fajr/sound/RingtoneHelper;

    move-object v3, v1

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/example/fajr/sound/RingtoneHelper;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->ringtoneHelper:Lcom/example/fajr/sound/RingtoneHelper;

    .line 49
    new-instance v4, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v23, 0x7fff

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v4 .. v24}, Lcom/example/fajr/ui/FajrSettingsState;-><init>(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 50
    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {v2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->uiState:Lkotlinx/coroutines/flow/StateFlow;

    .line 52
    nop

    .line 53
    invoke-virtual {v0}, Lcom/example/fajr/ui/FajrViewModel;->loadSettings()V

    .line 54
    nop

    .line 42
    return-void
.end method

.method public static final synthetic access$getLocationHelper$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/location/LocationManagerHelper;
    .locals 1
    .param p0, "$this"    # Lcom/example/fajr/ui/FajrViewModel;

    .line 42
    iget-object v0, p0, Lcom/example/fajr/ui/FajrViewModel;->locationHelper:Lcom/example/fajr/location/LocationManagerHelper;

    return-object v0
.end method

.method public static final synthetic access$getPrefs$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/data/FajrPreferences;
    .locals 1
    .param p0, "$this"    # Lcom/example/fajr/ui/FajrViewModel;

    .line 42
    iget-object v0, p0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    return-object v0
.end method

.method public static final synthetic access$getScheduler$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/alarm/FajrAlarmScheduler;
    .locals 1
    .param p0, "$this"    # Lcom/example/fajr/ui/FajrViewModel;

    .line 42
    iget-object v0, p0, Lcom/example/fajr/ui/FajrViewModel;->scheduler:Lcom/example/fajr/alarm/FajrAlarmScheduler;

    return-object v0
.end method

.method public static final synthetic access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .param p0, "$this"    # Lcom/example/fajr/ui/FajrViewModel;

    .line 42
    iget-object v0, p0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public static final synthetic access$refreshFajrTimeInternal(Lcom/example/fajr/ui/FajrViewModel;)V
    .locals 0
    .param p0, "$this"    # Lcom/example/fajr/ui/FajrViewModel;

    .line 42
    invoke-direct {p0}, Lcom/example/fajr/ui/FajrViewModel;->refreshFajrTimeInternal()V

    return-void
.end method

.method private final refreshFajrTimeInternal()V
    .locals 34

    .line 199
    move-object/from16 v0, p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 200
    .local v1, "now":J
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 201
    .local v4, "calendar":Ljava/util/Calendar;
    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    invoke-virtual {v3}, Lcom/example/fajr/ui/FajrSettingsState;->getCalculationMethod()Lcom/example/fajr/calculation/CalculationMethod;

    move-result-object v9

    .line 203
    .local v9, "method":Lcom/example/fajr/calculation/CalculationMethod;
    sget-object v3, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    .line 204
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 205
    iget-object v5, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/example/fajr/ui/FajrSettingsState;

    invoke-virtual {v5}, Lcom/example/fajr/ui/FajrSettingsState;->getLatitude()D

    move-result-wide v5

    .line 206
    iget-object v7, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/example/fajr/ui/FajrSettingsState;

    invoke-virtual {v7}, Lcom/example/fajr/ui/FajrSettingsState;->getLongitude()D

    move-result-wide v7

    .line 207
    nop

    .line 203
    invoke-virtual/range {v3 .. v9}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateFajrTime(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)J

    move-result-wide v10

    .line 210
    .local v10, "fajrTime":J
    const/4 v12, 0x0

    .line 211
    .local v12, "isTomorrow":Z
    cmp-long v3, v10, v1

    if-gtz v3, :cond_0

    .line 212
    const/4 v3, 0x6

    const/4 v5, 0x1

    invoke-virtual {v4, v3, v5}, Ljava/util/Calendar;->add(II)V

    .line 213
    sget-object v3, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    .line 214
    nop

    .line 215
    iget-object v5, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/example/fajr/ui/FajrSettingsState;

    invoke-virtual {v5}, Lcom/example/fajr/ui/FajrSettingsState;->getLatitude()D

    move-result-wide v5

    .line 216
    iget-object v7, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/example/fajr/ui/FajrSettingsState;

    invoke-virtual {v7}, Lcom/example/fajr/ui/FajrSettingsState;->getLongitude()D

    move-result-wide v7

    .line 217
    nop

    .line 213
    invoke-virtual/range {v3 .. v9}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateFajrTime(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)J

    move-result-wide v10

    .line 219
    const/4 v12, 0x1

    .line 222
    :cond_0
    new-instance v3, Ljava/text/SimpleDateFormat;

    new-instance v5, Ljava/util/Locale;

    const-string v6, "ar"

    invoke-direct {v5, v6}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    const-string v6, "hh:mm a"

    invoke-direct {v3, v6, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 223
    .local v3, "timeSdf":Ljava/text/SimpleDateFormat;
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v10, v11}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 224
    .local v5, "formattedTime":Ljava/lang/String;
    if-eqz v12, :cond_1

    const-string v6, "\u063a\u062f\u0627\u064b \u0641\u064a"

    goto :goto_0

    :cond_1
    const-string v6, "\u0627\u0644\u064a\u0648\u0645 \u0641\u064a"

    .line 225
    .local v6, "prefix":Ljava/lang/String;
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 227
    .local v21, "fullFormatted":Ljava/lang/String;
    iget-object v7, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v8, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v8}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Lcom/example/fajr/ui/FajrSettingsState;

    .line 228
    nop

    .line 229
    nop

    .line 227
    const/16 v32, 0x7f9f

    const/16 v33, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-wide/from16 v22, v10

    .end local v10    # "fajrTime":J
    .local v22, "fajrTime":J
    invoke-static/range {v13 .. v33}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v8

    invoke-interface {v7, v8}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 231
    return-void
.end method


# virtual methods
.method public final getUiState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/example/fajr/ui/FajrSettingsState;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/example/fajr/ui/FajrViewModel;->uiState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final loadSettings()V
    .locals 24

    .line 57
    move-object/from16 v0, p0

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->Companion:Lcom/example/fajr/calculation/CalculationMethod$Companion;

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v2}, Lcom/example/fajr/data/FajrPreferences;->getCalculationMethodId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/example/fajr/calculation/CalculationMethod$Companion;->fromId(I)Lcom/example/fajr/calculation/CalculationMethod;

    move-result-object v14

    .line 58
    .local v14, "method":Lcom/example/fajr/calculation/CalculationMethod;
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->ringtoneHelper:Lcom/example/fajr/sound/RingtoneHelper;

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v1, v2}, Lcom/example/fajr/sound/RingtoneHelper;->getValidRingtoneUri(Lcom/example/fajr/data/FajrPreferences;)Landroid/net/Uri;

    move-result-object v1

    .line 59
    .local v1, "validUri":Landroid/net/Uri;
    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->ringtoneHelper:Lcom/example/fajr/sound/RingtoneHelper;

    invoke-virtual {v2, v1}, Lcom/example/fajr/sound/RingtoneHelper;->getRingtoneTitle(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v15

    .line 61
    .local v15, "ringtoneTitle":Ljava/lang/String;
    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v3, Lcom/example/fajr/ui/FajrSettingsState;

    .line 62
    iget-object v4, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v4}, Lcom/example/fajr/data/FajrPreferences;->isAlarmEnabled()Z

    move-result v4

    .line 63
    iget-object v5, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v5}, Lcom/example/fajr/data/FajrPreferences;->getUseCurrentLocation()Z

    move-result v5

    .line 64
    iget-object v6, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v6}, Lcom/example/fajr/data/FajrPreferences;->getCityName()Ljava/lang/String;

    move-result-object v6

    .line 65
    iget-object v7, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v7}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v7

    .line 66
    iget-object v9, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v9}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v9

    .line 61
    nop

    .line 67
    nop

    .line 68
    nop

    .line 69
    iget-object v11, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v11}, Lcom/example/fajr/data/FajrPreferences;->isVibrationEnabled()Z

    move-result v16

    .line 70
    iget-object v11, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v11}, Lcom/example/fajr/data/FajrPreferences;->getMaxDurationMinutes()I

    move-result v17

    .line 71
    iget-object v11, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v11}, Lcom/example/fajr/data/FajrPreferences;->getAlarmVolume()I

    move-result v18

    .line 61
    nop

    .line 72
    iget-object v11, v0, Lcom/example/fajr/ui/FajrViewModel;->locationHelper:Lcom/example/fajr/location/LocationManagerHelper;

    invoke-virtual {v11}, Lcom/example/fajr/location/LocationManagerHelper;->isGpsEnabled()Z

    move-result v20

    .line 73
    iget-object v11, v0, Lcom/example/fajr/ui/FajrViewModel;->locationHelper:Lcom/example/fajr/location/LocationManagerHelper;

    invoke-virtual {v11}, Lcom/example/fajr/location/LocationManagerHelper;->hasLocationPermission()Z

    move-result v21

    .line 61
    const/16 v22, 0x1060

    const/16 v23, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v3 .. v23}, Lcom/example/fajr/ui/FajrSettingsState;-><init>(ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 76
    invoke-direct {v0}, Lcom/example/fajr/ui/FajrViewModel;->refreshFajrTimeInternal()V

    .line 77
    return-void
.end method

.method public final playRingtonePreview(Landroid/net/Uri;)V
    .locals 3
    .param p1, "uri"    # Landroid/net/Uri;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/example/fajr/ui/FajrViewModel;->ringtoneHelper:Lcom/example/fajr/sound/RingtoneHelper;

    iget-object v1, p0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/example/fajr/ui/FajrSettingsState;

    invoke-virtual {v1}, Lcom/example/fajr/ui/FajrSettingsState;->getAlarmVolume()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, p1, v1}, Lcom/example/fajr/sound/RingtoneHelper;->playPreview(Landroid/net/Uri;F)V

    .line 235
    return-void
.end method

.method public final refreshFajrTimeManually()V
    .locals 7

    .line 184
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;-><init>(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 196
    return-void
.end method

.method public final setAlarmVolume(I)V
    .locals 23
    .param p1, "volume"    # I

    .line 179
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/example/fajr/data/FajrPreferences;->setAlarmVolume(I)V

    .line 180
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v21, 0x77ff

    const/16 v22, 0x0

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v17, p1

    invoke-static/range {v2 .. v22}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 181
    return-void
.end method

.method public final setCalculationMethod(Lcom/example/fajr/calculation/CalculationMethod;)V
    .locals 23
    .param p1, "method"    # Lcom/example/fajr/calculation/CalculationMethod;

    move-object/from16 v0, p0

    const-string v1, "method"

    move-object/from16 v13, p1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v13}, Lcom/example/fajr/calculation/CalculationMethod;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/example/fajr/data/FajrPreferences;->setCalculationMethodId(I)V

    .line 155
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v21, 0x7f7f

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v2 .. v22}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 156
    invoke-direct {v0}, Lcom/example/fajr/ui/FajrViewModel;->refreshFajrTimeInternal()V

    .line 157
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v1}, Lcom/example/fajr/data/FajrPreferences;->isAlarmEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 158
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->scheduler:Lcom/example/fajr/alarm/FajrAlarmScheduler;

    invoke-virtual {v1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleNextFajrAlarm()J

    .line 160
    :cond_0
    return-void
.end method

.method public final setCity(Lcom/example/fajr/data/CityItem;)V
    .locals 24
    .param p1, "city"    # Lcom/example/fajr/data/CityItem;

    move-object/from16 v0, p0

    const-string v1, "city"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/example/fajr/data/FajrPreferences;->setUseCurrentLocation(Z)V

    .line 135
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v2}, Lcom/example/fajr/data/CityItem;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/example/fajr/data/FajrPreferences;->setLatitude(D)V

    .line 136
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v2}, Lcom/example/fajr/data/CityItem;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/example/fajr/data/FajrPreferences;->setLongitude(D)V

    .line 137
    invoke-virtual {v2}, Lcom/example/fajr/data/CityItem;->getCityNameAr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/example/fajr/data/CityItem;->getCountryNameAr()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "\u060c "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 138
    .local v6, "title":Ljava/lang/String;
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v1, v6}, Lcom/example/fajr/data/FajrPreferences;->setCityName(Ljava/lang/String;)V

    .line 139
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v2}, Lcom/example/fajr/data/CityItem;->getCountryNameAr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/example/fajr/data/FajrPreferences;->setCountryName(Ljava/lang/String;)V

    .line 141
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    .line 143
    invoke-virtual {v2}, Lcom/example/fajr/data/CityItem;->getLatitude()D

    move-result-wide v7

    .line 144
    invoke-virtual {v2}, Lcom/example/fajr/data/CityItem;->getLongitude()D

    move-result-wide v9

    .line 141
    nop

    .line 142
    nop

    .line 145
    nop

    .line 143
    nop

    .line 144
    nop

    .line 141
    const/16 v22, 0x7fe1

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v3 .. v23}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 147
    invoke-direct {v0}, Lcom/example/fajr/ui/FajrViewModel;->refreshFajrTimeInternal()V

    .line 148
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v1}, Lcom/example/fajr/data/FajrPreferences;->isAlarmEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 149
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->scheduler:Lcom/example/fajr/alarm/FajrAlarmScheduler;

    invoke-virtual {v1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleNextFajrAlarm()J

    .line 151
    :cond_0
    return-void
.end method

.method public final setMaxDuration(I)V
    .locals 23
    .param p1, "minutes"    # I

    .line 174
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/example/fajr/data/FajrPreferences;->setMaxDurationMinutes(I)V

    .line 175
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v21, 0x7bff

    const/16 v22, 0x0

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v16, p1

    invoke-static/range {v2 .. v22}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 176
    return-void
.end method

.method public final setRingtone(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 23
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "title"    # Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    const-string v1, "uri"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/example/fajr/data/FajrPreferences;->setRingtoneUri(Ljava/lang/String;)V

    .line 164
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v1, v13}, Lcom/example/fajr/data/FajrPreferences;->setRingtoneTitle(Ljava/lang/String;)V

    .line 165
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v20, 0x7eff

    const/16 v21, 0x0

    const/4 v2, 0x0

    move-object v4, v1

    move-object v1, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v7, v5

    const-wide/16 v5, 0x0

    move-object v9, v7

    const-wide/16 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v0, v22

    invoke-static/range {v1 .. v21}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 166
    return-void
.end method

.method public final setUseCurrentLocation(Z)V
    .locals 23
    .param p1, "useGps"    # Z

    .line 91
    move-object/from16 v0, p0

    move/from16 v3, p1

    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v1, v3}, Lcom/example/fajr/data/FajrPreferences;->setUseCurrentLocation(Z)V

    .line 92
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v20, 0x7ffd

    const/16 v21, 0x0

    move-object v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v7, v5

    const-wide/16 v5, 0x0

    move-object v9, v7

    const-wide/16 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v0, v22

    invoke-static/range {v1 .. v21}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 93
    if-eqz p1, :cond_0

    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/example/fajr/ui/FajrViewModel;->updateLocationFromGps()V

    goto :goto_0

    .line 96
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/example/fajr/ui/FajrViewModel;->refreshFajrTimeInternal()V

    .line 98
    :goto_0
    return-void
.end method

.method public final stopRingtonePreview()V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/example/fajr/ui/FajrViewModel;->ringtoneHelper:Lcom/example/fajr/sound/RingtoneHelper;

    invoke-virtual {v0}, Lcom/example/fajr/sound/RingtoneHelper;->stopPreview()V

    .line 239
    return-void
.end method

.method public final toggleAlarm(Z)V
    .locals 23
    .param p1, "enabled"    # Z

    .line 80
    move-object/from16 v0, p0

    move/from16 v2, p1

    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v1, v2}, Lcom/example/fajr/data/FajrPreferences;->setAlarmEnabled(Z)V

    .line 81
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v20, 0x7ffe

    const/16 v21, 0x0

    move-object v4, v1

    move-object v1, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v7, v5

    const-wide/16 v5, 0x0

    move-object v9, v7

    const-wide/16 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v0, v22

    invoke-static/range {v1 .. v21}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 82
    nop

    .line 85
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->scheduler:Lcom/example/fajr/alarm/FajrAlarmScheduler;

    .line 82
    if-eqz p1, :cond_0

    .line 83
    invoke-virtual {v1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleNextFajrAlarm()J

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->cancelAllAlarms()V

    .line 87
    :goto_0
    invoke-direct {v0}, Lcom/example/fajr/ui/FajrViewModel;->refreshFajrTimeInternal()V

    .line 88
    return-void
.end method

.method public final toggleVibration(Z)V
    .locals 23
    .param p1, "enabled"    # Z

    .line 169
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->prefs:Lcom/example/fajr/data/FajrPreferences;

    move/from16 v15, p1

    invoke-virtual {v1, v15}, Lcom/example/fajr/data/FajrPreferences;->setVibrationEnabled(Z)V

    .line 170
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v21, 0x7dff

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v2 .. v22}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 171
    return-void
.end method

.method public final updateLocationFromGps()V
    .locals 7

    .line 101
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;-><init>(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 131
    return-void
.end method
