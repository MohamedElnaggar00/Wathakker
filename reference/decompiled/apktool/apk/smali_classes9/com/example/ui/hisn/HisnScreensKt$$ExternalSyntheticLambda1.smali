.class public final synthetic Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/hisn/HisnViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/hisn/HisnViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda1;->f$0:Lcom/example/ui/hisn/HisnViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda1;->f$0:Lcom/example/ui/hisn/HisnViewModel;

    check-cast p1, Lcom/example/data/HisnChapter;

    invoke-static {v0, p1}, Lcom/example/ui/hisn/HisnScreensKt;->HisnListScreen$lambda$68$lambda$67(Lcom/example/ui/hisn/HisnViewModel;Lcom/example/data/HisnChapter;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
