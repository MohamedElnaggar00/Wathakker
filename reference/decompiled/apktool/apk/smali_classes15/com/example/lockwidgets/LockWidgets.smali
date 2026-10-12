.class public Lcom/example/lockwidgets/LockWidgets;
.super Landroid/appwidget/AppWidgetProvider;
.source "LockWidgets.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/lockwidgets/LockWidgets$Tasbih;,
        Lcom/example/lockwidgets/LockWidgets$Hijri;,
        Lcom/example/lockwidgets/LockWidgets$Gregorian;,
        Lcom/example/lockwidgets/LockWidgets$Next;,
        Lcom/example/lockwidgets/LockWidgets$Day;,
        Lcom/example/lockwidgets/LockWidgets$Bar;,
        Lcom/example/lockwidgets/LockWidgets$Prayers;,
        Lcom/example/lockwidgets/LockWidgets$Countdown;,
        Lcom/example/lockwidgets/LockWidgets$CountdownClean;
    }
.end annotation


# static fields
.field private static final TYPES:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static languageListener:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 26
    const-class v0, Lcom/example/lockwidgets/LockWidgets$Day;

    const-class v1, Lcom/example/lockwidgets/LockWidgets$Tasbih;

    const-class v2, Lcom/example/lockwidgets/LockWidgets$Hijri;

    const-class v3, Lcom/example/lockwidgets/LockWidgets$Gregorian;

    const-class v4, Lcom/example/lockwidgets/LockWidgets$Next;

    const-class v5, Lcom/example/lockwidgets/LockWidgets$Bar;

    const-class v6, Lcom/example/lockwidgets/LockWidgets$Countdown;

    const-class v7, Lcom/example/lockwidgets/LockWidgets$CountdownClean;

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/example/lockwidgets/LockWidgets;->TYPES:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method

