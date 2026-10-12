.class public final Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/HomeScreenKt;->dhikrCards(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/example/data/Tag;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 HomeScreen.kt\ncom/example/ui/screens/HomeScreenKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n182#2,4:434\n186#2:444\n187#2:451\n188#2:458\n189#2:465\n190#2:472\n192#2:480\n1282#3,6:438\n1282#3,6:445\n1282#3,6:452\n1282#3,6:459\n1282#3,6:466\n1282#3,6:474\n1#4:473\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\ncom/example/ui/screens/HomeScreenKt\n*L\n185#1:438,6\n186#1:445,6\n187#1:452,6\n188#1:459,6\n189#1:466,6\n190#1:474,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $items:Ljava/util/List;

.field final synthetic $onClickTimes$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onDelete$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onEdit$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onSelectTag$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onToggleEnabled$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onToggleFavorite$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $selectedTag$inlined:Lcom/example/data/Tag;

.field final synthetic $tagsMap$inlined:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/example/data/Tag;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$tagsMap$inlined:Ljava/util/Map;

    iput-object p3, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onToggleEnabled$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onClickTimes$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onEdit$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onDelete$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onSelectTag$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$selectedTag$inlined:Lcom/example/data/Tag;

    const/4 p2, 0x4

    invoke-direct {p0, p2}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;
    .param p4, "p4"    # Ljava/lang/Object;

    .line 152
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move-object v2, p3

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object v3, p4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 24
    .param p1, "$this$items"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p2, "it"    # I
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "C152@7074L22:LazyDsl.kt#428nma"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p4

    .local v3, "$dirty":I
    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p1

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move-object/from16 v4, p1

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    .line 153
    :cond_3
    and-int/lit16 v5, v3, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_5

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v19, v3

    goto/16 :goto_11

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v7, -0x25b7f321

    invoke-static {v7, v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object v5, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    and-int/lit8 v6, v3, 0xe

    .local v6, "$changed\\1":I
    move-object v7, v5

    check-cast v7, Lcom/example/data/Dhikr;

    .local v7, "dhikr\\1":Lcom/example/data/Dhikr;
    move-object/from16 v5, p1

    .local v5, "$this$dhikrCards_u24lambda_u2459\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    move-object/from16 v15, p3

    .local v15, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 434
    .local v18, "$i$a$-items$default-HomeScreenKt$dhikrCards$2\\1\\153\\0":I
    const v8, -0x75bd9ca7

    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "CN(dhikr)*184@6892L26,185@6951L27,186@7007L23,187@7058L17,188@7105L19,181@6767L489:HomeScreen.kt#2thlc2"

    invoke-static {v15, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 435
    nop

    .line 436
    iget-object v8, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$tagsMap$inlined:Ljava/util/Map;

    invoke-virtual {v7}, Lcom/example/data/Dhikr;->getId()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-nez v8, :cond_7

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    .line 437
    :cond_7
    const v9, -0x6f271845

    const-string v10, "CC(remember):HomeScreen.kt#9igjgp"

    invoke-static {v15, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v9, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onToggleEnabled$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    .local v9, "invalid\\2":Z
    move-object v11, v15

    .local v11, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 438
    .local v12, "$i$f$cache\\2\\437":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it\\2":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 439
    .local v14, "$i$a$-let-ComposerKt$cache$1\\3\\438\\2":I
    if-nez v9, :cond_9

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_8

    goto :goto_4

    .line 443
    :cond_8
    goto :goto_5

    .line 440
    :cond_9
    :goto_4
    const/4 v1, 0x0

    .line 437
    .local v1, "$i$a$-cache-HomeScreenKt$dhikrCards$2$1\\4\\440\\1":I
    move/from16 v16, v1

    .end local v1    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$1\\4\\440\\1":I
    .local v16, "$i$a$-cache-HomeScreenKt$dhikrCards$2$1\\4\\440\\1":I
    new-instance v1, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$1$1;

    iget-object v2, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onToggleEnabled$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2, v7}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 440
    .end local v16    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$1\\4\\440\\1":I
    nop

    .line 441
    .local v1, "value\\3":Ljava/lang/Object;
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 442
    move-object v13, v1

    .line 438
    .end local v1    # "value\\3":Ljava/lang/Object;
    .end local v13    # "it\\2":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1\\3\\438\\2":I
    :goto_5
    nop

    .line 437
    .end local v9    # "invalid\\2":Z
    .end local v11    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache\\2\\437":I
    move-object v9, v13

    check-cast v9, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 444
    const v1, -0x6f2710e4

    invoke-static {v15, v1, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid\\5":Z
    move-object v2, v15

    .local v2, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 445
    .local v11, "$i$f$cache\\5\\444":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it\\5":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 446
    .local v13, "$i$a$-let-ComposerKt$cache$1\\6\\445\\5":I
    if-nez v1, :cond_b

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_a

    goto :goto_6

    .line 450
    :cond_a
    move/from16 v16, v1

    move/from16 v19, v3

    goto :goto_7

    .line 447
    :cond_b
    :goto_6
    const/4 v14, 0x0

    .line 444
    .local v14, "$i$a$-cache-HomeScreenKt$dhikrCards$2$2\\7\\447\\1":I
    move/from16 v16, v1

    .end local v1    # "invalid\\5":Z
    .local v16, "invalid\\5":Z
    new-instance v1, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$2$1;

    move/from16 v19, v3

    .end local v3    # "$dirty":I
    .local v19, "$dirty":I
    iget-object v3, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3, v7}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$2$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 447
    .end local v14    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$2\\7\\447\\1":I
    nop

    .line 448
    .local v1, "value\\6":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 449
    move-object v12, v1

    .line 445
    .end local v1    # "value\\6":Ljava/lang/Object;
    .end local v12    # "it\\5":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1\\6\\445\\5":I
    :goto_7
    nop

    .line 444
    .end local v2    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache\\5\\444":I
    .end local v16    # "invalid\\5":Z
    check-cast v12, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 451
    const v1, -0x6f2709e8

    invoke-static {v15, v1, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onClickTimes$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid\\8":Z
    move-object v2, v15

    .local v2, "$this$cache\\8":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 452
    .local v3, "$i$f$cache\\8\\451":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it\\8":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 453
    .local v13, "$i$a$-let-ComposerKt$cache$1\\9\\452\\8":I
    if-nez v1, :cond_d

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v11, v14, :cond_c

    goto :goto_8

    .line 457
    :cond_c
    move/from16 v16, v1

    move/from16 v17, v3

    goto :goto_9

    .line 454
    :cond_d
    :goto_8
    const/4 v14, 0x0

    .line 451
    .local v14, "$i$a$-cache-HomeScreenKt$dhikrCards$2$3\\10\\454\\1":I
    move/from16 v16, v1

    .end local v1    # "invalid\\8":Z
    .local v16, "invalid\\8":Z
    new-instance v1, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$3$1;

    move/from16 v17, v3

    .end local v3    # "$i$f$cache\\8\\451":I
    .local v17, "$i$f$cache\\8\\451":I
    iget-object v3, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onClickTimes$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3, v7}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$3$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 454
    .end local v14    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$3\\10\\454\\1":I
    nop

    .line 455
    .local v1, "value\\9":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 456
    move-object v11, v1

    .line 452
    .end local v1    # "value\\9":Ljava/lang/Object;
    .end local v11    # "it\\8":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1\\9\\452\\8":I
    :goto_9
    nop

    .line 451
    .end local v2    # "$this$cache\\8":Landroidx/compose/runtime/Composer;
    .end local v16    # "invalid\\8":Z
    .end local v17    # "$i$f$cache\\8\\451":I
    check-cast v11, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 458
    const v1, -0x6f27038e

    invoke-static {v15, v1, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onEdit$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid\\11":Z
    move-object v2, v15

    .local v2, "$this$cache\\11":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 459
    .local v3, "$i$f$cache\\11\\458":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it\\11":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 460
    .local v14, "$i$a$-let-ComposerKt$cache$1\\12\\459\\11":I
    if-nez v1, :cond_f

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v17, v1

    .end local v1    # "invalid\\11":Z
    .local v17, "invalid\\11":Z
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_e

    goto :goto_a

    .line 464
    :cond_e
    move/from16 v20, v3

    goto :goto_b

    .line 460
    .end local v17    # "invalid\\11":Z
    .restart local v1    # "invalid\\11":Z
    :cond_f
    move/from16 v17, v1

    .line 461
    .end local v1    # "invalid\\11":Z
    .restart local v17    # "invalid\\11":Z
    :goto_a
    const/4 v1, 0x0

    .line 458
    .local v1, "$i$a$-cache-HomeScreenKt$dhikrCards$2$4\\13\\461\\1":I
    move/from16 v16, v1

    .end local v1    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$4\\13\\461\\1":I
    .local v16, "$i$a$-cache-HomeScreenKt$dhikrCards$2$4\\13\\461\\1":I
    new-instance v1, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$4$1;

    move/from16 v20, v3

    .end local v3    # "$i$f$cache\\11\\458":I
    .local v20, "$i$f$cache\\11\\458":I
    iget-object v3, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onEdit$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3, v7}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$4$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 461
    .end local v16    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$4\\13\\461\\1":I
    nop

    .line 462
    .local v1, "value\\12":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 463
    move-object v13, v1

    .line 459
    .end local v1    # "value\\12":Ljava/lang/Object;
    .end local v13    # "it\\11":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1\\12\\459\\11":I
    :goto_b
    nop

    .line 458
    .end local v2    # "$this$cache\\11":Landroidx/compose/runtime/Composer;
    .end local v17    # "invalid\\11":Z
    .end local v20    # "$i$f$cache\\11\\458":I
    check-cast v13, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 465
    const v1, -0x6f26fdac

    invoke-static {v15, v1, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onDelete$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid\\14":Z
    move-object v2, v15

    .local v2, "$this$cache\\14":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 466
    .local v3, "$i$f$cache\\14\\465":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it\\14":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 467
    .local v16, "$i$a$-let-ComposerKt$cache$1\\15\\466\\14":I
    if-nez v1, :cond_11

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v20, v1

    .end local v1    # "invalid\\14":Z
    .local v20, "invalid\\14":Z
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v14, v1, :cond_10

    goto :goto_c

    .line 471
    :cond_10
    move/from16 v21, v3

    goto :goto_d

    .line 467
    .end local v20    # "invalid\\14":Z
    .restart local v1    # "invalid\\14":Z
    :cond_11
    move/from16 v20, v1

    .line 468
    .end local v1    # "invalid\\14":Z
    .restart local v20    # "invalid\\14":Z
    :goto_c
    const/4 v1, 0x0

    .line 465
    .local v1, "$i$a$-cache-HomeScreenKt$dhikrCards$2$5\\16\\468\\1":I
    move/from16 v17, v1

    .end local v1    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$5\\16\\468\\1":I
    .local v17, "$i$a$-cache-HomeScreenKt$dhikrCards$2$5\\16\\468\\1":I
    new-instance v1, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;

    move/from16 v21, v3

    .end local v3    # "$i$f$cache\\14\\465":I
    .local v21, "$i$f$cache\\14\\465":I
    iget-object v3, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onDelete$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3, v7}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$5$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 468
    .end local v17    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$5\\16\\468\\1":I
    nop

    .line 469
    .local v1, "value\\15":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 470
    move-object v14, v1

    .line 466
    .end local v1    # "value\\15":Ljava/lang/Object;
    .end local v14    # "it\\14":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\15\\466\\14":I
    :goto_d
    nop

    .line 465
    .end local v2    # "$this$cache\\14":Landroidx/compose/runtime/Composer;
    .end local v20    # "invalid\\14":Z
    .end local v21    # "$i$f$cache\\14\\465":I
    check-cast v14, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 472
    iget-object v1, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onSelectTag$inlined:Lkotlin/jvm/functions/Function1;

    if-nez v1, :cond_12

    const v1, -0x75b7cb92

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v1, 0x0

    goto :goto_10

    :cond_12
    const v1, -0x75b7cb91

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "*189@7175L69"

    invoke-static {v15, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$onSelectTag$inlined:Lkotlin/jvm/functions/Function1;

    .line 473
    nop

    .local v1, "f\\17":Lkotlin/jvm/functions/Function1;
    const/4 v2, 0x0

    .line 472
    .local v2, "$i$a$-let-HomeScreenKt$dhikrCards$2$6\\17\\472\\1":I
    const v3, 0x7fa489bb

    invoke-static {v15, v3, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    iget-object v10, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$selectedTag$inlined:Lcom/example/data/Tag;

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v3, v10

    .local v3, "invalid\\18":Z
    move-object v10, v15

    .local v10, "$this$cache\\18":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 474
    .local v16, "$i$f$cache\\18\\472":I
    move/from16 v17, v2

    .end local v2    # "$i$a$-let-HomeScreenKt$dhikrCards$2$6\\17\\472\\1":I
    .local v17, "$i$a$-let-HomeScreenKt$dhikrCards$2$6\\17\\472\\1":I
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "it\\18":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 475
    .local v20, "$i$a$-let-ComposerKt$cache$1\\19\\474\\18":I
    if-nez v3, :cond_14

    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v22, v3

    .end local v3    # "invalid\\18":Z
    .local v22, "invalid\\18":Z
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_13

    goto :goto_e

    .line 479
    :cond_13
    goto :goto_f

    .line 475
    .end local v22    # "invalid\\18":Z
    .restart local v3    # "invalid\\18":Z
    :cond_14
    move/from16 v22, v3

    .line 476
    .end local v3    # "invalid\\18":Z
    .restart local v22    # "invalid\\18":Z
    :goto_e
    const/4 v3, 0x0

    .line 472
    .local v3, "$i$a$-cache-HomeScreenKt$dhikrCards$2$6$1\\20\\476\\17":I
    move-object/from16 v21, v2

    .end local v2    # "it\\18":Ljava/lang/Object;
    .local v21, "it\\18":Ljava/lang/Object;
    new-instance v2, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;

    move/from16 v23, v3

    .end local v3    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$6$1\\20\\476\\17":I
    .local v23, "$i$a$-cache-HomeScreenKt$dhikrCards$2$6$1\\20\\476\\17":I
    iget-object v3, v0, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$$inlined$items$default$4;->$selectedTag$inlined:Lcom/example/data/Tag;

    invoke-direct {v2, v1, v3}, Lcom/example/ui/screens/HomeScreenKt$dhikrCards$2$6$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Tag;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 476
    .end local v23    # "$i$a$-cache-HomeScreenKt$dhikrCards$2$6$1\\20\\476\\17":I
    nop

    .line 477
    .local v2, "value\\19":Ljava/lang/Object;
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 478
    nop

    .line 474
    .end local v2    # "value\\19":Ljava/lang/Object;
    .end local v20    # "$i$a$-let-ComposerKt$cache$1\\19\\474\\18":I
    .end local v21    # "it\\18":Ljava/lang/Object;
    :goto_f
    nop

    .line 472
    .end local v10    # "$this$cache\\18":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache\\18\\472":I
    .end local v22    # "invalid\\18":Z
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v1    # "f\\17":Lkotlin/jvm/functions/Function1;
    .end local v17    # "$i$a$-let-HomeScreenKt$dhikrCards$2$6\\17\\472\\1":I
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v1, v2

    :goto_10
    shr-int/lit8 v2, v6, 0x3

    and-int/lit8 v16, v2, 0xe

    .line 434
    const/16 v17, 0x0

    move-object v10, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v1

    invoke-static/range {v7 .. v17}, Lcom/example/ui/screens/HomeScreenKt;->DhikrItemCard(Lcom/example/data/Dhikr;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 480
    nop

    .line 153
    .end local v5    # "$this$dhikrCards_u24lambda_u2459\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .end local v6    # "$changed\\1":I
    .end local v7    # "dhikr\\1":Lcom/example/data/Dhikr;
    .end local v15    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$a$-items$default-HomeScreenKt$dhikrCards$2\\1\\153\\0":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 154
    :cond_15
    :goto_11
    return-void
.end method
