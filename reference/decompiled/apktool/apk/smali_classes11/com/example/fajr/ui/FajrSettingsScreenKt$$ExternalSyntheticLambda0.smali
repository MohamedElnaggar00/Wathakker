.class public final synthetic Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Landroidx/compose/ui/graphics/vector/ImageVector;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(ZLandroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$0:Z

    iput-object p2, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/graphics/vector/ImageVector;

    iput-object p3, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iput p6, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-boolean v0, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$0:Z

    iget-object v1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/graphics/vector/ImageVector;

    iget-object v2, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iget v5, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda0;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/fajr/ui/FajrSettingsScreenKt;->LocationOptionRow$lambda$128(ZLandroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
