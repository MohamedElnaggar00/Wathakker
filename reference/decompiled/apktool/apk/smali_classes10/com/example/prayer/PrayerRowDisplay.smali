.class public final Lcom/example/prayer/PrayerRowDisplay;
.super Ljava/lang/Object;
.source "PrayerTimesScreen.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/example/prayer/PrayerRowDisplay;",
        "",
        "name",
        "",
        "timeText",
        "isNext",
        "",
        "icon",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/vector/ImageVector;)V",
        "getName",
        "()Ljava/lang/String;",
        "getTimeText",
        "()Z",
        "getIcon",
        "()Landroidx/compose/ui/graphics/vector/ImageVector;",
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
.field private final icon:Landroidx/compose/ui/graphics/vector/ImageVector;

.field private final isNext:Z

.field private final name:Ljava/lang/String;

.field private final timeText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/vector/ImageVector;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "timeText"    # Ljava/lang/String;
    .param p3, "isNext"    # Z
    .param p4, "icon"    # Landroidx/compose/ui/graphics/vector/ImageVector;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/example/prayer/PrayerRowDisplay;->name:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lcom/example/prayer/PrayerRowDisplay;->timeText:Ljava/lang/String;

    .line 44
    iput-boolean p3, p0, Lcom/example/prayer/PrayerRowDisplay;->isNext:Z

    .line 45
    iput-object p4, p0, Lcom/example/prayer/PrayerRowDisplay;->icon:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 41
    return-void
.end method


# virtual methods
.method public final getIcon()Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/example/prayer/PrayerRowDisplay;->icon:Landroidx/compose/ui/graphics/vector/ImageVector;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/example/prayer/PrayerRowDisplay;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeText()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/example/prayer/PrayerRowDisplay;->timeText:Ljava/lang/String;

    return-object v0
.end method

.method public final isNext()Z
    .locals 1

    .line 44
    iget-boolean v0, p0, Lcom/example/prayer/PrayerRowDisplay;->isNext:Z

    return v0
.end method
