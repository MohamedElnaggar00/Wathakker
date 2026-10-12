.class final Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MainViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/viewmodel/MainViewModel;->toggleEnabled(Lcom/example/data/Dhikr;)V
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
    c = "com.example.ui.viewmodel.MainViewModel$toggleEnabled$1"
    f = "MainViewModel.kt"
    i = {
        0x0
    }
    l = {
        0xe4
    }
    m = "invokeSuspend"
    n = {
        "newState"
    }
    s = {
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $dhikr:Lcom/example/data/Dhikr;

.field I$0:I

.field label:I

.field final synthetic this$0:Lcom/example/ui/viewmodel/MainViewModel;


# direct methods
.method constructor <init>(Lcom/example/data/Dhikr;Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Dhikr;",
            "Lcom/example/ui/viewmodel/MainViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->$dhikr:Lcom/example/data/Dhikr;

    iput-object p2, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

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

    new-instance v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;

    iget-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->$dhikr:Lcom/example/data/Dhikr;

    iget-object v2, p0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-direct {v0, v1, v2, p2}, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;-><init>(Lcom/example/data/Dhikr;Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 226
    iget v2, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget v1, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->I$0:I

    .local v1, "newState":Z
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    .end local v1    # "newState":Z
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 227
    iget-object v2, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->$dhikr:Lcom/example/data/Dhikr;

    invoke-virtual {v2}, Lcom/example/data/Dhikr;->isEnabled()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    .line 228
    .local v2, "newState":Z
    iget-object v4, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v4}, Lcom/example/ui/viewmodel/MainViewModel;->access$getRepository$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/data/DhikrRepository;

    move-result-object v4

    iget-object v5, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->$dhikr:Lcom/example/data/Dhikr;

    if-eqz v2, :cond_0

    move v11, v3

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    move v11, v6

    :goto_0
    const/16 v15, 0xdf

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v5 .. v16}, Lcom/example/data/Dhikr;->copy$default(Lcom/example/data/Dhikr;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILjava/lang/Object;)Lcom/example/data/Dhikr;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v2, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->I$0:I

    iput v3, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->label:I

    invoke-virtual {v4, v5, v6}, Lcom/example/data/DhikrRepository;->update(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_1

    .line 226
    return-object v1

    .line 228
    :cond_1
    move v1, v2

    .line 229
    .end local v2    # "newState":Z
    .restart local v1    # "newState":Z
    :goto_1
    nop

    .line 232
    iget-object v2, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    .line 229
    if-eqz v1, :cond_2

    .line 230
    invoke-static {v2}, Lcom/example/ui/viewmodel/MainViewModel;->access$getAlarmScheduler$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/alarm/AlarmScheduler;

    move-result-object v2

    iget-object v3, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->$dhikr:Lcom/example/data/Dhikr;

    invoke-virtual {v2, v3}, Lcom/example/alarm/AlarmScheduler;->schedule(Lcom/example/data/Dhikr;)V

    goto :goto_2

    .line 232
    :cond_2
    invoke-static {v2}, Lcom/example/ui/viewmodel/MainViewModel;->access$getAlarmScheduler$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/alarm/AlarmScheduler;

    move-result-object v2

    iget-object v3, v0, Lcom/example/ui/viewmodel/MainViewModel$toggleEnabled$1;->$dhikr:Lcom/example/data/Dhikr;

    invoke-virtual {v2, v3}, Lcom/example/alarm/AlarmScheduler;->cancel(Lcom/example/data/Dhikr;)V

    .line 234
    :goto_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
