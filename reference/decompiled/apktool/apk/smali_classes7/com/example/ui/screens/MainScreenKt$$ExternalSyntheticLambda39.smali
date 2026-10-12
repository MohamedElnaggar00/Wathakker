.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/viewmodel/MainViewModel;

.field public final synthetic f$1:Landroidx/navigation/NavHostController;

.field public final synthetic f$10:Landroidx/compose/runtime/State;

.field public final synthetic f$11:Landroidx/compose/runtime/State;

.field public final synthetic f$2:Landroidx/compose/foundation/pager/PagerState;

.field public final synthetic f$3:Lcom/example/ui/hisn/HisnViewModel;

.field public final synthetic f$4:Z

.field public final synthetic f$5:Ljava/lang/String;

.field public final synthetic f$6:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic f$7:Ljava/lang/String;

.field public final synthetic f$8:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$9:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/hisn/HisnViewModel;ZLjava/lang/String;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$1:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$2:Landroidx/compose/foundation/pager/PagerState;

    iput-object p4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$3:Lcom/example/ui/hisn/HisnViewModel;

    iput-boolean p5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$4:Z

    iput-object p6, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$5:Ljava/lang/String;

    iput-object p7, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$6:Lkotlinx/coroutines/CoroutineScope;

    iput-object p8, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$7:Ljava/lang/String;

    iput-object p9, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$8:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$9:Landroidx/compose/runtime/MutableState;

    iput-object p11, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$10:Landroidx/compose/runtime/State;

    iput-object p12, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$11:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$1:Landroidx/navigation/NavHostController;

    iget-object v2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$2:Landroidx/compose/foundation/pager/PagerState;

    iget-object v3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$3:Lcom/example/ui/hisn/HisnViewModel;

    iget-boolean v4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$4:Z

    iget-object v5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$5:Ljava/lang/String;

    iget-object v6, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$6:Lkotlinx/coroutines/CoroutineScope;

    iget-object v7, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$7:Ljava/lang/String;

    iget-object v8, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$8:Landroidx/compose/runtime/MutableState;

    iget-object v9, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$9:Landroidx/compose/runtime/MutableState;

    iget-object v10, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$10:Landroidx/compose/runtime/State;

    iget-object v11, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda39;->f$11:Landroidx/compose/runtime/State;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$88(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/foundation/pager/PagerState;Lcom/example/ui/hisn/HisnViewModel;ZLjava/lang/String;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
