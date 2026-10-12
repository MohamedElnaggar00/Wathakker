.class public final Lcom/example/ui/screens/RemindersScreenKt$RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$sortedBy$1;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/RemindersScreenKt;->RemindersContent(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RemindersScreen.kt\ncom/example/ui/screens/RemindersScreenKt\n*L\n1#1,328:1\n38#2:329\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 102
    move-object v0, p1

    check-cast v0, Lcom/example/data/Dhikr;

    .local v0, "it\\1":Lcom/example/data/Dhikr;
    const/4 v1, 0x0

    .line 329
    .local v1, "$i$a$-sortedBy-RemindersScreenKt$RemindersContent$1$1$1$1$1\\1\\102\\0":I
    invoke-virtual {v0}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "99:99"

    if-nez v2, :cond_0

    move-object v2, v3

    .line 102
    .end local v0    # "it\\1":Lcom/example/data/Dhikr;
    .end local v1    # "$i$a$-sortedBy-RemindersScreenKt$RemindersContent$1$1$1$1$1\\1\\102\\0":I
    :cond_0
    check-cast v2, Ljava/lang/Comparable;

    move-object v0, p2

    check-cast v0, Lcom/example/data/Dhikr;

    .local v0, "it\\2":Lcom/example/data/Dhikr;
    const/4 v1, 0x0

    .line 329
    .local v1, "$i$a$-sortedBy-RemindersScreenKt$RemindersContent$1$1$1$1$1\\2\\102\\0":I
    invoke-virtual {v0}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v4

    .line 102
    .end local v0    # "it\\2":Lcom/example/data/Dhikr;
    .end local v1    # "$i$a$-sortedBy-RemindersScreenKt$RemindersContent$1$1$1$1$1\\2\\102\\0":I
    :goto_0
    check-cast v3, Ljava/lang/Comparable;

    invoke-static {v2, v3}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    return v0
.end method
