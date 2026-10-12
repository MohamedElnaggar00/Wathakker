.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda23;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic f$1:Landroidx/compose/foundation/pager/PagerState;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda23;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda23;->f$1:Landroidx/compose/foundation/pager/PagerState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda23;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda23;->f$1:Landroidx/compose/foundation/pager/PagerState;

    check-cast p1, Lcom/example/ui/oneui/BottomTab;

    invoke-static {v0, v1, p1}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$88$lambda$76$lambda$71$lambda$70(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/oneui/BottomTab;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
