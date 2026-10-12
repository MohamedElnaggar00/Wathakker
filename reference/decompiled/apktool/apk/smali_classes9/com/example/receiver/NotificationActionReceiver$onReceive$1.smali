.class final Lcom/example/receiver/NotificationActionReceiver$onReceive$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NotificationActionReceiver.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/receiver/NotificationActionReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
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
    c = "com.example.receiver.NotificationActionReceiver$onReceive$1"
    f = "NotificationActionReceiver.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x25
    }
    m = "invokeSuspend"
    n = {
        "db",
        "repo"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $dhikrId:I

.field final synthetic $pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

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
            "Lcom/example/receiver/NotificationActionReceiver$onReceive$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$context:Landroid/content/Context;

    iput p2, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$dhikrId:I

    iput-object p3, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

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

    new-instance v0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;

    iget-object v1, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$context:Landroid/content/Context;

    iget v2, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$dhikrId:I

    iget-object v3, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;-><init>(Landroid/content/Context;ILandroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 33
    iget v1, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/DhikrRepository;

    .local v0, "repo":Lcom/example/data/DhikrRepository;
    iget-object v1, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/AppDatabase;

    .local v1, "db":Lcom/example/data/AppDatabase;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .end local v0    # "repo":Lcom/example/data/DhikrRepository;
    .end local v1    # "db":Lcom/example/data/AppDatabase;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    nop

    .line 35
    :try_start_1
    sget-object v1, Lcom/example/data/AppDatabase;->Companion:Lcom/example/data/AppDatabase$Companion;

    iget-object v2, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/example/data/AppDatabase$Companion;->getDatabase(Landroid/content/Context;)Lcom/example/data/AppDatabase;

    move-result-object v1

    .line 36
    .restart local v1    # "db":Lcom/example/data/AppDatabase;
    new-instance v2, Lcom/example/data/DhikrRepository;

    invoke-virtual {v1}, Lcom/example/data/AppDatabase;->dhikrDao()Lcom/example/data/DhikrDao;

    move-result-object v3

    invoke-virtual {v1}, Lcom/example/data/AppDatabase;->tagDao()Lcom/example/data/TagDao;

    move-result-object v4

    invoke-virtual {v1}, Lcom/example/data/AppDatabase;->historyDao()Lcom/example/data/HistoryDao;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/example/data/DhikrRepository;-><init>(Lcom/example/data/DhikrDao;Lcom/example/data/TagDao;Lcom/example/data/HistoryDao;)V

    .line 37
    .local v2, "repo":Lcom/example/data/DhikrRepository;
    iget v3, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$dhikrId:I

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->label:I

    invoke-virtual {v2, v3, v4}, Lcom/example/data/DhikrRepository;->markAsRead(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v3, v0, :cond_0

    .line 33
    return-object v0

    .line 37
    :cond_0
    move-object v0, v2

    .line 41
    .end local v2    # "repo":Lcom/example/data/DhikrRepository;
    .restart local v0    # "repo":Lcom/example/data/DhikrRepository;
    :goto_0
    nop

    .end local v0    # "repo":Lcom/example/data/DhikrRepository;
    .end local v1    # "db":Lcom/example/data/AppDatabase;
    :goto_1
    iget-object v0, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 42
    goto :goto_2

    .line 41
    :catchall_0
    move-exception v0

    goto :goto_3

    .line 38
    :catch_0
    move-exception v0

    .line 39
    .local v0, "e":Ljava/lang/Exception;
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .end local v0    # "e":Ljava/lang/Exception;
    goto :goto_1

    .line 43
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 41
    :goto_3
    iget-object v1, p0, Lcom/example/receiver/NotificationActionReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
