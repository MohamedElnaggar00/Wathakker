package com.example.ui.screens;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material3.IconKt;
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
import com.example.ui.oneui.OneUIDialogKt;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.theme.FontChoice;
import com.example.ui.theme.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontPickerDialog.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"FontPickerDialog", "", "selected", "Lcom/example/ui/theme/FontChoice;", "onSelect", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "(Lcom/example/ui/theme/FontChoice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FontPickerDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontPickerDialog$lambda$5(FontChoice fontChoice, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        FontPickerDialog(fontChoice, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FontPickerDialog(final FontChoice selected, final Function1<? super FontChoice, Unit> onSelect, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        final Function0 onDismiss2;
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(1814225233);
        ComposerKt.sourceInformation($composer2, "C(FontPickerDialog)N(selected,onSelect,onDismiss)35@1252L1210,30@1122L1340:FontPickerDialog.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(selected.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onSelect) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 256 : 128;
        }
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            onDismiss2 = onDismiss;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1814225233, $dirty, -1, "com.example.ui.screens.FontPickerDialog (FontPickerDialog.kt:29)");
            }
            onDismiss2 = onDismiss;
            OneUIDialogKt.OneUIDialog("الخط", onDismiss2, null, null, "إغلاق", false, ComposableLambdaKt.rememberComposableLambda(-2001171568, true, new Function3() { // from class: com.example.ui.screens.FontPickerDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FontPickerDialogKt.FontPickerDialog$lambda$4(Function1.this, onDismiss, selected, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 112) | 1597830, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.FontPickerDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FontPickerDialogKt.FontPickerDialog$lambda$5(FontChoice.this, onSelect, onDismiss2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FontPickerDialog$lambda$4(Function1 $onSelect, Function0 $onDismiss, FontChoice $selected, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Function0 function0;
        final Function1 function1 = $onSelect;
        final Function0 function02 = $onDismiss;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation(composer, "C*42@1531L100,38@1381L1065:FontPickerDialog.kt#2thlc2");
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2001171568, $changed, -1, "com.example.ui.screens.FontPickerDialog.<anonymous> (FontPickerDialog.kt:36)");
            }
            Iterable entries = FontChoice.getEntries();
            int i = 0;
            for (Object obj : entries) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final FontChoice fontChoice = (FontChoice) obj;
                if (i > 0) {
                    composer.startReplaceGroup(-214623055);
                    ComposerKt.sourceInformation(composer, "37@1342L26");
                    OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(4), composer, 6, 0);
                } else {
                    composer.startReplaceGroup(1935286827);
                }
                composer.endReplaceGroup();
                Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)));
                ComposerKt.sourceInformationMarkerStart(composer, -214616933, "CC(remember):FontPickerDialog.kt#9igjgp");
                boolean changed = composer.changed(function1) | composer.changed(fontChoice.ordinal()) | composer.changed(function02);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.example.ui.screens.FontPickerDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FontPickerDialogKt.FontPickerDialog$lambda$4$lambda$3$lambda$1$lambda$0(Function1.this, fontChoice, function02);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    rememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(ClickableKt.m264clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7226constructorimpl(8), Dp.m7226constructorimpl(13));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m731paddingVpY3zN4);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
                Iterable iterable = entries;
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
                Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i4 = (i3 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i5 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -1299820246, "C52@1930L10,56@2119L11,49@1794L364:FontPickerDialog.kt#2thlc2");
                    TextKt.m2816Text4IGK_g(fontChoice.getTitleAr(), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(19), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), 0L, 0L, null, null, null, TypeKt.fontFamilyFor(fontChoice), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), $composer, 3072, 0, 65520);
                    if (fontChoice != $selected) {
                        $composer.startReplaceGroup(-1299431042);
                        ComposerKt.sourceInformation($composer, "62@2373L11,59@2221L193");
                        IconKt.m2273Iconww6aTOc(CheckCircleKt.getCheckCircle(Icons.Filled.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                    } else {
                        $composer.startReplaceGroup(-1301620665);
                    }
                    $composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    function1 = $onSelect;
                    function02 = $onDismiss;
                    composer = $composer;
                    i = i2;
                    entries = iterable;
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i42 = (i3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i52 = ((384 >> 6) & 112) | 6;
                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -1299820246, "C52@1930L10,56@2119L11,49@1794L364:FontPickerDialog.kt#2thlc2");
                TextKt.m2816Text4IGK_g(fontChoice.getTitleAr(), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(19), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6673copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), 0L, 0L, null, null, null, TypeKt.fontFamilyFor(fontChoice), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), $composer, 3072, 0, 65520);
                if (fontChoice != $selected) {
                }
                $composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                function1 = $onSelect;
                function02 = $onDismiss;
                composer = $composer;
                i = i2;
                entries = iterable;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FontPickerDialog$lambda$4$lambda$3$lambda$1$lambda$0(Function1 $onSelect, FontChoice $choice, Function0 $onDismiss) {
        $onSelect.invoke($choice);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }
}
