.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/viewmodel/MainViewModel;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;->f$1:Landroidx/compose/runtime/MutableState;

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    move-object v3, p2

    check-cast v3, Ljava/lang/String;

    move-object v4, p3

    check-cast v4, Ljava/util/List;

    move-object v5, p4

    check-cast v5, Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$88$lambda$80$lambda$79(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
