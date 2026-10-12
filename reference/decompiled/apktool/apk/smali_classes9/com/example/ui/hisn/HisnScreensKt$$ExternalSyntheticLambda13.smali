.class public final synthetic Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/example/data/HisnItem;

    invoke-static {p1}, Lcom/example/ui/hisn/HisnScreensKt;->HisnChapterScreen$lambda$88$lambda$87$lambda$86(Lcom/example/data/HisnItem;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
