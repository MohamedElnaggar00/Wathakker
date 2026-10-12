.class final Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;
.super Ljava/lang/Object;
.source "OneUI.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $prevIndex:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic $prevOffset:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic $scrollingUp:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$scrollingUp:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$prevIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p3, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$prevOffset:Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 89
    move-object v0, p1

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {p0, v0, p2}, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->emit(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final emit(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .local v0, "i":I
    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 90
    .local p1, "o":I
    iget-object v1, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$scrollingUp:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$prevIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iget v2, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-lt v0, v2, :cond_1

    iget-object v2, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$prevIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iget v2, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-ne v0, v2, :cond_0

    iget-object v2, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$prevOffset:Lkotlin/jvm/internal/Ref$IntRef;

    iget v2, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-gt p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 91
    iget-object v1, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$prevIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iput v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 92
    iget-object v1, p0, Lcom/example/ui/oneui/OneUIKt$OneUIScreen$1$1$2;->$prevOffset:Lkotlin/jvm/internal/Ref$IntRef;

    iput p1, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 93
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
