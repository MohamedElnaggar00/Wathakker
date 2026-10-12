.class public final synthetic Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Tag;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Tag;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/example/data/Tag;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda9;->f$1:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/example/data/Tag;

    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda9;->f$1:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/example/ui/screens/HomeScreenKt;->AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$lambda$40(Lcom/example/data/Tag;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
