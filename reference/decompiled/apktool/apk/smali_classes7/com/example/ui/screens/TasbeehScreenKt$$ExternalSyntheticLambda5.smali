.class public final synthetic Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:J

.field public final synthetic f$1:J

.field public final synthetic f$2:F


# direct methods
.method public synthetic constructor <init>(JJF)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda5;->f$0:J

    iput-wide p3, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda5;->f$1:J

    iput p5, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda5;->f$2:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-wide v0, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda5;->f$0:J

    iget-wide v2, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda5;->f$1:J

    iget v4, p0, Lcom/example/ui/screens/TasbeehScreenKt$$ExternalSyntheticLambda5;->f$2:F

    move-object v5, p1

    check-cast v5, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/TasbeehScreenKt;->TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$14$lambda$12$lambda$11(JJFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
