.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Landroidx/compose/foundation/pager/PagerState;

.field public final synthetic f$1:Lcom/example/ui/viewmodel/MainViewModel;

.field public final synthetic f$2:Landroidx/navigation/NavHostController;

.field public final synthetic f$3:Lcom/example/ui/hisn/HisnViewModel;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$0:Landroidx/compose/foundation/pager/PagerState;

    iput-object p2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$1:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$2:Landroidx/navigation/NavHostController;

    iput-object p4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$3:Lcom/example/ui/hisn/HisnViewModel;

    iput-object p5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$5:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$0:Landroidx/compose/foundation/pager/PagerState;

    iget-object v1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$1:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$2:Landroidx/navigation/NavHostController;

    iget-object v3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$3:Lcom/example/ui/hisn/HisnViewModel;

    iget-object v4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda46;->f$5:Landroidx/compose/runtime/MutableState;

    move-object v6, p1

    check-cast v6, Landroidx/compose/animation/AnimatedContentScope;

    move-object v7, p2

    check-cast v7, Landroidx/navigation/NavBackStackEntry;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38(Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Lcom/example/ui/hisn/HisnViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
