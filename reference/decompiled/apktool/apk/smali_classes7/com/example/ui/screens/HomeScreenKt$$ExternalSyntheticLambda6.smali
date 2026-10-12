.class public final synthetic Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Tag;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Tag;Lkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda6;->f$0:Lcom/example/data/Tag;

    iput-object p2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda6;->f$2:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda6;->f$0:Lcom/example/data/Tag;

    iget-object v1, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/example/ui/screens/HomeScreenKt$$ExternalSyntheticLambda6;->f$2:Ljava/util/List;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/HomeScreenKt;->AzkarListContent$lambda$49$lambda$48$lambda$46(Lcom/example/data/Tag;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
