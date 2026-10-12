.class public final synthetic Lcom/example/data/TagDao$-CC;
.super Ljava/lang/Object;
.source "TagDao.kt"


# direct methods
.method public static $default$updateDhikrTags(Lcom/example/data/TagDao;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Lcom/example/data/TagDao;

    .line 0
    invoke-static {p0, p1, p2, p3}, Lcom/example/data/TagDao$-CC;->updateDhikrTags$suspendImpl(Lcom/example/data/TagDao;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$updateDhikrTags$jd(Lcom/example/data/TagDao;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/example/data/TagDao;
    .param p1, "dhikrId"    # I
    .param p2, "tagIds"    # Ljava/util/List;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 12
    invoke-static {p0, p1, p2, p3}, Lcom/example/data/TagDao$-CC;->$default$updateDhikrTags(Lcom/example/data/TagDao;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic updateDhikrTags$suspendImpl(Lcom/example/data/TagDao;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p0, "$this"    # Lcom/example/data/TagDao;
    .param p1, "dhikrId"    # I
    .param p2, "tagIds"    # Ljava/util/List;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/TagDao;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 0
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/example/data/TagDao$updateDhikrTags$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/example/data/TagDao$updateDhikrTags$1;

    iget v4, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v4, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->label:I

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/example/data/TagDao$updateDhikrTags$1;

    invoke-direct {v3, v0, v2}, Lcom/example/data/TagDao$updateDhikrTags$1;-><init>(Lcom/example/data/TagDao;Lkotlin/coroutines/Continuation;)V

    .local v3, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v4, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->result:Ljava/lang/Object;

    .local v4, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 62
    iget v6, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->label:I

    packed-switch v6, :pswitch_data_0

    move-object/from16 v6, p2

    .end local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .restart local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget v1, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->I$0:I

    .end local p1    # "dhikrId":I
    .local v1, "dhikrId":I
    iget-object v5, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    .local v5, "refs":Ljava/util/List;
    iget-object v6, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    .end local p2    # "tagIds":Ljava/util/List;
    .local v6, "tagIds":Ljava/util/List;
    iget-object v7, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$0:Ljava/lang/Object;

    move-object v0, v7

    check-cast v0, Lcom/example/data/TagDao;

    .end local p0    # "$this":Lcom/example/data/TagDao;
    .local v0, "$this":Lcom/example/data/TagDao;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    .end local v0    # "$this":Lcom/example/data/TagDao;
    .end local v1    # "dhikrId":I
    .end local v5    # "refs":Ljava/util/List;
    .end local v6    # "tagIds":Ljava/util/List;
    .restart local p0    # "$this":Lcom/example/data/TagDao;
    .restart local p1    # "dhikrId":I
    .restart local p2    # "tagIds":Ljava/util/List;
    :pswitch_1
    iget v1, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->I$0:I

    .end local p1    # "dhikrId":I
    .restart local v1    # "dhikrId":I
    iget-object v6, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    .end local p2    # "tagIds":Ljava/util/List;
    .restart local v6    # "tagIds":Ljava/util/List;
    iget-object v7, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$0:Ljava/lang/Object;

    move-object v0, v7

    check-cast v0, Lcom/example/data/TagDao;

    .end local p0    # "$this":Lcom/example/data/TagDao;
    .restart local v0    # "$this":Lcom/example/data/TagDao;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    .end local v0    # "$this":Lcom/example/data/TagDao;
    .end local v1    # "dhikrId":I
    .end local v6    # "tagIds":Ljava/util/List;
    .restart local p0    # "$this":Lcom/example/data/TagDao;
    .restart local p1    # "dhikrId":I
    .restart local p2    # "tagIds":Ljava/util/List;
    :pswitch_2
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    iput-object v0, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$0:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$1:Ljava/lang/Object;

    iput v1, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->I$0:I

    const/4 v7, 0x1

    iput v7, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->label:I

    invoke-interface {v0, v1, v3}, Lcom/example/data/TagDao;->deleteTagsForDhikr(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_1

    .line 62
    return-object v5

    .line 65
    .end local p0    # "$this":Lcom/example/data/TagDao;
    .end local p1    # "dhikrId":I
    .end local p2    # "tagIds":Ljava/util/List;
    .restart local v0    # "$this":Lcom/example/data/TagDao;
    .restart local v1    # "dhikrId":I
    .restart local v6    # "tagIds":Ljava/util/List;
    :cond_1
    :goto_1
    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 72
    .local v8, "$i$f$map\\1\\65":I
    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v7, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination\\2":Ljava/util/Collection;
    move-object v10, v7

    .local v10, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 73
    .local v11, "$i$f$mapTo\\2\\72":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 74
    .local v13, "item\\2":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    .local v14, "it\\3":J
    const/16 v16, 0x0

    .line 65
    .local v16, "$i$a$-map-TagDao$updateDhikrTags$refs$1\\3\\74\\0":I
    new-instance v2, Lcom/example/data/DhikrTagCrossRef;

    invoke-direct {v2, v1, v14, v15}, Lcom/example/data/DhikrTagCrossRef;-><init>(IJ)V

    .line 74
    .end local v14    # "it\\3":J
    .end local v16    # "$i$a$-map-TagDao$updateDhikrTags$refs$1\\3\\74\\0":I
    invoke-interface {v9, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p3

    goto :goto_2

    .line 75
    .end local v13    # "item\\2":Ljava/lang/Object;
    :cond_2
    nop

    .end local v9    # "destination\\2":Ljava/util/Collection;
    .end local v10    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapTo\\2\\72":I
    move-object v2, v9

    check-cast v2, Ljava/util/List;

    .line 72
    nop

    .line 65
    .end local v7    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v8    # "$i$f$map\\1\\65":I
    nop

    .line 66
    .local v2, "refs":Ljava/util/List;
    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_4

    .line 67
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$1:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->L$2:Ljava/lang/Object;

    iput v1, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->I$0:I

    const/4 v7, 0x2

    iput v7, v3, Lcom/example/data/TagDao$updateDhikrTags$1;->label:I

    invoke-interface {v0, v2, v3}, Lcom/example/data/TagDao;->insertDhikrTagCrossRefs(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_3

    .line 62
    return-object v5

    .line 67
    :cond_3
    move-object v5, v2

    .line 69
    .end local v2    # "refs":Ljava/util/List;
    .restart local v5    # "refs":Ljava/util/List;
    :goto_3
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .end local v5    # "refs":Ljava/util/List;
    .restart local v2    # "refs":Ljava/util/List;
    :cond_4
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
