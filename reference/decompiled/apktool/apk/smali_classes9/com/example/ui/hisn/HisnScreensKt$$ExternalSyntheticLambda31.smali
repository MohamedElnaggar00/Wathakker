.class public final synthetic Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda31;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/data/HisnItem;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/HisnItem;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda31;->f$0:Lcom/example/data/HisnItem;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda31;->f$0:Lcom/example/data/HisnItem;

    invoke-static {v0}, Lcom/example/ui/hisn/HisnScreensKt;->HisnItemCard$lambda$40$lambda$39(Lcom/example/data/HisnItem;)Landroidx/compose/runtime/MutableIntState;

    move-result-object v0

    return-object v0
.end method
