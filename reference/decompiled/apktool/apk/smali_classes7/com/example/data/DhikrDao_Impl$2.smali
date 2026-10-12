.class public final Lcom/example/data/DhikrDao_Impl$2;
.super Landroidx/room/EntityDeleteOrUpdateAdapter;
.source "DhikrDao_Impl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/data/DhikrDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityDeleteOrUpdateAdapter<",
        "Lcom/example/data/Dhikr;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0004H\u0014J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0002H\u0014\u00a8\u0006\n"
    }
    d2 = {
        "com/example/data/DhikrDao_Impl$2",
        "Landroidx/room/EntityDeleteOrUpdateAdapter;",
        "Lcom/example/data/Dhikr;",
        "createQuery",
        "",
        "bind",
        "",
        "statement",
        "Landroidx/sqlite/SQLiteStatement;",
        "entity",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/example/data/DhikrDao_Impl;


# direct methods
.method constructor <init>(Lcom/example/data/DhikrDao_Impl;)V
    .locals 0
    .param p1, "$receiver"    # Lcom/example/data/DhikrDao_Impl;

    iput-object p1, p0, Lcom/example/data/DhikrDao_Impl$2;->this$0:Lcom/example/data/DhikrDao_Impl;

    .line 55
    invoke-direct {p0}, Landroidx/room/EntityDeleteOrUpdateAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method protected bind(Landroidx/sqlite/SQLiteStatement;Lcom/example/data/Dhikr;)V
    .locals 6
    .param p1, "statement"    # Landroidx/sqlite/SQLiteStatement;
    .param p2, "entity"    # Lcom/example/data/Dhikr;

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p2}, Lcom/example/data/Dhikr;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 61
    const/4 v0, 0x2

    invoke-virtual {p2}, Lcom/example/data/Dhikr;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 62
    const/4 v0, 0x3

    invoke-virtual {p2}, Lcom/example/data/Dhikr;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 63
    invoke-virtual {p2}, Lcom/example/data/Dhikr;->isFavorite()Z

    move-result v0

    .line 64
    .local v0, "_tmp":I
    const/4 v1, 0x4

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 65
    iget-object v1, p0, Lcom/example/data/DhikrDao_Impl$2;->this$0:Lcom/example/data/DhikrDao_Impl;

    invoke-static {v1}, Lcom/example/data/DhikrDao_Impl;->access$get__converters$p(Lcom/example/data/DhikrDao_Impl;)Lcom/example/data/Converters;

    move-result-object v1

    invoke-virtual {p2}, Lcom/example/data/Dhikr;->getReminderTimes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/example/data/Converters;->toString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 66
    .local v1, "_tmp_1":Ljava/lang/String;
    const/4 v2, 0x5

    invoke-interface {p1, v2, v1}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 67
    invoke-virtual {p2}, Lcom/example/data/Dhikr;->isEnabled()Z

    move-result v2

    .line 68
    .local v2, "_tmp_2":I
    const/4 v3, 0x6

    int-to-long v4, v2

    invoke-interface {p1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 69
    invoke-virtual {p2}, Lcom/example/data/Dhikr;->getReadCount()I

    move-result v3

    int-to-long v3, v3

    const/4 v5, 0x7

    invoke-interface {p1, v5, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 70
    const/16 v3, 0x8

    invoke-virtual {p2}, Lcom/example/data/Dhikr;->getLastReadTime()J

    move-result-wide v4

    invoke-interface {p1, v3, v4, v5}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 71
    invoke-virtual {p2}, Lcom/example/data/Dhikr;->getId()I

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x9

    invoke-interface {p1, v5, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 72
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 1
    .param p1, "statement"    # Landroidx/sqlite/SQLiteStatement;
    .param p2, "entity"    # Ljava/lang/Object;

    .line 55
    move-object v0, p2

    check-cast v0, Lcom/example/data/Dhikr;

    invoke-virtual {p0, p1, v0}, Lcom/example/data/DhikrDao_Impl$2;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/example/data/Dhikr;)V

    return-void
.end method

.method protected createQuery()Ljava/lang/String;
    .locals 1

    .line 57
    const-string v0, "UPDATE OR ABORT `dhikr_table` SET `id` = ?,`title` = ?,`content` = ?,`isFavorite` = ?,`reminderTimes` = ?,`isEnabled` = ?,`readCount` = ?,`lastReadTime` = ? WHERE `id` = ?"

    return-object v0
.end method
