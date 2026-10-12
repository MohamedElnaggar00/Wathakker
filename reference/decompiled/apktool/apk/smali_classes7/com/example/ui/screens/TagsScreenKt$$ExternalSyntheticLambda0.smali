.class public final synthetic Lcom/example/ui/screens/TagsScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Lcom/example/data/Tag;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Tag;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/TagsScreenKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/TagsScreenKt$$ExternalSyntheticLambda0;->f$1:Lcom/example/data/Tag;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/TagsScreenKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/ui/screens/TagsScreenKt$$ExternalSyntheticLambda0;->f$1:Lcom/example/data/Tag;

    invoke-static {v0, v1}, Lcom/example/ui/screens/TagsScreenKt;->TagsContent$lambda$45$lambda$44$lambda$43$lambda$42$lambda$41$lambda$38$lambda$37(Lkotlin/jvm/functions/Function1;Lcom/example/data/Tag;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
