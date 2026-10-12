.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/viewmodel/MainViewModel;

.field public final synthetic f$1:Lcom/example/data/Dhikr;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda17;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda17;->f$1:Lcom/example/data/Dhikr;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda17;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda17;->f$1:Lcom/example/data/Dhikr;

    invoke-static {v0, v1}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$88$lambda$87$lambda$86$lambda$85(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
