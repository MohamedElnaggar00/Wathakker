.class public final Lcom/example/ui/screens/AboutScreenKt;
.super Ljava/lang/Object;
.source "AboutScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAboutScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutScreen.kt\ncom/example/ui/screens/AboutScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,73:1\n1282#2,6:74\n113#3:80\n113#3:81\n113#3:82\n113#3:119\n113#3:120\n113#3:125\n113#3:126\n86#4:83\n83#4,6:84\n89#4:118\n93#4:124\n79#5,6:90\n86#5,4:105\n90#5,2:115\n94#5:123\n368#6,9:96\n377#6:117\n378#6,2:121\n4034#7,6:109\n*S KotlinDebug\n*F\n+ 1 AboutScreen.kt\ncom/example/ui/screens/AboutScreenKt\n*L\n24#1:74,6\n67#1:80\n72#1:81\n26#1:82\n28#1:119\n31#1:120\n38#1:125\n41#1:126\n26#1:83\n26#1:84,6\n26#1:118\n26#1:124\n26#1:90,6\n26#1:105,4\n26#1:115,2\n26#1:123\n26#1:96,9\n26#1:117\n26#1:121,2\n26#1:109,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\u000c\u0010\u0007\u001a\u00020\u0008*\u00020\u0008H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "AboutScreen",
        "",
        "onBack",
        "Lkotlin/Function0;",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "AppIconBadge",
        "(Landroidx/compose/runtime/Composer;I)V",
        "androidx_clip22",
        "Landroidx/compose/ui/Modifier;",
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
.method public static final AboutScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 13
    .param p0, "onBack"    # Lkotlin/jvm/functions/Function0;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "onBack"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    const v0, 0x2b51483c

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v10, "$composer":Landroidx/compose/runtime/Composer;
    const-string p1, "C(AboutScreen)N(onBack)22@880L11,23@948L2034,23@896L2086:AboutScreen.kt#2thlc2"

    invoke-static {v10, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move p1, p2

    .local p1, "$dirty":I
    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {v10, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr p1, v1

    :cond_1
    and-int/lit8 v1, p1, 0x3

    if-eq v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    and-int/lit8 v2, p1, 0x1

    invoke-interface {v10, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v2, "com.example.ui.screens.AboutScreen (AboutScreen.kt:21)"

    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 23
    :cond_3
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v10, v1}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    .line 24
    .local v0, "cs":Landroidx/compose/material3/ColorScheme;
    const v1, -0x63dfbcb2

    const-string v2, "CC(remember):AboutScreen.kt#9igjgp"

    invoke-static {v10, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .local v1, "invalid\\1":Z
    move-object v2, v10

    .local v2, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 74
    .local v3, "$i$f$cache\\1\\24":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\1":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 75
    .local v5, "$i$a$-let-ComposerKt$cache$1\\2\\74\\1":I
    if-nez v1, :cond_5

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_4

    goto :goto_2

    .line 79
    :cond_4
    goto :goto_3

    .line 76
    :cond_5
    :goto_2
    const/4 v6, 0x0

    .line 24
    .local v6, "$i$a$-cache-AboutScreenKt$AboutScreen$1\\3\\76\\0":I
    new-instance v7, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda4;

    invoke-direct {v7, v0}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda4;-><init>(Landroidx/compose/material3/ColorScheme;)V

    .line 76
    .end local v6    # "$i$a$-cache-AboutScreenKt$AboutScreen$1\\3\\76\\0":I
    nop

    .line 77
    .local v7, "value\\2":Ljava/lang/Object;
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 78
    move-object v4, v7

    .line 74
    .end local v4    # "it\\1":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1\\2\\74\\1":I
    .end local v7    # "value\\2":Ljava/lang/Object;
    :goto_3
    nop

    .line 24
    .end local v1    # "invalid\\1":Z
    .end local v2    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\1\\24":I
    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shl-int/lit8 v1, p1, 0x9

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit8 v11, v1, 0x6

    const/16 v12, 0xf6

    const-string v1, "\u062d\u0648\u0644 \u0627\u0644\u062a\u0637\u0628\u064a\u0642"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p0

    .end local p0    # "onBack":Lkotlin/jvm/functions/Function0;
    .local v4, "onBack":Lkotlin/jvm/functions/Function0;
    invoke-static/range {v1 .. v12}, Lcom/example/ui/oneui/OneUIKt;->OneUIScreen-gMrHQkA(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/lazy/LazyListState;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v0    # "cs":Landroidx/compose/material3/ColorScheme;
    goto :goto_4

    .line 21
    .end local v4    # "onBack":Lkotlin/jvm/functions/Function0;
    .restart local p0    # "onBack":Lkotlin/jvm/functions/Function0;
    :cond_6
    move-object v4, p0

    .end local p0    # "onBack":Lkotlin/jvm/functions/Function0;
    .restart local v4    # "onBack":Lkotlin/jvm/functions/Function0;
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 60
    :cond_7
    :goto_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v0, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda5;

    invoke-direct {v0, v4, p2}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_8
    return-void
.end method

.method static final AboutScreen$lambda$7$lambda$6(Landroidx/compose/material3/ColorScheme;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;
    .locals 8
    .param p0, "$cs"    # Landroidx/compose/material3/ColorScheme;
    .param p1, "$this$OneUIScreen"    # Landroidx/compose/foundation/lazy/LazyListScope;

    const-string v0, "$this$OneUIScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda2;-><init>(Landroidx/compose/material3/ColorScheme;)V

    const v2, -0x5c593e66

    const/4 v7, 0x1

    invoke-static {v2, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function3;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v2, "hero"

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 34
    new-instance v0, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda3;-><init>(Landroidx/compose/material3/ColorScheme;)V

    const v1, 0x4384443

    invoke-static {v1, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function3;

    const-string v2, "info"

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 46
    sget-object v0, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;

    invoke-virtual {v0}, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->getLambda$1150338402$app()Lkotlin/jvm/functions/Function3;

    move-result-object v4

    const-string v2, "credit"

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 54
    sget-object v0, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;

    invoke-virtual {v0}, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->getLambda$-2065086847$app()Lkotlin/jvm/functions/Function3;

    move-result-object v4

    const-string v2, "dua"

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 59
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final AboutScreen$lambda$7$lambda$6$lambda$1(Landroidx/compose/material3/ColorScheme;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 52
    .param p0, "$cs"    # Landroidx/compose/material3/ColorScheme;
    .param p1, "$this$item"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move-object/from16 v0, p2

    move/from16 v1, p3

    const-string v2, "$this$item"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "C25@991L574:AboutScreen.kt#2thlc2"

    invoke-static {v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v4, 0x10

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v2, v4, :cond_0

    move v2, v6

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    and-int/lit8 v4, v1, 0x1

    invoke-interface {v0, v2, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    const-string v4, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:25)"

    const v7, -0x5c593e66

    invoke-static {v7, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 26
    :cond_1
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-static {v2, v4, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0x8

    .local v8, "$this$dp\\1":I
    const/4 v9, 0x0

    .line 82
    .local v9, "$i$f$getDp\\1\\26":I
    int-to-float v10, v8

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 26
    .end local v8    # "$this$dp\\1":I
    .end local v9    # "$i$f$getDp\\1\\26":I
    invoke-static {v2, v4, v8, v6, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .local v2, "modifier\\2":Landroidx/compose/ui/Modifier;
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v4

    .local v4, "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    const/16 v6, 0x186

    .local v6, "$changed\\2":I
    move-object/from16 v7, p2

    .local v7, "$composer\\2":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 83
    .local v8, "$i$f$Column\\2\\26":I
    const v9, -0x1cd0f17e

    const-string v10, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    invoke-static {v7, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 84
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v9

    .line 88
    .local v9, "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    shr-int/lit8 v10, v6, 0x3

    and-int/lit8 v10, v10, 0xe

    shr-int/lit8 v11, v6, 0x3

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v10, v11

    invoke-static {v9, v4, v7, v10}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v10

    .local v10, "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v11, v6, 0x3

    and-int/lit8 v11, v11, 0x70

    .line 89
    nop

    .local v11, "$changed\\3":I
    const/4 v12, 0x0

    .line 90
    .local v12, "$i$f$Layout\\3\\89":I
    const v13, -0x4ee9b9da

    const-string v14, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v7, v13, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 91
    invoke-static {v7, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v13

    .line 92
    .local v13, "compositeKeyHash\\3":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v14

    .line 93
    .local v14, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v7, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    .line 95
    .local v15, "materialized\\3":Landroidx/compose/ui/Modifier;
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v16

    shl-int/lit8 v5, v11, 0x6

    and-int/lit16 v5, v5, 0x380

    const/4 v0, 0x6

    or-int/2addr v5, v0

    .line 94
    move-object/from16 v18, v16

    .local v5, "$changed\\4":I
    .local v18, "factory\\4":Lkotlin/jvm/functions/Function0;
    const/16 v16, 0x0

    .line 96
    .local v16, "$i$f$ReusableComposeNode\\4\\94":I
    move/from16 v19, v0

    const v0, -0x2942ffcf

    const-string v1, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v7, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 97
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 98
    :cond_2
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 99
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    move-object/from16 v0, v18

    .end local v18    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v0, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 102
    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v18    # "factory\\4":Lkotlin/jvm/functions/Function0;
    :cond_3
    move-object/from16 v0, v18

    .end local v18    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 104
    :goto_1
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .local v1, "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 105
    .local v18, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\104\\3":I
    sget-object v20, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v21, v0

    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v21, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v10, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 106
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block\\6":Lkotlin/jvm/functions/Function2;
    const/16 v20, 0x0

    .line 109
    .local v20, "$i$f$set-impl\\6\\108":I
    move-object/from16 v22, v1

    .local v22, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    const/16 v23, 0x0

    .line 110
    .local v23, "$i$a$-with-Updater$set$1\\7\\109\\6":I
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v24

    if-nez v24, :cond_5

    move-object/from16 v24, v2

    .end local v2    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .local v24, "modifier\\2":Landroidx/compose/ui/Modifier;
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v3, v22

    goto :goto_3

    .end local v24    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier\\2":Landroidx/compose/ui/Modifier;
    :cond_5
    move-object/from16 v24, v2

    .line 111
    .end local v2    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .restart local v24    # "modifier\\2":Landroidx/compose/ui/Modifier;
    :goto_2
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v22

    .end local v22    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 112
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    :goto_3
    nop

    .line 109
    .end local v3    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .end local v23    # "$i$a$-with-Updater$set$1\\7\\109\\6":I
    nop

    .line 114
    nop

    .line 115
    .end local v0    # "block\\6":Lkotlin/jvm/functions/Function2;
    .end local v20    # "$i$f$set-impl\\6\\108":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v15, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 116
    nop

    .line 104
    .end local v1    # "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\104\\3":I
    nop

    .line 117
    shr-int/lit8 v0, v5, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\8":I
    move-object v1, v7

    .local v1, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 118
    .local v2, "$i$a$-Layout-ColumnKt$Column$1\\8\\117\\2":I
    const v3, -0x16ef5699

    move/from16 v18, v0

    .end local v0    # "$changed\\8":I
    .local v18, "$changed\\8":I
    const-string v0, "C88@4444L9:Column.kt#2w3rfo"

    invoke-static {v1, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    shr-int/lit8 v3, v6, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    .local v3, "$changed\\9":I
    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    .local v0, "$this$AboutScreen_u24lambda_u247_u24lambda_u246_u24lambda_u241_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    move-object/from16 v46, v1

    .local v46, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v20, 0x0

    .line 27
    .local v20, "$i$a$-Column-AboutScreenKt$AboutScreen$1$1$1$1\\9\\118\\0":I
    move-object/from16 v22, v0

    .end local v0    # "$this$AboutScreen_u24lambda_u247_u24lambda_u246_u24lambda_u241_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .local v22, "$this$AboutScreen_u24lambda_u247_u24lambda_u246_u24lambda_u241_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    const v0, -0xd75d4b2

    move-object/from16 v23, v1

    .end local v1    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v23, "$composer\\8":Landroidx/compose/runtime/Composer;
    const-string v1, "C26@1118L14,27@1149L30,28@1234L10,28@1196L89,29@1384L10,29@1302L249:AboutScreen.kt#2thlc2"

    move/from16 v50, v2

    move-object/from16 v2, v46

    .end local v46    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v50, "$i$a$-Layout-ColumnKt$Column$1\\8\\117\\2":I
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/example/ui/screens/AboutScreenKt;->AppIconBadge(Landroidx/compose/runtime/Composer;I)V

    .line 28
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0xc

    .local v1, "$this$dp\\10":I
    const/16 v17, 0x0

    .line 119
    .local v17, "$i$f$getDp\\10\\28":I
    move/from16 v51, v3

    .end local v3    # "$changed\\9":I
    .local v51, "$changed\\9":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 28
    .end local v1    # "$this$dp\\10":I
    .end local v17    # "$i$f$getDp\\10\\28":I
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, v19

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 29
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v2, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getHeadlineMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v45

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/ColorScheme;->getOnBackground-0d7_KjU()J

    move-result-wide v27

    const/16 v48, 0x0

    const v49, 0xfffa

    const-string v25, "\u0648\u064e\u0630\u0643\u0650\u0651\u0631"

    const/16 v26, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v47, 0x6

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v46    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v25 .. v49}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 30
    .end local v46    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v2, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getBodyMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v45

    .line 31
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/ColorScheme;->getOnSurfaceVariant-0d7_KjU()J

    move-result-wide v27

    sget-object v0, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    move-result v0

    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x18

    .local v3, "$this$dp\\11":I
    const/16 v17, 0x0

    .line 120
    .local v17, "$i$f$getDp\\11\\31":I
    move/from16 v19, v0

    int-to-float v0, v3

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 31
    .end local v3    # "$this$dp\\11":I
    .end local v17    # "$i$f$getDp\\11\\31":I
    const/4 v3, 0x4

    .local v3, "$this$dp\\12":I
    const/16 v17, 0x0

    .line 120
    .local v17, "$i$f$getDp\\12\\31":I
    nop

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v46    # "$composer\\9":Landroidx/compose/runtime/Composer;
    int-to-float v2, v3

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 31
    .end local v3    # "$this$dp\\12":I
    .end local v17    # "$i$f$getDp\\12\\31":I
    invoke-static {v1, v0, v2}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v26

    .line 30
    nop

    .line 31
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    move-result-object v37

    .line 30
    const v49, 0xfdf8

    const-string v25, "\u062a\u0637\u0628\u064a\u0642 \u064a\u0633\u0627\u0639\u062f\u0643 \u0639\u0644\u0649 \u0627\u0644\u0645\u062d\u0627\u0641\u0638\u0629 \u0639\u0644\u0649 \u0623\u0630\u0643\u0627\u0631\u0643 \u0641\u064a \u064a\u0648\u0645\u0643 \u0648\u0644\u064a\u0644\u062a\u0643"

    const/16 v47, 0x36

    invoke-static/range {v25 .. v49}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 27
    invoke-static/range {v46 .. v46}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 32
    nop

    .line 118
    .end local v20    # "$i$a$-Column-AboutScreenKt$AboutScreen$1$1$1$1\\9\\118\\0":I
    .end local v22    # "$this$AboutScreen_u24lambda_u247_u24lambda_u246_u24lambda_u241_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .end local v46    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v51    # "$changed\\9":I
    invoke-static/range {v23 .. v23}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 117
    .end local v18    # "$changed\\8":I
    .end local v23    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v50    # "$i$a$-Layout-ColumnKt$Column$1\\8\\117\\2":I
    nop

    .line 121
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 96
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 122
    nop

    .line 90
    .end local v5    # "$changed\\4":I
    .end local v16    # "$i$f$ReusableComposeNode\\4\\94":I
    .end local v21    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 123
    nop

    .line 83
    .end local v11    # "$changed\\3":I
    .end local v12    # "$i$f$Layout\\3\\89":I
    .end local v13    # "compositeKeyHash\\3":I
    .end local v14    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v15    # "materialized\\3":Landroidx/compose/ui/Modifier;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 124
    nop

    .end local v4    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v6    # "$changed\\2":I
    .end local v7    # "$composer\\2":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$Column\\2\\26":I
    .end local v9    # "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v10    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v24    # "modifier\\2":Landroidx/compose/ui/Modifier;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_4

    .line 25
    :cond_6
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 33
    :cond_7
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final AboutScreen$lambda$7$lambda$6$lambda$5(Landroidx/compose/material3/ColorScheme;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10
    .param p0, "$cs"    # Landroidx/compose/material3/ColorScheme;
    .param p1, "$this$item"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C34@1627L717,34@1617L727:AboutScreen.kt#2thlc2"

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

    const-string v1, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:34)"

    const v3, 0x4384443

    invoke-static {v3, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 35
    :cond_1
    new-instance v0, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda7;-><init>(Landroidx/compose/material3/ColorScheme;)V

    const/16 v1, 0x36

    const v3, 0x3b679f78

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

    .line 34
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v7, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 45
    :cond_3
    :goto_1
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p2
.end method

.method static final AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4(Landroidx/compose/material3/ColorScheme;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 17
    .param p0, "$cs"    # Landroidx/compose/material3/ColorScheme;
    .param p1, "$this$OneUICard"    # Landroidx/compose/foundation/layout/ColumnScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v9, p2

    move/from16 v12, p3

    const-string v1, "$this$OneUICard"

    move-object/from16 v13, p1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "C36@1747L89,35@1645L192,37@1854L27,39@2002L97,38@1898L202,40@2117L27,41@2161L169:AboutScreen.kt#2thlc2"

    invoke-static {v9, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, v12, 0x11

    const/16 v2, 0x10

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v1, v2, :cond_0

    move v1, v15

    goto :goto_0

    :cond_0
    move v1, v14

    :goto_0
    and-int/lit8 v2, v12, 0x1

    invoke-interface {v9, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:35)"

    const v3, 0x3b679f78

    invoke-static {v3, v12, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    :cond_1
    sget-object v1, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;

    invoke-virtual {v1}, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->getLambda$-673636920$app()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 37
    new-instance v1, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/material3/ColorScheme;)V

    const v2, -0x718aeab7

    const/16 v3, 0x36

    invoke-static {v2, v15, v1, v9, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 36
    const-string v1, "\u0627\u0644\u0625\u0635\u062f\u0627\u0631"

    const/4 v2, 0x0

    move v6, v3

    const/4 v3, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v10, v7

    const-wide/16 v7, 0x0

    move v11, v10

    const/16 v10, 0x6c06

    move/from16 v16, v11

    const/16 v11, 0x66

    invoke-static/range {v1 .. v11}, Lcom/example/ui/oneui/OneUIKt;->OneUIRow-RFMEUTM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V

    .line 38
    const/16 v1, 0x46

    .local v1, "$this$dp\\1":I
    const/4 v2, 0x0

    .line 125
    .local v2, "$i$f$getDp\\1\\38":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 38
    .end local v1    # "$this$dp\\1":I
    .end local v2    # "$i$f$getDp\\1\\38":I
    const/4 v2, 0x6

    invoke-static {v1, v9, v2, v14}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 39
    sget-object v1, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;

    invoke-virtual {v1}, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->getLambda$765542911$app()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 40
    new-instance v1, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v1, v0}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/material3/ColorScheme;)V

    const v3, -0x52e2a2c0

    const/16 v6, 0x36

    invoke-static {v3, v15, v1, v9, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 39
    const-string v1, "\u0627\u0644\u0645\u0637\u0648\u0651\u0631"

    move v3, v2

    const/4 v2, 0x0

    move v6, v3

    const/4 v3, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v10, v7

    const-wide/16 v7, 0x0

    move v11, v10

    const/16 v10, 0x6c06

    move v15, v11

    const/16 v11, 0x66

    invoke-static/range {v1 .. v11}, Lcom/example/ui/oneui/OneUIKt;->OneUIRow-RFMEUTM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V

    .line 41
    const/16 v1, 0x46

    .local v1, "$this$dp\\2":I
    const/4 v2, 0x0

    .line 126
    .local v2, "$i$f$getDp\\2\\41":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 41
    .end local v1    # "$this$dp\\2":I
    .end local v2    # "$i$f$getDp\\2\\41":I
    invoke-static {v1, v9, v15, v14}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 42
    sget-object v1, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;

    invoke-virtual {v1}, Lcom/example/ui/screens/ComposableSingletons$AboutScreenKt;->getLambda$823525184$app()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    const/16 v10, 0xd86

    const/16 v11, 0x72

    const-string v1, "\u062d\u0635\u0646 \u0627\u0644\u0645\u0633\u0644\u0645"

    const/4 v2, 0x0

    const-string v3, "\u0627\u0644\u0645\u062d\u062a\u0648\u0649 \u0645\u0646 \u0645\u0634\u0631\u0648\u0639 HisnElmoslem (\u0645\u0631\u062e\u0651\u0635 \u0628\u0640 GPL v3)"

    const/4 v5, 0x0

    invoke-static/range {v1 .. v11}, Lcom/example/ui/oneui/OneUIKt;->OneUIRow-RFMEUTM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 35
    :cond_2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 44
    :cond_3
    :goto_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method static final AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$2(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 25
    .param p0, "$cs"    # Landroidx/compose/material3/ColorScheme;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p1

    move/from16 v1, p2

    const-string v2, "C36@1812L10,36@1749L85:AboutScreen.kt#2thlc2"

    invoke-static {v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, v1, 0x1

    invoke-interface {v0, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    const-string v3, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:36)"

    const v4, -0x718aeab7

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/ColorScheme;->getOnSurfaceVariant-0d7_KjU()J

    move-result-wide v2

    sget-object v4, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v5, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material3/Typography;->getBodyMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v20

    const/16 v23, 0x0

    const v24, 0xfffa

    const-string v0, "2.0"

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x6

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    :cond_2
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 25
    .param p0, "$cs"    # Landroidx/compose/material3/ColorScheme;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p1

    move/from16 v1, p2

    const-string v2, "C39@2075L10,39@2004L93:AboutScreen.kt#2thlc2"

    invoke-static {v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, v1, 0x1

    invoke-interface {v0, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    const-string v3, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:39)"

    const v4, -0x52e2a2c0

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 40
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/ColorScheme;->getOnSurfaceVariant-0d7_KjU()J

    move-result-wide v2

    sget-object v4, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v5, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material3/Typography;->getBodyMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v20

    const/16 v23, 0x0

    const v24, 0xfffa

    const-string v0, "\u0645\u062d\u0645\u062f \u0627\u0644\u0646\u062c\u0627\u0631"

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x6

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    :cond_2
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final AboutScreen$lambda$8(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p1, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p2, v0}, Lcom/example/ui/screens/AboutScreenKt;->AboutScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final AppIconBadge(Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .param p0, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p1, "$changed"    # I

    .line 63
    const v0, 0x2ae3b3d2

    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p0    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string p0, "C(AppIconBadge)64@3100L48,63@3051L197:AboutScreen.kt#2thlc2"

    invoke-static {v8, p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, p0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "com.example.ui.screens.AppIconBadge (AboutScreen.kt:62)"

    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 65
    :cond_1
    sget v0, Lcom/example/R$drawable;->ic_about:I

    invoke-static {v0, v8, p0}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v1

    .line 66
    nop

    .line 67
    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p0, Landroidx/compose/ui/Modifier;

    const/16 v0, 0x54

    .local v0, "$this$dp\\1":I
    const/4 v2, 0x0

    .line 80
    .local v2, "$i$f$getDp\\1\\67":I
    int-to-float v3, v0

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 67
    .end local v0    # "$this$dp\\1":I
    .end local v2    # "$i$f$getDp\\1\\67":I
    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0}, Lcom/example/ui/screens/AboutScreenKt;->androidx_clip22(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 64
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x30

    const/16 v10, 0x78

    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 62
    :cond_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 69
    :cond_3
    :goto_1
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda6;

    invoke-direct {v0, p1}, Lcom/example/ui/screens/AboutScreenKt$$ExternalSyntheticLambda6;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method static final AppIconBadge$lambda$9(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p0, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p1, v0}, Lcom/example/ui/screens/AboutScreenKt;->AppIconBadge(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final androidx_clip22(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 4
    .param p0, "$this$androidx_clip22"    # Landroidx/compose/ui/Modifier;

    .line 72
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0x16

    .local v1, "$this$dp\\1":I
    const/4 v2, 0x0

    .line 81
    .local v2, "$i$f$getDp\\1\\72":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 72
    .end local v1    # "$this$dp\\1":I
    .end local v2    # "$i$f$getDp\\1\\72":I
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Shape;

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method
