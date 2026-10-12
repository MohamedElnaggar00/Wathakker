.class public final enum Lcom/example/fajr/calculation/CalculationMethod;
.super Ljava/lang/Enum;
.source "PrayerTimesCalculator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/fajr/calculation/CalculationMethod$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/example/fajr/calculation/CalculationMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u001a\u0008\u0086\u0081\u0002\u0018\u0000  2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B9\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u0016j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/example/fajr/calculation/CalculationMethod;",
        "",
        "id",
        "",
        "titleAr",
        "",
        "fajrAngle",
        "",
        "ishaAngle",
        "ishaMinutesAfterMaghrib",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;)V",
        "getId",
        "()I",
        "getTitleAr",
        "()Ljava/lang/String;",
        "getFajrAngle",
        "()D",
        "getIshaAngle",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getIshaMinutesAfterMaghrib",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "MUSLIM_WORLD_LEAGUE",
        "EGYPTIAN",
        "UMM_AL_QURA",
        "ISNA",
        "KARACHI",
        "DUBAI",
        "KUWAIT",
        "QATAR",
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

.field private static final synthetic $VALUES:[Lcom/example/fajr/calculation/CalculationMethod;

.field public static final Companion:Lcom/example/fajr/calculation/CalculationMethod$Companion;

.field public static final enum DUBAI:Lcom/example/fajr/calculation/CalculationMethod;

.field public static final enum EGYPTIAN:Lcom/example/fajr/calculation/CalculationMethod;

.field public static final enum ISNA:Lcom/example/fajr/calculation/CalculationMethod;

.field public static final enum KARACHI:Lcom/example/fajr/calculation/CalculationMethod;

.field public static final enum KUWAIT:Lcom/example/fajr/calculation/CalculationMethod;

.field public static final enum MUSLIM_WORLD_LEAGUE:Lcom/example/fajr/calculation/CalculationMethod;

.field public static final enum QATAR:Lcom/example/fajr/calculation/CalculationMethod;

.field public static final enum UMM_AL_QURA:Lcom/example/fajr/calculation/CalculationMethod;


# instance fields
.field private final fajrAngle:D

.field private final id:I

.field private final ishaAngle:Ljava/lang/Double;

.field private final ishaMinutesAfterMaghrib:Ljava/lang/Integer;

.field private final titleAr:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/example/fajr/calculation/CalculationMethod;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/example/fajr/calculation/CalculationMethod;

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->MUSLIM_WORLD_LEAGUE:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->EGYPTIAN:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->UMM_AL_QURA:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->ISNA:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->KARACHI:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->DUBAI:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->KUWAIT:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/example/fajr/calculation/CalculationMethod;->QATAR:Lcom/example/fajr/calculation/CalculationMethod;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 31

    .line 8
    new-instance v0, Lcom/example/fajr/calculation/CalculationMethod;

    const-wide/high16 v1, 0x4031000000000000L    # 17.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    const/16 v9, 0x10

    const/4 v10, 0x0

    const-string v1, "MUSLIM_WORLD_LEAGUE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "\u0631\u0627\u0628\u0637\u0629 \u0627\u0644\u0639\u0627\u0644\u0645 \u0627\u0644\u0625\u0633\u0644\u0627\u0645\u064a (18\u00b0)"

    const-wide/high16 v5, 0x4032000000000000L    # 18.0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/fajr/calculation/CalculationMethod;->MUSLIM_WORLD_LEAGUE:Lcom/example/fajr/calculation/CalculationMethod;

    .line 9
    new-instance v1, Lcom/example/fajr/calculation/CalculationMethod;

    const-wide v2, 0x4031800000000000L    # 17.5

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    const/16 v10, 0x10

    const/4 v11, 0x0

    const-string v2, "EGYPTIAN"

    const/4 v3, 0x1

    const/4 v4, 0x1

    const-string v5, "\u0627\u0644\u0647\u064a\u0626\u0629 \u0627\u0644\u0645\u0635\u0631\u064a\u0629 \u0627\u0644\u0639\u0627\u0645\u0629 \u0644\u0644\u0645\u0633\u0627\u062d\u0629 (19.5\u00b0)"

    const-wide v6, 0x4033800000000000L    # 19.5

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/example/fajr/calculation/CalculationMethod;->EGYPTIAN:Lcom/example/fajr/calculation/CalculationMethod;

    .line 10
    new-instance v9, Lcom/example/fajr/calculation/CalculationMethod;

    const/16 v0, 0x5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0x8

    const/16 v19, 0x0

    const-string v10, "UMM_AL_QURA"

    const/4 v11, 0x2

    const/4 v12, 0x2

    const-string v13, "\u0623\u0645 \u0627\u0644\u0642\u0631\u0649 - \u0645\u0643\u0629 \u0627\u0644\u0645\u0643\u0631\u0645\u0629 (18.5\u00b0)"

    const-wide v14, 0x4032800000000000L    # 18.5

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lcom/example/fajr/calculation/CalculationMethod;->UMM_AL_QURA:Lcom/example/fajr/calculation/CalculationMethod;

    .line 11
    new-instance v18, Lcom/example/fajr/calculation/CalculationMethod;

    const-wide/high16 v0, 0x402e000000000000L    # 15.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v25

    const/16 v27, 0x10

    const/16 v28, 0x0

    const-string v19, "ISNA"

    const/16 v20, 0x3

    const/16 v21, 0x3

    const-string v22, "\u0627\u0644\u062c\u0645\u0639\u064a\u0629 \u0627\u0644\u0625\u0633\u0644\u0627\u0645\u064a\u0629 \u0644\u0634\u0645\u0627\u0644 \u0623\u0645\u0631\u064a\u0643\u0627 (15\u00b0)"

    const-wide/high16 v23, 0x402e000000000000L    # 15.0

    const/16 v26, 0x0

    invoke-direct/range {v18 .. v28}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v18, Lcom/example/fajr/calculation/CalculationMethod;->ISNA:Lcom/example/fajr/calculation/CalculationMethod;

    .line 12
    new-instance v19, Lcom/example/fajr/calculation/CalculationMethod;

    const-wide/high16 v0, 0x4032000000000000L    # 18.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v26

    const/16 v28, 0x10

    const/16 v29, 0x0

    const-string v20, "KARACHI"

    const/16 v21, 0x4

    const/16 v22, 0x4

    const-string v23, "\u062c\u0627\u0645\u0639\u0629 \u0627\u0644\u0639\u0644\u0648\u0645 \u0627\u0644\u0625\u0633\u0644\u0627\u0645\u064a\u0629 \u0628\u0643\u0631\u0627\u062a\u0634\u064a (18\u00b0)"

    const-wide/high16 v24, 0x4032000000000000L    # 18.0

    const/16 v27, 0x0

    invoke-direct/range {v19 .. v29}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v19, Lcom/example/fajr/calculation/CalculationMethod;->KARACHI:Lcom/example/fajr/calculation/CalculationMethod;

    .line 13
    new-instance v20, Lcom/example/fajr/calculation/CalculationMethod;

    const-wide v0, 0x4032333333333333L    # 18.2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v27

    const/16 v29, 0x10

    const/16 v30, 0x0

    const-string v21, "DUBAI"

    const/16 v22, 0x5

    const/16 v23, 0x5

    const-string v24, "\u062f\u0628\u064a (18.2\u00b0)"

    const-wide v25, 0x4032333333333333L    # 18.2

    const/16 v28, 0x0

    invoke-direct/range {v20 .. v30}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v20, Lcom/example/fajr/calculation/CalculationMethod;->DUBAI:Lcom/example/fajr/calculation/CalculationMethod;

    .line 14
    new-instance v4, Lcom/example/fajr/calculation/CalculationMethod;

    const/16 v13, 0x10

    const/4 v14, 0x0

    const-string v5, "KUWAIT"

    const/4 v6, 0x6

    const/4 v7, 0x6

    move-object v11, v8

    const-string v8, "\u0627\u0644\u0643\u0648\u064a\u062a (18\u00b0)"

    const-wide/high16 v9, 0x4032000000000000L    # 18.0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/example/fajr/calculation/CalculationMethod;->KUWAIT:Lcom/example/fajr/calculation/CalculationMethod;

    .line 15
    new-instance v10, Lcom/example/fajr/calculation/CalculationMethod;

    const/16 v19, 0x8

    const/16 v20, 0x0

    const-string v11, "QATAR"

    const/4 v12, 0x7

    const/4 v13, 0x7

    const-string v14, "\u0642\u0637\u0631 (18\u00b0)"

    const-wide/high16 v15, 0x4032000000000000L    # 18.0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lcom/example/fajr/calculation/CalculationMethod;->QATAR:Lcom/example/fajr/calculation/CalculationMethod;

    invoke-static {}, Lcom/example/fajr/calculation/CalculationMethod;->$values()[Lcom/example/fajr/calculation/CalculationMethod;

    move-result-object v0

    sput-object v0, Lcom/example/fajr/calculation/CalculationMethod;->$VALUES:[Lcom/example/fajr/calculation/CalculationMethod;

    sget-object v0, Lcom/example/fajr/calculation/CalculationMethod;->$VALUES:[Lcom/example/fajr/calculation/CalculationMethod;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/example/fajr/calculation/CalculationMethod;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/example/fajr/calculation/CalculationMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/fajr/calculation/CalculationMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/fajr/calculation/CalculationMethod;->Companion:Lcom/example/fajr/calculation/CalculationMethod$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "id"    # I
    .param p4, "titleAr"    # Ljava/lang/String;
    .param p5, "fajrAngle"    # D
    .param p7, "ishaAngle"    # Ljava/lang/Double;
    .param p8, "ishaMinutesAfterMaghrib"    # Ljava/lang/Integer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/Double;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/example/fajr/calculation/CalculationMethod;->id:I

    iput-object p4, p0, Lcom/example/fajr/calculation/CalculationMethod;->titleAr:Ljava/lang/String;

    iput-wide p5, p0, Lcom/example/fajr/calculation/CalculationMethod;->fajrAngle:D

    iput-object p7, p0, Lcom/example/fajr/calculation/CalculationMethod;->ishaAngle:Ljava/lang/Double;

    iput-object p8, p0, Lcom/example/fajr/calculation/CalculationMethod;->ishaMinutesAfterMaghrib:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 7
    and-int/lit8 p10, p9, 0x8

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit8 p9, p9, 0x10

    if-eqz p9, :cond_1

    move-object p9, v0

    goto :goto_0

    :cond_1
    move-object p9, p8

    :goto_0
    move-object p8, p7

    move-wide p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p9}, Lcom/example/fajr/calculation/CalculationMethod;-><init>(Ljava/lang/String;IILjava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/example/fajr/calculation/CalculationMethod;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/example/fajr/calculation/CalculationMethod;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/example/fajr/calculation/CalculationMethod;
    .locals 1

    const-class v0, Lcom/example/fajr/calculation/CalculationMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/example/fajr/calculation/CalculationMethod;

    return-object v0
.end method

.method public static values()[Lcom/example/fajr/calculation/CalculationMethod;
    .locals 1

    sget-object v0, Lcom/example/fajr/calculation/CalculationMethod;->$VALUES:[Lcom/example/fajr/calculation/CalculationMethod;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/example/fajr/calculation/CalculationMethod;

    return-object v0
.end method


# virtual methods
.method public final getFajrAngle()D
    .locals 2

    .line 7
    iget-wide v0, p0, Lcom/example/fajr/calculation/CalculationMethod;->fajrAngle:D

    return-wide v0
.end method

.method public final getId()I
    .locals 1

    .line 7
    iget v0, p0, Lcom/example/fajr/calculation/CalculationMethod;->id:I

    return v0
.end method

.method public final getIshaAngle()Ljava/lang/Double;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/example/fajr/calculation/CalculationMethod;->ishaAngle:Ljava/lang/Double;

    return-object v0
.end method

.method public final getIshaMinutesAfterMaghrib()Ljava/lang/Integer;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/example/fajr/calculation/CalculationMethod;->ishaMinutesAfterMaghrib:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTitleAr()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/example/fajr/calculation/CalculationMethod;->titleAr:Ljava/lang/String;

    return-object v0
.end method
