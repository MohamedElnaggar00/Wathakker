.class public final Lcom/example/fajr/alarm/FajrAlarmScheduler;
.super Ljava/lang/Object;
.source "FajrAlarmScheduler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/fajr/alarm/FajrAlarmScheduler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/example/fajr/alarm/FajrAlarmScheduler;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "alarmManager",
        "Landroid/app/AlarmManager;",
        "prefs",
        "Lcom/example/fajr/data/FajrPreferences;",
        "scheduleNextFajrAlarm",
        "",
        "scheduleSnooze",
        "",
        "snoozeMinutes",
        "",
        "setExactAlarm",
        "triggerAtMillis",
        "requestCode",
        "cancelAllAlarms",
        "Companion",
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

.field public static final ACTION_FAJR_ALARM:Ljava/lang/String; = "com.example.fajr.ACTION_FAJR_ALARM"

.field public static final ALARM_REQUEST_CODE:I = 0x157c1

.field public static final Companion:Lcom/example/fajr/alarm/FajrAlarmScheduler$Companion;

.field public static final SNOOZE_REQUEST_CODE:I = 0x157c2


# instance fields
.field private final alarmManager:Landroid/app/AlarmManager;

.field private final context:Landroid/content/Context;

.field private final prefs:Lcom/example/fajr/data/FajrPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/fajr/alarm/FajrAlarmScheduler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/fajr/alarm/FajrAlarmScheduler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->Companion:Lcom/example/fajr/alarm/FajrAlarmScheduler$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    .line 16
    iget-object v0, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.AlarmManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    .line 17
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    iget-object v1, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    .line 14
    return-void
.end method

.method private final setExactAlarm(JI)V
    .locals 7
    .param p1, "triggerAtMillis"    # J
    .param p3, "requestCode"    # I

    .line 65
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    const-class v2, Lcom/example/fajr/alarm/FajrAlarmReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v1, v0

    .local v1, "$this$setExactAlarm_u24lambda_u240\\1":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 66
    .local v2, "$i$a$-apply-FajrAlarmScheduler$setExactAlarm$intent$1\\1\\65\\0":I
    const v3, 0x157c2

    if-ne p3, v3, :cond_0

    const-string v3, "ACTION_SNOOZE_TRIGGER"

    goto :goto_0

    :cond_0
    const-string v3, "com.example.fajr.ACTION_FAJR_ALARM"

    :goto_0
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    nop

    .line 65
    .end local v1    # "$this$setExactAlarm_u24lambda_u240\\1":Landroid/content/Intent;
    .end local v2    # "$i$a$-apply-FajrAlarmScheduler$setExactAlarm$intent$1\\1\\65\\0":I
    nop

    .line 70
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    .line 71
    nop

    .line 72
    nop

    .line 73
    nop

    .line 69
    const/high16 v2, 0xc000000

    invoke-static {v1, p3, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 77
    .local v1, "pendingIntent":Landroid/app/PendingIntent;
    new-instance v3, Landroid/content/Intent;

    iget-object v4, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    const-class v5, Lcom/example/fajr/ui/FajrAlarmActivity;

    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v4, v3

    .local v4, "$this$setExactAlarm_u24lambda_u241\\2":Landroid/content/Intent;
    const/4 v5, 0x0

    .line 78
    .local v5, "$i$a$-apply-FajrAlarmScheduler$setExactAlarm$showIntent$1\\2\\77\\0":I
    const/high16 v6, 0x14000000

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 79
    nop

    .line 77
    .end local v4    # "$this$setExactAlarm_u24lambda_u241\\2":Landroid/content/Intent;
    .end local v5    # "$i$a$-apply-FajrAlarmScheduler$setExactAlarm$showIntent$1\\2\\77\\0":I
    nop

    .line 81
    .local v3, "showIntent":Landroid/content/Intent;
    iget-object v4, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    .line 82
    add-int/lit8 v5, p3, 0xa

    .line 83
    nop

    .line 84
    nop

    .line 80
    invoke-static {v4, v5, v3, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 87
    .local v2, "showPendingIntent":Landroid/app/PendingIntent;
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-lt v4, v5, :cond_2

    .line 88
    iget-object v4, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v4}, Landroid/app/AlarmManager;->canScheduleExactAlarms()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 89
    new-instance v4, Landroid/app/AlarmManager$AlarmClockInfo;

    invoke-direct {v4, p1, p2, v2}, Landroid/app/AlarmManager$AlarmClockInfo;-><init>(JLandroid/app/PendingIntent;)V

    .line 90
    .local v4, "alarmClockInfo":Landroid/app/AlarmManager$AlarmClockInfo;
    iget-object v5, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v5, v4, v1}, Landroid/app/AlarmManager;->setAlarmClock(Landroid/app/AlarmManager$AlarmClockInfo;Landroid/app/PendingIntent;)V

    .end local v4    # "alarmClockInfo":Landroid/app/AlarmManager$AlarmClockInfo;
    goto :goto_1

    .line 92
    :cond_1
    iget-object v4, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    const/4 v5, 0x0

    invoke-virtual {v4, v5, p1, p2, v1}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    goto :goto_1

    .line 95
    :cond_2
    new-instance v4, Landroid/app/AlarmManager$AlarmClockInfo;

    invoke-direct {v4, p1, p2, v2}, Landroid/app/AlarmManager$AlarmClockInfo;-><init>(JLandroid/app/PendingIntent;)V

    .line 96
    .restart local v4    # "alarmClockInfo":Landroid/app/AlarmManager$AlarmClockInfo;
    iget-object v5, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v5, v4, v1}, Landroid/app/AlarmManager;->setAlarmClock(Landroid/app/AlarmManager$AlarmClockInfo;Landroid/app/PendingIntent;)V

    .line 98
    .end local v4    # "alarmClockInfo":Landroid/app/AlarmManager$AlarmClockInfo;
    :goto_1
    return-void
