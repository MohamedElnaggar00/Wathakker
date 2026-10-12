.class public abstract Lcom/example/widget/BaseWathakkerWidgetProvider;
.super Landroid/appwidget/AppWidgetProvider;
.source "WidgetProviders.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/example/widget/BaseWathakkerWidgetProvider;",
        "Landroid/appwidget/AppWidgetProvider;",
        "<init>",
        "()V",
        "onUpdate",
        "",
        "context",
        "Landroid/content/Context;",
        "appWidgetManager",
        "Landroid/appwidget/AppWidgetManager;",
        "appWidgetIds",
        "",
        "onEnabled",
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

    sput v0, Lcom/example/widget/BaseWathakkerWidgetProvider;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Lcom/example/lockwidgets/HomeWidgets;->updateAll(Landroid/content/Context;)V

    return-void
.end method

.method public onEnabled(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v0, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    invoke-virtual {v0, p1}, Lcom/example/widget/WidgetUpdater;->updateAll(Landroid/content/Context;)V

    .line 15
    sget-object v0, Lcom/example/widget/WidgetTickScheduler;->INSTANCE:Lcom/example/widget/WidgetTickScheduler;

    invoke-virtual {v0, p1}, Lcom/example/widget/WidgetTickScheduler;->schedule(Landroid/content/Context;)V

    .line 16
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appWidgetManager"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "appWidgetIds"    # [I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appWidgetManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appWidgetIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    sget-object v0, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    invoke-virtual {v0, p1}, Lcom/example/widget/WidgetUpdater;->updateAll(Landroid/content/Context;)V

    .line 10
    sget-object v0, Lcom/example/widget/WidgetTickScheduler;->INSTANCE:Lcom/example/widget/WidgetTickScheduler;

    invoke-virtual {v0, p1}, Lcom/example/widget/WidgetTickScheduler;->schedule(Landroid/content/Context;)V

    .line 11
    return-void
.end method
