.class final Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FajrViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/fajr/ui/FajrViewModel;->updateLocationFromGps()V
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
    c = "com.example.fajr.ui.FajrViewModel$updateLocationFromGps$1"
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
            "Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

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

    new-instance v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;

    iget-object v1, p0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-direct {v0, v1, p2}, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;-><init>(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 101
    iget v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 102
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

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

    .line 103
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$getLocationHelper$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/location/LocationManagerHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/location/LocationManagerHelper;->hasLocationPermission()Z

    move-result v20

    .line 104
    .local v20, "hasPerm":Z
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$getLocationHelper$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/location/LocationManagerHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/location/LocationManagerHelper;->isGpsEnabled()Z

    move-result v19

    .line 106
    .local v19, "gpsOk":Z
    if-eqz v20, :cond_0

    if-eqz v19, :cond_0

    .line 107
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$getLocationHelper$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/location/LocationManagerHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/example/fajr/location/LocationManagerHelper;->getLastKnownLocation()Landroid/location/Location;

    move-result-object v1

    .line 108
    .local v1, "location":Landroid/location/Location;
    if-eqz v1, :cond_1

    .line 109
    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$getPrefs$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/data/FajrPreferences;

    move-result-object v2

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/example/fajr/data/FajrPreferences;->setLatitude(D)V

    .line 110
    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$getPrefs$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/data/FajrPreferences;

    move-result-object v2

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/example/fajr/data/FajrPreferences;->setLongitude(D)V

    .line 111
    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$getLocationHelper$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/location/LocationManagerHelper;

    move-result-object v2

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/example/fajr/location/LocationManagerHelper;->getCityNameFromCoordinates(DD)Ljava/lang/String;

    move-result-object v2

    .line 112
    .local v2, "name":Ljava/lang/String;
    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v3}, Lcom/example/fajr/ui/FajrViewModel;->access$getPrefs$p(Lcom/example/fajr/ui/FajrViewModel;)Lcom/example/fajr/data/FajrPreferences;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/example/fajr/data/FajrPreferences;->setCityName(Ljava/lang/String;)V

    .line 114
    iget-object v3, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v3}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    iget-object v4, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v4}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v4

    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v21, v4

    check-cast v21, Lcom/example/fajr/ui/FajrSettingsState;

    .line 115
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v25

    .line 116
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v27

    .line 114
    nop

    .line 117
    nop

    .line 115
    nop

    .line 116
    nop

    .line 114
    nop

    .line 119
    nop

    .line 118
    nop

    .line 114
    const/16 v40, 0x1fe3

    const/16 v41, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x1

    const/16 v39, 0x1

    move-object/from16 v24, v2

    .end local v2    # "name":Ljava/lang/String;
    .local v24, "name":Ljava/lang/String;
    invoke-static/range {v21 .. v41}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v3, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .end local v1    # "location":Landroid/location/Location;
    .end local v24    # "name":Ljava/lang/String;
    goto :goto_0

    .line 123
    :cond_0
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/example/fajr/ui/FajrSettingsState;

    .line 125
    nop

    .line 124
    nop

    .line 123
    const/16 v21, 0x1fff

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v2 .. v22}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 128
    :cond_1
    :goto_0
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$refreshFajrTimeInternal(Lcom/example/fajr/ui/FajrViewModel;)V

    .line 129
    iget-object v1, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v1}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iget-object v2, v0, Lcom/example/fajr/ui/FajrViewModel$updateLocationFromGps$1;->this$0:Lcom/example/fajr/ui/FajrViewModel;

    invoke-static {v2}, Lcom/example/fajr/ui/FajrViewModel;->access$get_uiState$p(Lcom/example/fajr/ui/FajrViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lcom/example/fajr/ui/FajrSettingsState;

    const/16 v40, 0x6fff

    const/16 v41, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-static/range {v21 .. v41}, Lcom/example/fajr/ui/FajrSettingsState;->copy$default(Lcom/example/fajr/ui/FajrSettingsState;ZZLjava/lang/String;DDLjava/lang/String;JLcom/example/fajr/calculation/CalculationMethod;Ljava/lang/String;ZIIZZZILjava/lang/Object;)Lcom/example/fajr/ui/FajrSettingsState;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 130
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
