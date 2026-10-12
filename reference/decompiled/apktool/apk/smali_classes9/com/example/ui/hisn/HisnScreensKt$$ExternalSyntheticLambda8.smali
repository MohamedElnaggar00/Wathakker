.class public final synthetic Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/hisn/HisnViewModel;

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/hisn/HisnViewModel;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda8;->f$0:Lcom/example/ui/hisn/HisnViewModel;

    iput p2, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda8;->f$1:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda8;->f$0:Lcom/example/ui/hisn/HisnViewModel;

    iget v1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda8;->f$1:I

    check-cast p1, Lcom/example/data/HisnItem;

    invoke-static {v0, v1, p1}, Lcom/example/ui/hisn/HisnScreensKt;->HisnChapterScreen$lambda$83$lambda$82(Lcom/example/ui/hisn/HisnViewModel;ILcom/example/data/HisnItem;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
