.class public final Lcom/example/widget/WidgetUpdater;
.super Ljava/lang/Object;
.source "WidgetUpdater.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/widget/WidgetUpdater$IqamaState;,
        Lcom/example/widget/WidgetUpdater$PrayerState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWidgetUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetUpdater.kt\ncom/example/widget/WidgetUpdater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,394:1\n1#2:395\n360#3,7:396\n388#3,7:403\n1056#3:410\n543#3,6:411\n295#3,2:417\n295#3,2:419\n295#3,2:421\n*S KotlinDebug\n*F\n+ 1 WidgetUpdater.kt\ncom/example/widget/WidgetUpdater\n*L\n51#1:396,7\n64#1:403,7\n159#1:410\n160#1:411,6\n165#1:417,2\n167#1:419,2\n168#1:421,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u000245B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000cJ\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J(\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010\"\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J0\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0016\u0010\'\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\u0005J,\u0010)\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010*\u001a\u0006\u0012\u0002\u0008\u00030+2\u0006\u0010,\u001a\u00020-H\u0002J(\u0010.\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010/\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J \u00100\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\nH\u0002J \u00101\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J \u00102\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J(\u00103\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H\u0002R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"
    }
    d2 = {
        "Lcom/example/widget/WidgetUpdater;",
        "",
        "<init>",
        "()V",
        "formatTime",
        "",
        "millis",
        "",
        "formatTimeShort",
        "computeState",
        "Lcom/example/widget/WidgetUpdater$PrayerState;",
        "context",
        "Landroid/content/Context;",
        "launchIntent",
        "Landroid/app/PendingIntent;",
        "updateAll",
        "",
        "iqamaOffsets",
        "",
        "",
        "barVariants",
        "barLayout",
        "base",
        "compactRemaining",
        "computeIqamaState",
        "Lcom/example/widget/WidgetUpdater$IqamaState;",
        "state",
        "now",
        "updateIqama",
        "mgr",
        "Landroid/appwidget/AppWidgetManager;",
        "updateIqamaSmall",
        "formatRemaining",
        "updateHero",
        "updatePill",
        "updateClockCountdown",
        "updateWideBar",
        "cal",
        "Ljava/util/Calendar;",
        "pushFaceWidget",
        "pageId",
        "applyToAll",
        "cls",
        "Ljava/lang/Class;",
        "views",
        "Landroid/widget/RemoteViews;",
        "updateNextPrayer",
        "updatePrayerBar",
        "updateSchedule",
        "updateHijri",
        "updateGregorian",
        "updateDayPrayer",
        "PrayerState",
        "IqamaState",
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

.field public static final INSTANCE:Lcom/example/widget/WidgetUpdater;

.field private static final barVariants:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final iqamaOffsets:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/example/widget/WidgetUpdater;

    invoke-direct {v0}, Lcom/example/widget/WidgetUpdater;-><init>()V

    sput-object v0, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    .line 110
    const/4 v0, 0x5

    new-array v1, v0, [Lkotlin/Pair;

    const/16 v2, 0x19

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "\u0627\u0644\u0641\u062c\u0631"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "\u0627\u0644\u0638\u0647\u0631"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/16 v2, 0xf

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v5, "\u0627\u0644\u0639\u0635\u0631"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x2

    aput-object v5, v1, v6

    const/16 v5, 0xa

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v7, "\u0627\u0644\u0645\u063a\u0631\u0628"

    invoke-static {v7, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v7, 0x3

    aput-object v5, v1, v7

    const-string v5, "\u0627\u0644\u0639\u0634\u0627\u0621"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x4

    aput-object v2, v1, v5

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lcom/example/widget/WidgetUpdater;->iqamaOffsets:Ljava/util/Map;

    .line 113
    nop

    .line 114
    const/4 v1, 0x6

    new-array v1, v1, [Lkotlin/Pair;

    sget v2, Lcom/example/R$layout;->widget_hero:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v8, v7, [Lkotlin/Pair;

    sget v9, Lcom/example/R$layout;->widget_hero_amber:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v10, "amber"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v3

    sget v9, Lcom/example/R$layout;->widget_hero_blue:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v11, "blue"

    invoke-static {v11, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v4

    sget v9, Lcom/example/R$layout;->widget_hero_green:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v12, "green"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v3

    .line 115
    sget v2, Lcom/example/R$layout;->widget_hero_compact:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v8, v7, [Lkotlin/Pair;

    sget v9, Lcom/example/R$layout;->widget_hero_compact_amber:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v3

    sget v9, Lcom/example/R$layout;->widget_hero_compact_blue:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v11, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v4

    sget v9, Lcom/example/R$layout;->widget_hero_compact_green:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v4

    .line 114
    nop

    .line 116
    sget v2, Lcom/example/R$layout;->widget_iqama:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v8, v7, [Lkotlin/Pair;

    sget v9, Lcom/example/R$layout;->widget_iqama_white:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v13, "white"

    invoke-static {v13, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v3

    sget v9, Lcom/example/R$layout;->widget_iqama_blue:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v11, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v4

    sget v9, Lcom/example/R$layout;->widget_iqama_green:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v6

    .line 114
    nop

    .line 117
    sget v2, Lcom/example/R$layout;->widget_iqama_small:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v8, v7, [Lkotlin/Pair;

    sget v9, Lcom/example/R$layout;->widget_iqama_small_white:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v13, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v3

    sget v9, Lcom/example/R$layout;->widget_iqama_small_blue:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v11, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v4

    sget v9, Lcom/example/R$layout;->widget_iqama_small_green:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v7

    .line 114
    nop

    .line 118
    sget v2, Lcom/example/R$layout;->widget_prayer_bar:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v8, v7, [Lkotlin/Pair;

    sget v9, Lcom/example/R$layout;->widget_prayer_bar_amber:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v3

    sget v9, Lcom/example/R$layout;->widget_prayer_bar_blue:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v11, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v4

    sget v9, Lcom/example/R$layout;->widget_prayer_bar_green:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v5

    .line 114
    nop

    .line 119
    sget v2, Lcom/example/R$layout;->widget_wide_bar:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v5, v7, [Lkotlin/Pair;

    sget v7, Lcom/example/R$layout;->widget_wide_bar_amber:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v10, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v5, v3

    sget v3, Lcom/example/R$layout;->widget_wide_bar_blue:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v11, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v5, v4

    sget v3, Lcom/example/R$layout;->widget_wide_bar_green:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v5, v6

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v0

    .line 114
    nop

    .line 113
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/example/widget/WidgetUpdater;->barVariants:Ljava/util/Map;

    const/16 v0, 0x8

    sput v0, Lcom/example/widget/WidgetUpdater;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "cls"    # Ljava/lang/Class;
    .param p4, "views"    # Landroid/widget/RemoteViews;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/appwidget/AppWidgetManager;",
            "Ljava/lang/Class<",
            "*>;",
            "Landroid/widget/RemoteViews;",
            ")V"
        }
    .end annotation

    .line 317
    new-instance v0, Landroid/content/ComponentName;

    invoke-direct {v0, p1, p3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v0

    .line 318
    .local v0, "ids":[I
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    invoke-virtual {p2, v0, p4}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    .line 319
    :cond_1
    return-void
.end method

.method private final barLayout(Landroid/content/Context;I)I
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "base"    # I

    .line 123
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    invoke-direct {v0, p1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getWidgetBarColor()Ljava/lang/String;

    move-result-object v0

    .line 124
    .local v0, "c":Ljava/lang/String;
    const-string v1, "default"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    goto :goto_0

    :cond_1
    sget-object v1, Lcom/example/widget/WidgetUpdater;->barVariants:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :goto_0
    move v1, p2

    :goto_1
    return v1
.end method

.method private final compactRemaining(J)Ljava/lang/String;
    .locals 6
    .param p1, "millis"    # J

    .line 129
    const-wide/32 v0, 0xea60

    div-long v0, p1, v0

    long-to-int v0, v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 130
    .local v0, "totalMinutes":I
    div-int/lit8 v1, v0, 0x3c

    .line 131
    .local v1, "h":I
    rem-int/lit8 v2, v0, 0x3c

    .line 132
    .local v2, "m":I
    const-string v3, " \u062f"

    new-instance v4, Ljava/lang/StringBuilder;

    if-gtz v1, :cond_0

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    :cond_0
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " \u0633 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    :goto_0
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method private final computeIqamaState(Landroid/content/Context;Lcom/example/widget/WidgetUpdater$PrayerState;J)Lcom/example/widget/WidgetUpdater$IqamaState;
    .locals 30
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p3, "now"    # J

    .line 142
    move-wide/from16 v0, p3

    const-string v2, "\u0627\u0644\u0641\u062c\u0631"

    const-string v3, "\u0627\u0644\u0638\u0647\u0631"

    const-string v4, "\u0627\u0644\u0639\u0635\u0631"

    const-string v5, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v6, "\u0627\u0644\u0639\u0634\u0627\u0621"

    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 146
    .local v3, "iqamaPrayers":Ljava/util/List;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 147
    .local v4, "windows":Ljava/util/List;
    const/4 v5, 0x0

    .local v5, "i":I
    invoke-virtual/range {p2 .. p2}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNames()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_0
    if-ge v5, v7, :cond_1

    .line 148
    invoke-virtual/range {p2 .. p2}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNames()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/lang/String;

    .line 149
    .local v10, "n":Ljava/lang/String;
    invoke-interface {v3, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    new-instance v9, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    invoke-virtual/range {p2 .. p2}, Lcom/example/widget/WidgetUpdater$PrayerState;->getTimes()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual/range {p2 .. p2}, Lcom/example/widget/WidgetUpdater$PrayerState;->getTimes()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v13

    invoke-static {v10, v13, v14}, Lcom/example/widget/WidgetUpdater;->computeIqamaState$iqamaOf(Ljava/lang/String;J)J

    move-result-wide v13

    invoke-direct/range {v9 .. v14}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;-><init>(Ljava/lang/String;JJ)V

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    .end local v10    # "n":Ljava/lang/String;
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 152
    .end local v5    # "i":I
    :cond_1
    new-instance v5, Lcom/example/fajr/data/FajrPreferences;

    move-object/from16 v7, p1

    invoke-direct {v5, v7}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    .line 153
    .local v5, "prefs":Lcom/example/fajr/data/FajrPreferences;
    sget-object v8, Lcom/example/fajr/calculation/CalculationMethod;->Companion:Lcom/example/fajr/calculation/CalculationMethod$Companion;

    invoke-virtual {v5}, Lcom/example/fajr/data/FajrPreferences;->getCalculationMethodId()I

    move-result v9

    invoke-virtual {v8, v9}, Lcom/example/fajr/calculation/CalculationMethod$Companion;->fromId(I)Lcom/example/fajr/calculation/CalculationMethod;

    move-result-object v16

    .line 154
    .local v16, "method":Lcom/example/fajr/calculation/CalculationMethod;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v8

    move-object v9, v8

    .line 395
    .local v9, "$this$computeIqamaState_u24lambda_u249\\1":Ljava/util/Calendar;
    const/4 v10, 0x0

    .line 154
    .local v10, "$i$a$-apply-WidgetUpdater$computeIqamaState$cal$1\\1\\154\\0":I
    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 155
    .end local v9    # "$this$computeIqamaState_u24lambda_u249\\1":Ljava/util/Calendar;
    .end local v10    # "$i$a$-apply-WidgetUpdater$computeIqamaState$cal$1\\1\\154\\0":I
    .local v8, "cal":Ljava/util/Calendar;
    sget-object v10, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    invoke-virtual {v8}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v9

    const-string v11, "null cannot be cast to non-null type java.util.Calendar"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/util/Calendar;

    .line 395
    move-object v12, v9

    .local v12, "$this$computeIqamaState_u24lambda_u2410\\2":Ljava/util/Calendar;
    const/4 v13, 0x0

    .line 155
    .local v13, "$i$a$-apply-WidgetUpdater$computeIqamaState$yesterday$1\\2\\155\\0":I
    const/4 v14, -0x1

    const/4 v15, 0x6

    invoke-virtual {v12, v15, v14}, Ljava/util/Calendar;->add(II)V

    .end local v12    # "$this$computeIqamaState_u24lambda_u2410\\2":Ljava/util/Calendar;
    .end local v13    # "$i$a$-apply-WidgetUpdater$computeIqamaState$yesterday$1\\2\\155\\0":I
    invoke-virtual {v5}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v12

    move/from16 v17, v15

    invoke-virtual {v5}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v14

    move-object/from16 v29, v11

    move-object v11, v9

    move-object/from16 v9, v29

    invoke-virtual/range {v10 .. v16}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateAll(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;

    move-result-object v18

    .line 156
    .local v18, "yesterday":Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;
    new-instance v10, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    invoke-virtual/range {v18 .. v18}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getIsha()J

    move-result-wide v12

    invoke-virtual/range {v18 .. v18}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getIsha()J

    move-result-wide v14

    invoke-static {v6, v14, v15}, Lcom/example/widget/WidgetUpdater;->computeIqamaState$iqamaOf(Ljava/lang/String;J)J

    move-result-wide v14

    const-string v11, "\u0627\u0644\u0639\u0634\u0627\u0621"

    invoke-direct/range {v10 .. v15}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;-><init>(Ljava/lang/String;JJ)V

    move-object v6, v10

    .line 157
    .local v6, "yIsha":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    sget-object v10, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    invoke-virtual {v8}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/util/Calendar;

    .line 395
    move-object v9, v11

    .local v9, "$this$computeIqamaState_u24lambda_u2411\\3":Ljava/util/Calendar;
    const/4 v12, 0x0

    .line 157
    .local v12, "$i$a$-apply-WidgetUpdater$computeIqamaState$tomorrow$1\\3\\157\\0":I
    const/4 v13, 0x1

    const/4 v14, 0x6

    invoke-virtual {v9, v14, v13}, Ljava/util/Calendar;->add(II)V

    move v9, v13

    .end local v9    # "$this$computeIqamaState_u24lambda_u2411\\3":Ljava/util/Calendar;
    .end local v12    # "$i$a$-apply-WidgetUpdater$computeIqamaState$tomorrow$1\\3\\157\\0":I
    invoke-virtual {v5}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v5}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v14

    invoke-virtual/range {v10 .. v16}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateAll(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;

    move-result-object v10

    .line 158
    .local v10, "tomorrow":Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;
    new-instance v19, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    invoke-virtual {v10}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getFajr()J

    move-result-wide v21

    invoke-virtual {v10}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getFajr()J

    move-result-wide v11

    invoke-static {v2, v11, v12}, Lcom/example/widget/WidgetUpdater;->computeIqamaState$iqamaOf(Ljava/lang/String;J)J

    move-result-wide v23

    const-string v20, "\u0627\u0644\u0641\u062c\u0631"

    invoke-direct/range {v19 .. v24}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;-><init>(Ljava/lang/String;JJ)V

    .line 159
    .local v19, "tFajr":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    move-object v11, v4

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static/range {v19 .. v19}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$sortedBy\\4":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 410
    .local v11, "$i$f$sortedBy\\4\\159":I
    new-instance v12, Lcom/example/widget/WidgetUpdater$computeIqamaState$$inlined$sortedBy$1;

    invoke-direct {v12}, Lcom/example/widget/WidgetUpdater$computeIqamaState$$inlined$sortedBy$1;-><init>()V

    check-cast v12, Ljava/util/Comparator;

    invoke-static {v2, v12}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    .line 159
    .end local v2    # "$this$sortedBy\\4":Ljava/lang/Iterable;
    .end local v11    # "$i$f$sortedBy\\4\\159":I
    nop

    .line 160
    .local v2, "all":Ljava/util/List;
    move-object v11, v2

    .local v11, "$this$lastOrNull\\5":Ljava/util/List;
    const/4 v12, 0x0

    .line 411
    .local v12, "$i$f$lastOrNull\\5\\160":I
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    invoke-interface {v11, v13}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v13

    .line 412
    .local v13, "iterator\\5":Ljava/util/ListIterator;
    :cond_2
    invoke-interface {v13}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v14

    const/4 v15, 0x0

    const/16 v17, 0x0

    if-eqz v14, :cond_4

    .line 413
    invoke-interface {v13}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v14

    .line 414
    .local v14, "element\\5":Ljava/lang/Object;
    move-object/from16 v20, v14

    check-cast v20, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    .local v20, "it\\6":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    const/16 v21, 0x0

    .line 160
    .local v21, "$i$a$-lastOrNull-WidgetUpdater$computeIqamaState$current$1\\6\\414\\0":I
    invoke-virtual/range {v20 .. v20}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v22

    cmp-long v22, v22, v0

    if-gtz v22, :cond_3

    move/from16 v20, v9

    goto :goto_1

    :cond_3
    move/from16 v20, v15

    .line 414
    .end local v20    # "it\\6":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .end local v21    # "$i$a$-lastOrNull-WidgetUpdater$computeIqamaState$current$1\\6\\414\\0":I
    :goto_1
    if-eqz v20, :cond_2

    goto :goto_2

    .line 416
    .end local v14    # "element\\5":Ljava/lang/Object;
    :cond_4
    move-object/from16 v14, v17

    .line 160
    .end local v11    # "$this$lastOrNull\\5":Ljava/util/List;
    .end local v12    # "$i$f$lastOrNull\\5\\160":I
    .end local v13    # "iterator\\5":Ljava/util/ListIterator;
    :goto_2
    check-cast v14, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    if-nez v14, :cond_5

    return-object v17

    .line 161
    .local v14, "current":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    :cond_5
    const/4 v11, 0x0

    .line 162
    .local v11, "active":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    const/4 v12, 0x0

    .line 163
    .local v12, "nextAfter":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    invoke-virtual {v14}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getIqama()J

    move-result-wide v20

    cmp-long v13, v0, v20

    if-gtz v13, :cond_9

    .line 164
    move-object v11, v14

    .line 165
    move-object v13, v2

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$firstOrNull\\7":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 417
    .local v20, "$i$f$firstOrNull\\7\\165":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :cond_6
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_8

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .local v22, "element\\7":Ljava/lang/Object;
    move-object/from16 v23, v22

    check-cast v23, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    .local v23, "it\\8":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    const/16 v24, 0x0

    .line 165
    .local v24, "$i$a$-firstOrNull-WidgetUpdater$computeIqamaState$1\\8\\417\\0":I
    invoke-virtual/range {v23 .. v23}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v25

    invoke-virtual {v14}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v27

    cmp-long v25, v25, v27

    if-lez v25, :cond_7

    move/from16 v23, v9

    goto :goto_3

    :cond_7
    move/from16 v23, v15

    .line 417
    .end local v23    # "it\\8":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .end local v24    # "$i$a$-firstOrNull-WidgetUpdater$computeIqamaState$1\\8\\417\\0":I
    :goto_3
    if-eqz v23, :cond_6

    move-object/from16 v17, v22

    goto :goto_4

    .line 418
    .end local v22    # "element\\7":Ljava/lang/Object;
    :cond_8
    nop

    .end local v13    # "$this$firstOrNull\\7":Ljava/lang/Iterable;
    .end local v20    # "$i$f$firstOrNull\\7\\165":I
    :goto_4
    check-cast v17, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    .line 165
    nop

    .end local v12    # "nextAfter":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .local v17, "nextAfter":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    goto :goto_9

    .line 167
    .end local v17    # "nextAfter":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .restart local v12    # "nextAfter":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    :cond_9
    move-object v13, v2

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$firstOrNull\\9":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 419
    .local v20, "$i$f$firstOrNull\\9\\167":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :cond_a
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_c

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .local v22, "element\\9":Ljava/lang/Object;
    move-object/from16 v23, v22

    check-cast v23, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    .local v23, "it\\10":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    const/16 v24, 0x0

    .line 167
    .local v24, "$i$a$-firstOrNull-WidgetUpdater$computeIqamaState$2\\10\\419\\0":I
    invoke-virtual/range {v23 .. v23}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v25

    cmp-long v25, v25, v0

    if-lez v25, :cond_b

    move/from16 v23, v9

    goto :goto_5

    :cond_b
    move/from16 v23, v15

    .line 419
    .end local v23    # "it\\10":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .end local v24    # "$i$a$-firstOrNull-WidgetUpdater$computeIqamaState$2\\10\\419\\0":I
    :goto_5
    if-eqz v23, :cond_a

    goto :goto_6

    .line 420
    .end local v22    # "element\\9":Ljava/lang/Object;
    :cond_c
    move-object/from16 v22, v17

    .line 167
    .end local v13    # "$this$firstOrNull\\9":Ljava/lang/Iterable;
    .end local v20    # "$i$f$firstOrNull\\9\\167":I
    :goto_6
    check-cast v22, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    if-nez v22, :cond_d

    return-object v17

    :cond_d
    move-object/from16 v11, v22

    .line 168
    move-object v13, v2

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$firstOrNull\\11":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 421
    .local v20, "$i$f$firstOrNull\\11\\168":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :cond_e
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_10

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .local v22, "element\\11":Ljava/lang/Object;
    move-object/from16 v23, v22

    check-cast v23, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    .local v23, "it\\12":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    const/16 v24, 0x0

    .line 168
    .local v24, "$i$a$-firstOrNull-WidgetUpdater$computeIqamaState$3\\12\\421\\0":I
    invoke-virtual/range {v23 .. v23}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v25

    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v27

    cmp-long v25, v25, v27

    if-lez v25, :cond_f

    move/from16 v23, v9

    goto :goto_7

    :cond_f
    move/from16 v23, v15

    .line 421
    .end local v23    # "it\\12":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .end local v24    # "$i$a$-firstOrNull-WidgetUpdater$computeIqamaState$3\\12\\421\\0":I
    :goto_7
    if-eqz v23, :cond_e

    move-object/from16 v17, v22

    goto :goto_8

    .line 422
    .end local v22    # "element\\11":Ljava/lang/Object;
    :cond_10
    nop

    .end local v13    # "$this$firstOrNull\\11":Ljava/lang/Iterable;
    .end local v20    # "$i$f$firstOrNull\\11\\168":I
    :goto_8
    check-cast v17, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;

    .line 168
    nop

    .line 170
    .end local v12    # "nextAfter":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    .restart local v17    # "nextAfter":Lcom/example/widget/WidgetUpdater$computeIqamaState$W;
    :goto_9
    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getIqama()J

    move-result-wide v12

    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v20

    sub-long v12, v12, v20

    const-wide/16 v0, 0x1

    invoke-static {v12, v13, v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v0

    .line 171
    .local v0, "interval":J
    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v12

    sub-long v12, p3, v12

    const-wide/16 v20, 0x64

    mul-long v12, v12, v20

    div-long/2addr v12, v0

    long-to-int v9, v12

    const/16 v12, 0x64

    invoke-static {v9, v15, v12}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v26

    .line 172
    .local v26, "pct":I
    new-instance v20, Lcom/example/widget/WidgetUpdater$IqamaState;

    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getName()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getAdhan()J

    move-result-wide v22

    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getIqama()J

    move-result-wide v24

    if-eqz v17, :cond_11

    invoke-virtual/range {v17 .. v17}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getIqama()J

    move-result-wide v12

    goto :goto_a

    :cond_11
    invoke-virtual {v11}, Lcom/example/widget/WidgetUpdater$computeIqamaState$W;->getIqama()J

    move-result-wide v12

    :goto_a
    move-wide/from16 v27, v12

    invoke-direct/range {v20 .. v28}, Lcom/example/widget/WidgetUpdater$IqamaState;-><init>(Ljava/lang/String;JJIJ)V

    return-object v20
.end method

.method private static final computeIqamaState$iqamaOf(Ljava/lang/String;J)J
    .locals 4
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "adhan"    # J

    .line 143
    sget-object v0, Lcom/example/widget/WidgetUpdater;->iqamaOffsets:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0xf

    :goto_0
    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-long/2addr v0, p1

    return-wide v0
.end method

.method private final computeState(Landroid/content/Context;)Lcom/example/widget/WidgetUpdater$PrayerState;
    .locals 28
    .param p1, "context"    # Landroid/content/Context;

    .line 42
    new-instance v0, Lcom/example/fajr/data/FajrPreferences;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/example/fajr/data/FajrPreferences;-><init>(Landroid/content/Context;)V

    .line 43
    .local v0, "prefs":Lcom/example/fajr/data/FajrPreferences;
    sget-object v2, Lcom/example/fajr/calculation/CalculationMethod;->Companion:Lcom/example/fajr/calculation/CalculationMethod$Companion;

    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getCalculationMethodId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/example/fajr/calculation/CalculationMethod$Companion;->fromId(I)Lcom/example/fajr/calculation/CalculationMethod;

    move-result-object v10

    .line 44
    .local v10, "method":Lcom/example/fajr/calculation/CalculationMethod;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 45
    .local v2, "now":J
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    move-object v4, v5

    .line 395
    .local v4, "$this$computeState_u24lambda_u242\\1":Ljava/util/Calendar;
    const/4 v6, 0x0

    .line 45
    .local v6, "$i$a$-apply-WidgetUpdater$computeState$cal$1\\1\\45\\0":I
    invoke-virtual {v4, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 46
    .end local v4    # "$this$computeState_u24lambda_u242\\1":Ljava/util/Calendar;
    .end local v6    # "$i$a$-apply-WidgetUpdater$computeState$cal$1\\1\\45\\0":I
    .local v5, "cal":Ljava/util/Calendar;
    sget-object v4, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v8

    invoke-virtual/range {v4 .. v10}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateAll(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;

    move-result-object v11

    .line 48
    move-object v12, v5

    .end local v5    # "cal":Ljava/util/Calendar;
    .local v11, "today":Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;
    .local v12, "cal":Ljava/util/Calendar;
    invoke-virtual {v11}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getFajr()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v11}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getSunrise()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v11}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getDhuhr()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v11}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getAsr()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v11}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getMaghrib()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v11}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getIsha()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const/4 v13, 0x6

    new-array v14, v13, [Ljava/lang/Long;

    const/4 v15, 0x0

    aput-object v4, v14, v15

    const/4 v4, 0x1

    aput-object v5, v14, v4

    const/4 v5, 0x2

    aput-object v6, v14, v5

    const/4 v5, 0x3

    aput-object v7, v14, v5

    const/4 v5, 0x4

    aput-object v8, v14, v5

    const/4 v5, 0x5

    aput-object v9, v14, v5

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    .line 49
    .local v14, "times":Ljava/util/List;
    const-string v20, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v21, "\u0627\u0644\u0639\u0634\u0627\u0621"

    const-string v16, "\u0627\u0644\u0641\u062c\u0631"

    const-string v17, "\u0627\u0644\u0634\u0631\u0648\u0642"

    const-string v18, "\u0627\u0644\u0638\u0647\u0631"

    const-string v19, "\u0627\u0644\u0639\u0635\u0631"

    filled-new-array/range {v16 .. v21}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    .line 51
    .local v17, "names":Ljava/util/List;
    move-object v5, v14

    .local v5, "$this$indexOfFirst\\2":Ljava/util/List;
    const/4 v6, 0x0

    .line 396
    .local v6, "$i$f$indexOfFirst\\2\\51":I
    const/4 v7, 0x0

    .line 397
    .local v7, "index\\2":I
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v15, -0x1

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 398
    .local v9, "item\\2":Ljava/lang/Object;
    move-object/from16 v18, v9

    check-cast v18, Ljava/lang/Number;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->longValue()J

    move-result-wide v18

    .local v18, "it\\3":J
    const/16 v20, 0x0

    .line 51
    .local v20, "$i$a$-indexOfFirst-WidgetUpdater$computeState$nextIndex$1\\3\\398\\0":I
    cmp-long v21, v18, v2

    if-lez v21, :cond_0

    move/from16 v18, v4

    goto :goto_1

    :cond_0
    const/16 v18, 0x0

    .line 398
    .end local v18    # "it\\3":J
    .end local v20    # "$i$a$-indexOfFirst-WidgetUpdater$computeState$nextIndex$1\\3\\398\\0":I
    :goto_1
    if-eqz v18, :cond_1

    .line 399
    goto :goto_2

    .line 400
    :cond_1
    nop

    .end local v9    # "item\\2":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    const/4 v15, 0x0

    goto :goto_0

    .line 402
    :cond_2
    move v7, v15

    .line 51
    .end local v5    # "$this$indexOfFirst\\2":Ljava/util/List;
    .end local v6    # "$i$f$indexOfFirst\\2\\51":I
    .end local v7    # "index\\2":I
    :goto_2
    move v5, v7

    .line 52
    .local v5, "nextIndex":I
    const-wide/16 v18, 0x0

    .line 53
    .local v18, "nextMillis":J
    const/16 v20, 0x0

    .line 54
    .local v20, "nextName":Ljava/lang/String;
    const-string v6, "null cannot be cast to non-null type java.util.Calendar"

    if-ne v5, v15, :cond_3

    .line 55
    invoke-virtual {v12}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/Calendar;

    move-object v8, v7

    .line 395
    .local v8, "$this$computeState_u24lambda_u244\\4":Ljava/util/Calendar;
    const/4 v9, 0x0

    .line 55
    .local v9, "$i$a$-apply-WidgetUpdater$computeState$tomorrowCal$1\\4\\55\\0":I
    invoke-virtual {v8, v13, v4}, Ljava/util/Calendar;->add(II)V

    .line 56
    .end local v8    # "$this$computeState_u24lambda_u244\\4":Ljava/util/Calendar;
    .end local v9    # "$i$a$-apply-WidgetUpdater$computeState$tomorrowCal$1\\4\\55\\0":I
    .local v7, "tomorrowCal":Ljava/util/Calendar;
    move v8, v4

    sget-object v4, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    move v9, v5

    move-object/from16 v21, v6

    move-object v5, v7

    .end local v7    # "tomorrowCal":Ljava/util/Calendar;
    .local v5, "tomorrowCal":Ljava/util/Calendar;
    .local v9, "nextIndex":I
    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v6

    move/from16 v23, v8

    move/from16 v22, v9

    .end local v9    # "nextIndex":I
    .local v22, "nextIndex":I
    invoke-virtual {v0}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v8

    move-object/from16 v27, v0

    move-object/from16 v15, v17

    move-object/from16 v0, v21

    move/from16 v13, v22

    .end local v0    # "prefs":Lcom/example/fajr/data/FajrPreferences;
    .end local v17    # "names":Ljava/util/List;
    .end local v22    # "nextIndex":I
    .local v13, "nextIndex":I
    .local v15, "names":Ljava/util/List;
    .local v27, "prefs":Lcom/example/fajr/data/FajrPreferences;
    invoke-virtual/range {v4 .. v10}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateAll(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;

    move-result-object v4

    .line 57
    .local v4, "tomorrow":Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;
    const/4 v6, 0x0

    .line 58
    .end local v13    # "nextIndex":I
    .local v6, "nextIndex":I
    invoke-virtual {v4}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getFajr()J

    move-result-wide v7

    .line 59
    .end local v18    # "nextMillis":J
    .local v7, "nextMillis":J
    const-string v4, "\u0627\u0644\u0641\u062c\u0631"

    move/from16 v19, v6

    move-object/from16 v20, v4

    move-wide/from16 v21, v7

    const/4 v4, -0x1

    .end local v5    # "tomorrowCal":Ljava/util/Calendar;
    .end local v20    # "nextName":Ljava/lang/String;
    .local v4, "nextName":Ljava/lang/String;
    goto :goto_3

    .line 61
    .end local v4    # "nextName":Ljava/lang/String;
    .end local v6    # "nextIndex":I
    .end local v7    # "nextMillis":J
    .end local v15    # "names":Ljava/util/List;
    .end local v27    # "prefs":Lcom/example/fajr/data/FajrPreferences;
    .restart local v0    # "prefs":Lcom/example/fajr/data/FajrPreferences;
    .local v5, "nextIndex":I
    .restart local v17    # "names":Ljava/util/List;
    .restart local v18    # "nextMillis":J
    .restart local v20    # "nextName":Ljava/lang/String;
    :cond_3
    move-object/from16 v27, v0

    move/from16 v23, v4

    move v13, v5

    move-object v0, v6

    move-object/from16 v15, v17

    .end local v0    # "prefs":Lcom/example/fajr/data/FajrPreferences;
    .end local v5    # "nextIndex":I
    .end local v17    # "names":Ljava/util/List;
    .restart local v13    # "nextIndex":I
    .restart local v15    # "names":Ljava/util/List;
    .restart local v27    # "prefs":Lcom/example/fajr/data/FajrPreferences;
    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    .line 62
    .end local v18    # "nextMillis":J
    .restart local v7    # "nextMillis":J
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move/from16 v19, v13

    move-object/from16 v20, v4

    move-wide/from16 v21, v7

    const/4 v4, -0x1

    .line 64
    .end local v7    # "nextMillis":J
    .end local v13    # "nextIndex":I
    .local v19, "nextIndex":I
    .local v21, "nextMillis":J
    :goto_3
    move-object v5, v14

    .local v5, "$this$indexOfLast\\5":Ljava/util/List;
    const/4 v6, 0x0

    .line 403
    .local v6, "$i$f$indexOfLast\\5\\64":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-interface {v5, v7}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v7

    .line 404
    .local v7, "iterator\\5":Ljava/util/ListIterator;
    :cond_4
    invoke-interface {v7}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v8

    if-eqz v8, :cond_6

    .line 405
    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    .local v8, "it\\6":J
    const/4 v13, 0x0

    .line 64
    .local v13, "$i$a$-indexOfLast-WidgetUpdater$computeState$prevIndex$1\\6\\405\\0":I
    cmp-long v18, v8, v2

    if-gtz v18, :cond_5

    move/from16 v8, v23

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    .line 405
    .end local v8    # "it\\6":J
    .end local v13    # "$i$a$-indexOfLast-WidgetUpdater$computeState$prevIndex$1\\6\\405\\0":I
    :goto_4
    if-eqz v8, :cond_4

    .line 406
    invoke-interface {v7}, Ljava/util/ListIterator;->nextIndex()I

    move-result v8

    goto :goto_5

    .line 409
    :cond_6
    move v8, v4

    .line 64
    .end local v5    # "$this$indexOfLast\\5":Ljava/util/List;
    .end local v6    # "$i$f$indexOfLast\\5\\64":I
    .end local v7    # "iterator\\5":Ljava/util/ListIterator;
    :goto_5
    move v13, v8

    .line 65
    .local v13, "prevIndex":I
    const-wide/16 v23, 0x0

    .line 66
    .local v23, "prevMillis":J
    const/16 v16, 0x0

    .line 67
    .local v16, "prevName":Ljava/lang/String;
    if-ne v13, v4, :cond_7

    .line 68
    invoke-virtual {v12}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/util/Calendar;

    move-object v0, v5

    .line 395
    .local v0, "$this$computeState_u24lambda_u246\\7":Ljava/util/Calendar;
    const/4 v6, 0x0

    .line 68
    .local v6, "$i$a$-apply-WidgetUpdater$computeState$yesterdayCal$1\\7\\68\\0":I
    const/4 v7, 0x6

    invoke-virtual {v0, v7, v4}, Ljava/util/Calendar;->add(II)V

    .line 69
    .end local v0    # "$this$computeState_u24lambda_u246\\7":Ljava/util/Calendar;
    .end local v6    # "$i$a$-apply-WidgetUpdater$computeState$yesterdayCal$1\\7\\68\\0":I
    .local v5, "yesterdayCal":Ljava/util/Calendar;
    sget-object v4, Lcom/example/fajr/calculation/PrayerTimesCalculator;->INSTANCE:Lcom/example/fajr/calculation/PrayerTimesCalculator;

    invoke-virtual/range {v27 .. v27}, Lcom/example/fajr/data/FajrPreferences;->getLatitude()D

    move-result-wide v6

    invoke-virtual/range {v27 .. v27}, Lcom/example/fajr/data/FajrPreferences;->getLongitude()D

    move-result-wide v8

    invoke-virtual/range {v4 .. v10}, Lcom/example/fajr/calculation/PrayerTimesCalculator;->calculateAll(Ljava/util/Calendar;DDLcom/example/fajr/calculation/CalculationMethod;)Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/example/fajr/calculation/PrayerTimesCalculator$DayPrayerTimes;->getIsha()J

    move-result-wide v6

    .line 70
    .end local v23    # "prevMillis":J
    .local v6, "prevMillis":J
    const-string v0, "\u0627\u0644\u0639\u0634\u0627\u0621"

    move-object/from16 v23, v0

    move-wide/from16 v24, v6

    .end local v5    # "yesterdayCal":Ljava/util/Calendar;
    .end local v16    # "prevName":Ljava/lang/String;
    .local v0, "prevName":Ljava/lang/String;
    goto :goto_6

    .line 72
    .end local v0    # "prevName":Ljava/lang/String;
    .end local v6    # "prevMillis":J
    .restart local v16    # "prevName":Ljava/lang/String;
    .restart local v23    # "prevMillis":J
    :cond_7
    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    .line 73
    .end local v23    # "prevMillis":J
    .restart local v6    # "prevMillis":J
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    move-wide/from16 v24, v6

    .line 75
    .end local v6    # "prevMillis":J
    .end local v16    # "prevName":Ljava/lang/String;
    .local v23, "prevName":Ljava/lang/String;
    .local v24, "prevMillis":J
    :goto_6
    new-instance v16, Lcom/example/widget/WidgetUpdater$PrayerState;

    invoke-virtual/range {v27 .. v27}, Lcom/example/fajr/data/FajrPreferences;->getCityName()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v18, v14

    move-object/from16 v17, v15

    .end local v14    # "times":Ljava/util/List;
    .end local v15    # "names":Ljava/util/List;
    .restart local v17    # "names":Ljava/util/List;
    .local v18, "times":Ljava/util/List;
    invoke-direct/range {v16 .. v26}, Lcom/example/widget/WidgetUpdater$PrayerState;-><init>(Ljava/util/List;Ljava/util/List;ILjava/lang/String;JLjava/lang/String;JLjava/lang/String;)V

    .end local v17    # "names":Ljava/util/List;
    .restart local v15    # "names":Ljava/util/List;
    return-object v16
.end method

.method private final formatRemaining(J)Ljava/lang/String;
    .locals 6
    .param p1, "millis"    # J

    .line 198
    const-wide/32 v0, 0xea60

    div-long v0, p1, v0

    long-to-int v0, v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 199
    .local v0, "totalMinutes":I
    div-int/lit8 v1, v0, 0x3c

    .line 200
    .local v1, "h":I
    rem-int/lit8 v2, v0, 0x3c

    .line 207
    .local v2, "m":I
    nop

    .line 208
    if-gtz v1, :cond_0

    invoke-static {v0}, Lcom/example/widget/WidgetUpdater;->formatRemaining$minutesText(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 209
    :cond_0
    const-string v3, " \u0633\u0627\u0639\u0627\u062a"

    const-string v4, "\u0633\u0627\u0639\u062a\u0627\u0646"

    if-nez v2, :cond_1

    packed-switch v1, :pswitch_data_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :pswitch_0
    move-object v3, v4

    goto :goto_1

    :pswitch_1
    const-string v3, "\u0633\u0627\u0639\u0629 \u0648\u0627\u062d\u062f\u0629"

    goto :goto_1

    .line 210
    :cond_1
    packed-switch v1, :pswitch_data_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :pswitch_2
    const-string v4, "\u0633\u0627\u0639\u0629"

    :goto_0
    :pswitch_3
    invoke-static {v2}, Lcom/example/widget/WidgetUpdater;->formatRemaining$minutesText(I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " \u0648"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 207
    :goto_1
    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static final formatRemaining$minutesText(I)Ljava/lang/String;
    .locals 3
    .param p0, "n"    # I

    .line 201
    nop

    .line 202
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string v0, "\u062f\u0642\u064a\u0642\u0629 \u0648\u0627\u062d\u062f\u0629"

    goto :goto_1

    .line 203
    :cond_0
    const/4 v1, 0x2

    if-ne p0, v1, :cond_1

    const-string v0, "\u062f\u0642\u064a\u0642\u062a\u0627\u0646"

    goto :goto_1

    .line 204
    :cond_1
    const/4 v1, 0x3

    const/4 v2, 0x0

    if-gt v1, p0, :cond_2

    const/16 v1, 0xb

    if-ge p0, v1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \u062f\u0642\u0627\u0626\u0642"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 205
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \u062f\u0642\u064a\u0642\u0629"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 206
    :goto_1
    return-object v0
.end method

.method private final formatTime(J)Ljava/lang/String;
    .locals 5
    .param p1, "millis"    # J

    .line 26
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    move-object v1, v0

    .line 395
    .local v1, "$this$formatTime_u24lambda_u240\\1":Ljava/util/Calendar;
    const/4 v2, 0x0

    .line 26
    .local v2, "$i$a$-apply-WidgetUpdater$formatTime$cal$1\\1\\26\\0":I
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 27
    .end local v1    # "$this$formatTime_u24lambda_u240\\1":Ljava/util/Calendar;
    .end local v2    # "$i$a$-apply-WidgetUpdater$formatTime$cal$1\\1\\26\\0":I
    .local v0, "cal":Ljava/util/Calendar;
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "\u0635"

    goto :goto_0

    :cond_0
    const-string v1, "\u0645"

    .line 28
    .local v1, "ampm":Ljava/lang/String;
    :goto_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "h:mm"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method private final formatTimeShort(J)Ljava/lang/String;
    .locals 4
    .param p1, "millis"    # J

    .line 32
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "h:mm"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 395
    move-object v2, v1

    .local v2, "$this$formatTimeShort_u24lambda_u241\\1":Ljava/util/Calendar;
    const/4 v3, 0x0

    .line 32
    .local v3, "$i$a$-apply-WidgetUpdater$formatTimeShort$1\\1\\32\\0":I
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .end local v2    # "$this$formatTimeShort_u24lambda_u241\\1":Ljava/util/Calendar;
    .end local v3    # "$i$a$-apply-WidgetUpdater$formatTimeShort$1\\1\\32\\0":I
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .line 79
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/example/MainActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v1, v0

    .local v1, "$this$launchIntent_u24lambda_u247\\1":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 80
    .local v2, "$i$a$-apply-WidgetUpdater$launchIntent$intent$1\\1\\79\\0":I
    const/high16 v3, 0x14000000

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 81
    nop

    .line 79
    .end local v1    # "$this$launchIntent_u24lambda_u247\\1":Landroid/content/Intent;
    .end local v2    # "$i$a$-apply-WidgetUpdater$launchIntent$intent$1\\1\\79\\0":I
    nop

    .line 83
    .local v0, "intent":Landroid/content/Intent;
    nop

    .line 84
    nop

    .line 82
    const/4 v1, 0x0

    const/high16 v2, 0xc000000

    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const-string v2, "getActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final pushFaceWidget$build(Landroid/content/Context;Lcom/example/widget/WidgetUpdater$PrayerState;Ljava/lang/String;II)Landroid/widget/RemoteViews;
    .locals 5
    .param p0, "$context"    # Landroid/content/Context;
    .param p1, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p2, "remaining"    # Ljava/lang/String;
    .param p3, "pct"    # I
    .param p4, "layoutId"    # I

    .line 296
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p4}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 297
    .local v0, "views":Landroid/widget/RemoteViews;
    sget v1, Lcom/example/R$id;->facewidget_prayer_name:I

    invoke-virtual {p1}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 298
    sget v1, Lcom/example/R$id;->facewidget_prayer_time:I

    sget-object v2, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    invoke-virtual {p1}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Lcom/example/widget/WidgetUpdater;->formatTime(J)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 299
    sget v1, Lcom/example/R$id;->facewidget_remaining:I

    move-object v2, p2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 300
    sget v1, Lcom/example/R$id;->facewidget_progress:I

    const/16 v2, 0x64

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, p3, v3}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 301
    sget v1, Lcom/example/R$id;->facewidget_root:I

    sget-object v2, Lcom/example/widget/WidgetUpdater;->INSTANCE:Lcom/example/widget/WidgetUpdater;

    invoke-direct {v2, p0}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 302
    return-object v0
.end method

.method private final updateClockCountdown(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;J)V
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "now"    # J

    .line 250
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_clock:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    move-object v3, v0

    .line 251
    .local v3, "views":Landroid/widget/RemoteViews;
    sget v0, Lcom/example/R$id;->widget_clock_prev_name:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 252
    sget v0, Lcom/example/R$id;->widget_clock_prev_time:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 253
    sget v0, Lcom/example/R$id;->widget_clock_next_name:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 254
    sget v0, Lcom/example/R$id;->widget_clock_next_time:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 255
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 256
    sget v0, Lcom/example/R$id;->widget_clock_countdown:I

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setChronometerCountDown(IZ)V

    .line 258
    :cond_0
    nop

    .line 259
    sget v4, Lcom/example/R$id;->widget_clock_countdown:I

    .line 260
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v5

    sub-long/2addr v5, p4

    add-long/2addr v5, v0

    .line 261
    nop

    .line 262
    nop

    .line 258
    const-string v7, "%s"

    const/4 v8, 0x1

    invoke-virtual/range {v3 .. v8}, Landroid/widget/RemoteViews;->setChronometer(IJLjava/lang/String;Z)V

    .line 264
    sget v0, Lcom/example/R$id;->widget_clock_countdown:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 265
    const-class v0, Lcom/example/widget/ClockWidgetProvider;

    invoke-direct {p0, p1, p2, v0, v3}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 266
    return-void
.end method

.method private final updateDayPrayer(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;Ljava/util/Calendar;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "cal"    # Ljava/util/Calendar;

    .line 387
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_day_prayer:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 388
    .local v0, "views":Landroid/widget/RemoteViews;
    sget v1, Lcom/example/R$id;->widget_day_name:I

    new-instance v2, Ljava/text/SimpleDateFormat;

    new-instance v3, Ljava/util/Locale;

    const-string v4, "ar"

    const-string v5, "EG"

    invoke-direct {v3, v4, v5}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "EEEE"

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 389
    sget v1, Lcom/example/R$id;->widget_day_prayer:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/example/widget/WidgetUpdater;->formatTime(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 390
    sget v1, Lcom/example/R$id;->widget_day_name:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 391
    const-class v1, Lcom/example/widget/DayPrayerWidgetProvider;

    invoke-direct {p0, p1, p2, v1, v0}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 392
    return-void
.end method

.method private final updateGregorian(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/util/Calendar;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "cal"    # Ljava/util/Calendar;

    .line 378
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_gregorian:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 379
    .local v0, "views":Landroid/widget/RemoteViews;
    sget v1, Lcom/example/R$id;->widget_greg_day:I

    const/4 v2, 0x5

    invoke-virtual {p3, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 380
    sget v1, Lcom/example/R$id;->widget_greg_month:I

    new-instance v2, Ljava/text/SimpleDateFormat;

    new-instance v3, Ljava/util/Locale;

    const-string v4, "ar"

    const-string v5, "EG"

    invoke-direct {v3, v4, v5}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "MMMM"

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 381
    sget v1, Lcom/example/R$id;->widget_greg_year:I

    const/4 v2, 0x1

    invoke-virtual {p3, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 382
    sget v1, Lcom/example/R$id;->widget_greg_day:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 383
    const-class v1, Lcom/example/widget/GregorianWidgetProvider;

    invoke-direct {p0, p1, p2, v1, v0}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 384
    return-void
.end method

.method private final updateHero(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;J)V
    .locals 17
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "now"    # J

    .line 215
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p4

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v4

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x1

    invoke-static {v4, v5, v6, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v4

    .line 216
    .local v4, "interval":J
    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v6

    sub-long v6, v2, v6

    const-wide/16 v8, 0x64

    mul-long/2addr v6, v8

    div-long/2addr v6, v4

    long-to-int v6, v6

    const/4 v7, 0x0

    const/16 v8, 0x64

    invoke-static {v6, v7, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v6

    .line 217
    .local v6, "pct":I
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    move-object v10, v9

    .line 395
    .local v10, "$this$updateHero_u24lambda_u2417\\1":Ljava/util/Calendar;
    const/4 v11, 0x0

    .line 217
    .local v11, "$i$a$-apply-WidgetUpdater$updateHero$cal$1\\1\\217\\0":I
    invoke-virtual {v10, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 219
    .end local v10    # "$this$updateHero_u24lambda_u2417\\1":Ljava/util/Calendar;
    .end local v11    # "$i$a$-apply-WidgetUpdater$updateHero$cal$1\\1\\217\\0":I
    .local v9, "cal":Ljava/util/Calendar;
    new-instance v10, Landroid/widget/RemoteViews;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    sget v12, Lcom/example/R$layout;->widget_hero:I

    invoke-direct {v0, v1, v12}, Lcom/example/widget/WidgetUpdater;->barLayout(Landroid/content/Context;I)I

    move-result v12

    invoke-direct {v10, v11, v12}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 220
    .local v10, "full":Landroid/widget/RemoteViews;
    sget v11, Lcom/example/R$id;->widget_hero_prev_name:I

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevName()Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-virtual {v10, v11, v12}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 221
    sget v11, Lcom/example/R$id;->widget_hero_next_name:I

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-virtual {v10, v11, v12}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 222
    sget v11, Lcom/example/R$id;->widget_hero_prev_time:I

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v12

    invoke-direct {v0, v12, v13}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-virtual {v10, v11, v12}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 223
    sget v11, Lcom/example/R$id;->widget_hero_next_time:I

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v12

    invoke-direct {v0, v12, v13}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-virtual {v10, v11, v12}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 224
    sget v11, Lcom/example/R$id;->widget_hero_remaining:I

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v13

    sub-long/2addr v13, v2

    invoke-direct {v0, v13, v14}, Lcom/example/widget/WidgetUpdater;->compactRemaining(J)Ljava/lang/String;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "\u0628\u0627\u0642\u064a \u0639\u0644\u0649 \u0635\u0644\u0627\u0629 "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v14, " "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-virtual {v10, v11, v12}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 225
    sget v11, Lcom/example/R$id;->widget_hero_progress:I

    invoke-virtual {v10, v11, v8, v6, v7}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 226
    sget v11, Lcom/example/R$id;->widget_hero_hijri:I

    sget-object v12, Lcom/example/prayer/HijriDate;->INSTANCE:Lcom/example/prayer/HijriDate;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v12, v9}, Lcom/example/prayer/HijriDate;->format(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v12

    const-string v13, " \u0647\u0640"

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v12, v13}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-virtual {v10, v11, v12}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 227
    sget v11, Lcom/example/R$id;->widget_hero_greg:I

    new-instance v12, Ljava/text/SimpleDateFormat;

    new-instance v13, Ljava/util/Locale;

    const-string v15, "ar"

    const-string v7, "EG"

    invoke-direct {v13, v15, v7}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "d MMMM yyyy"

    invoke-direct {v12, v7, v13}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v9}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v12, v7}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v10, v11, v7}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 228
    sget v7, Lcom/example/R$id;->widget_hero_root:I

    invoke-direct/range {p0 .. p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v11

    invoke-virtual {v10, v7, v11}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 230
    new-instance v7, Landroid/widget/RemoteViews;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    sget v12, Lcom/example/R$layout;->widget_hero_compact:I

    invoke-direct {v0, v1, v12}, Lcom/example/widget/WidgetUpdater;->barLayout(Landroid/content/Context;I)I

    move-result v12

    invoke-direct {v7, v11, v12}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 231
    .local v7, "compact":Landroid/widget/RemoteViews;
    sget v11, Lcom/example/R$id;->widget_hero_compact_name:I

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v12

    move-object v15, v9

    .end local v9    # "cal":Ljava/util/Calendar;
    .local v15, "cal":Ljava/util/Calendar;
    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v8

    invoke-direct {v0, v8, v9}, Lcom/example/widget/WidgetUpdater;->formatTime(J)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-virtual {v7, v11, v8}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 232
    sget v8, Lcom/example/R$id;->widget_hero_compact_remaining:I

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v11

    sub-long/2addr v11, v2

    invoke-direct {v0, v11, v12}, Lcom/example/widget/WidgetUpdater;->compactRemaining(J)Ljava/lang/String;

    move-result-object v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u0628\u0627\u0642\u064a "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-virtual {v7, v8, v9}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 233
    sget v8, Lcom/example/R$id;->widget_hero_compact_progress:I

    const/4 v9, 0x0

    const/16 v13, 0x64

    invoke-virtual {v7, v8, v13, v6, v9}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 234
    sget v8, Lcom/example/R$id;->widget_hero_compact_root:I

    invoke-direct/range {p0 .. p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 236
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1f

    if-lt v8, v9, :cond_0

    .line 237
    new-instance v8, Landroid/widget/RemoteViews;

    const/4 v9, 0x2

    new-array v9, v9, [Lkotlin/Pair;

    new-instance v11, Landroid/util/SizeF;

    const/high16 v12, 0x42dc0000    # 110.0f

    const/high16 v13, 0x437a0000    # 250.0f

    invoke-direct {v11, v13, v12}, Landroid/util/SizeF;-><init>(FF)V

    invoke-static {v11, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    const/16 v16, 0x0

    aput-object v11, v9, v16

    new-instance v11, Landroid/util/SizeF;

    const/high16 v12, 0x42200000    # 40.0f

    invoke-direct {v11, v13, v12}, Landroid/util/SizeF;-><init>(FF)V

    invoke-static {v11, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    const/4 v12, 0x1

    aput-object v11, v9, v12

    invoke-static {v9}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v9

    invoke-direct {v8, v9}, Landroid/widget/RemoteViews;-><init>(Ljava/util/Map;)V

    goto :goto_0

    .line 238
    :cond_0
    move-object v8, v10

    .line 236
    :goto_0
    nop

    .line 239
    .local v8, "views":Landroid/widget/RemoteViews;
    const-class v9, Lcom/example/widget/HeroWidgetProvider;

    move-object/from16 v11, p2

    invoke-direct {v0, v1, v11, v9, v8}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 240
    return-void
.end method

.method private final updateHijri(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/util/Calendar;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "cal"    # Ljava/util/Calendar;

    .line 368
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_hijri:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 369
    .local v0, "views":Landroid/widget/RemoteViews;
    sget-object v1, Lcom/example/prayer/HijriDate;->INSTANCE:Lcom/example/prayer/HijriDate;

    invoke-virtual {v1, p3}, Lcom/example/prayer/HijriDate;->hijriYmd(Ljava/util/Calendar;)Lkotlin/Triple;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .local v2, "y":I
    invoke-virtual {v1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .local v3, "m":I
    invoke-virtual {v1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 370
    .local v1, "d":I
    sget v4, Lcom/example/R$id;->widget_hijri_day:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 371
    sget v4, Lcom/example/R$id;->widget_hijri_month:I

    sget-object v5, Lcom/example/prayer/HijriDate;->INSTANCE:Lcom/example/prayer/HijriDate;

    invoke-virtual {v5, v3}, Lcom/example/prayer/HijriDate;->monthName(I)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 372
    sget v4, Lcom/example/R$id;->widget_hijri_year:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " \u0647\u0640"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 373
    sget v4, Lcom/example/R$id;->widget_hijri_day:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 374
    const-class v4, Lcom/example/widget/HijriWidgetProvider;

    invoke-direct {p0, p1, p2, v4, v0}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 375
    return-void
.end method

.method private final updateIqama(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;J)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "now"    # J

    .line 176
    invoke-direct {p0, p1, p3, p4, p5}, Lcom/example/widget/WidgetUpdater;->computeIqamaState(Landroid/content/Context;Lcom/example/widget/WidgetUpdater$PrayerState;J)Lcom/example/widget/WidgetUpdater$IqamaState;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 177
    .local v0, "iq":Lcom/example/widget/WidgetUpdater$IqamaState;
    :cond_0
    new-instance v1, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/example/R$layout;->widget_iqama:I

    invoke-direct {p0, p1, v3}, Lcom/example/widget/WidgetUpdater;->barLayout(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 178
    .local v1, "views":Landroid/widget/RemoteViews;
    sget v2, Lcom/example/R$id;->widget_iqama_countdown:I

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getIqamaMillis()J

    move-result-wide v3

    sub-long/2addr v3, p4

    invoke-direct {p0, v3, v4}, Lcom/example/widget/WidgetUpdater;->formatRemaining(J)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 179
    sget v2, Lcom/example/R$id;->widget_iqama_adhan:I

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getPrayerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getAdhanMillis()J

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 180
    sget v2, Lcom/example/R$id;->widget_iqama_time:I

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getIqamaMillis()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u0627\u0644\u0625\u0642\u0627\u0645\u0629 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 181
    sget v2, Lcom/example/R$id;->widget_iqama_next:I

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getNextIqamaMillis()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 182
    sget v2, Lcom/example/R$id;->widget_iqama_progress:I

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getProgressPct()I

    move-result v3

    const/4 v4, 0x0

    const/16 v5, 0x64

    invoke-virtual {v1, v2, v5, v3, v4}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 183
    sget v2, Lcom/example/R$id;->widget_iqama_countdown:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 184
    const-class v2, Lcom/example/widget/IqamaWidgetProvider;

    invoke-direct {p0, p1, p2, v2, v1}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 185
    return-void
.end method

.method private final updateIqamaSmall(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;J)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "now"    # J

    .line 188
    invoke-direct {p0, p1, p3, p4, p5}, Lcom/example/widget/WidgetUpdater;->computeIqamaState(Landroid/content/Context;Lcom/example/widget/WidgetUpdater$PrayerState;J)Lcom/example/widget/WidgetUpdater$IqamaState;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 189
    .local v0, "iq":Lcom/example/widget/WidgetUpdater$IqamaState;
    :cond_0
    new-instance v1, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/example/R$layout;->widget_iqama_small:I

    invoke-direct {p0, p1, v3}, Lcom/example/widget/WidgetUpdater;->barLayout(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 190
    .local v1, "views":Landroid/widget/RemoteViews;
    sget v2, Lcom/example/R$id;->widget_iqama_small_time:I

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getIqamaMillis()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 191
    sget v2, Lcom/example/R$id;->widget_iqama_small_progress:I

    invoke-virtual {v0}, Lcom/example/widget/WidgetUpdater$IqamaState;->getProgressPct()I

    move-result v3

    const/4 v4, 0x0

    const/16 v5, 0x64

    invoke-virtual {v1, v2, v5, v3, v4}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 192
    sget v2, Lcom/example/R$id;->widget_iqama_small_time:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 193
    const-class v2, Lcom/example/widget/IqamaSmallWidgetProvider;

    invoke-direct {p0, p1, p2, v2, v1}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 194
    return-void
.end method

.method private final updateNextPrayer(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;J)V
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "now"    # J

    .line 322
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_next_prayer:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    move-object v3, v0

    .line 323
    .local v3, "views":Landroid/widget/RemoteViews;
    sget v0, Lcom/example/R$id;->widget_prayer_name:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 324
    sget v0, Lcom/example/R$id;->widget_prayer_time:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/example/widget/WidgetUpdater;->formatTime(J)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 325
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 326
    sget v0, Lcom/example/R$id;->widget_countdown:I

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setChronometerCountDown(IZ)V

    .line 328
    :cond_0
    nop

    .line 329
    sget v4, Lcom/example/R$id;->widget_countdown:I

    .line 330
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v5

    sub-long/2addr v5, p4

    add-long/2addr v5, v0

    .line 331
    nop

    .line 332
    nop

    .line 328
    const-string v7, "\u0628\u0627\u0642\u064a %s"

    const/4 v8, 0x1

    invoke-virtual/range {v3 .. v8}, Landroid/widget/RemoteViews;->setChronometer(IJLjava/lang/String;Z)V

    .line 334
    sget v0, Lcom/example/R$id;->widget_prayer_name:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 335
    sget v0, Lcom/example/R$id;->widget_prayer_time:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 336
    const-class v0, Lcom/example/widget/NextPrayerWidgetProvider;

    invoke-direct {p0, p1, p2, v0, v3}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 337
    return-void
.end method

.method private final updatePill(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;J)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "now"    # J

    .line 243
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_pill:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 244
    .local v0, "views":Landroid/widget/RemoteViews;
    sget v1, Lcom/example/R$id;->widget_pill_text:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v3

    sub-long/2addr v3, p4

    invoke-direct {p0, v3, v4}, Lcom/example/widget/WidgetUpdater;->formatRemaining(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u0623\u0630\u0627\u0646 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " \u0628\u0639\u062f "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 245
    sget v1, Lcom/example/R$id;->widget_pill_text:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 246
    const-class v1, Lcom/example/widget/PillWidgetProvider;

    invoke-direct {p0, p1, p2, v1, v0}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 247
    return-void
.end method

.method private final updatePrayerBar(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;J)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "now"    # J

    .line 340
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_prayer_bar:I

    invoke-direct {p0, p1, v2}, Lcom/example/widget/WidgetUpdater;->barLayout(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 341
    .local v0, "views":Landroid/widget/RemoteViews;
    sget v1, Lcom/example/R$id;->widget_bar_name:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 342
    sget v1, Lcom/example/R$id;->widget_bar_time:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/example/widget/WidgetUpdater;->formatTime(J)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 343
    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v1

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x1

    invoke-static {v1, v2, v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v1

    .line 344
    .local v1, "interval":J
    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v3

    sub-long v3, p4, v3

    const-wide/16 v5, 0x64

    mul-long/2addr v3, v5

    div-long/2addr v3, v1

    long-to-int v3, v3

    const/4 v4, 0x0

    const/16 v5, 0x64

    invoke-static {v3, v4, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v3

    .line 345
    .local v3, "pct":I
    sget v6, Lcom/example/R$id;->widget_bar_progress:I

    invoke-virtual {v0, v6, v5, v3, v4}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 346
    sget v4, Lcom/example/R$id;->widget_bar_name:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 347
    sget v4, Lcom/example/R$id;->widget_bar_time:I

    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 348
    const-class v4, Lcom/example/widget/PrayerBarWidgetProvider;

    invoke-direct {p0, p1, p2, v4, v0}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 349
    return-void
.end method

.method private final updateSchedule(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;)V
    .locals 17
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;

    .line 352
    move-object/from16 v0, p0

    new-instance v1, Landroid/widget/RemoteViews;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/example/R$layout;->widget_schedule:I

    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 353
    .local v1, "views":Landroid/widget/RemoteViews;
    sget v2, Lcom/example/R$id;->widget_name_0:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lcom/example/R$id;->widget_name_1:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget v4, Lcom/example/R$id;->widget_name_2:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/example/R$id;->widget_name_3:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget v6, Lcom/example/R$id;->widget_name_4:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget v7, Lcom/example/R$id;->widget_name_5:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x6

    new-array v9, v8, [Ljava/lang/Integer;

    const/4 v10, 0x0

    aput-object v2, v9, v10

    const/4 v2, 0x1

    aput-object v3, v9, v2

    const/4 v3, 0x2

    aput-object v4, v9, v3

    const/4 v4, 0x3

    aput-object v5, v9, v4

    const/4 v5, 0x4

    aput-object v6, v9, v5

    const/4 v6, 0x5

    aput-object v7, v9, v6

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 354
    .local v7, "nameIds":Ljava/util/List;
    sget v9, Lcom/example/R$id;->widget_time_0:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    sget v11, Lcom/example/R$id;->widget_time_1:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget v12, Lcom/example/R$id;->widget_time_2:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    sget v13, Lcom/example/R$id;->widget_time_3:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    sget v14, Lcom/example/R$id;->widget_time_4:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    sget v15, Lcom/example/R$id;->widget_time_5:I

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move/from16 v16, v2

    new-array v2, v8, [Ljava/lang/Integer;

    aput-object v9, v2, v10

    aput-object v11, v2, v16

    aput-object v12, v2, v3

    aput-object v13, v2, v4

    aput-object v14, v2, v5

    aput-object v15, v2, v6

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 355
    .local v2, "timeIds":Ljava/util/List;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v8, :cond_2

    .line 356
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNames()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v1, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 357
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getTimes()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-direct {v0, v5, v6}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v1, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 358
    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextIndex()I

    move-result v4

    const v5, -0xc16e01

    if-ne v3, v4, :cond_0

    move v4, v5

    goto :goto_1

    :cond_0
    const/4 v4, -0x1

    .line 359
    .local v4, "color":I
    :goto_1
    invoke-virtual/range {p3 .. p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextIndex()I

    move-result v6

    if-ne v3, v6, :cond_1

    goto :goto_2

    :cond_1
    const v5, -0x59595a

    .line 360
    .local v5, "nameColor":I
    :goto_2
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v1, v6, v4}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 361
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v1, v6, v5}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 355
    .end local v4    # "color":I
    .end local v5    # "nameColor":I
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 363
    .end local v3    # "i":I
    :cond_2
    sget v3, Lcom/example/R$id;->widget_name_0:I

    invoke-direct/range {p0 .. p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 364
    const-class v3, Lcom/example/widget/ScheduleWidgetProvider;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-direct {v0, v4, v5, v3, v1}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 365
    return-void
.end method

.method private final updateWideBar(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Lcom/example/widget/WidgetUpdater$PrayerState;Ljava/util/Calendar;J)V
    .locals 10
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mgr"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "state"    # Lcom/example/widget/WidgetUpdater$PrayerState;
    .param p4, "cal"    # Ljava/util/Calendar;
    .param p5, "now"    # J

    .line 269
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/example/R$layout;->widget_wide_bar:I

    invoke-direct {p0, p1, v2}, Lcom/example/widget/WidgetUpdater;->barLayout(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 270
    .local v0, "views":Landroid/widget/RemoteViews;
    sget v1, Lcom/example/R$id;->widget_wide_day:I

    new-instance v2, Ljava/text/SimpleDateFormat;

    new-instance v3, Ljava/util/Locale;

    const-string v4, "ar"

    const-string v5, "EG"

    invoke-direct {v3, v4, v5}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "EEEE"

    invoke-direct {v2, v6, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 271
    sget v1, Lcom/example/R$id;->widget_wide_city:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getCity()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 272
    sget v1, Lcom/example/R$id;->widget_wide_next_name:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 273
    sget v1, Lcom/example/R$id;->widget_wide_prev_name:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 274
    sget v1, Lcom/example/R$id;->widget_wide_next_time:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 275
    sget v1, Lcom/example/R$id;->widget_wide_prev_time:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/example/widget/WidgetUpdater;->formatTimeShort(J)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 276
    sget v1, Lcom/example/R$id;->widget_wide_remaining:I

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v6

    sub-long/2addr v6, p5

    invoke-direct {p0, v6, v7}, Lcom/example/widget/WidgetUpdater;->formatRemaining(J)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u0628\u0627\u0642\u064a \u0639\u0644\u0649 "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, " "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 277
    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v1

    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v6

    sub-long/2addr v1, v6

    const-wide/16 v6, 0x1

    invoke-static {v1, v2, v6, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v1

    .line 278
    .local v1, "interval":J
    invoke-virtual {p3}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v6

    sub-long v6, p5, v6

    const-wide/16 v8, 0x64

    mul-long/2addr v6, v8

    div-long/2addr v6, v1

    long-to-int v3, v6

    const/4 v6, 0x0

    const/16 v7, 0x64

    invoke-static {v3, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v3

    .line 279
    .local v3, "pct":I
    sget v8, Lcom/example/R$id;->widget_wide_progress:I

    invoke-virtual {v0, v8, v7, v3, v6}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 280
    sget v6, Lcom/example/R$id;->widget_wide_hijri:I

    sget-object v7, Lcom/example/prayer/HijriDate;->INSTANCE:Lcom/example/prayer/HijriDate;

    invoke-virtual {v7, p4}, Lcom/example/prayer/HijriDate;->format(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v7

    const-string v8, " \u0647\u0640"

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v7, v8}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v0, v6, v7}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 281
    sget v6, Lcom/example/R$id;->widget_wide_greg:I

    new-instance v7, Ljava/text/SimpleDateFormat;

    new-instance v8, Ljava/util/Locale;

    invoke-direct {v8, v4, v5}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "d MMMM yyyy"

    invoke-direct {v7, v4, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v6, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 282
    sget v4, Lcom/example/R$id;->widget_wide_remaining:I

    invoke-direct/range {p0 .. p1}, Lcom/example/widget/WidgetUpdater;->launchIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 283
    const-class v4, Lcom/example/widget/WideBarWidgetProvider;

    invoke-direct {p0, p1, p2, v4, v0}, Lcom/example/widget/WidgetUpdater;->applyToAll(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;Ljava/lang/Class;Landroid/widget/RemoteViews;)V

    .line 284
    return-void
.end method


# virtual methods
.method public final pushFaceWidget(Landroid/content/Context;Ljava/lang/String;)V
    .locals 13
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "pageId"    # Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    const-string v1, "wathakker_prayer"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 289
    :cond_0
    invoke-direct {p0, p1}, Lcom/example/widget/WidgetUpdater;->computeState(Landroid/content/Context;)Lcom/example/widget/WidgetUpdater$PrayerState;

    move-result-object v1

    .line 290
    .local v1, "state":Lcom/example/widget/WidgetUpdater$PrayerState;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 291
    .local v2, "now":J
    invoke-virtual {v1}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v4

    invoke-virtual {v1}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x1

    invoke-static {v4, v5, v6, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v4

    .line 292
    .local v4, "interval":J
    invoke-virtual {v1}, Lcom/example/widget/WidgetUpdater$PrayerState;->getPrevMillis()J

    move-result-wide v6

    sub-long v6, v2, v6

    const-wide/16 v8, 0x64

    mul-long/2addr v6, v8

    div-long/2addr v6, v4

    long-to-int v6, v6

    const/4 v7, 0x0

    const/16 v8, 0x64

    invoke-static {v6, v7, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v6

    .line 293
    .local v6, "pct":I
    invoke-virtual {v1}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/example/widget/WidgetUpdater$PrayerState;->getNextMillis()J

    move-result-wide v8

    sub-long/2addr v8, v2

    invoke-direct {p0, v8, v9}, Lcom/example/widget/WidgetUpdater;->compactRemaining(J)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "\u0628\u0627\u0642\u064a \u0639\u0644\u0649 \u0635\u0644\u0627\u0629 "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v9, " "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 305
    .local v7, "remaining":Ljava/lang/String;
    new-instance v8, Landroid/content/Intent;

    const-string v9, "com.samsung.android.intent.action.RESPONSE_SERVICEBOX_REMOTEVIEWS"

    invoke-direct {v8, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object v9, v8

    .local v9, "$this$pushFaceWidget_u24lambda_u2418\\1":Landroid/content/Intent;
    const/4 v10, 0x0

    .line 306
    .local v10, "$i$a$-apply-WidgetUpdater$pushFaceWidget$resp$1\\1\\305\\0":I
    const-string v11, "com.android.systemui"

    invoke-virtual {v9, v11}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 307
    const-string v11, "package"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 308
    invoke-virtual {v9, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 309
    const-string v0, "show"

    const/4 v11, 0x1

    invoke-virtual {v9, v0, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 310
    sget v0, Lcom/example/R$layout;->facewidget_prayer:I

    invoke-static {p1, v1, v7, v6, v0}, Lcom/example/widget/WidgetUpdater;->pushFaceWidget$build(Landroid/content/Context;Lcom/example/widget/WidgetUpdater$PrayerState;Ljava/lang/String;II)Landroid/widget/RemoteViews;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    const-string v11, "origin"

    invoke-virtual {v9, v11, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 311
    sget v0, Lcom/example/R$layout;->facewidget_prayer_aod:I

    invoke-static {p1, v1, v7, v6, v0}, Lcom/example/widget/WidgetUpdater;->pushFaceWidget$build(Landroid/content/Context;Lcom/example/widget/WidgetUpdater$PrayerState;Ljava/lang/String;II)Landroid/widget/RemoteViews;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    const-string v11, "aod"

    invoke-virtual {v9, v11, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 312
    nop

    .line 305
    .end local v9    # "$this$pushFaceWidget_u24lambda_u2418\\1":Landroid/content/Intent;
    .end local v10    # "$i$a$-apply-WidgetUpdater$pushFaceWidget$resp$1\\1\\305\\0":I
    nop

    .line 313
    .local v8, "resp":Landroid/content/Intent;
    invoke-virtual {p1, v8}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 314
    return-void
.end method

.method public final updateAll(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lcom/example/lockwidgets/HomeWidgets;->updateAll(Landroid/content/Context;)V

    :try_start_0
    const-string v0, "wathakker_prayer"

    invoke-virtual {p0, p1, v0}, Lcom/example/widget/WidgetUpdater;->pushFaceWidget(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    return-void
.end method