.method private static action(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, ".lockwidgets."

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static active(Landroid/content/Context;)Z
    .locals 7

    .line 34
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    sget-object v1, Lcom/example/lockwidgets/LockWidgets;->TYPES:[Ljava/lang/Class;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    new-instance v6, Landroid/content/ComponentName;

    invoke-direct {v6, p0, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v6}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v5

    array-length v5, v5

    if-lez v5, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method private static arabic(Landroid/content/Context;)Z
    .locals 2

    .line 29
    const-string v0, "app_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "language"

    const-string v1, "ar"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V
    .locals 3

    .line 82
    invoke-virtual {p4, p1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    cmpl-float v1, v0, p5

    if-lez v1, :cond_0

    invoke-virtual {p4}, Landroid/text/TextPaint;->getTextSize()F

    move-result v1

    mul-float/2addr v1, p5

    div-float/2addr v1, v0

    invoke-virtual {p4, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    float-to-int v1, p5

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, p4, v1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    sget-object p4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {p1, p4}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    sget-object p4, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {p1, p4}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p1

    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p5, p4

    sub-float/2addr p2, p5

    invoke-virtual {p1}, Landroid/text/StaticLayout;->getHeight()I

    move-result p5

    int-to-float p5, p5

    div-float/2addr p5, p4

    sub-float/2addr p3, p5

    invoke-virtual {p0, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p1, p0}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private static font(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 2

    .line 73
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lockfonts/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, ".ttf"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static iqamaWindow([J[JJ)[J
    .locals 15

    .line 83
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const/4 v1, 0x5

    move v2, v1

    :goto_0
    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ltz v2, :cond_1

    if-eq v2, v5, :cond_0

    aget-wide v7, p0, v2

    cmp-long v7, v7, p2

    if-gtz v7, :cond_0

    aget-wide v7, p0, v2

    aget v9, v0, v2

    int-to-long v9, v9

    const-wide/32 v11, 0xea60

    mul-long/2addr v9, v11

    add-long/2addr v7, v9

    cmp-long v7, p2, v7

    if-gez v7, :cond_0

    int-to-long v7, v2

    aget-wide v9, p0, v2

    aget-wide v13, p0, v2

    aget p0, v0, v2

    int-to-long v0, p0

    mul-long/2addr v0, v11

    add-long/2addr v13, v0

    new-array p0, v4, [J

    aput-wide v7, p0, v6

    aput-wide v9, p0, v5

    aput-wide v13, p0, v3

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    aget-wide v7, p1, v1

    cmp-long p0, v7, p2

    if-gtz p0, :cond_2

    aget-wide v7, p1, v1

    const-wide/32 v9, 0xdbba0

    add-long/2addr v7, v9

    cmp-long p0, p2, v7

    if-gez p0, :cond_2

    aget-wide v7, p1, v1

    aget-wide v0, p1, v1

    add-long/2addr v0, v9

    new-array p0, v4, [J

    const-wide/16 v9, 0x5

    aput-wide v9, p0, v6

    aput-wide v7, p0, v5

    aput-wide v0, p0, v3

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :array_0
    .array-data 4
        0x19
        0x0
        0x14
        0xf
        0xa
        0xf
    .end array-data
.end method

.method static synthetic lambda$watchLanguage$0(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    .line 31
    const-string p1, "language"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->updateAll(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private static lines(Landroid/graphics/Canvas;IIF[Ljava/lang/String;[F[Landroid/graphics/Typeface;)V
    .locals 11

    .line 76
    move-object v0, p4

    array-length v1, v0

    new-array v2, v1, [Landroid/text/StaticLayout;

    .line 77
    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, v3

    move v5, v4

    :goto_0
    array-length v7, v0

    if-ge v5, v7, :cond_2

    aget-object v7, p6, v5

    aget v8, p5, v5

    if-nez v5, :cond_0

    const/4 v9, -0x1

    goto :goto_1

    :cond_0
    const v9, -0x19000001

    :goto_1
    invoke-static {v7, v8, p3, v9}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v7

    aget-object v8, v0, v5

    invoke-virtual {v7, v8}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v8

    int-to-float v9, p1

    const/high16 v10, 0x40800000    # 4.0f

    mul-float/2addr v10, p3

    sub-float/2addr v9, v10

    cmpl-float v10, v8, v9

    if-lez v10, :cond_1

    invoke-virtual {v7}, Landroid/text/TextPaint;->getTextSize()F

    move-result v10

    mul-float/2addr v10, v9

    div-float/2addr v10, v8

    invoke-virtual {v7, v10}, Landroid/text/TextPaint;->setTextSize(F)V

    :cond_1
    aget-object v8, v0, v5

    aget-object v9, v0, v5

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    invoke-static {v8, v4, v9, v7, p1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object v7

    sget-object v8, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {v7, v8}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object v7

    invoke-virtual {v7}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object v7

    aput-object v7, v2, v5

    aget-object v7, v2, v5

    invoke-virtual {v7}, Landroid/text/StaticLayout;->getHeight()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 78
    :cond_2
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    mul-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    mul-float/2addr p1, p3

    add-float/2addr v6, p1

    int-to-float p1, p2

    sub-float/2addr p1, v6

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-static {v3, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 79
    nop

    :goto_2
    if-ge v4, v1, :cond_3

    aget-object v0, v2, v4

    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0, v3, p1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v0, p0}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float v5, p3, p2

    add-float/2addr v0, v5

    add-float/2addr p1, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 80
    :cond_3
    return-void
.end method

.method private static locale(Landroid/content/Context;)Ljava/util/Locale;
    .locals 1

    .line 32
    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->arabic(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Ljava/util/Locale;

    const-string v0, "ar"

    invoke-direct {p0, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    :goto_0
    return-object p0
.end method

.method private static number(JLjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 72
    invoke-static {p2}, Ljava/text/NumberFormat;->getIntegerInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/text/NumberFormat;->setGroupingUsed(Z)V

    invoke-virtual {p2, p0, p1}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;
    .locals 2

    .line 74
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    invoke-virtual {v0, p0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    mul-float/2addr p1, p2

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V

    invoke-virtual {v0, p3}, Landroid/text/TextPaint;->setColor(I)V

    const/high16 p0, 0x40400000    # 3.0f

    mul-float/2addr p0, p2

    const/4 p1, 0x0

    const/high16 p3, 0x66000000

    invoke-virtual {v0, p0, p1, p2, p3}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    return-object v0
.end method

.method private static pulse(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 3

    .line 33
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/example/lockwidgets/LockWidgets;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "TICK"

    invoke-static {p0, v1}, Lcom/example/lockwidgets/LockWidgets;->action(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0xc000000

    const v2, 0xaae61

    invoke-static {p0, v2, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static render(Landroid/content/Context;Ljava/lang/Class;I)Landroid/graphics/Bitmap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;I)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 81
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/example/lockwidgets/LockWidgets;->renderSize(Landroid/content/Context;Ljava/lang/Class;IZ)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static renderSize(Landroid/content/Context;Ljava/lang/Class;IZ)Landroid/graphics/Bitmap;
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;IZ)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 85
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v6, v2, Landroid/util/DisplayMetrics;->density:F

    const/16 v2, 0x36

    if-eqz p3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/16 v3, 0x7b

    .line 86
    :goto_0
    int-to-float v3, v3

    mul-float/2addr v3, v6

    float-to-int v3, v3

    int-to-float v2, v2

    mul-float/2addr v2, v6

    float-to-int v2, v2

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-static {v0}, Lcom/example/lockwidgets/LockWidgets;->locale(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object v3

    invoke-static {v0}, Lcom/example/lockwidgets/LockWidgets;->arabic(Landroid/content/Context;)Z

    move-result v13

    .line 87
    const-string v8, "amiri_bold"

    invoke-static {v0, v8}, Lcom/example/lockwidgets/LockWidgets;->font(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v8

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v9

    const-string v10, "lockpersonal/expoarabic_medium.ttf"

    invoke-static {v9, v10}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v14

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v9

    const-string v10, "lockpersonal/expoarabic_semibold.ttf"

    invoke-static {v9, v10}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v15

    if-eqz p3, :cond_1

    const/4 v11, 0x6

    goto :goto_1

    :cond_1
    const/16 v11, 0xc

    :goto_1
    int-to-float v11, v11

    mul-float/2addr v11, v6

    .line 88
    const-class v12, Lcom/example/lockwidgets/LockWidgets$Day;

    const/high16 v16, 0x42080000    # 34.0f

    const/16 v17, 0x6

    const/4 v10, 0x7

    const/4 v9, -0x1

    const/high16 v20, 0x40000000    # 2.0f

    if-ne v1, v12, :cond_3

    if-eqz v13, :cond_2

    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lockpersonal/day_"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ".png"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    int-to-float v1, v4

    mul-float v11, v11, v20

    sub-float v3, v1, v11

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float v6, v6, v16

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v6, v4

    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v3

    new-instance v3, Landroid/graphics/Paint;

    const/4 v8, 0x3

    invoke-direct {v3, v8}, Landroid/graphics/Paint;-><init>(I)V

    new-instance v8, Landroid/graphics/PorterDuffColorFilter;

    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v8, v9, v10}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    new-instance v8, Landroid/graphics/RectF;

    sub-float v9, v1, v4

    div-float v9, v9, v20

    int-to-float v5, v5

    sub-float v10, v5, v6

    div-float v10, v10, v20

    add-float/2addr v1, v4

    div-float v1, v1, v20

    add-float/2addr v5, v6

    div-float v5, v5, v20

    invoke-direct {v8, v9, v10, v1, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1, v8, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "EEEE"

    invoke-direct {v0, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    int-to-float v1, v4

    div-float v3, v1, v20

    int-to-float v4, v5

    div-float v10, v4, v20

    const/high16 v4, 0x41e80000    # 29.0f

    invoke-static {v8, v4, v6, v9}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v4

    mul-float v11, v11, v20

    sub-float v12, v1, v11

    move-object v8, v0

    move v9, v3

    move-object v11, v4

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    :goto_2
    move-object/from16 v26, v2

    goto/16 :goto_29

    .line 89
    :cond_3
    const-class v12, Lcom/example/lockwidgets/LockWidgets$Gregorian;

    move/from16 v21, v10

    const-string v10, " "

    const/4 v9, 0x2

    if-ne v1, v12, :cond_6

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    new-instance v1, Ljava/text/SimpleDateFormat;

    if-eqz p3, :cond_4

    const-string v8, "M/yyyy"

    goto :goto_3

    :cond_4
    const-string v8, "MMMM"

    :goto_3
    invoke-direct {v1, v8, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v11, "d"

    invoke-direct {v8, v11, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v8, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    if-eqz p3, :cond_5

    move-object v3, v7

    filled-new-array {v8, v1}, [Ljava/lang/String;

    move-result-object v7

    new-array v8, v9, [F

    fill-array-data v8, :array_0

    filled-new-array {v15, v14}, [Landroid/graphics/Typeface;

    move-result-object v9

    invoke-static/range {v3 .. v9}, Lcom/example/lockwidgets/LockWidgets;->lines(Landroid/graphics/Canvas;IIF[Ljava/lang/String;[F[Landroid/graphics/Typeface;)V

    goto :goto_4

    :cond_5
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v10, "yyyy"

    invoke-direct {v8, v10, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v8, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    new-array v8, v9, [F

    fill-array-data v8, :array_1

    filled-new-array {v15, v15}, [Landroid/graphics/Typeface;

    move-result-object v9

    move-object v3, v7

    move-object v7, v0

    invoke-static/range {v3 .. v9}, Lcom/example/lockwidgets/LockWidgets;->lines(Landroid/graphics/Canvas;IIF[Ljava/lang/String;[F[Landroid/graphics/Typeface;)V

    :goto_4
    move-object/from16 v26, v2

    goto/16 :goto_29

    .line 90
    :cond_6
    const-class v12, Lcom/example/lockwidgets/LockWidgets$Hijri;

    move/from16 v23, v9

    const/16 v24, 0x4

    const/16 v25, 0x5

    move-object/from16 v26, v2

    const/4 v2, 0x1

    if-ne v1, v12, :cond_c

    new-instance v1, Landroid/icu/util/IslamicCalendar;

    invoke-direct {v1}, Landroid/icu/util/IslamicCalendar;-><init>()V

    sget-object v12, Landroid/icu/util/IslamicCalendar$CalculationType;->ISLAMIC_UMALQURA:Landroid/icu/util/IslamicCalendar$CalculationType;

    invoke-virtual {v1, v12}, Landroid/icu/util/IslamicCalendar;->setCalculationType(Landroid/icu/util/IslamicCalendar$CalculationType;)V

    move-object v12, v10

    const/16 v27, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Landroid/icu/util/IslamicCalendar;->setTimeInMillis(J)V

    const/16 v9, 0x8

    const/16 v10, 0xc

    new-array v10, v10, [Ljava/lang/String;

    if-eqz v13, :cond_7

    const-string v14, "\u0645\u062d\u0631\u0645"

    aput-object v14, v10, v27

    const-string v14, "\u0635\u0641\u0631"

    aput-object v14, v10, v2

    const-string v14, "\u0631\u0628\u064a\u0639 \u0627\u0644\u0623\u0648\u0644"

    aput-object v14, v10, v23

    const-string v14, "\u0631\u0628\u064a\u0639 \u0627\u0644\u0622\u062e\u0631"

    const/16 v19, 0x3

    aput-object v14, v10, v19

    const-string v14, "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0623\u0648\u0644\u0649"

    aput-object v14, v10, v24

    const-string v14, "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0622\u062e\u0631\u0629"

    aput-object v14, v10, v25

    const-string v14, "\u0631\u062c\u0628"

    aput-object v14, v10, v17

    const-string v14, "\u0634\u0639\u0628\u0627\u0646"

    aput-object v14, v10, v21

    const-string v14, "\u0631\u0645\u0636\u0627\u0646"

    aput-object v14, v10, v9

    const/16 v9, 0x9

    const-string v14, "\u0634\u0648\u0627\u0644"

    aput-object v14, v10, v9

    const/16 v9, 0xa

    const-string v14, "\u0630\u0648 \u0627\u0644\u0642\u0639\u062f\u0629"

    aput-object v14, v10, v9

    const/16 v9, 0xb

    const-string v14, "\u0630\u0648 \u0627\u0644\u062d\u062c\u0629"

    aput-object v14, v10, v9

    const/16 v19, 0x3

    goto :goto_5

    :cond_7
    const-string v14, "Muharram"

    aput-object v14, v10, v27

    const-string v14, "Safar"

    aput-object v14, v10, v2

    const-string v14, "Rabi\' al-Awwal"

    aput-object v14, v10, v23

    const-string v14, "Rabi\' al-Thani"

    const/16 v19, 0x3

    aput-object v14, v10, v19

    const-string v14, "Jumada al-Ula"

    aput-object v14, v10, v24

    const-string v14, "Jumada al-Akhirah"

    aput-object v14, v10, v25

    const-string v14, "Rajab"

    aput-object v14, v10, v17

    const-string v14, "Sha\'ban"

    aput-object v14, v10, v21

    const-string v14, "Ramadan"

    aput-object v14, v10, v9

    const/16 v9, 0x9

    const-string v14, "Shawwal"

    aput-object v14, v10, v9

    const/16 v9, 0xa

    const-string v14, "Dhul-Qa\'dah"

    aput-object v14, v10, v9

    const/16 v9, 0xb

    const-string v14, "Dhul-Hijjah"

    aput-object v14, v10, v9

    :goto_5
    move/from16 v9, v23

    invoke-virtual {v1, v9}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v14

    aget-object v10, v10, v14

    move/from16 v14, v25

    invoke-virtual {v1, v14}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v14

    move-object/from16 p1, v10

    int-to-long v9, v14

    invoke-static {v9, v10, v3}, Lcom/example/lockwidgets/LockWidgets;->number(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v2}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v10

    move-object/from16 p2, v9

    int-to-long v9, v10

    invoke-static {v9, v10, v3}, Lcom/example/lockwidgets/LockWidgets;->number(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const/high16 v9, 0x41800000    # 16.0f

    const/high16 v14, 0x41900000    # 18.0f

    if-eqz p3, :cond_8

    if-eqz v13, :cond_8

    int-to-float v3, v4

    move v10, v9

    div-float v9, v3, v20

    mul-float/2addr v10, v6

    move v5, v11

    const/4 v4, -0x1

    invoke-static {v15, v14, v6, v4}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v11

    mul-float v5, v5, v20

    sub-float v12, v3, v5

    move-object/from16 v8, p2

    move/from16 v5, v19

    const/4 v13, 0x2

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "lockpersonal/hijri_"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v1, v13}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v12, v1

    mul-float v1, v6, v14

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v12, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v8, v1

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v5}, Landroid/graphics/Paint;-><init>(I)V

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v4, v9}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    new-instance v4, Landroid/graphics/RectF;

    sub-float v5, v3, v2

    div-float v5, v5, v20

    mul-float v6, v6, v16

    div-float v8, v8, v20

    sub-float v9, v6, v8

    add-float/2addr v3, v2

    div-float v3, v3, v20

    add-float/2addr v6, v8

    invoke-direct {v4, v5, v9, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v2, 0x0

    invoke-virtual {v7, v0, v2, v4, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_29

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_8
    move-object/from16 v0, p2

    move v10, v9

    const/4 v13, 0x2

    new-array v1, v13, [Ljava/lang/String;

    if-eqz p3, :cond_9

    aput-object v0, v1, v27

    aput-object p1, v1, v2

    goto :goto_6

    :cond_9
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v9, p1

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v27

    aput-object v3, v1, v2

    :goto_6
    new-array v0, v13, [F

    if-eqz p3, :cond_a

    aput v14, v0, v27

    const/high16 v3, 0x41200000    # 10.0f

    aput v3, v0, v2

    goto :goto_7

    :cond_a
    const/high16 v3, 0x41880000    # 17.0f

    aput v3, v0, v27

    aput v10, v0, v2

    :goto_7
    new-array v3, v13, [Landroid/graphics/Typeface;

    if-eqz p3, :cond_b

    aput-object v15, v3, v27

    aput-object v8, v3, v2

    goto :goto_8

    :cond_b
    aput-object v15, v3, v27

    aput-object v15, v3, v2

    :goto_8
    move-object v9, v3

    move-object v8, v0

    move-object v3, v7

    move-object v7, v1

    invoke-static/range {v3 .. v9}, Lcom/example/lockwidgets/LockWidgets;->lines(Landroid/graphics/Canvas;IIF[Ljava/lang/String;[F[Landroid/graphics/Typeface;)V

    goto/16 :goto_29

    .line 91
    :cond_c
    move-object v12, v10

    move/from16 v10, v23

    const/4 v9, 0x3

    const/16 v27, 0x0

    move/from16 v18, v2

    const-class v2, Lcom/example/lockwidgets/LockWidgets$Tasbih;

    if-ne v1, v2, :cond_e

    const-string v1, "lock_tasbih"

    move/from16 v2, v27

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "count_"

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v11, p2

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    new-array v1, v9, [Ljava/lang/String;

    if-eqz v13, :cond_d

    const-string v11, "\u0633\u064f\u0628\u0652\u062d\u064e\u0627\u0646\u064e \u0627\u0644\u0644\u064e\u0651\u0647"

    aput-object v11, v1, v2

    const-string v2, "\u0627\u0644\u0652\u062d\u064e\u0645\u0652\u062f\u064f \u0644\u0650\u0644\u064e\u0651\u0647"

    aput-object v2, v1, v18

    const-string v2, "\u0627\u0644\u0644\u064e\u0651\u0647\u064f \u0623\u064e\u0643\u0652\u0628\u064e\u0631"

    aput-object v2, v1, v10

    goto :goto_9

    :cond_d
    const-string v11, "SubhanAllah"

    aput-object v11, v1, v2

    const-string v2, "Alhamdulillah"

    aput-object v2, v1, v18

    const-string v2, "Allahu Akbar"

    aput-object v2, v1, v10

    :goto_9
    div-int/lit8 v2, v0, 0x21

    rem-int/2addr v2, v9

    aget-object v1, v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    rem-int/lit8 v0, v0, 0x21

    int-to-long v11, v0

    invoke-static {v11, v12, v3}, Lcom/example/lockwidgets/LockWidgets;->number(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " / "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/16 v11, 0x21

    invoke-static {v11, v12, v3}, Lcom/example/lockwidgets/LockWidgets;->number(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    new-array v1, v10, [F

    fill-array-data v1, :array_2

    filled-new-array {v8, v14}, [Landroid/graphics/Typeface;

    move-result-object v9

    move-object v8, v1

    move-object v3, v7

    move-object v7, v0

    invoke-static/range {v3 .. v9}, Lcom/example/lockwidgets/LockWidgets;->lines(Landroid/graphics/Canvas;IIF[Ljava/lang/String;[F[Landroid/graphics/Typeface;)V

    goto/16 :goto_29

    .line 93
    :cond_e
    :try_start_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/example/lockwidgets/LockWidgets;->times(Landroid/content/Context;Ljava/util/Calendar;)[J

    move-result-object v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_d

    move-object/from16 p2, v2

    const/4 v2, 0x0

    :goto_a
    move/from16 v21, v5

    move/from16 v5, v17

    if-ge v2, v5, :cond_10

    move/from16 v5, v18

    if-eq v2, v5, :cond_f

    :try_start_3
    aget-wide v28, v8, v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    cmp-long v5, v28, v9

    if-lez v5, :cond_f

    goto :goto_b

    .line 107
    :catch_2
    move-exception v0

    goto/16 :goto_26

    .line 93
    :cond_f
    add-int/lit8 v2, v2, 0x1

    move/from16 v5, v21

    const/16 v17, 0x6

    const/16 v18, 0x1

    goto :goto_a

    :cond_10
    const/4 v2, -0x1

    .line 94
    :goto_b
    if-gez v2, :cond_11

    :try_start_4
    invoke-virtual/range {p2 .. p2}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Calendar;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    move-object/from16 v17, v7

    const/4 v5, 0x5

    const/4 v7, 0x1

    :try_start_5
    invoke-virtual {v2, v5, v7}, Ljava/util/Calendar;->add(II)V

    invoke-static {v0, v2}, Lcom/example/lockwidgets/LockWidgets;->times(Landroid/content/Context;Ljava/util/Calendar;)[J

    move-result-object v2

    const/16 v27, 0x0

    aget-wide v28, v2, v27

    aget-wide v30, v8, v5

    const/4 v2, 0x0

    goto :goto_d

    .line 107
    :catch_3
    move-exception v0

    move-object/from16 v17, v7

    goto/16 :goto_26

    .line 94
    :cond_11
    move-object/from16 v17, v7

    aget-wide v28, v8, v2

    if-lez v2, :cond_13

    const/4 v5, 0x2

    if-ne v2, v5, :cond_12

    const/4 v5, 0x0

    goto :goto_c

    :cond_12
    add-int/lit8 v5, v2, -0x1

    :goto_c
    aget-wide v30, v8, v5

    goto :goto_d

    :cond_13
    invoke-virtual/range {p2 .. p2}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Calendar;

    move/from16 v30, v2

    const/4 v2, -0x1

    const/4 v7, 0x5

    invoke-virtual {v5, v7, v2}, Ljava/util/Calendar;->add(II)V

    invoke-static {v0, v5}, Lcom/example/lockwidgets/LockWidgets;->times(Landroid/content/Context;Ljava/util/Calendar;)[J

    move-result-object v2

    aget-wide v31, v2, v7

    move/from16 v2, v30

    move-wide/from16 v30, v31

    .line 95
    :goto_d
    if-eqz v13, :cond_14

    const-string v32, "\u0627\u0644\u0641\u062c\u0631"

    const-string v33, "\u0627\u0644\u0634\u0631\u0648\u0642"

    const-string v34, "\u0627\u0644\u0638\u0647\u0631"

    const-string v35, "\u0627\u0644\u0639\u0635\u0631"

    const-string v36, "\u0627\u0644\u0645\u063a\u0631\u0628"

    const-string v37, "\u0627\u0644\u0639\u0634\u0627\u0621"

    goto :goto_e

    :cond_14
    const-string v32, "Fajr"

    const-string v33, "Sunrise"

    const-string v34, "Dhuhr"

    const-string v35, "Asr"

    const-string v36, "Maghrib"

    const-string v37, "Isha"

    :goto_e
    filled-new-array/range {v32 .. v37}, [Ljava/lang/String;

    move-result-object v5

    .line 96
    const-class v7, Lcom/example/lockwidgets/LockWidgets$Bar;

    if-eq v1, v7, :cond_16

    const-class v7, Lcom/example/lockwidgets/LockWidgets$Next;

    if-ne v1, v7, :cond_15

    goto :goto_f

    :cond_15
    move/from16 p2, v2

    move-object/from16 v32, v5

    move-object v2, v8

    goto :goto_10

    :cond_16
    :goto_f
    invoke-virtual/range {p2 .. p2}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Calendar;

    move/from16 p2, v2

    move-object/from16 v32, v5

    const/4 v2, 0x5

    const/4 v5, -0x1

    invoke-virtual {v7, v2, v5}, Ljava/util/Calendar;->add(II)V

    invoke-static {v0, v7}, Lcom/example/lockwidgets/LockWidgets;->times(Landroid/content/Context;Ljava/util/Calendar;)[J

    move-result-object v0

    invoke-static {v8, v0, v9, v10}, Lcom/example/lockwidgets/LockWidgets;->iqamaWindow([J[JJ)[J

    move-result-object v0

    if-eqz v0, :cond_17

    move-object v2, v8

    const/16 v27, 0x0

    aget-wide v7, v0, v27

    long-to-int v5, v7

    const/16 v18, 0x1

    aget-wide v30, v0, v18

    const/16 v23, 0x2

    aget-wide v28, v0, v23

    const/4 v0, 0x1

    goto :goto_11

    :cond_17
    move-object v2, v8

    .line 97
    :goto_10
    move/from16 v5, p2

    const/4 v0, 0x0

    :goto_11
    if-eqz v0, :cond_19

    if-eqz v13, :cond_18

    const-string v0, "\u0627\u0644\u0625\u0642\u0627\u0645\u0629"

    goto :goto_12

    :cond_18
    const-string v0, "Iqama"

    goto :goto_12

    :cond_19
    aget-object v0, v32, v5

    :goto_12
    move-object v8, v0

    .line 98
    const-class v0, Lcom/example/lockwidgets/LockWidgets$Prayers;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_c

    if-ne v1, v0, :cond_1c

    move/from16 v0, v24

    const/4 v1, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x5

    const/4 v10, 0x2

    :try_start_6
    filled-new-array {v1, v10, v8, v0, v9}, [I

    move-result-object v0

    int-to-float v8, v4

    mul-float v10, v11, v20

    sub-float v10, v8, v10

    const/high16 v12, 0x40a00000    # 5.0f

    div-float v19, v10, v12

    move v10, v1

    :goto_13
    if-ge v10, v9, :cond_2d

    aget v12, v0, v10
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    if-eqz v13, :cond_1a

    sub-float v20, v8, v11

    int-to-float v1, v10

    const/high16 v23, 0x3f000000    # 0.5f

    add-float v1, v1, v23

    mul-float v1, v1, v19

    sub-float v20, v20, v1

    goto :goto_14

    :cond_1a
    int-to-float v1, v10

    const/high16 v20, 0x3f000000    # 0.5f

    add-float v1, v1, v20

    mul-float v1, v1, v19

    add-float v20, v11, v1

    :goto_14
    move v1, v8

    :try_start_7
    aget-object v8, v32, v12

    const/high16 v23, 0x41a00000    # 20.0f

    mul-float v23, v23, v6

    const/high16 p0, 0x3f800000    # 1.0f

    const/high16 v7, 0x40e00000    # 7.0f

    const/4 v9, -0x1

    invoke-static {v14, v7, v6, v9}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v7
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    mul-float v22, v6, p0

    sub-float v22, v19, v22

    move-object/from16 p0, v17

    move/from16 v17, v1

    move-object v1, v2

    move v2, v11

    move-object v11, v7

    move-object/from16 v7, p0

    move-object/from16 p0, v0

    move v0, v12

    move/from16 v12, v22

    const/16 v25, 0x5

    const/16 v27, 0x0

    move/from16 v22, v13

    move v13, v9

    move/from16 v9, v20

    move/from16 v20, v10

    move/from16 v10, v23

    :try_start_8
    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    aget-wide v10, v1, v0

    invoke-static {v10, v11, v3}, Lcom/example/lockwidgets/LockWidgets;->time(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    mul-float v10, v6, v16

    const/high16 v11, 0x41000000    # 8.0f

    invoke-static {v15, v11, v6, v13}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v11

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    if-ne v0, v5, :cond_1b

    new-instance v0, Landroid/graphics/Paint;

    const/4 v8, 0x1

    invoke-direct {v0, v8}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {v0, v13}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v8, Landroid/graphics/RectF;

    const v10, 0x3eb33333    # 0.35f

    mul-float v10, v10, v19

    sub-float v11, v9, v10

    const/high16 v12, 0x42240000    # 41.0f

    mul-float/2addr v12, v6

    add-float/2addr v9, v10

    const/high16 v10, 0x422a0000    # 42.5f

    mul-float/2addr v10, v6

    invoke-direct {v8, v11, v12, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v7, v8, v6, v6, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_1b
    add-int/lit8 v10, v20, 0x1

    move-object/from16 v0, p0

    move v11, v2

    move/from16 v8, v17

    move/from16 v13, v22

    move/from16 v9, v25

    move-object v2, v1

    move-object/from16 v17, v7

    move/from16 v1, v27

    goto/16 :goto_13

    .line 107
    :catch_4
    move-exception v0

    move/from16 v22, v13

    goto/16 :goto_25

    :catch_5
    move-exception v0

    move/from16 v27, v1

    move/from16 v22, v13

    move-object/from16 v7, v17

    goto/16 :goto_27

    .line 99
    :cond_1c
    move v2, v11

    move/from16 v22, v13

    move-object/from16 v7, v17

    const/4 v13, -0x1

    const/16 v27, 0x0

    const-class v0, Lcom/example/lockwidgets/LockWidgets$Countdown;

    const-wide/16 v16, 0x3c

    const/high16 v5, 0x41400000    # 12.0f

    const/high16 v11, 0x41500000    # 13.0f

    if-eq v1, v0, :cond_28

    const-class v0, Lcom/example/lockwidgets/LockWidgets$CountdownClean;

    if-ne v1, v0, :cond_1d

    move-wide/from16 v38, v28

    move-wide/from16 v28, v9

    move-wide/from16 v9, v38

    move/from16 v13, v22

    goto/16 :goto_1f

    .line 105
    :cond_1d
    const-class v0, Lcom/example/lockwidgets/LockWidgets$Bar;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_b

    if-ne v1, v0, :cond_20

    int-to-float v0, v4

    move-wide/from16 v16, v9

    div-float v9, v0, v20

    mul-float v10, v6, v11

    :try_start_9
    invoke-static {v15, v11, v6, v13}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v11

    mul-float v1, v2, v20

    sub-float v12, v0, v1

    move-wide/from16 v0, v28

    move-wide/from16 v28, v16

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    invoke-static {v0, v1, v3}, Lcom/example/lockwidgets/LockWidgets;->time(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const/high16 v3, 0x42280000    # 42.0f

    mul-float v10, v6, v3

    invoke-static {v14, v5, v6, v13}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v11

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    new-instance v3, Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Landroid/graphics/Paint;-><init>(I)V

    const/high16 v5, 0x41d00000    # 26.0f

    mul-float/2addr v5, v6

    const/high16 v8, 0x40800000    # 4.0f

    mul-float/2addr v8, v6

    const v9, 0x40ffffff    # 7.9999995f

    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v9, Landroid/graphics/RectF;

    add-float v11, v2, v12

    add-float v10, v5, v8

    invoke-direct {v9, v2, v5, v11, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    div-float v15, v8, v20

    invoke-virtual {v7, v9, v15, v15, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    move-object/from16 v25, v14

    sub-long v13, v28, v30

    long-to-float v9, v13

    const-wide/16 v13, 0x1

    sub-long v0, v0, v30

    :try_start_a
    invoke-static {v13, v14, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-float v0, v0

    div-float/2addr v9, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v9}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    mul-float/2addr v12, v0

    invoke-static {v8, v12}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/4 v13, -0x1

    invoke-virtual {v3, v13}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/RectF;

    if-eqz v22, :cond_1e

    sub-float v8, v11, v0

    goto :goto_15

    :cond_1e
    move v8, v2

    :goto_15
    if-eqz v22, :cond_1f

    goto :goto_16

    :cond_1f
    add-float v11, v2, v0

    :goto_16
    invoke-direct {v1, v8, v5, v11, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v7, v1, v15, v15, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto/16 :goto_23

    .line 107
    :catch_6
    move-exception v0

    move-object/from16 v25, v14

    goto/16 :goto_24

    .line 106
    :cond_20
    move-object/from16 v25, v14

    move-wide/from16 v0, v28

    move-wide/from16 v28, v9

    sub-long v28, v0, v28

    const-wide/32 v9, 0xea60

    div-long v9, v28, v9

    const-wide/16 v13, 0x0

    invoke-static {v13, v14, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    cmp-long v2, v9, v16

    if-ltz v2, :cond_23

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    div-long v13, v9, v16

    invoke-static {v13, v14, v3}, Lcom/example/lockwidgets/LockWidgets;->number(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v22, :cond_21

    const-string v5, " \u0633\u0627\u0639\u0627\u062a "

    goto :goto_17

    :cond_21
    const-string v5, " hours "

    :goto_17
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    rem-long v13, v9, v16

    invoke-static {v13, v14, v3}, Lcom/example/lockwidgets/LockWidgets;->number(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v22, :cond_22

    const-string v5, " \u062f\u0642\u064a\u0642\u0629"

    goto :goto_18

    :cond_22
    const-string v5, " minutes"

    :goto_18
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    goto :goto_1a

    :cond_23
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10, v3}, Lcom/example/lockwidgets/LockWidgets;->number(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v22, :cond_24

    const-string v5, " \u062f\u0642\u064a\u0642\u0629"

    goto :goto_19

    :cond_24
    const-string v5, "m"

    :goto_19
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    :goto_1a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    move/from16 v13, v22

    :try_start_b
    invoke-static {v9, v10, v13}, Lcom/example/lockwidgets/HomeWidgets;->remaining(JZ)Ljava/lang/String;

    move-result-object v5

    if-eqz p3, :cond_25

    invoke-static {v0, v1, v3}, Lcom/example/lockwidgets/LockWidgets;->time(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v8, v0, v2}, [Ljava/lang/String;

    move-result-object v0

    goto :goto_1b

    :cond_25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0, v1, v3}, Lcom/example/lockwidgets/LockWidgets;->time(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, v5}, [Ljava/lang/String;

    move-result-object v0

    :goto_1b
    if-eqz p3, :cond_26

    const/4 v8, 0x3

    new-array v1, v8, [F

    fill-array-data v1, :array_3

    goto :goto_1c

    :cond_26
    const/4 v10, 0x2

    new-array v1, v10, [F

    fill-array-data v1, :array_4
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    :goto_1c
    move-object v8, v1

    if-eqz p3, :cond_27

    move-object/from16 v14, v25

    :try_start_c
    filled-new-array {v15, v14, v14}, [Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_1d

    :cond_27
    move-object/from16 v14, v25

    filled-new-array {v15, v14}, [Landroid/graphics/Typeface;

    move-result-object v1
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_a

    :goto_1d
    move-object v9, v1

    move-object v3, v7

    move/from16 v5, v21

    move-object v7, v0

    :try_start_d
    invoke-static/range {v3 .. v9}, Lcom/example/lockwidgets/LockWidgets;->lines(Landroid/graphics/Canvas;IIF[Ljava/lang/String;[F[Landroid/graphics/Typeface;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    goto/16 :goto_23

    .line 107
    :catch_7
    move-exception v0

    move-object v7, v3

    move/from16 v21, v5

    goto/16 :goto_27

    :catch_8
    move-exception v0

    goto :goto_1e

    :catch_9
    move-exception v0

    move/from16 v13, v22

    :goto_1e
    move-object/from16 v14, v25

    goto/16 :goto_27

    .line 99
    :cond_28
    move-wide/from16 v38, v28

    move-wide/from16 v28, v9

    move-wide/from16 v9, v38

    move/from16 v13, v22

    .line 100
    :goto_1f
    int-to-float v0, v4

    sub-float v12, v0, v2

    const/high16 v19, 0x41c80000    # 25.0f

    move/from16 p0, v5

    mul-float v5, v6, v19

    sub-float/2addr v12, v5

    move-wide/from16 v22, v9

    mul-float v10, v6, p0

    const/4 v9, -0x1

    :try_start_e
    invoke-static {v15, v11, v6, v9}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v11

    const/high16 v9, 0x42400000    # 48.0f

    mul-float/2addr v9, v6

    move v1, v12

    move v12, v9

    move v9, v1

    move v15, v0

    move-wide/from16 v0, v22

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    .line 101
    invoke-static {v0, v1, v3}, Lcom/example/lockwidgets/LockWidgets;->time(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const/high16 v3, 0x41d00000    # 26.0f

    mul-float/2addr v3, v6

    add-float v9, v2, v3

    move/from16 v3, p0

    const/4 v11, -0x1

    invoke-static {v14, v3, v6, v11}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v12

    const/high16 v3, 0x42580000    # 54.0f

    mul-float/2addr v3, v6

    move-object v11, v12

    move v12, v3

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V

    .line 102
    new-instance v3, Landroid/graphics/Paint;

    const/4 v8, 0x1

    invoke-direct {v3, v8}, Landroid/graphics/Paint;-><init>(I)V

    mul-float v11, v2, v20

    sub-float v12, v15, v11

    const/high16 v8, 0x40400000    # 3.0f

    mul-float/2addr v8, v6

    const v9, 0x40ffffff    # 7.9999995f

    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v9, Landroid/graphics/RectF;

    add-float v11, v2, v12

    add-float v10, v5, v8

    invoke-direct {v9, v2, v5, v11, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-wide/from16 v22, v0

    div-float v0, v8, v20

    invoke-virtual {v7, v9, v0, v0, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    move/from16 p2, v2

    sub-long v1, v28, v30

    long-to-float v1, v1

    move v9, v1

    const-wide/16 v1, 0x1

    move/from16 v19, v11

    move/from16 p3, v12

    sub-long v11, v22, v30

    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    long-to-float v1, v1

    div-float v1, v9, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v12, p3, v1

    invoke-static {v8, v12}, Ljava/lang/Math;->max(FF)F

    move-result v1

    const/4 v9, -0x1

    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v2, Landroid/graphics/RectF;

    if-eqz v13, :cond_29

    sub-float v11, v19, v1

    goto :goto_20

    :cond_29
    move/from16 v11, p2

    :goto_20
    if-eqz v13, :cond_2a

    move/from16 v1, v19

    goto :goto_21

    :cond_2a
    add-float v1, p2, v1

    :goto_21
    invoke-direct {v2, v11, v5, v1, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v7, v2, v0, v0, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 103
    sub-long v28, v22, v28

    const-wide/32 v0, 0xea60

    div-long v0, v28, v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "%02d:%02d"

    div-long v8, v0, v16

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    rem-long v0, v0, v16

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/example/lockwidgets/LockWidgets$Countdown;

    move-object/from16 v3, p1

    if-ne v3, v2, :cond_2c

    if-eqz v13, :cond_2b

    const-string v2, "\u0645\u062a\u0628\u0642\u064a: "

    goto :goto_22

    :cond_2b
    const-string v2, "Remaining: "

    goto :goto_22

    :cond_2c
    const-string v2, ""

    :goto_22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2066"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u2069"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    div-float v9, v15, v20

    const/high16 v0, 0x42240000    # 41.0f

    mul-float v10, v6, v0

    const/4 v2, -0x1

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v14, v3, v6, v2}, Lcom/example/lockwidgets/LockWidgets;->paint(Landroid/graphics/Typeface;FFI)Landroid/text/TextPaint;

    move-result-object v11

    move/from16 v12, p3

    invoke-static/range {v7 .. v12}, Lcom/example/lockwidgets/LockWidgets;->centered(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/text/TextPaint;F)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_a

    .line 104
    nop

    .line 107
    :cond_2d
    :goto_23
    goto :goto_29

    :catch_a
    move-exception v0

    goto :goto_27

    :catch_b
    move-exception v0

    :goto_24
    move/from16 v13, v22

    goto :goto_27

    :catch_c
    move-exception v0

    :goto_25
    move-object/from16 v7, v17

    goto :goto_26

    :catch_d
    move-exception v0

    move/from16 v21, v5

    :goto_26
    const/16 v27, 0x0

    :goto_27
    const-string v1, "WathakkerLock"

    const-string v2, "Prayer bridge failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    if-eqz v13, :cond_2e

    const-string v0, "\u062a\u0639\u0630\u0631 \u062d\u0633\u0627\u0628 \u0627\u0644\u0635\u0644\u0627\u0629"

    goto :goto_28

    :cond_2e
    const-string v0, "Prayer time unavailable"

    :goto_28
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x1

    new-array v8, v5, [F

    const/high16 v1, 0x41300000    # 11.0f

    aput v1, v8, v27

    filled-new-array {v14}, [Landroid/graphics/Typeface;

    move-result-object v9

    move-object v3, v7

    move/from16 v5, v21

    move-object v7, v0

    invoke-static/range {v3 .. v9}, Lcom/example/lockwidgets/LockWidgets;->lines(Landroid/graphics/Canvas;IIF[Ljava/lang/String;[F[Landroid/graphics/Typeface;)V

    .line 109
    :goto_29
    return-object v26

    nop

    :array_0
    .array-data 4
        0x41900000    # 18.0f
        0x41100000    # 9.0f
    .end array-data

    :array_1
    .array-data 4
        0x41900000    # 18.0f
        0x41800000    # 16.0f
    .end array-data

    :array_2
    .array-data 4
        0x41880000    # 17.0f
        0x41500000    # 13.0f
    .end array-data

    :array_3
    .array-data 4
        0x41400000    # 12.0f
        0x41300000    # 11.0f
        0x41100000    # 9.0f
    .end array-data

    :array_4
    .array-data 4
        0x41500000    # 13.0f
        0x41100000    # 9.0f
    .end array-data
.end method

.method private static res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p2, p1, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static schedule(Landroid/content/Context;)V
    .locals 8

    .line 35
    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->watchLanguage(Landroid/content/Context;)V

    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/AlarmManager;

    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->active(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0xea60

    add-long v3, v2, v4

    const-wide/32 v5, 0xea60

    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->pulse(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v7

    const/4 v2, 0x1

    invoke-virtual/range {v1 .. v7}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->pulse(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :goto_0
    return-void
.end method

.method private static time(JLjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 71
    invoke-virtual {p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ar"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p0, p1, p2}, Lcom/example/lockwidgets/HomeWidgets;->tm(JZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static times(Landroid/content/Context;Ljava/util/Calendar;)[J
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 64
    const-string v0, "com.example.fajr.data.FajrPreferences"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 65
    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    const-string v3, "getLatitude"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-string v4, "getLongitude"

    new-array v5, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v4, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    .line 66
    const-string v6, "getCalculationMethodId"

    new-array v7, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    .line 67
    const-string v0, "com.example.fajr.calculation.CalculationMethod"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v6, "Companion"

    invoke-virtual {v0, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    const-string v10, "fromId"

    invoke-virtual {v8, v10, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v8, v6, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 68
    const-string v6, "com.example.fajr.calculation.PrayerTimesCalculator"

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-class v8, Ljava/util/Calendar;

    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    filled-new-array {v8, v9, v10, v0}, [Ljava/lang/Class;

    move-result-object v0

    const-string v8, "calculateAll"

    invoke-virtual {v6, v8, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v8, "INSTANCE"

    invoke-virtual {v6, v8}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    filled-new-array {p1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, v6, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 69
    const-string v6, "getMaghrib"

    const-string v7, "getIsha"

    const-string v2, "getFajr"

    const-string v3, "getSunrise"

    const-string v4, "getDhuhr"

    const-string v5, "getAsr"

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    new-array v2, v0, [J

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aget-object v5, p1, v3

    new-array v6, v1, [Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v4, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    aput-wide v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method private static update(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILjava/lang/Class;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/appwidget/AppWidgetManager;",
            "I",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 55
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "layout"

    const-string v3, "lock_widget_image"

    invoke-static {p0, v2, v3}, Lcom/example/lockwidgets/LockWidgets;->res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 56
    invoke-virtual {p1, p2}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "appWidgetMinWidth"

    const/16 v3, 0x7b

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "appWidgetMaxWidth"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    if-lez v2, :cond_1

    const/16 v2, 0x50

    if-gt v1, v2, :cond_1

    const-class v1, Lcom/example/lockwidgets/LockWidgets$Hijri;

    if-eq p3, v1, :cond_0

    const-class v1, Lcom/example/lockwidgets/LockWidgets$Gregorian;

    if-eq p3, v1, :cond_0

    const-class v1, Lcom/example/lockwidgets/LockWidgets$Next;

    if-ne p3, v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p0, p3, p2, v1}, Lcom/example/lockwidgets/LockWidgets;->renderSize(Landroid/content/Context;Ljava/lang/Class;IZ)Landroid/graphics/Bitmap;

    move-result-object p3

    .line 57
    const-string v1, "id"

    const-string v2, "lock_widget_art"

    invoke-static {p0, v1, v2}, Lcom/example/lockwidgets/LockWidgets;->res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3, p3}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 58
    invoke-static {p0, v1, v2}, Lcom/example/lockwidgets/LockWidgets;->res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p3

    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->arabic(Landroid/content/Context;)Z

    move-result v3

    const-string v4, "setLayoutDirection"

    invoke-virtual {v0, p3, v4, v3}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    .line 59
    invoke-static {p0, v1, v2}, Lcom/example/lockwidgets/LockWidgets;->res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    const/4 p3, 0x0

    invoke-virtual {v0, p0, p3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 60
    invoke-virtual {p1, p2, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 61
    return-void
.end method

.method public static updateAll(Landroid/content/Context;)V
    .locals 10

    .line 53
    invoke-static {p0}, Lcom/example/lockwidgets/LockWidgets;->watchLanguage(Landroid/content/Context;)V

    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    sget-object v1, Lcom/example/lockwidgets/LockWidgets;->TYPES:[Ljava/lang/Class;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    new-instance v6, Landroid/content/ComponentName;

    invoke-direct {v6, p0, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v6}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v6

    array-length v7, v6

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_0

    aget v9, v6, v8

    invoke-static {p0, v0, v9, v5}, Lcom/example/lockwidgets/LockWidgets;->update(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILjava/lang/Class;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static watchLanguage(Landroid/content/Context;)V
    .locals 2

    .line 31
    sget-object v0, Lcom/example/lockwidgets/LockWidgets;->languageListener:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lcom/example/lockwidgets/LockWidgets$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/example/lockwidgets/LockWidgets$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/example/lockwidgets/LockWidgets;->languageListener:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    const-string v0, "app_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    sget-object v0, Lcom/example/lockwidgets/LockWidgets;->languageListener:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    invoke-interface {p0, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    .locals 0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-static {p1, p2, p3, p4}, Lcom/example/lockwidgets/LockWidgets;->update(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILjava/lang/Class;)V

    return-void
.end method

.method public onDeleted(Landroid/content/Context;[I)V
    .locals 7

    .line 39
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget v3, p2, v2

    const-string v4, "lock_tasbih"

    invoke-virtual {p1, v4, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "count_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/example/lockwidgets/LockWidgets;->schedule(Landroid/content/Context;)V

    return-void
.end method

.method public onDisabled(Landroid/content/Context;)V
    .locals 0

    .line 38
    invoke-static {p1}, Lcom/example/lockwidgets/LockWidgets;->schedule(Landroid/content/Context;)V

    return-void
.end method

.method public onEnabled(Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-static {p1}, Lcom/example/lockwidgets/LockWidgets;->schedule(Landroid/content/Context;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 42
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 43
    const-string v1, "TAP"

    invoke-static {p1, v1}, Lcom/example/lockwidgets/LockWidgets;->action(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 44
    const-string v0, "appWidgetId"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 45
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/appwidget/AppWidgetManager;->getAppWidgetInfo(I)Landroid/appwidget/AppWidgetProviderInfo;

    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/appwidget/AppWidgetProviderInfo;->provider:Landroid/content/ComponentName;

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/example/lockwidgets/LockWidgets$Tasbih;

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "lock_tasbih"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "count_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v3, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    const-class v1, Lcom/example/lockwidgets/LockWidgets$Tasbih;

    invoke-static {p1, v0, p2, v1}, Lcom/example/lockwidgets/LockWidgets;->update(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILjava/lang/Class;)V

    :cond_0
    return-void

    .line 48
    :cond_1
    const-string v1, "TICK"

    invoke-static {p1, v1}, Lcom/example/lockwidgets/LockWidgets;->action(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.intent.action.DATE_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.intent.action.MY_PACKAGE_REPLACED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 51
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 52
    return-void

    .line 49
    :cond_3
    :goto_0
    invoke-static {p1}, Lcom/example/lockwidgets/LockWidgets;->updateAll(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/example/lockwidgets/LockWidgets;->schedule(Landroid/content/Context;)V

    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 4

    .line 36
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p3, v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {p1, p2, v2, v3}, Lcom/example/lockwidgets/LockWidgets;->update(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILjava/lang/Class;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/example/lockwidgets/LockWidgets;->schedule(Landroid/content/Context;)V

    return-void
.end method
