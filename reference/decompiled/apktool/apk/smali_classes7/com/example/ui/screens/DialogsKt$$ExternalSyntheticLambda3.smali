.class public final synthetic Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda3;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda3;->f$1:Ljava/util/List;

    iput p3, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda3;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda3;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda3;->f$1:Ljava/util/List;

    iget v2, p0, Lcom/example/ui/screens/DialogsKt$$ExternalSyntheticLambda3;->f$2:I

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/example/ui/screens/DialogsKt;->TimesEditor$lambda$65$lambda$61$lambda$57$lambda$56(Lkotlin/jvm/functions/Function1;Ljava/util/List;ILjava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
