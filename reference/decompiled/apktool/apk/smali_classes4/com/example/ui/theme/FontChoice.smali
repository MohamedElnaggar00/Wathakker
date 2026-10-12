.class public final enum Lcom/example/ui/theme/FontChoice;
.super Ljava/lang/Enum;
.source "Type.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/ui/theme/FontChoice$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/example/ui/theme/FontChoice;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/example/ui/theme/FontChoice;",
        "",
        "id",
        "",
        "titleAr",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "getTitleAr",
        "APP",
        "APP_LIGHT",
        "APP_BOLD",
        "SYSTEM",
        "CAIRO",
        "NASKH",
        "AMIRI",
        "RUQAA",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/example/ui/theme/FontChoice;

.field public static final enum AMIRI:Lcom/example/ui/theme/FontChoice;

.field public static final enum APP:Lcom/example/ui/theme/FontChoice;

.field public static final enum APP_BOLD:Lcom/example/ui/theme/FontChoice;

.field public static final enum APP_LIGHT:Lcom/example/ui/theme/FontChoice;

.field public static final enum CAIRO:Lcom/example/ui/theme/FontChoice;

.field public static final Companion:Lcom/example/ui/theme/FontChoice$Companion;

.field public static final enum NASKH:Lcom/example/ui/theme/FontChoice;

.field public static final enum RUQAA:Lcom/example/ui/theme/FontChoice;

.field public static final enum SYSTEM:Lcom/example/ui/theme/FontChoice;


# instance fields
.field private final id:Ljava/lang/String;

.field private final titleAr:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/example/ui/theme/FontChoice;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/example/ui/theme/FontChoice;

    sget-object v1, Lcom/example/ui/theme/FontChoice;->APP:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/ui/theme/FontChoice;->APP_LIGHT:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/ui/theme/FontChoice;->APP_BOLD:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/ui/theme/FontChoice;->SYSTEM:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/ui/theme/FontChoice;->CAIRO:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/ui/theme/FontChoice;->NASKH:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/ui/theme/FontChoice;->AMIRI:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/ui/theme/FontChoice;->RUQAA:Lcom/example/ui/theme/FontChoice;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 66
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "app"

    const-string v2, "\u062e\u0637 \u0627\u0644\u062a\u0637\u0628\u064a\u0642"

    const-string v3, "APP"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->APP:Lcom/example/ui/theme/FontChoice;

    .line 67
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "app_light"

    const-string v2, "\u062e\u0637 \u0627\u0644\u062a\u0637\u0628\u064a\u0642 \u0627\u0644\u062e\u0641\u064a\u0641"

    const-string v3, "APP_LIGHT"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->APP_LIGHT:Lcom/example/ui/theme/FontChoice;

    .line 68
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "app_bold"

    const-string v2, "\u062e\u0637 \u0627\u0644\u062a\u0637\u0628\u064a\u0642 \u0627\u0644\u0639\u0631\u064a\u0636"

    const-string v3, "APP_BOLD"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->APP_BOLD:Lcom/example/ui/theme/FontChoice;

    .line 69
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "system"

    const-string v2, "\u062e\u0637 \u0627\u0644\u0646\u0638\u0627\u0645"

    const-string v3, "SYSTEM"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->SYSTEM:Lcom/example/ui/theme/FontChoice;

    .line 70
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "cairo"

    const-string v2, "\u062e\u0637 \u0627\u0644\u0642\u0627\u0647\u0631\u0629"

    const-string v3, "CAIRO"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->CAIRO:Lcom/example/ui/theme/FontChoice;

    .line 71
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "naskh"

    const-string v2, "\u062e\u0637 \u0627\u0644\u0646\u0633\u062e"

    const-string v3, "NASKH"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->NASKH:Lcom/example/ui/theme/FontChoice;

    .line 72
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "amiri"

    const-string v2, "\u062e\u0637 \u0623\u0645\u064a\u0631\u064a"

    const-string v3, "AMIRI"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->AMIRI:Lcom/example/ui/theme/FontChoice;

    .line 73
    new-instance v0, Lcom/example/ui/theme/FontChoice;

    const-string v1, "ruqaa"

    const-string v2, "\u062e\u0637 \u0627\u0644\u0631\u0642\u0639\u0629 (\u0644\u0644\u0645\u0646\u0627\u0633\u0628\u0627\u062a)"

    const-string v3, "RUQAA"

    const/4 v4, 0x7

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/example/ui/theme/FontChoice;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->RUQAA:Lcom/example/ui/theme/FontChoice;

    invoke-static {}, Lcom/example/ui/theme/FontChoice;->$values()[Lcom/example/ui/theme/FontChoice;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/FontChoice;->$VALUES:[Lcom/example/ui/theme/FontChoice;

    sget-object v0, Lcom/example/ui/theme/FontChoice;->$VALUES:[Lcom/example/ui/theme/FontChoice;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/FontChoice;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/example/ui/theme/FontChoice$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/ui/theme/FontChoice$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/ui/theme/FontChoice;->Companion:Lcom/example/ui/theme/FontChoice$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "id"    # Ljava/lang/String;
    .param p4, "titleAr"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/example/ui/theme/FontChoice;->id:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/theme/FontChoice;->titleAr:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/example/ui/theme/FontChoice;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/example/ui/theme/FontChoice;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/example/ui/theme/FontChoice;
    .locals 1

    const-class v0, Lcom/example/ui/theme/FontChoice;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/example/ui/theme/FontChoice;

    return-object v0
.end method

.method public static values()[Lcom/example/ui/theme/FontChoice;
    .locals 1

    sget-object v0, Lcom/example/ui/theme/FontChoice;->$VALUES:[Lcom/example/ui/theme/FontChoice;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/example/ui/theme/FontChoice;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/example/ui/theme/FontChoice;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleAr()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/example/ui/theme/FontChoice;->titleAr:Ljava/lang/String;

    return-object v0
.end method
