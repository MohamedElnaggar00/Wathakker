.class public abstract Lcom/example/data/AppDatabase;
.super Landroidx/room/RoomDatabase;
.source "AppDatabase.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/data/AppDatabase$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/example/data/AppDatabase;",
        "Landroidx/room/RoomDatabase;",
        "<init>",
        "()V",
        "dhikrDao",
        "Lcom/example/data/DhikrDao;",
        "tagDao",
        "Lcom/example/data/TagDao;",
        "historyDao",
        "Lcom/example/data/HistoryDao;",
        "hisnDao",
        "Lcom/example/data/HisnDao;",
        "Companion",
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


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/data/AppDatabase$Companion;

.field private static volatile INSTANCE:Lcom/example/data/AppDatabase;

.field private static final MIGRATION_7_8:Landroidx/room/migration/Migration;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/data/AppDatabase$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/data/AppDatabase$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/data/AppDatabase;->Companion:Lcom/example/data/AppDatabase$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/data/AppDatabase;->$stable:I

    .line 24
    new-instance v0, Lcom/example/data/AppDatabase$Companion$MIGRATION_7_8$1;

    invoke-direct {v0}, Lcom/example/data/AppDatabase$Companion$MIGRATION_7_8$1;-><init>()V

    check-cast v0, Landroidx/room/migration/Migration;

    sput-object v0, Lcom/example/data/AppDatabase;->MIGRATION_7_8:Landroidx/room/migration/Migration;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroidx/room/RoomDatabase;-><init>()V

    .line 13
    return-void
.end method

.method public static final synthetic access$getINSTANCE$cp()Lcom/example/data/AppDatabase;
    .locals 1

    .line 13
    sget-object v0, Lcom/example/data/AppDatabase;->INSTANCE:Lcom/example/data/AppDatabase;

    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_7_8$cp()Landroidx/room/migration/Migration;
    .locals 1

    .line 13
    sget-object v0, Lcom/example/data/AppDatabase;->MIGRATION_7_8:Landroidx/room/migration/Migration;

    return-object v0
.end method

.method public static final synthetic access$setINSTANCE$cp(Lcom/example/data/AppDatabase;)V
    .locals 0
    .param p0, "<set-?>"    # Lcom/example/data/AppDatabase;

    .line 13
    sput-object p0, Lcom/example/data/AppDatabase;->INSTANCE:Lcom/example/data/AppDatabase;

    return-void
.end method


# virtual methods
.method public abstract dhikrDao()Lcom/example/data/DhikrDao;
.end method

.method public abstract hisnDao()Lcom/example/data/HisnDao;
.end method

.method public abstract historyDao()Lcom/example/data/HistoryDao;
.end method

.method public abstract tagDao()Lcom/example/data/TagDao;
.end method
