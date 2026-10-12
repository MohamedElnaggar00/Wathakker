package com.example.ui.theme;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "OneUIShapes", "Landroidx/compose/material3/Shapes;", "getOneUIShapes", "()Landroidx/compose/material3/Shapes;", "MyApplicationTheme", "", "fontChoice", "Lcom/example/ui/theme/FontChoice;", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/example/ui/theme/FontChoice;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme = ColorSchemeKt.m2055darkColorSchemeCXl9yA$default(ColorKt.getOneUIAccentDark(), Color.INSTANCE.m4526getWhite0d7_KjU(), androidx.compose.ui.graphics.ColorKt.m4534compositeOverOWjLjI(androidx.compose.ui.graphics.ColorKt.Color(691966463), ColorKt.getOneUISurfaceDark()), ColorKt.getOneUIAccentDark(), 0, androidx.compose.ui.graphics.ColorKt.Color(4287532691L), Color.INSTANCE.m4526getWhite0d7_KjU(), ColorKt.getOneUISurfaceVariantDark(), androidx.compose.ui.graphics.ColorKt.Color(4292927712L), androidx.compose.ui.graphics.ColorKt.Color(4287532691L), 0, 0, 0, ColorKt.getOneUIBackgroundDark(), ColorKt.getOneUITextPrimaryDark(), ColorKt.getOneUISurfaceDark(), ColorKt.getOneUITextPrimaryDark(), ColorKt.getOneUISurfaceVariantDark(), ColorKt.getOneUITextSecondaryDark(), 0, 0, 0, ColorKt.getOneUIErrorDark(), 0, androidx.compose.ui.graphics.ColorKt.m4534compositeOverOWjLjI(androidx.compose.ui.graphics.ColorKt.Color(704600671), ColorKt.getOneUISurfaceDark()), ColorKt.getOneUIErrorDark(), ColorKt.getOneUIDividerDark(), ColorKt.getOneUIDividerDark(), 0, 0, 0, 0, ColorKt.getOneUIPillDark(), 0, 0, 0, -256369648, 14, null);
    private static final ColorScheme LightColorScheme = ColorSchemeKt.m2059lightColorSchemeCXl9yA$default(ColorKt.getOneUIAccentLight(), Color.INSTANCE.m4526getWhite0d7_KjU(), androidx.compose.ui.graphics.ColorKt.m4534compositeOverOWjLjI(androidx.compose.ui.graphics.ColorKt.Color(604209662), ColorKt.getOneUISurfaceLight()), ColorKt.getOneUIAccentLight(), 0, androidx.compose.ui.graphics.ColorKt.Color(4287532691L), Color.INSTANCE.m4526getWhite0d7_KjU(), ColorKt.getOneUISurfaceVariantLight(), androidx.compose.ui.graphics.ColorKt.Color(4281545523L), androidx.compose.ui.graphics.ColorKt.Color(4287532691L), 0, 0, 0, ColorKt.getOneUIBackgroundLight(), ColorKt.getOneUITextPrimaryLight(), ColorKt.getOneUISurfaceLight(), ColorKt.getOneUITextPrimaryLight(), ColorKt.getOneUISurfaceVariantLight(), ColorKt.getOneUITextSecondaryLight(), 0, 0, 0, ColorKt.getOneUIErrorLight(), 0, androidx.compose.ui.graphics.ColorKt.m4534compositeOverOWjLjI(androidx.compose.ui.graphics.ColorKt.Color(535119949), ColorKt.getOneUISurfaceLight()), ColorKt.getOneUIErrorLight(), ColorKt.getOneUIDividerLight(), ColorKt.getOneUIDividerLight(), 0, 0, 0, 0, ColorKt.getOneUIPillLight(), 0, 0, 0, -256369648, 14, null);
    private static final Shapes OneUIShapes = new Shapes(RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(8)), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(12)), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(18)), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(26)), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(32)));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$4(FontChoice fontChoice, boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        MyApplicationTheme(fontChoice, z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Shapes getOneUIShapes() {
        return OneUIShapes;
    }

    public static final void MyApplicationTheme(FontChoice fontChoice, boolean darkTheme, boolean dynamicColor, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        boolean darkTheme2;
        boolean z;
        final boolean darkTheme3;
        final boolean dynamicColor2;
        final FontChoice fontChoice2;
        FontChoice fontChoice3;
        int $dirty;
        final boolean darkTheme4;
        boolean dynamicColor3;
        ColorScheme colorScheme;
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-482328657);
        ComposerKt.sourceInformation($composer2, "C(MyApplicationTheme)N(fontChoice,darkTheme,dynamicColor,content)97@3714L7,116@4345L125,112@4212L258:Theme.kt#75kw8w");
        int $dirty2 = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(fontChoice == null ? -1 : fontChoice.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            if ((i & 2) == 0) {
                darkTheme2 = darkTheme;
                if ($composer2.changed(darkTheme2)) {
                    i2 = 32;
                    $dirty2 |= i2;
                }
            } else {
                darkTheme2 = darkTheme;
            }
            i2 = 16;
            $dirty2 |= i2;
        } else {
            darkTheme2 = darkTheme;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty2 |= 384;
            z = dynamicColor;
        } else if (($changed & 384) == 0) {
            z = dynamicColor;
            $dirty2 |= $composer2.changed(z) ? 256 : 128;
        } else {
            z = dynamicColor;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(content) ? 2048 : 1024;
        }
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "84@3251L21");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 2) != 0) {
                    $dirty2 &= -113;
                }
                boolean z2 = darkTheme2;
                $dirty = $dirty2;
                darkTheme4 = z2;
                fontChoice3 = fontChoice;
                dynamicColor3 = z;
            } else {
                if (i3 != 0) {
                    fontChoice3 = FontChoice.SYSTEM;
                } else {
                    fontChoice3 = fontChoice;
                }
                if ((i & 2) != 0) {
                    darkTheme2 = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
                    $dirty2 &= -113;
                }
                if (i4 == 0) {
                    boolean z3 = darkTheme2;
                    $dirty = $dirty2;
                    darkTheme4 = z3;
                    dynamicColor3 = z;
                } else {
                    boolean z4 = darkTheme2;
                    $dirty = $dirty2;
                    darkTheme4 = z4;
                    dynamicColor3 = false;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-482328657, $dirty, -1, "com.example.ui.theme.MyApplicationTheme (Theme.kt:87)");
            }
            if (dynamicColor3 && Build.VERSION.SDK_INT >= 31) {
                $composer2.startReplaceGroup(1907864056);
                ComposerKt.sourceInformation($composer2, "90@3493L7");
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = $composer2.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Context context = (Context) consume;
                colorScheme = darkTheme4 ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
                $composer2.endReplaceGroup();
            } else if (darkTheme4) {
                $composer2.startReplaceGroup(338644190);
                $composer2.endReplaceGroup();
                colorScheme = DarkColorScheme;
            } else {
                $composer2.startReplaceGroup(338645215);
                $composer2.endReplaceGroup();
                colorScheme = LightColorScheme;
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = $composer2.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final View view = (View) consume2;
            if (view.isInEditMode()) {
                $composer2.startReplaceGroup(1904433875);
            } else {
                $composer2.startReplaceGroup(1908169003);
                ComposerKt.sourceInformation($composer2, "99@3771L429,99@3760L440");
                ComposerKt.sourceInformationMarkerStart($composer2, 338649148, "CC(remember):Theme.kt#9igjgp");
                boolean changedInstance = $composer2.changedInstance(view) | (((($dirty & 112) ^ 48) > 32 && $composer2.changed(darkTheme4)) || ($dirty & 48) == 32);
                Object rememberedValue = $composer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ThemeKt.MyApplicationTheme$lambda$1$lambda$0(view, darkTheme4);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                EffectsKt.SideEffect((Function0) rememberedValue, $composer2, 0);
            }
            $composer2.endReplaceGroup();
            MaterialThemeKt.MaterialTheme(colorScheme, OneUIShapes, TypeKt.getTypography(fontChoice3), ComposableLambdaKt.rememberComposableLambda(965175427, true, new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ThemeKt.MyApplicationTheme$lambda$3(Function2.this, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            FontChoice fontChoice4 = fontChoice3;
            darkTheme3 = darkTheme4;
            fontChoice2 = fontChoice4;
            dynamicColor2 = dynamicColor3;
        } else {
            $composer2.skipToGroupEnd();
            darkTheme3 = darkTheme2;
            dynamicColor2 = z;
            fontChoice2 = fontChoice;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ThemeKt.MyApplicationTheme$lambda$4(FontChoice.this, darkTheme3, dynamicColor2, content, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$1$lambda$0(View $view, boolean $darkTheme) {
        Context context = $view.getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            WindowCompat.getInsetsController(window, $view).setAppearanceLightStatusBars(!$darkTheme);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$3(final Function2 $content, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C117@4431L33,117@4355L109:Theme.kt#75kw8w");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(965175427, $changed, -1, "com.example.ui.theme.MyApplicationTheme.<anonymous> (Theme.kt:117)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Rtl), ComposableLambdaKt.rememberComposableLambda(-2040489021, true, new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.MyApplicationTheme$lambda$3$lambda$2(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$3$lambda$2(Function2 $content, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C118@4445L9:Theme.kt#75kw8w");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040489021, $changed, -1, "com.example.ui.theme.MyApplicationTheme.<anonymous>.<anonymous> (Theme.kt:118)");
            }
            $content.invoke($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
