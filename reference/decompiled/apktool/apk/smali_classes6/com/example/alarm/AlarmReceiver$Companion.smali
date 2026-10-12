.class public final Lcom/example/alarm/AlarmReceiver$Companion;
.super Ljava/lang/Object;
.source "AlarmReceiver.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/alarm/AlarmReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/example/alarm/AlarmReceiver$Companion;",
        "",
        "<init>",
        "()V",
        "CHANNEL_ID",
        "",
        "CHANNEL_NAME",
        "createNotificationChannel",
        "",
        "context",
        "Landroid/content/Context;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/example/alarm/AlarmReceiver$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createNotificationChannel(Landroid/content/Context;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 28
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/app/NotificationManager;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/NotificationManager;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 29
    .local v0, "manager":Landroid/app/NotificationManager;
    :goto_0
    new-instance v1, Landroid/app/NotificationChannel;

    .line 30
    nop

    .line 31
    const-string v2, "Dhikr Reminders"

    check-cast v2, Ljava/lang/CharSequence;

    .line 32
    nop

    .line 29
    const-string v3, "dhikr_channel"

    const/4 v4, 0x4

    invoke-direct {v1, v3, v2, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 33
    move-object v2, v1

    .local v2, "$this$createNotificationChannel_u24lambda_u240\\1":Landroid/app/NotificationChannel;
    const/4 v3, 0x0

    .line 34
    .local v3, "$i$a$-apply-AlarmReceiver$Companion$createNotificationChannel$channel$1\\1\\33\\0":I
    const-string v4, "\u0625\u0634\u0639\u0627\u0631\u0627\u062a \u062a\u0630\u0643\u064a\u0631 \u0627\u0644\u0623\u0630\u0643\u0627\u0631"

    invoke-virtual {v2, v4}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 35
    nop

    .line 33
    .end local v2    # "$this$createNotificationChannel_u24lambda_u240\\1":Landroid/app/NotificationChannel;
    .end local v3    # "$i$a$-apply-AlarmReceiver$Companion$createNotificationChannel$channel$1\\1\\33\\0":I
    nop

    .line 29
    nop

    .line 36
    .local v1, "channel":Landroid/app/NotificationChannel;
    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 38
    .end local v0    # "manager":Landroid/app/NotificationManager;
    .end local v1    # "channel":Landroid/app/NotificationChannel;
    :cond_1
    return-void
.end method
