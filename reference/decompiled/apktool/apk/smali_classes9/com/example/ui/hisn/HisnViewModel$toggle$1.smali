.class final Lcom/example/ui/hisn/HisnViewModel$toggle$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "HisnViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/hisn/HisnViewModel;->toggle(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHisnViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HisnViewModel.kt\ncom/example/ui/hisn/HisnViewModel$toggle$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1761#2,3:68\n*S KotlinDebug\n*F\n+ 1 HisnViewModel.kt\ncom/example/ui/hisn/HisnViewModel$toggle$1\n*L\n56#1:68,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.ui.hisn.HisnViewModel$toggle$1"
    f = "HisnViewModel.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x39,
        0x39
    }
    m = "invokeSuspend"
    n = {
        "exists",
        "exists"
    }
    s = {
        "I$0",
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $chapterId:I

.field final synthetic $itemId:I

.field I$0:I

.field label:I

.field final synthetic this$0:Lcom/example/ui/hisn/HisnViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/hisn/HisnViewModel;IILkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/hisn/HisnViewModel;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/hisn/HisnViewModel$toggle$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    iput p2, p0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$chapterId:I

    iput p3, p0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$itemId:I

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;

    iget-object v1, p0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    iget v2, p0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$chapterId:I

    iget v3, p0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$itemId:I

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/example/ui/hisn/HisnViewModel$toggle$1;-><init>(Lcom/example/ui/hisn/HisnViewModel;IILkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 55
    iget v2, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget v1, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->I$0:I

    .local v1, "exists":Z
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    .end local v1    # "exists":Z
    :pswitch_1
    iget v1, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->I$0:I

    .restart local v1    # "exists":Z
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    .end local v1    # "exists":Z
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    iget-object v2, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    invoke-virtual {v2}, Lcom/example/ui/hisn/HisnViewModel;->getFavorites()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$any\\1":Ljava/lang/Iterable;
    iget v3, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$chapterId:I

    iget v4, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$itemId:I

    const/4 v5, 0x0

    .line 68
    .local v5, "$i$f$any\\1\\56":I
    instance-of v6, v2, Ljava/util/Collection;

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_0

    move-object v6, v2

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 69
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element\\1":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/example/data/HisnFavorite;

    .local v10, "it\\2":Lcom/example/data/HisnFavorite;
    const/4 v11, 0x0

    .line 56
    .local v11, "$i$a$-any-HisnViewModel$toggle$1$exists$1\\2\\69\\0":I
    invoke-virtual {v10}, Lcom/example/data/HisnFavorite;->getChapterId()I

    move-result v12

    if-ne v12, v3, :cond_2

    invoke-virtual {v10}, Lcom/example/data/HisnFavorite;->getItemId()I

    move-result v12

    if-ne v12, v4, :cond_2

    move v10, v7

    goto :goto_0

    :cond_2
    move v10, v8

    .line 69
    .end local v10    # "it\\2":Lcom/example/data/HisnFavorite;
    .end local v11    # "$i$a$-any-HisnViewModel$toggle$1$exists$1\\2\\69\\0":I
    :goto_0
    if-eqz v10, :cond_1

    move v8, v7

    goto :goto_1

    .line 70
    .end local v9    # "element\\1":Ljava/lang/Object;
    :cond_3
    nop

    .line 56
    .end local v2    # "$this$any\\1":Ljava/lang/Iterable;
    .end local v5    # "$i$f$any\\1\\56":I
    :goto_1
    nop

    .line 57
    .local v8, "exists":Z
    iget-object v2, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    invoke-static {v2}, Lcom/example/ui/hisn/HisnViewModel;->access$getDao$p(Lcom/example/ui/hisn/HisnViewModel;)Lcom/example/data/HisnDao;

    move-result-object v2

    if-eqz v8, :cond_5

    iget v3, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$chapterId:I

    iget v4, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$itemId:I

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v8, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->I$0:I

    iput v7, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->label:I

    invoke-interface {v2, v3, v4, v5}, Lcom/example/data/HisnDao;->removeFavorite(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    .line 55
    return-object v1

    .line 57
    :cond_4
    move v1, v8

    .end local v8    # "exists":Z
    .restart local v1    # "exists":Z
    :goto_2
    goto :goto_4

    .end local v1    # "exists":Z
    .restart local v8    # "exists":Z
    :cond_5
    new-instance v9, Lcom/example/data/HisnFavorite;

    iget v12, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$chapterId:I

    iget v13, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->$itemId:I

    const/4 v14, 0x1

    const/4 v15, 0x0

    const-wide/16 v10, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/example/data/HisnFavorite;-><init>(JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v8, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->I$0:I

    const/4 v4, 0x2

    iput v4, v0, Lcom/example/ui/hisn/HisnViewModel$toggle$1;->label:I

    invoke-interface {v2, v9, v3}, Lcom/example/data/HisnDao;->addFavorite(Lcom/example/data/HisnFavorite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    .line 55
    return-object v1

    .line 57
    :cond_6
    move v1, v8

    .line 58
    .end local v8    # "exists":Z
    .restart local v1    # "exists":Z
    :goto_3
    nop

    :goto_4
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
