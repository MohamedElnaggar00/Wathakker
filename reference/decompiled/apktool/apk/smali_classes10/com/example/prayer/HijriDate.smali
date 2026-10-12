.class public final Lcom/example/prayer/HijriDate;
.super Ljava/lang/Object;
.source "HijriDate.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/example/prayer/HijriDate;",
        "",
        "<init>",
        "()V",
        "monthNames",
        "",
        "",
        "hijriYmd",
        "Lkotlin/Triple;",
        "",
        "cal",
        "Ljava/util/Calendar;",
        "monthName",
        "month",
        "format",
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

.field public static final INSTANCE:Lcom/example/prayer/HijriDate;

.field private static final monthNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lcom/example/prayer/HijriDate;

    invoke-direct {v0}, Lcom/example/prayer/HijriDate;-><init>()V

    sput-object v0, Lcom/example/prayer/HijriDate;->INSTANCE:Lcom/example/prayer/HijriDate;

    .line 10
    nop

    .line 11
    nop

    .line 12
    nop

    .line 11
    nop

    .line 12
    nop

    .line 11
    nop

    .line 12
    nop

    .line 11
    nop

    .line 12
    nop

    .line 11
    nop

    .line 13
    nop

    .line 11
    nop

    .line 13
    nop

    .line 11
    nop

    .line 13
    nop

    .line 11
    nop

    .line 13
    const-string v12, "\u0630\u0648 \u0627\u0644\u062d\u062c\u0629"

    const-string v1, "\u0645\u062d\u0631\u0645"

    const-string v2, "\u0635\u0641\u0631"

    const-string v3, "\u0631\u0628\u064a\u0639 \u0627\u0644\u0623\u0648\u0644"

    const-string v4, "\u0631\u0628\u064a\u0639 \u0627\u0644\u062b\u0627\u0646\u064a"

    const-string v5, "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0623\u0648\u0644\u0649"

    const-string v6, "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u062b\u0627\u0646\u064a\u0629"

    const-string v7, "\u0631\u062c\u0628"

    const-string v8, "\u0634\u0639\u0628\u0627\u0646"

    const-string v9, "\u0631\u0645\u0636\u0627\u0646"

    const-string v10, "\u0634\u0648\u0627\u0644"

    const-string v11, "\u0630\u0648 \u0627\u0644\u0642\u0639\u062f\u0629"

    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    move-result-object v0

    .line 11
    nop

    .line 10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/example/prayer/HijriDate;->monthNames:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lcom/example/prayer/HijriDate;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final format(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 7
    .param p1, "cal"    # Ljava/util/Calendar;

    const-string v0, "cal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0, p1}, Lcom/example/prayer/HijriDate;->hijriYmd(Ljava/util/Calendar;)Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .local v1, "y":I
    invoke-virtual {v0}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .local v2, "m":I
    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 34
    .local v0, "d":I
    sget-object v3, Lcom/example/prayer/HijriDate;->monthNames:Ljava/util/List;

    add-int/lit8 v4, v2, -0x1

    const/4 v5, 0x0

    const/16 v6, 0xb

    invoke-static {v4, v5, v6}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " \u0647\u0640"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public final hijriYmd(Ljava/util/Calendar;)Lkotlin/Triple;
    .locals 6
    .param p1, "cal"    # Ljava/util/Calendar;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            ")",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "cal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Landroid/icu/util/IslamicCalendar;

    invoke-direct {v0}, Landroid/icu/util/IslamicCalendar;-><init>()V

    move-object v1, v0

    .local v1, "$this$hijriYmd_u24lambda_u240\\1":Landroid/icu/util/IslamicCalendar;
    const/4 v2, 0x0

    .line 19
    .local v2, "$i$a$-apply-HijriDate$hijriYmd$ic$1\\1\\18\\0":I
    sget-object v3, Landroid/icu/util/IslamicCalendar$CalculationType;->ISLAMIC_UMALQURA:Landroid/icu/util/IslamicCalendar$CalculationType;

    invoke-virtual {v1, v3}, Landroid/icu/util/IslamicCalendar;->setCalculationType(Landroid/icu/util/IslamicCalendar$CalculationType;)V

    .line 20
    new-instance v3, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v3}, Landroid/icu/util/IslamicCalendar;->setTime(Ljava/util/Date;)V

    .line 21
    nop

    .line 18
    .end local v1    # "$this$hijriYmd_u24lambda_u240\\1":Landroid/icu/util/IslamicCalendar;
    .end local v2    # "$i$a$-apply-HijriDate$hijriYmd$ic$1\\1\\18\\0":I
    nop

    .line 22
    .local v0, "ic":Landroid/icu/util/IslamicCalendar;
    new-instance v1, Lkotlin/Triple;

    .line 23
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 24
    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v4

    add-int/2addr v4, v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 25
    const/4 v4, 0x5

    invoke-virtual {v0, v4}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 22
    invoke-direct {v1, v3, v2, v4}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final monthName(I)Ljava/lang/String;
    .locals 4
    .param p1, "month"    # I

    .line 29
    sget-object v0, Lcom/example/prayer/HijriDate;->monthNames:Ljava/util/List;

    add-int/lit8 v1, p1, -0x1

    const/4 v2, 0x0

    const/16 v3, 0xb

    invoke-static {v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
