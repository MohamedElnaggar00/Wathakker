package com.example.ui.screens;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.location.LocationRequestCompat;
import com.example.R;
import com.example.ui.oneui.OneUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AboutScreen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\bH\u0002¨\u0006\t"}, d2 = {"AboutScreen", "", "onBack", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AppIconBadge", "(Landroidx/compose/runtime/Composer;I)V", "androidx_clip22", "Landroidx/compose/ui/Modifier;", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AboutScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AboutScreen$lambda$8(Function0 function0, int i, Composer composer, int i2) {
        AboutScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AppIconBadge$lambda$9(int i, Composer composer, int i2) {
        AppIconBadge(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AboutScreen(Function0<Unit> onBack, Composer $composer, final int $changed) {
        final Function0 onBack2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(726747196);
        ComposerKt.sourceInformation($composer2, "C(AboutScreen)N(onBack)22@880L11,23@948L2034,23@896L2086:AboutScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            onBack2 = onBack;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(726747196, $dirty, -1, "com.example.ui.screens.AboutScreen (AboutScreen.kt:21)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            ComposerKt.sourceInformationMarkerStart($composer2, -1675607218, "CC(remember):AboutScreen.kt#9igjgp");
            boolean changed = $composer2.changed(cs);
            Object rememberedValue = $composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AboutScreenKt.AboutScreen$lambda$7$lambda$6(ColorScheme.this, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            onBack2 = onBack;
            OneUIKt.m7686OneUIScreengMrHQkA("حول التطبيق", null, null, onBack2, null, null, null, 0.0f, (Function1) rememberedValue, $composer2, (($dirty << 9) & 7168) | 6, 246);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AboutScreenKt.AboutScreen$lambda$8(Function0.this, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AboutScreen$lambda$7$lambda$6(final ColorScheme $cs, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "hero", null, ComposableLambdaKt.composableLambdaInstance(-1549352550, true, new Function3() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AboutScreenKt.AboutScreen$lambda$7$lambda$6$lambda$1(ColorScheme.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "info", null, ComposableLambdaKt.composableLambdaInstance(70796355, true, new Function3() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AboutScreenKt.AboutScreen$lambda$7$lambda$6$lambda$5(ColorScheme.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "credit", null, ComposableSingletons$AboutScreenKt.INSTANCE.getLambda$1150338402$app(), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "dua", null, ComposableSingletons$AboutScreenKt.INSTANCE.m7690getLambda$2065086847$app(), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AboutScreen$lambda$7$lambda$6$lambda$1(ColorScheme $cs, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C25@991L574:AboutScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1549352550, $changed, -1, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:25)");
            }
            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(8), 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i3 = ((390 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -225825970, "C26@1118L14,27@1149L30,28@1234L10,28@1196L89,29@1384L10,29@1302L249:AboutScreen.kt#2thlc2");
                AppIconBadge($composer, 0);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                TextKt.m2816Text4IGK_g("وَذكِّر", (Modifier) null, $cs.getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 6, 0, 65530);
                TextKt.m2816Text4IGK_g("تطبيق يساعدك على المحافظة على أذكارك في يومك وليلتك", PaddingKt.m731paddingVpY3zN4(Modifier.INSTANCE, Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(4)), $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 54, 0, 65016);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i32 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -225825970, "C26@1118L14,27@1149L30,28@1234L10,28@1196L89,29@1384L10,29@1302L249:AboutScreen.kt#2thlc2");
            AppIconBadge($composer, 0);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            TextKt.m2816Text4IGK_g("وَذكِّر", (Modifier) null, $cs.getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 6, 0, 65530);
            TextKt.m2816Text4IGK_g("تطبيق يساعدك على المحافظة على أذكارك في يومك وليلتك", PaddingKt.m731paddingVpY3zN4(Modifier.INSTANCE, Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(4)), $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 54, 0, 65016);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AboutScreen$lambda$7$lambda$6$lambda$5(final ColorScheme $cs, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C34@1627L717,34@1617L727:AboutScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70796355, $changed, -1, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:34)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(996646776, true, new Function3() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AboutScreenKt.AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4(ColorScheme.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4(final ColorScheme $cs, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C36@1747L89,35@1645L192,37@1854L27,39@2002L97,38@1898L202,40@2117L27,41@2161L169:AboutScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996646776, $changed, -1, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:35)");
            }
            OneUIKt.m7685OneUIRowRFMEUTM("الإصدار", null, null, ComposableSingletons$AboutScreenKt.INSTANCE.m7691getLambda$673636920$app(), ComposableLambdaKt.rememberComposableLambda(-1904929463, true, new Function2() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutScreenKt.AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$2(ColorScheme.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0L, $composer, 27654, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            OneUIKt.m7685OneUIRowRFMEUTM("المطوّر", null, null, ComposableSingletons$AboutScreenKt.INSTANCE.getLambda$765542911$app(), ComposableLambdaKt.rememberComposableLambda(-1390584512, true, new Function2() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutScreenKt.AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(ColorScheme.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0L, $composer, 27654, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            OneUIKt.m7685OneUIRowRFMEUTM("حصن المسلم", null, "المحتوى من مشروع HisnElmoslem (مرخّص بـ GPL v3)", ComposableSingletons$AboutScreenKt.INSTANCE.getLambda$823525184$app(), null, null, 0L, $composer, 3462, 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$2(ColorScheme $cs, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C36@1812L10,36@1749L85:AboutScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1904929463, $changed, -1, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:36)");
            }
            TextKt.m2816Text4IGK_g("2.0", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AboutScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(ColorScheme $cs, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C39@2075L10,39@2004L93:AboutScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1390584512, $changed, -1, "com.example.ui.screens.AboutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutScreen.kt:39)");
            }
            TextKt.m2816Text4IGK_g("محمد النجار", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final void AppIconBadge(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(719565778);
        ComposerKt.sourceInformation($composer2, "C(AppIconBadge)64@3100L48,63@3051L197:AboutScreen.kt#2thlc2");
        if (!$composer2.shouldExecute($changed != 0, $changed & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(719565778, $changed, -1, "com.example.ui.screens.AppIconBadge (AboutScreen.kt:62)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_about, $composer2, 0), (String) null, androidx_clip22(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(84))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, $composer2, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.AboutScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutScreenKt.AppIconBadge$lambda$9($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Modifier androidx_clip22(Modifier $this$androidx_clip22) {
        return $this$androidx_clip22.then(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(22))));
    }
}
