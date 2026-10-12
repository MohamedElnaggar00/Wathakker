.class public final Lcom/example/data/AppDatabase$Companion;
.super Ljava/lang/Object;
.source "AppDatabase.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/data/AppDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/example/data/AppDatabase$Companion;",
        "",
        "<init>",
        "()V",
        "MIGRATION_7_8",
        "Landroidx/room/migration/Migration;",
        "getMIGRATION_7_8",
        "()Landroidx/room/migration/Migration;",
        "INSTANCE",
        "Lcom/example/data/AppDatabase;",
        "getDatabase",
        "context",
        "Landroid/content/Context;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/example/data/AppDatabase$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDatabase(Landroid/content/Context;)Lcom/example/data/AppDatabase;
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-static {}, Lcom/example/data/AppDatabase;->access$getINSTANCE$cp()Lcom/example/data/AppDatabase;

    move-result-object v0

    if-nez v0, :cond_0

    monitor-enter p0

    const/4 v0, 0x0

    .line 41
    .local v0, "$i$a$-synchronized-AppDatabase$Companion$getDatabase$1\\1\\39\\0":I
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const-class v2, Lcom/example/data/AppDatabase;

    .line 43
    const-string v3, "wazakkir_database"

    .line 40
    invoke-static {v1, v2, v3}, Landroidx/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;

    move-result-object v1

    .line 45
    const/4 v2, 0x1

    new-array v2, v2, [Landroidx/room/migration/Migration;

    sget-object v3, Lcom/example/data/AppDatabase;->Companion:Lcom/example/data/AppDatabase$Companion;

    invoke-virtual {v3}, Lcom/example/data/AppDatabase$Companion;->getMIGRATION_7_8()Landroidx/room/migration/Migration;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Landroidx/room/RoomDatabase$Builder;->addMigrations([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;

    move-result-object v1

    .line 46
    invoke-virtual {v1}, Landroidx/room/RoomDatabase$Builder;->fallbackToDestructiveMigration()Landroidx/room/RoomDatabase$Builder;

    move-result-object v1

    .line 47
    new-instance v2, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1;

    invoke-direct {v2}, Lcom/example/data/AppDatabase$Companion$getDatabase$1$instance$1;-><init>()V

    check-cast v2, Landroidx/room/RoomDatabase$Callback;

    invoke-virtual {v1, v2}, Landroidx/room/RoomDatabase$Builder;->addCallback(Landroidx/room/RoomDatabase$Callback;)Landroidx/room/RoomDatabase$Builder;

    move-result-object v1

    .line 102
    invoke-virtual {v1}, Landroidx/room/RoomDatabase$Builder;->build()Landroidx/room/RoomDatabase;

    move-result-object v1

    check-cast v1, Lcom/example/data/AppDatabase;

    .line 40
    nop

    .line 103
    .local v1, "instance\\1":Lcom/example/data/AppDatabase;
    sget-object v2, Lcom/example/data/AppDatabase;->Companion:Lcom/example/data/AppDatabase$Companion;

    invoke-static {v1}, Lcom/example/data/AppDatabase;->access$setINSTANCE$cp(Lcom/example/data/AppDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    nop

    .line 39
    .end local v0    # "$i$a$-synchronized-AppDatabase$Companion$getDatabase$1\\1\\39\\0":I
    .end local v1    # "instance\\1":Lcom/example/data/AppDatabase;
    monitor-exit p0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :goto_0
    return-object v0
.end method

.method public final getMIGRATION_7_8()Landroidx/room/migration/Migration;
    .locals 1

    .line 24
    invoke-static {}, Lcom/example/data/AppDatabase;->access$getMIGRATION_7_8$cp()Landroidx/room/migration/Migration;

    move-result-object v0

    return-object v0
.end method