.end method


# virtual methods
.method public final cancelAllAlarms()V
    .locals 5

    .line 101
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    const-class v2, Lcom/example/fajr/alarm/FajrAlarmReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v1, v0

    .local v1, "$this$cancelAllAlarms_u24lambda_u242\\1":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 102
    .local v2, "$i$a$-apply-FajrAlarmScheduler$cancelAllAlarms$intent$1\\1\\101\\0":I
    const-string v3, "com.example.fajr.ACTION_FAJR_ALARM"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    nop

    .line 101
    .end local v1    # "$this$cancelAllAlarms_u24lambda_u242\\1":Landroid/content/Intent;
    .end local v2    # "$i$a$-apply-FajrAlarmScheduler$cancelAllAlarms$intent$1\\1\\101\\0":I
    nop

    .line 105
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    .line 106
    nop

    .line 107
    nop

    .line 108
    nop

    .line 104
    const v2, 0x157c1

    const/high16 v3, 0x24000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 110
    .local v1, "pendingIntent":Landroid/app/PendingIntent;
    if-eqz v1, :cond_0

    .line 111
    iget-object v2, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v2, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 112
    invoke-virtual {v1}, Landroid/app/PendingIntent;->cancel()V

    .line 116
    :cond_0
    iget-object v2, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->context:Landroid/content/Context;

    .line 117
    nop

    .line 118
    nop

    .line 119
    nop

    .line 115
    const v4, 0x157c2

    invoke-static {v2, v4, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 121
    .local v2, "snoozeIntent":Landroid/app/PendingIntent;
    if-eqz v2, :cond_1

    .line 122
    iget-object v3, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->alarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v3, v2}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 123
    invoke-virtual {v2}, Landroid/app/PendingIntent;->cancel()V

    .line 125
    :cond_1
    return-void
.end method

.method public final scheduleNextFajrAlarm()J
    .locals 11

    .line 26
    iget-object v0, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->isAlarmEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 27
    invoke-virtual {p0}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->cancelAllAlarms()V

    .line 28
    const-wide/16 v0, 0x0

    return-wide v0

    .line 31
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 32
    .local v0, "now":J
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 35
    .local v3, "calendar":Ljava/util/Calendar;
    sget-object v2, Lcom/example/fajr/calculation/CalculationMethod;->Companion:Lcom/example/fajr/calculation/CalculationMethod$Companion;

    iget-object v4, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v4}, Lcom/example/fajr/data/FajrPreferences;->getCalculationMethodId()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/example/fajr/calculation/CalculationMethod$Companion;->fromId(I)Lcom/example/fajr/calculation/CalculationMethod;

    move-result-object v8

    .line 36
    .local v8, "method":Lcom/example/fajr/calculation/CalculationMethod;
    sget-object v2, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    .line 37
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    iget-object v4, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v4}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v4

    .line 39
    iget-object v6, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v6}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v6

    .line 40
    nop

    .line 36
    invoke-virtual/range {v2 .. v8}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateFajrTime(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)J

    move-result-wide v9

    .line 44
    .local v9, "fajrTime":J
    cmp-long v2, v9, v0

    if-gtz v2, :cond_1

    .line 45
    const/4 v2, 0x6

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4}, Ljava/util/Calendar;->add(II)V

    .line 46
    sget-object v2, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    .line 47
    nop

    .line 48
    iget-object v4, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v4}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v4

    .line 49
    iget-object v6, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v6}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v6

    .line 50
    nop

    .line 46
    invoke-virtual/range {v2 .. v8}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateFajrTime(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)J

    move-result-wide v9

    .line 54
    :cond_1
    iget-object v2, p0, Lcom/example/fajr/alarm/FajrAlarmScheduler;->prefs:Lcom/example/fajr/data/FajrPreferences;

    invoke-virtual {v2, v9, v10}, Lcom/example/fajr/data/FajrPreferences;->setLastCalculatedFajrTimeMillis(J)V

    .line 55
    const v2, 0x157c1

    invoke-direct {p0, v9, v10, v2}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->setExactAlarm(JI)V

    .line 56
    return-wide v9
.end method

.method public final scheduleSnooze(I)V
    .locals 6
    .param p1, "snoozeMinutes"    # I

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    mul-int/lit8 v2, p1, 0x3c

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    .line 61
    .local v0, "triggerAtMillis":J
    const v2, 0x157c2

    invoke-direct {p0, v0, v1, v2}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->setExactAlarm(JI)V

    .line 62
    return-void
.end method
