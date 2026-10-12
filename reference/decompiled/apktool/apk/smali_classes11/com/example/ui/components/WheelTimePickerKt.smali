.class public final Lcom/example/ui/components/WheelTimePickerKt;
.super Ljava/lang/Object;
.source "WheelTimePicker.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWheelTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WheelTimePicker.kt\ncom/example/ui/components/WheelTimePickerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,161:1\n1563#2:162\n1634#2,3:163\n1563#2:166\n1634#2,3:167\n1282#3,6:170\n1282#3,6:176\n1282#3,6:182\n1282#3,6:188\n1282#3,6:227\n1282#3,6:235\n1282#3,6:243\n1282#3,6:255\n1282#3,6:261\n1282#3,6:267\n1282#3,6:310\n113#4:194\n113#4:233\n113#4:234\n113#4:241\n113#4:242\n113#4:249\n113#4:254\n99#5,3:195\n102#5:226\n106#5:253\n79#6,6:198\n86#6,4:213\n90#6,2:223\n94#6:252\n79#6,6:280\n86#6,4:295\n90#6,2:305\n94#6:318\n79#6,6:336\n86#6,4:351\n90#6,2:361\n94#6:367\n368#7,9:204\n377#7:225\n378#7,2:250\n368#7,9:286\n377#7:307\n378#7,2:316\n368#7,9:342\n377#7:363\n378#7,2:365\n4034#8,6:217\n4034#8,6:299\n4034#8,6:355\n68#9:273\n68#9:309\n71#10:274\n69#10,5:275\n74#10:308\n78#10:319\n71#10:330\n69#10,5:331\n74#10:364\n78#10:368\n85#11:320\n117#11,2:321\n85#11:323\n117#11,2:324\n85#11:326\n117#11,2:327\n85#11:329\n*S KotlinDebug\n*F\n+ 1 WheelTimePicker.kt\ncom/example/ui/components/WheelTimePickerKt\n*L\n33#1:162\n33#1:163,3\n34#1:166\n34#1:167,3\n37#1:170,6\n38#1:176,6\n39#1:182,6\n41#1:188,6\n64#1:227,6\n81#1:235,6\n91#1:243,6\n108#1:255,6\n115#1:261,6\n122#1:267,6\n137#1:310,6\n56#1:194\n65#1:233\n74#1:234\n82#1:241\n85#1:242\n92#1:249\n105#1:254\n53#1:195,3\n53#1:226\n53#1:253\n53#1:198,6\n53#1:213,4\n53#1:223,2\n53#1:252\n126#1:280,6\n126#1:295,4\n126#1:305,2\n126#1:318\n143#1:336,6\n143#1:351,4\n143#1:361,2\n143#1:367\n53#1:204,9\n53#1:225\n53#1:250,2\n126#1:286,9\n126#1:307\n126#1:316,2\n143#1:342,9\n143#1:363\n143#1:365,2\n53#1:217,6\n126#1:299,6\n143#1:355,6\n127#1:273\n136#1:309\n126#1:274\n126#1:275,5\n126#1:308\n126#1:319\n143#1:330\n143#1:331,5\n143#1:364\n143#1:368\n37#1:320\n37#1:321,2\n38#1:323\n38#1:324,2\n39#1:326\n39#1:327,2\n115#1:329\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000326\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00020\u00010\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u0007\u00a2\u0006\u0002\u0010\r\u001aW\u0010\u000e\u001a\u00020\u00012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00142\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a\u00b2\u0006\n\u0010\u001b\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001e\u001a\u00020\u0003X\u008a\u0084\u0002"
    }
    d2 = {
        "WheelTimePicker",
        "",
        "initialHour24",
        "",
        "initialMinute",
        "onTimeSelected",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "hour24",
        "minute",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(IILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "WheelPickerColumn",
        "items",
        "",
        "",
        "initialIndex",
        "onSelectedIndexChanged",
        "Lkotlin/Function1;",
        "visibleItemsCount",
        "itemHeight",
        "Landroidx/compose/ui/unit/Dp;",
        "WheelPickerColumn-HYR8e34",
        "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V",
        "app",
        "selectedHour12Index",
        "selectedMinuteIndex",
        "selectedAmPmIndex",
        "selectedIndex"
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
.method private static final WheelPickerColumn-HYR8e34(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V
    .locals 46
    .param p0, "items"    # Ljava/util/List;
    .param p1, "initialIndex"    # I
    .param p2, "onSelectedIndexChanged"    # Lkotlin/jvm/functions/Function1;
    .param p3, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p4, "visibleItemsCount"    # I
    .param p5, "itemHeight"    # F
    .param p6, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p7, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "IF",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 106
    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p7

    const v0, 0x20ce9188

    move-object/from16 v4, p6

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .end local p6    # "$composer":Landroidx/compose/runtime/Composer;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    const-string v4, "C(WheelPickerColumn)N(items,initialIndex,onSelectedIndexChanged,modifier,visibleItemsCount,itemHeight:c#ui.unit.Dp)107@3431L116,111@3568L68,112@3665L52,114@3744L169,121@3949L53,121@3919L83,125@4008L1327:WheelTimePicker.kt#qonjpd"

    invoke-static {v9, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v4, p7

    .local v4, "$dirty":I
    and-int/lit8 v5, v7, 0x6

    if-nez v5, :cond_1

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v4, v5

    :cond_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_1

    :cond_2
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_5

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_2

    :cond_4
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, p8, 0x8

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0xc00

    move-object/from16 v11, p3

    goto :goto_4

    :cond_6
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x800

    goto :goto_3

    :cond_7
    const/16 v12, 0x400

    :goto_3
    or-int/2addr v4, v12

    goto :goto_4

    :cond_8
    move-object/from16 v11, p3

    :goto_4
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_9

    or-int/lit16 v4, v4, 0x6000

    move/from16 v13, p4

    goto :goto_6

    :cond_9
    and-int/lit16 v13, v7, 0x6000

    if-nez v13, :cond_b

    move/from16 v13, p4

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x4000

    goto :goto_5

    :cond_a
    const/16 v14, 0x2000

    :goto_5
    or-int/2addr v4, v14

    goto :goto_6

    :cond_b
    move/from16 v13, p4

    :goto_6
    and-int/lit8 v14, p8, 0x20

    const/high16 v16, 0x30000

    if-eqz v14, :cond_c

    or-int v4, v4, v16

    move/from16 v15, p5

    goto :goto_8

    :cond_c
    and-int v16, v7, v16

    if-nez v16, :cond_e

    move/from16 v15, p5

    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v16, 0x10000

    :goto_7
    or-int v4, v4, v16

    goto :goto_8

    :cond_e
    move/from16 v15, p5

    :goto_8
    const v16, 0x12493

    and-int v10, v4, v16

    const v6, 0x12492

    if-eq v10, v6, :cond_f

    const/4 v6, 0x1

    goto :goto_9

    :cond_f
    const/4 v6, 0x0

    :goto_9
    and-int/lit8 v10, v4, 0x1

    invoke-interface {v9, v6, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v6

    if-eqz v6, :cond_23

    if-eqz v5, :cond_10

    .line 103
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v11, v5

    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v11, "modifier":Landroidx/compose/ui/Modifier;
    :cond_10
    if-eqz v12, :cond_11

    .line 104
    const/4 v5, 0x3

    move v13, v5

    .end local p4    # "visibleItemsCount":I
    .local v13, "visibleItemsCount":I
    :cond_11
    if-eqz v14, :cond_12

    .line 105
    const/16 v5, 0x34

    .local v5, "$this$dp\\1":I
    const/4 v6, 0x0

    .line 254
    .local v6, "$i$f$getDp\\1\\105":I
    int-to-float v10, v5

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    move v15, v5

    .end local v5    # "$this$dp\\1":I
    .end local v6    # "$i$f$getDp\\1\\105":I
    .end local p5    # "itemHeight":F
    .local v15, "itemHeight":F
    :cond_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_13

    const/4 v5, -0x1

    const-string v6, "com.example.ui.components.WheelPickerColumn (WheelTimePicker.kt:105)"

    invoke-static {v0, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 107
    :cond_13
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    .line 108
    .local v0, "count":I
    const v5, 0x2770781c

    const-string v6, "CC(remember):WheelTimePicker.kt#9igjgp"

    invoke-static {v9, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v5, v4, 0x70

    const/16 v10, 0x20

    if-ne v5, v10, :cond_14

    const/4 v5, 0x1

    goto :goto_a

    :cond_14
    const/4 v5, 0x0

    .local v5, "invalid\\2":Z
    :goto_a
    move-object v10, v9

    .local v10, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 255
    .local v12, "$i$f$cache\\2\\108":I
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it\\2":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 256
    .local v18, "$i$a$-let-ComposerKt$cache$1\\3\\255\\2":I
    if-nez v5, :cond_16

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v14, v8, :cond_15

    goto :goto_b

    .line 260
    :cond_15
    goto :goto_c

    .line 257
    :cond_16
    :goto_b
    const/4 v8, 0x0

    .line 109
    .local v8, "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$startIndex$1\\4\\257\\0":I
    const v20, 0x3fffffff    # 1.9999999f

    .line 110
    .local v20, "base\\4":I
    rem-int v22, v20, v0

    sub-int v22, v20, v22

    add-int v22, v22, v2

    .end local v8    # "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$startIndex$1\\4\\257\\0":I
    .end local v20    # "base\\4":I
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 257
    nop

    .line 258
    .local v8, "value\\3":Ljava/lang/Object;
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 259
    move-object v14, v8

    .line 255
    .end local v8    # "value\\3":Ljava/lang/Object;
    .end local v14    # "it\\2":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1\\3\\255\\2":I
    :goto_c
    nop

    .line 108
    .end local v5    # "invalid\\2":Z
    .end local v10    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache\\2\\108":I
    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v5

    .local v5, "startIndex":I
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 112
    add-int/lit8 v8, v5, -0x1

    const/4 v10, 0x2

    const/4 v12, 0x0

    invoke-static {v8, v12, v9, v12, v10}, Landroidx/compose/foundation/lazy/LazyListStateKt;->rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;

    move-result-object v8

    .line 113
    .local v8, "listState":Landroidx/compose/foundation/lazy/LazyListState;
    const/4 v14, 0x0

    invoke-static {v8, v14, v9, v12, v10}, Landroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt;->rememberSnapFlingBehavior(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v26

    .line 115
    .local v26, "snapFlingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    const v10, 0x27709f71

    invoke-static {v9, v10, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v10, 0x0

    .local v10, "invalid\\5":Z
    move-object v12, v9

    .local v12, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 261
    .local v16, "$i$f$cache\\5\\115":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it\\5":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 262
    .local v18, "$i$a$-let-ComposerKt$cache$1\\6\\261\\5":I
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v14, v2, :cond_17

    .line 263
    const/4 v2, 0x0

    .line 116
    .local v2, "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$selectedIndex$2\\7\\263\\0":I
    move/from16 p4, v2

    .end local v2    # "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$selectedIndex$2\\7\\263\\0":I
    .local p4, "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$selectedIndex$2\\7\\263\\0":I
    new-instance v2, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda0;

    invoke-direct {v2, v8, v0}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/foundation/lazy/LazyListState;I)V

    invoke-static {v2}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 119
    nop

    .line 263
    .end local p4    # "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$selectedIndex$2\\7\\263\\0":I
    nop

    .line 264
    .local v2, "value\\6":Ljava/lang/Object;
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 265
    move-object v14, v2

    .end local v2    # "value\\6":Ljava/lang/Object;
    goto :goto_d

    .line 266
    :cond_17
    nop

    .line 261
    .end local v14    # "it\\5":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1\\6\\261\\5":I
    :goto_d
    nop

    .line 115
    .end local v10    # "invalid\\5":Z
    .end local v12    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache\\5\\115":I
    move-object v2, v14

    check-cast v2, Landroidx/compose/runtime/State;

    .local v2, "selectedIndex$delegate":Landroidx/compose/runtime/State;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 122
    invoke-static {v2}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn_HYR8e34$lambda$23(Landroidx/compose/runtime/State;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const v12, 0x2770b89d

    invoke-static {v9, v12, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v12, v4, 0x380

    const/16 v14, 0x100

    if-ne v12, v14, :cond_18

    const/4 v12, 0x1

    goto :goto_e

    :cond_18
    const/4 v12, 0x0

    .local v12, "invalid\\8":Z
    :goto_e
    move-object v14, v9

    .local v14, "$this$cache\\8":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 267
    .local v16, "$i$f$cache\\8\\122":I
    move/from16 v17, v4

    .end local v4    # "$dirty":I
    .local v17, "$dirty":I
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\8":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 268
    .local v18, "$i$a$-let-ComposerKt$cache$1\\9\\267\\8":I
    if-nez v12, :cond_1a

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p4, v5

    .end local v5    # "startIndex":I
    .local p4, "startIndex":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_19

    goto :goto_f

    .line 272
    :cond_19
    goto :goto_10

    .line 268
    .end local p4    # "startIndex":I
    .restart local v5    # "startIndex":I
    :cond_1a
    move/from16 p4, v5

    .line 269
    .end local v5    # "startIndex":I
    .restart local p4    # "startIndex":I
    :goto_f
    const/4 v5, 0x0

    .line 122
    .local v5, "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$1\\10\\269\\0":I
    move-object/from16 p5, v4

    .end local v4    # "it\\8":Ljava/lang/Object;
    .local p5, "it\\8":Ljava/lang/Object;
    new-instance v4, Lcom/example/ui/components/WheelTimePickerKt$WheelPickerColumn$1$1;

    move/from16 v20, v5

    const/4 v5, 0x0

    .end local v5    # "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$1\\10\\269\\0":I
    .local v20, "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$1\\10\\269\\0":I
    invoke-direct {v4, v3, v2, v5}, Lcom/example/ui/components/WheelTimePickerKt$WheelPickerColumn$1$1;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 269
    .end local v20    # "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$1\\10\\269\\0":I
    nop

    .line 270
    .local v4, "value\\9":Ljava/lang/Object;
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 271
    nop

    .line 267
    .end local v4    # "value\\9":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1\\9\\267\\8":I
    .end local p5    # "it\\8":Ljava/lang/Object;
    :goto_10
    nop

    .line 122
    .end local v12    # "invalid\\8":Z
    .end local v14    # "$this$cache\\8":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache\\8\\122":I
    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v12, 0x0

    invoke-static {v10, v4, v9, v12}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 127
    move v4, v13

    .local v4, "other\\11":I
    move v5, v15

    .local v5, "arg0\\11":F
    const/4 v10, 0x0

    .line 273
    .local v10, "$i$f$times-u2uoSUM\\11\\127":I
    int-to-float v12, v4

    mul-float/2addr v12, v5

    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 127
    .end local v4    # "other\\11":I
    .end local v5    # "arg0\\11":F
    .end local v10    # "$i$f$times-u2uoSUM\\11\\127":I
    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 128
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v5

    .line 126
    nop

    .local v4, "modifier\\12":Landroidx/compose/ui/Modifier;
    .local v5, "contentAlignment\\12":Landroidx/compose/ui/Alignment;
    const/16 v10, 0x30

    .local v10, "$changed\\12":I
    move-object v12, v9

    .local v12, "$composer\\12":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 274
    .local v14, "$i$f$Box\\12\\126":I
    const v3, 0x2bb5b5d7

    const-string v7, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    invoke-static {v12, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 275
    const/4 v3, 0x0

    .line 278
    .local v3, "propagateMinConstraints\\12":Z
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v7

    .local v7, "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v16, v10, 0x3

    and-int/lit8 v16, v16, 0x70

    .line 279
    nop

    .local v16, "$changed\\13":I
    const/16 v18, 0x0

    .line 280
    .local v18, "$i$f$Layout\\13\\279":I
    move/from16 p5, v3

    .end local v3    # "propagateMinConstraints\\12":Z
    .local p5, "propagateMinConstraints\\12":Z
    const v3, -0x4ee9b9da

    move-object/from16 v32, v5

    .end local v5    # "contentAlignment\\12":Landroidx/compose/ui/Alignment;
    .local v32, "contentAlignment\\12":Landroidx/compose/ui/Alignment;
    const-string v5, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v12, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 281
    const/4 v3, 0x0

    invoke-static {v12, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 282
    .local v5, "compositeKeyHash\\13":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v3

    .line 283
    .local v3, "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 v33, v5

    .end local v5    # "compositeKeyHash\\13":I
    .local v33, "compositeKeyHash\\13":I
    invoke-static {v12, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 285
    .local v5, "materialized\\13":Landroidx/compose/ui/Modifier;
    sget-object v20, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v20

    move-object/from16 v34, v4

    .end local v4    # "modifier\\12":Landroidx/compose/ui/Modifier;
    .local v34, "modifier\\12":Landroidx/compose/ui/Modifier;
    shl-int/lit8 v4, v16, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/lit8 v4, v4, 0x6

    .line 284
    nop

    .local v4, "$changed\\14":I
    move-object/from16 v35, v20

    .local v35, "factory\\14":Lkotlin/jvm/functions/Function0;
    const/16 v36, 0x0

    .line 286
    .local v36, "$i$f$ReusableComposeNode\\14\\284":I
    move/from16 v37, v4

    .end local v4    # "$changed\\14":I
    .local v37, "$changed\\14":I
    const v4, -0x2942ffcf

    move-object/from16 v20, v8

    .end local v8    # "listState":Landroidx/compose/foundation/lazy/LazyListState;
    .local v20, "listState":Landroidx/compose/foundation/lazy/LazyListState;
    const-string v8, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v12, v4, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 287
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v4

    instance-of v4, v4, Landroidx/compose/runtime/Applier;

    if-nez v4, :cond_1b

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 288
    :cond_1b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 289
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 290
    move-object/from16 v4, v35

    .end local v35    # "factory\\14":Lkotlin/jvm/functions/Function0;
    .local v4, "factory\\14":Lkotlin/jvm/functions/Function0;
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_11

    .line 292
    .end local v4    # "factory\\14":Lkotlin/jvm/functions/Function0;
    .restart local v35    # "factory\\14":Lkotlin/jvm/functions/Function0;
    :cond_1c
    move-object/from16 v4, v35

    .end local v35    # "factory\\14":Lkotlin/jvm/functions/Function0;
    .restart local v4    # "factory\\14":Lkotlin/jvm/functions/Function0;
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 294
    :goto_11
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .local v8, "$this$Layout_u24lambda_u240\\15":Landroidx/compose/runtime/Composer;
    const/16 v22, 0x0

    .line 295
    .local v22, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\15\\294\\13":I
    sget-object v23, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v35, v4

    .end local v4    # "factory\\14":Lkotlin/jvm/functions/Function0;
    .restart local v35    # "factory\\14":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 296
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 298
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .local v4, "block\\16":Lkotlin/jvm/functions/Function2;
    const/16 v23, 0x0

    .line 299
    .local v23, "$i$f$set-impl\\16\\298":I
    move-object/from16 v24, v8

    .local v24, "$this$set_impl_u24lambda_u240\\16":Landroidx/compose/runtime/Composer;
    const/16 v25, 0x0

    .line 300
    .local v25, "$i$a$-with-Updater$set$1\\17\\299\\16":I
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v27

    if-nez v27, :cond_1e

    move-object/from16 v38, v3

    .end local v3    # "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    .local v38, "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v39, v7

    .end local v7    # "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v39, "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    goto :goto_12

    :cond_1d
    move-object/from16 v7, v24

    goto :goto_13

    .end local v38    # "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v39    # "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v3    # "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v7    # "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    :cond_1e
    move-object/from16 v38, v3

    move-object/from16 v39, v7

    .line 301
    .end local v3    # "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v7    # "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v38    # "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v39    # "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    :goto_12
    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v7, v24

    .end local v24    # "$this$set_impl_u24lambda_u240\\16":Landroidx/compose/runtime/Composer;
    .local v7, "$this$set_impl_u24lambda_u240\\16":Landroidx/compose/runtime/Composer;
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 302
    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v8, v3, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 304
    :goto_13
    nop

    .line 299
    .end local v7    # "$this$set_impl_u24lambda_u240\\16":Landroidx/compose/runtime/Composer;
    .end local v25    # "$i$a$-with-Updater$set$1\\17\\299\\16":I
    nop

    .line 304
    nop

    .line 305
    .end local v4    # "block\\16":Lkotlin/jvm/functions/Function2;
    .end local v23    # "$i$f$set-impl\\16\\298":I
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 306
    nop

    .line 294
    .end local v8    # "$this$Layout_u24lambda_u240\\15":Landroidx/compose/runtime/Composer;
    .end local v22    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\15\\294\\13":I
    nop

    .line 307
    shr-int/lit8 v3, v37, 0x6

    and-int/lit8 v3, v3, 0xe

    .local v3, "$changed\\18":I
    move-object v4, v12

    .local v4, "$composer\\18":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 308
    .local v7, "$i$a$-Layout-BoxKt$Box$1\\18\\307\\12":I
    const v8, -0x7ff519f7    # -1.000876E-39f

    move/from16 v40, v3

    .end local v3    # "$changed\\18":I
    .local v40, "$changed\\18":I
    const-string v3, "C73@3429L9:Box.kt#2w3rfo"

    invoke-static {v4, v8, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    shr-int/lit8 v8, v10, 0x6

    and-int/lit8 v8, v8, 0x70

    or-int/lit8 v8, v8, 0x6

    .local v8, "$changed\\19":I
    check-cast v3, Landroidx/compose/foundation/layout/BoxScope;

    .local v3, "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429\\19":Landroidx/compose/foundation/layout/BoxScope;
    move-object/from16 v29, v4

    .local v29, "$composer\\19":Landroidx/compose/runtime/Composer;
    const/16 v41, 0x0

    .line 130
    .local v41, "$i$a$-Box-WheelTimePickerKt$WheelPickerColumn$2\\19\\308\\0":I
    move-object/from16 v42, v3

    .end local v3    # "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429\\19":Landroidx/compose/foundation/layout/BoxScope;
    .local v42, "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429\\19":Landroidx/compose/foundation/layout/BoxScope;
    const v3, -0x732aff2f

    move-object/from16 v43, v4

    .end local v4    # "$composer\\18":Landroidx/compose/runtime/Composer;
    .local v43, "$composer\\18":Landroidx/compose/runtime/Composer;
    const-string v4, "C136@4425L904,129@4141L1188:WheelTimePicker.kt#qonjpd"

    move-object/from16 v44, v5

    move-object/from16 v5, v29

    .end local v29    # "$composer\\19":Landroidx/compose/runtime/Composer;
    .local v5, "$composer\\19":Landroidx/compose/runtime/Composer;
    .local v44, "materialized\\13":Landroidx/compose/ui/Modifier;
    invoke-static {v5, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 133
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v25

    .line 134
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 135
    const/4 v4, 0x0

    move/from16 v45, v7

    move/from16 p3, v8

    const/4 v7, 0x0

    const/4 v8, 0x1

    .end local v7    # "$i$a$-Layout-BoxKt$Box$1\\18\\307\\12":I
    .end local v8    # "$changed\\19":I
    .local v45, "$i$a$-Layout-BoxKt$Box$1\\18\\307\\12":I
    .local p3, "$changed\\19":I
    invoke-static {v3, v4, v8, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 136
    move v4, v13

    .local v4, "other\\20":I
    move v7, v15

    .local v7, "arg0\\20":F
    const/16 v19, 0x0

    .line 309
    .local v19, "$i$f$times-u2uoSUM\\20\\136":I
    int-to-float v8, v4

    mul-float/2addr v8, v7

    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 136
    .end local v4    # "other\\20":I
    .end local v7    # "arg0\\20":F
    .end local v19    # "$i$f$times-u2uoSUM\\20\\136":I
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 131
    nop

    .line 133
    nop

    .line 132
    nop

    .line 137
    const v4, -0x24bf302a

    invoke-static {v5, v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    const/high16 v6, 0x70000

    and-int v6, v17, v6

    const/high16 v7, 0x20000

    if-ne v6, v7, :cond_1f

    const/4 v8, 0x1

    goto :goto_14

    :cond_1f
    const/4 v8, 0x0

    :goto_14
    or-int/2addr v4, v8

    .local v4, "invalid\\21":Z
    move-object v6, v5

    .local v6, "$this$cache\\21":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 310
    .local v7, "$i$f$cache\\21\\137":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it\\21":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 311
    .local v19, "$i$a$-let-ComposerKt$cache$1\\22\\310\\21":I
    if-nez v4, :cond_21

    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p6, v3

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_20

    goto :goto_15

    .line 315
    :cond_20
    goto :goto_16

    .line 311
    :cond_21
    move-object/from16 p6, v3

    .line 312
    :goto_15
    const/4 v3, 0x0

    .line 137
    .local v3, "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$2$1\\23\\312\\19":I
    move/from16 v21, v3

    .end local v3    # "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$2$1\\23\\312\\19":I
    .local v21, "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$2$1\\23\\312\\19":I
    new-instance v3, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;

    invoke-direct {v3, v0, v1, v15, v2}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda1;-><init>(ILjava/util/List;FLandroidx/compose/runtime/State;)V

    .line 312
    .end local v21    # "$i$a$-cache-WheelTimePickerKt$WheelPickerColumn$2$1\\23\\312\\19":I
    nop

    .line 313
    .local v3, "value\\22":Ljava/lang/Object;
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 314
    move-object v8, v3

    .line 310
    .end local v3    # "value\\22":Ljava/lang/Object;
    .end local v8    # "it\\21":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1\\22\\310\\21":I
    :goto_16
    nop

    .line 137
    .end local v4    # "invalid\\21":Z
    .end local v6    # "$this$cache\\21":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache\\21\\137":I
    move-object/from16 v28, v8

    check-cast v28, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 130
    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/high16 v30, 0x30000

    const/16 v31, 0x9c

    move-object/from16 v29, v5

    move-object/from16 v21, v20

    move-object/from16 v20, p6

    .end local v5    # "$composer\\19":Landroidx/compose/runtime/Composer;
    .end local v20    # "listState":Landroidx/compose/foundation/lazy/LazyListState;
    .local v21, "listState":Landroidx/compose/foundation/lazy/LazyListState;
    .restart local v29    # "$composer\\19":Landroidx/compose/runtime/Composer;
    invoke-static/range {v20 .. v31}, Landroidx/compose/foundation/lazy/LazyDslKt;->LazyColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v20, v21

    .end local v21    # "listState":Landroidx/compose/foundation/lazy/LazyListState;
    .restart local v20    # "listState":Landroidx/compose/foundation/lazy/LazyListState;
    invoke-static/range {v29 .. v29}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 159
    nop

    .line 308
    .end local v29    # "$composer\\19":Landroidx/compose/runtime/Composer;
    .end local v41    # "$i$a$-Box-WheelTimePickerKt$WheelPickerColumn$2\\19\\308\\0":I
    .end local v42    # "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429\\19":Landroidx/compose/foundation/layout/BoxScope;
    .end local p3    # "$changed\\19":I
    invoke-static/range {v43 .. v43}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 307
    .end local v40    # "$changed\\18":I
    .end local v43    # "$composer\\18":Landroidx/compose/runtime/Composer;
    .end local v45    # "$i$a$-Layout-BoxKt$Box$1\\18\\307\\12":I
    nop

    .line 316
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 286
    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 317
    nop

    .line 280
    .end local v35    # "factory\\14":Lkotlin/jvm/functions/Function0;
    .end local v36    # "$i$f$ReusableComposeNode\\14\\284":I
    .end local v37    # "$changed\\14":I
    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 318
    nop

    .line 274
    .end local v16    # "$changed\\13":I
    .end local v18    # "$i$f$Layout\\13\\279":I
    .end local v33    # "compositeKeyHash\\13":I
    .end local v38    # "localMap\\13":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v44    # "materialized\\13":Landroidx/compose/ui/Modifier;
    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 319
    nop

    .end local v10    # "$changed\\12":I
    .end local v12    # "$composer\\12":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$Box\\12\\126":I
    .end local v32    # "contentAlignment\\12":Landroidx/compose/ui/Alignment;
    .end local v34    # "modifier\\12":Landroidx/compose/ui/Modifier;
    .end local v39    # "measurePolicy\\12":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local p5    # "propagateMinConstraints\\12":Z
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 160
    .end local v0    # "count":I
    .end local v2    # "selectedIndex$delegate":Landroidx/compose/runtime/State;
    .end local v20    # "listState":Landroidx/compose/foundation/lazy/LazyListState;
    .end local v26    # "snapFlingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local p4    # "startIndex":I
    :cond_22
    move-object v4, v11

    move v5, v13

    move v6, v15

    goto :goto_17

    .line 97
    .end local v11    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v13    # "visibleItemsCount":I
    .end local v15    # "itemHeight":F
    .end local v17    # "$dirty":I
    .local v4, "$dirty":I
    .local p3, "modifier":Landroidx/compose/ui/Modifier;
    .local p4, "visibleItemsCount":I
    .local p5, "itemHeight":F
    :cond_23
    move/from16 v17, v4

    .end local v4    # "$dirty":I
    .restart local v17    # "$dirty":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, v11

    move v5, v13

    move v6, v15

    .line 160
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p4    # "visibleItemsCount":I
    .end local p5    # "itemHeight":F
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "visibleItemsCount":I
    .local v6, "itemHeight":F
    :goto_17
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_24

    new-instance v0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda2;-><init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFII)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_24
    return-void
.end method

.method static final WheelPickerColumn_HYR8e34$lambda$22$lambda$21(Landroidx/compose/foundation/lazy/LazyListState;I)I
    .locals 2
    .param p0, "$listState"    # Landroidx/compose/foundation/lazy/LazyListState;
    .param p1, "$count"    # I

    .line 117
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 118
    .local v0, "centerIndex":I
    rem-int v1, v0, p1

    add-int/2addr v1, p1

    rem-int/2addr v1, p1

    return v1
.end method

.method private static final WheelPickerColumn_HYR8e34$lambda$23(Landroidx/compose/runtime/State;)I
    .locals 4
    .param p0, "$selectedIndex$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 115
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 329
    .local v3, "$i$f$getValue\\1\\115":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\115":I
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 115
    return v0
.end method

.method static final WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27(ILjava/util/List;FLandroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;
    .locals 8
    .param p0, "$count"    # I
    .param p1, "$items"    # Ljava/util/List;
    .param p2, "$itemHeight"    # F
    .param p3, "$selectedIndex$delegate"    # Landroidx/compose/runtime/State;
    .param p4, "$this$LazyColumn"    # Landroidx/compose/foundation/lazy/LazyListScope;

    const-string v0, "$this$LazyColumn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    new-instance v0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda7;-><init>(ILjava/util/List;FLandroidx/compose/runtime/State;)V

    const v1, 0x5e2ddc6b

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function4;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p4

    .end local p4    # "$this$LazyColumn":Landroidx/compose/foundation/lazy/LazyListScope;
    .local v1, "$this$LazyColumn":Landroidx/compose/foundation/lazy/LazyListScope;
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->items$default(Landroidx/compose/foundation/lazy/LazyListScope;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 158
    sget-object p4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p4
.end method

.method static final WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27$lambda$26(ILjava/util/List;FLandroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 53
    .param p0, "$count"    # I
    .param p1, "$items"    # Ljava/util/List;
    .param p2, "$itemHeight"    # F
    .param p3, "$selectedIndex$delegate"    # Landroidx/compose/runtime/State;
    .param p4, "$this$items"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p5, "index"    # I
    .param p6, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p7, "$changed"    # I

    move/from16 v0, p5

    move-object/from16 v1, p6

    const-string v2, "$this$items"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "CN(index)142@4680L625:WheelTimePicker.kt#qonjpd"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p7

    .local v2, "$dirty":I
    and-int/lit8 v4, p7, 0x30

    if-nez v4, :cond_1

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v4, 0x20

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v2, v4

    :cond_1
    and-int/lit16 v4, v2, 0x91

    const/16 v6, 0x90

    const/4 v8, 0x1

    if-eq v4, v6, :cond_2

    move v4, v8

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    and-int/lit8 v6, v2, 0x1

    invoke-interface {v1, v4, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, -0x1

    const-string v6, "com.example.ui.components.WheelPickerColumn.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WheelTimePicker.kt:138)"

    const v9, 0x5e2ddc6b

    invoke-static {v9, v2, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 139
    :cond_3
    rem-int v4, v0, p0

    add-int v4, v4, p0

    rem-int v4, v4, p0

    .line 140
    .local v4, "actualIndex":I
    move-object/from16 v6, p1

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .line 141
    .local v10, "itemText":Ljava/lang/String;
    invoke-static/range {p3 .. p3}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn_HYR8e34$lambda$23(Landroidx/compose/runtime/State;)I

    move-result v9

    if-ne v4, v9, :cond_4

    move v9, v8

    goto :goto_2

    :cond_4
    const/4 v9, 0x0

    .line 144
    .local v9, "isSelected":Z
    :goto_2
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v11, Landroidx/compose/ui/Modifier;

    .line 145
    move/from16 v12, p2

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v11

    .line 146
    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v11, v13, v8, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 147
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v11

    .line 143
    move-object/from16 v13, p6

    .local v8, "modifier\\1":Landroidx/compose/ui/Modifier;
    .local v11, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v13, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v14, 0x30

    move/from16 v35, v14

    .local v35, "$changed\\1":I
    const/16 v36, 0x0

    .line 330
    .local v36, "$i$f$Box\\1\\143":I
    const v14, 0x2bb5b5d7

    const-string v15, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    invoke-static {v13, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 331
    const/4 v14, 0x0

    .line 334
    .local v14, "propagateMinConstraints\\1":Z
    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v15

    .local v15, "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v16, v35, 0x3

    and-int/lit8 v16, v16, 0x70

    .line 335
    move/from16 v37, v16

    .local v37, "$changed\\2":I
    const/16 v38, 0x0

    .line 336
    .local v38, "$i$f$Layout\\2\\335":I
    const/16 v16, 0x20

    const v5, -0x4ee9b9da

    const-string v7, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v13, v5, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 337
    const/4 v5, 0x0

    invoke-static {v13, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 338
    .local v5, "compositeKeyHash\\2":I
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v7

    .line 339
    .local v7, "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    move-object/from16 v17, v11

    .end local v11    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v17, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    invoke-static {v13, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    .line 341
    .local v11, "materialized\\2":Landroidx/compose/ui/Modifier;
    sget-object v18, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v18

    shl-int/lit8 v0, v37, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    .line 340
    nop

    .local v0, "$changed\\3":I
    move-object/from16 v39, v18

    .local v39, "factory\\3":Lkotlin/jvm/functions/Function0;
    const/16 v40, 0x0

    .line 342
    .local v40, "$i$f$ReusableComposeNode\\3\\340":I
    move/from16 v41, v0

    .end local v0    # "$changed\\3":I
    .local v41, "$changed\\3":I
    const v0, -0x2942ffcf

    const-string v1, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v13, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 343
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 344
    :cond_5
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 345
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 346
    move-object/from16 v0, v39

    .end local v39    # "factory\\3":Lkotlin/jvm/functions/Function0;
    .local v0, "factory\\3":Lkotlin/jvm/functions/Function0;
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    .line 348
    .end local v0    # "factory\\3":Lkotlin/jvm/functions/Function0;
    .restart local v39    # "factory\\3":Lkotlin/jvm/functions/Function0;
    :cond_6
    move-object/from16 v0, v39

    .end local v39    # "factory\\3":Lkotlin/jvm/functions/Function0;
    .restart local v0    # "factory\\3":Lkotlin/jvm/functions/Function0;
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 350
    :goto_3
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .local v1, "$this$Layout_u24lambda_u240\\4":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 351
    .local v18, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\4\\350\\2":I
    sget-object v19, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v39, v0

    .end local v0    # "factory\\3":Lkotlin/jvm/functions/Function0;
    .restart local v39    # "factory\\3":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v15, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 352
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v7, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 354
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block\\5":Lkotlin/jvm/functions/Function2;
    const/16 v19, 0x0

    .line 355
    .local v19, "$i$f$set-impl\\5\\354":I
    move-object/from16 v20, v1

    .local v20, "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 356
    .local v21, "$i$a$-with-Updater$set$1\\6\\355\\5":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v22

    if-nez v22, :cond_8

    move/from16 v42, v2

    .end local v2    # "$dirty":I
    .local v42, "$dirty":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    move-object/from16 v3, v20

    goto :goto_5

    .end local v42    # "$dirty":I
    .restart local v2    # "$dirty":I
    :cond_8
    move/from16 v42, v2

    .line 357
    .end local v2    # "$dirty":I
    .restart local v42    # "$dirty":I
    :goto_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v20

    .end local v20    # "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 358
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 360
    :goto_5
    nop

    .line 355
    .end local v3    # "$this$set_impl_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$a$-with-Updater$set$1\\6\\355\\5":I
    nop

    .line 360
    nop

    .line 361
    .end local v0    # "block\\5":Lkotlin/jvm/functions/Function2;
    .end local v19    # "$i$f$set-impl\\5\\354":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v11, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 362
    nop

    .line 350
    .end local v1    # "$this$Layout_u24lambda_u240\\4":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\4\\350\\2":I
    nop

    .line 363
    shr-int/lit8 v0, v41, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\7":I
    move-object v1, v13

    .local v1, "$composer\\7":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 364
    .local v2, "$i$a$-Layout-BoxKt$Box$1\\7\\363\\1":I
    const v3, -0x7ff519f7    # -1.000876E-39f

    move/from16 v43, v0

    .end local v0    # "$changed\\7":I
    .local v43, "$changed\\7":I
    const-string v0, "C73@3429L9:Box.kt#2w3rfo"

    invoke-static {v1, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    shr-int/lit8 v3, v35, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    .local v3, "$changed\\8":I
    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    .local v0, "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429_u24lambda_u2428_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425\\8":Landroidx/compose/foundation/layout/BoxScope;
    move-object/from16 v31, v1

    .local v31, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/16 v44, 0x0

    .line 149
    .local v44, "$i$a$-Box-WheelTimePickerKt$WheelPickerColumn$2$1$1$1$1\\8\\364\\0":I
    move-object/from16 v45, v0

    .end local v0    # "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429_u24lambda_u2428_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425\\8":Landroidx/compose/foundation/layout/BoxScope;
    .local v45, "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429_u24lambda_u2428_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425\\8":Landroidx/compose/foundation/layout/BoxScope;
    const v0, -0x4006942b

    move-object/from16 v46, v1

    .end local v1    # "$composer\\7":Landroidx/compose/runtime/Composer;
    .local v46, "$composer\\7":Landroidx/compose/runtime/Composer;
    const-string v1, "C148@4906L381:WheelTimePicker.kt#qonjpd"

    move/from16 v47, v2

    move-object/from16 v2, v31

    .end local v31    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v47, "$i$a$-Layout-BoxKt$Box$1\\7\\363\\1":I
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 151
    if-eqz v9, :cond_9

    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v0

    goto :goto_6

    :cond_9
    const/16 v0, 0x1a

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v0

    .line 152
    :goto_6
    sget-object v16, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    if-eqz v9, :cond_a

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v16

    goto :goto_7

    :cond_a
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v16

    .line 153
    :goto_7
    sget-object v18, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    if-eqz v9, :cond_b

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v18

    goto :goto_8

    :cond_b
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v19

    const/16 v25, 0xe

    const/16 v26, 0x0

    const v21, 0x3eb33333    # 0.35f

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v19 .. v26}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v18

    .line 154
    :goto_8
    sget-object v20, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    move-result v20

    .line 150
    nop

    .line 153
    nop

    .line 151
    nop

    .line 152
    nop

    .line 154
    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    move-result-object v22

    .line 149
    move-object/from16 v20, v11

    .end local v11    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .local v20, "materialized\\2":Landroidx/compose/ui/Modifier;
    const/4 v11, 0x0

    move-object/from16 v21, v17

    move-object/from16 v17, v16

    .end local v17    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v21, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    const/16 v16, 0x0

    move-wide/from16 v50, v18

    move-object/from16 v19, v13

    move-wide/from16 v12, v50

    .end local v13    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v19, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    move-object/from16 v23, v19

    move-object/from16 v24, v20

    .end local v19    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v20    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .local v23, "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v24, "materialized\\2":Landroidx/compose/ui/Modifier;
    const-wide/16 v19, 0x0

    move-object/from16 v25, v21

    .end local v21    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v25, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    const/16 v21, 0x0

    move-object/from16 v26, v23

    move-object/from16 v27, v24

    .end local v23    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v24    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .local v26, "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v27, "materialized\\2":Landroidx/compose/ui/Modifier;
    const-wide/16 v23, 0x0

    move-object/from16 v28, v25

    .end local v25    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v28, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    const/16 v25, 0x0

    move-object/from16 v29, v26

    .end local v26    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v29, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v26, 0x0

    move-object/from16 v30, v27

    .end local v27    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .local v30, "materialized\\2":Landroidx/compose/ui/Modifier;
    const/16 v27, 0x0

    move-object/from16 v31, v28

    .end local v28    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v31, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    const/16 v28, 0x0

    move-object/from16 v32, v29

    .end local v29    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v32, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v29, 0x0

    move-object/from16 v33, v30

    .end local v30    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .local v33, "materialized\\2":Landroidx/compose/ui/Modifier;
    const/16 v30, 0x0

    move-object/from16 v34, v32

    .end local v32    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v34, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v32, 0x0

    move-object/from16 v48, v33

    .end local v33    # "materialized\\2":Landroidx/compose/ui/Modifier;
    .local v48, "materialized\\2":Landroidx/compose/ui/Modifier;
    const/16 v33, 0x0

    move-object/from16 v49, v34

    .end local v34    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v49, "$composer\\1":Landroidx/compose/runtime/Composer;
    const v34, 0x1fdd2

    move-object/from16 v50, v31

    move-object/from16 v31, v2

    move-object v2, v15

    move-wide/from16 v51, v0

    move v1, v14

    move-wide/from16 v14, v51

    move-object/from16 v0, v50

    .end local v14    # "propagateMinConstraints\\1":Z
    .end local v15    # "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v0, "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .local v1, "propagateMinConstraints\\1":Z
    .local v2, "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v31, "$composer\\8":Landroidx/compose/runtime/Composer;
    invoke-static/range {v10 .. v34}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    invoke-static/range {v31 .. v31}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 156
    nop

    .line 364
    .end local v3    # "$changed\\8":I
    .end local v31    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v44    # "$i$a$-Box-WheelTimePickerKt$WheelPickerColumn$2$1$1$1$1\\8\\364\\0":I
    .end local v45    # "$this$WheelPickerColumn_HYR8e34_u24lambda_u2429_u24lambda_u2428_u24lambda_u2427_u24lambda_u2426_u24lambda_u2425\\8":Landroidx/compose/foundation/layout/BoxScope;
    invoke-static/range {v46 .. v46}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 363
    .end local v43    # "$changed\\7":I
    .end local v46    # "$composer\\7":Landroidx/compose/runtime/Composer;
    .end local v47    # "$i$a$-Layout-BoxKt$Box$1\\7\\363\\1":I
    nop

    .line 365
    invoke-interface/range {v49 .. v49}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 342
    invoke-static/range {v49 .. v49}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 366
    nop

    .line 336
    .end local v39    # "factory\\3":Lkotlin/jvm/functions/Function0;
    .end local v40    # "$i$f$ReusableComposeNode\\3\\340":I
    .end local v41    # "$changed\\3":I
    invoke-static/range {v49 .. v49}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 367
    nop

    .line 330
    .end local v5    # "compositeKeyHash\\2":I
    .end local v7    # "localMap\\2":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v37    # "$changed\\2":I
    .end local v38    # "$i$f$Layout\\2\\335":I
    .end local v48    # "materialized\\2":Landroidx/compose/ui/Modifier;
    invoke-static/range {v49 .. v49}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 368
    nop

    .end local v0    # "contentAlignment\\1":Landroidx/compose/ui/Alignment;
    .end local v1    # "propagateMinConstraints\\1":Z
    .end local v2    # "measurePolicy\\1":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v8    # "modifier\\1":Landroidx/compose/ui/Modifier;
    .end local v35    # "$changed\\1":I
    .end local v36    # "$i$f$Box\\1\\143":I
    .end local v49    # "$composer\\1":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v4    # "actualIndex":I
    .end local v9    # "isSelected":Z
    .end local v10    # "itemText":Ljava/lang/String;
    goto :goto_9

    .line 138
    .end local v42    # "$dirty":I
    .local v2, "$dirty":I
    :cond_c
    move-object/from16 v6, p1

    move/from16 v42, v2

    .end local v2    # "$dirty":I
    .restart local v42    # "$dirty":I
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 157
    :cond_d
    :goto_9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final WheelPickerColumn_HYR8e34$lambda$30(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn-HYR8e34(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final WheelTimePicker(IILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 74
    .param p0, "initialHour24"    # I
    .param p1, "initialMinute"    # I
    .param p2, "onTimeSelected"    # Lkotlin/jvm/functions/Function2;
    .param p3, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v0, p5

    const-string v2, "onTimeSelected"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const v2, -0x51f61c44

    move-object/from16 v4, p4

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v4, "C(WheelTimePicker)N(initialHour24,initialMinute,onTimeSelected,modifier)36@1264L46,37@1342L42,38@1414L54,40@1550L300,40@1474L376,52@1856L1250:WheelTimePicker.kt#qonjpd"

    invoke-static {v8, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v4, p5

    .local v4, "$dirty":I
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v4, v5

    :cond_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    move/from16 v11, p1

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_1

    :cond_2
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    goto :goto_2

    :cond_3
    move/from16 v11, p1

    :goto_2
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0xc00

    move-object/from16 v7, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_8

    move-object/from16 v7, p3

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x800

    goto :goto_4

    :cond_7
    const/16 v12, 0x400

    :goto_4
    or-int/2addr v4, v12

    goto :goto_5

    :cond_8
    move-object/from16 v7, p3

    :goto_5
    move v12, v4

    .end local v4    # "$dirty":I
    .local v12, "$dirty":I
    and-int/lit16 v4, v12, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v4, v13, :cond_9

    move v4, v15

    goto :goto_6

    :cond_9
    move v4, v14

    :goto_6
    and-int/lit8 v13, v12, 0x1

    invoke-interface {v8, v4, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v4

    if-eqz v4, :cond_20

    if-eqz v5, :cond_a

    .line 24
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v13, v4

    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_7

    .line 25
    .end local v4    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_a
    move-object v13, v7

    .line 24
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_b

    const/4 v4, -0x1

    const-string v5, "com.example.ui.components.WheelTimePicker (WheelTimePicker.kt:24)"

    invoke-static {v2, v12, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 26
    :cond_b
    nop

    .line 27
    const/16 v2, 0xc

    if-nez v1, :cond_c

    move v4, v2

    goto :goto_8

    .line 28
    :cond_c
    if-le v1, v2, :cond_d

    add-int/lit8 v4, v1, -0xc

    goto :goto_8

    .line 29
    :cond_d
    move v4, v1

    .line 26
    :goto_8
    move/from16 v16, v4

    .line 31
    .local v16, "initialHour12":I
    if-ge v1, v2, :cond_e

    move v4, v15

    goto :goto_9

    :cond_e
    move v4, v14

    :goto_9
    move/from16 v17, v4

    .line 33
    .local v17, "initialIsAm":Z
    new-instance v4, Lkotlin/ranges/IntRange;

    invoke-direct {v4, v15, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    move-object v2, v4

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 162
    .local v4, "$i$f$map\\1\\33":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    const/16 p4, 0x20

    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v5, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\2":Ljava/util/Collection;
    move-object v10, v2

    .local v10, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 163
    .local v18, "$i$f$mapTo\\2\\162":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_a
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_f

    move-object/from16 v20, v19

    check-cast v20, Lkotlin/collections/IntIterator;

    invoke-virtual/range {v20 .. v20}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v20

    .line 164
    .local v20, "item\\2":I
    move/from16 v21, v20

    .local v21, "it\\3":I
    const/16 v22, 0x0

    .line 33
    .local v22, "$i$a$-map-WheelTimePickerKt$WheelTimePicker$hours$1\\3\\164\\0":I
    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 164
    .end local v21    # "it\\3":I
    .end local v22    # "$i$a$-map-WheelTimePickerKt$WheelTimePicker$hours$1\\3\\164\\0":I
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 165
    .end local v20    # "item\\2":I
    :cond_f
    nop

    .end local v5    # "destination\\2":Ljava/util/Collection;
    .end local v10    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v18    # "$i$f$mapTo\\2\\162":I
    check-cast v5, Ljava/util/List;

    .line 162
    nop

    .line 33
    .end local v2    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map\\1\\33":I
    move-object/from16 v24, v5

    .line 34
    .local v24, "hours":Ljava/util/List;
    new-instance v2, Lkotlin/ranges/IntRange;

    const/16 v4, 0x3b

    invoke-direct {v2, v14, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 166
    .local v4, "$i$f$map\\4\\34":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\5":Ljava/util/Collection;
    move-object v6, v2

    .local v6, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 167
    .local v7, "$i$f$mapTo\\5\\166":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_10

    move-object/from16 v18, v10

    check-cast v18, Lkotlin/collections/IntIterator;

    invoke-virtual/range {v18 .. v18}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v18

    .line 168
    .local v18, "item\\5":I
    move/from16 v19, v18

    .local v19, "it\\6":I
    const/16 v20, 0x0

    .line 34
    .local v20, "$i$a$-map-WheelTimePickerKt$WheelTimePicker$minutes$1\\6\\168\\0":I
    sget-object v21, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    move/from16 v22, v14

    new-array v14, v15, [Ljava/lang/Object;

    aput-object v21, v14, v22

    invoke-static {v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    const-string v15, "%02d"

    invoke-static {v15, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "format(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .end local v19    # "it\\6":I
    .end local v20    # "$i$a$-map-WheelTimePickerKt$WheelTimePicker$minutes$1\\6\\168\\0":I
    invoke-interface {v5, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v14, v22

    const/4 v15, 0x1

    goto :goto_b

    .line 169
    .end local v18    # "item\\5":I
    :cond_10
    move/from16 v22, v14

    .end local v5    # "destination\\5":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\5\\166":I
    check-cast v5, Ljava/util/List;

    .line 166
    nop

    .line 34
    .end local v2    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map\\4\\34":I
    move-object v10, v5

    .line 35
    .local v10, "minutes":Ljava/util/List;
    const-string v2, "AM"

    const-string v4, "PM"

    filled-new-array {v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    .line 37
    .local v14, "amPmList":Ljava/util/List;
    const v2, 0x532028aa

    const-string v15, "CC(remember):WheelTimePicker.kt#9igjgp"

    invoke-static {v8, v2, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\7":Z
    move-object v4, v8

    .local v4, "$this$cache\\7":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 170
    .local v5, "$i$f$cache\\7\\37":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\7":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 171
    .local v7, "$i$a$-let-ComposerKt$cache$1\\8\\170\\7":I
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    move/from16 p3, v7

    .end local v7    # "$i$a$-let-ComposerKt$cache$1\\8\\170\\7":I
    .local p3, "$i$a$-let-ComposerKt$cache$1\\8\\170\\7":I
    const/4 v7, 0x0

    if-ne v6, v9, :cond_11

    .line 172
    const/4 v9, 0x0

    .line 37
    .local v9, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$selectedHour12Index$2\\9\\172\\0":I
    add-int/lit8 v18, v16, -0x1

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v7, v1, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 172
    .end local v9    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$selectedHour12Index$2\\9\\172\\0":I
    nop

    .line 173
    .local v0, "value\\8":Ljava/lang/Object;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 174
    move-object v6, v0

    .end local v0    # "value\\8":Ljava/lang/Object;
    goto :goto_c

    .line 175
    :cond_11
    nop

    .line 170
    .end local v6    # "it\\7":Ljava/lang/Object;
    .end local p3    # "$i$a$-let-ComposerKt$cache$1\\8\\170\\7":I
    :goto_c
    nop

    .line 37
    .end local v2    # "invalid\\7":Z
    .end local v4    # "$this$cache\\7":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache\\7\\37":I
    move-object v4, v6

    check-cast v4, Landroidx/compose/runtime/MutableState;

    .local v4, "selectedHour12Index$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 38
    const v0, 0x53203266

    invoke-static {v8, v0, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\10":Z
    move-object v1, v8

    .local v1, "$this$cache\\10":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 176
    .local v2, "$i$f$cache\\10\\38":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\10":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 177
    .local v6, "$i$a$-let-ComposerKt$cache$1\\11\\176\\10":I
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v5, v9, :cond_12

    .line 178
    const/4 v9, 0x0

    .line 38
    .local v9, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$selectedMinuteIndex$2\\12\\178\\0":I
    move/from16 p3, v0

    .end local v0    # "invalid\\10":Z
    .local p3, "invalid\\10":Z
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move/from16 v18, v2

    const/4 v2, 0x2

    .end local v2    # "$i$f$cache\\10\\38":I
    .local v18, "$i$f$cache\\10\\38":I
    invoke-static {v0, v7, v2, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 178
    .end local v9    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$selectedMinuteIndex$2\\12\\178\\0":I
    nop

    .line 179
    .local v0, "value\\11":Ljava/lang/Object;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 180
    move-object v5, v0

    .end local v0    # "value\\11":Ljava/lang/Object;
    goto :goto_d

    .line 181
    .end local v18    # "$i$f$cache\\10\\38":I
    .end local p3    # "invalid\\10":Z
    .local v0, "invalid\\10":Z
    .restart local v2    # "$i$f$cache\\10\\38":I
    :cond_12
    move/from16 p3, v0

    move/from16 v18, v2

    .line 176
    .end local v0    # "invalid\\10":Z
    .end local v2    # "$i$f$cache\\10\\38":I
    .end local v5    # "it\\10":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\11\\176\\10":I
    .restart local v18    # "$i$f$cache\\10\\38":I
    .restart local p3    # "invalid\\10":Z
    :goto_d
    nop

    .line 38
    .end local v1    # "$this$cache\\10":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache\\10\\38":I
    .end local p3    # "invalid\\10":Z
    move-object v6, v5

    check-cast v6, Landroidx/compose/runtime/MutableState;

    .local v6, "selectedMinuteIndex$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 39
    const v0, 0x53203b72

    invoke-static {v8, v0, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\13":Z
    move-object v1, v8

    .local v1, "$this$cache\\13":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 182
    .local v2, "$i$f$cache\\13\\39":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\13":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 183
    .local v9, "$i$a$-let-ComposerKt$cache$1\\14\\182\\13":I
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_14

    .line 184
    const/4 v7, 0x0

    .line 39
    .local v7, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$selectedAmPmIndex$2\\15\\184\\0":I
    if-eqz v17, :cond_13

    move/from16 v18, v22

    goto :goto_e

    :cond_13
    const/16 v18, 0x1

    :goto_e
    move/from16 v20, v0

    .end local v0    # "invalid\\13":Z
    .local v20, "invalid\\13":Z
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move/from16 v18, v2

    const/4 v2, 0x2

    const/4 v3, 0x0

    .end local v2    # "$i$f$cache\\13\\39":I
    .local v18, "$i$f$cache\\13\\39":I
    invoke-static {v0, v3, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 184
    .end local v7    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$selectedAmPmIndex$2\\15\\184\\0":I
    nop

    .line 185
    .local v0, "value\\14":Ljava/lang/Object;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 186
    move-object v5, v0

    .end local v0    # "value\\14":Ljava/lang/Object;
    goto :goto_f

    .line 187
    .end local v18    # "$i$f$cache\\13\\39":I
    .end local v20    # "invalid\\13":Z
    .local v0, "invalid\\13":Z
    .restart local v2    # "$i$f$cache\\13\\39":I
    :cond_14
    move/from16 v20, v0

    move/from16 v18, v2

    const/4 v3, 0x0

    .line 182
    .end local v0    # "invalid\\13":Z
    .end local v2    # "$i$f$cache\\13\\39":I
    .end local v5    # "it\\13":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1\\14\\182\\13":I
    .restart local v18    # "$i$f$cache\\13\\39":I
    .restart local v20    # "invalid\\13":Z
    :goto_f
    nop

    .line 39
    .end local v1    # "$this$cache\\13":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache\\13\\39":I
    .end local v20    # "invalid\\13":Z
    check-cast v5, Landroidx/compose/runtime/MutableState;

    .local v5, "selectedAmPmIndex$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 41
    invoke-static {v4}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$3(Landroidx/compose/runtime/MutableState;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v6}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$6(Landroidx/compose/runtime/MutableState;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$9(Landroidx/compose/runtime/MutableState;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const v2, 0x53204d68

    invoke-static {v8, v2, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v2, v12, 0x380

    const/16 v7, 0x100

    if-ne v2, v7, :cond_15

    const/4 v2, 0x1

    goto :goto_10

    :cond_15
    move/from16 v2, v22

    .local v2, "invalid\\16":Z
    :goto_10
    move-object v7, v8

    .local v7, "$this$cache\\16":Landroidx/compose/runtime/Composer;
    move/from16 v18, v2

    .end local v2    # "invalid\\16":Z
    .local v18, "invalid\\16":Z
    const/16 v20, 0x0

    .line 188
    .local v20, "$i$f$cache\\16\\41":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "it\\16":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 189
    .local v23, "$i$a$-let-ComposerKt$cache$1\\17\\188\\16":I
    if-nez v18, :cond_17

    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_16

    goto :goto_11

    .line 193
    :cond_16
    move-object/from16 v27, v0

    move-object v3, v2

    move-object v2, v4

    move-object v0, v7

    goto :goto_12

    .line 190
    :cond_17
    :goto_11
    const/16 v25, 0x0

    .line 41
    .local v25, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$1\\18\\190\\0":I
    move-object v3, v2

    .end local v2    # "it\\16":Ljava/lang/Object;
    .local v3, "it\\16":Ljava/lang/Object;
    new-instance v2, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;

    move-object/from16 v26, v7

    .end local v7    # "$this$cache\\16":Landroidx/compose/runtime/Composer;
    .local v26, "$this$cache\\16":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    move-object/from16 v27, v0

    move-object/from16 v0, v26

    move-object/from16 v26, v3

    move-object/from16 v3, p2

    .end local v3    # "it\\16":Ljava/lang/Object;
    .local v0, "$this$cache\\16":Landroidx/compose/runtime/Composer;
    .local v26, "it\\16":Ljava/lang/Object;
    invoke-direct/range {v2 .. v7}, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    move-object v2, v4

    .end local v4    # "selectedHour12Index$delegate":Landroidx/compose/runtime/MutableState;
    .local v2, "selectedHour12Index$delegate":Landroidx/compose/runtime/MutableState;
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 190
    .end local v25    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$1\\18\\190\\0":I
    nop

    .line 191
    .local v3, "value\\17":Ljava/lang/Object;
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 192
    nop

    .line 188
    .end local v3    # "value\\17":Ljava/lang/Object;
    .end local v23    # "$i$a$-let-ComposerKt$cache$1\\17\\188\\16":I
    .end local v26    # "it\\16":Ljava/lang/Object;
    :goto_12
    nop

    .line 41
    .end local v0    # "$this$cache\\16":Landroidx/compose/runtime/Composer;
    .end local v18    # "invalid\\16":Z
    .end local v20    # "$i$f$cache\\16\\41":I
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object/from16 v26, v8

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v26, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    move-object v4, v1

    move-object v1, v5

    move-object v0, v6

    move-object v5, v9

    move-object/from16 v7, v26

    move-object v6, v3

    move-object/from16 v3, v27

    .end local v5    # "selectedAmPmIndex$delegate":Landroidx/compose/runtime/MutableState;
    .end local v6    # "selectedMinuteIndex$delegate":Landroidx/compose/runtime/MutableState;
    .end local v26    # "$composer":Landroidx/compose/runtime/Composer;
    .local v0, "selectedMinuteIndex$delegate":Landroidx/compose/runtime/MutableState;
    .local v1, "selectedAmPmIndex$delegate":Landroidx/compose/runtime/MutableState;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v3 .. v8}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 54
    move-object v8, v7

    .line 55
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v8    # "$composer":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v13, v3, v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 56
    const/16 v6, 0x10

    .local v6, "$this$dp\\19":I
    const/4 v7, 0x0

    .line 194
    .local v7, "$i$f$getDp\\19\\56":I
    int-to-float v9, v6

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 56
    .end local v6    # "$this$dp\\19":I
    .end local v7    # "$i$f$getDp\\19\\56":I
    const/16 v7, 0x10

    .local v7, "$this$dp\\20":I
    const/4 v9, 0x0

    .line 194
    .local v9, "$i$f$getDp\\20\\56":I
    int-to-float v3, v7

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 56
    .end local v7    # "$this$dp\\20":I
    .end local v9    # "$i$f$getDp\\20\\56":I
    nop

    .line 55
    nop

    .line 56
    invoke-static {v5, v3, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 57
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 58
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v6

    .line 53
    nop

    .local v3, "modifier\\21":Landroidx/compose/ui/Modifier;
    .local v5, "horizontalArrangement\\21":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    move-object v7, v8

    .local v6, "verticalAlignment\\21":Landroidx/compose/ui/Alignment$Vertical;
    .local v7, "$composer\\21":Landroidx/compose/runtime/Composer;
    const/16 v9, 0x1b0

    .local v9, "$changed\\21":I
    const/16 v18, 0x0

    .line 195
    .local v18, "$i$f$Row\\21\\53":I
    const v4, 0x2952b718

    move-object/from16 v20, v8

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v20, "$composer":Landroidx/compose/runtime/Composer;
    const-string v8, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo"

    invoke-static {v7, v4, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 196
    shr-int/lit8 v4, v9, 0x3

    and-int/lit8 v4, v4, 0xe

    shr-int/lit8 v8, v9, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v4, v8

    invoke-static {v5, v6, v7, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v4

    .local v4, "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v8, v9, 0x3

    and-int/lit8 v8, v8, 0x70

    .line 197
    nop

    .local v8, "$changed\\22":I
    const/16 v21, 0x0

    .line 198
    .local v21, "$i$f$Layout\\22\\197":I
    move-object/from16 v23, v5

    .end local v5    # "horizontalArrangement\\21":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v23, "horizontalArrangement\\21":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const v5, -0x4ee9b9da

    move-object/from16 v34, v6

    .end local v6    # "verticalAlignment\\21":Landroidx/compose/ui/Alignment$Vertical;
    .local v34, "verticalAlignment\\21":Landroidx/compose/ui/Alignment$Vertical;
    const-string v6, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v7, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 199
    move/from16 v5, v22

    invoke-static {v7, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 200
    .local v5, "compositeKeyHash\\22":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v6

    .line 201
    .local v6, "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 v22, v5

    .end local v5    # "compositeKeyHash\\22":I
    .local v22, "compositeKeyHash\\22":I
    invoke-static {v7, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 203
    .local v5, "materialized\\22":Landroidx/compose/ui/Modifier;
    sget-object v25, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v25

    move-object/from16 v35, v3

    .end local v3    # "modifier\\21":Landroidx/compose/ui/Modifier;
    .local v35, "modifier\\21":Landroidx/compose/ui/Modifier;
    shl-int/lit8 v3, v8, 0x6

    and-int/lit16 v3, v3, 0x380

    move/from16 v26, v3

    const/4 v3, 0x6

    or-int/lit8 v26, v26, 0x6

    .line 202
    move/from16 v36, v26

    .local v36, "$changed\\23":I
    move-object/from16 v37, v25

    .local v37, "factory\\23":Lkotlin/jvm/functions/Function0;
    const/16 v38, 0x0

    .line 204
    .local v38, "$i$f$ReusableComposeNode\\23\\202":I
    move/from16 v39, v3

    const v3, -0x2942ffcf

    move/from16 v40, v8

    .end local v8    # "$changed\\22":I
    .local v40, "$changed\\22":I
    const-string v8, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v7, v3, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 205
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v3

    instance-of v3, v3, Landroidx/compose/runtime/Applier;

    if-nez v3, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 206
    :cond_18
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 207
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v3

    if-eqz v3, :cond_19

    .line 208
    move-object/from16 v3, v37

    .end local v37    # "factory\\23":Lkotlin/jvm/functions/Function0;
    .local v3, "factory\\23":Lkotlin/jvm/functions/Function0;
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_13

    .line 210
    .end local v3    # "factory\\23":Lkotlin/jvm/functions/Function0;
    .restart local v37    # "factory\\23":Lkotlin/jvm/functions/Function0;
    :cond_19
    move-object/from16 v3, v37

    .end local v37    # "factory\\23":Lkotlin/jvm/functions/Function0;
    .restart local v3    # "factory\\23":Lkotlin/jvm/functions/Function0;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 212
    :goto_13
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .local v8, "$this$Layout_u24lambda_u240\\24":Landroidx/compose/runtime/Composer;
    const/16 v25, 0x0

    .line 213
    .local v25, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\24\\212\\22":I
    sget-object v26, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v37, v3

    .end local v3    # "factory\\23":Lkotlin/jvm/functions/Function0;
    .restart local v37    # "factory\\23":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v4, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 214
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 216
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .local v3, "block\\25":Lkotlin/jvm/functions/Function2;
    const/16 v26, 0x0

    .line 217
    .local v26, "$i$f$set-impl\\25\\216":I
    move-object/from16 v27, v8

    .local v27, "$this$set_impl_u24lambda_u240\\25":Landroidx/compose/runtime/Composer;
    const/16 v28, 0x0

    .line 218
    .local v28, "$i$a$-with-Updater$set$1\\26\\217\\25":I
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v29

    if-nez v29, :cond_1b

    move-object/from16 v41, v4

    .end local v4    # "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v41, "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v42, v6

    .end local v6    # "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    .local v42, "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto :goto_14

    :cond_1a
    move-object/from16 v6, v27

    goto :goto_15

    .end local v41    # "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v42    # "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v4    # "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v6    # "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    :cond_1b
    move-object/from16 v41, v4

    move-object/from16 v42, v6

    .line 219
    .end local v4    # "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v6    # "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v41    # "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v42    # "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    :goto_14
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v6, v27

    .end local v27    # "$this$set_impl_u24lambda_u240\\25":Landroidx/compose/runtime/Composer;
    .local v6, "$this$set_impl_u24lambda_u240\\25":Landroidx/compose/runtime/Composer;
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 220
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 222
    :goto_15
    nop

    .line 217
    .end local v6    # "$this$set_impl_u24lambda_u240\\25":Landroidx/compose/runtime/Composer;
    .end local v28    # "$i$a$-with-Updater$set$1\\26\\217\\25":I
    nop

    .line 222
    nop

    .line 223
    .end local v3    # "block\\25":Lkotlin/jvm/functions/Function2;
    .end local v26    # "$i$f$set-impl\\25\\216":I
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 224
    nop

    .line 212
    .end local v8    # "$this$Layout_u24lambda_u240\\24":Landroidx/compose/runtime/Composer;
    .end local v25    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\24\\212\\22":I
    nop

    .line 225
    shr-int/lit8 v3, v36, 0x6

    and-int/lit8 v3, v3, 0xe

    .local v3, "$changed\\27":I
    move-object v4, v7

    .local v4, "$composer\\27":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 226
    .local v6, "$i$a$-Layout-RowKt$Row$1\\27\\225\\21":I
    const v8, -0x184f2606

    move/from16 v43, v3

    .end local v3    # "$changed\\27":I
    .local v43, "$changed\\27":I
    const-string v3, "C101@5126L9:Row.kt#2w3rfo"

    invoke-static {v4, v8, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    shr-int/lit8 v8, v9, 0x6

    and-int/lit8 v8, v8, 0x70

    or-int/lit8 v8, v8, 0x6

    .local v8, "$changed\\28":I
    check-cast v3, Landroidx/compose/foundation/layout/RowScope;

    .local v3, "$this$WheelTimePicker_u24lambda_u2418\\28":Landroidx/compose/foundation/layout/RowScope;
    move-object/from16 v30, v4

    .local v30, "$composer\\28":Landroidx/compose/runtime/Composer;
    const/16 v69, 0x0

    .line 61
    .local v69, "$i$a$-Row-WheelTimePickerKt$WheelTimePicker$2\\28\\226\\0":I
    move-object/from16 v70, v3

    .end local v3    # "$this$WheelTimePicker_u24lambda_u2418\\28":Landroidx/compose/foundation/layout/RowScope;
    .local v70, "$this$WheelTimePicker_u24lambda_u2418\\28":Landroidx/compose/foundation/layout/RowScope;
    const v3, 0x192e478c

    move-object/from16 v71, v4

    .end local v4    # "$composer\\27":Landroidx/compose/runtime/Composer;
    .local v71, "$composer\\27":Landroidx/compose/runtime/Composer;
    const-string v4, "C63@2248L28,60@2117L215,68@2369L203,80@2734L28,77@2601L217,84@2828L29,90@3018L26,87@2886L214:WheelTimePicker.kt#qonjpd"

    move-object/from16 v72, v5

    move-object/from16 v5, v30

    .end local v30    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .local v5, "$composer\\28":Landroidx/compose/runtime/Composer;
    .local v72, "materialized\\22":Landroidx/compose/ui/Modifier;
    invoke-static {v5, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 62
    nop

    .line 63
    invoke-static {v2}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$3(Landroidx/compose/runtime/MutableState;)I

    move-result v25

    .line 64
    const v3, 0x19962ffc

    invoke-static {v5, v3, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid\\29":Z
    move-object v4, v5

    .local v4, "$this$cache\\29":Landroidx/compose/runtime/Composer;
    const/16 v26, 0x0

    .line 227
    .local v26, "$i$f$cache\\29\\64":I
    move/from16 v27, v3

    .end local v3    # "invalid\\29":Z
    .local v27, "invalid\\29":Z
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\29":Ljava/lang/Object;
    const/16 v28, 0x0

    .line 228
    .local v28, "$i$a$-let-ComposerKt$cache$1\\30\\227\\29":I
    sget-object v29, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .end local v5    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .restart local v30    # "$composer\\28":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1c

    .line 229
    const/4 v5, 0x0

    .line 64
    .local v5, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$1\\31\\229\\28":I
    move-object/from16 v29, v3

    .end local v3    # "it\\29":Ljava/lang/Object;
    .local v29, "it\\29":Ljava/lang/Object;
    new-instance v3, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda3;

    invoke-direct {v3, v2}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda3;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 229
    .end local v5    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$1\\31\\229\\28":I
    nop

    .line 230
    .local v3, "value\\30":Ljava/lang/Object;
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 231
    nop

    .end local v3    # "value\\30":Ljava/lang/Object;
    goto :goto_16

    .line 232
    .end local v29    # "it\\29":Ljava/lang/Object;
    .local v3, "it\\29":Ljava/lang/Object;
    :cond_1c
    move-object/from16 v29, v3

    .line 227
    .end local v3    # "it\\29":Ljava/lang/Object;
    .end local v28    # "$i$a$-let-ComposerKt$cache$1\\30\\227\\29":I
    :goto_16
    nop

    .line 64
    .end local v4    # "$this$cache\\29":Landroidx/compose/runtime/Composer;
    .end local v26    # "$i$f$cache\\29\\64":I
    .end local v27    # "invalid\\29":Z
    move-object/from16 v26, v3

    check-cast v26, Lkotlin/jvm/functions/Function1;

    invoke-static/range {v30 .. v30}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 65
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/16 v4, 0x40

    .local v4, "$this$dp\\32":I
    const/4 v5, 0x0

    .line 233
    .local v5, "$i$f$getDp\\32\\65":I
    move-object/from16 v73, v2

    .end local v2    # "selectedHour12Index$delegate":Landroidx/compose/runtime/MutableState;
    .local v73, "selectedHour12Index$delegate":Landroidx/compose/runtime/MutableState;
    int-to-float v2, v4

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 65
    .end local v4    # "$this$dp\\32":I
    .end local v5    # "$i$f$getDp\\32\\65":I
    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v27

    .line 61
    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0xd80

    const/16 v32, 0x30

    invoke-static/range {v24 .. v32}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn-HYR8e34(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V

    .line 71
    invoke-static/range {p4 .. p4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v48

    .line 72
    sget-object v2, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v51

    .line 73
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v46

    .line 74
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x8

    .local v3, "$this$dp\\33":I
    const/4 v4, 0x0

    .line 234
    .local v4, "$i$f$getDp\\33\\74":I
    int-to-float v5, v3

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 74
    .end local v3    # "$this$dp\\33":I
    .end local v4    # "$i$f$getDp\\33\\74":I
    move/from16 p3, v6

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    .end local v6    # "$i$a$-Layout-RowKt$Row$1\\27\\225\\21":I
    .local p3, "$i$a$-Layout-RowKt$Row$1\\27\\225\\21":I
    invoke-static {v2, v3, v4, v5, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v45

    .line 70
    nop

    .line 74
    nop

    .line 73
    nop

    .line 71
    nop

    .line 72
    nop

    .line 69
    const-string v44, ":"

    const/16 v50, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const v66, 0x30db6

    const/16 v67, 0x0

    const v68, 0x1ffd0

    move-object/from16 v65, v30

    .end local v30    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .local v65, "$composer\\28":Landroidx/compose/runtime/Composer;
    invoke-static/range {v44 .. v68}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 79
    move-object/from16 v5, v65

    .line 80
    .end local v65    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .local v5, "$composer\\28":Landroidx/compose/runtime/Composer;
    invoke-static {v0}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$6(Landroidx/compose/runtime/MutableState;)I

    move-result v26

    .line 81
    const v2, 0x19966cbc

    invoke-static {v5, v2, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\34":Z
    move-object v3, v5

    .local v3, "$this$cache\\34":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 235
    .local v4, "$i$f$cache\\34\\81":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\34":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 236
    .local v19, "$i$a$-let-ComposerKt$cache$1\\35\\235\\34":I
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p4, v2

    .end local v2    # "invalid\\34":Z
    .local p4, "invalid\\34":Z
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_1d

    .line 237
    const/4 v2, 0x0

    .line 81
    .local v2, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$2\\36\\237\\28":I
    move/from16 v25, v2

    .end local v2    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$2\\36\\237\\28":I
    .local v25, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$2\\36\\237\\28":I
    new-instance v2, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda4;

    invoke-direct {v2, v0}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda4;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 237
    .end local v25    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$2\\36\\237\\28":I
    nop

    .line 238
    .local v2, "value\\35":Ljava/lang/Object;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 239
    move-object v6, v2

    .end local v2    # "value\\35":Ljava/lang/Object;
    goto :goto_17

    .line 240
    :cond_1d
    nop

    .line 235
    .end local v6    # "it\\34":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1\\35\\235\\34":I
    :goto_17
    nop

    .line 81
    .end local v3    # "$this$cache\\34":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\34\\81":I
    .end local p4    # "invalid\\34":Z
    move-object/from16 v27, v6

    check-cast v27, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 82
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x40

    .local v3, "$this$dp\\37":I
    const/4 v4, 0x0

    .line 241
    .local v4, "$i$f$getDp\\37\\82":I
    int-to-float v6, v3

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 82
    .end local v3    # "$this$dp\\37":I
    .end local v4    # "$i$f$getDp\\37\\82":I
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v28

    .line 78
    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0xd80

    const/16 v33, 0x30

    move-object/from16 v31, v5

    move-object/from16 v25, v10

    .end local v5    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .end local v10    # "minutes":Ljava/util/List;
    .local v25, "minutes":Ljava/util/List;
    .local v31, "$composer\\28":Landroidx/compose/runtime/Composer;
    invoke-static/range {v25 .. v33}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn-HYR8e34(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V

    .line 85
    move-object/from16 v5, v25

    move-object/from16 v4, v31

    .end local v25    # "minutes":Ljava/util/List;
    .end local v31    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .local v4, "$composer\\28":Landroidx/compose/runtime/Composer;
    .local v5, "minutes":Ljava/util/List;
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x10

    .local v3, "$this$dp\\38":I
    const/4 v6, 0x0

    .line 242
    .local v6, "$i$f$getDp\\38\\85":I
    int-to-float v10, v3

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 85
    .end local v3    # "$this$dp\\38":I
    .end local v6    # "$i$f$getDp\\38\\85":I
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v3, v39

    invoke-static {v2, v4, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 89
    nop

    .line 90
    invoke-static {v1}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$9(Landroidx/compose/runtime/MutableState;)I

    move-result v26

    .line 91
    const v2, 0x1996903a

    invoke-static {v4, v2, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid\\39":Z
    move-object v3, v4

    .local v3, "$this$cache\\39":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 243
    .local v6, "$i$f$cache\\39\\91":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it\\39":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 244
    .local v15, "$i$a$-let-ComposerKt$cache$1\\40\\243\\39":I
    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p4, v0

    .end local v0    # "selectedMinuteIndex$delegate":Landroidx/compose/runtime/MutableState;
    .local p4, "selectedMinuteIndex$delegate":Landroidx/compose/runtime/MutableState;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v10, v0, :cond_1e

    .line 245
    const/4 v0, 0x0

    .line 91
    .local v0, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$3\\41\\245\\28":I
    move/from16 v19, v0

    .end local v0    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$3\\41\\245\\28":I
    .local v19, "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$3\\41\\245\\28":I
    new-instance v0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda5;

    invoke-direct {v0, v1}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda5;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 245
    .end local v19    # "$i$a$-cache-WheelTimePickerKt$WheelTimePicker$2$3\\41\\245\\28":I
    nop

    .line 246
    .local v0, "value\\40":Ljava/lang/Object;
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 247
    move-object v10, v0

    .end local v0    # "value\\40":Ljava/lang/Object;
    goto :goto_18

    .line 248
    :cond_1e
    nop

    .line 243
    .end local v10    # "it\\39":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1\\40\\243\\39":I
    :goto_18
    nop

    .line 91
    .end local v2    # "invalid\\39":Z
    .end local v3    # "$this$cache\\39":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\39\\91":I
    move-object/from16 v27, v10

    check-cast v27, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 92
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v2, 0x40

    .local v2, "$this$dp\\42":I
    const/4 v3, 0x0

    .line 249
    .local v3, "$i$f$getDp\\42\\92":I
    int-to-float v6, v2

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 92
    .end local v2    # "$this$dp\\42":I
    .end local v3    # "$i$f$getDp\\42\\92":I
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v28

    .line 88
    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0xd86

    const/16 v33, 0x30

    move-object/from16 v31, v4

    move-object/from16 v25, v14

    .end local v4    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .end local v14    # "amPmList":Ljava/util/List;
    .local v25, "amPmList":Ljava/util/List;
    .restart local v31    # "$composer\\28":Landroidx/compose/runtime/Composer;
    invoke-static/range {v25 .. v33}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn-HYR8e34(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V

    .line 61
    move-object/from16 v30, v31

    .end local v31    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .restart local v30    # "$composer\\28":Landroidx/compose/runtime/Composer;
    invoke-static/range {v30 .. v30}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 94
    nop

    .line 226
    .end local v8    # "$changed\\28":I
    .end local v30    # "$composer\\28":Landroidx/compose/runtime/Composer;
    .end local v69    # "$i$a$-Row-WheelTimePickerKt$WheelTimePicker$2\\28\\226\\0":I
    .end local v70    # "$this$WheelTimePicker_u24lambda_u2418\\28":Landroidx/compose/foundation/layout/RowScope;
    invoke-static/range {v71 .. v71}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 225
    .end local v43    # "$changed\\27":I
    .end local v71    # "$composer\\27":Landroidx/compose/runtime/Composer;
    .end local p3    # "$i$a$-Layout-RowKt$Row$1\\27\\225\\21":I
    nop

    .line 250
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 204
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 251
    nop

    .line 198
    .end local v36    # "$changed\\23":I
    .end local v37    # "factory\\23":Lkotlin/jvm/functions/Function0;
    .end local v38    # "$i$f$ReusableComposeNode\\23\\202":I
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 252
    nop

    .line 195
    .end local v21    # "$i$f$Layout\\22\\197":I
    .end local v22    # "compositeKeyHash\\22":I
    .end local v40    # "$changed\\22":I
    .end local v42    # "localMap\\22":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v72    # "materialized\\22":Landroidx/compose/ui/Modifier;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 253
    nop

    .end local v7    # "$composer\\21":Landroidx/compose/runtime/Composer;
    .end local v9    # "$changed\\21":I
    .end local v18    # "$i$f$Row\\21\\53":I
    .end local v23    # "horizontalArrangement\\21":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v34    # "verticalAlignment\\21":Landroidx/compose/ui/Alignment$Vertical;
    .end local v35    # "modifier\\21":Landroidx/compose/ui/Modifier;
    .end local v41    # "measurePolicy\\21":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 95
    .end local v1    # "selectedAmPmIndex$delegate":Landroidx/compose/runtime/MutableState;
    .end local v5    # "minutes":Ljava/util/List;
    .end local v16    # "initialHour12":I
    .end local v17    # "initialIsAm":Z
    .end local v24    # "hours":Ljava/util/List;
    .end local v25    # "amPmList":Ljava/util/List;
    .end local v73    # "selectedHour12Index$delegate":Landroidx/compose/runtime/MutableState;
    .end local p4    # "selectedMinuteIndex$delegate":Landroidx/compose/runtime/MutableState;
    :cond_1f
    move-object v4, v13

    goto :goto_19

    .line 19
    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    .local p3, "modifier":Landroidx/compose/ui/Modifier;
    :cond_20
    move-object/from16 v20, v8

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, v7

    .line 95
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    :goto_19
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v7

    if-eqz v7, :cond_21

    new-instance v0, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda6;

    move/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    move v2, v11

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/components/WheelTimePickerKt$$ExternalSyntheticLambda6;-><init>(IILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_21
    return-void
.end method

.method private static final WheelTimePicker$lambda$10(Landroidx/compose/runtime/MutableState;I)V
    .locals 5
    .param p0, "$selectedAmPmIndex$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "<set-?>"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 39
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v4, 0x0

    .line 327
    .local v4, "$i$f$setValue\\1\\39":I
    invoke-interface {v3, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 328
    nop

    .line 39
    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v4    # "$i$f$setValue\\1\\39":I
    return-void
.end method

.method static final WheelTimePicker$lambda$18$lambda$13$lambda$12(Landroidx/compose/runtime/MutableState;I)Lkotlin/Unit;
    .locals 1
    .param p0, "$selectedHour12Index$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "it"    # I

    .line 64
    invoke-static {p0, p1}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$4(Landroidx/compose/runtime/MutableState;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final WheelTimePicker$lambda$18$lambda$15$lambda$14(Landroidx/compose/runtime/MutableState;I)Lkotlin/Unit;
    .locals 1
    .param p0, "$selectedMinuteIndex$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "it"    # I

    .line 81
    invoke-static {p0, p1}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$7(Landroidx/compose/runtime/MutableState;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final WheelTimePicker$lambda$18$lambda$17$lambda$16(Landroidx/compose/runtime/MutableState;I)Lkotlin/Unit;
    .locals 1
    .param p0, "$selectedAmPmIndex$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "it"    # I

    .line 91
    invoke-static {p0, p1}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$10(Landroidx/compose/runtime/MutableState;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final WheelTimePicker$lambda$19(IILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    or-int/lit8 v0, p4, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v7, p5

    move-object v5, p6

    invoke-static/range {v1 .. v7}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker(IILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final WheelTimePicker$lambda$3(Landroidx/compose/runtime/MutableState;)I
    .locals 4
    .param p0, "$selectedHour12Index$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 37
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "this_\\1":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property\\1":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 320
    .local v3, "$i$f$getValue\\1\\37":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "this_\\1":Ljava/lang/Object;
    .end local v2    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue\\1\\37":I
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 37
    return v0
.end method

.method private static final WheelTimePicker$lambda$4(Landroidx/compose/runtime/MutableState;I)V
    .locals 5
    .param p0, "$selectedHour12Index$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "<set-?>"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 37
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v4, 0x0

    .line 321
    .local v4, "$i$f$setValue\\1\\37":I
    invoke-interface {v3, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 322
    nop

    .line 37
    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v4    # "$i$f$setValue\\1\\37":I
    return-void
.end method

.method private static final WheelTimePicker$lambda$6(Landroidx/compose/runtime/MutableState;)I
    .locals 4
    .param p0, "$selectedMinuteIndex$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 38
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "this_\\1":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property\\1":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 323
    .local v3, "$i$f$getValue\\1\\38":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "this_\\1":Ljava/lang/Object;
    .end local v2    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue\\1\\38":I
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 38
    return v0
.end method

.method private static final WheelTimePicker$lambda$7(Landroidx/compose/runtime/MutableState;I)V
    .locals 5
    .param p0, "$selectedMinuteIndex$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "<set-?>"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 38
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v4, 0x0

    .line 324
    .local v4, "$i$f$setValue\\1\\38":I
    invoke-interface {v3, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 325
    nop

    .line 38
    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v4    # "$i$f$setValue\\1\\38":I
    return-void
.end method

.method private static final WheelTimePicker$lambda$9(Landroidx/compose/runtime/MutableState;)I
    .locals 4
    .param p0, "$selectedAmPmIndex$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 39
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "this_\\1":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property\\1":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 326
    .local v3, "$i$f$getValue\\1\\39":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "this_\\1":Ljava/lang/Object;
    .end local v2    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue\\1\\39":I
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 39
    return v0
.end method

.method public static final synthetic access$WheelPickerColumn_HYR8e34$lambda$23(Landroidx/compose/runtime/State;)I
    .locals 1
    .param p0, "$selectedIndex$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Lcom/example/ui/components/WheelTimePickerKt;->WheelPickerColumn_HYR8e34$lambda$23(Landroidx/compose/runtime/State;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$WheelTimePicker$lambda$3(Landroidx/compose/runtime/MutableState;)I
    .locals 1
    .param p0, "$selectedHour12Index$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 1
    invoke-static {p0}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$3(Landroidx/compose/runtime/MutableState;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$WheelTimePicker$lambda$6(Landroidx/compose/runtime/MutableState;)I
    .locals 1
    .param p0, "$selectedMinuteIndex$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 1
    invoke-static {p0}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$6(Landroidx/compose/runtime/MutableState;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$WheelTimePicker$lambda$9(Landroidx/compose/runtime/MutableState;)I
    .locals 1
    .param p0, "$selectedAmPmIndex$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 1
    invoke-static {p0}, Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker$lambda$9(Landroidx/compose/runtime/MutableState;)I

    move-result v0

    return v0
.end method
