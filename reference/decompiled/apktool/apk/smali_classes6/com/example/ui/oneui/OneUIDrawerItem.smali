.class public final Lcom/example/ui/oneui/OneUIDrawerItem;
.super Ljava/lang/Object;
.source "OneUI.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/example/ui/oneui/OneUIDrawerItem;",
        "",
        "route",
        "",
        "label",
        "icon",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "tint",
        "Landroidx/compose/ui/graphics/Color;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getRoute",
        "()Ljava/lang/String;",
        "getLabel",
        "getIcon",
        "()Landroidx/compose/ui/graphics/vector/ImageVector;",
        "getTint-0d7_KjU",
        "()J",
        "J",
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

.field private final label:Ljava/lang/String;

.field private final route:Ljava/lang/String;

.field private final tint:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;J)V
    .locals 1
    .param p1, "route"    # Ljava/lang/String;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "icon"    # Landroidx/compose/ui/graphics/vector/ImageVector;
    .param p4, "tint"    # J

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 646
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 647
    iput-object p1, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->route:Ljava/lang/String;

    .line 648
    iput-object p2, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->label:Ljava/lang/String;

    .line 649
    iput-object p3, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->icon:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 650
    iput-wide p4, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->tint:J

    .line 646
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/example/ui/oneui/OneUIDrawerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;J)V

    return-void
.end method


# virtual methods
.method public final getIcon()Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 1

    .line 649
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->icon:Landroidx/compose/ui/graphics/vector/ImageVector;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 648
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoute()Ljava/lang/String;
    .locals 1

    .line 647
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->route:Ljava/lang/String;

    return-object v0
.end method

.method public final getTint-0d7_KjU()J
    .locals 2

    .line 650
    iget-wide v0, p0, Lcom/example/ui/oneui/OneUIDrawerItem;->tint:J

    return-wide v0
.end method
