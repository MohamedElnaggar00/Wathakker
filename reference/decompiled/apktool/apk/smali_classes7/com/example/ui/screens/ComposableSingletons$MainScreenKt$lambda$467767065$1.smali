.class final Lcom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1;
.super Ljava/lang/Object;
.source "MainScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/ui/screens/ComposableSingletons$MainScreenKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/ui/graphics/Color;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,181:1\n113#2:182\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1\n*L\n53#1:182\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1;

    invoke-direct {v0}, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1;-><init>()V

    sput-object v0, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;

    .line 53
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    move-object v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/example/ui/screens/ComposableSingletons$MainScreenKt$lambda$467767065$1;->invoke-ek8zF_U(JLandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke-ek8zF_U(JLandroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p1, "it"    # J
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    const-string v0, "CN(it:c#ui.graphics.Color)52@2496L77:MainScreen.kt#2thlc2"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move v0, p4

    .local v0, "$dirty":I
    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p1, p2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v0, v1

    :cond_1
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    and-int/lit8 v2, v0, 0x1

    invoke-interface {p3, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v2, "com.example.ui.screens.ComposableSingletons$MainScreenKt.lambda$467767065.<anonymous> (MainScreen.kt:52)"

    const v3, 0x1be18f19

    invoke-static {v3, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 53
    :cond_3
    sget-object v1, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v1}, Landroidx/compose/material/icons/outlined/MosqueKt;->getMosque(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x18

    .local v3, "$this$dp\\1":I
    const/4 v4, 0x0

    .line 182
    .local v4, "$i$f$getDp\\1\\53":I
    int-to-float v5, v3

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 53
    .end local v3    # "$this$dp\\1":I
    .end local v4    # "$i$f$getDp\\1\\53":I
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shl-int/lit8 v1, v0, 0x9

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit16 v8, v1, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-wide v5, p1

    move-object v7, p3

    .end local p1    # "it":J
    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "it":J
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v2 .. v9}, Landroidx/compose/material3/IconKt;->Icon-ww6aTOc(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_2

    .end local v5    # "it":J
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "it":J
    .restart local p3    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_4
    move-wide v5, p1

    move-object v7, p3

    .end local p1    # "it":J
    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v5    # "it":J
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_5
    :goto_2
    return-void
.end method
