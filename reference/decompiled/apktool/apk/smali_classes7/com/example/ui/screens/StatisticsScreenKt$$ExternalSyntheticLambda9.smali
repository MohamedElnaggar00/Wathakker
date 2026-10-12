.class public final synthetic Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/viewmodel/DhikrStats;

.field public final synthetic f$1:Landroidx/compose/material3/ColorScheme;

.field public final synthetic f$2:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/viewmodel/DhikrStats;Landroidx/compose/material3/ColorScheme;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/example/ui/viewmodel/DhikrStats;

    iput-object p2, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda9;->f$1:Landroidx/compose/material3/ColorScheme;

    iput-object p3, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda9;->f$2:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/example/ui/viewmodel/DhikrStats;

    iget-object v1, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda9;->f$1:Landroidx/compose/material3/ColorScheme;

    iget-object v2, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda9;->f$2:Ljava/util/Map;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/StatisticsScreenKt;->StatsContent$lambda$27$lambda$26$lambda$14(Lcom/example/ui/viewmodel/DhikrStats;Landroidx/compose/material3/ColorScheme;Ljava/util/Map;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
