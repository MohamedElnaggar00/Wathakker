.class public final Lcom/example/widget/FaceWidgetReceiver;
.super Landroid/content/BroadcastReceiver;
.source "FaceWidgetReceiver.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/widget/FaceWidgetReceiver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/example/widget/FaceWidgetReceiver;",
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

.field public static final ACTION_REQUEST:Ljava/lang/String; = "com.samsung.android.intent.action.REQUEST_SERVICEBOX_REMOTEVIEWS"

.field public static final ACTION_RESPONSE:Ljava/lang/String; = "com.samsung.android.intent.action.RESPONSE_SERVICEBOX_REMOTEVIEWS"

.field public static final Companion:Lcom/example/widget/FaceWidgetReceiver$Companion;

.field public static final PAGE_ID_PRAYER:Ljava/lang/String; = "wathakker_prayer"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/widget/FaceWidgetReceiver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/widget/FaceWidgetReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/widget/FaceWidgetReceiver;->Companion:Lcom/example/widget/FaceWidgetReceiver$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/widget/FaceWidgetReceiver;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.samsung.android.intent.action.REQUEST_SERVICEBOX_REMOTEVIEWS"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 11
    :cond_0
    const-string v0, "pageId"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 12
    .local v0, "pageId":Ljava/lang/String;
    :cond_1
    sget-object v1, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    invoke-virtual {v1, p1, v0}, Lcom/example/widget/WidgetUpdater;->pushFaceWidget(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    return-void
.end method
