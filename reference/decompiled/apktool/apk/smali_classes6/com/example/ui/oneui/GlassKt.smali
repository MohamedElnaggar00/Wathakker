.class public final Lcom/example/ui/oneui/GlassKt;
.super Ljava/lang/Object;
.source "Glass.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGlass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Glass.kt\ncom/example/ui/oneui/GlassKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,51:1\n75#2:52\n113#3:53\n*S KotlinDebug\n*F\n+ 1 Glass.kt\ncom/example/ui/oneui/GlassKt\n*L\n34#1:52\n43#1:53\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a7\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\"\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "LocalHazeState",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "Ldev/chrisbanes/haze/HazeState;",
        "getLocalHazeState",
        "()Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "blurSupported",
        "",
        "getBlurSupported",
        "()Z",
        "oneUIGlass",
        "Landroidx/compose/ui/Modifier;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "base",
        "Landroidx/compose/ui/graphics/Color;",
        "alpha",
        "",
        "blurRadius",
        "",
        "oneUIGlass-T042LqI",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JFILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
        "app"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final LocalHazeState:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Ldev/chrisbanes/haze/HazeState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    new-instance v0, Lcom/example/ui/oneui/GlassKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/example/ui/oneui/GlassKt$$ExternalSyntheticLambda0;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Landroidx/compose/runtime/CompositionLocalKt;->compositionLocalOf$default(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/example/ui/oneui/GlassKt;->LocalHazeState:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-void
.end method

.method static final LocalHazeState$lambda$0()Ldev/chrisbanes/haze/HazeState;
    .locals 1

    .line 19
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final getBlurSupported()Z
    .locals 2

    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final getLocalHazeState()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Ldev/chrisbanes/haze/HazeState;",
            ">;"
        }
    .end annotation

    .line 19
    sget-object v0, Lcom/example/ui/oneui/GlassKt;->LocalHazeState:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method

.method public static final oneUIGlass-T042LqI(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JFILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 28
    .param p0, "$this$oneUIGlass_u2dT042LqI"    # Landroidx/compose/ui/Modifier;
    .param p1, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p2, "base"    # J
    .param p4, "alpha"    # F
    .param p5, "blurRadius"    # I
    .param p6, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p7, "$changed"    # I

    move-object/from16 v0, p6

    const-string v1, "$this$oneUIGlass"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "shape"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const v1, -0xfa1674    # -1.7799997E38f

    const-string v4, "C(oneUIGlass)N(shape,base:c#ui.graphics.Color,alpha,blurRadius)33@1138L7:Glass.kt#78813j"

    invoke-static {v0, v1, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_0

    .line 31
    const v4, 0x3f3851ec    # 0.72f

    move v7, v4

    .end local p4    # "alpha":F
    .local v4, "alpha":F
    goto :goto_0

    .line 33
    .end local v4    # "alpha":F
    .restart local p4    # "alpha":F
    :cond_0
    move/from16 v7, p4

    .line 31
    .end local p4    # "alpha":F
    .local v7, "alpha":F
    :goto_0
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_1

    .line 32
    const/16 v4, 0x1c

    .end local p5    # "blurRadius":I
    .local v4, "blurRadius":I
    goto :goto_1

    .line 31
    .end local v4    # "blurRadius":I
    .restart local p5    # "blurRadius":I
    :cond_1
    move/from16 v4, p5

    .line 32
    .end local p5    # "blurRadius":I
    .restart local v4    # "blurRadius":I
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, -0x1

    const-string v6, "com.example.ui.oneui.oneUIGlass (Glass.kt:32)"

    move/from16 v13, p7

    invoke-static {v1, v13, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_2

    :cond_2
    move/from16 v13, p7

    .line 34
    :goto_2
    sget-object v1, Lcom/example/ui/oneui/GlassKt;->LocalHazeState:Landroidx/compose/runtime/ProvidableCompositionLocal;

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    .local v1, "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    const/4 v5, 0x6

    .local v5, "$changed\\1":I
    move-object/from16 v6, p6

    .local v6, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 52
    .local v8, "$i$f$getCurrent\\1\\34":I
    const v9, 0x789c5f52

    const-string v10, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v6, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 34
    .end local v1    # "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    .end local v5    # "$changed\\1":I
    .end local v6    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$getCurrent\\1\\34":I
    move-object v15, v9

    check-cast v15, Ldev/chrisbanes/haze/HazeState;

    .line 35
    .local v15, "state":Ldev/chrisbanes/haze/HazeState;
    if-eqz v15, :cond_3

    invoke-static {}, Lcom/example/ui/oneui/GlassKt;->getBlurSupported()Z

    move-result v1

    if-eqz v1, :cond_3

    const v1, 0x5108a70b

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 36
    nop

    .line 37
    invoke-static/range {p0 .. p1}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    .line 39
    nop

    .line 40
    new-instance v16, Ldev/chrisbanes/haze/HazeStyle;

    .line 41
    nop

    .line 42
    new-instance v17, Ldev/chrisbanes/haze/HazeTint;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide/from16 v5, p2

    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v18

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Ldev/chrisbanes/haze/HazeTint;-><init>(JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    move v1, v4

    .local v1, "$this$dp\\2":I
    const/4 v5, 0x0

    .line 53
    .local v5, "$i$f$getDp\\2\\43":I
    int-to-float v6, v1

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v20

    .line 44
    .end local v1    # "$this$dp\\2":I
    .end local v5    # "$i$f$getDp\\2\\43":I
    nop

    .line 40
    const/16 v23, 0x10

    const/16 v24, 0x0

    const v21, 0x3d23d70a    # 0.04f

    move-object/from16 v19, v17

    move-wide/from16 v17, p2

    invoke-direct/range {v16 .. v24}, Ldev/chrisbanes/haze/HazeStyle;-><init>(JLdev/chrisbanes/haze/HazeTint;FFLdev/chrisbanes/haze/HazeTint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Ldev/chrisbanes/haze/HazeChildKt;->hazeEffect$default(Landroidx/compose/ui/Modifier;Ldev/chrisbanes/haze/HazeState;Ldev/chrisbanes/haze/HazeStyle;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_4

    .line 47
    :cond_3
    const v1, 0x510e1deb

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "47@1622L21"

    invoke-static {v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 48
    invoke-static/range {p0 .. p1}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result v1

    if-eqz v1, :cond_4

    const v1, 0x3f75c28f    # 0.96f

    goto :goto_3

    :cond_4
    const v1, 0x3f7851ec    # 0.97f

    :goto_3
    move/from16 v22, v1

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-wide/from16 v20, p2

    invoke-static/range {v20 .. v27}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 47
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 35
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 33
    :cond_5
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 35
    return-object v1
.end method
