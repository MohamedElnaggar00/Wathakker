.class public final synthetic Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroidx/compose/foundation/lazy/LazyListState;

.field public final synthetic f$1:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/LazyListState;F)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda11;->f$0:Landroidx/compose/foundation/lazy/LazyListState;

    iput p2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda11;->f$1:F

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda11;->f$0:Landroidx/compose/foundation/lazy/LazyListState;

    iget v1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda11;->f$1:F

    invoke-static {v0, v1}, Lcom/example/ui/oneui/OneUIKt;->OneUIScreen_gMrHQkA$lambda$2$lambda$1(Landroidx/compose/foundation/lazy/LazyListState;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
