.class public final synthetic Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda46;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/fajr/ui/FajrSettingsState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/fajr/ui/FajrSettingsState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda46;->f$0:Lcom/example/fajr/ui/FajrSettingsState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/fajr/ui/FajrSettingsScreenKt$$ExternalSyntheticLambda46;->f$0:Lcom/example/fajr/ui/FajrSettingsState;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lcom/example/fajr/ui/FajrSettingsScreenKt;->FajrSettingsContent$lambda$124$lambda$123$lambda$82(Lcom/example/fajr/ui/FajrSettingsState;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
