.class final Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MainViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/viewmodel/MainViewModel;->addDhikrWithScheduleAndTags(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
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
    c = "com.example.ui.viewmodel.MainViewModel$addDhikrWithScheduleAndTags$1"
    f = "MainViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x101,
        0x105
    }
    m = "invokeSuspend"
    n = {
        "newDhikr",
        "newDhikr",
        "scheduledDhikr",
        "id"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "J$0"
    }
.end annotation


# instance fields
.field final synthetic $content:Ljava/lang/String;

.field final synthetic $tagIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $times:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $title:Ljava/lang/String;

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/viewmodel/MainViewModel;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/ui/viewmodel/MainViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/ui/viewmodel/MainViewModel;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$title:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$content:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$times:Ljava/util/List;

    iput-object p4, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p5, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$tagIds:Ljava/util/List;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;

    iget-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$title:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$content:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$times:Ljava/util/List;

    iget-object v4, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v5, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$tagIds:Ljava/util/List;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/ui/viewmodel/MainViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 255
    iget v2, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-wide v1, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->J$0:J

    .local v1, "id":J
    iget-object v3, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/example/data/Dhikr;

    .local v3, "scheduledDhikr":Lcom/example/data/Dhikr;
    iget-object v4, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/example/data/Dhikr;

    .local v4, "newDhikr":Lcom/example/data/Dhikr;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    .end local v1    # "id":J
    .end local v3    # "scheduledDhikr":Lcom/example/data/Dhikr;
    .end local v4    # "newDhikr":Lcom/example/data/Dhikr;
    :pswitch_1
    iget-object v2, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Dhikr;

    .local v2, "newDhikr":Lcom/example/data/Dhikr;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    move-object v4, v2

    goto :goto_0

    .end local v2    # "newDhikr":Lcom/example/data/Dhikr;
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 256
    new-instance v3, Lcom/example/data/Dhikr;

    iget-object v5, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$title:Ljava/lang/String;

    iget-object v6, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$content:Ljava/lang/String;

    iget-object v8, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$times:Ljava/util/List;

    const/16 v13, 0xc9

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    invoke-direct/range {v3 .. v14}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v3

    .line 257
    .restart local v2    # "newDhikr":Lcom/example/data/Dhikr;
    iget-object v3, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v3}, Lcom/example/ui/viewmodel/MainViewModel;->access$getRepository$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/data/DhikrRepository;

    move-result-object v3

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->label:I

    invoke-virtual {v3, v2, v4}, Lcom/example/data/DhikrRepository;->insert(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_0

    .line 255
    return-object v1

    .line 257
    :cond_0
    move-object v4, v2

    .end local v2    # "newDhikr":Lcom/example/data/Dhikr;
    .restart local v4    # "newDhikr":Lcom/example/data/Dhikr;
    :goto_0
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    .line 258
    .local v2, "id":J
    long-to-int v5, v2

    const/16 v14, 0xfe

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    invoke-static/range {v4 .. v15}, Lcom/example/data/Dhikr;->copy$default(Lcom/example/data/Dhikr;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILjava/lang/Object;)Lcom/example/data/Dhikr;

    move-result-object v5

    .line 259
    .local v5, "scheduledDhikr":Lcom/example/data/Dhikr;
    iget-object v6, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v6}, Lcom/example/ui/viewmodel/MainViewModel;->access$getAlarmScheduler$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/alarm/AlarmScheduler;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/example/alarm/AlarmScheduler;->schedule(Lcom/example/data/Dhikr;)V

    .line 260
    iget-object v6, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$tagIds:Ljava/util/List;

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2

    .line 261
    iget-object v6, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v6}, Lcom/example/ui/viewmodel/MainViewModel;->access$getRepository$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/data/DhikrRepository;

    move-result-object v6

    long-to-int v7, v2

    iget-object v8, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->$tagIds:Ljava/util/List;

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->L$0:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->L$1:Ljava/lang/Object;

    iput-wide v2, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->J$0:J

    const/4 v10, 0x2

    iput v10, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithScheduleAndTags$1;->label:I

    invoke-virtual {v6, v7, v8, v9}, Lcom/example/data/DhikrRepository;->updateDhikrTags(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_1

    .line 255
    return-object v1

    .line 261
    :cond_1
    move-wide v1, v2

    move-object v3, v5

    .line 263
    .end local v2    # "id":J
    .end local v5    # "scheduledDhikr":Lcom/example/data/Dhikr;
    .restart local v1    # "id":J
    .restart local v3    # "scheduledDhikr":Lcom/example/data/Dhikr;
    :goto_1
    move-object v5, v3

    move-wide v2, v1

    .end local v1    # "id":J
    .end local v3    # "scheduledDhikr":Lcom/example/data/Dhikr;
    .restart local v2    # "id":J
    .restart local v5    # "scheduledDhikr":Lcom/example/data/Dhikr;
    :cond_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
