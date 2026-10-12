.class final Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MainViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/viewmodel/MainViewModel;->toggleFavorite(Lcom/example/data/Dhikr;)V
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
    c = "com.example.ui.viewmodel.MainViewModel$toggleFavorite$1"
    f = "MainViewModel.kt"
    i = {}
    l = {
        0xdd
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $dhikr:Lcom/example/data/Dhikr;

.field label:I

.field final synthetic this$0:Lcom/example/ui/viewmodel/MainViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/viewmodel/MainViewModel;",
            "Lcom/example/data/Dhikr;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->$dhikr:Lcom/example/data/Dhikr;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;

    iget-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v2, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->$dhikr:Lcom/example/data/Dhikr;

    invoke-direct {v0, v1, v2, p2}, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;-><init>(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 220
    iget v2, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 221
    iget-object v2, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v2}, Lcom/example/ui/viewmodel/MainViewModel;->access$getRepository$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/data/DhikrRepository;

    move-result-object v2

    iget-object v3, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->$dhikr:Lcom/example/data/Dhikr;

    iget-object v4, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->$dhikr:Lcom/example/data/Dhikr;

    invoke-virtual {v4}, Lcom/example/data/Dhikr;->isFavorite()Z

    move-result v4

    const/4 v15, 0x1

    xor-int/lit8 v7, v4, 0x1

    const/16 v13, 0xf7

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v3 .. v14}, Lcom/example/data/Dhikr;->copy$default(Lcom/example/data/Dhikr;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILjava/lang/Object;)Lcom/example/data/Dhikr;

    move-result-object v3

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput v15, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleFavorite$1;->label:I

    invoke-virtual {v2, v3, v4}, Lcom/example/data/DhikrRepository;->update(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    .line 220
    return-object v1

    .line 222
    :cond_0
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
