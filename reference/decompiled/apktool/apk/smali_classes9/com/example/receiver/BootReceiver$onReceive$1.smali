.class final Lcom/example/receiver/BootReceiver$onReceive$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BootReceiver.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/receiver/BootReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
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
    value = "SMAP\nBootReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BootReceiver.kt\ncom/example/receiver/BootReceiver$onReceive$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1869#2,2:47\n*S KotlinDebug\n*F\n+ 1 BootReceiver.kt\ncom/example/receiver/BootReceiver$onReceive$1\n*L\n30#1:47,2\n*E\n"
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
    c = "com.example.receiver.BootReceiver$onReceive$1"
    f = "BootReceiver.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x1c
    }
    m = "invokeSuspend"
    n = {
        "db",
        "dao"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/BroadcastReceiver$PendingResult;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/receiver/BootReceiver$onReceive$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

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

    new-instance v0, Lcom/example/receiver/BootReceiver$onReceive$1;

    iget-object v1, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-direct {v0, v1, v2, p2}, Lcom/example/receiver/BootReceiver$onReceive$1;-><init>(Landroid/content/Context;Landroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/receiver/BootReceiver$onReceive$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/receiver/BootReceiver$onReceive$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/receiver/BootReceiver$onReceive$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/receiver/BootReceiver$onReceive$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 23
    iget v1, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/DhikrDao;

    .local v0, "dao":Lcom/example/data/DhikrDao;
    iget-object v1, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/AppDatabase;

    .local v1, "db":Lcom/example/data/AppDatabase;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, p1

    goto :goto_0

    .end local v0    # "dao":Lcom/example/data/DhikrDao;
    .end local v1    # "db":Lcom/example/data/AppDatabase;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    nop

    .line 26
    :try_start_1
    sget-object v1, Lcom/example/data/AppDatabase;->Companion:Lcom/example/data/AppDatabase$Companion;

    iget-object v2, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/example/data/AppDatabase$Companion;->getDatabase(Landroid/content/Context;)Lcom/example/data/AppDatabase;

    move-result-object v1

    .line 27
    .restart local v1    # "db":Lcom/example/data/AppDatabase;
    invoke-virtual {v1}, Lcom/example/data/AppDatabase;->dhikrDao()Lcom/example/data/DhikrDao;

    move-result-object v2

    .line 28
    .local v2, "dao":Lcom/example/data/DhikrDao;
    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->label:I

    invoke-interface {v2, v3}, Lcom/example/data/DhikrDao;->getEnabledDhikrSync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_0

    .line 23
    return-object v0

    .line 28
    :cond_0
    move-object v0, v2

    .line 23
    .end local v2    # "dao":Lcom/example/data/DhikrDao;
    .restart local v0    # "dao":Lcom/example/data/DhikrDao;
    :goto_0
    check-cast v3, Ljava/util/List;

    .line 29
    .local v3, "enabledDhikrs":Ljava/util/List;
    new-instance v2, Lcom/example/alarm/AlarmScheduler;

    iget-object v4, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$context:Landroid/content/Context;

    invoke-direct {v2, v4}, Lcom/example/alarm/AlarmScheduler;-><init>(Landroid/content/Context;)V

    .line 30
    .local v2, "scheduler":Lcom/example/alarm/AlarmScheduler;
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 47
    .local v5, "$i$f$forEach\\1\\30":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\1":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/example/data/Dhikr;

    .local v8, "dhikr\\2":Lcom/example/data/Dhikr;
    const/4 v9, 0x0

    .line 31
    .local v9, "$i$a$-forEach-BootReceiver$onReceive$1$1\\2\\47\\0":I
    invoke-virtual {v2, v8}, Lcom/example/alarm/AlarmScheduler;->schedule(Lcom/example/data/Dhikr;)V

    .line 32
    nop

    .end local v7    # "element\\1":Ljava/lang/Object;
    .end local v8    # "dhikr\\2":Lcom/example/data/Dhikr;
    .end local v9    # "$i$a$-forEach-BootReceiver$onReceive$1$1\\2\\47\\0":I
    goto :goto_1

    .line 48
    :cond_1
    nop

    .line 35
    .end local v4    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach\\1\\30":I
    new-instance v4, Lcom/example/fajr/alarm/FajrAlarmScheduler;

    iget-object v5, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$context:Landroid/content/Context;

    invoke-direct {v4, v5}, Lcom/example/fajr/alarm/FajrAlarmScheduler;-><init>(Landroid/content/Context;)V

    .line 36
    .local v4, "fajrScheduler":Lcom/example/fajr/alarm/FajrAlarmScheduler;
    invoke-virtual {v4}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleNextFajrAlarm()J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v0    # "dao":Lcom/example/data/DhikrDao;
    .end local v1    # "db":Lcom/example/data/AppDatabase;
    .end local v2    # "scheduler":Lcom/example/alarm/AlarmScheduler;
    .end local v3    # "enabledDhikrs":Ljava/util/List;
    .end local v4    # "fajrScheduler":Lcom/example/fajr/alarm/FajrAlarmScheduler;
    goto :goto_2

    .line 40
    :catchall_0
    move-exception v0

    goto :goto_3

    .line 37
    :catch_0
    move-exception v0

    .line 38
    .local v0, "e":Ljava/lang/Exception;
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_2
    iget-object v0, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 41
    nop

    .line 42
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 40
    :goto_3
    iget-object v1, p0, Lcom/example/receiver/BootReceiver$onReceive$1;->$pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
