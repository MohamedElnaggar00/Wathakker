.class final Lcom/example/alarm/AlarmReceiver$onReceive$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AlarmReceiver.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/alarm/AlarmReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
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
    c = "com.example.alarm.AlarmReceiver$onReceive$1"
    f = "AlarmReceiver.kt"
    i = {
        0x0
    }
    l = {
        0x38
    }
    m = "invokeSuspend"
    n = {
        "db"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $id:I

.field final synthetic $pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;ILandroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Landroid/content/BroadcastReceiver$PendingResult;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/alarm/AlarmReceiver$onReceive$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$context:Landroid/content/Context;

    iput p2, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$id:I

    iput-object p3, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

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

    new-instance v0, Lcom/example/alarm/AlarmReceiver$onReceive$1;

    iget-object v1, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$context:Landroid/content/Context;

    iget v2, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$id:I

    iget-object v3, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/example/alarm/AlarmReceiver$onReceive$1;-><init>(Landroid/content/Context;ILandroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/alarm/AlarmReceiver$onReceive$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/alarm/AlarmReceiver$onReceive$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/alarm/AlarmReceiver$onReceive$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/alarm/AlarmReceiver$onReceive$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 53
    iget v1, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/AppDatabase;

    .local v0, "db":Lcom/example/data/AppDatabase;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, p1

    goto :goto_0

    .end local v0    # "db":Lcom/example/data/AppDatabase;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    nop

    .line 55
    :try_start_1
    sget-object v1, Lcom/example/data/AppDatabase;->Companion:Lcom/example/data/AppDatabase$Companion;

    iget-object v2, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/example/data/AppDatabase$Companion;->getDatabase(Landroid/content/Context;)Lcom/example/data/AppDatabase;

    move-result-object v1

    .line 56
    .local v1, "db":Lcom/example/data/AppDatabase;
    invoke-virtual {v1}, Lcom/example/data/AppDatabase;->dhikrDao()Lcom/example/data/DhikrDao;

    move-result-object v2

    iget v3, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$id:I

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->label:I

    invoke-interface {v2, v3, v4}, Lcom/example/data/DhikrDao;->getDhikrById(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 53
    return-object v0

    .line 56
    :cond_0
    move-object v0, v1

    .line 53
    .end local v1    # "db":Lcom/example/data/AppDatabase;
    .restart local v0    # "db":Lcom/example/data/AppDatabase;
    :goto_0
    check-cast v2, Lcom/example/data/Dhikr;

    .line 57
    .local v2, "dhikr":Lcom/example/data/Dhikr;
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/example/data/Dhikr;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 58
    new-instance v1, Lcom/example/alarm/AlarmScheduler;

    iget-object v3, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$context:Landroid/content/Context;

    invoke-direct {v1, v3}, Lcom/example/alarm/AlarmScheduler;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lcom/example/alarm/AlarmScheduler;->schedule(Lcom/example/data/Dhikr;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .end local v0    # "db":Lcom/example/data/AppDatabase;
    .end local v2    # "dhikr":Lcom/example/data/Dhikr;
    :cond_1
    iget-object v0, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 62
    nop

    .line 63
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 61
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/example/alarm/AlarmReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
