.class final Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MainViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/viewmodel/MainViewModel;->addDhikrWithSchedule(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
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
    c = "com.example.ui.viewmodel.MainViewModel$addDhikrWithSchedule$1"
    f = "MainViewModel.kt"
    i = {
        0x0
    }
    l = {
        0xf8
    }
    m = "invokeSuspend"
    n = {
        "newDhikr"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $content:Ljava/lang/String;

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

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/viewmodel/MainViewModel;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/coroutines/Continuation;)V
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
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$title:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$content:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$times:Ljava/util/List;

    iput-object p4, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;

    iget-object v1, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$title:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$content:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$times:Ljava/util/List;

    iget-object v4, p0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 246
    iget v2, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Dhikr;

    .local v1, "newDhikr":Lcom/example/data/Dhikr;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    move-object v4, v1

    goto :goto_0

    .end local v1    # "newDhikr":Lcom/example/data/Dhikr;
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 247
    new-instance v2, Lcom/example/data/Dhikr;

    iget-object v4, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$title:Ljava/lang/String;

    iget-object v5, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$content:Ljava/lang/String;

    iget-object v7, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->$times:Ljava/util/List;

    const/16 v12, 0xc9

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lcom/example/data/Dhikr;-><init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .local v2, "newDhikr":Lcom/example/data/Dhikr;
    iget-object v3, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v3}, Lcom/example/ui/viewmodel/MainViewModel;->access$getRepository$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/data/DhikrRepository;

    move-result-object v3

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->label:I

    invoke-virtual {v3, v2, v4}, Lcom/example/data/DhikrRepository;->insert(Lcom/example/data/Dhikr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_0

    .line 246
    return-object v1

    .line 248
    :cond_0
    move-object v4, v2

    .end local v2    # "newDhikr":Lcom/example/data/Dhikr;
    .local v4, "newDhikr":Lcom/example/data/Dhikr;
    :goto_0
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    .line 249
    .local v1, "id":J
    long-to-int v5, v1

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

    move-result-object v3

    .line 250
    .local v3, "scheduledDhikr":Lcom/example/data/Dhikr;
    iget-object v5, v0, Lcom/example/ui/viewmodel/MainViewModel$addDhikrWithSchedule$1;->this$0:Lcom/example/ui/viewmodel/MainViewModel;

    invoke-static {v5}, Lcom/example/ui/viewmodel/MainViewModel;->access$getAlarmScheduler$p(Lcom/example/ui/viewmodel/MainViewModel;)Lcom/example/alarm/AlarmScheduler;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/example/alarm/AlarmScheduler;->schedule(Lcom/example/data/Dhikr;)V

    .line 251
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
