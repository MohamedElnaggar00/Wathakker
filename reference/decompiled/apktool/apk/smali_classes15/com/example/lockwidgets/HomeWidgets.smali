.class public final Lcom/example/lockwidgets/HomeWidgets;
.super Ljava/lang/Object;
.source "HomeWidgets.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/lockwidgets/HomeWidgets$State;
    }
.end annotation


# static fields
.field static final batchState:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/example/lockwidgets/HomeWidgets$State;",
            ">;"
        }
    .end annotation
.end field

.field static volatile boldFace:Landroid/graphics/Typeface;

.field public static openPrayer:Z

.field static volatile regularFace:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 4
    const/4 v0, 0x0

    sput-boolean v0, Lcom/example/lockwidgets/HomeWidgets;->openPrayer:Z

    .line 5
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/example/lockwidgets/HomeWidgets;->batchState:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static ar(Landroid/content/Context;)Z
    .locals 2

    .line 14
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

.method static bar(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFFF)V
    .locals 6

    .line 22
    const v0, -0xb3b3b2

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/RectF;

    mul-float v1, p2, p7

    mul-float v2, p3, p7

    sub-float v3, p4, p2

    mul-float v4, v3, p7

    add-float/2addr p3, p5

    mul-float/2addr p3, p7

    invoke-direct {v0, v1, v2, v4, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    mul-float v1, p5, p7

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v1, v5

    invoke-virtual {p0, v0, v1, v1, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    mul-float/2addr p2, v5

    sub-float/2addr p4, p2

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p6}, Ljava/lang/Math;->min(FF)F

    move-result p2

    const/4 p6, 0x0

    invoke-static {p6, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    mul-float/2addr p4, p2

    invoke-static {p5, p4}, Ljava/lang/Math;->max(FF)F

    move-result p2

    const/4 p4, -0x1

    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p4, Landroid/graphics/RectF;

    sub-float/2addr v3, p2

    mul-float/2addr v3, p7

    invoke-direct {p4, v3, v2, v4, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p0, p4, v1, v1, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method static face(Landroid/content/Context;Z)Landroid/graphics/Typeface;
    .locals 2

    .line 15
    if-eqz p1, :cond_0

    sget-object v0, Lcom/example/lockwidgets/HomeWidgets;->boldFace:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/example/lockwidgets/HomeWidgets;->regularFace:Landroid/graphics/Typeface;

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "homefonts/expoarabic_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-eqz p1, :cond_1

    const-string v1, "semibold"

    goto :goto_1

    :cond_1
    const-string v1, "medium"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ttf"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz p1, :cond_2

    sput-object v0, Lcom/example/lockwidgets/HomeWidgets;->boldFace:Landroid/graphics/Typeface;

    goto :goto_2

    :cond_2
    sput-object v0, Lcom/example/lockwidgets/HomeWidgets;->regularFace:Landroid/graphics/Typeface;

    :cond_3
    :goto_2
    return-object v0
.end method

.method public static handleIntent(Landroid/content/Intent;)Z
    .locals 1

    .line 8
    if-eqz p0, :cond_0

    const-string v0, "com.wathakker.locktest.OPEN_PRAYER"

    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sput-boolean p0, Lcom/example/lockwidgets/HomeWidgets;->openPrayer:Z

    sget-boolean p0, Lcom/example/lockwidgets/HomeWidgets;->openPrayer:Z

    return p0
.end method

.method static heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    .locals 5

    .line 17
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    invoke-virtual {v0, p6}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    mul-float p6, p5, p9

    invoke-virtual {v0, p6}, Landroid/text/TextPaint;->setTextSize(F)V

    invoke-virtual {v0, p7}, Landroid/text/TextPaint;->setColor(I)V

    :goto_0
    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p6

    mul-float p7, p4, p9

    cmpl-float p6, p6, p7

    if-lez p6, :cond_0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSize()F

    move-result p6

    const/high16 v2, 0x41000000    # 8.0f

    mul-float/2addr v2, p9

    const/high16 v3, 0x41400000    # 12.0f

    div-float v3, p5, v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    mul-float/2addr v2, v3

    cmpl-float p6, p6, v2

    if-lez p6, :cond_0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSize()F

    move-result p6

    const/high16 p7, 0x3f000000    # 0.5f

    mul-float/2addr p7, p9

    sub-float/2addr p6, p7

    invoke-virtual {v0, p6}, Landroid/text/TextPaint;->setTextSize(F)V

    goto :goto_0

    :cond_0
    sget-object p4, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p5

    const/4 p6, 0x0

    invoke-interface {p4, p1, p6, p5}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result p4

    if-eqz p4, :cond_2

    sget-object p4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    if-ne p8, p4, :cond_1

    sget-object p8, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_1

    :cond_1
    sget-object p4, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    if-ne p8, p4, :cond_2

    sget-object p8, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    float-to-int p5, p7

    invoke-static {v1, p5}, Ljava/lang/Math;->max(II)I

    move-result p5

    invoke-static {p1, p6, p4, v0, p5}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, p8}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    sget-object p4, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {p1, p4}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, p6}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p1

    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    mul-float/2addr p2, p9

    mul-float/2addr p3, p9

    invoke-virtual {p1}, Landroid/text/StaticLayout;->getHeight()I

    move-result p4

    int-to-float p4, p4

    const/high16 p5, 0x40000000    # 2.0f

    div-float/2addr p4, p5

    sub-float/2addr p3, p4

    invoke-virtual {p0, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p1, p0}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public static initialPage()I
    .locals 1

    .line 7
    const/4 v0, 0x0

    return v0
.end method

.method static open(Landroid/content/Context;Z)Landroid/app/PendingIntent;
    .locals 3

    .line 10
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.example.MainActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string v1, "com.wathakker.locktest.OPEN_PRAYER"

    goto :goto_0

    :cond_0
    const-string v1, "android.intent.action.MAIN"

    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x24000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v0

    if-eqz p1, :cond_1

    const p1, 0x1644c

    goto :goto_1

    :cond_1
    const p1, 0x1644d

    :goto_1
    const/high16 v1, 0xc000000

    invoke-static {p0, p1, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static remaining(JZ)Ljava/lang/String;
    .locals 4

    .line 19
    const-wide/16 v0, 0x3c

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u0627\u0644\u0645\u062a\u0628\u0642\u064a "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    div-long v2, p0, v0

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, " \u0633\u0627\u0639\u0627\u062a \u0648 "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    rem-long/2addr p0, v0

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " \u062f\u0642\u064a\u0642\u0629"

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Remaining "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    div-long v2, p0, v0

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, " hours and "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    rem-long/2addr p0, v0

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " minutes"

    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static render(Landroid/content/Context;II)Landroid/graphics/Bitmap;
    .locals 1

    .line 23
    const-string v0, "Hero"

    invoke-static {p0, v0, p1, p2}, Lcom/example/lockwidgets/HomeWidgets;->renderKind(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static renderKind(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 38

    .line 24
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v14, v4, Landroid/util/DisplayMetrics;->density:F

    int-to-float v4, v2

    mul-float v5, v4, v14

    float-to-int v6, v5

    const/4 v15, 0x1

    invoke-static {v15, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    int-to-float v7, v3

    mul-float v8, v7, v14

    float-to-int v9, v8

    invoke-static {v15, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v9, v10}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    new-instance v9, Landroid/graphics/Canvas;

    invoke-direct {v9, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10, v15}, Landroid/graphics/Paint;-><init>(I)V

    const v11, -0xe8e8e7

    invoke-virtual {v10, v11}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v11, Landroid/graphics/RectF;

    const/4 v12, 0x0

    invoke-direct {v11, v12, v12, v5, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v16, 0x40800000    # 4.0f

    div-float v5, v7, v16

    const/high16 v8, 0x41c00000    # 24.0f

    invoke-static {v8, v5}, Ljava/lang/Math;->min(FF)F

    move-result v12

    mul-float/2addr v12, v14

    invoke-static {v8, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    mul-float/2addr v5, v14

    invoke-virtual {v9, v11, v12, v5, v10}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const/4 v5, 0x0

    invoke-static {v1, v5}, Lcom/example/lockwidgets/HomeWidgets;->face(Landroid/content/Context;Z)Landroid/graphics/Typeface;

    move-result-object v11

    invoke-static {v1, v15}, Lcom/example/lockwidgets/HomeWidgets;->face(Landroid/content/Context;Z)Landroid/graphics/Typeface;

    move-result-object v17

    const/high16 v18, 0x40000000    # 2.0f

    :try_start_0
    sget-object v8, Lcom/example/lockwidgets/HomeWidgets;->batchState:Ljava/lang/ThreadLocal;

    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/example/lockwidgets/HomeWidgets$State;

    if-nez v8, :cond_0

    invoke-static {v1}, Lcom/example/lockwidgets/HomeWidgets;->state(Landroid/content/Context;)Lcom/example/lockwidgets/HomeWidgets$State;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_19

    :cond_0
    move-object v13, v6

    :try_start_1
    iget-wide v5, v8, Lcom/example/lockwidgets/HomeWidgets$State;->at:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_18

    move-object/from16 v21, v13

    :try_start_2
    iget-wide v12, v8, Lcom/example/lockwidgets/HomeWidgets$State;->now:J

    sub-long/2addr v5, v12

    const-wide/32 v12, 0xea60

    div-long/2addr v5, v12

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    const v22, 0x3d75c28f    # 0.06f

    mul-float v12, v4, v22

    const/high16 v13, 0x41900000    # 18.0f

    invoke-static {v13, v12}, Ljava/lang/Math;->min(FF)F

    move-result v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_17

    mul-float v22, v12, v18

    sub-float v22, v4, v22

    move/from16 v26, v13

    move/from16 v25, v14

    :try_start_3
    iget-wide v13, v8, Lcom/example/lockwidgets/HomeWidgets$State;->now:J

    iget-wide v1, v8, Lcom/example/lockwidgets/HomeWidgets$State;->prev:J

    sub-long/2addr v13, v1

    long-to-float v1, v13

    iget-wide v13, v8, Lcom/example/lockwidgets/HomeWidgets$State;->at:J

    move/from16 v27, v1

    iget-wide v1, v8, Lcom/example/lockwidgets/HomeWidgets$State;->prev:J

    sub-long/2addr v13, v1

    const-wide/16 v1, 0x1

    invoke-static {v1, v2, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    long-to-float v1, v1

    div-float v1, v27, v1

    iget-boolean v2, v8, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    invoke-static {v5, v6, v2}, Lcom/example/lockwidgets/HomeWidgets;->remaining(JZ)Ljava/lang/String;

    move-result-object v2

    const-string v13, "Hero"

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_16

    const/high16 v27, 0x41700000    # 15.0f

    const/high16 v28, 0x41400000    # 12.0f

    const/high16 v29, 0x428c0000    # 70.0f

    if-eqz v13, :cond_2

    const v0, 0x3ec72b02    # 0.389f

    mul-float v5, v7, v0

    const v6, 0x3f11eb85    # 0.57f

    mul-float v15, v7, v6

    const/16 v6, 0x46

    if-ge v3, v6, :cond_1

    const v3, 0x3f47ae14    # 0.78f

    goto :goto_0

    :cond_1
    const v3, 0x3f581062    # 0.844f

    :goto_0
    mul-float/2addr v3, v7

    const v6, 0x3e083127    # 0.133f

    mul-float v16, v7, v6

    mul-float/2addr v0, v7

    const v6, 0x3e6147ae    # 0.22f

    mul-float v6, v6, v22

    :try_start_4
    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    sget-object v19, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    iget-object v14, v8, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    move/from16 p1, v0

    iget v0, v8, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    aget-object v0, v14, v0

    div-float v14, v7, v29

    move-object/from16 p3, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v14}, Ljava/lang/Math;->min(FF)F

    move-result v23
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    mul-float v23, v23, v26

    move-object/from16 v30, v2

    move/from16 v20, v7

    move v7, v12

    const/4 v12, -0x1

    move v2, v0

    move v0, v14

    move/from16 v14, v25

    move/from16 v25, v1

    move-object v1, v8

    move v8, v5

    move-object v5, v9

    move v9, v6

    move-object/from16 v6, p3

    move-object/from16 p3, v10

    move/from16 v10, v23

    :try_start_5
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    move/from16 v23, v7

    move-object/from16 v24, v13

    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    iget v7, v1, Lcom/example/lockwidgets/HomeWidgets$State;->previous:I

    aget-object v6, v6, v7

    sub-float v29, v4, v23

    sub-float v7, v29, v9

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v10

    mul-float v10, v10, v26

    move-object/from16 v13, v19

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move/from16 v31, v7

    move-object/from16 v19, v11

    move/from16 v32, v12

    move-object/from16 v26, v13

    move v13, v9

    const v6, 0x3db851ec    # 0.09f

    mul-float v7, v20, v6

    const/high16 v6, 0x41000000    # 8.0f

    :try_start_6
    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v10
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    move-object/from16 v6, p3

    move v9, v4

    move v12, v14

    move v8, v15

    move/from16 v7, v23

    move/from16 v11, v25

    :try_start_7
    invoke-static/range {v5 .. v12}, Lcom/example/lockwidgets/HomeWidgets;->bar(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFFF)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    :try_start_8
    iget-wide v8, v1, Lcom/example/lockwidgets/HomeWidgets$State;->at:J

    iget-boolean v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    invoke-static {v8, v9, v4}, Lcom/example/lockwidgets/HomeWidgets;->tm(JZ)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v4
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    const/high16 v15, 0x41a80000    # 21.0f

    mul-float v10, v4, v15

    move v8, v3

    move v9, v13

    move-object/from16 v11, v17

    move-object/from16 v13, v24

    move/from16 v12, v32

    :try_start_9
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    move/from16 v23, v7

    iget-wide v3, v1, Lcom/example/lockwidgets/HomeWidgets$State;->prev:J

    iget-boolean v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    invoke-static {v3, v4, v6}, Lcom/example/lockwidgets/HomeWidgets;->tm(JZ)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v3

    mul-float v10, v3, v15

    move-object/from16 v13, v26

    move/from16 v7, v31

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move/from16 v32, v12

    const v3, 0x3ef5c28f    # 0.48f

    mul-float v9, v22, v3

    :try_start_a
    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hijri:Ljava/lang/String;

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v3

    mul-float v10, v3, v28

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    const v12, -0x696962

    move/from16 v8, v16

    move-object/from16 v11, v19

    move/from16 v7, v23

    :try_start_b
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    move v3, v7

    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->greg:Ljava/lang/String;

    sub-float v7, v29, v9

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v1

    mul-float v10, v1, v28

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    const v12, -0x696962

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    const v1, 0x3e75c28f    # 0.24f

    mul-float v1, v1, v22

    add-float v7, v3, v1

    const v1, 0x3f051eb8    # 0.52f

    mul-float v9, v22, v1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v27

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const v12, -0x1a4bab

    move/from16 v8, p1

    move-object/from16 v6, v30

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->heroText(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_e

    goto/16 :goto_1c

    .line 31
    :catch_0
    move-exception v0

    move-object v4, v5

    move/from16 v32, v12

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v4, v5

    move v14, v12

    goto :goto_1

    :catch_2
    move-exception v0

    move-object v4, v5

    :goto_1
    move-object/from16 v11, v19

    goto/16 :goto_21

    :catch_3
    move-exception v0

    goto/16 :goto_e

    :catch_4
    move-exception v0

    move/from16 v20, v7

    move-object v4, v9

    move/from16 v14, v25

    const/16 v32, -0x1

    goto/16 :goto_1e

    .line 25
    :cond_2
    move/from16 v30, v1

    move-object/from16 v31, v2

    move/from16 v20, v7

    move-object v1, v8

    move v3, v12

    move-object/from16 v26, v17

    move/from16 v14, v25

    const/high16 v2, 0x3f800000    # 1.0f

    const/16 v32, -0x1

    move/from16 v17, v4

    move-object v4, v9

    move-object/from16 v25, v10

    :try_start_c
    const-string v7, "NextPrayer"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_15

    const/high16 v33, 0x41600000    # 14.0f

    const-wide/16 v34, 0x3c

    const-string v8, "PrayerBar"

    const v12, -0x363632

    if-nez v7, :cond_10

    :try_start_d
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, v3

    move v3, v12

    move/from16 v9, v22

    const/16 v19, 0x0

    goto/16 :goto_11

    .line 26
    :cond_3
    const-string v5, "Schedule"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_15

    if-eqz v5, :cond_4

    const/high16 v0, 0x40c00000    # 6.0f

    div-float v22, v22, v0

    const/4 v0, 0x0

    :goto_2
    const/4 v2, 0x6

    if-ge v0, v2, :cond_1d

    sub-float v2, v17, v3

    add-int/lit8 v15, v0, 0x1

    int-to-float v5, v15

    mul-float v5, v5, v22

    sub-float/2addr v2, v5

    :try_start_e
    iget-object v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    aget-object v6, v5, v0

    add-float v7, v2, v18

    const v2, 0x3e99999a    # 0.3f

    mul-float v8, v20, v2

    sub-float v9, v22, v16

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7

    const/high16 v10, 0x41500000    # 13.0f

    move-object v5, v4

    :try_start_f
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6

    move-object v4, v11

    move/from16 v25, v12

    :try_start_10
    iget-object v2, v1, Lcom/example/lockwidgets/HomeWidgets$State;->ts:[J

    aget-wide v10, v2, v0

    iget-boolean v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    invoke-static {v10, v11, v0}, Lcom/example/lockwidgets/HomeWidgets;->tm(JZ)Ljava/lang/String;

    move-result-object v6

    const v0, 0x3f30a3d7    # 0.69f

    mul-float v8, v20, v0

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_5

    const/high16 v10, 0x41500000    # 13.0f

    move-object/from16 v11, v26

    move/from16 v12, v32

    :try_start_11
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_c

    move-object v11, v4

    move-object v4, v5

    move v0, v15

    move/from16 v12, v25

    goto :goto_2

    .line 31
    :catch_5
    move-exception v0

    goto/16 :goto_8

    :catch_6
    move-exception v0

    goto :goto_3

    :catch_7
    move-exception v0

    move-object v5, v4

    :goto_3
    move-object v4, v11

    goto/16 :goto_21

    .line 27
    :cond_4
    move-object v5, v4

    move-object v4, v11

    move/from16 v25, v12

    :try_start_12
    const-string v6, "Clock"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_10

    const v16, 0x3f333333    # 0.7f

    if-eqz v6, :cond_9

    const v0, 0x3e6b851f    # 0.23f

    mul-float v9, v22, v0

    const/4 v0, 0x0

    :goto_4
    const/4 v2, 0x2

    if-ge v0, v2, :cond_8

    if-nez v0, :cond_5

    move v7, v3

    goto :goto_5

    :cond_5
    sub-float v2, v17, v3

    sub-float v12, v2, v9

    move v7, v12

    :goto_5
    :try_start_13
    iget-object v2, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_9

    if-nez v0, :cond_6

    :try_start_14
    iget v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_5

    goto :goto_6

    :cond_6
    :try_start_15
    iget v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->previous:I

    :goto_6
    aget-object v6, v2, v6

    const v2, 0x3e8f5c29    # 0.28f

    mul-float v8, v20, v2

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_9

    const/high16 v10, 0x41500000    # 13.0f

    move/from16 p3, v3

    move-object v11, v4

    move/from16 v12, v25

    const-wide/16 v2, 0x0

    const/16 v19, 0x0

    :try_start_16
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_8

    if-nez v0, :cond_7

    :try_start_17
    iget-wide v10, v1, Lcom/example/lockwidgets/HomeWidgets$State;->at:J
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_5

    goto :goto_7

    :cond_7
    :try_start_18
    iget-wide v10, v1, Lcom/example/lockwidgets/HomeWidgets$State;->prev:J

    :goto_7
    iget-boolean v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    invoke-static {v10, v11, v6}, Lcom/example/lockwidgets/HomeWidgets;->tm(JZ)Ljava/lang/String;

    move-result-object v6

    mul-float v8, v20, v16

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_9

    const/high16 v10, 0x41700000    # 15.0f

    move-object/from16 v11, v26

    move/from16 v12, v32

    :try_start_19
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    add-int/lit8 v0, v0, 0x1

    move/from16 v3, p3

    move-object/from16 v26, v11

    move/from16 v32, v12

    goto :goto_4

    .line 31
    :catch_8
    move-exception v0

    move-object v4, v11

    move/from16 v12, v32

    goto/16 :goto_21

    :catch_9
    move-exception v0

    move/from16 v12, v32

    goto/16 :goto_8

    .line 27
    :cond_8
    move v0, v2

    move/from16 p3, v3

    move-object/from16 v11, v26

    move/from16 v12, v32

    const-wide/16 v2, 0x0

    const/16 v19, 0x0

    iget-wide v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->at:J

    move/from16 p1, v0

    iget-wide v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->now:J

    sub-long/2addr v6, v0

    const-wide/16 v0, 0x3e8

    div-long/2addr v6, v0

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "%02d:%02d:%02d"

    const-wide/16 v6, 0xe10

    div-long v6, v0, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    div-long v7, v0, v34

    rem-long v7, v7, v34

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    rem-long v0, v0, v34

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v6, v1, v19

    aput-object v7, v1, v15

    aput-object v0, v1, p1

    invoke-static {v2, v3, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    add-float v7, p3, v9

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float v8, v20, v0

    mul-float v9, v9, v18

    sub-float v9, v22, v9

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/high16 v10, 0x41d00000    # 26.0f

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_a

    goto/16 :goto_1c

    .line 31
    :catch_a
    move-exception v0

    move-object v11, v4

    goto/16 :goto_f

    .line 28
    :cond_9
    move/from16 p3, v3

    move-object/from16 v11, v26

    move/from16 v12, v32

    :try_start_1a
    const-string v3, "DayPrayer"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_f

    const/high16 v6, 0x42700000    # 60.0f

    if-eqz v3, :cond_a

    move v3, v6

    :try_start_1b
    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->day:Ljava/lang/String;

    const v0, 0x3ea8f5c3    # 0.33f

    mul-float v8, v20, v0

    div-float v7, v20, v3

    invoke-static {v2, v7}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/high16 v3, 0x41a00000    # 20.0f

    mul-float v10, v0, v3

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_c

    move/from16 v7, p3

    move-object v11, v4

    move/from16 v9, v22

    :try_start_1c
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_b

    move/from16 v32, v12

    :try_start_1d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    iget v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v3, v1, Lcom/example/lockwidgets/HomeWidgets$State;->at:J

    iget-boolean v1, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    invoke-static {v3, v4, v1}, Lcom/example/lockwidgets/HomeWidgets;->tm(JZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    mul-float v8, v20, v16

    div-float v0, v20, v29

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v33

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    move/from16 v12, v25

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_6

    goto/16 :goto_1c

    .line 31
    :catch_b
    move-exception v0

    move-object v4, v11

    goto/16 :goto_f

    :catch_c
    move-exception v0

    move/from16 v32, v12

    :goto_8
    move-object v11, v4

    goto/16 :goto_21

    .line 29
    :cond_a
    move/from16 v7, p3

    move v3, v6

    move/from16 v32, v12

    move/from16 v9, v22

    :try_start_1e
    const-string v6, "Pill"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_10

    if-eqz v6, :cond_c

    :try_start_1f
    iget-boolean v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    if-eqz v0, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u0623\u0630\u0627\u0646 "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    iget v1, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    aget-object v1, v6, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    iget v1, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    aget-object v1, v6, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Adhan"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto :goto_9

    :goto_a
    move-object v6, v0

    const v0, 0x3ea3d70a    # 0.32f

    mul-float v8, v20, v0

    div-float v0, v20, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v27

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_5

    move-object v11, v4

    move/from16 v12, v32

    :try_start_20
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_b

    const v0, 0x3f2e147b    # 0.68f

    mul-float v8, v20, v0

    div-float v0, v20, v29

    :try_start_21
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v28

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    move/from16 v12, v25

    move-object/from16 v6, v31

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_6

    goto/16 :goto_1c

    .line 30
    :cond_c
    :try_start_22
    const-string v3, "Hijri"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_10

    if-eqz v0, :cond_d

    :try_start_23
    iget-object v3, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hday:Ljava/lang/String;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_5

    goto :goto_b

    :cond_d
    :try_start_24
    iget-object v3, v1, Lcom/example/lockwidgets/HomeWidgets$State;->gday:Ljava/lang/String;

    :goto_b
    move-object v6, v3

    const/high16 v3, 0x3e800000    # 0.25f

    mul-float v8, v20, v3

    div-float v3, v20, v29

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v10

    const/high16 v12, 0x41d00000    # 26.0f

    mul-float/2addr v10, v12

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_10

    move/from16 v12, v32

    :try_start_25
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_f

    if-eqz v0, :cond_e

    :try_start_26
    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hmonth:Ljava/lang/String;
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_a

    goto :goto_c

    :cond_e
    :try_start_27
    iget-object v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->gmonth:Ljava/lang/String;

    :goto_c
    const v8, 0x3f0ccccd    # 0.55f

    mul-float v8, v8, v20

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v10

    mul-float v10, v10, v33

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_f

    move-object v11, v4

    :try_start_28
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_3

    move/from16 v32, v12

    if-eqz v0, :cond_f

    :try_start_29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hyear:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \u0647\u0640"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_d

    goto :goto_d

    .line 31
    :catch_d
    move-exception v0

    goto/16 :goto_21

    .line 30
    :cond_f
    :try_start_2a
    iget-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->gyear:Ljava/lang/String;

    :goto_d
    move-object v6, v0

    const v0, 0x3f4ccccd    # 0.8f

    mul-float v8, v20, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v28

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    move/from16 v12, v25

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_e

    goto/16 :goto_1c

    .line 31
    :catch_e
    move-exception v0

    goto :goto_10

    :catch_f
    move-exception v0

    move-object v11, v4

    :goto_e
    move-object v4, v5

    :goto_f
    move/from16 v32, v12

    goto/16 :goto_21

    :catch_10
    move-exception v0

    move-object v11, v4

    :goto_10
    move-object v4, v5

    goto/16 :goto_21

    .line 25
    :cond_10
    move v7, v3

    move v3, v12

    move/from16 v9, v22

    const/16 v19, 0x0

    :goto_11
    const v10, 0x3fb9999a    # 1.45f

    mul-float v10, v10, v20

    cmpg-float v10, v17, v10

    if-gez v10, :cond_11

    goto :goto_12

    :cond_11
    move/from16 v15, v19

    :goto_12
    const v10, 0x3de147ae    # 0.11f

    mul-float v10, v10, v20

    const/high16 v12, 0x41200000    # 10.0f

    :try_start_2b
    invoke-static {v12, v10}, Ljava/lang/Math;->min(FF)F

    move-result v16

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    const v10, 0x3e570a3d    # 0.21f

    :goto_13
    mul-float v10, v10, v20

    goto :goto_14

    :cond_12
    if-eqz v15, :cond_13

    const v10, 0x3e051eb8    # 0.13f

    goto :goto_13

    :cond_13
    const v10, 0x3e851eb8    # 0.26f

    goto :goto_13

    :goto_14
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    const v12, 0x3f4a3d71    # 0.79f

    :goto_15
    mul-float v12, v12, v20

    move/from16 v19, v12

    goto :goto_16

    :cond_14
    if-eqz v15, :cond_15

    const v12, 0x3ea6e979    # 0.326f

    goto :goto_15

    :cond_15
    const v12, 0x3efc6a7f    # 0.493f

    goto :goto_15

    :goto_16
    iget-object v12, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    iget v13, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    aget-object v12, v12, v13

    div-float v13, v20, v29

    invoke-static {v2, v13}, Ljava/lang/Math;->min(FF)F

    move-result v22

    mul-float v22, v22, v33

    move/from16 v23, v13

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_15

    move-object v3, v8

    move v8, v10

    move/from16 v10, v22

    move-wide/from16 v36, v5

    move-object v5, v4

    move-object v6, v12

    move/from16 v4, v23

    move/from16 v12, v32

    move-wide/from16 v22, v36

    :try_start_2c
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_14

    move-object/from16 v24, v11

    :try_start_2d
    iget-wide v10, v1, Lcom/example/lockwidgets/HomeWidgets$State;->at:J

    iget-boolean v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    invoke-static {v10, v11, v6}, Lcom/example/lockwidgets/HomeWidgets;->tm(JZ)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    const/16 v8, 0x10

    goto :goto_17

    :cond_16
    const/16 v8, 0x12

    :goto_17
    int-to-float v8, v8

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v10

    mul-float/2addr v10, v8

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    move/from16 v8, v19

    move-object/from16 v11, v26

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_13

    move/from16 v32, v12

    :try_start_2e
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_2e} :catch_12

    if-eqz v0, :cond_17

    const v0, 0x3ed81062    # 0.422f

    mul-float v8, v20, v0

    move v12, v14

    move/from16 v10, v16

    move/from16 v9, v17

    move-object/from16 v6, v25

    move/from16 v11, v30

    :try_start_2f
    invoke-static/range {v5 .. v12}, Lcom/example/lockwidgets/HomeWidgets;->bar(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFFF)V
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_11

    goto/16 :goto_1c

    .line 31
    :catch_11
    move-exception v0

    move v14, v12

    goto/16 :goto_1d

    .line 25
    :cond_17
    if-eqz v15, :cond_1c

    :try_start_30
    iget-boolean v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    if-eqz v0, :cond_18

    const-string v0, "\u0627\u0644\u0645\u062a\u0628\u0642\u064a"

    goto :goto_18

    :cond_18
    const-string v0, "Remaining"

    :goto_18
    move-object v6, v0

    const v0, 0x3f0978d5    # 0.537f

    mul-float v8, v20, v0

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/high16 v3, 0x41300000    # 11.0f

    mul-float v10, v0, v3

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_12

    move-object/from16 v11, v24

    const v12, -0x363632

    :try_start_31
    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    div-long v12, v22, v34

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    if-eqz v6, :cond_19

    const-string v6, " \u0633\u0627\u0639\u0627\u062a"

    goto :goto_19

    :cond_19
    const-string v6, " hours"

    :goto_19
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const v0, 0x3f2e5604    # 0.681f

    mul-float v8, v20, v0

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v3

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const v12, -0x363632

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    if-eqz v6, :cond_1a

    const-string v6, "\u0648 "

    goto :goto_1a

    :cond_1a
    const-string v6, "and "

    :goto_1a
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    rem-long v12, v22, v34

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    if-eqz v1, :cond_1b

    const-string v1, " \u062f\u0642\u064a\u0642\u0629"

    goto :goto_1b

    :cond_1b
    const-string v1, " minutes"

    :goto_1b
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const v0, 0x3f5645a2    # 0.837f

    mul-float v8, v20, v0

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v3

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const v12, -0x363632

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    goto :goto_1c

    :cond_1c
    move-object/from16 v11, v24

    const v12, -0x363632

    const v0, 0x3f3ae148    # 0.73f

    mul-float v8, v20, v0

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float v10, v0, v28

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    move-object/from16 v6, v31

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_d

    .line 31
    :cond_1d
    :goto_1c
    goto :goto_23

    :catch_12
    move-exception v0

    goto :goto_1d

    :catch_13
    move-exception v0

    move/from16 v32, v12

    :goto_1d
    move-object/from16 v11, v24

    goto :goto_21

    :catch_14
    move-exception v0

    goto/16 :goto_f

    :catch_15
    move-exception v0

    :goto_1e
    move-object v5, v4

    goto :goto_21

    :catch_16
    move-exception v0

    move/from16 v20, v7

    move-object v5, v9

    move/from16 v14, v25

    goto :goto_20

    :catch_17
    move-exception v0

    goto :goto_1f

    :catch_18
    move-exception v0

    move/from16 v20, v7

    move-object v5, v9

    move-object/from16 v21, v13

    goto :goto_20

    :catch_19
    move-exception v0

    move-object/from16 v21, v6

    :goto_1f
    move/from16 v20, v7

    move-object v5, v9

    :goto_20
    const/16 v32, -0x1

    :goto_21
    const-string v1, "WathakkerHome"

    const-string v2, "Render failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static/range {p0 .. p0}, Lcom/example/lockwidgets/HomeWidgets;->ar(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1e

    const-string v0, "\u062a\u0639\u0630\u0631 \u062d\u0633\u0627\u0628 \u0627\u0644\u0635\u0644\u0627\u0629"

    goto :goto_22

    :cond_1e
    const-string v0, "Prayer time unavailable"

    :goto_22
    move-object v6, v0

    div-float v8, v20, v18

    add-int/lit8 v0, p2, -0xa

    int-to-float v9, v0

    const/high16 v10, 0x41400000    # 12.0f

    sget-object v13, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/high16 v7, 0x40a00000    # 5.0f

    move/from16 v12, v32

    invoke-static/range {v5 .. v14}, Lcom/example/lockwidgets/HomeWidgets;->text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V

    :goto_23
    return-object v21
.end method

.method static res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p2, p1, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static state(Landroid/content/Context;)Lcom/example/lockwidgets/HomeWidgets$State;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 21
    move-object/from16 v0, p0

    new-instance v1, Lcom/example/lockwidgets/HomeWidgets$State;

    invoke-direct {v1}, Lcom/example/lockwidgets/HomeWidgets$State;-><init>()V

    invoke-static {v0}, Lcom/example/lockwidgets/HomeWidgets;->ar(Landroid/content/Context;)Z

    move-result v2

    iput-boolean v2, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    iget-boolean v2, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    if-eqz v2, :cond_0

    new-instance v2, Ljava/util/Locale;

    const-string v3, "ar"

    invoke-direct {v2, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/example/lockwidgets/HomeWidgets;->times(Landroid/content/Context;Ljava/util/Calendar;)[J

    move-result-object v4

    iput-object v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->ts:[J

    iget-boolean v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x6

    const/4 v8, 0x2

    const/4 v9, 0x5

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_1

    new-array v4, v7, [Ljava/lang/String;

    const-string v12, "\u0627\u0644\u0641\u062c\u0631"

    aput-object v12, v4, v11

    const-string v12, "\u0627\u0644\u0634\u0631\u0648\u0642"

    aput-object v12, v4, v10

    const-string v12, "\u0627\u0644\u0638\u0647\u0631"

    aput-object v12, v4, v8

    const-string v12, "\u0627\u0644\u0639\u0635\u0631"

    aput-object v12, v4, v6

    const-string v12, "\u0627\u0644\u0645\u063a\u0631\u0628"

    aput-object v12, v4, v5

    const-string v12, "\u0627\u0644\u0639\u0634\u0627\u0621"

    aput-object v12, v4, v9

    goto :goto_1

    :cond_1
    new-array v4, v7, [Ljava/lang/String;

    const-string v12, "Fajr"

    aput-object v12, v4, v11

    const-string v12, "Sunrise"

    aput-object v12, v4, v10

    const-string v12, "Dhuhr"

    aput-object v12, v4, v8

    const-string v12, "Asr"

    aput-object v12, v4, v6

    const-string v12, "Maghrib"

    aput-object v12, v4, v5

    const-string v12, "Isha"

    aput-object v12, v4, v9

    :goto_1
    iput-object v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->names:[Ljava/lang/String;

    const/4 v4, -0x1

    iput v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    move v12, v11

    :goto_2
    if-ge v12, v7, :cond_4

    if-eq v12, v10, :cond_2

    iget-object v13, v1, Lcom/example/lockwidgets/HomeWidgets$State;->ts:[J

    aget-wide v14, v13, v12

    move v13, v5

    move/from16 v16, v6

    iget-wide v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->now:J

    cmp-long v5, v14, v5

    if-lez v5, :cond_3

    iput v12, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    goto :goto_3

    :cond_2
    move v13, v5

    move/from16 v16, v6

    :cond_3
    add-int/lit8 v12, v12, 0x1

    move v5, v13

    move/from16 v6, v16

    goto :goto_2

    :cond_4
    move v13, v5

    move/from16 v16, v6

    :goto_3
    iget v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    if-gez v5, :cond_5

    invoke-virtual {v3}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Calendar;

    invoke-virtual {v4, v9, v10}, Ljava/util/Calendar;->add(II)V

    invoke-static {v0, v4}, Lcom/example/lockwidgets/HomeWidgets;->times(Landroid/content/Context;Ljava/util/Calendar;)[J

    move-result-object v4

    aget-wide v5, v4, v11

    iput-wide v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->at:J

    iput v11, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    iget-object v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->ts:[J

    aget-wide v5, v4, v9

    :goto_4
    iput-wide v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->prev:J

    iput v9, v1, Lcom/example/lockwidgets/HomeWidgets$State;->previous:I

    goto :goto_6

    :cond_5
    iget-object v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->ts:[J

    iget v6, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    aget-wide v14, v5, v6

    iput-wide v14, v1, Lcom/example/lockwidgets/HomeWidgets$State;->at:J

    iget v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    if-ne v5, v8, :cond_6

    move v5, v11

    goto :goto_5

    :cond_6
    iget v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    sub-int/2addr v5, v10

    :goto_5
    iput v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->previous:I

    iget v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->next:I

    if-nez v5, :cond_7

    invoke-virtual {v3}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Calendar;

    invoke-virtual {v5, v9, v4}, Ljava/util/Calendar;->add(II)V

    invoke-static {v0, v5}, Lcom/example/lockwidgets/HomeWidgets;->times(Landroid/content/Context;Ljava/util/Calendar;)[J

    move-result-object v4

    aget-wide v5, v4, v9

    goto :goto_4

    :cond_7
    iget-object v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->ts:[J

    iget v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->previous:I

    aget-wide v5, v4, v5

    iput-wide v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->prev:J

    :goto_6
    const-string v4, "com.example.fajr.data.FajrPreferences"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-string v6, "getCityName"

    new-array v12, v11, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    new-array v6, v10, [Ljava/lang/Class;

    const-class v12, Landroid/content/Context;

    aput-object v12, v6, v11

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    new-array v6, v10, [Ljava/lang/Object;

    aput-object v0, v6, v11

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-array v4, v11, [Ljava/lang/Object;

    invoke-virtual {v5, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->city:Ljava/lang/String;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "EEEE"

    invoke-direct {v0, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->day:Ljava/lang/String;

    new-instance v0, Landroid/icu/util/IslamicCalendar;

    invoke-direct {v0}, Landroid/icu/util/IslamicCalendar;-><init>()V

    sget-object v4, Landroid/icu/util/IslamicCalendar$CalculationType;->ISLAMIC_UMALQURA:Landroid/icu/util/IslamicCalendar$CalculationType;

    invoke-virtual {v0, v4}, Landroid/icu/util/IslamicCalendar;->setCalculationType(Landroid/icu/util/IslamicCalendar$CalculationType;)V

    iget-boolean v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->arabic:Z

    const/16 v6, 0xa

    const/16 v12, 0x9

    const/16 v14, 0x8

    const/4 v15, 0x7

    const/16 p0, 0xb

    const/16 v5, 0xc

    if-eqz v4, :cond_8

    new-array v4, v5, [Ljava/lang/String;

    const-string v5, "\u0645\u062d\u0631\u0645"

    aput-object v5, v4, v11

    const-string v5, "\u0635\u0641\u0631"

    aput-object v5, v4, v10

    const-string v5, "\u0631\u0628\u064a\u0639 \u0627\u0644\u0623\u0648\u0644"

    aput-object v5, v4, v8

    const-string v5, "\u0631\u0628\u064a\u0639 \u0627\u0644\u0622\u062e\u0631"

    aput-object v5, v4, v16

    const-string v5, "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0623\u0648\u0644\u0649"

    aput-object v5, v4, v13

    const-string v5, "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0622\u062e\u0631\u0629"

    aput-object v5, v4, v9

    const-string v5, "\u0631\u062c\u0628"

    aput-object v5, v4, v7

    const-string v5, "\u0634\u0639\u0628\u0627\u0646"

    aput-object v5, v4, v15

    const-string v5, "\u0631\u0645\u0636\u0627\u0646"

    aput-object v5, v4, v14

    const-string v5, "\u0634\u0648\u0627\u0644"

    aput-object v5, v4, v12

    const-string v5, "\u0630\u0648 \u0627\u0644\u0642\u0639\u062f\u0629"

    aput-object v5, v4, v6

    const-string v5, "\u0630\u0648 \u0627\u0644\u062d\u062c\u0629"

    aput-object v5, v4, p0

    goto :goto_7

    :cond_8
    new-array v4, v5, [Ljava/lang/String;

    const-string v5, "Muharram"

    aput-object v5, v4, v11

    const-string v5, "Safar"

    aput-object v5, v4, v10

    const-string v5, "Rabi I"

    aput-object v5, v4, v8

    const-string v5, "Rabi II"

    aput-object v5, v4, v16

    const-string v5, "Jumada I"

    aput-object v5, v4, v13

    const-string v5, "Jumada II"

    aput-object v5, v4, v9

    const-string v5, "Rajab"

    aput-object v5, v4, v7

    const-string v5, "Sha\'ban"

    aput-object v5, v4, v15

    const-string v5, "Ramadan"

    aput-object v5, v4, v14

    const-string v5, "Shawwal"

    aput-object v5, v4, v12

    const-string v5, "Dhul Qadah"

    aput-object v5, v4, v6

    const-string v5, "Dhul Hijjah"

    aput-object v5, v4, p0

    :goto_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0, v9}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hday:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0, v10}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hyear:Ljava/lang/String;

    invoke-virtual {v0, v8}, Landroid/icu/util/IslamicCalendar;->get(I)I

    move-result v0

    aget-object v0, v4, v0

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hmonth:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hday:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hmonth:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->hijri:Ljava/lang/String;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "d MMMM"

    invoke-direct {v0, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->greg:Ljava/lang/String;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "d"

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->gday:Ljava/lang/String;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "MMMM"

    invoke-direct {v0, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->gmonth:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3, v10}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/example/lockwidgets/HomeWidgets$State;->gyear:Ljava/lang/String;

    return-object v1
.end method

.method static text(Landroid/graphics/Canvas;Ljava/lang/String;FFFFLandroid/graphics/Typeface;ILandroid/text/Layout$Alignment;F)V
    .locals 12

    .line 16
    move-object/from16 v0, p8

    new-instance v1, Landroid/text/TextPaint;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/text/TextPaint;-><init>(I)V

    move-object/from16 v3, p6

    invoke-virtual {v1, v3}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    mul-float v3, p5, p9

    invoke-virtual {v1, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    move/from16 v3, p7

    invoke-virtual {v1, v3}, Landroid/text/TextPaint;->setColor(I)V

    :goto_0
    invoke-virtual {v1, p1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x40000000    # 2.0f

    sub-float v6, p4, v5

    invoke-static {v4, v6}, Ljava/lang/Math;->max(FF)F

    move-result v4

    mul-float v4, v4, p9

    cmpl-float v3, v3, v4

    const/high16 v4, 0x3e800000    # 0.25f

    const/high16 v6, 0x40c00000    # 6.0f

    if-lez v3, :cond_0

    invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F

    move-result v3

    mul-float v7, p9, v6

    cmpl-float v3, v3, v7

    if-lez v3, :cond_0

    invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F

    move-result v3

    mul-float v4, v4, p9

    sub-float/2addr v3, v4

    invoke-virtual {v1, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    goto :goto_0

    :cond_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x0

    invoke-interface {v3, p1, v8, v7}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    if-ne v0, v3, :cond_1

    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_1

    :cond_1
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    if-ne v0, v3, :cond_2

    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    mul-float v7, p4, p9

    float-to-int v7, v7

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {p1, v8, v3, v1, v9}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    sget-object v9, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {v3, v9}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    const/4 v9, 0x2

    :goto_2
    invoke-virtual {v3, v9}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v10

    if-le v10, v2, :cond_3

    invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F

    move-result v10

    mul-float v11, p9, v6

    cmpl-float v10, v10, v11

    if-lez v10, :cond_3

    invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F

    move-result v3

    mul-float v10, p9, v4

    sub-float/2addr v3, v10

    invoke-virtual {v1, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-static {p1, v8, v3, v1, v10}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    sget-object v10, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {v3, v10}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    mul-float p2, p2, p9

    mul-float p1, p3, p9

    invoke-virtual {v3}, Landroid/text/StaticLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v5

    sub-float/2addr p1, v0

    invoke-virtual {p0, p2, p1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v3, p0}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method static times(Landroid/content/Context;Ljava/util/Calendar;)[J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 13
    const-class v0, Lcom/example/lockwidgets/LockWidgets;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Landroid/content/Context;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Ljava/util/Calendar;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "times"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v4

    aput-object p1, v1, v5

    const/4 p0, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    return-object p0
.end method

.method public static tm(JZ)Ljava/lang/String;
    .locals 5

    .line 18
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u2066"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "h:mm"

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "\u2069 "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const/16 p1, 0x9

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    if-eqz p2, :cond_1

    if-nez p1, :cond_0

    const-string p1, "\u0635"

    goto :goto_0

    :cond_0
    const-string p1, "\u0645"

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    const-string p1, "AM"

    goto :goto_0

    :cond_2
    const-string p1, "PM"

    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized updateAll(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/example/lockwidgets/HomeWidgets;

    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lcom/example/lockwidgets/HomeWidgets;->batchState:Ljava/lang/ThreadLocal;

    invoke-static {p0}, Lcom/example/lockwidgets/HomeWidgets;->state(Landroid/content/Context;)Lcom/example/lockwidgets/HomeWidgets$State;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0}, Lcom/example/lockwidgets/HomeWidgets;->updateBatch(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object p0, Lcom/example/lockwidgets/HomeWidgets;->batchState:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_3
    sget-object v1, Lcom/example/lockwidgets/HomeWidgets;->batchState:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    throw p0

    .line 11
    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0

    .line 11
    :catch_0
    move-exception p0

    goto :goto_0
.end method

.method static updateBatch(Landroid/content/Context;)V
    .locals 22

    .line 12
    move-object/from16 v1, p0

    const-string v2, "home_prayer_image"

    const-string v3, "id"

    const-string v4, "HeroLarge"

    const-string v5, "Hero"

    invoke-static {v1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v6

    const-string v15, "Hijri"

    const-string v16, "Gregorian"

    const-string v7, "Hero"

    const-string v8, "HeroLarge"

    const-string v9, "NextPrayer"

    const-string v10, "PrayerBar"

    const-string v11, "Schedule"

    const-string v12, "DayPrayer"

    const-string v13, "Pill"

    const-string v14, "Clock"

    filled-new-array/range {v7 .. v16}, [Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge v9, v0, :cond_a

    aget-object v10, v7, v9

    new-instance v0, Landroid/content/ComponentName;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "com.example.widget."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "WidgetProvider"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v1, v11}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_9

    aget v0, v11, v13

    :try_start_0
    invoke-virtual {v6, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    move-result-object v14

    invoke-virtual {v10, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    const-string v8, "Gregorian"

    move-object/from16 v17, v7

    const-string v7, "Hijri"

    const/16 v18, 0x5a

    if-nez v15, :cond_4

    :try_start_1
    const-string v15, "Schedule"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_0

    goto :goto_3

    :cond_0
    const-string v15, "Clock"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_1

    const/16 v15, 0xfa

    goto :goto_4

    :cond_1
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_3

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    goto :goto_2

    :cond_2
    const/16 v15, 0x6e

    goto :goto_4

    :cond_3
    :goto_2
    move/from16 v15, v18

    goto :goto_4

    :catch_0
    move-exception v0

    move-object/from16 v20, v5

    goto/16 :goto_8

    :cond_4
    :goto_3
    const/16 v15, 0x14a

    :goto_4
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v19, :cond_5

    const/16 v18, 0xa0

    :cond_5
    move/from16 v19, v9

    move/from16 v9, v18

    move-object/from16 v18, v11

    :try_start_2
    const-string v11, "appWidgetMinWidth"

    invoke-virtual {v14, v11, v15}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    const/16 v15, 0x32

    invoke-static {v15, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-eqz v15, :cond_6

    const/16 v15, 0x28

    goto :goto_5

    :cond_6
    const/16 v15, 0x3c

    :goto_5
    move-object/from16 v20, v5

    :try_start_3
    const-string v5, "appWidgetMinHeight"

    invoke-virtual {v14, v5, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    new-instance v9, Landroid/widget/RemoteViews;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v14

    const-string v15, "layout"
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move/from16 v21, v12

    :try_start_4
    const-string v12, "home_prayer_art"

    invoke-static {v1, v15, v12}, Lcom/example/lockwidgets/HomeWidgets;->res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    invoke-direct {v9, v14, v12}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    invoke-static {v1, v3, v2}, Lcom/example/lockwidgets/HomeWidgets;->res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    move-object/from16 v14, v20

    goto :goto_6

    :cond_7
    move-object v14, v10

    :goto_6
    invoke-static {v1, v14, v11, v5}, Lcom/example/lockwidgets/HomeWidgets;->renderKind(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v9, v12, v5}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    invoke-static {v1, v3, v2}, Lcom/example/lockwidgets/HomeWidgets;->res(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    const/4 v7, 0x1

    goto :goto_7

    :cond_8
    const/4 v7, 0x0

    :goto_7
    invoke-static {v1, v7}, Lcom/example/lockwidgets/HomeWidgets;->open(Landroid/content/Context;Z)Landroid/app/PendingIntent;

    move-result-object v7

    invoke-virtual {v9, v5, v7}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    invoke-virtual {v6, v0, v9}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_b

    :catch_1
    move-exception v0

    goto :goto_a

    :catch_2
    move-exception v0

    goto :goto_9

    :catch_3
    move-exception v0

    move-object/from16 v20, v5

    goto :goto_9

    :catch_4
    move-exception v0

    move-object/from16 v20, v5

    move-object/from16 v17, v7

    :goto_8
    move/from16 v19, v9

    move-object/from16 v18, v11

    :goto_9
    move/from16 v21, v12

    :goto_a
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Update failed: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "WathakkerHome"

    invoke-static {v7, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_b
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v7, v17

    move-object/from16 v11, v18

    move/from16 v9, v19

    move-object/from16 v5, v20

    move/from16 v12, v21

    goto/16 :goto_1

    :cond_9
    move-object/from16 v20, v5

    move-object/from16 v17, v7

    move/from16 v19, v9

    add-int/lit8 v9, v19, 0x1

    goto/16 :goto_0

    :cond_a
    return-void
.end method
