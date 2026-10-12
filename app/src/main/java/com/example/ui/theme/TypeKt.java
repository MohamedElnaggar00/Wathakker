package com.example.ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Type.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\n\u001a\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003\"\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0003\"\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0003\"\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0003¨\u0006!"}, d2 = {"TajawalFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getTajawalFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "oneUi", "Landroidx/compose/ui/text/TextStyle;", "size", "Landroidx/compose/ui/unit/TextUnit;", "line", "bold", "", "family", "oneUi-H_8_nhI", "(Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;", "oneUiTypography", "Landroidx/compose/material3/Typography;", "TajawalLightFontFamily", "getTajawalLightFontFamily", "TajawalBoldFontFamily", "getTajawalBoldFontFamily", "CairoFontFamily", "getCairoFontFamily", "NotoNaskhFontFamily", "getNotoNaskhFontFamily", "AmiriFontFamily", "getAmiriFontFamily", "ArefRuqaaFontFamily", "getArefRuqaaFontFamily", "fontFamilyFor", "choice", "Lcom/example/ui/theme/FontChoice;", "getTypography", "useDeviceFont", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TypeKt {
    private static final FontFamily TajawalFontFamily = FontFamilyKt.FontFamily(FontKt.m6755FontYpTlLL0$default(R.font.tajawal, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null), FontKt.m6755FontYpTlLL0$default(R.font.tajawal_bold, FontWeight.INSTANCE.getBold(), 0, 0, 12, null));
    private static final FontFamily TajawalLightFontFamily = FontFamilyKt.FontFamily(FontKt.m6755FontYpTlLL0$default(R.font.tajawal_light, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null), FontKt.m6755FontYpTlLL0$default(R.font.tajawal, FontWeight.INSTANCE.getBold(), 0, 0, 12, null));
    private static final FontFamily TajawalBoldFontFamily = FontFamilyKt.FontFamily(FontKt.m6755FontYpTlLL0$default(R.font.tajawal_bold, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null), FontKt.m6755FontYpTlLL0$default(R.font.tajawal_bold, FontWeight.INSTANCE.getBold(), 0, 0, 12, null));
    private static final FontFamily CairoFontFamily = FontFamilyKt.FontFamily(FontKt.m6755FontYpTlLL0$default(R.font.cairo, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null), FontKt.m6755FontYpTlLL0$default(R.font.cairo_bold, FontWeight.INSTANCE.getBold(), 0, 0, 12, null));
    private static final FontFamily NotoNaskhFontFamily = FontFamilyKt.FontFamily(FontKt.m6755FontYpTlLL0$default(R.font.noto_naskh, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null));
    private static final FontFamily AmiriFontFamily = FontFamilyKt.FontFamily(FontKt.m6755FontYpTlLL0$default(R.font.amiri, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null));
    private static final FontFamily ArefRuqaaFontFamily = FontFamilyKt.FontFamily(FontKt.m6755FontYpTlLL0$default(R.font.aref_ruqaa, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null));

    /* compiled from: Type.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontChoice.values().length];
            try {
                iArr[FontChoice.APP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[FontChoice.APP_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[FontChoice.APP_BOLD.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[FontChoice.SYSTEM.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[FontChoice.CAIRO.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[FontChoice.NASKH.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[FontChoice.AMIRI.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FontChoice.RUQAA.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FontFamily getTajawalFontFamily() {
        return TajawalFontFamily;
    }

    /* renamed from: oneUi-H_8_nhI$default, reason: not valid java name */
    static /* synthetic */ TextStyle m7717oneUiH_8_nhI$default(TextStyle textStyle, long j, long j2, boolean z, FontFamily fontFamily, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            fontFamily = null;
        }
        return m7716oneUiH_8_nhI(textStyle, j, j2, z2, fontFamily);
    }

    /* renamed from: oneUi-H_8_nhI, reason: not valid java name */
    private static final TextStyle m7716oneUiH_8_nhI(TextStyle $this$oneUi_u2dH_8_nhI, long size, long line, boolean bold, FontFamily family) {
        FontFamily fontFamily = family == null ? $this$oneUi_u2dH_8_nhI.getFontFamily() : family;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        return TextStyle.m6673copyp1EtxEg$default($this$oneUi_u2dH_8_nhI, 0L, size, bold ? companion.getBold() : companion.getNormal(), null, null, fontFamily, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, 0, 0, line, null, null, null, 0, 0, null, 16645977, null);
    }

    public static final Typography oneUiTypography(FontFamily family) {
        TextStyle base = TextStyle.INSTANCE.getDefault();
        return new Typography(m7716oneUiH_8_nhI(base, TextUnitKt.getSp(57), TextUnitKt.getSp(64), false, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(45), TextUnitKt.getSp(52), false, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(36), TextUnitKt.getSp(44), false, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(34), TextUnitKt.getSp(42), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(28), TextUnitKt.getSp(36), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(24), TextUnitKt.getSp(32), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(20), TextUnitKt.getSp(28), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(17), TextUnitKt.getSp(24), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(15), TextUnitKt.getSp(22), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(17), TextUnitKt.getSp(26), false, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(15), TextUnitKt.getSp(22), false, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(13), TextUnitKt.getSp(18), false, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(15), TextUnitKt.getSp(20), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(13), TextUnitKt.getSp(18), true, family), m7716oneUiH_8_nhI(base, TextUnitKt.getSp(12), TextUnitKt.getSp(16), true, family));
    }

    public static final FontFamily getTajawalLightFontFamily() {
        return TajawalLightFontFamily;
    }

    public static final FontFamily getTajawalBoldFontFamily() {
        return TajawalBoldFontFamily;
    }

    public static final FontFamily getCairoFontFamily() {
        return CairoFontFamily;
    }

    public static final FontFamily getNotoNaskhFontFamily() {
        return NotoNaskhFontFamily;
    }

    public static final FontFamily getAmiriFontFamily() {
        return AmiriFontFamily;
    }

    public static final FontFamily getArefRuqaaFontFamily() {
        return ArefRuqaaFontFamily;
    }

    public static final FontFamily fontFamilyFor(FontChoice choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        switch (WhenMappings.$EnumSwitchMapping$0[choice.ordinal()]) {
            case 1:
                return TajawalFontFamily;
            case 2:
                return TajawalLightFontFamily;
            case 3:
                return TajawalBoldFontFamily;
            case 4:
                return null;
            case 5:
                return CairoFontFamily;
            case 6:
                return NotoNaskhFontFamily;
            case 7:
                return AmiriFontFamily;
            case 8:
                return ArefRuqaaFontFamily;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Typography getTypography(boolean useDeviceFont) {
        return oneUiTypography(useDeviceFont ? null : TajawalFontFamily);
    }

    public static final Typography getTypography(FontChoice choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        return oneUiTypography(fontFamilyFor(choice));
    }
}
