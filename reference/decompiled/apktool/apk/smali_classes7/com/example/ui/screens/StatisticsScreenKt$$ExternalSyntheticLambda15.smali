.class public final synthetic Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:J

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(JLjava/util/List;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda15;->f$0:J

    iput-object p3, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda15;->f$1:Ljava/util/List;

    iput-object p4, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda15;->f$2:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-wide v0, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda15;->f$0:J

    iget-object v2, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda15;->f$1:Ljava/util/List;

    iget-object v3, p0, Lcom/example/ui/screens/StatisticsScreenKt$$ExternalSyntheticLambda15;->f$2:Ljava/util/List;

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/example/ui/screens/StatisticsScreenKt;->Donut$lambda$33$lambda$32(JLjava/util/List;Ljava/util/List;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
