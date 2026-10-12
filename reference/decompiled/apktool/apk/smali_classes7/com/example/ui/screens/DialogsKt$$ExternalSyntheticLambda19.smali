.class public final synthetic Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda19;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda19;->f$0:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda19;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda19;->f$0:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda19;->f$1:Landroidx/compose/runtime/MutableState;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/example/ui/screens/DialogsKt;->TimeRow$lambda$95$lambda$94$lambda$93$lambda$92(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;II)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
