.class public final synthetic Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lcom/example/ui/viewmodel/DhikrStats;

.field public final synthetic f$2:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$3:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/example/ui/viewmodel/DhikrStats;Landroidx/compose/material3/ColorScheme;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$1:Lcom/example/ui/viewmodel/DhikrStats;

    iput-object p3, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$2:Landroidx/compose/material3/ColorScheme;

    iput-object p4, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$3:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$1:Lcom/example/ui/viewmodel/DhikrStats;

    iget-object v2, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$2:Landroidx/compose/material3/ColorScheme;

    iget-object v3, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda5;->f$3:Ljava/util/Map;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/example/ui/screens/StatisticsScreenKt;->StatsContent$lambda$27$lambda$26(Ljava/util/List;Lcom/example/ui/viewmodel/DhikrStats;Landroidx/compose/material3/ColorScheme;Ljava/util/Map;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
