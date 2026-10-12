.class public final synthetic Lcom/example/fajr/ui/CitySearchDialogKt$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/ui/CitySearchDialogKt$$ExternalSyntheticLambda6;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/fajr/ui/CitySearchDialogKt$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/example/fajr/ui/CitySearchDialogKt$$ExternalSyntheticLambda6;->f$2:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/fajr/ui/CitySearchDialogKt$$ExternalSyntheticLambda6;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/fajr/ui/CitySearchDialogKt$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/example/fajr/ui/CitySearchDialogKt$$ExternalSyntheticLambda6;->f$2:Lkotlin/jvm/functions/Function0;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, v1, v2, p1}, Lcom/example/fajr/ui/CitySearchDialogKt;->CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
