.class public final synthetic Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/util/Map;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$1:Ljava/util/Map;

    iput-object p3, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$1:Ljava/util/Map;

    iget-object v2, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v7}, Lcom/example/ui/screens/FavoritesScreenKt;->FavoritesContent$lambda$15$lambda$14(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
