.class public final synthetic Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/example/fajr/data/FajrPreferences;

.field public final synthetic f$1:Lcom/example/widget/WidgetConfigActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda0;->f$0:Lcom/example/fajr/data/FajrPreferences;

    iput-object p2, p0, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda0;->f$1:Lcom/example/widget/WidgetConfigActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda0;->f$0:Lcom/example/fajr/data/FajrPreferences;

    iget-object v1, p0, Lcom/example/widget/WidgetConfigActivity$$ExternalSyntheticLambda0;->f$1:Lcom/example/widget/WidgetConfigActivity;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/example/widget/WidgetConfigActivity;->onCreate$lambda$3$lambda$2(Lcom/example/fajr/data/FajrPreferences;Lcom/example/widget/WidgetConfigActivity;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
