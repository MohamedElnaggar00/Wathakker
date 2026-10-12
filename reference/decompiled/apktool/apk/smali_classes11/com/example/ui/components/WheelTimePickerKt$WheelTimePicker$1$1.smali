.class final Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WheelTimePicker.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/components/WheelTimePickerKt;->WheelTimePicker(IILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.example.ui.components.WheelTimePickerKt$WheelTimePicker$1$1"
    f = "WheelTimePicker.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $onTimeSelected:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedAmPmIndex$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedHour12Index$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedMinuteIndex$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$onTimeSelected:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedHour12Index$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedAmPmIndex$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedMinuteIndex$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;

    iget-object v1, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$onTimeSelected:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedHour12Index$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedAmPmIndex$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedMinuteIndex$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 41
    iget v0, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    iget-object v0, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedHour12Index$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lcom/example/ui/components/WheelTimePickerKt;->access$WheelTimePicker$lambda$3(Landroidx/compose/runtime/MutableState;)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 43
    .local v0, "h12":I
    iget-object v2, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedAmPmIndex$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/example/ui/components/WheelTimePickerKt;->access$WheelTimePicker$lambda$9(Landroidx/compose/runtime/MutableState;)I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    .line 44
    .local v1, "isAm":Z
    :goto_0
    nop

    .line 45
    const/16 v2, 0xc

    if-eqz v1, :cond_1

    if-ne v0, v2, :cond_1

    goto :goto_1

    .line 46
    :cond_1
    if-eqz v1, :cond_2

    move v3, v0

    goto :goto_1

    .line 47
    :cond_2
    if-nez v1, :cond_3

    if-ne v0, v2, :cond_3

    move v3, v2

    goto :goto_1

    .line 48
    :cond_3
    add-int/lit8 v3, v0, 0xc

    .line 44
    :goto_1
    nop

    .line 50
    .local v3, "h24":I
    iget-object v2, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$onTimeSelected:Lkotlin/jvm/functions/Function2;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lcom/example/ui/components/WheelTimePickerKt$WheelTimePicker$1$1;->$selectedMinuteIndex$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v5}, Lcom/example/ui/components/WheelTimePickerKt;->access$WheelTimePicker$lambda$6(Landroidx/compose/runtime/MutableState;)I

    move-result v5

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
