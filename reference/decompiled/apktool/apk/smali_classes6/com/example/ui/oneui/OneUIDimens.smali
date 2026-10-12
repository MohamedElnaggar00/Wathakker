.class public final Lcom/example/ui/oneui/OneUIDimens;
.super Ljava/lang/Object;
.source "OneUI.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOneUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneUI.kt\ncom/example/ui/oneui/OneUIDimens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,723:1\n113#2:724\n113#2:725\n113#2:726\n113#2:727\n*S KotlinDebug\n*F\n+ 1 OneUI.kt\ncom/example/ui/oneui/OneUIDimens\n*L\n56#1:724\n57#1:725\n58#1:726\n59#1:727\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u000c\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u000e\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/example/ui/oneui/OneUIDimens;",
        "",
        "<init>",
        "()V",
        "ScreenPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getScreenPadding-D9Ej5fM",
        "()F",
        "F",
        "CardRadius",
        "getCardRadius-D9Ej5fM",
        "HeaderCollapseDistance",
        "getHeaderCollapseDistance-D9Ej5fM",
        "BarHeight",
        "getBarHeight-D9Ej5fM",
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

.field private static final BarHeight:F

.field private static final CardRadius:F

.field private static final HeaderCollapseDistance:F

.field public static final INSTANCE:Lcom/example/ui/oneui/OneUIDimens;

.field private static final ScreenPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/example/ui/oneui/OneUIDimens;

    invoke-direct {v0}, Lcom/example/ui/oneui/OneUIDimens;-><init>()V

    sput-object v0, Lcom/example/ui/oneui/OneUIDimens;->INSTANCE:Lcom/example/ui/oneui/OneUIDimens;

    .line 56
    const/16 v0, 0x10

    .local v0, "$this$dp\\1":I
    const/4 v1, 0x0

    .line 724
    .local v1, "$i$f$getDp\\1\\56":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 56
    .end local v0    # "$this$dp\\1":I
    .end local v1    # "$i$f$getDp\\1\\56":I
    sput v0, Lcom/example/ui/oneui/OneUIDimens;->ScreenPadding:F

    .line 57
    const/16 v0, 0x1a

    .local v0, "$this$dp\\2":I
    const/4 v1, 0x0

    .line 725
    .local v1, "$i$f$getDp\\2\\57":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 57
    .end local v0    # "$this$dp\\2":I
    .end local v1    # "$i$f$getDp\\2\\57":I
    sput v0, Lcom/example/ui/oneui/OneUIDimens;->CardRadius:F

    .line 58
    const/16 v0, 0x8c

    .local v0, "$this$dp\\3":I
    const/4 v1, 0x0

    .line 726
    .local v1, "$i$f$getDp\\3\\58":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 58
    .end local v0    # "$this$dp\\3":I
    .end local v1    # "$i$f$getDp\\3\\58":I
    sput v0, Lcom/example/ui/oneui/OneUIDimens;->HeaderCollapseDistance:F

    .line 59
    const/16 v0, 0x38

    .local v0, "$this$dp\\4":I
    const/4 v1, 0x0

    .line 727
    .local v1, "$i$f$getDp\\4\\59":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 59
    .end local v0    # "$this$dp\\4":I
    .end local v1    # "$i$f$getDp\\4\\59":I
    sput v0, Lcom/example/ui/oneui/OneUIDimens;->BarHeight:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBarHeight-D9Ej5fM()F
    .locals 1

    .line 59
    sget v0, Lcom/example/ui/oneui/OneUIDimens;->BarHeight:F

    return v0
.end method

.method public final getCardRadius-D9Ej5fM()F
    .locals 1

    .line 57
    sget v0, Lcom/example/ui/oneui/OneUIDimens;->CardRadius:F

    return v0
.end method

.method public final getHeaderCollapseDistance-D9Ej5fM()F
    .locals 1

    .line 58
    sget v0, Lcom/example/ui/oneui/OneUIDimens;->HeaderCollapseDistance:F

    return v0
.end method

.method public final getScreenPadding-D9Ej5fM()F
    .locals 1

    .line 56
    sget v0, Lcom/example/ui/oneui/OneUIDimens;->ScreenPadding:F

    return v0
.end method
