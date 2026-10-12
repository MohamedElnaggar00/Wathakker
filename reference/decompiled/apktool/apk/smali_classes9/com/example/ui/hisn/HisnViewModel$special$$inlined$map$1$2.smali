.class public final Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "Emitters.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HisnViewModel.kt\ncom/example/ui/hisn/HisnViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n38#3:51\n1193#4,2:52\n1267#4,4:54\n*S KotlinDebug\n*F\n+ 1 HisnViewModel.kt\ncom/example/ui/hisn/HisnViewModel\n*L\n38#1:52,2\n38#1:54,4\n*E\n"
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
.field final synthetic $this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/FlowCollector;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2;->$this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;

    iget v3, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;

    invoke-direct {v2, v0, v1}, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;-><init>(Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .local v2, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v3, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .local v3, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 37
    iget v5, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->label:I

    packed-switch v5, :pswitch_data_0

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v3    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget v4, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->I$0:I

    .local v4, "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0":I
    iget-object v5, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/flow/FlowCollector;

    .local v5, "$this$map_u24lambda_u245":Lkotlinx/coroutines/flow/FlowCollector;
    iget-object v6, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    .local v6, "value":Ljava/lang/Object;
    iget-object v7, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;

    .local v7, "$completion":Lkotlin/coroutines/Continuation;
    iget-object v8, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .end local p1    # "value":Ljava/lang/Object;
    .local v8, "value":Ljava/lang/Object;
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    .end local v4    # "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0":I
    .end local v5    # "$this$map_u24lambda_u245":Lkotlinx/coroutines/flow/FlowCollector;
    .end local v6    # "value":Ljava/lang/Object;
    .end local v7    # "$completion":Lkotlin/coroutines/Continuation;
    .end local v8    # "value":Ljava/lang/Object;
    .restart local p1    # "value":Ljava/lang/Object;
    :pswitch_1
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    iget-object v5, v0, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2;->$this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;

    .restart local v5    # "$this$map_u24lambda_u245":Lkotlinx/coroutines/flow/FlowCollector;
    move-object v7, v2

    .restart local v7    # "$completion":Lkotlin/coroutines/Continuation;
    move-object/from16 v6, p1

    .restart local v6    # "value":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 50
    .local v8, "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0":I
    move-object v9, v2

    check-cast v9, Lkotlin/coroutines/Continuation;

    .local v9, "$completion\\1":Lkotlin/coroutines/Continuation;
    move-object v10, v6

    check-cast v10, Ljava/util/List;

    .local v10, "l\\1":Ljava/util/List;
    const/4 v11, 0x0

    .line 51
    .local v11, "$i$a$-map-HisnViewModel$itemCounts$1\\1\\50\\0":I
    move-object v12, v10

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$associate\\2":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 52
    .local v13, "$i$f$associate\\2\\51":I
    const/16 v14, 0xa

    invoke-static {v12, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-static {v14}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v14

    const/16 v15, 0x10

    invoke-static {v14, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v14

    .line 53
    .local v14, "capacity\\2":I
    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15, v14}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v15, Ljava/util/Map;

    .local v15, "destination\\3":Ljava/util/Map;
    move-object/from16 v16, v12

    .local v16, "$this$associateTo\\3":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 54
    .local v17, "$i$f$associateTo\\3\\53":I
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_1

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .line 55
    .local v19, "element\\3":Ljava/lang/Object;
    move-object/from16 v20, v19

    check-cast v20, Lcom/example/data/ChapterItemCount;

    .local v20, "it\\4":Lcom/example/data/ChapterItemCount;
    const/16 v21, 0x0

    .line 51
    .local v21, "$i$a$-associate-HisnViewModel$itemCounts$1$1\\4\\55\\1":I
    invoke-virtual/range {v20 .. v20}, Lcom/example/data/ChapterItemCount;->getChapterId()I

    move-result v22

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Lcom/example/data/ChapterItemCount;->getItemCount()I

    move-result v22

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 55
    .end local v20    # "it\\4":Lcom/example/data/ChapterItemCount;
    .end local v21    # "$i$a$-associate-HisnViewModel$itemCounts$1$1\\4\\55\\1":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v15, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    goto :goto_1

    .line 57
    .end local v19    # "element\\3":Ljava/lang/Object;
    :cond_1
    nop

    .line 53
    .end local v15    # "destination\\3":Ljava/util/Map;
    .end local v16    # "$this$associateTo\\3":Ljava/lang/Iterable;
    .end local v17    # "$i$f$associateTo\\3\\53":I
    nop

    .line 51
    .end local v12    # "$this$associate\\2":Ljava/lang/Iterable;
    .end local v13    # "$i$f$associate\\2\\51":I
    .end local v14    # "capacity\\2":I
    nop

    .line 50
    .end local v9    # "$completion\\1":Lkotlin/coroutines/Continuation;
    .end local v10    # "l\\1":Ljava/util/List;
    .end local v11    # "$i$a$-map-HisnViewModel$itemCounts$1\\1\\50\\0":I
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    iput v8, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->I$0:I

    const/4 v0, 0x1

    iput v0, v2, Lcom/example/ui/hisn/HisnViewModel$special$$inlined$map$1$2$1;->label:I

    invoke-interface {v5, v15, v2}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_2

    .line 37
    return-object v4

    .line 50
    :cond_2
    move v4, v8

    move-object/from16 v8, p1

    .line 49
    .end local p1    # "value":Ljava/lang/Object;
    .restart local v4    # "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0":I
    .local v8, "value":Ljava/lang/Object;
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v4    # "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0":I
    .end local v5    # "$this$map_u24lambda_u245":Lkotlinx/coroutines/flow/FlowCollector;
    .end local v6    # "value":Ljava/lang/Object;
    .end local v7    # "$completion":Lkotlin/coroutines/Continuation;
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
