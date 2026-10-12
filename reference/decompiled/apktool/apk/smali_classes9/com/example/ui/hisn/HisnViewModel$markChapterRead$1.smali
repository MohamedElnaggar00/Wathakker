.class final Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "HisnViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/hisn/HisnViewModel;->markChapterRead(I)V
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
    c = "com.example.ui.hisn.HisnViewModel$markChapterRead$1"
    f = "HisnViewModel.kt"
    i = {}
    l = {
        0x3f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $chapterId:I

.field label:I

.field final synthetic this$0:Lcom/example/ui/hisn/HisnViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/hisn/HisnViewModel;ILkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/hisn/HisnViewModel;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    iput p2, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->$chapterId:I

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

    new-instance v0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;

    iget-object v1, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    iget v2, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->$chapterId:I

    invoke-direct {v0, v1, v2, p2}, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;-><init>(Lcom/example/ui/hisn/HisnViewModel;ILkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 62
    iget v1, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    iget-object v1, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    invoke-static {v1}, Lcom/example/ui/hisn/HisnViewModel;->access$getDao$p(Lcom/example/ui/hisn/HisnViewModel;)Lcom/example/data/HisnDao;

    move-result-object v1

    new-instance v2, Lcom/example/data/HisnRead;

    iget v5, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->$chapterId:I

    iget-object v3, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->this$0:Lcom/example/ui/hisn/HisnViewModel;

    invoke-static {v3}, Lcom/example/ui/hisn/HisnViewModel;->access$getToday(Lcom/example/ui/hisn/HisnViewModel;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/example/data/HisnRead;-><init>(JILjava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x1

    iput v4, p0, Lcom/example/ui/hisn/HisnViewModel$markChapterRead$1;->label:I

    invoke-interface {v1, v2, v3}, Lcom/example/data/HisnDao;->insertRead(Lcom/example/data/HisnRead;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 62
    return-object v0

    .line 64
    :cond_0
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
