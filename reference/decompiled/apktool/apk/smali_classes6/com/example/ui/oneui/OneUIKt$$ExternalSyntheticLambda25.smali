.class public final synthetic Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda25;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda25;->f$0:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda25;->f$1:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda25;->f$0:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lcom/example/ui/oneui/OneUIKt$$ExternalSyntheticLambda25;->f$1:Z

    invoke-static {v0, v1}, Lcom/example/ui/oneui/OneUIKt;->OneUISwitch$lambda$43$lambda$42(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
