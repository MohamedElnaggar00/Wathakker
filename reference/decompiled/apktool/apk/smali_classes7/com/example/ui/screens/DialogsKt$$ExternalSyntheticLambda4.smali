.class public final synthetic Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda4;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda4;->f$1:Ljava/util/List;

    iput p3, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda4;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda4;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda4;->f$1:Ljava/util/List;

    iget v2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda4;->f$2:I

    invoke-static {v0, v1, v2}, Lcom/example/ui/screens/DialogsKt;->TimesEditor$lambda$65$lambda$61$lambda$60$lambda$59(Lkotlin/jvm/functions/Function1;Ljava/util/List;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
