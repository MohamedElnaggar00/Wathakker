.class public final Lcom/example/ui/theme/ThemeKt;
.super Ljava/lang/Object;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/example/ui/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,123:1\n75#2:124\n75#2:125\n1282#3,6:126\n113#4:132\n113#4:133\n113#4:134\n113#4:135\n113#4:136\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/example/ui/theme/ThemeKt\n*L\n91#1:124\n98#1:125\n100#1:126,6\n75#1:132\n76#1:133\n77#1:134\n78#1:135\n79#1:136\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a>\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00080\u000f\u00a2\u0006\u0002\u0008\u0010H\u0007\u00a2\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0012"
    }
    d2 = {
        "DarkColorScheme",
        "Landroidx/compose/material3/ColorScheme;",
        "LightColorScheme",
        "OneUIShapes",
        "Landroidx/compose/material3/Shapes;",
        "getOneUIShapes",
        "()Landroidx/compose/material3/Shapes;",
        "MyApplicationTheme",
        "",
        "fontChoice",
        "Lcom/example/ui/theme/FontChoice;",
        "darkTheme",
        "",
        "dynamicColor",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "app"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DarkColorScheme:Landroidx/compose/material3/ColorScheme;

.field private static final LightColorScheme:Landroidx/compose/material3/ColorScheme;

.field private static final OneUIShapes:Landroidx/compose/material3/Shapes;


# direct methods
.method static constructor <clinit>()V
    .locals 78

    .line 26
    nop

    .line 27
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIAccentDark()J

    move-result-wide v1

    .line 28
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v3

    .line 29
    const v0, 0x293e91ff

    invoke-static {v0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v5

    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceDark()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v5

    .line 30
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIAccentDark()J

    move-result-wide v7

    .line 31
    const-wide v76, 0xff8e8e93L

    invoke-static/range {v76 .. v77}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v11

    .line 32
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v13

    .line 33
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceVariantDark()J

    move-result-wide v15

    .line 34
    const-wide v9, 0xffe0e0e0L

    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v17

    .line 35
    invoke-static/range {v76 .. v77}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v19

    .line 36
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIBackgroundDark()J

    move-result-wide v27

    .line 37
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUITextPrimaryDark()J

    move-result-wide v29

    .line 38
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceDark()J

    move-result-wide v31

    .line 39
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUITextPrimaryDark()J

    move-result-wide v33

    .line 40
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceVariantDark()J

    move-result-wide v35

    .line 41
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUITextSecondaryDark()J

    move-result-wide v37

    .line 42
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIDividerDark()J

    move-result-wide v53

    .line 43
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIDividerDark()J

    move-result-wide v55

    .line 44
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIPillDark()J

    move-result-wide v65

    .line 45
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIErrorDark()J

    move-result-wide v45

    .line 46
    const v0, 0x29ff5a5f

    invoke-static {v0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v9

    move-wide/from16 v21, v1

    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceDark()J

    move-result-wide v0

    invoke-static {v9, v10, v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v49

    .line 47
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIErrorDark()J

    move-result-wide v51

    .line 27
    nop

    .line 28
    nop

    .line 29
    nop

    .line 30
    nop

    .line 26
    nop

    .line 31
    nop

    .line 32
    nop

    .line 33
    nop

    .line 34
    nop

    .line 35
    nop

    .line 26
    nop

    .line 36
    nop

    .line 37
    nop

    .line 38
    nop

    .line 39
    nop

    .line 40
    nop

    .line 41
    nop

    .line 26
    nop

    .line 45
    nop

    .line 26
    nop

    .line 46
    nop

    .line 47
    nop

    .line 42
    nop

    .line 43
    nop

    .line 26
    nop

    .line 44
    nop

    .line 26
    const/16 v74, 0xe

    const/16 v75, 0x0

    const-wide/16 v9, 0x0

    move-wide/from16 v1, v21

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v57, 0x0

    const-wide/16 v59, 0x0

    const-wide/16 v61, 0x0

    const-wide/16 v63, 0x0

    const-wide/16 v67, 0x0

    const-wide/16 v69, 0x0

    const-wide/16 v71, 0x0

    const v73, -0xf47e3f0

    invoke-static/range {v1 .. v75}, Landroidx/compose/material3/ColorSchemeKt;->darkColorScheme-C-Xl9yA$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/ThemeKt;->DarkColorScheme:Landroidx/compose/material3/ColorScheme;

    .line 50
    nop

    .line 51
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIAccentLight()J

    move-result-wide v1

    .line 52
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v3

    .line 53
    const v0, 0x240381fe

    invoke-static {v0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v5

    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceLight()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v5

    .line 54
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIAccentLight()J

    move-result-wide v7

    .line 55
    invoke-static/range {v76 .. v77}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v11

    .line 56
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v13

    .line 57
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceVariantLight()J

    move-result-wide v15

    .line 58
    const-wide v9, 0xff333333L

    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v17

    .line 59
    invoke-static/range {v76 .. v77}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v19

    .line 60
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIBackgroundLight()J

    move-result-wide v27

    .line 61
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUITextPrimaryLight()J

    move-result-wide v29

    .line 62
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceLight()J

    move-result-wide v31

    .line 63
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUITextPrimaryLight()J

    move-result-wide v33

    .line 64
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceVariantLight()J

    move-result-wide v35

    .line 65
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUITextSecondaryLight()J

    move-result-wide v37

    .line 66
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIDividerLight()J

    move-result-wide v53

    .line 67
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIDividerLight()J

    move-result-wide v55

    .line 68
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIPillLight()J

    move-result-wide v65

    .line 69
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIErrorLight()J

    move-result-wide v45

    .line 70
    const v0, 0x1fe5484d

    invoke-static {v0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v9

    move-wide/from16 v21, v1

    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUISurfaceLight()J

    move-result-wide v0

    invoke-static {v9, v10, v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v49

    .line 71
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getOneUIErrorLight()J

    move-result-wide v51

    .line 51
    nop

    .line 52
    nop

    .line 53
    nop

    .line 54
    nop

    .line 50
    nop

    .line 55
    nop

    .line 56
    nop

    .line 57
    nop

    .line 58
    nop

    .line 59
    nop

    .line 50
    nop

    .line 60
    nop

    .line 61
    nop

    .line 62
    nop

    .line 63
    nop

    .line 64
    nop

    .line 65
    nop

    .line 50
    nop

    .line 69
    nop

    .line 50
    nop

    .line 70
    nop

    .line 71
    nop

    .line 66
    nop

    .line 67
    nop

    .line 50
    nop

    .line 68
    nop

    .line 50
    const-wide/16 v9, 0x0

    move-wide/from16 v1, v21

    const-wide/16 v21, 0x0

    invoke-static/range {v1 .. v75}, Landroidx/compose/material3/ColorSchemeKt;->lightColorScheme-C-Xl9yA$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/ThemeKt;->LightColorScheme:Landroidx/compose/material3/ColorScheme;

    .line 74
    new-instance v1, Landroidx/compose/material3/Shapes;

    .line 75
    const/16 v0, 0x8

    .local v0, "$this$dp\\1":I
    const/4 v2, 0x0

    .line 132
    .local v2, "$i$f$getDp\\1\\75":I
    int-to-float v3, v0

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 75
    .end local v0    # "$this$dp\\1":I
    .end local v2    # "$i$f$getDp\\1\\75":I
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 76
    const/16 v0, 0xc

    .local v0, "$this$dp\\2":I
    const/4 v3, 0x0

    .line 133
    .local v3, "$i$f$getDp\\2\\76":I
    int-to-float v4, v0

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 76
    .end local v0    # "$this$dp\\2":I
    .end local v3    # "$i$f$getDp\\2\\76":I
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 77
    const/16 v0, 0x12

    .local v0, "$this$dp\\3":I
    const/4 v4, 0x0

    .line 134
    .local v4, "$i$f$getDp\\3\\77":I
    int-to-float v5, v0

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 77
    .end local v0    # "$this$dp\\3":I
    .end local v4    # "$i$f$getDp\\3\\77":I
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 78
    const/16 v0, 0x1a

    .local v0, "$this$dp\\4":I
    const/4 v5, 0x0

    .line 135
    .local v5, "$i$f$getDp\\4\\78":I
    int-to-float v6, v0

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 78
    .end local v0    # "$this$dp\\4":I
    .end local v5    # "$i$f$getDp\\4\\78":I
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 79
    const/16 v0, 0x20

    .local v0, "$this$dp\\5":I
    const/4 v6, 0x0

    .line 136
    .local v6, "$i$f$getDp\\5\\79":I
    int-to-float v7, v0

    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 79
    .end local v0    # "$this$dp\\5":I
    .end local v6    # "$i$f$getDp\\5\\79":I
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 74
    invoke-direct/range {v1 .. v6}, Landroidx/compose/material3/Shapes;-><init>(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V

    sput-object v1, Lcom/example/ui/theme/ThemeKt;->OneUIShapes:Landroidx/compose/material3/Shapes;

    return-void
.end method

.method public static final MyApplicationTheme(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .param p0, "fontChoice"    # Lcom/example/ui/theme/FontChoice;
    .param p1, "darkTheme"    # Z
    .param p2, "dynamicColor"    # Z
    .param p3, "content"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/theme/FontChoice;",
            "ZZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "content"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    const v0, -0x1cbfc051

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v10, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(MyApplicationTheme)N(fontChoice,darkTheme,dynamicColor,content)97@3714L7,116@4345L125,112@4212L258:Theme.kt#75kw8w"

    invoke-static {v10, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p5

    .local v1, "$dirty":I
    and-int/lit8 v2, p6, 0x1

    const/4 v3, -0x1

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_3

    if-nez p0, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move-object/from16 v6, p0

    check-cast v6, Ljava/lang/Enum;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    :goto_0
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x4

    goto :goto_1

    :cond_2
    const/4 v6, 0x2

    :goto_1
    or-int/2addr v1, v6

    :cond_3
    :goto_2
    and-int/lit8 v6, v5, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_6

    and-int/lit8 v6, p6, 0x2

    if-nez v6, :cond_4

    move/from16 v6, p1

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v7

    goto :goto_3

    :cond_4
    move/from16 v6, p1

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v1, v8

    goto :goto_4

    :cond_6
    move/from16 v6, p1

    :goto_4
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v1, v1, 0x180

    move/from16 v9, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_9

    move/from16 v9, p2

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_5

    :cond_8
    const/16 v11, 0x80

    :goto_5
    or-int/2addr v1, v11

    goto :goto_6

    :cond_9
    move/from16 v9, p2

    :goto_6
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_b

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_7

    :cond_a
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v1, v11

    :cond_b
    and-int/lit16 v11, v1, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_c

    const/4 v11, 0x1

    goto :goto_8

    :cond_c
    move v11, v13

    :goto_8
    and-int/lit8 v12, v1, 0x1

    invoke-interface {v10, v11, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v11

    if-eqz v11, :cond_1e

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v11, "84@3251L21"

    invoke-static {v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v11, v5, 0x1

    if-eqz v11, :cond_f

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v11

    if-eqz v11, :cond_d

    goto :goto_9

    .line 82
    :cond_d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_e

    and-int/lit8 v1, v1, -0x71

    :cond_e
    move v2, v6

    move v6, v1

    move v1, v2

    move-object/from16 v2, p0

    move v15, v9

    goto :goto_b

    .line 88
    :cond_f
    :goto_9
    if-eqz v2, :cond_10

    .line 84
    sget-object v2, Lcom/example/ui/theme/FontChoice;->SYSTEM:Lcom/example/ui/theme/FontChoice;

    .end local p0    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    .local v2, "fontChoice":Lcom/example/ui/theme/FontChoice;
    goto :goto_a

    .line 88
    .end local v2    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    .restart local p0    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    :cond_10
    move-object/from16 v2, p0

    .line 84
    .end local p0    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    .restart local v2    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    :goto_a
    and-int/lit8 v11, p6, 0x2

    if-eqz v11, :cond_11

    .line 85
    invoke-static {v10, v13}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result v6

    .end local p1    # "darkTheme":Z
    .local v6, "darkTheme":Z
    and-int/lit8 v1, v1, -0x71

    :cond_11
    if-eqz v8, :cond_12

    .line 86
    const/4 v8, 0x0

    move v15, v6

    move v6, v1

    move v1, v15

    move v15, v8

    .end local p2    # "dynamicColor":Z
    .local v8, "dynamicColor":Z
    goto :goto_b

    .line 85
    .end local v8    # "dynamicColor":Z
    .restart local p2    # "dynamicColor":Z
    :cond_12
    move v15, v6

    move v6, v1

    move v1, v15

    move v15, v9

    .line 82
    .end local p2    # "dynamicColor":Z
    .local v1, "darkTheme":Z
    .local v6, "$dirty":I
    .local v15, "dynamicColor":Z
    :goto_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_13

    const-string v8, "com.example.ui.theme.MyApplicationTheme (Theme.kt:87)"

    invoke-static {v0, v6, v3, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 89
    :cond_13
    nop

    .line 90
    const-string v0, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    const v3, 0x789c5f52

    if-eqz v15, :cond_15

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1f

    if-lt v8, v9, :cond_15

    const v8, 0x71b7b1f8

    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "90@3493L7"

    invoke-static {v10, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 91
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    check-cast v8, Landroidx/compose/runtime/CompositionLocal;

    .local v8, "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    const/4 v9, 0x0

    .local v9, "$changed\\1":I
    move-object v11, v10

    .local v11, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 124
    .local v12, "$i$f$getCurrent\\1\\91":I
    invoke-static {v11, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v16

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 91
    .end local v8    # "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    .end local v9    # "$changed\\1":I
    .end local v11    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$getCurrent\\1\\91":I
    move-object/from16 v8, v16

    check-cast v8, Landroid/content/Context;

    .line 92
    .local v8, "context":Landroid/content/Context;
    if-eqz v1, :cond_14

    invoke-static {v8}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicDarkColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v9

    goto :goto_c

    :cond_14
    invoke-static {v8}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicLightColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v9

    .line 90
    .end local v8    # "context":Landroid/content/Context;
    :goto_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_d

    .line 94
    :cond_15
    if-eqz v1, :cond_16

    const v8, 0x142f4cde

    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v9, Lcom/example/ui/theme/ThemeKt;->DarkColorScheme:Landroidx/compose/material3/ColorScheme;

    goto :goto_d

    .line 95
    :cond_16
    const v8, 0x142f50df

    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v9, Lcom/example/ui/theme/ThemeKt;->LightColorScheme:Landroidx/compose/material3/ColorScheme;

    .line 89
    :goto_d
    nop

    .line 98
    .local v9, "colorScheme":Landroidx/compose/material3/ColorScheme;
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    check-cast v8, Landroidx/compose/runtime/CompositionLocal;

    .local v8, "this_\\2":Landroidx/compose/runtime/CompositionLocal;
    const/4 v11, 0x0

    .local v11, "$changed\\2":I
    move-object v12, v10

    .local v12, "$composer\\2":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 125
    .local v16, "$i$f$getCurrent\\2\\98":I
    invoke-static {v12, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 98
    .end local v8    # "this_\\2":Landroidx/compose/runtime/CompositionLocal;
    .end local v11    # "$changed\\2":I
    .end local v12    # "$composer\\2":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$getCurrent\\2\\98":I
    check-cast v0, Landroid/view/View;

    .line 99
    .local v0, "view":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-nez v3, :cond_1c

    const v3, 0x71bc592b

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "99@3771L429,99@3760L440"

    invoke-static {v10, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 100
    const v3, 0x142f603c

    const-string v8, "CC(remember):Theme.kt#9igjgp"

    invoke-static {v10, v3, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v8, v6, 0x70

    xor-int/lit8 v8, v8, 0x30

    if-le v8, v7, :cond_17

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-nez v8, :cond_18

    :cond_17
    and-int/lit8 v8, v6, 0x30

    if-ne v8, v7, :cond_19

    :cond_18
    const/4 v7, 0x1

    goto :goto_e

    :cond_19
    move v7, v13

    :goto_e
    or-int/2addr v3, v7

    .local v3, "invalid\\3":Z
    move-object v7, v10

    .local v7, "$this$cache\\3":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 126
    .local v8, "$i$f$cache\\3\\100":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it\\3":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 127
    .local v12, "$i$a$-let-ComposerKt$cache$1\\4\\126\\3":I
    if-nez v3, :cond_1b

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v11, v14, :cond_1a

    goto :goto_f

    .line 131
    :cond_1a
    goto :goto_10

    .line 128
    :cond_1b
    :goto_f
    const/4 v14, 0x0

    .line 100
    .local v14, "$i$a$-cache-ThemeKt$MyApplicationTheme$1\\5\\128\\0":I
    new-instance v13, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda0;

    invoke-direct {v13, v0, v1}, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda0;-><init>(Landroid/view/View;Z)V

    .line 128
    .end local v14    # "$i$a$-cache-ThemeKt$MyApplicationTheme$1\\5\\128\\0":I
    nop

    .line 129
    .local v13, "value\\4":Ljava/lang/Object;
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 130
    move-object v11, v13

    .line 126
    .end local v11    # "it\\3":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1\\4\\126\\3":I
    .end local v13    # "value\\4":Ljava/lang/Object;
    :goto_10
    nop

    .line 100
    .end local v3    # "invalid\\3":Z
    .end local v7    # "$this$cache\\3":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache\\3\\100":I
    check-cast v11, Lkotlin/jvm/functions/Function0;

    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v3, 0x0

    invoke-static {v11, v10, v3}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 99
    goto :goto_11

    :cond_1c
    const v3, 0x71835ad3

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_11
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 115
    invoke-static {v2}, Lcom/example/ui/theme/TypeKt;->getTypography(Lcom/example/ui/theme/FontChoice;)Landroidx/compose/material3/Typography;

    move-result-object v8

    .line 116
    sget-object v7, Lcom/example/ui/theme/ThemeKt;->OneUIShapes:Landroidx/compose/material3/Shapes;

    .line 114
    nop

    .line 116
    nop

    .line 115
    nop

    .line 117
    new-instance v3, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda1;

    invoke-direct {v3, v4}, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function2;)V

    const/16 v11, 0x36

    const v12, 0x39876883

    const/4 v13, 0x1

    invoke-static {v12, v13, v3, v10, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 113
    const/16 v11, 0xc30

    const/4 v12, 0x0

    move-object/from16 v17, v9

    move-object v9, v3

    move v3, v6

    move-object/from16 v6, v17

    .end local v9    # "colorScheme":Landroidx/compose/material3/ColorScheme;
    .local v3, "$dirty":I
    .local v6, "colorScheme":Landroidx/compose/material3/ColorScheme;
    invoke-static/range {v6 .. v12}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 122
    .end local v0    # "view":Landroid/view/View;
    .end local v6    # "colorScheme":Landroidx/compose/material3/ColorScheme;
    :cond_1d
    move-object v7, v2

    move v2, v1

    move-object v1, v7

    move v7, v3

    move v3, v15

    goto :goto_12

    .line 82
    .end local v2    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    .end local v3    # "$dirty":I
    .end local v15    # "dynamicColor":Z
    .local v1, "$dirty":I
    .restart local p0    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    .restart local p1    # "darkTheme":Z
    .restart local p2    # "dynamicColor":Z
    :cond_1e
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v7, v1

    move v2, v6

    move v3, v9

    move-object/from16 v1, p0

    .line 122
    .end local p0    # "fontChoice":Lcom/example/ui/theme/FontChoice;
    .end local p1    # "darkTheme":Z
    .end local p2    # "dynamicColor":Z
    .local v1, "fontChoice":Lcom/example/ui/theme/FontChoice;
    .local v2, "darkTheme":Z
    .local v3, "dynamicColor":Z
    .local v7, "$dirty":I
    :goto_12
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda2;

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda2;-><init>(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;II)V

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1f
    return-void
.end method

.method static final MyApplicationTheme$lambda$1$lambda$0(Landroid/view/View;Z)Lkotlin/Unit;
    .locals 4
    .param p0, "$view"    # Landroid/view/View;
    .param p1, "$darkTheme"    # Z

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 102
    .local v0, "context":Landroid/content/Context;
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_0

    .line 103
    instance-of v1, v0, Landroid/app/Activity;

    if-nez v1, :cond_0

    .line 104
    move-object v1, v0

    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    .line 106
    :cond_0
    instance-of v1, v0, Landroid/app/Activity;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 107
    .local v2, "window":Landroid/view/Window;
    :cond_2
    if-eqz v2, :cond_3

    .line 108
    invoke-static {v2, p0}, Landroidx/core/view/WindowCompat;->getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;

    move-result-object v1

    xor-int/lit8 v3, p1, 0x1

    invoke-virtual {v1, v3}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 110
    :cond_3
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method static final MyApplicationTheme$lambda$3(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 5
    .param p0, "$content"    # Lkotlin/jvm/functions/Function2;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C117@4431L33,117@4355L109:Theme.kt#75kw8w"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.theme.MyApplicationTheme.<anonymous> (Theme.kt:117)"

    const v3, 0x39876883

    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 118
    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v0

    new-instance v1, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v4, -0x799f643d

    invoke-static {v4, v2, v1, p1, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p1, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 117
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 121
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MyApplicationTheme$lambda$3$lambda$2(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 4
    .param p0, "$content"    # Lkotlin/jvm/functions/Function2;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C118@4445L9:Theme.kt#75kw8w"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.example.ui.theme.MyApplicationTheme.<anonymous>.<anonymous> (Theme.kt:118)"

    const v3, -0x799f643d

    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 119
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    .line 118
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 120
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final MyApplicationTheme$lambda$4(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    or-int/lit8 v0, p4, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v7, p5

    move-object v5, p6

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/ThemeKt;->MyApplicationTheme(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final getOneUIShapes()Landroidx/compose/material3/Shapes;
    .locals 1

    .line 74
    sget-object v0, Lcom/example/ui/theme/ThemeKt;->OneUIShapes:Landroidx/compose/material3/Shapes;

    return-object v0
.end method
