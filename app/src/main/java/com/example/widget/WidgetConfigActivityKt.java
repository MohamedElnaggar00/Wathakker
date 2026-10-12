package com.example.widget;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetConfigActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0002\u0010\n\",\u0010\u0000\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"options", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "ConfigScreen", "", "current", "onPick", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WidgetConfigActivityKt {
    private static final List<Pair<String, Pair<String, Color>>> options = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("default", new Pair("افتراضي", Color.m4479boximpl(ColorKt.Color(4289111718L)))), TuplesKt.to("white", new Pair("أبيض", Color.m4479boximpl(ColorKt.Color(4294967295L)))), TuplesKt.to("amber", new Pair("كهرماني", Color.m4479boximpl(ColorKt.Color(4293243989L)))), TuplesKt.to("blue", new Pair("أزرق", Color.m4479boximpl(ColorKt.Color(4282290687L)))), TuplesKt.to("green", new Pair("أخضر", Color.m4479boximpl(ColorKt.Color(4281648985L))))});

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigScreen$lambda$6(String str, Function1 function1, int i, Composer composer, int i2) {
        ConfigScreen(str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0694  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfigScreen(final String current, final Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function0;
        int i;
        Function0 function02;
        Composer m3828constructorimpl;
        Iterator it;
        Composer $composer3;
        Function0 function03;
        String str;
        Composer composer;
        Modifier.Companion companion;
        Composer $composer4 = $composer.startRestartGroup(-1758261378);
        ComposerKt.sourceInformation($composer4, "C(ConfigScreen)N(current,onPick)76@3067L2258:WidgetConfigActivity.kt#9u2u6t");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer4.changed(current) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer4.changedInstance(function1) ? 32 : 16;
        }
        if (!$composer4.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1758261378, $dirty, -1, "com.example.widget.ConfigScreen (WidgetConfigActivity.kt:75)");
            }
            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(4279242770L), null, 2, null), Dp.m7226constructorimpl(24));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            String str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer4, m730padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((54 << 3) & 112) << 6) & 896) | 6;
            int $dirty2 = $dirty;
            String str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer4.startReusableNode();
            if ($composer4.getInserting()) {
                function0 = constructor;
                $composer4.createNode(function0);
            } else {
                function0 = constructor;
                $composer4.useNode();
            }
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer4);
            Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                i = i2;
            } else {
                i = i2;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer4, -1809481217, "C83@3259L2060:WidgetConfigActivity.kt#9u2u6t");
                    Modifier m730padding3ABfNKs2 = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(24))), ColorKt.Color(4280032286L), null, 2, null), Dp.m7226constructorimpl(20));
                    ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer4, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer4, m730padding3ABfNKs2);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer4.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer4.startReusableNode();
                    if (!$composer4.getInserting()) {
                        function02 = constructor2;
                        $composer4.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer4.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer4);
                    Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i6 = (i5 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i7 = ((0 >> 6) & 112) | 6;
                        Composer composer2 = $composer4;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2061399327, "C90@3483L170,96@3666L29,97@3708L130,102@3851L30:WidgetConfigActivity.kt#9u2u6t");
                        TextKt.m2816Text4IGK_g("إعدادات الويدجت", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 200070, 0, 131026);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), composer2, 6);
                        TextKt.m2816Text4IGK_g("لون شريط التقدم", (Modifier) null, ColorKt.Color(4289111718L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 3462, 0, 131058);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer2, 6);
                        composer2.startReplaceGroup(-349132255);
                        ComposerKt.sourceInformation(composer2, "*111@4300L15,106@4031L1264");
                        Iterable iterable = options;
                        int i8 = 0;
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            Iterable iterable2 = iterable;
                            final String str4 = (String) pair.component1();
                            Pair pair2 = (Pair) pair.component2();
                            String str5 = (String) pair2.component1();
                            long m4499unboximpl = ((Color) pair2.component2()).m4499unboximpl();
                            boolean areEqual = Intrinsics.areEqual(str4, current);
                            int i9 = i8;
                            Iterator it2 = it;
                            int i10 = i7;
                            Alignment alignment = center;
                            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14))), areEqual ? ColorKt.Color(4281084974L) : Color.INSTANCE.m4524getTransparent0d7_KjU(), null, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, -153855656, "CC(remember):WidgetConfigActivity.kt#9igjgp");
                            boolean changed = (($dirty2 & 112) == 32) | $composer4.changed(str4);
                            Composer composer3 = composer2;
                            Object rememberedValue = composer3.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                $composer3 = $composer4;
                                Object obj = new Function0() { // from class: com.example.widget.WidgetConfigActivityKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WidgetConfigActivityKt.ConfigScreen$lambda$5$lambda$4$lambda$3$lambda$1$lambda$0(Function1.this, str4);
                                    }
                                };
                                composer3.updateRememberedValue(obj);
                                rememberedValue = obj;
                            } else {
                                $composer3 = $composer4;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(ClickableKt.m264clickableXHw0xAI$default(m231backgroundbw27NRU$default, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7226constructorimpl(12), Dp.m7226constructorimpl(12));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.Horizontal m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                            Composer composer4 = composer2;
                            Composer composer5 = composer2;
                            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m610spacedBy0680j_4, centerVertically, composer4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str2);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, m731paddingVpY3zN4);
                            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            int i11 = ((((432 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str3);
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                function03 = constructor3;
                                composer4.createNode(function03);
                            } else {
                                function03 = constructor3;
                                composer4.useNode();
                            }
                            Composer m3828constructorimpl3 = Updater.m3828constructorimpl(composer4);
                            String str6 = str3;
                            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                int i12 = (i11 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                int i13 = ((432 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer4, -728463151, "C116@4568L416,126@5005L272:WidgetConfigActivity.kt#9u2u6t");
                                Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), RoundedCornerShapeKt.getCircleShape()), m4499unboximpl, null, 2, null);
                                if (areEqual) {
                                    str = str2;
                                    composer = composer4;
                                    companion = Modifier.INSTANCE;
                                } else {
                                    str = str2;
                                    composer = composer4;
                                    companion = BorderKt.m242borderxT4_qwU(Modifier.INSTANCE, Dp.m7226constructorimpl(2), ColorKt.Color(4282290687L), RoundedCornerShapeKt.getCircleShape());
                                }
                                BoxKt.Box(m231backgroundbw27NRU$default2.then(companion), composer4, 0);
                                long m4526getWhite0d7_KjU = !areEqual ? Color.INSTANCE.m4526getWhite0d7_KjU() : ColorKt.Color(4289111718L);
                                long sp = TextUnitKt.getSp(15);
                                FontWeight.Companion companion2 = FontWeight.INSTANCE;
                                TextKt.m2816Text4IGK_g(str5, (Modifier) null, m4526getWhite0d7_KjU, sp, (FontStyle) null, !areEqual ? companion2.getBold() : companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131026);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                i7 = i10;
                                center = alignment;
                                iterable = iterable2;
                                str2 = str;
                                i8 = i9;
                                it = it2;
                                $composer4 = $composer3;
                                composer2 = composer5;
                                str3 = str6;
                            }
                            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i122 = (i11 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            int i132 = ((432 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -728463151, "C116@4568L416,126@5005L272:WidgetConfigActivity.kt#9u2u6t");
                            Modifier m231backgroundbw27NRU$default22 = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), RoundedCornerShapeKt.getCircleShape()), m4499unboximpl, null, 2, null);
                            if (areEqual) {
                            }
                            BoxKt.Box(m231backgroundbw27NRU$default22.then(companion), composer4, 0);
                            long m4526getWhite0d7_KjU2 = !areEqual ? Color.INSTANCE.m4526getWhite0d7_KjU() : ColorKt.Color(4289111718L);
                            long sp2 = TextUnitKt.getSp(15);
                            FontWeight.Companion companion22 = FontWeight.INSTANCE;
                            TextKt.m2816Text4IGK_g(str5, (Modifier) null, m4526getWhite0d7_KjU2, sp2, (FontStyle) null, !areEqual ? companion22.getBold() : companion22.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131026);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            i7 = i10;
                            center = alignment;
                            iterable = iterable2;
                            str2 = str;
                            i8 = i9;
                            it = it2;
                            $composer4 = $composer3;
                            composer2 = composer5;
                            str3 = str6;
                        }
                        $composer2 = $composer4;
                        Composer composer6 = composer2;
                        composer6.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        $composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        $composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i62 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i72 = ((0 >> 6) & 112) | 6;
                    Composer composer22 = $composer4;
                    ComposerKt.sourceInformationMarkerStart(composer22, 2061399327, "C90@3483L170,96@3666L29,97@3708L130,102@3851L30:WidgetConfigActivity.kt#9u2u6t");
                    TextKt.m2816Text4IGK_g("إعدادات الويدجت", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 200070, 0, 131026);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), composer22, 6);
                    TextKt.m2816Text4IGK_g("لون شريط التقدم", (Modifier) null, ColorKt.Color(4289111718L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 3462, 0, 131058);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer22, 6);
                    composer22.startReplaceGroup(-349132255);
                    ComposerKt.sourceInformation(composer22, "*111@4300L15,106@4031L1264");
                    Iterable iterable3 = options;
                    int i82 = 0;
                    it = iterable3.iterator();
                    while (it.hasNext()) {
                    }
                    $composer2 = $composer4;
                    Composer composer62 = composer22;
                    composer62.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer62);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    $composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    $composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i42 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, -1809481217, "C83@3259L2060:WidgetConfigActivity.kt#9u2u6t");
            Modifier m730padding3ABfNKs22 = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(24))), ColorKt.Color(4280032286L), null, 2, null), Dp.m7226constructorimpl(20));
            ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer4, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer4, m730padding3ABfNKs22);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
            }
            $composer4.startReusableNode();
            if (!$composer4.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer4);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i622 = (i52 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                int i722 = ((0 >> 6) & 112) | 6;
                Composer composer222 = $composer4;
                ComposerKt.sourceInformationMarkerStart(composer222, 2061399327, "C90@3483L170,96@3666L29,97@3708L130,102@3851L30:WidgetConfigActivity.kt#9u2u6t");
                TextKt.m2816Text4IGK_g("إعدادات الويدجت", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 200070, 0, 131026);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), composer222, 6);
                TextKt.m2816Text4IGK_g("لون شريط التقدم", (Modifier) null, ColorKt.Color(4289111718L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 3462, 0, 131058);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer222, 6);
                composer222.startReplaceGroup(-349132255);
                ComposerKt.sourceInformation(composer222, "*111@4300L15,106@4031L1264");
                Iterable iterable32 = options;
                int i822 = 0;
                it = iterable32.iterator();
                while (it.hasNext()) {
                }
                $composer2 = $composer4;
                Composer composer622 = composer222;
                composer622.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer622);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                $composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                $composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i6222 = (i52 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            int i7222 = ((0 >> 6) & 112) | 6;
            Composer composer2222 = $composer4;
            ComposerKt.sourceInformationMarkerStart(composer2222, 2061399327, "C90@3483L170,96@3666L29,97@3708L130,102@3851L30:WidgetConfigActivity.kt#9u2u6t");
            TextKt.m2816Text4IGK_g("إعدادات الويدجت", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 200070, 0, 131026);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), composer2222, 6);
            TextKt.m2816Text4IGK_g("لون شريط التقدم", (Modifier) null, ColorKt.Color(4289111718L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer4, 3462, 0, 131058);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer2222, 6);
            composer2222.startReplaceGroup(-349132255);
            ComposerKt.sourceInformation(composer2222, "*111@4300L15,106@4031L1264");
            Iterable iterable322 = options;
            int i8222 = 0;
            it = iterable322.iterator();
            while (it.hasNext()) {
            }
            $composer2 = $composer4;
            Composer composer6222 = composer2222;
            composer6222.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer6222);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            $composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            $composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.widget.WidgetConfigActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WidgetConfigActivityKt.ConfigScreen$lambda$6(current, function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigScreen$lambda$5$lambda$4$lambda$3$lambda$1$lambda$0(Function1 $onPick, String $key) {
        $onPick.invoke($key);
        return Unit.INSTANCE;
    }
}
