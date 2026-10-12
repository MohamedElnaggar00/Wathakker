.class public final Lcom/example/widget/WidgetTickScheduler;
.super Ljava/lang/Object;
.source "WidgetTickScheduler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/example/widget/WidgetTickScheduler;",
        "",
        "<init>",
        "()V",
        "ACTION_TICK",
        "",
        "pendingIntent",
        "Landroid/app/PendingIntent;",
        "context",
        "Landroid/content/Context;",
        "schedule",
        "",
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
.field public static final $stable:I = 0x0

.field public static final ACTION_TICK:Ljava/lang/String; = "com.example.widget.TICK"

.field public static final INSTANCE:Lcom/example/widget/WidgetTickScheduler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/example/widget/WidgetTickScheduler;

    invoke-direct {v0}, Lcom/example/widget/WidgetTickScheduler;-><init>()V

    sput-object v0, Lcom/example/widget/WidgetTickScheduler;->INSTANCE:Lcom/example/widget/WidgetTickScheduler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final pendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .line 27
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/example/widget/WidgetTickReceiver;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.example.widget.TICK"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "setAction(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .local v0, "intent":Landroid/content/Intent;
    nop

    .line 30
    nop

    .line 28
    const/16 v1, 0x2bc

    const/high16 v2, 0xc000000

    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const-string v2, "getBroadcast(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final schedule(Landroid/content/Context;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    const-string v0, "alarm"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.AlarmManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/AlarmManager;

    .line 36
    .local v0, "alarmManager":Landroid/app/AlarmManager;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    move-object v2, v1

    .local v2, "$this$schedule_u24lambda_u240\\1":Ljava/util/Calendar;
    const/4 v3, 0x0

    .line 37
    .local v3, "$i$a$-apply-WidgetTickScheduler$schedule$next$1\\1\\36\\0":I
    const/16 v4, 0xc

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Ljava/util/Calendar;->add(II)V

    .line 38
    const/16 v4, 0xd

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Ljava/util/Calendar;->set(II)V

    .line 39
    const/16 v4, 0xe

    invoke-virtual {v2, v4, v5}, Ljava/util/Calendar;->set(II)V

    .line 40
    nop

    .line 36
    .end local v2    # "$this$schedule_u24lambda_u240\\1":Ljava/util/Calendar;
    .end local v3    # "$i$a$-apply-WidgetTickScheduler$schedule$next$1\\1\\36\\0":I
    nop

    .line 41
    .local v1, "next":Ljava/util/Calendar;
    nop

    .line 42
    :try_start_0
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetTickScheduler;->pendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v0, v5, v2, v3, v4}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 43
    :catch_0
    move-exception v2

    .line 44
    .local v2, "e":Ljava/lang/SecurityException;
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetTickScheduler;->pendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v6

    invoke-virtual {v0, v5, v3, v4, v6}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    .line 46
    .end local v2    # "e":Ljava/lang/SecurityException;
    :goto_0
    return-void
.end method
