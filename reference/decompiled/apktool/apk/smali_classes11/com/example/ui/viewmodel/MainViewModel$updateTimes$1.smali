.class final Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MainViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/viewmodel/MainViewModel;->updateTimes(Lcom/example/data/Dhikr;Ljava/util/List;)V
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
    c = "com.example.ui.viewmodel.MainViewModel$updateTimes$1"
    f = "MainViewModel.kt"
    i = {
        0x0
    }
    l = {
        0xf0
    }
    m = "invokeSuspend"
    n = {
        "updated"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $dhikr:Lcom/example/data/Dhikr;

.field final synthetic $newTimes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/viewmodel/MainViewModel;


# direct methods
.method constructor <init>(Lcom/example/data/Dhikr;Ljava/util/List;Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Dhikr;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/ui/viewmodel/MainViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->$dhikr:Lcom/example/data/Dhikr;

    iput-object p2, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->$newTimes:Ljava/util/List;

    iput-object p3, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

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

    new-instance v0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;

    iget-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->$dhikr:Lcom/example/data/Dhikr;

    iget-object v2, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->$newTimes:Ljava/util/List;

    iget-object v3, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;-><init>(Lcom/example/data/Dhikr;Ljava/util/List;Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 238
    iget v1, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/Dhikr;

    .local v0, "updated":Lcom/example/data/Dhikr;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    .end local v0    # "updated":Lcom/example/data/Dhikr;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 239
    iget-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->$dhikr:Lcom/example/data/Dhikr;

    iget-object v6, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->$newTimes:Ljava/util/List;

    const/16 v11, 0xcf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v1 .. v12}, Lcom/example/data/Dhikr;->copy$default(Lcom/example/data/Dhikr;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILjava/lang/Object;)Lcom/example/data/Dhikr;

    move-result-object v1

    .line 240
    .local v1, "updated":Lcom/example/data/Dhikr;
    iget-object v2, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v2}, Lcom/example/ui/viewmodel/MainViewModel;->access$getRepository$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/data/DhikrRepository;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->label:I

    invoke-virtual {v2, v1, v3}, Lcom/example/data/DhikrRepository;->update(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 238
    return-object v0

    .line 240
    :cond_0
    move-object v0, v1

    .line 241
    .end local v1    # "updated":Lcom/example/data/Dhikr;
    .restart local v0    # "updated":Lcom/example/data/Dhikr;
    :goto_0
    iget-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$updateTimes$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v1}, Lcom/example/ui/viewmodel/MainViewModel;->access$getAlarmScheduler$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/alarm/AlarmScheduler;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/example/alarm/AlarmScheduler;->schedule(Lcom/example/data/Dhikr;)V

    .line 242
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
