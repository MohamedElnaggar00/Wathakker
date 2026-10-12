.class public final Lcom/example/ui/screens/FontPickerDialogKt;
.super Ljava/lang/Object;
.source "FontPickerDialog.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFontPickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontPickerDialog.kt\ncom/example/ui/screens/FontPickerDialogKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,70:1\n1878#2,2:71\n1880#2:122\n113#3:73\n113#3:74\n113#3:81\n1282#4,6:75\n99#5:82\n96#5,6:83\n102#5:117\n106#5:121\n79#6,6:89\n86#6,4:104\n90#6,2:114\n94#6:120\n368#7,9:95\n377#7:116\n378#7,2:118\n4034#8,6:108\n*S KotlinDebug\n*F\n+ 1 FontPickerDialog.kt\ncom/example/ui/screens/FontPickerDialogKt\n*L\n37#1:71,2\n37#1:122\n38#1:73\n42#1:74\n47#1:81\n43#1:75,6\n39#1:82\n39#1:83,6\n39#1:117\n39#1:121\n39#1:89,6\n39#1:104,4\n39#1:114,2\n39#1:120\n39#1:95,9\n39#1:116\n39#1:118,2\n39#1:108,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "FontPickerDialog",
        "",
        "selected",
        "Lcom/example/ui/theme/FontChoice;",
        "onSelect",
        "Lkotlin/Function1;",
        "onDismiss",
        "Lkotlin/Function0;",
        "(Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
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
.method public static final FontPickerDialog(Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .param p0, "selected"    # Lcom/example/ui/theme/FontChoice;
    .param p1, "onSelect"    # Lkotlin/jvm/functions/Function1;
    .param p2, "onDismiss"    # Lkotlin/jvm/functions/Function0;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/theme/FontChoice;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/ui/theme/FontChoice;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "selected"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const v0, 0x6c22e151

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string p3, "C(FontPickerDialog)N(selected,onSelect,onDismiss)35@1252L1210,30@1122L1340:FontPickerDialog.kt#2thlc2"

    invoke-static {v8, p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move p3, p4

    .local p3, "$dirty":I
    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object v1, p0

    check-cast v1, Ljava/lang/Enum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr p3, v1

    :cond_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_1

    :cond_2
    const/16 v1, 0x10

    :goto_1
    or-int/2addr p3, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_2

    :cond_4
    const/16 v1, 0x80

    :goto_2
    or-int/2addr p3, v1

    :cond_5
    and-int/lit16 v1, p3, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x1

    if-eq v1, v2, :cond_6

    move v1, v3

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, p3, 0x1

    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, -0x1

    const-string v2, "com.example.ui.screens.FontPickerDialog (FontPickerDialog.kt:29)"

    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 32
    :cond_7
    nop

    .line 33
    nop

    .line 34
    nop

    .line 35
    nop

    .line 36
    new-instance v0, Lcom/example/ui/screens/FontPickerDialogKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1, p2, p0}, Lcom/example/ui/screens/FontPickerDialogKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/example/ui/theme/FontChoice;)V

    const/16 v1, 0x36

    const v2, -0x77477470

    invoke-static {v2, v3, v0, v8, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function3;

    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0x70

    const v1, 0x186186

    or-int v9, v0, v1

    .line 31
    const-string v1, "\u0627\u0644\u062e\u0637"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "\u0625\u063a\u0644\u0627\u0642"

    const/4 v6, 0x0

    const/16 v10, 0x28

    move-object v2, p2

    .end local p2    # "onDismiss":Lkotlin/jvm/functions/Function0;
    .local v2, "onDismiss":Lkotlin/jvm/functions/Function0;
    invoke-static/range {v1 .. v10}, Lcom/example/ui/oneui/OneUIDialogKt;->OneUIDialog(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_4

    .line 25
    .end local v2    # "onDismiss":Lkotlin/jvm/functions/Function0;
    .restart local p2    # "onDismiss":Lkotlin/jvm/functions/Function0;
    :cond_8
    move-object v2, p2

    .end local p2    # "onDismiss":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "onDismiss":Lkotlin/jvm/functions/Function0;
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 69
    :cond_9
    :goto_4
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lcom/example/ui/screens/FontPickerDialogKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p1, v2, p4}, Lcom/example/ui/screens/FontPickerDialogKt$$ExternalSyntheticLambda2;-><init>(Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method

.method static final FontPickerDialog$lambda$4(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/example/ui/theme/FontChoice;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 68
    .param p0, "$onSelect"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$onDismiss"    # Lkotlin/jvm/functions/Function0;
    .param p2, "$selected"    # Lcom/example/ui/theme/FontChoice;
    .param p3, "$this$OneUIDialog"    # Landroidx/compose/foundation/layout/ColumnScope;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move/from16 v3, p5

    const-string v4, "$this$OneUIDialog"

    move-object/from16 v5, p3

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "C*42@1531L100,38@1381L1065:FontPickerDialog.kt#2thlc2"

    invoke-static {v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x11

    const/16 v6, 0x10

    if-eq v4, v6, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    and-int/lit8 v6, v3, 0x1

    invoke-interface {v2, v4, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, -0x1

    const-string v6, "com.example.ui.screens.FontPickerDialog.<anonymous> (FontPickerDialog.kt:36)"

    const v9, -0x77477470

    invoke-static {v9, v3, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    :cond_1
    invoke-static {}, Lcom/example/ui/theme/FontChoice;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 71
    .local v6, "$i$f$forEachIndexed\\1\\37":I
    const/4 v9, 0x0

    .line 72
    .local v9, "index\\1":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "item\\1":Ljava/lang/Object;
    add-int/lit8 v12, v9, 0x1

    .end local v9    # "index\\1":I
    .local v12, "index\\1":I
    if-gez v9, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_2
    move-object v13, v11

    check-cast v13, Lcom/example/ui/theme/FontChoice;

    .local v9, "index\\2":I
    .local v13, "choice\\2":Lcom/example/ui/theme/FontChoice;
    const/4 v14, 0x0

    .line 38
    .local v14, "$i$a$-forEachIndexed-FontPickerDialogKt$FontPickerDialog$1$1\\2\\72\\0":I
    const/4 v15, 0x6

    if-lez v9, :cond_3

    const v8, -0xccae34f

    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "37@1342L26"

    invoke-static {v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 v8, 0x4

    .local v8, "$this$dp\\3":I
    const/16 v16, 0x0

    .line 73
    .local v16, "$i$f$getDp\\3\\38":I
    int-to-float v7, v8

    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 38
    .end local v8    # "$this$dp\\3":I
    .end local v16    # "$i$f$getDp\\3\\38":I
    const/4 v8, 0x0

    invoke-static {v7, v2, v15, v8}, Lcom/example/ui/oneui/OneUIKt;->OneUIDivider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    const v7, 0x735a222b

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_2
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 40
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    .line 41
    const/4 v8, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    const/4 v3, 0x1

    invoke-static {v7, v8, v3, v15}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 42
    const/16 v8, 0xe

    .local v8, "$this$dp\\4":I
    const/4 v15, 0x0

    .line 74
    .local v15, "$i$f$getDp\\4\\42":I
    int-to-float v3, v8

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 42
    .end local v8    # "$this$dp\\4":I
    .end local v15    # "$i$f$getDp\\4\\42":I
    invoke-static {v3}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/graphics/Shape;

    invoke-static {v7, v3}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    .line 43
    const v3, -0xccacb65

    const-string v7, "CC(remember):FontPickerDialog.kt#9igjgp"

    invoke-static {v2, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    move-object v7, v13

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    .local v3, "invalid\\5":Z
    move-object/from16 v7, p4

    .local v7, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 75
    .local v8, "$i$f$cache\\5\\43":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it\\5":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 76
    .local v18, "$i$a$-let-ComposerKt$cache$1\\6\\75\\5":I
    if-nez v3, :cond_5

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v15, v2, :cond_4

    goto :goto_3

    .line 80
    :cond_4
    goto :goto_4

    .line 77
    :cond_5
    :goto_3
    const/4 v2, 0x0

    .line 43
    .local v2, "$i$a$-cache-FontPickerDialogKt$FontPickerDialog$1$1$1\\7\\77\\2":I
    move/from16 v19, v2

    .end local v2    # "$i$a$-cache-FontPickerDialogKt$FontPickerDialog$1$1$1\\7\\77\\2":I
    .local v19, "$i$a$-cache-FontPickerDialogKt$FontPickerDialog$1$1$1\\7\\77\\2":I
    new-instance v2, Lcom/example/ui/screens/FontPickerDialogKt$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, v13, v1}, Lcom/example/ui/screens/FontPickerDialogKt$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .end local v19    # "$i$a$-cache-FontPickerDialogKt$FontPickerDialog$1$1$1\\7\\77\\2":I
    nop

    .line 78
    .local v2, "value\\6":Ljava/lang/Object;
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 79
    move-object v15, v2

    .line 75
    .end local v2    # "value\\6":Ljava/lang/Object;
    .end local v15    # "it\\5":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1\\6\\75\\5":I
    :goto_4
    nop

    .line 43
    .end local v3    # "invalid\\5":Z
    .end local v7    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache\\5\\43":I
    move-object/from16 v21, v15

    check-cast v21, Lkotlin/jvm/functions/Function0;

    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v22, 0x7

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 47
    const/16 v3, 0x8

    .local v3, "$this$dp\\8":I
    const/4 v7, 0x0

    .line 81
    .local v7, "$i$f$getDp\\8\\47":I
    int-to-float v8, v3

    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 47
    .end local v3    # "$this$dp\\8":I
    .end local v7    # "$i$f$getDp\\8\\47":I
    const/16 v7, 0xd

    .local v7, "$this$dp\\9":I
    const/4 v8, 0x0

    .line 81
    .local v8, "$i$f$getDp\\9\\47":I
    int-to-float v15, v7

    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 47
    .end local v7    # "$this$dp\\9":I
    .end local v8    # "$i$f$getDp\\9\\47":I
    invoke-static {v2, v3, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 48
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v3

    .line 39
    nop

    .local v2, "modifier\\10":Landroidx/compose/ui/Modifier;
    .local v3, "verticalAlignment\\10":Landroidx/compose/ui/Alignment$Vertical;
    const/16 v7, 0x180

    .local v7, "$changed\\10":I
    move-object/from16 v8, p4

    .local v8, "$composer\\10":Landroidx/compose/runtime/Composer;
    const/4 v15, 0x0

    .line 82
    .local v15, "$i$f$Row\\10\\39":I
    const v0, 0x2952b718

    const-string v1, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo"

    invoke-static {v8, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 83
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    .line 87
    .local v0, "horizontalArrangement\\10":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    shr-int/lit8 v1, v7, 0x3

    and-int/lit8 v1, v1, 0xe

    shr-int/lit8 v17, v7, 0x3

    and-int/lit8 v17, v17, 0x70

    or-int v1, v1, v17

    invoke-static {v0, v3, v8, v1}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    .local v1, "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v17, v7, 0x3

    and-int/lit8 v17, v17, 0x70

    .line 88
    nop

    .local v17, "$changed\\11":I
    const/16 v18, 0x0

    .line 89
    .local v18, "$i$f$Layout\\11\\88":I
    move-object/from16 v19, v0

    .end local v0    # "horizontalArrangement\\10":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v19, "horizontalArrangement\\10":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const v0, -0x4ee9b9da

    move-object/from16 v20, v3

    .end local v3    # "verticalAlignment\\10":Landroidx/compose/ui/Alignment$Vertical;
    .local v20, "verticalAlignment\\10":Landroidx/compose/ui/Alignment$Vertical;
    const-string v3, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v8, v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 90
    const/4 v0, 0x0

    invoke-static {v8, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v3

    .line 91
    .local v3, "compositeKeyHash\\11":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v0

    .line 92
    .local v0, "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 v21, v3

    .end local v3    # "compositeKeyHash\\11":I
    .local v21, "compositeKeyHash\\11":I
    invoke-static {v8, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 94
    .local v3, "materialized\\11":Landroidx/compose/ui/Modifier;
    sget-object v22, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v22

    move-object/from16 v23, v2

    .end local v2    # "modifier\\10":Landroidx/compose/ui/Modifier;
    .local v23, "modifier\\10":Landroidx/compose/ui/Modifier;
    shl-int/lit8 v2, v17, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x6

    .line 93
    nop

    .local v2, "$changed\\12":I
    move-object/from16 v24, v22

    .local v24, "factory\\12":Lkotlin/jvm/functions/Function0;
    const/16 v22, 0x0

    .line 95
    .local v22, "$i$f$ReusableComposeNode\\12\\93":I
    move/from16 v25, v2

    .end local v2    # "$changed\\12":I
    .local v25, "$changed\\12":I
    const v2, -0x2942ffcf

    move-object/from16 v26, v4

    .end local v4    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .local v26, "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    const-string v4, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v8, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 96
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v2

    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    if-nez v2, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 97
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 98
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 99
    move-object/from16 v2, v24

    .end local v24    # "factory\\12":Lkotlin/jvm/functions/Function0;
    .local v2, "factory\\12":Lkotlin/jvm/functions/Function0;
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    .line 101
    .end local v2    # "factory\\12":Lkotlin/jvm/functions/Function0;
    .restart local v24    # "factory\\12":Lkotlin/jvm/functions/Function0;
    :cond_7
    move-object/from16 v2, v24

    .end local v24    # "factory\\12":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "factory\\12":Lkotlin/jvm/functions/Function0;
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 103
    :goto_5
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .local v4, "$this$Layout_u24lambda_u240\\13":Landroidx/compose/runtime/Composer;
    const/16 v24, 0x0

    .line 104
    .local v24, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\13\\103\\11":I
    sget-object v27, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v28, v2

    .end local v2    # "factory\\12":Lkotlin/jvm/functions/Function0;
    .local v28, "factory\\12":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v4, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v4, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .local v2, "block\\14":Lkotlin/jvm/functions/Function2;
    const/16 v27, 0x0

    .line 108
    .local v27, "$i$f$set-impl\\14\\107":I
    move-object/from16 v29, v4

    .local v29, "$this$set_impl_u24lambda_u240\\14":Landroidx/compose/runtime/Composer;
    const/16 v30, 0x0

    .line 109
    .local v30, "$i$a$-with-Updater$set$1\\15\\108\\14":I
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v31

    if-nez v31, :cond_9

    move-object/from16 v31, v0

    .end local v0    # "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    .local v31, "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v32, v1

    .end local v1    # "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v32, "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_6

    :cond_8
    move-object/from16 v1, v29

    goto :goto_7

    .end local v31    # "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v32    # "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v0    # "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v1    # "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    :cond_9
    move-object/from16 v31, v0

    move-object/from16 v32, v1

    .line 110
    .end local v0    # "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v1    # "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v31    # "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v32    # "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    :goto_6
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, v29

    .end local v29    # "$this$set_impl_u24lambda_u240\\14":Landroidx/compose/runtime/Composer;
    .local v1, "$this$set_impl_u24lambda_u240\\14":Landroidx/compose/runtime/Composer;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 111
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 113
    :goto_7
    nop

    .line 108
    .end local v1    # "$this$set_impl_u24lambda_u240\\14":Landroidx/compose/runtime/Composer;
    .end local v30    # "$i$a$-with-Updater$set$1\\15\\108\\14":I
    nop

    .line 113
    nop

    .line 114
    .end local v2    # "block\\14":Lkotlin/jvm/functions/Function2;
    .end local v27    # "$i$f$set-impl\\14\\107":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v3, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    nop

    .line 103
    .end local v4    # "$this$Layout_u24lambda_u240\\13":Landroidx/compose/runtime/Composer;
    .end local v24    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\13\\103\\11":I
    nop

    .line 116
    shr-int/lit8 v0, v25, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\16":I
    move-object v1, v8

    .local v1, "$composer\\16":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 117
    .local v2, "$i$a$-Layout-RowKt$Row$1\\16\\116\\10":I
    const v4, -0x184f2606

    move/from16 v24, v0

    .end local v0    # "$changed\\16":I
    .local v24, "$changed\\16":I
    const-string v0, "C101@5126L9:Row.kt#2w3rfo"

    invoke-static {v1, v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    shr-int/lit8 v4, v7, 0x6

    and-int/lit8 v4, v4, 0x70

    or-int/lit8 v4, v4, 0x6

    .local v4, "$changed\\17":I
    move-object/from16 v33, v0

    check-cast v33, Landroidx/compose/foundation/layout/RowScope;

    .local v33, "$this$FontPickerDialog_u24lambda_u244_u24lambda_u243_u24lambda_u242\\17":Landroidx/compose/foundation/layout/RowScope;
    move-object v0, v1

    .local v0, "$composer\\17":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 50
    .local v16, "$i$a$-Row-FontPickerDialogKt$FontPickerDialog$1$1$2\\17\\117\\2":I
    move-object/from16 v27, v1

    .end local v1    # "$composer\\16":Landroidx/compose/runtime/Composer;
    .local v27, "$composer\\16":Landroidx/compose/runtime/Composer;
    const v1, -0x4d79aed6

    move/from16 v29, v2

    .end local v2    # "$i$a$-Layout-RowKt$Row$1\\16\\116\\10":I
    .local v29, "$i$a$-Layout-RowKt$Row$1\\16\\116\\10":I
    const-string v2, "C52@1930L10,56@2119L11,49@1794L364:FontPickerDialog.kt#2thlc2"

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 51
    invoke-virtual {v13}, Lcom/example/ui/theme/FontChoice;->getTitleAr()Ljava/lang/String;

    move-result-object v1

    .line 52
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 v34, v2

    check-cast v34, Landroidx/compose/ui/Modifier;

    const/16 v37, 0x2

    const/16 v38, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v36, 0x0

    invoke-static/range {v33 .. v38}, Landroidx/compose/foundation/layout/RowScope$-CC;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v35

    .line 53
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    move-object/from16 v34, v1

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v0, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material3/Typography;->getBodyLarge()Landroidx/compose/ui/text/TextStyle;

    move-result-object v36

    .line 54
    invoke-static {v13}, Lcom/example/ui/theme/TypeKt;->fontFamilyFor(Lcom/example/ui/theme/FontChoice;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v44

    .line 53
    const v66, 0xffffdf

    const/16 v67, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    invoke-static/range {v36 .. v67}, Landroidx/compose/ui/text/TextStyle;->copy-p1EtxEg$default(Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v54

    .line 56
    const/16 v1, 0x13

    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v38

    .line 57
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v2, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v1, v0, v2}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material3/ColorScheme;->getOnSurface-0d7_KjU()J

    move-result-wide v36

    .line 51
    nop

    .line 52
    nop

    .line 57
    nop

    .line 56
    nop

    .line 53
    nop

    .line 50
    const/16 v40, 0x0

    const-wide/16 v43, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v56, 0xc00

    const v58, 0xfff0

    move-object/from16 v55, v0

    .end local v0    # "$composer\\17":Landroidx/compose/runtime/Composer;
    .local v55, "$composer\\17":Landroidx/compose/runtime/Composer;
    invoke-static/range {v34 .. v58}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 59
    move-object/from16 v1, v55

    .end local v55    # "$composer\\17":Landroidx/compose/runtime/Composer;
    .local v1, "$composer\\17":Landroidx/compose/runtime/Composer;
    move-object/from16 v0, p2

    if-ne v13, v0, :cond_a

    const v2, -0x4d73be82

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "62@2373L11,59@2221L193"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 61
    sget-object v2, Landroidx/compose/material/icons/Icons$Filled;->INSTANCE:Landroidx/compose/material/icons/Icons$Filled;

    invoke-static {v2}, Landroidx/compose/material/icons/filled/CheckCircleKt;->getCheckCircle(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v34

    .line 62
    nop

    .line 63
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v0, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v1, v0}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    move-result-wide v37

    .line 60
    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v40, 0x30

    const/16 v41, 0x4

    move-object/from16 v39, v1

    .end local v1    # "$composer\\17":Landroidx/compose/runtime/Composer;
    .local v39, "$composer\\17":Landroidx/compose/runtime/Composer;
    invoke-static/range {v34 .. v41}, Landroidx/compose/material3/IconKt;->Icon-ww6aTOc(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    .line 59
    .end local v39    # "$composer\\17":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer\\17":Landroidx/compose/runtime/Composer;
    goto :goto_8

    :cond_a
    const v0, -0x4d9527b9

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_8
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 50
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 66
    nop

    .line 117
    .end local v1    # "$composer\\17":Landroidx/compose/runtime/Composer;
    .end local v4    # "$changed\\17":I
    .end local v16    # "$i$a$-Row-FontPickerDialogKt$FontPickerDialog$1$1$2\\17\\117\\2":I
    .end local v33    # "$this$FontPickerDialog_u24lambda_u244_u24lambda_u243_u24lambda_u242\\17":Landroidx/compose/foundation/layout/RowScope;
    invoke-static/range {v27 .. v27}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 116
    .end local v24    # "$changed\\16":I
    .end local v27    # "$composer\\16":Landroidx/compose/runtime/Composer;
    .end local v29    # "$i$a$-Layout-RowKt$Row$1\\16\\116\\10":I
    nop

    .line 118
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 95
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 119
    nop

    .line 89
    .end local v22    # "$i$f$ReusableComposeNode\\12\\93":I
    .end local v25    # "$changed\\12":I
    .end local v28    # "factory\\12":Lkotlin/jvm/functions/Function0;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 120
    nop

    .line 82
    .end local v3    # "materialized\\11":Landroidx/compose/ui/Modifier;
    .end local v17    # "$changed\\11":I
    .end local v18    # "$i$f$Layout\\11\\88":I
    .end local v21    # "compositeKeyHash\\11":I
    .end local v31    # "localMap\\11":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 121
    nop

    .line 67
    .end local v7    # "$changed\\10":I
    .end local v8    # "$composer\\10":Landroidx/compose/runtime/Composer;
    .end local v15    # "$i$f$Row\\10\\39":I
    .end local v19    # "horizontalArrangement\\10":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v20    # "verticalAlignment\\10":Landroidx/compose/ui/Alignment$Vertical;
    .end local v23    # "modifier\\10":Landroidx/compose/ui/Modifier;
    .end local v32    # "measurePolicy\\10":Landroidx/compose/ui/layout/MeasurePolicy;
    nop

    .line 72
    .end local v9    # "index\\2":I
    .end local v13    # "choice\\2":Lcom/example/ui/theme/FontChoice;
    .end local v14    # "$i$a$-forEachIndexed-FontPickerDialogKt$FontPickerDialog$1$1\\2\\72\\0":I
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move/from16 v3, p5

    move v9, v12

    move-object/from16 v4, v26

    .end local v11    # "item\\1":Ljava/lang/Object;
    goto/16 :goto_1

    .line 122
    .end local v12    # "index\\1":I
    .end local v26    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .local v4, "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .local v9, "index\\1":I
    :cond_b
    move-object/from16 v26, v4

    .end local v4    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v6    # "$i$f$forEachIndexed\\1\\37":I
    .end local v9    # "index\\1":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_9

    .line 36
    :cond_c
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 68
    :cond_d
    :goto_9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final FontPickerDialog$lambda$4$lambda$3$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onSelect"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$choice"    # Lcom/example/ui/theme/FontChoice;
    .param p2, "$onDismiss"    # Lkotlin/jvm/functions/Function0;

    .line 44
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 46
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final FontPickerDialog$lambda$5(Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p3, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p1, p2, p4, v0}, Lcom/example/ui/screens/FontPickerDialogKt;->FontPickerDialog(Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
