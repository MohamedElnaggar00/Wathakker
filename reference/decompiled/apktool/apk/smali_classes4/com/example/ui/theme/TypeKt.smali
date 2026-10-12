.class public final Lcom/example/ui/theme/TypeKt;
.super Ljava/lang/Object;
.source "Type.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/ui/theme/TypeKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\n\u001a\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0003\"\u0011\u0010\u0016\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0003\"\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0003\"\u0011\u0010\u001a\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0003\u00a8\u0006!"
    }
    d2 = {
        "TajawalFontFamily",
        "Landroidx/compose/ui/text/font/FontFamily;",
        "getTajawalFontFamily",
        "()Landroidx/compose/ui/text/font/FontFamily;",
        "oneUi",
        "Landroidx/compose/ui/text/TextStyle;",
        "size",
        "Landroidx/compose/ui/unit/TextUnit;",
        "line",
        "bold",
        "",
        "family",
        "oneUi-H_8_nhI",
        "(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;",
        "oneUiTypography",
        "Landroidx/compose/material3/Typography;",
        "TajawalLightFontFamily",
        "getTajawalLightFontFamily",
        "TajawalBoldFontFamily",
        "getTajawalBoldFontFamily",
        "CairoFontFamily",
        "getCairoFontFamily",
        "NotoNaskhFontFamily",
        "getNotoNaskhFontFamily",
        "AmiriFontFamily",
        "getAmiriFontFamily",
        "ArefRuqaaFontFamily",
        "getArefRuqaaFontFamily",
        "fontFamilyFor",
        "choice",
        "Lcom/example/ui/theme/FontChoice;",
        "getTypography",
        "useDeviceFont",
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
.field private static final AmiriFontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field private static final ArefRuqaaFontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field private static final CairoFontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field private static final NotoNaskhFontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field private static final TajawalBoldFontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field private static final TajawalFontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field private static final TajawalLightFontFamily:Landroidx/compose/ui/text/font/FontFamily;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 12
    nop

    .line 13
    const/4 v0, 0x2

    new-array v1, v0, [Landroidx/compose/ui/text/font/Font;

    sget v2, Lcom/example/R$font;->tajawal:I

    sget-object v3, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 14
    sget v4, Lcom/example/R$font;->tajawal_bold:I

    sget-object v2, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v5

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    .line 13
    nop

    .line 12
    invoke-static {v1}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v1

    sput-object v1, Lcom/example/ui/theme/TypeKt;->TajawalFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 48
    nop

    .line 49
    new-array v1, v0, [Landroidx/compose/ui/text/font/Font;

    sget v5, Lcom/example/R$font;->tajawal_light:I

    sget-object v2, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v2

    aput-object v2, v1, v3

    .line 50
    sget v5, Lcom/example/R$font;->tajawal:I

    sget-object v2, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v2

    aput-object v2, v1, v4

    .line 49
    nop

    .line 48
    invoke-static {v1}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v1

    sput-object v1, Lcom/example/ui/theme/TypeKt;->TajawalLightFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 52
    nop

    .line 53
    new-array v1, v0, [Landroidx/compose/ui/text/font/Font;

    sget v5, Lcom/example/R$font;->tajawal_bold:I

    sget-object v2, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v2

    aput-object v2, v1, v3

    .line 54
    sget v5, Lcom/example/R$font;->tajawal_bold:I

    sget-object v2, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v2

    aput-object v2, v1, v4

    .line 53
    nop

    .line 52
    invoke-static {v1}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v1

    sput-object v1, Lcom/example/ui/theme/TypeKt;->TajawalBoldFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 56
    nop

    .line 57
    new-array v0, v0, [Landroidx/compose/ui/text/font/Font;

    sget v5, Lcom/example/R$font;->cairo:I

    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v1

    aput-object v1, v0, v3

    .line 58
    sget v5, Lcom/example/R$font;->cairo_bold:I

    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v1

    aput-object v1, v0, v4

    .line 57
    nop

    .line 56
    invoke-static {v0}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/TypeKt;->CairoFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 60
    new-array v0, v4, [Landroidx/compose/ui/text/font/Font;

    sget v5, Lcom/example/R$font;->noto_naskh:I

    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-static {v0}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/TypeKt;->NotoNaskhFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 61
    new-array v0, v4, [Landroidx/compose/ui/text/font/Font;

    sget v5, Lcom/example/R$font;->amiri:I

    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-static {v0}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/TypeKt;->AmiriFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 62
    new-array v0, v4, [Landroidx/compose/ui/text/font/Font;

    sget v4, Lcom/example/R$font;->aref_ruqaa:I

    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v5

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-static {v0}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/TypeKt;->ArefRuqaaFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-void
.end method

.method public static final fontFamilyFor(Lcom/example/ui/theme/FontChoice;)Landroidx/compose/ui/text/font/FontFamily;
    .locals 2
    .param p0, "choice"    # Lcom/example/ui/theme/FontChoice;

    const-string v0, "choice"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    sget-object v0, Lcom/example/ui/theme/TypeKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/example/ui/theme/FontChoice;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 88
    :pswitch_0
    sget-object v0, Lcom/example/ui/theme/TypeKt;->ArefRuqaaFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_0

    .line 87
    :pswitch_1
    sget-object v0, Lcom/example/ui/theme/TypeKt;->AmiriFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_0

    .line 86
    :pswitch_2
    sget-object v0, Lcom/example/ui/theme/TypeKt;->NotoNaskhFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_0

    .line 85
    :pswitch_3
    sget-object v0, Lcom/example/ui/theme/TypeKt;->CairoFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_0

    .line 84
    :pswitch_4
    const/4 v0, 0x0

    goto :goto_0

    .line 83
    :pswitch_5
    sget-object v0, Lcom/example/ui/theme/TypeKt;->TajawalBoldFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_0

    .line 82
    :pswitch_6
    sget-object v0, Lcom/example/ui/theme/TypeKt;->TajawalLightFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_0

    .line 81
    :pswitch_7
    sget-object v0, Lcom/example/ui/theme/TypeKt;->TajawalFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 89
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final getAmiriFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 61
    sget-object v0, Lcom/example/ui/theme/TypeKt;->AmiriFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public static final getArefRuqaaFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 62
    sget-object v0, Lcom/example/ui/theme/TypeKt;->ArefRuqaaFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public static final getCairoFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 56
    sget-object v0, Lcom/example/ui/theme/TypeKt;->CairoFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public static final getNotoNaskhFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 60
    sget-object v0, Lcom/example/ui/theme/TypeKt;->NotoNaskhFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public static final getTajawalBoldFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 52
    sget-object v0, Lcom/example/ui/theme/TypeKt;->TajawalBoldFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public static final getTajawalFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 12
    sget-object v0, Lcom/example/ui/theme/TypeKt;->TajawalFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public static final getTajawalLightFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 48
    sget-object v0, Lcom/example/ui/theme/TypeKt;->TajawalLightFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public static final getTypography(Lcom/example/ui/theme/FontChoice;)Landroidx/compose/material3/Typography;
    .locals 1
    .param p0, "choice"    # Lcom/example/ui/theme/FontChoice;

    const-string v0, "choice"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    invoke-static {p0}, Lcom/example/ui/theme/TypeKt;->fontFamilyFor(Lcom/example/ui/theme/FontChoice;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v0

    invoke-static {v0}, Lcom/example/ui/theme/TypeKt;->oneUiTypography(Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/material3/Typography;

    move-result-object v0

    return-object v0
.end method

.method public static final getTypography(Z)Landroidx/compose/material3/Typography;
    .locals 1
    .param p0, "useDeviceFont"    # Z

    .line 92
    if-eqz p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/example/ui/theme/TypeKt;->TajawalFontFamily:Landroidx/compose/ui/text/font/FontFamily;

    :goto_0
    invoke-static {v0}, Lcom/example/ui/theme/TypeKt;->oneUiTypography(Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/material3/Typography;

    move-result-object v0

    return-object v0
.end method

.method private static final oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;
    .locals 33
    .param p0, "$this$oneUi_u2dH_8_nhI"    # Landroidx/compose/ui/text/TextStyle;
    .param p1, "size"    # J
    .param p3, "line"    # J
    .param p5, "bold"    # Z
    .param p6, "family"    # Landroidx/compose/ui/text/font/FontFamily;

    .line 18
    if-nez p6, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/text/TextStyle;->getFontFamily()Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v0

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    .line 19
    :goto_0
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    if-eqz p5, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    :goto_1
    move-object v6, v0

    .line 23
    const/4 v0, 0x0

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v11

    .line 17
    nop

    .line 20
    nop

    .line 19
    nop

    .line 17
    nop

    .line 18
    nop

    .line 17
    nop

    .line 23
    nop

    .line 17
    nop

    .line 21
    nop

    .line 17
    const v31, 0xfdff59

    const/16 v32, 0x0

    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v4, p1

    move-wide/from16 v23, p3

    invoke-static/range {v1 .. v32}, Landroidx/compose/ui/text/TextStyle;->copy-p1EtxEg$default(Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    .line 24
    return-object v0
.end method

.method static synthetic oneUi-H_8_nhI$default(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
    .locals 7

    .line 17
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x8

    if-eqz p5, :cond_1

    const/4 p6, 0x0

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-static/range {v0 .. v6}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object p0

    return-object p0
.end method

.method public static final oneUiTypography(Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/material3/Typography;
    .locals 24
    .param p0, "family"    # Landroidx/compose/ui/text/font/FontFamily;

    .line 28
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v1

    .line 29
    .local v1, "base":Landroidx/compose/ui/text/TextStyle;
    new-instance v0, Landroidx/compose/material3/Typography;

    .line 30
    const/16 v2, 0x39

    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v4, 0x40

    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    const/4 v6, 0x0

    move-object/from16 v7, p0

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v8

    .line 31
    const/16 v2, 0x2d

    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v4, 0x34

    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v9

    .line 32
    const/16 v10, 0x24

    invoke-static {v10}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v4, 0x2c

    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v11

    .line 33
    const/16 v2, 0x22

    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v4, 0x2a

    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    const/4 v6, 0x1

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v12

    .line 34
    const/16 v13, 0x1c

    invoke-static {v13}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    invoke-static {v10}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v10

    .line 35
    const/16 v14, 0x18

    invoke-static {v14}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v4, 0x20

    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v15

    .line 36
    const/16 v16, 0x14

    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    invoke-static {v13}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v13

    .line 37
    const/16 v17, 0x11

    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    invoke-static {v14}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v14

    .line 38
    const/16 v18, 0xf

    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v19, 0x16

    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v20

    .line 39
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v4, 0x1a

    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v17

    .line 40
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v19

    .line 41
    const/16 v21, 0xd

    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v22, 0x12

    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v23

    .line 42
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    const/4 v6, 0x1

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v16

    .line 43
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v18

    .line 44
    const/16 v2, 0xc

    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v2

    const/16 v4, 0x10

    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v4

    invoke-static/range {v1 .. v7}, Lcom/example/ui/theme/TypeKt;->oneUi-H_8_nhI(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    .line 29
    move-object v3, v8

    move-object v4, v9

    move-object v7, v10

    move-object v5, v11

    move-object v6, v12

    move-object v9, v13

    move-object v10, v14

    move-object v8, v15

    move-object/from16 v15, v16

    move-object/from16 v12, v17

    move-object/from16 v16, v18

    move-object/from16 v13, v19

    move-object/from16 v11, v20

    move-object/from16 v14, v23

    move-object/from16 v17, v2

    move-object v2, v0

    invoke-direct/range {v2 .. v17}, Landroidx/compose/material3/Typography;-><init>(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V

    return-object v2
.end method
