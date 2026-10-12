.class public final synthetic Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/screens/DhikrDialogState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/screens/DhikrDialogState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda2;->f$0:Lcom/example/ui/screens/DhikrDialogState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/FavoritesScreenKt$$ExternalSyntheticLambda2;->f$0:Lcom/example/ui/screens/DhikrDialogState;

    check-cast p1, Lcom/example/data/Dhikr;

    invoke-static {v0, p1}, Lcom/example/ui/screens/FavoritesScreenKt;->FavoritesScreen$lambda$9$lambda$8(Lcom/example/ui/screens/DhikrDialogState;Lcom/example/data/Dhikr;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
