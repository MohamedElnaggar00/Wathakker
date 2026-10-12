.class public final Lcom/example/ui/screens/MoreScreenKt;
.super Ljava/lang/Object;
.source "MoreScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMoreScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreScreen.kt\ncom/example/ui/screens/MoreScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,45:1\n1282#2,6:46\n1282#2,6:52\n1282#2,6:59\n1282#2,6:66\n1282#2,6:73\n1282#2,6:79\n1282#2,6:86\n1282#2,6:93\n113#3:58\n113#3:65\n113#3:72\n113#3:85\n113#3:92\n*S KotlinDebug\n*F\n+ 1 MoreScreen.kt\ncom/example/ui/screens/MoreScreenKt\n*L\n13#1:46,6\n16#1:52,6\n18#1:59,6\n20#1:66,6\n22#1:73,6\n27#1:79,6\n29#1:86,6\n31#1:93,6\n17#1:58\n19#1:65\n21#1:72\n28#1:85\n30#1:92\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000cH\u0003\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "MoreScreen",
        "",
        "onNavigate",
        "Lkotlin/Function1;",
        "",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "MoreRow",
        "title",
        "summary",
        "icon",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "onClick",
        "Lkotlin/Function0;",
        "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
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


# direct methods
.method private static final MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .param p0, "title"    # Ljava/lang/String;
    .param p1, "summary"    # Ljava/lang/String;
    .param p2, "icon"    # Landroidx/compose/ui/graphics/vector/ImageVector;
    .param p3, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/graphics/vector/ImageVector;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 38
    move-object/from16 v3, p2

    move/from16 v5, p5

    const v0, -0x21e3b506

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v14, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(MoreRow)N(title,summary,icon,onClick)40@1849L24,38@1768L149:MoreScreen.kt#2thlc2"

    invoke-static {v14, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p5

    .local v1, "$dirty":I
    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_1

    move-object/from16 v6, p0

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p0

    :goto_1
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_3

    move-object/from16 v2, p1

    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    goto :goto_3

    :cond_3
    move-object/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_5

    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_4

    :cond_4
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, v5, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v11, p3

    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_5

    :cond_6
    const/16 v4, 0x400

    :goto_5
    or-int/2addr v1, v4

    goto :goto_6

    :cond_7
    move-object/from16 v11, p3

    :goto_6
    and-int/lit16 v4, v1, 0x493

    const/16 v7, 0x492

    const/4 v8, 0x1

    if-eq v4, v7, :cond_8

    move v4, v8

    goto :goto_7

    :cond_8
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v7, v1, 0x1

    invoke-interface {v14, v4, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v7, "com.example.ui.screens.MoreRow (MoreScreen.kt:37)"

    invoke-static {v0, v1, v4, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 40
    :cond_9
    nop

    .line 41
    new-instance v0, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda10;

    invoke-direct {v0, v3}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda10;-><init>(Landroidx/compose/ui/graphics/vector/ImageVector;)V

    const/16 v4, 0x36

    const v7, -0x47c3b156

    invoke-static {v7, v8, v0, v14, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function2;

    sget-object v0, Lcom/example/ui/screens/ComposableSingletons$MoreScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$MoreScreenKt;

    invoke-virtual {v0}, Lcom/example/ui/screens/ComposableSingletons$MoreScreenKt;->getLambda$1944419529$app()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    .line 40
    and-int/lit8 v0, v1, 0xe

    or-int/lit16 v0, v0, 0x6c00

    shl-int/lit8 v4, v1, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v0, v4

    const/high16 v4, 0x70000

    shl-int/lit8 v7, v1, 0x6

    and-int/2addr v4, v7

    or-int v15, v0, v4

    .line 39
    const/4 v7, 0x0

    const-wide/16 v12, 0x0

    const/16 v16, 0x42

    move-object v8, v2

    invoke-static/range {v6 .. v16}, Lcom/example/ui/oneui/OneUIKt;->OneUIRow-RFMEUTM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_8

    .line 37
    :cond_a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 44
    :cond_b
    :goto_8
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda11;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move v7, v1

    move-object/from16 v1, p0

    .end local v1    # "$dirty":I
    .local v7, "$dirty":I
    invoke-direct/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda11;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_9

    .end local v7    # "$dirty":I
    .restart local v1    # "$dirty":I
    :cond_c
    move v7, v1

    .end local v1    # "$dirty":I
    .restart local v7    # "$dirty":I
    :goto_9
    return-void
.end method

.method static final MoreRow$lambda$21(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10
    .param p0, "$icon"    # Landroidx/compose/ui/graphics/vector/ImageVector;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C40@1851L20:MoreScreen.kt#2thlc2"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MoreRow.<anonymous> (MoreScreen.kt:40)"

    const v2, -0x47c3b156

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 41
    :cond_1
    const/4 v8, 0x0

    const/4 v9, 0x6

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v7, p1

    .end local p0    # "$icon":Landroidx/compose/ui/graphics/vector/ImageVector;
    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v3, "$icon":Landroidx/compose/ui/graphics/vector/ImageVector;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v3 .. v9}, Lcom/example/ui/oneui/OneUIKt;->OneUIIconBadge-aM-cp0Q(Landroidx/compose/ui/graphics/vector/ImageVector;JFLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .end local v3    # "$icon":Landroidx/compose/ui/graphics/vector/ImageVector;
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p0    # "$icon":Landroidx/compose/ui/graphics/vector/ImageVector;
    .restart local p1    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v3, p0

    move-object v7, p1

    .end local p0    # "$icon":Landroidx/compose/ui/graphics/vector/ImageVector;
    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v3    # "$icon":Landroidx/compose/ui/graphics/vector/ImageVector;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final MoreRow$lambda$22(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    or-int/lit8 v0, p4, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    invoke-static/range {v1 .. v6}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final MoreScreen(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 13
    .param p0, "onNavigate"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "onNavigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const v0, 0x2b87adf3

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v10, "$composer":Landroidx/compose/runtime/Composer;
    const-string p1, "C(MoreScreen)N(onNavigate)12@442L1176,12@412L1206:MoreScreen.kt#2thlc2"

    invoke-static {v10, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move p1, p2

    .local p1, "$dirty":I
    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-interface {v10, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr p1, v1

    :cond_1
    and-int/lit8 v1, p1, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v3, :cond_2

    move v1, v5

    goto :goto_1

    :cond_2
    move v1, v4

    :goto_1
    and-int/lit8 v3, p1, 0x1

    invoke-interface {v10, v1, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v3, "com.example.ui.screens.MoreScreen (MoreScreen.kt:11)"

    invoke-static {v0, p1, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 13
    :cond_3
    const v0, 0x68540d6b

    const-string v1, "CC(remember):MoreScreen.kt#9igjgp"

    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p1, 0xe

    if-ne v0, v2, :cond_4

    move v4, v5

    .local v4, "invalid\\1":Z
    :cond_4
    move-object v0, v10

    .local v0, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v1, 0x0

    .line 46
    .local v1, "$i$f$cache\\1\\13":I
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "it\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 47
    .local v3, "$i$a$-let-ComposerKt$cache$1\\2\\46\\1":I
    if-nez v4, :cond_6

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_5

    goto :goto_2

    .line 51
    :cond_5
    goto :goto_3

    .line 48
    :cond_6
    :goto_2
    const/4 v5, 0x0

    .line 13
    .local v5, "$i$a$-cache-MoreScreenKt$MoreScreen$1\\3\\48\\0":I
    new-instance v6, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda8;

    invoke-direct {v6, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda8;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 48
    .end local v5    # "$i$a$-cache-MoreScreenKt$MoreScreen$1\\3\\48\\0":I
    nop

    .line 49
    .local v6, "value\\2":Ljava/lang/Object;
    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 50
    move-object v2, v6

    .line 46
    .end local v2    # "it\\1":Ljava/lang/Object;
    .end local v3    # "$i$a$-let-ComposerKt$cache$1\\2\\46\\1":I
    .end local v6    # "value\\2":Ljava/lang/Object;
    :goto_3
    nop

    .line 13
    .end local v0    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v1    # "$i$f$cache\\1\\13":I
    .end local v4    # "invalid\\1":Z
    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v11, 0x6

    const/16 v12, 0xfe

    const-string v1, "\u0627\u0644\u0645\u0632\u064a\u062f"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Lcom/example/ui/oneui/OneUIKt;->OneUIScreen-gMrHQkA(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/lazy/LazyListState;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_4

    .line 11
    :cond_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 35
    :cond_8
    :goto_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda9;

    invoke-direct {v1, p0, p2}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda9;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_9
    return-void
.end method

.method static final MoreScreen$lambda$19$lambda$18(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;
    .locals 8
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$this$OneUIScreen"    # Landroidx/compose/foundation/lazy/LazyListScope;

    const-string v0, "$this$OneUIScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/functions/Function1;)V

    const v2, -0x7cf8192f

    const/4 v7, 0x1

    invoke-static {v2, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function3;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v2, "g1"

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 25
    new-instance v0, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda4;-><init>(Lkotlin/jvm/functions/Function1;)V

    const v1, 0x603bffba

    invoke-static {v1, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function3;

    const-string v2, "g2"

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 34
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$17(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$this$item"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C25@1161L441,25@1151L451:MoreScreen.kt#2thlc2"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:25)"

    const v3, 0x603bffba

    invoke-static {v3, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 26
    :cond_1
    new-instance v0, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/16 v1, 0x36

    const v3, 0xe82a42f

    invoke-static {v3, v2, v0, p2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function3;

    const/16 v8, 0x6000

    const/16 v9, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v7, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v9}, Lcom/example/ui/oneui/OneUIKt;->OneUICard-uDo3WH8(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 25
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v7, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 33
    :cond_3
    :goto_1
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p2
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$this$OneUICard"    # Landroidx/compose/foundation/layout/ColumnScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move/from16 v6, p3

    const-string v0, "$this$OneUICard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C26@1250L31,26@1179L102,27@1298L27,28@1414L26,28@1342L98,29@1457L27,30@1565L23,30@1501L87:MoreScreen.kt#2thlc2"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v6, 0x11

    const/16 v1, 0x10

    const/4 v7, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    and-int/lit8 v1, v6, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:26)"

    const v2, 0xe82a42f

    invoke-static {v2, v6, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 27
    :cond_1
    sget-object v0, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v0}, Landroidx/compose/material/icons/outlined/AlarmKt;->getAlarm(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    const v0, 0x786a5fae

    const-string v8, "CC(remember):MoreScreen.kt#9igjgp"

    invoke-static {p2, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p2

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 79
    .local v3, "$i$f$cache\\1\\27":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 80
    .local v9, "$i$a$-let-ComposerKt$cache$1\\2\\79\\1":I
    if-nez v0, :cond_3

    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v5, v10, :cond_2

    goto :goto_1

    .line 84
    :cond_2
    goto :goto_2

    .line 81
    :cond_3
    :goto_1
    const/4 v10, 0x0

    .line 27
    .local v10, "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$2$1$1\\3\\81\\0":I
    new-instance v11, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v11, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 81
    .end local v10    # "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$2$1$1\\3\\81\\0":I
    nop

    .line 82
    .local v11, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 83
    move-object v5, v11

    .line 79
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1\\2\\79\\1":I
    .end local v11    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 27
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\1\\27":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v5, 0x36

    const-string v0, "\u0645\u0646\u0628\u0647 \u0635\u0644\u0627\u0629 \u0627\u0644\u0641\u062c\u0631"

    const-string v1, "\u062d\u0633\u0628 \u0645\u0648\u0642\u0639\u0643 \u0627\u0644\u062c\u063a\u0631\u0627\u0641\u064a"

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 28
    const/16 v0, 0x46

    .local v0, "$this$dp\\4":I
    const/4 v1, 0x0

    .line 85
    .local v1, "$i$f$getDp\\4\\28":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 28
    .end local v0    # "$this$dp\\4":I
    .end local v1    # "$i$f$getDp\\4\\28":I
    const/4 v9, 0x6

    invoke-static {v0, p2, v9, v7}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 29
    sget-object v0, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v0}, Landroidx/compose/material/icons/outlined/SettingsKt;->getSettings(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    const v0, 0x786a7429

    invoke-static {p2, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\5":Z
    move-object v1, p2

    .local v1, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 86
    .local v3, "$i$f$cache\\5\\29":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\5":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 87
    .local v10, "$i$a$-let-ComposerKt$cache$1\\6\\86\\5":I
    if-nez v0, :cond_5

    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v5, v11, :cond_4

    goto :goto_3

    .line 91
    :cond_4
    goto :goto_4

    .line 88
    :cond_5
    :goto_3
    const/4 v11, 0x0

    .line 29
    .local v11, "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$2$1$2\\7\\88\\0":I
    new-instance v12, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda6;

    invoke-direct {v12, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda6;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 88
    .end local v11    # "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$2$1$2\\7\\88\\0":I
    nop

    .line 89
    .local v12, "value\\6":Ljava/lang/Object;
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 90
    move-object v5, v12

    .line 86
    .end local v5    # "it\\5":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1\\6\\86\\5":I
    .end local v12    # "value\\6":Ljava/lang/Object;
    :goto_4
    nop

    .line 29
    .end local v0    # "invalid\\5":Z
    .end local v1    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\5\\29":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v5, 0x36

    const-string v0, "\u0627\u0644\u0625\u0639\u062f\u0627\u062f\u0627\u062a"

    const-string v1, "\u0627\u0644\u0627\u0647\u062a\u0632\u0627\u0632 \u0648\u0627\u0644\u062e\u0637 \u0648\u0627\u0644\u0646\u063a\u0645\u0629"

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 30
    const/16 v0, 0x46

    .local v0, "$this$dp\\8":I
    const/4 v1, 0x0

    .line 92
    .local v1, "$i$f$getDp\\8\\30":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 30
    .end local v0    # "$this$dp\\8":I
    .end local v1    # "$i$f$getDp\\8\\30":I
    invoke-static {v0, p2, v9, v7}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 31
    sget-object v0, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v0}, Landroidx/compose/material/icons/outlined/InfoKt;->getInfo(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    const v0, 0x786a8706

    invoke-static {p2, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\9":Z
    move-object v1, p2

    .local v1, "$this$cache\\9":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 93
    .local v3, "$i$f$cache\\9\\31":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\9":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 94
    .local v7, "$i$a$-let-ComposerKt$cache$1\\10\\93\\9":I
    if-nez v0, :cond_7

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_6

    goto :goto_5

    .line 98
    :cond_6
    goto :goto_6

    .line 95
    :cond_7
    :goto_5
    const/4 v8, 0x0

    .line 31
    .local v8, "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$2$1$3\\11\\95\\0":I
    new-instance v9, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda7;

    invoke-direct {v9, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda7;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 95
    .end local v8    # "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$2$1$3\\11\\95\\0":I
    nop

    .line 96
    .local v9, "value\\10":Ljava/lang/Object;
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 97
    move-object v5, v9

    .line 93
    .end local v5    # "it\\9":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1\\10\\93\\9":I
    .end local v9    # "value\\10":Ljava/lang/Object;
    :goto_6
    nop

    .line 31
    .end local v0    # "invalid\\9":Z
    .end local v1    # "$this$cache\\9":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\9\\31":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v5, 0x36

    const-string v0, "\u062d\u0648\u0644 \u0627\u0644\u062a\u0637\u0628\u064a\u0642"

    const-string v1, "\u0627\u0644\u0625\u0635\u062f\u0627\u0631 \u0648\u0627\u0644\u0645\u0637\u0648\u0651\u0631"

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_7

    .line 26
    :cond_8
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 32
    :cond_9
    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$11$lambda$10(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;

    .line 27
    const-string v0, "fajr_settings"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$13$lambda$12(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;

    .line 29
    const-string v0, "settings"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;

    .line 31
    const-string v0, "about"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$9(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$this$item"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C14@493L608,14@483L618:MoreScreen.kt#2thlc2"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:14)"

    const v3, -0x7cf8192f

    invoke-static {v3, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 15
    :cond_1
    new-instance v0, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/16 v1, 0x36

    const v3, -0x3d8db7a

    invoke-static {v3, v2, v0, p2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function3;

    const/16 v8, 0x6000

    const/16 v9, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v7, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v9}, Lcom/example/ui/oneui/OneUIKt;->OneUICard-uDo3WH8(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 14
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v7, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 24
    :cond_3
    :goto_1
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p2
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$this$OneUICard"    # Landroidx/compose/foundation/layout/ColumnScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move/from16 v6, p3

    const-string v0, "$this$OneUICard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C15@573L27,15@511L89,16@617L27,17@734L27,17@661L100,18@778L27,19@896L28,19@822L102,20@941L27,21@1065L22,21@985L102:MoreScreen.kt#2thlc2"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v6, 0x11

    const/16 v1, 0x10

    const/4 v7, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    and-int/lit8 v1, v6, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.MoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MoreScreen.kt:15)"

    const v2, -0x3d8db7a

    invoke-static {v2, v6, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 16
    :cond_1
    sget-object v0, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v0}, Landroidx/compose/material/icons/outlined/StarKt;->getStar(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    const v0, -0x710fdadf

    const-string v8, "CC(remember):MoreScreen.kt#9igjgp"

    invoke-static {p2, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p2

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 52
    .local v3, "$i$f$cache\\1\\16":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 53
    .local v9, "$i$a$-let-ComposerKt$cache$1\\2\\52\\1":I
    if-nez v0, :cond_3

    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v5, v10, :cond_2

    goto :goto_1

    .line 57
    :cond_2
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    const/4 v10, 0x0

    .line 16
    .local v10, "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$1\\3\\54\\0":I
    new-instance v11, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda12;

    invoke-direct {v11, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda12;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 54
    .end local v10    # "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$1\\3\\54\\0":I
    nop

    .line 55
    .local v11, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 56
    move-object v5, v11

    .line 52
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1\\2\\52\\1":I
    .end local v11    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 16
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\1\\16":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v5, 0x36

    const-string v0, "\u0627\u0644\u0645\u0641\u0636\u0644\u0629"

    const-string v1, "\u0627\u0644\u0623\u0630\u0643\u0627\u0631 \u0627\u0644\u062a\u064a \u062a\u062d\u0628\u0647\u0627"

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 17
    const/16 v0, 0x46

    .local v0, "$this$dp\\4":I
    const/4 v1, 0x0

    .line 58
    .local v1, "$i$f$getDp\\4\\17":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 17
    .end local v0    # "$this$dp\\4":I
    .end local v1    # "$i$f$getDp\\4\\17":I
    const/4 v9, 0x6

    invoke-static {v0, p2, v9, v7}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 18
    sget-object v0, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v0}, Landroidx/compose/material/icons/outlined/NotificationsKt;->getNotifications(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    const v0, -0x710fc6bf

    invoke-static {p2, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\5":Z
    move-object v1, p2

    .local v1, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 59
    .local v3, "$i$f$cache\\5\\18":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\5":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 60
    .local v10, "$i$a$-let-ComposerKt$cache$1\\6\\59\\5":I
    if-nez v0, :cond_5

    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v5, v11, :cond_4

    goto :goto_3

    .line 64
    :cond_4
    goto :goto_4

    .line 61
    :cond_5
    :goto_3
    const/4 v11, 0x0

    .line 18
    .local v11, "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$2\\7\\61\\0":I
    new-instance v12, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda13;

    invoke-direct {v12, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda13;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .end local v11    # "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$2\\7\\61\\0":I
    nop

    .line 62
    .local v12, "value\\6":Ljava/lang/Object;
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 63
    move-object v5, v12

    .line 59
    .end local v5    # "it\\5":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1\\6\\59\\5":I
    .end local v12    # "value\\6":Ljava/lang/Object;
    :goto_4
    nop

    .line 18
    .end local v0    # "invalid\\5":Z
    .end local v1    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\5\\18":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v5, 0x36

    const-string v0, "\u0627\u0644\u062a\u0646\u0628\u064a\u0647\u0627\u062a"

    const-string v1, "\u062c\u0645\u064a\u0639 \u0623\u0648\u0642\u0627\u062a \u0627\u0644\u062a\u0630\u0643\u064a\u0631"

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 19
    const/16 v0, 0x46

    .local v0, "$this$dp\\8":I
    const/4 v1, 0x0

    .line 65
    .local v1, "$i$f$getDp\\8\\19":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 19
    .end local v0    # "$this$dp\\8":I
    .end local v1    # "$i$f$getDp\\8\\19":I
    invoke-static {v0, p2, v9, v7}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 20
    sget-object v0, Landroidx/compose/material/icons/Icons$Outlined;->INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;

    invoke-static {v0}, Landroidx/compose/material/icons/outlined/BarChartKt;->getBarChart(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    const v0, -0x710fb27e

    invoke-static {p2, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\9":Z
    move-object v1, p2

    .local v1, "$this$cache\\9":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 66
    .local v3, "$i$f$cache\\9\\20":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\9":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 67
    .local v10, "$i$a$-let-ComposerKt$cache$1\\10\\66\\9":I
    if-nez v0, :cond_7

    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v5, v11, :cond_6

    goto :goto_5

    .line 71
    :cond_6
    goto :goto_6

    .line 68
    :cond_7
    :goto_5
    const/4 v11, 0x0

    .line 20
    .local v11, "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$3\\11\\68\\0":I
    new-instance v12, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda14;

    invoke-direct {v12, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda14;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 68
    .end local v11    # "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$3\\11\\68\\0":I
    nop

    .line 69
    .local v12, "value\\10":Ljava/lang/Object;
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 70
    move-object v5, v12

    .line 66
    .end local v5    # "it\\9":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1\\10\\66\\9":I
    .end local v12    # "value\\10":Ljava/lang/Object;
    :goto_6
    nop

    .line 20
    .end local v0    # "invalid\\9":Z
    .end local v1    # "$this$cache\\9":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\9\\20":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v5, 0x36

    const-string v0, "\u0627\u0644\u0625\u062d\u0635\u0627\u0626\u064a\u0627\u062a"

    const-string v1, "\u0627\u0644\u0633\u062c\u0644 \u0648\u0627\u0644\u0623\u064a\u0627\u0645 \u0627\u0644\u0645\u062a\u062a\u0627\u0644\u064a\u0629"

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 21
    const/16 v0, 0x46

    .local v0, "$this$dp\\12":I
    const/4 v1, 0x0

    .line 72
    .local v1, "$i$f$getDp\\12\\21":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 21
    .end local v0    # "$this$dp\\12":I
    .end local v1    # "$i$f$getDp\\12\\21":I
    invoke-static {v0, p2, v9, v7}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 22
    sget-object v0, Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;->INSTANCE:Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;

    invoke-static {v0}, Landroidx/compose/material/icons/automirrored/filled/LabelKt;->getLabel(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    const v0, -0x710f9d64

    invoke-static {p2, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\13":Z
    move-object v1, p2

    .local v1, "$this$cache\\13":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 73
    .local v3, "$i$f$cache\\13\\22":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\13":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 74
    .local v7, "$i$a$-let-ComposerKt$cache$1\\14\\73\\13":I
    if-nez v0, :cond_9

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_8

    goto :goto_7

    .line 78
    :cond_8
    goto :goto_8

    .line 75
    :cond_9
    :goto_7
    const/4 v8, 0x0

    .line 22
    .local v8, "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$4\\15\\75\\0":I
    new-instance v9, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v9, p0}, Lcom/example/ui/screens/MoreScreenKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 75
    .end local v8    # "$i$a$-cache-MoreScreenKt$MoreScreen$1$1$1$1$4\\15\\75\\0":I
    nop

    .line 76
    .local v9, "value\\14":Ljava/lang/Object;
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 77
    move-object v5, v9

    .line 73
    .end local v5    # "it\\13":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1\\14\\73\\13":I
    .end local v9    # "value\\14":Ljava/lang/Object;
    :goto_8
    nop

    .line 22
    .end local v0    # "invalid\\13":Z
    .end local v1    # "$this$cache\\13":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\13\\22":I
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v5, 0x36

    const-string v0, "\u0627\u0644\u062a\u0635\u0646\u064a\u0641\u0627\u062a"

    const-string v1, "\u062a\u0646\u0638\u064a\u0645 \u0627\u0644\u0623\u0630\u0643\u0627\u0631 \u0628\u0627\u0644\u0623\u0644\u0648\u0627\u0646"

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MoreScreenKt;->MoreRow(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_9

    .line 15
    :cond_a
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 23
    :cond_b
    :goto_9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;

    .line 16
    const-string v0, "favorites"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$3$lambda$2(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;

    .line 18
    const-string v0, "reminders"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$5$lambda$4(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;

    .line 20
    const-string v0, "statistics"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$19$lambda$18$lambda$9$lambda$8$lambda$7$lambda$6(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onNavigate"    # Lkotlin/jvm/functions/Function1;

    .line 22
    const-string v0, "tags"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MoreScreen$lambda$20(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p1, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p2, v0}, Lcom/example/ui/screens/MoreScreenKt;->MoreScreen(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
