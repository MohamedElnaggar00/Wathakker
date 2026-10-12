.class public final synthetic Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/example/data/HisnChapter;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Ljava/util/Set;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$8:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$9:I


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/HisnChapter;Ljava/util/List;ZLjava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$0:Lcom/example/data/HisnChapter;

    iput-object p2, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$1:Ljava/util/List;

    iput-boolean p3, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$2:Z

    iput-object p4, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$3:Ljava/util/Set;

    iput-object p5, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$5:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$6:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$7:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$8:Lkotlin/jvm/functions/Function0;

    iput p10, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$9:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-object v0, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$0:Lcom/example/data/HisnChapter;

    iget-object v1, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$1:Ljava/util/List;

    iget-boolean v2, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$2:Z

    iget-object v3, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$3:Ljava/util/Set;

    iget-object v4, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$5:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$6:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$7:Lkotlin/jvm/functions/Function0;

    iget-object v8, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$8:Lkotlin/jvm/functions/Function0;

    iget v9, p0, Lcom/example/ui/hisn/HisnScreensKt$$ExternalSyntheticLambda30;->f$9:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/example/ui/hisn/HisnScreensKt;->HisnChapterContent$lambda$38(Lcom/example/data/HisnChapter;Ljava/util/List;ZLjava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
