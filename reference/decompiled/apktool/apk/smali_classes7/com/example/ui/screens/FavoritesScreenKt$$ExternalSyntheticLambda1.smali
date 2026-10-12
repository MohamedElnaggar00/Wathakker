.class public final synthetic Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/util/Map;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$1:Ljava/util/Map;

    iput-object p3, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$3:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$4:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$6:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$7:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$1:Ljava/util/Map;

    iget-object v2, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$3:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$4:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$6:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$7:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda1;->f$8:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/example/ui/screens/FavoritesScreenKt;->FavoritesContent$lambda$16(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
