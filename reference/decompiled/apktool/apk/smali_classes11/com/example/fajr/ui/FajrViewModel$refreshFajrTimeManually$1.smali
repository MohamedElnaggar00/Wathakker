.class final Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FajrViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/fajr/ui/FajrViewModel;->refreshFajrTimeManually()V
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
    c = "com.example.fajr.ui.FajrViewModel$refreshFajrTimeManually$1"
    f = "FajrViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/example/fajr/ui/FajrViewModel;


# direct methods
.method constructor <init>(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/fajr/ui/FajrViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;

    iget-object v1, p0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-direct {v0, v1, p2}, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;-><init>(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 184
    iget v1, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 185
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v22, 0x6fff

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v3 .. v23}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 186
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$getPrefs$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/data/FajrPreferences;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/data/FajrPreferences;->getUseCurrentLocation()Z

    move-result v1

    .line 189
    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    .line 186
    if-eqz v1, :cond_0

    .line 187
    invoke-virtual {v2}, Lcom/example/fajr/ui/FajrViewModel;->updateLocationFromGps()V

    goto :goto_0

    .line 189
    :cond_0
    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$refreshFajrTimeInternal(Lcom/example/fajr/ui/FajrViewModel;)V

    .line 191
    :goto_0
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$getPrefs$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/data/FajrPreferences;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/data/FajrPreferences;->isAlarmEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 192
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$getScheduler$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/alarm/FajrAlarmScheduler;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/alarm/FajrAlarmScheduler;->scheduleNextFajrAlarm()J

    .line 194
    :cond_1
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$refreshFajrTimeManually$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v22, 0x6fff

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v3 .. v23}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 195
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
