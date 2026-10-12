.class public final synthetic Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/viewmodel/MainViewModel;

.field public final synthetic f$1:Lcom/example/data/Dhikr;

.field public final synthetic f$2:Lcom/example/ui/screens/DhikrDialogState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;Lcom/example/ui/screens/DhikrDialogState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda17;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda17;->f$1:Lcom/example/data/Dhikr;

    iput-object p3, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda17;->f$2:Lcom/example/ui/screens/DhikrDialogState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda17;->f$0:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda17;->f$1:Lcom/example/data/Dhikr;

    iget-object v2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda17;->f$2:Lcom/example/ui/screens/DhikrDialogState;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    move-object v5, p3

    check-cast v5, Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/HomeScreenKt;->DhikrDialogsHost$lambda$12$lambda$9$lambda$8(Lcom/example/ui/viewmodel/MainViewModel;Lcom/example/data/Dhikr;Lcom/example/ui/screens/DhikrDialogState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
