.class final Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FajrAlarmActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/fajr/ui/FajrAlarmActivityKt;->FajrAlarmScreen(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.example.fajr.ui.FajrAlarmActivityKt$FajrAlarmScreen$1$1"
    f = "FajrAlarmActivity.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xc4
    }
    m = "invokeSuspend"
    n = {
        "timeSdf",
        "amPmSdf",
        "dateSdf",
        "now"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation


# instance fields
.field final synthetic $currentDateStr$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $currentTimeStr$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->$currentTimeStr$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->$currentDateStr$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;

    iget-object v1, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->$currentTimeStr$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->$currentDateStr$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v0, v1, v2, p2}, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 187
    iget v1, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    .end local p0    # "this":Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;
    :pswitch_0
    iget-object v1, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    .local v1, "now":Ljava/util/Date;
    iget-object v2, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/text/SimpleDateFormat;

    .local v2, "dateSdf":Ljava/text/SimpleDateFormat;
    iget-object v3, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/text/SimpleDateFormat;

    .local v3, "amPmSdf":Ljava/text/SimpleDateFormat;
    iget-object v4, p0, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/text/SimpleDateFormat;

    .local v4, "timeSdf":Ljava/text/SimpleDateFormat;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, p0

    goto/16 :goto_1

    .end local v1    # "now":Ljava/util/Date;
    .end local v2    # "dateSdf":Ljava/text/SimpleDateFormat;
    .end local v3    # "amPmSdf":Ljava/text/SimpleDateFormat;
    .end local v4    # "timeSdf":Ljava/text/SimpleDateFormat;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 188
    new-instance v1, Ljava/text/SimpleDateFormat;

    new-instance v2, Ljava/util/Locale;

    const-string v3, "ar"

    invoke-direct {v2, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    const-string v4, "hh:mm"

    invoke-direct {v1, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 189
    .local v1, "timeSdf":Ljava/text/SimpleDateFormat;
    new-instance v2, Ljava/text/SimpleDateFormat;

    new-instance v4, Ljava/util/Locale;

    invoke-direct {v4, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    const-string v5, "a"

    invoke-direct {v2, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 190
    .local v2, "amPmSdf":Ljava/text/SimpleDateFormat;
    new-instance v4, Ljava/text/SimpleDateFormat;

    new-instance v5, Ljava/util/Locale;

    invoke-direct {v5, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    const-string v3, "EEEE, d MMMM yyyy"

    invoke-direct {v4, v3, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    move-object v3, v2

    move-object v2, v4

    move-object v4, v1

    move-object v1, p0

    .line 192
    .end local p0    # "this":Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;
    .local v1, "this":Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;
    .local v2, "dateSdf":Ljava/text/SimpleDateFormat;
    .restart local v3    # "amPmSdf":Ljava/text/SimpleDateFormat;
    .restart local v4    # "timeSdf":Ljava/text/SimpleDateFormat;
    :goto_0
    nop

    .line 193
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 194
    .local v5, "now":Ljava/util/Date;
    iget-object v6, v1, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->$currentTimeStr$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v9, " "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/example/fajr/ui/FajrAlarmActivityKt;->access$FajrAlarmScreen$lambda$2(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 195
    iget-object v6, v1, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->$currentDateStr$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {v2, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "format(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v7}, Lcom/example/fajr/ui/FajrAlarmActivityKt;->access$FajrAlarmScreen$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 196
    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v4, v1, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$0:Ljava/lang/Object;

    iput-object v3, v1, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$2:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->L$3:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, v1, Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;->label:I

    const-wide/16 v7, 0x3e8

    invoke-static {v7, v8, v6}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_0

    .line 187
    return-object v0

    .line 196
    :cond_0
    move-object v10, v2

    move-object v2, v1

    move-object v1, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v10

    .local v1, "now":Ljava/util/Date;
    .local v2, "this":Lcom/example/fajr/ui/FajrAlarmActivityKt$FajrAlarmScreen$1$1;
    .local v3, "dateSdf":Ljava/text/SimpleDateFormat;
    .local v4, "amPmSdf":Ljava/text/SimpleDateFormat;
    .local v5, "timeSdf":Ljava/text/SimpleDateFormat;
    :goto_1
    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
