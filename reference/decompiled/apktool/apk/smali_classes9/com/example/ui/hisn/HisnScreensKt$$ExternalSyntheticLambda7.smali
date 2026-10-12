.class public final synthetic Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/hisn/HisnViewModel;

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/hisn/HisnViewModel;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda7;->f$0:Lcom/example/ui/hisn/HisnViewModel;

    iput p2, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda7;->f$1:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda7;->f$0:Lcom/example/ui/hisn/HisnViewModel;

    iget v1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda7;->f$1:I

    invoke-static {v0, v1}, Lcom/example/ui/hisn/HisnScreensKt;->HisnChapterScreen$lambda$81$lambda$80(Lcom/example/ui/hisn/HisnViewModel;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
