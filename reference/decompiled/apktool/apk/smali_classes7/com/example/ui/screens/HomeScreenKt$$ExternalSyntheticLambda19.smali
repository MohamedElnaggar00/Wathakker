.class public final synthetic Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/screens/DhikrDialogState;

.field public final synthetic f$1:Lcom/example/ui/viewmodel/MainViewModel;

.field public final synthetic f$2:Ljava/util/List;

.field public final synthetic f$3:Ljava/util/Map;

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/screens/DhikrDialogState;Lcom/example/ui/viewmodel/MainViewModel;Ljava/util/List;Ljava/util/Map;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$0:Lcom/example/ui/screens/DhikrDialogState;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$1:Lcom/example/ui/viewmodel/MainViewModel;

    iput-object p3, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$2:Ljava/util/List;

    iput-object p4, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$3:Ljava/util/Map;

    iput p5, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$0:Lcom/example/ui/screens/DhikrDialogState;

    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$1:Lcom/example/ui/viewmodel/MainViewModel;

    iget-object v2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$2:Ljava/util/List;

    iget-object v3, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$3:Ljava/util/Map;

    iget v4, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda19;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/example/ui/screens/HomeScreenKt;->DhikrDialogsHost$lambda$13(Lcom/example/ui/screens/DhikrDialogState;Lcom/example/ui/viewmodel/MainViewModel;Ljava/util/List;Ljava/util/Map;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
