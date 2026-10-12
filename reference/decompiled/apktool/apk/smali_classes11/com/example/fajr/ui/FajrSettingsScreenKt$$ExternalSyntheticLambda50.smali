.class public final synthetic Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Lcom/example/fajr/ui/FajrSettingsState;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/example/fajr/ui/FajrSettingsState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$1:Lcom/example/fajr/ui/FajrSettingsState;

    iput-boolean p3, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$2:Z

    iput-object p4, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$4:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$1:Lcom/example/fajr/ui/FajrSettingsState;

    iget-boolean v2, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$2:Z

    iget-object v3, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda50;->f$4:Lkotlin/jvm/functions/Function0;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/fajr/ui/FajrSettingsScreenKt;->FajrSettingsContent$lambda$124$lambda$123$lambda$107(Lkotlin/jvm/functions/Function0;Lcom/example/fajr/ui/FajrSettingsState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
