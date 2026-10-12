.class public final Lcom/example/fajr/alarm/FajrAlarmReceiver;
.super Landroid/content/BroadcastReceiver;
.source "FajrAlarmReceiver.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/example/fajr/alarm/FajrAlarmReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/example/fajr/alarm/FajrAlarmReceiver;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    invoke-direct {v0, p1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    .line 22
    .local v0, "prefs":Lcom/example/fajr/data/FajrPreferences;
    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->isAlarmEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 24
    :cond_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 27
    .local v1, "todayDate":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getLastAlarmTriggeredDate()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "ACTION_SNOOZE_TRIGGER"

    if-eqz v2, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 29
    new-instance v2, Lcom/example/fajr/alarm/FajrAlarmScheduler;

    invoke-direct {v2, p1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleNextFajrAlarm()J

    .line 30
    return-void

    .line 33
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/example/fajr/data/FajrPreferences;->setLastAlarmTriggeredDate(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0, v3}, Lcom/example/fajr/data/FajrPreferences;->setSnoozeCount(I)V

    .line 39
    :cond_2
    new-instance v2, Landroid/content/Intent;

    const-class v4, Lcom/example/fajr/ui/FajrAlarmActivity;

    invoke-direct {v2, p1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v4, v2

    .local v4, "$this$onReceive_u24lambda_u240\\1":Landroid/content/Intent;
    const/4 v5, 0x0

    .line 40
    .local v5, "$i$a$-apply-FajrAlarmReceiver$onReceive$alarmIntent$1\\1\\39\\0":I
    const/high16 v6, 0x34000000

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 43
    nop

    .line 39
    .end local v4    # "$this$onReceive_u24lambda_u240\\1":Landroid/content/Intent;
    .end local v5    # "$i$a$-apply-FajrAlarmReceiver$onReceive$alarmIntent$1\\1\\39\\0":I
    nop

    .line 46
    .local v2, "alarmIntent":Landroid/content/Intent;
    nop

    .line 47
    nop

    .line 48
    nop

    .line 49
    nop

    .line 45
    const/high16 v4, 0xc000000

    invoke-static {p1, v3, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 52
    .local v3, "fullScreenPendingIntent":Landroid/app/PendingIntent;
    const-string v4, "fajr_alarm_channel"

    .line 53
    .local v4, "channelId":Ljava/lang/String;
    const-string v5, "notification"

    invoke-virtual {p1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/app/NotificationManager;

    .line 55
    .local v5, "notificationManager":Landroid/app/NotificationManager;
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1a

    const/4 v8, 0x1

    if-lt v6, v7, :cond_3

    .line 56
    new-instance v6, Landroid/app/NotificationChannel;

    .line 57
    nop

    .line 58
    const-string v7, "\u0645\u0646\u0628\u0647 \u0635\u0644\u0627\u0629 \u0627\u0644\u0641\u062c\u0631"

    check-cast v7, Ljava/lang/CharSequence;

    .line 59
    nop

    .line 56
    const/4 v9, 0x4

    invoke-direct {v6, v4, v7, v9}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 60
    move-object v7, v6

    .local v7, "$this$onReceive_u24lambda_u241\\2":Landroid/app/NotificationChannel;
    const/4 v9, 0x0

    .line 61
    .local v9, "$i$a$-apply-FajrAlarmReceiver$onReceive$channel$1\\2\\60\\0":I
    const-string v10, "\u0642\u0646\u0627\u0629 \u062a\u0646\u0628\u064a\u0647\u0627\u062a \u0635\u0644\u0627\u0629 \u0627\u0644\u0641\u062c\u0631"

    invoke-virtual {v7, v10}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v7, v8}, Landroid/app/NotificationChannel;->setBypassDnd(Z)V

    .line 63
    invoke-virtual {v7, v8}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 64
    invoke-virtual {v7, v8}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 65
    nop

    .line 60
    .end local v7    # "$this$onReceive_u24lambda_u241\\2":Landroid/app/NotificationChannel;
    .end local v9    # "$i$a$-apply-FajrAlarmReceiver$onReceive$channel$1\\2\\60\\0":I
    nop

    .line 56
    nop

    .line 66
    .local v6, "channel":Landroid/app/NotificationChannel;
    invoke-virtual {v5, v6}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 69
    .end local v6    # "channel":Landroid/app/NotificationChannel;
    :cond_3
    new-instance v6, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v6, p1, v4}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 70
    sget v7, Lcom/example/R$mipmap;->ic_launcher:I

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v6

    .line 71
    const-string v7, "\u0635\u0644\u0627\u0629 \u0627\u0644\u0641\u062c\u0631"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v6

    .line 72
    const-string v7, "\u062d\u0627\u0646 \u0627\u0644\u0622\u0646 \u0645\u0648\u0639\u062f \u0635\u0644\u0627\u0629 \u0627\u0644\u0641\u062c\u0631"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v6

    .line 73
    const/4 v7, 0x2

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v6

    .line 74
    const-string v7, "alarm"

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v6

    .line 75
    invoke-virtual {v6, v3, v8}, Landroidx/core/app/NotificationCompat$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v6

    .line 76
    invoke-virtual {v6, v8}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v6

    .line 77
    invoke-virtual {v6}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v6

    const-string v7, "build(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    nop

    .line 79
    .local v6, "notification":Landroid/app/Notification;
    const v7, 0x157c1

    invoke-virtual {v5, v7, v6}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 82
    nop

    .line 83
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 84
    :catch_0
    move-exception v7

    .line 85
    .local v7, "e":Ljava/lang/Exception;
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 89
    .end local v7    # "e":Ljava/lang/Exception;
    :goto_0
    new-instance v7, Lcom/example/fajr/alarm/FajrAlarmScheduler;

    invoke-direct {v7, p1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleNextFajrAlarm()J

    .line 90
    return-void
.end method
