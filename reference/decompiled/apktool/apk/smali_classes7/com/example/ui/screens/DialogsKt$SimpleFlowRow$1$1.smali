.class final Lcom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1;
.super Ljava/lang/Object;
.source "Dialogs.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/DialogsKt;->SimpleFlowRow-Kz89ssw(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dialogs.kt\ncom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1563#2:223\n1634#2,3:224\n1563#2:227\n1634#2,2:228\n1636#2:231\n1878#2,2:232\n1869#2,2:234\n1880#2:236\n1#3:230\n*S KotlinDebug\n*F\n+ 1 Dialogs.kt\ncom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1\n*L\n198#1:223\n198#1:224,3\n210#1:227\n210#1:228,2\n210#1:231\n214#1:232,2\n216#1:234,2\n214#1:236\n*E\n"
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


# instance fields
.field final synthetic $spacing:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, Lcom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1;->$spacing:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final measure_3p2s80s$lambda$5(Ljava/util/List;Ljava/util/List;IILandroidx/compose/ui/layout/Placeable$PlacementScope;)Lkotlin/Unit;
    .locals 20
    .param p0, "$rows"    # Ljava/util/List;
    .param p1, "$rowHeights"    # Ljava/util/List;
    .param p2, "$v"    # I
    .param p3, "$h"    # I
    .param p4, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    const-string v0, "$this$layout"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    const/4 v0, 0x0

    .line 214
    .local v0, "y":I
    move-object/from16 v8, p0

    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 232
    .local v9, "$i$f$forEachIndexed\\1\\214":I
    const/4 v2, 0x0

    .line 233
    .local v2, "index\\1":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v4, v0

    .end local v0    # "y":I
    .local v4, "y":I
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .local v0, "item\\1":Ljava/lang/Object;
    add-int/lit8 v11, v2, 0x1

    .end local v2    # "index\\1":I
    .local v11, "index\\1":I
    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    move-object v12, v0

    check-cast v12, Ljava/util/List;

    .local v2, "i\\2":I
    .local v12, "r\\2":Ljava/util/List;
    move v13, v2

    .end local v2    # "i\\2":I
    .local v13, "i\\2":I
    const/4 v14, 0x0

    .line 215
    .local v14, "$i$a$-forEachIndexed-DialogsKt$SimpleFlowRow$1$1$1$1\\2\\233\\0":I
    const/4 v2, 0x0

    .line 216
    .local v2, "x\\2":I
    move-object v15, v12

    check-cast v15, Ljava/lang/Iterable;

    .local v15, "$this$forEach\\3":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 234
    .local v16, "$i$f$forEach\\3\\216":I
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    move v3, v2

    .end local v2    # "x\\2":I
    .local v3, "x\\2":I
    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .local v18, "element\\3":Ljava/lang/Object;
    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/Placeable;

    .local v2, "pl\\4":Landroidx/compose/ui/layout/Placeable;
    const/16 v19, 0x0

    .line 216
    .local v19, "$i$a$-forEach-DialogsKt$SimpleFlowRow$1$1$1$1$1\\4\\234\\2":I
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v1

    add-int v1, v1, p3

    add-int/2addr v3, v1

    .line 234
    .end local v2    # "pl\\4":Landroidx/compose/ui/layout/Placeable;
    .end local v19    # "$i$a$-forEach-DialogsKt$SimpleFlowRow$1$1$1$1$1\\4\\234\\2":I
    move-object/from16 v1, p4

    .end local v18    # "element\\3":Ljava/lang/Object;
    goto :goto_1

    .line 235
    :cond_1
    nop

    .line 217
    .end local v15    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v16    # "$i$f$forEach\\3\\216":I
    move-object/from16 v1, p1

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int v2, v2, p2

    add-int/2addr v4, v2

    .line 218
    nop

    .line 233
    .end local v3    # "x\\2":I
    .end local v12    # "r\\2":Ljava/util/List;
    .end local v13    # "i\\2":I
    .end local v14    # "$i$a$-forEachIndexed-DialogsKt$SimpleFlowRow$1$1$1$1\\2\\233\\0":I
    move-object/from16 v1, p4

    move v2, v11

    .end local v0    # "item\\1":Ljava/lang/Object;
    goto :goto_0

    .line 236
    .end local v11    # "index\\1":I
    .local v2, "index\\1":I
    :cond_2
    move-object/from16 v1, p1

    .line 219
    .end local v2    # "index\\1":I
    .end local v8    # "$this$forEachIndexed\\1":Ljava/lang/Iterable;
    .end local v9    # "$i$f$forEachIndexed\\1\\214":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$maxIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 195
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$-CC;->$default$maxIntrinsicHeight(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$maxIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 195
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$-CC;->$default$maxIntrinsicWidth(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 24
    .param p1, "$this$Layout"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    const-string v2, "$this$Layout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "measurables"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    iget v2, v0, Lcom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1;->$spacing:F

    invoke-interface {v1, v2}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v9

    .line 197
    .local v9, "h":I
    iget v2, v0, Lcom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1;->$spacing:F

    invoke-interface {v1, v2}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v10

    .line 198
    .local v10, "v":I
    move-object v2, v8

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 223
    .local v3, "$i$f$map\\1\\198":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\2":Ljava/util/Collection;
    move-object v6, v2

    .local v6, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 224
    .local v7, "$i$f$mapTo\\2\\223":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 225
    .local v12, "item\\2":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .local v13, "it\\3":Landroidx/compose/ui/layout/Measurable;
    const/4 v14, 0x0

    .line 198
    .local v14, "$i$a$-map-DialogsKt$SimpleFlowRow$1$1$placeables$1\\3\\225\\0":I
    const/16 v21, 0xa

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-wide/from16 v15, p3

    move-object/from16 v23, v6

    .end local v6    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .local v23, "$this$mapTo\\2":Ljava/lang/Iterable;
    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v5

    invoke-interface {v13, v5, v6}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v5

    .line 225
    .end local v13    # "it\\3":Landroidx/compose/ui/layout/Measurable;
    .end local v14    # "$i$a$-map-DialogsKt$SimpleFlowRow$1$1$placeables$1\\3\\225\\0":I
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, v23

    const/16 v5, 0xa

    goto :goto_0

    .line 226
    .end local v12    # "item\\2":Ljava/lang/Object;
    .end local v23    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .restart local v6    # "$this$mapTo\\2":Ljava/lang/Iterable;
    :cond_0
    move-object/from16 v23, v6

    .end local v4    # "destination\\2":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\2\\223":I
    check-cast v4, Ljava/util/List;

    .line 223
    nop

    .line 198
    .end local v2    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\1\\198":I
    move-object v11, v4

    .line 199
    .local v11, "placeables":Ljava/util/List;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v12, v2

    check-cast v12, Ljava/util/List;

    .line 200
    .local v12, "rows":Ljava/util/List;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 201
    .local v2, "cur":Ljava/util/List;
    const/4 v3, 0x0

    .line 202
    .local v3, "w":I
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v13, v2

    move v14, v3

    .end local v2    # "cur":Ljava/util/List;
    .end local v3    # "w":I
    .local v13, "cur":Ljava/util/List;
    .local v14, "w":I
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/Placeable;

    .line 203
    .local v2, "pl":Landroidx/compose/ui/layout/Placeable;
    move-object v3, v13

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    add-int v3, v14, v9

    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v5

    add-int/2addr v3, v5

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v5

    if-le v3, v5, :cond_1

    .line 204
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    .end local v13    # "cur":Ljava/util/List;
    .local v3, "cur":Ljava/util/List;
    const/4 v14, 0x0

    move-object v13, v3

    .line 206
    .end local v3    # "cur":Ljava/util/List;
    .restart local v13    # "cur":Ljava/util/List;
    :cond_1
    move-object v3, v13

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    add-int/2addr v14, v9

    .line 207
    :cond_2
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v3

    add-int/2addr v14, v3

    .end local v2    # "pl":Landroidx/compose/ui/layout/Placeable;
    goto :goto_1

    .line 209
    :cond_3
    move-object v2, v13

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_4
    move-object v2, v12

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 227
    .local v3, "$i$f$map\\4\\210":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\5":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 228
    .local v6, "$i$f$mapTo\\5\\227":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 229
    .local v15, "item\\5":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Ljava/util/List;

    .local v16, "r\\6":Ljava/util/List;
    const/16 v17, 0x0

    .line 210
    .local v17, "$i$a$-map-DialogsKt$SimpleFlowRow$1$1$rowHeights$1\\6\\229\\0":I
    move-object/from16 v18, v16

    check-cast v18, Ljava/lang/Iterable;

    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_7

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroidx/compose/ui/layout/Placeable;

    .line 230
    .local v19, "it\\7":Landroidx/compose/ui/layout/Placeable;
    const/16 v20, 0x0

    .line 210
    .local v20, "$i$a$-maxOf-DialogsKt$SimpleFlowRow$1$1$rowHeights$1$1\\7\\210\\6":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v19

    move/from16 v0, v19

    .end local v19    # "it\\7":Landroidx/compose/ui/layout/Placeable;
    .end local v20    # "$i$a$-maxOf-DialogsKt$SimpleFlowRow$1$1$rowHeights$1$1\\7\\210\\6":I
    :goto_3
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_6

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroidx/compose/ui/layout/Placeable;

    .line 230
    .local v19, "it\\8":Landroidx/compose/ui/layout/Placeable;
    const/16 v20, 0x0

    .line 210
    .local v20, "$i$a$-maxOf-DialogsKt$SimpleFlowRow$1$1$rowHeights$1$1\\8\\210\\6":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v1

    .end local v19    # "it\\8":Landroidx/compose/ui/layout/Placeable;
    .end local v20    # "$i$a$-maxOf-DialogsKt$SimpleFlowRow$1$1$rowHeights$1$1\\8\\210\\6":I
    if-ge v0, v1, :cond_5

    move v0, v1

    :cond_5
    move-object/from16 v1, p1

    goto :goto_3

    .end local v16    # "r\\6":Ljava/util/List;
    .end local v17    # "$i$a$-map-DialogsKt$SimpleFlowRow$1$1$rowHeights$1\\6\\229\\0":I
    :cond_6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 229
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto :goto_2

    .line 210
    .restart local v16    # "r\\6":Ljava/util/List;
    .restart local v17    # "$i$a$-map-DialogsKt$SimpleFlowRow$1$1$rowHeights$1\\6\\229\\0":I
    :cond_7
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 231
    .end local v15    # "item\\5":Ljava/lang/Object;
    .end local v16    # "r\\6":Ljava/util/List;
    .end local v17    # "$i$a$-map-DialogsKt$SimpleFlowRow$1$1$rowHeights$1\\6\\229\\0":I
    :cond_8
    nop

    .end local v4    # "destination\\5":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\5\\227":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 227
    nop

    .line 210
    .end local v2    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\4\\210":I
    nop

    .line 211
    .local v0, "rowHeights":Ljava/util/List;
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->sumOfInt(Ljava/lang/Iterable;)I

    move-result v1

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    mul-int/2addr v2, v10

    add-int/2addr v1, v2

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v2

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v3

    invoke-static {v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v3

    .line 212
    .local v3, "totalH":I
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    new-instance v5, Lcom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v5, v12, v0, v10, v9}, Lcom/example/ui/screens/DialogsKt$SimpleFlowRow$1$1$$ExternalSyntheticLambda0;-><init>(Ljava/util/List;Ljava/util/List;II)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope$-CC;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    .line 219
    return-object v2
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$minIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 195
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$-CC;->$default$minIntrinsicHeight(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$minIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 195
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$-CC;->$default$minIntrinsicWidth(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result v0

    return v0
.end method
