.class public final Lcom/example/receiver/NotificationActionReceiver;
.super Landroid/content/BroadcastReceiver;
.source "NotificationActionReceiver.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/receiver/NotificationActionReceiver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/example/receiver/NotificationActionReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
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

.field public static final ACTION_MARK_AS_READ:Ljava/lang/String; = "com.example.ACTION_MARK_AS_READ"

.field public static final ACTION_SNOOZE:Ljava/lang/String; = "com.example.ACTION_SNOOZE"

.field public static final Companion:Lcom/example/receiver/NotificationActionReceiver$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/receiver/NotificationActionReceiver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/receiver/NotificationActionReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/receiver/NotificationActionReceiver;->Companion:Lcom/example/receiver/NotificationActionReceiver$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/receiver/NotificationActionReceiver;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

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

    .line 21
    const-string v0, "NOTIFICATION_ID"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 22
    .local v0, "notificationId":I
    const-string v2, "DHIKR_ID"

    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 24
    .local v2, "dhikrId":I
    const-string v3, "notification"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Landroid/app/NotificationManager;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v3, Landroid/app/NotificationManager;

    goto :goto_0

    :cond_0
    move-object v3, v5

    .line 25
    .local v3, "manager":Landroid/app/NotificationManager;
    :goto_0
    if-eq v0, v1, :cond_1

    .line 26
    if-eqz v3, :cond_1

    invoke-virtual {v3, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 29
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v6, "com.example.ACTION_MARK_AS_READ"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 31
    :cond_2
    if-eq v2, v1, :cond_6

    .line 32
    invoke-virtual {p0}, Lcom/example/receiver/NotificationActionReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v1

    .line 33
    .local v1, "pendingResult":Landroid/content/BroadcastReceiver$PendingResult;
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v4

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v4}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v6

    new-instance v4, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;

    invoke-direct {v4, p1, v2, v1, v5}, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;-><init>(Landroid/content/Context;ILandroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V

    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .end local v1    # "pendingResult":Landroid/content/BroadcastReceiver$PendingResult;
    goto :goto_1

    .line 29
    :sswitch_1
    const-string v5, "com.example.ACTION_SNOOZE"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 47
    :cond_3
    if-eq v2, v1, :cond_6

    .line 48
    const-string v1, "DHIKR_TITLE"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, "\u062a\u0630\u0643\u064a\u0631"

    .line 49
    .local v1, "title":Ljava/lang/String;
    :cond_4
    const-string v4, "DHIKR_CONTENT"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    const-string v4, ""

    .line 50
    .local v4, "content":Ljava/lang/String;
    :cond_5
    new-instance v5, Lcom/example/alarm/AlarmScheduler;

    invoke-direct {v5, p1}, Lcom/example/alarm/AlarmScheduler;-><init>(Landroid/content/Context;)V

    const/16 v6, 0xa

    invoke-virtual {v5, v2, v1, v4, v6}, Lcom/example/alarm/AlarmScheduler;->scheduleSnooze(ILjava/lang/String;Ljava/lang/String;I)V

    .line 54
    .end local v1    # "title":Ljava/lang/String;
    .end local v4    # "content":Ljava/lang/String;
    :cond_6
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7e5cae22 -> :sswitch_1
        -0x37622ff7 -> :sswitch_0
    .end sparse-switch
.end method
