.class public final Lcom/example/alarm/AlarmReceiver;
.super Landroid/content/BroadcastReceiver;
.source "AlarmReceiver.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/alarm/AlarmReceiver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/example/alarm/AlarmReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "showNotification",
        "id",
        "",
        "title",
        "",
        "content",
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

.field public static final CHANNEL_ID:Ljava/lang/String; = "dhikr_channel"

.field public static final CHANNEL_NAME:Ljava/lang/String; = "Dhikr Reminders"

.field public static final Companion:Lcom/example/alarm/AlarmReceiver$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/alarm/AlarmReceiver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/alarm/AlarmReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/alarm/AlarmReceiver;->Companion:Lcom/example/alarm/AlarmReceiver$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/alarm/AlarmReceiver;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private final showNotification(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V
    .locals 16
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "id"    # I
    .param p3, "title"    # Ljava/lang/String;
    .param p4, "content"    # Ljava/lang/String;

    .line 69
    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, "notification"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Landroid/app/NotificationManager;

    if-eqz v5, :cond_0

    check-cast v4, Landroid/app/NotificationManager;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_1

    return-void

    .line 70
    .local v4, "manager":Landroid/app/NotificationManager;
    :cond_1
    sget-object v5, Lcom/example/alarm/AlarmReceiver;->Companion:Lcom/example/alarm/AlarmReceiver$Companion;

    invoke-virtual {v5, v0}, Lcom/example/alarm/AlarmReceiver$Companion;->createNotificationChannel(Landroid/content/Context;)V

    .line 73
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/example/MainActivity;

    invoke-direct {v5, v0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v6, v5

    .local v6, "$this$showNotification_u24lambda_u240\\1":Landroid/content/Intent;
    const/4 v7, 0x0

    .line 74
    .local v7, "$i$a$-apply-AlarmReceiver$showNotification$openAppIntent$1\\1\\73\\0":I
    const/high16 v8, 0x34000000

    invoke-virtual {v6, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 75
    const-string v8, "DHIKR_ID"

    invoke-virtual {v6, v8, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 76
    const-string v9, "NOTIFICATION_ID"

    invoke-virtual {v6, v9, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 77
    nop

    .line 73
    .end local v6    # "$this$showNotification_u24lambda_u240\\1":Landroid/content/Intent;
    .end local v7    # "$i$a$-apply-AlarmReceiver$showNotification$openAppIntent$1\\1\\73\\0":I
    nop

    .line 79
    .local v5, "openAppIntent":Landroid/content/Intent;
    nop

    .line 80
    mul-int/lit8 v6, v1, 0xa

    const/4 v7, 0x1

    add-int/2addr v6, v7

    .line 81
    nop

    .line 82
    nop

    .line 78
    const/high16 v10, 0xc000000

    invoke-static {v0, v6, v5, v10}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 86
    .local v6, "contentPendingIntent":Landroid/app/PendingIntent;
    new-instance v11, Landroid/content/Intent;

    const-class v12, Lcom/example/receiver/NotificationActionReceiver;

    invoke-direct {v11, v0, v12}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v12, v11

    .local v12, "$this$showNotification_u24lambda_u241\\2":Landroid/content/Intent;
    const/4 v13, 0x0

    .line 87
    .local v13, "$i$a$-apply-AlarmReceiver$showNotification$markReadIntent$1\\2\\86\\0":I
    const-string v14, "com.example.ACTION_MARK_AS_READ"

    invoke-virtual {v12, v14}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    invoke-virtual {v12, v8, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 89
    invoke-virtual {v12, v9, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 90
    nop

    .line 86
    .end local v12    # "$this$showNotification_u24lambda_u241\\2":Landroid/content/Intent;
    .end local v13    # "$i$a$-apply-AlarmReceiver$showNotification$markReadIntent$1\\2\\86\\0":I
    nop

    .line 92
    .local v11, "markReadIntent":Landroid/content/Intent;
    nop

    .line 93
    mul-int/lit8 v12, v1, 0xa

    add-int/lit8 v12, v12, 0x2

    .line 94
    nop

    .line 95
    nop

    .line 91
    invoke-static {v0, v12, v11, v10}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v12

    .line 99
    .local v12, "markReadPendingIntent":Landroid/app/PendingIntent;
    new-instance v13, Landroid/content/Intent;

    const-class v14, Lcom/example/receiver/NotificationActionReceiver;

    invoke-direct {v13, v0, v14}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v14, v13

    .local v14, "$this$showNotification_u24lambda_u242\\3":Landroid/content/Intent;
    const/4 v15, 0x0

    .line 100
    .local v15, "$i$a$-apply-AlarmReceiver$showNotification$snoozeIntent$1\\3\\99\\0":I
    const-string v7, "com.example.ACTION_SNOOZE"

    invoke-virtual {v14, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    invoke-virtual {v14, v8, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 102
    const-string v7, "DHIKR_TITLE"

    invoke-virtual {v14, v7, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    const-string v7, "DHIKR_CONTENT"

    invoke-virtual {v14, v7, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    invoke-virtual {v14, v9, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 105
    nop

    .line 99
    .end local v14    # "$this$showNotification_u24lambda_u242\\3":Landroid/content/Intent;
    .end local v15    # "$i$a$-apply-AlarmReceiver$showNotification$snoozeIntent$1\\3\\99\\0":I
    nop

    .line 107
    .local v13, "snoozeIntent":Landroid/content/Intent;
    nop

    .line 108
    mul-int/lit8 v7, v1, 0xa

    add-int/lit8 v7, v7, 0x3

    .line 109
    nop

    .line 110
    nop

    .line 106
    invoke-static {v0, v7, v13, v10}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    .line 115
    .local v7, "snoozePendingIntent":Landroid/app/PendingIntent;
    nop

    .line 116
    mul-int/lit8 v8, v1, 0xa

    add-int/lit8 v8, v8, 0x4

    .line 117
    nop

    .line 118
    nop

    .line 114
    invoke-static {v0, v8, v5, v10}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    .line 121
    .local v8, "openAppPendingIntent":Landroid/app/PendingIntent;
    new-instance v9, Landroidx/core/app/NotificationCompat$Builder;

    const-string v10, "dhikr_channel"

    invoke-direct {v9, v0, v10}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    move-object v10, v2

    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 123
    move-object v10, v3

    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 124
    sget v10, Lcom/example/R$drawable;->ic_notification:I

    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 125
    new-instance v10, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v10}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    move-object v14, v3

    check-cast v14, Ljava/lang/CharSequence;

    invoke-virtual {v10, v14}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v10

    check-cast v10, Landroidx/core/app/NotificationCompat$Style;

    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 126
    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 127
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 128
    invoke-virtual {v9, v6}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 129
    const-string v10, "\u062a\u0645 \u0627\u0644\u0642\u0631\u0627\u0621\u0629"

    check-cast v10, Ljava/lang/CharSequence;

    const/4 v14, 0x0

    invoke-virtual {v9, v14, v10, v12}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 130
    const-string v10, "\u0630\u0643\u0631\u0646\u064a \u0628\u0639\u062f 10 \u062f\u0642\u0627\u0626\u0642"

    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v9, v14, v10, v7}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 131
    const-string v10, "\u0641\u062a\u062d \u0627\u0644\u062a\u0637\u0628\u064a\u0642"

    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v9, v14, v10, v8}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v9

    .line 132
    invoke-virtual {v9}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v9

    const-string v10, "build(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    nop

    .line 134
    .local v9, "notification":Landroid/app/Notification;
    invoke-virtual {v4, v1, v9}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 135
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const-string v0, "DHIKR_ID"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 43
    .local v0, "id":I
    const-string v2, "DHIKR_TITLE"

    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "\u062a\u0630\u0643\u064a\u0631"

    .line 44
    .local v2, "title":Ljava/lang/String;
    :cond_0
    const-string v3, "DHIKR_CONTENT"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, ""

    .line 45
    .local v3, "content":Ljava/lang/String;
    :cond_1
    const-string v4, "IS_SNOOZE"

    const/4 v5, 0x0

    invoke-virtual {p2, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 47
    .local v4, "isSnooze":Z
    if-eq v0, v1, :cond_2

    .line 48
    invoke-direct {p0, p1, v0, v2, v3}, Lcom/example/alarm/AlarmReceiver;->showNotification(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    .line 51
    if-nez v4, :cond_2

    .line 52
    invoke-virtual {p0}, Lcom/example/alarm/AlarmReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v1

    .line 53
    .local v1, "pendingResult":Landroid/content/BroadcastReceiver$PendingResult;
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v5

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v5}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v6

    new-instance v5, Lcom/example/alarm/AlarmReceiver$onReceive$1;

    const/4 v7, 0x0

    invoke-direct {v5, p1, v0, v1, v7}, Lcom/example/alarm/AlarmReceiver$onReceive$1;-><init>(Landroid/content/Context;ILandroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V

    move-object v9, v5

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 66
    .end local v1    # "pendingResult":Landroid/content/BroadcastReceiver$PendingResult;
    :cond_2
    return-void
.end method
