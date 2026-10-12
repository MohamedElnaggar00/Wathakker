.class public final Lcom/example/ui/screens/RemindersScreenKt;
.super Ljava/lang/Object;
.source "RemindersScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRemindersScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemindersScreen.kt\ncom/example/ui/screens/RemindersScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,74:1\n1282#2,6:75\n1282#2,6:85\n1282#2,6:92\n1282#2,6:102\n1282#2,6:150\n1788#3,4:81\n1056#3:99\n1878#3,2:100\n1880#3:108\n1#4:91\n85#5:98\n113#6:109\n86#7:110\n83#7,6:111\n89#7:145\n93#7:149\n79#8,6:117\n86#8,4:132\n90#8,2:142\n94#8:148\n368#9,9:123\n377#9:144\n378#9,2:146\n4034#10,6:136\n*S KotlinDebug\n*F\n+ 1 RemindersScreen.kt\ncom/example/ui/screens/RemindersScreenKt\n*L\n22#1:75,6\n32#1:85,6\n55#1:92,6\n40#1:102,6\n70#1:150,6\n27#1:81,4\n38#1:99\n38#1:100,2\n38#1:108\n21#1:98\n57#1:109\n57#1:110\n57#1:111,6\n57#1:145\n57#1:149\n57#1:117,6\n57#1:132,4\n57#1:142,2\n57#1:148\n57#1:123,9\n57#1:144\n57#1:146,2\n57#1:136,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a=\u0010\u0007\u001a\u00020\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000cH\u0007\u00a2\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011\u00b2\u0006\u0010\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002"
    }
    d2 = {
        "RemindersScreen",
        "",
        "viewModel",
        "Lcom/example/ui/viewmodel/MainViewModel;",
        "onBack",
        "Lkotlin/Function0;",
        "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "RemindersContent",
        "all",
        "",
        "Lcom/example/data/Dhikr;",
        "onToggle",
        "Lkotlin/Function1;",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "ReminderRow",
        "dhikr",
        "(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "app",
        "allDhikr"
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
.method public static final ReminderRow(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .param p0, "dhikr"    # Lcom/example/data/Dhikr;
    .param p1, "onToggle"    # Lkotlin/jvm/functions/Function0;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Dhikr;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v12, p3

    const-string v1, "dhikr"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onToggle"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const v1, -0x123123c9

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(ReminderRow)N(dhikr,onToggle)49@1749L11,54@2043L24,55@2087L584,69@2692L48,52@1947L827:RemindersScreen.kt#2thlc2"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p3

    .local v2, "$dirty":I
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_1

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_3

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_1

    :cond_2
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v2, v3

    :cond_3
    move v13, v2

    .end local v2    # "$dirty":I
    .local v13, "$dirty":I
    and-int/lit8 v2, v13, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    if-eq v2, v3, :cond_4

    move v2, v4

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    and-int/lit8 v3, v13, 0x1

    invoke-interface {v9, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string v3, "com.example.ui.screens.ReminderRow (RemindersScreen.kt:48)"

    invoke-static {v1, v13, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 50
    :cond_5
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v2, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v1, v9, v2}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v14

    .line 51
    .local v14, "cs":Landroidx/compose/material3/ColorScheme;
    invoke-virtual {v0}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 91
    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 51
    .local v2, "$i$a$-let-RemindersScreenKt$ReminderRow$first$1\\1\\51\\0":I
    invoke-static {v1}, Lcom/example/utils/DateTimeUtilsKt;->formatTimeStr12h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-let-RemindersScreenKt$ReminderRow$first$1\\1\\51\\0":I
    if-nez v1, :cond_7

    :cond_6
    const-string v1, "--"

    :cond_7
    move-object v15, v1

    .line 52
    .local v15, "first":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v4, :cond_8

    invoke-virtual {v0}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " +"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_8
    const-string v1, ""

    .line 54
    .local v1, "extra":Ljava/lang/String;
    :goto_3
    invoke-virtual {v0}, Lcom/example/data/Dhikr;->getTitle()Ljava/lang/String;

    move-result-object v2

    .line 55
    invoke-virtual {v0}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Ljava/lang/Iterable;

    const-string v3, "\u060c "

    move-object/from16 v17, v3

    check-cast v17, Ljava/lang/CharSequence;

    const v3, -0x4a772511

    const-string v5, "CC(remember):RemindersScreen.kt#9igjgp"

    invoke-static {v9, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid\\2":Z
    move-object v5, v9

    .local v5, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 92
    .local v7, "$i$f$cache\\2\\55":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it\\2":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 93
    .local v10, "$i$a$-let-ComposerKt$cache$1\\3\\92\\2":I
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v8, v11, :cond_9

    .line 94
    const/4 v11, 0x0

    .local v11, "$i$a$-cache-RemindersScreenKt$ReminderRow$1\\4\\94\\0":I
    new-instance v18, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda3;

    invoke-direct/range {v18 .. v18}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda3;-><init>()V

    .end local v11    # "$i$a$-cache-RemindersScreenKt$ReminderRow$1\\4\\94\\0":I
    move-object/from16 v11, v18

    .line 95
    .local v11, "value\\3":Ljava/lang/Object;
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 96
    move-object v8, v11

    .end local v11    # "value\\3":Ljava/lang/Object;
    goto :goto_4

    .line 97
    :cond_9
    nop

    .line 92
    .end local v8    # "it\\2":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1\\3\\92\\2":I
    :goto_4
    nop

    .line 55
    .end local v3    # "invalid\\2":Z
    .end local v5    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache\\2\\55":I
    move-object/from16 v22, v8

    check-cast v22, Lkotlin/jvm/functions/Function1;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v23, 0x1e

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 56
    new-instance v5, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;

    invoke-direct {v5, v15, v0, v14, v1}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda4;-><init>(Ljava/lang/String;Lcom/example/data/Dhikr;Landroidx/compose/material3/ColorScheme;Ljava/lang/String;)V

    const v7, 0x418c4687

    const/16 v8, 0x36

    invoke-static {v7, v4, v5, v9, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 70
    new-instance v7, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda5;

    invoke-direct {v7, v0, v6}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda5;-><init>(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;)V

    const v10, -0x7b0d4a38

    invoke-static {v10, v4, v7, v9, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 71
    shl-int/lit8 v7, v13, 0xc

    const/high16 v8, 0x70000

    and-int/2addr v7, v8

    or-int/lit16 v10, v7, 0x6c00

    .line 53
    move-object v7, v1

    move-object v1, v2

    .end local v1    # "extra":Ljava/lang/String;
    .local v7, "extra":Ljava/lang/String;
    const/4 v2, 0x0

    move-object v11, v7

    .end local v7    # "extra":Ljava/lang/String;
    .local v11, "extra":Ljava/lang/String;
    const-wide/16 v7, 0x0

    move-object/from16 v16, v11

    .end local v11    # "extra":Ljava/lang/String;
    .local v16, "extra":Ljava/lang/String;
    const/16 v11, 0x42

    move-object/from16 v25, v5

    move-object v5, v4

    move-object/from16 v4, v25

    invoke-static/range {v1 .. v11}, Lcom/example/ui/oneui/OneUIKt;->OneUIRow-RFMEUTM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v14    # "cs":Landroidx/compose/material3/ColorScheme;
    .end local v15    # "first":Ljava/lang/String;
    .end local v16    # "extra":Ljava/lang/String;
    goto :goto_5

    .line 48
    :cond_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 73
    :cond_b
    :goto_5
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_c

    new-instance v2, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda6;

    invoke-direct {v2, v0, v6, v12}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda6;-><init>(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_c
    return-void
.end method

.method static final ReminderRow$lambda$15$lambda$14(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-static {p0}, Lcom/example/utils/DateTimeUtilsKt;->formatTimeStr12h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method static final ReminderRow$lambda$17(Ljava/lang/String;Lcom/example/data/Dhikr;Landroidx/compose/material3/ColorScheme;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 51
    .param p0, "$first"    # Ljava/lang/String;
    .param p1, "$dhikr"    # Lcom/example/data/Dhikr;
    .param p2, "$cs"    # Landroidx/compose/material3/ColorScheme;
    .param p3, "$extra"    # Ljava/lang/String;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move/from16 v2, p5

    const-string v3, "C56@2101L560:RemindersScreen.kt#2thlc2"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v3, v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    and-int/lit8 v6, v2, 0x1

    invoke-interface {v1, v3, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, -0x1

    const-string v6, "com.example.ui.screens.ReminderRow.<anonymous> (RemindersScreen.kt:56)"

    const v7, 0x418c4687

    invoke-static {v7, v2, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 57
    :cond_1
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v3

    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    const/16 v7, 0x48

    .local v7, "$this$dp\\1":I
    const/4 v8, 0x0

    .line 109
    .local v8, "$i$f$getDp\\1\\57":I
    int-to-float v9, v7

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 57
    .end local v7    # "$this$dp\\1":I
    .end local v8    # "$i$f$getDp\\1\\57":I
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .local v6, "modifier\\2":Landroidx/compose/ui/Modifier;
    const/16 v7, 0x186

    .local v3, "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .local v7, "$changed\\2":I
    move-object/from16 v8, p4

    .local v8, "$composer\\2":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 110
    .local v9, "$i$f$Column\\2\\57":I
    const v10, -0x1cd0f17e

    const-string v11, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    invoke-static {v8, v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 111
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v10

    .line 115
    .local v10, "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    shr-int/lit8 v11, v7, 0x3

    and-int/lit8 v11, v11, 0xe

    shr-int/lit8 v12, v7, 0x3

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v11, v12

    invoke-static {v10, v3, v8, v11}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v11

    .local v11, "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v12, v7, 0x3

    and-int/lit8 v12, v12, 0x70

    .line 116
    nop

    .local v12, "$changed\\3":I
    const/4 v13, 0x0

    .line 117
    .local v13, "$i$f$Layout\\3\\116":I
    const v14, -0x4ee9b9da

    const-string v15, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v8, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 118
    invoke-static {v8, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 119
    .local v4, "compositeKeyHash\\3":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v14

    .line 120
    .local v14, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v8, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    .line 122
    .local v15, "materialized\\3":Landroidx/compose/ui/Modifier;
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v16

    shl-int/lit8 v5, v12, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/lit8 v5, v5, 0x6

    .line 121
    move-object/from16 v17, v16

    .local v5, "$changed\\4":I
    .local v17, "factory\\4":Lkotlin/jvm/functions/Function0;
    const/16 v16, 0x0

    .line 123
    .local v16, "$i$f$ReusableComposeNode\\4\\121":I
    const v1, -0x2942ffcf

    const-string v2, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v8, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 124
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v1

    instance-of v1, v1, Landroidx/compose/runtime/Applier;

    if-nez v1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 125
    :cond_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 126
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 127
    move-object/from16 v1, v17

    .end local v17    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v1, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 129
    .end local v1    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v17    # "factory\\4":Lkotlin/jvm/functions/Function0;
    :cond_3
    move-object/from16 v1, v17

    .end local v17    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v1    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 131
    :goto_1
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .local v2, "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 132
    .local v17, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\131\\3":I
    sget-object v18, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v19, v1

    .end local v1    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v19, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v2, v11, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .local v1, "block\\6":Lkotlin/jvm/functions/Function2;
    const/16 v18, 0x0

    .line 136
    .local v18, "$i$f$set-impl\\6\\135":I
    move-object/from16 v20, v2

    .local v20, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 137
    .local v21, "$i$a$-with-Updater$set$1\\7\\136\\6":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v22

    if-nez v22, :cond_5

    move-object/from16 v22, v3

    .end local v3    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .local v22, "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    move/from16 v23, v4

    .end local v4    # "compositeKeyHash\\3":I
    .local v23, "compositeKeyHash\\3":I
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v4, v20

    goto :goto_3

    .end local v22    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v23    # "compositeKeyHash\\3":I
    .restart local v3    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .restart local v4    # "compositeKeyHash\\3":I
    :cond_5
    move-object/from16 v22, v3

    move/from16 v23, v4

    .line 138
    .end local v3    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v4    # "compositeKeyHash\\3":I
    .restart local v22    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .restart local v23    # "compositeKeyHash\\3":I
    :goto_2
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v4, v20

    .end local v20    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .local v4, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 139
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    :goto_3
    nop

    .line 136
    .end local v4    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$a$-with-Updater$set$1\\7\\136\\6":I
    nop

    .line 141
    nop

    .line 142
    .end local v1    # "block\\6":Lkotlin/jvm/functions/Function2;
    .end local v18    # "$i$f$set-impl\\6\\135":I
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v2, v15, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 143
    nop

    .line 131
    .end local v2    # "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\131\\3":I
    nop

    .line 144
    shr-int/lit8 v1, v5, 0x6

    and-int/lit8 v1, v1, 0xe

    .local v1, "$changed\\8":I
    move-object v2, v8

    .local v2, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 145
    .local v3, "$i$a$-Layout-ColumnKt$Column$1\\8\\144\\2":I
    const v4, -0x16ef5699

    move/from16 v17, v1

    .end local v1    # "$changed\\8":I
    .local v17, "$changed\\8":I
    const-string v1, "C88@4444L9:Column.kt#2w3rfo"

    invoke-static {v2, v4, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    shr-int/lit8 v4, v7, 0x6

    and-int/lit8 v4, v4, 0x70

    or-int/lit8 v4, v4, 0x6

    .local v4, "$changed\\9":I
    check-cast v1, Landroidx/compose/foundation/layout/ColumnScope;

    .local v1, "$this$ReminderRow_u24lambda_u2417_u24lambda_u2416\\9":Landroidx/compose/foundation/layout/ColumnScope;
    move-object/from16 v45, v2

    .local v45, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 58
    .local v18, "$i$a$-Column-RemindersScreenKt$ReminderRow$2$1\\9\\145\\0":I
    move-object/from16 v20, v1

    .end local v1    # "$this$ReminderRow_u24lambda_u2417_u24lambda_u2416\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .local v20, "$this$ReminderRow_u24lambda_u2417_u24lambda_u2416\\9":Landroidx/compose/foundation/layout/ColumnScope;
    const v1, -0x38acc4ad

    move-object/from16 v21, v2

    .end local v2    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v21, "$composer\\8":Landroidx/compose/runtime/Composer;
    const-string v2, "C59@2308L10,57@2212L224,64@2560L10,62@2453L194:RemindersScreen.kt#2thlc2"

    move/from16 v49, v3

    move-object/from16 v3, v45

    .end local v45    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v3, "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v49, "$i$a$-Layout-ColumnKt$Column$1\\8\\144\\2":I
    invoke-static {v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 59
    const/16 v1, 0x20

    const/4 v2, 0x0

    move/from16 v50, v4

    const/4 v4, 0x2

    .end local v4    # "$changed\\9":I
    .local v50, "$changed\\9":I
    invoke-static {v0, v1, v2, v4, v2}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v24

    .line 60
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v3, v4}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material3/Typography;->getTitleMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v44

    .line 61
    invoke-virtual/range {p1 .. p1}, Lcom/example/data/Dhikr;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/ColorScheme;->getOnSurface-0d7_KjU()J

    move-result-wide v25

    goto :goto_4

    :cond_6
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/ColorScheme;->getOnSurfaceVariant-0d7_KjU()J

    move-result-wide v25

    :goto_4
    move-wide/from16 v26, v25

    .line 59
    nop

    .line 61
    nop

    .line 60
    nop

    .line 58
    const/16 v25, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const v48, 0xfffa

    move-object/from16 v45, v3

    .end local v3    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v45    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v24 .. v48}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 64
    .end local v45    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v3    # "$composer\\9":Landroidx/compose/runtime/Composer;
    const-string v2, ""

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->substringAfter(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    .line 65
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v1, v3, v4}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v44

    .line 66
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/ColorScheme;->getOnSurfaceVariant-0d7_KjU()J

    move-result-wide v26

    .line 64
    nop

    .line 66
    nop

    .line 65
    nop

    .line 63
    nop

    .end local v3    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v45    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v24 .. v48}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 58
    invoke-static/range {v45 .. v45}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 68
    nop

    .line 145
    .end local v18    # "$i$a$-Column-RemindersScreenKt$ReminderRow$2$1\\9\\145\\0":I
    .end local v20    # "$this$ReminderRow_u24lambda_u2417_u24lambda_u2416\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .end local v45    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v50    # "$changed\\9":I
    invoke-static/range {v21 .. v21}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 144
    .end local v17    # "$changed\\8":I
    .end local v21    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v49    # "$i$a$-Layout-ColumnKt$Column$1\\8\\144\\2":I
    nop

    .line 146
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 123
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 147
    nop

    .line 117
    .end local v5    # "$changed\\4":I
    .end local v16    # "$i$f$ReusableComposeNode\\4\\121":I
    .end local v19    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 148
    nop

    .line 110
    .end local v12    # "$changed\\3":I
    .end local v13    # "$i$f$Layout\\3\\116":I
    .end local v14    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v15    # "materialized\\3":Landroidx/compose/ui/Modifier;
    .end local v23    # "compositeKeyHash\\3":I
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 149
    nop

    .end local v6    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .end local v7    # "$changed\\2":I
    .end local v8    # "$composer\\2":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$Column\\2\\57":I
    .end local v10    # "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v11    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v22    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_5

    .line 56
    :cond_7
    move-object/from16 v2, p3

    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 69
    :cond_8
    :goto_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method static final ReminderRow$lambda$20(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 9
    .param p0, "$dhikr"    # Lcom/example/data/Dhikr;
    .param p1, "$onToggle"    # Lkotlin/jvm/functions/Function0;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    const-string v0, "C69@2723L14,69@2694L44:RemindersScreen.kt#2thlc2"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.ReminderRow.<anonymous> (RemindersScreen.kt:69)"

    const v2, -0x7b0d4a38

    invoke-static {v2, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 70
    :cond_1
    invoke-virtual {p0}, Lcom/example/data/Dhikr;->isEnabled()Z

    move-result v3

    const v0, 0x131c67b6

    const-string v1, "CC(remember):RemindersScreen.kt#9igjgp"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid\\1":Z
    move-object v1, p2

    .local v1, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 150
    .local v2, "$i$f$cache\\1\\70":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\1":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 151
    .local v5, "$i$a$-let-ComposerKt$cache$1\\2\\150\\1":I
    if-nez v0, :cond_3

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_2

    goto :goto_1

    .line 155
    :cond_2
    goto :goto_2

    .line 152
    :cond_3
    :goto_1
    const/4 v6, 0x0

    .line 70
    .local v6, "$i$a$-cache-RemindersScreenKt$ReminderRow$3$1\\3\\152\\0":I
    new-instance v7, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda10;

    invoke-direct {v7, p1}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda10;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 152
    .end local v6    # "$i$a$-cache-RemindersScreenKt$ReminderRow$3$1\\3\\152\\0":I
    nop

    .line 153
    .local v7, "value\\2":Ljava/lang/Object;
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 154
    move-object v4, v7

    .line 150
    .end local v4    # "it\\1":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1\\2\\150\\1":I
    .end local v7    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 70
    .end local v0    # "invalid\\1":Z
    .end local v1    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\1\\70":I
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v5, 0x0

    move-object v6, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v3 .. v8}, Lcom/example/ui/oneui/OneUIKt;->OneUISwitch(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_3

    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_4
    move-object v6, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v6    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_5
    :goto_3
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p2
.end method

.method static final ReminderRow$lambda$20$lambda$19$lambda$18(Lkotlin/jvm/functions/Function0;Z)Lkotlin/Unit;
    .locals 1
    .param p0, "$onToggle"    # Lkotlin/jvm/functions/Function0;
    .param p1, "it"    # Z

    .line 70
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final ReminderRow$lambda$21(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p2, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p1, p3, v0}, Lcom/example/ui/screens/RemindersScreenKt;->ReminderRow(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final RemindersContent(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .param p0, "all"    # Ljava/util/List;
    .param p1, "onBack"    # Lkotlin/jvm/functions/Function0;
    .param p2, "onToggle"    # Lkotlin/jvm/functions/Function1;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/data/Dhikr;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move-object/from16 v13, p2

    move/from16 v14, p4

    const-string v1, "all"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onBack"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onToggle"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    const v1, -0x2aa5791a

    move-object/from16 v2, p3

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v10, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(RemindersContent)N(all,onBack,onToggle)31@1163L489,27@1039L613:RemindersScreen.kt#2thlc2"

    invoke-static {v10, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p4

    .local v2, "$dirty":I
    and-int/lit8 v3, v14, 0x6

    if-nez v3, :cond_1

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_3

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_1

    :cond_2
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v14, 0x180

    const/16 v5, 0x100

    if-nez v3, :cond_5

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v5

    goto :goto_2

    :cond_4
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    move v15, v2

    .end local v2    # "$dirty":I
    .local v15, "$dirty":I
    and-int/lit16 v2, v15, 0x93

    const/16 v3, 0x92

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v2, v3, :cond_6

    move v2, v7

    goto :goto_3

    :cond_6
    move v2, v6

    :goto_3
    and-int/lit8 v3, v15, 0x1

    invoke-interface {v10, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, -0x1

    const-string v3, "com.example.ui.screens.RemindersContent (RemindersScreen.kt:25)"

    invoke-static {v1, v15, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 27
    :cond_7
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$count\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 81
    .local v2, "$i$f$count\\1\\27":I
    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_8

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    move v3, v6

    goto :goto_5

    .line 82
    :cond_8
    const/4 v3, 0x0

    .line 83
    .local v3, "count\\1":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_9
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element\\1":Ljava/lang/Object;
    move-object v11, v9

    check-cast v11, Lcom/example/data/Dhikr;

    .local v11, "it\\2":Lcom/example/data/Dhikr;
    const/4 v12, 0x0

    .line 27
    .local v12, "$i$a$-count-RemindersScreenKt$RemindersContent$active$1\\2\\83\\0":I
    invoke-virtual {v11}, Lcom/example/data/Dhikr;->isEnabled()Z

    move-result v11

    .line 83
    .end local v11    # "it\\2":Lcom/example/data/Dhikr;
    .end local v12    # "$i$a$-count-RemindersScreenKt$RemindersContent$active$1\\2\\83\\0":I
    if-eqz v11, :cond_9

    add-int/lit8 v3, v3, 0x1

    if-gez v3, :cond_9

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .end local v9    # "element\\1":Ljava/lang/Object;
    goto :goto_4

    .line 84
    :cond_a
    nop

    .line 27
    .end local v1    # "$this$count\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$count\\1\\27":I
    .end local v3    # "count\\1":I
    :goto_5
    move v1, v3

    .line 29
    .local v1, "active":I
    nop

    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v8, " \u0645\u0646 "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u0645\u0641\u0639\u0651\u0644\u0629"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 31
    nop

    .line 32
    const v2, -0x172b76b1

    const-string v8, "CC(remember):RemindersScreen.kt#9igjgp"

    invoke-static {v10, v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v8, v15, 0x380

    if-ne v8, v5, :cond_b

    move v6, v7

    :cond_b
    or-int/2addr v2, v6

    .local v2, "invalid\\3":Z
    move-object v5, v10

    .local v5, "$this$cache\\3":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 85
    .local v6, "$i$f$cache\\3\\32":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\3":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 86
    .local v8, "$i$a$-let-ComposerKt$cache$1\\4\\85\\3":I
    if-nez v2, :cond_d

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_c

    goto :goto_6

    .line 90
    :cond_c
    goto :goto_7

    .line 87
    :cond_d
    :goto_6
    const/4 v9, 0x0

    .line 32
    .local v9, "$i$a$-cache-RemindersScreenKt$RemindersContent$1\\5\\87\\0":I
    new-instance v11, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v11, v0, v13}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 87
    .end local v9    # "$i$a$-cache-RemindersScreenKt$RemindersContent$1\\5\\87\\0":I
    nop

    .line 88
    .local v11, "value\\4":Ljava/lang/Object;
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 89
    move-object v7, v11

    .line 85
    .end local v7    # "it\\3":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1\\4\\85\\3":I
    .end local v11    # "value\\4":Ljava/lang/Object;
    :goto_7
    nop

    .line 32
    .end local v2    # "invalid\\3":Z
    .end local v5    # "$this$cache\\3":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\3\\32":I
    move-object v9, v7

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shl-int/lit8 v2, v15, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int/lit8 v11, v2, 0x6

    .line 28
    move v2, v1

    .end local v1    # "active":I
    .local v2, "active":I
    const-string v1, "\u0627\u0644\u062a\u0646\u0628\u064a\u0647\u0627\u062a"

    move v5, v2

    .end local v2    # "active":I
    .local v5, "active":I
    const/4 v2, 0x0

    move v6, v5

    .end local v5    # "active":I
    .local v6, "active":I
    const/4 v5, 0x0

    move v7, v6

    .end local v6    # "active":I
    .local v7, "active":I
    const/4 v6, 0x0

    move v8, v7

    .end local v7    # "active":I
    .local v8, "active":I
    const/4 v7, 0x0

    move v12, v8

    .end local v8    # "active":I
    .local v12, "active":I
    const/4 v8, 0x0

    move/from16 v16, v12

    .end local v12    # "active":I
    .local v16, "active":I
    const/16 v12, 0xf2

    invoke-static/range {v1 .. v12}, Lcom/example/ui/oneui/OneUIKt;->OneUIScreen-gMrHQkA(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/lazy/LazyListState;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v16    # "active":I
    goto :goto_8

    .line 25
    :cond_e
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 46
    :cond_f
    :goto_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_10

    new-instance v2, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda2;

    invoke-direct {v2, v0, v4, v13, v14}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda2;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_10
    return-void
.end method

.method static final RemindersContent$lambda$11$lambda$10(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;
    .locals 13
    .param p0, "$all"    # Ljava/util/List;
    .param p1, "$onToggle"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$this$OneUIScreen"    # Landroidx/compose/foundation/lazy/LazyListScope;

    const-string v0, "$this$OneUIScreen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    sget-object v0, Lcom/example/ui/screens/ComposableSingletons$RemindersScreenKt;->INSTANCE:Lcom/example/ui/screens/ComposableSingletons$RemindersScreenKt;

    invoke-virtual {v0}, Lcom/example/ui/screens/ComposableSingletons$RemindersScreenKt;->getLambda$1944684617$app()Lkotlin/jvm/functions/Function3;

    move-result-object v4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    .end local p2    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    .local v1, "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    goto :goto_0

    .line 36
    .end local v1    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    .restart local p2    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    :cond_0
    move-object v1, p2

    .end local p2    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    .restart local v1    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    new-instance p2, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda9;

    invoke-direct {p2, p0, p1}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda9;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    const v0, 0x4a7a6420    # 4102408.0f

    const/4 v2, 0x1

    invoke-static {v0, v2, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v10, p2

    check-cast v10, Lkotlin/jvm/functions/Function3;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v8, "group"

    const/4 v9, 0x0

    move-object v7, v1

    .end local v1    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    .local v7, "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/lazy/LazyListScope$-CC;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 45
    .end local v7    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    .restart local v1    # "$this$OneUIScreen":Landroidx/compose/foundation/lazy/LazyListScope;
    :goto_0
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p2
.end method

.method static final RemindersContent$lambda$11$lambda$10$lambda$9(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10
    .param p0, "$all"    # Ljava/util/List;
    .param p1, "$onToggle"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$this$item"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C36@1360L262,36@1350L272:RemindersScreen.kt#2thlc2"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p4, 0x1

    invoke-interface {p3, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.screens.RemindersContent.<anonymous>.<anonymous>.<anonymous> (RemindersScreen.kt:36)"

    const v3, 0x4a7a6420    # 4102408.0f

    invoke-static {v3, p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    :cond_1
    new-instance v0, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0, p1}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda7;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    const/16 v1, 0x36

    const v3, 0x18c9f495

    invoke-static {v3, v2, v0, p3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function3;

    const/16 v8, 0x6000

    const/16 v9, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v7, p3

    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v9}, Lcom/example/ui/oneui/OneUIKt;->OneUICard-uDo3WH8(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 36
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p3    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_2
    move-object v7, p3

    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 43
    :cond_3
    :goto_1
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p3
.end method

.method static final RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 19
    .param p0, "$all"    # Ljava/util/List;
    .param p1, "$onToggle"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$this$OneUICard"    # Landroidx/compose/foundation/layout/ColumnScope;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "$this$OneUICard"

    move-object/from16 v4, p2

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "C*39@1563L19,39@1544L38:RemindersScreen.kt#2thlc2"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x11

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v5, :cond_0

    move v3, v7

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    and-int/lit8 v5, v2, 0x1

    invoke-interface {v1, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, -0x1

    const-string v5, "com.example.ui.screens.RemindersContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RemindersScreen.kt:37)"

    const v8, 0x18c9f495

    invoke-static {v8, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 38
    :cond_1
    move-object/from16 v3, p0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$sortedBy\\1":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 99
    .local v5, "$i$f$sortedBy\\1\\38":I
    new-instance v8, Lcom/example/ui/screens/RemindersScreenKt$RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$sortedBy$1;

    invoke-direct {v8}, Lcom/example/ui/screens/RemindersScreenKt$RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$sortedBy$1;-><init>()V

    check-cast v8, Ljava/util/Comparator;

    invoke-static {v3, v8}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    .end local v3    # "$this$sortedBy\\1":Ljava/lang/Iterable;
    .end local v5    # "$i$f$sortedBy\\1\\38":I
    check-cast v3, Ljava/lang/Iterable;

    .line 38
    nop

    .local v3, "$this$forEachIndexed\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 100
    .local v5, "$i$f$forEachIndexed\\2\\38":I
    const/4 v8, 0x0

    .line 101
    .local v8, "index\\2":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "item\\2":Ljava/lang/Object;
    add-int/lit8 v11, v8, 0x1

    .end local v8    # "index\\2":I
    .local v11, "index\\2":I
    if-gez v8, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_2
    move-object v12, v10

    check-cast v12, Lcom/example/data/Dhikr;

    .local v8, "i\\3":I
    .local v12, "dhikr\\3":Lcom/example/data/Dhikr;
    const/4 v13, 0x0

    .line 39
    .local v13, "$i$a$-forEachIndexed-RemindersScreenKt$RemindersContent$1$1$1$1$2\\3\\101\\0":I
    if-lez v8, :cond_3

    const v14, -0x81577c2

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v14, "38@1505L14"

    invoke-static {v1, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v14, v1, v6, v7}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    const v14, 0x54fb212

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_2
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 40
    const v14, -0x815707d

    const-string v15, "CC(remember):RemindersScreen.kt#9igjgp"

    invoke-static {v1, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v14, v15

    .local v14, "invalid\\4":Z
    move-object/from16 v15, p3

    .local v15, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 102
    .local v16, "$i$f$cache\\4\\40":I
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it\\4":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 103
    .local v17, "$i$a$-let-ComposerKt$cache$1\\5\\102\\4":I
    if-nez v14, :cond_5

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_4

    goto :goto_3

    .line 107
    :cond_4
    goto :goto_4

    .line 104
    :cond_5
    :goto_3
    const/4 v6, 0x0

    .line 40
    .local v6, "$i$a$-cache-RemindersScreenKt$RemindersContent$1$1$1$1$2$1\\6\\104\\3":I
    new-instance v2, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda8;

    invoke-direct {v2, v0, v12}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda8;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)V

    .line 104
    .end local v6    # "$i$a$-cache-RemindersScreenKt$RemindersContent$1$1$1$1$2$1\\6\\104\\3":I
    nop

    .line 105
    .local v2, "value\\5":Ljava/lang/Object;
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 106
    move-object v7, v2

    .line 102
    .end local v2    # "value\\5":Ljava/lang/Object;
    .end local v7    # "it\\4":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1\\5\\102\\4":I
    :goto_4
    nop

    .line 40
    .end local v14    # "invalid\\4":Z
    .end local v15    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache\\4\\40":I
    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v2, 0x0

    invoke-static {v12, v7, v1, v2}, Lcom/example/ui/screens/RemindersScreenKt;->ReminderRow(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 41
    nop

    .line 101
    .end local v8    # "i\\3":I
    .end local v12    # "dhikr\\3":Lcom/example/data/Dhikr;
    .end local v13    # "$i$a$-forEachIndexed-RemindersScreenKt$RemindersContent$1$1$1$1$2\\3\\101\\0":I
    move v6, v2

    move v8, v11

    const/4 v7, 0x1

    move/from16 v2, p4

    .end local v10    # "item\\2":Ljava/lang/Object;
    goto :goto_1

    .line 108
    .end local v11    # "index\\2":I
    .local v8, "index\\2":I
    :cond_6
    nop

    .end local v3    # "$this$forEachIndexed\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEachIndexed\\2\\38":I
    .end local v8    # "index\\2":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_5

    .line 37
    :cond_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 42
    :cond_8
    :goto_5
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2
.end method

.method static final RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Lcom/example/data/Dhikr;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onToggle"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$dhikr"    # Lcom/example/data/Dhikr;

    .line 40
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final RemindersContent$lambda$12(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p3, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p1, p2, p4, v0}, Lcom/example/ui/screens/RemindersScreenKt;->RemindersContent(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final RemindersScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p0, "viewModel"    # Lcom/example/ui/viewmodel/MainViewModel;
    .param p1, "onBack"    # Lkotlin/jvm/functions/Function0;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/viewmodel/MainViewModel;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    const v0, 0x361102bb

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string p2, "C(RemindersScreen)N(viewModel,onBack)20@793L29,21@862L24,21@827L60:RemindersScreen.kt#2thlc2"

    invoke-static {v5, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move p2, p3

    .local p2, "$dirty":I
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr p2, v1

    :cond_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_1

    :cond_2
    const/16 v1, 0x10

    :goto_1
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    and-int/lit8 v2, p2, 0x1

    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, -0x1

    const-string v2, "com.example.ui.screens.RemindersScreen (RemindersScreen.kt:19)"

    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 21
    :cond_5
    invoke-virtual {p0}, Lcom/example/ui/viewmodel/MainViewModel;->getAllDhikr()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 22
    .local v0, "allDhikr$delegate":Landroidx/compose/runtime/State;
    invoke-static {v0}, Lcom/example/ui/screens/RemindersScreenKt;->RemindersScreen$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v1

    const v2, -0xa24a86d

    const-string v3, "CC(remember):RemindersScreen.kt#9igjgp"

    invoke-static {v5, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid\\1":Z
    move-object v3, v5

    .local v3, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 75
    .local v4, "$i$f$cache\\1\\22":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\1":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 76
    .local v7, "$i$a$-let-ComposerKt$cache$1\\2\\75\\1":I
    if-nez v2, :cond_7

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_6

    goto :goto_3

    .line 80
    :cond_6
    goto :goto_4

    .line 77
    :cond_7
    :goto_3
    const/4 v8, 0x0

    .line 22
    .local v8, "$i$a$-cache-RemindersScreenKt$RemindersScreen$1\\3\\77\\0":I
    new-instance v9, Lcom/example/ui/screens/RemindersScreenKt$RemindersScreen$1$1;

    invoke-direct {v9, p0}, Lcom/example/ui/screens/RemindersScreenKt$RemindersScreen$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v9, Lkotlin/reflect/KFunction;

    .line 77
    .end local v8    # "$i$a$-cache-RemindersScreenKt$RemindersScreen$1\\3\\77\\0":I
    nop

    .line 78
    .local v9, "value\\2":Ljava/lang/Object;
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 79
    move-object v6, v9

    .line 75
    .end local v6    # "it\\1":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1\\2\\75\\1":I
    .end local v9    # "value\\2":Ljava/lang/Object;
    :goto_4
    nop

    .line 22
    .end local v2    # "invalid\\1":Z
    .end local v3    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\22":I
    check-cast v6, Lkotlin/reflect/KFunction;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v2, p2, 0x70

    invoke-static {v1, p1, v6, v5, v2}, Lcom/example/ui/screens/RemindersScreenKt;->RemindersContent(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v0    # "allDhikr$delegate":Landroidx/compose/runtime/State;
    goto :goto_5

    .line 19
    :cond_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 23
    :cond_9
    :goto_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1, p3}, Lcom/example/ui/screens/RemindersScreenKt$$ExternalSyntheticLambda1;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method

.method private static final RemindersScreen$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 4
    .param p0, "$allDhikr$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/example/data/Dhikr;",
            ">;"
        }
    .end annotation

    .line 21
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 98
    .local v3, "$i$f$getValue\\1\\21":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\21":I
    check-cast v0, Ljava/util/List;

    .line 21
    return-object v0
.end method

.method static final RemindersScreen$lambda$2(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p2, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p1, p3, v0}, Lcom/example/ui/screens/RemindersScreenKt;->RemindersScreen(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
