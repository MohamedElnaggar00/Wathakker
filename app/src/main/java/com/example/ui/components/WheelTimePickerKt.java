package com.example.ui.components;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: WheelTimePicker.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000326\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aW\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"WheelTimePicker", "", "initialHour24", "", "initialMinute", "onTimeSelected", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "hour24", "minute", "modifier", "Landroidx/compose/ui/Modifier;", "(IILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WheelPickerColumn", "items", "", "", "initialIndex", "onSelectedIndexChanged", "Lkotlin/Function1;", "visibleItemsCount", "itemHeight", "Landroidx/compose/ui/unit/Dp;", "WheelPickerColumn-HYR8e34", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V", "app", "selectedHour12Index", "selectedMinuteIndex", "selectedAmPmIndex", "selectedIndex"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WheelTimePickerKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WheelPickerColumn_HYR8e34$lambda$30(List list, int i, Function1 function1, Modifier modifier, int i2, float f, int i3, int i4, Composer composer, int i5) {
        m7673WheelPickerColumnHYR8e34(list, i, function1, modifier, i2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WheelTimePicker$lambda$19(int i, int i2, Function2 function2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        WheelTimePicker(i, i2, function2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x052c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WheelTimePicker(final int initialHour24, int initialMinute, final Function2<? super Integer, ? super Integer, Unit> onTimeSelected, Modifier modifier, Composer $composer, final int $changed, final int i) {
        int i2;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Modifier modifier4;
        int i3;
        Integer num;
        final MutableState selectedHour12Index$delegate;
        WheelTimePickerKt$WheelTimePicker$1$1 wheelTimePickerKt$WheelTimePicker$1$1;
        Function0 function0;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Object mutableStateOf$default3;
        Intrinsics.checkNotNullParameter(onTimeSelected, "onTimeSelected");
        Composer $composer3 = $composer.startRestartGroup(-1375083588);
        ComposerKt.sourceInformation($composer3, "C(WheelTimePicker)N(initialHour24,initialMinute,onTimeSelected,modifier)36@1264L46,37@1342L42,38@1414L54,40@1550L300,40@1474L376,52@1856L1250:WheelTimePicker.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(initialHour24) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            i2 = initialMinute;
            $dirty |= $composer3.changed(i2) ? 32 : 16;
        } else {
            i2 = initialMinute;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onTimeSelected) ? 256 : 128;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        int i5 = 0;
        int i6 = 1;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375083588, $dirty2, -1, "com.example.ui.components.WheelTimePicker (WheelTimePicker.kt:24)");
            }
            if (initialHour24 == 0) {
                i3 = 12;
            } else {
                i3 = initialHour24 > 12 ? initialHour24 - 12 : initialHour24;
            }
            int initialHour12 = i3;
            boolean initialIsAm = initialHour24 < 12;
            Iterable intRange = new IntRange(1, 12);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((IntIterator) it).nextInt()));
            }
            List hours = (List) arrayList;
            Iterable intRange2 = new IntRange(0, 59);
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
            Iterator<Integer> it2 = intRange2.iterator();
            while (it2.hasNext()) {
                int nextInt = ((IntIterator) it2).nextInt();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                int i7 = i5;
                Object[] objArr = new Object[i6];
                objArr[i7] = Integer.valueOf(nextInt);
                String format = String.format("%02d", Arrays.copyOf(objArr, i6));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                arrayList2.add(format);
                i5 = i7;
                i6 = 1;
            }
            int i8 = i5;
            List minutes = (List) arrayList2;
            List amPmList = CollectionsKt.listOf((Object[]) new String[]{"AM", "PM"});
            ComposerKt.sourceInformationMarkerStart($composer3, 1394616490, "CC(remember):WheelTimePicker.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(initialHour12 - 1), null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default3);
                rememberedValue4 = mutableStateOf$default3;
            }
            MutableState selectedHour12Index$delegate2 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1394618982, "CC(remember):WheelTimePicker.kt#9igjgp");
            Object rememberedValue5 = $composer3.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default2);
                rememberedValue5 = mutableStateOf$default2;
            }
            final MutableState selectedMinuteIndex$delegate = (MutableState) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1394621298, "CC(remember):WheelTimePicker.kt#9igjgp");
            Object rememberedValue6 = $composer3.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(initialIsAm ? i8 : 1), null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default);
                rememberedValue6 = mutableStateOf$default;
            }
            final MutableState selectedAmPmIndex$delegate = (MutableState) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Integer valueOf = Integer.valueOf(WheelTimePicker$lambda$3(selectedHour12Index$delegate2));
            Integer valueOf2 = Integer.valueOf(WheelTimePicker$lambda$6(selectedMinuteIndex$delegate));
            Integer valueOf3 = Integer.valueOf(WheelTimePicker$lambda$9(selectedAmPmIndex$delegate));
            ComposerKt.sourceInformationMarkerStart($composer3, 1394625896, "CC(remember):WheelTimePicker.kt#9igjgp");
            int i9 = ($dirty2 & 896) == 256 ? 1 : i8;
            Object rememberedValue7 = $composer3.rememberedValue();
            if (i9 != 0 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                num = valueOf;
                selectedHour12Index$delegate = selectedHour12Index$delegate2;
                wheelTimePickerKt$WheelTimePicker$1$1 = new WheelTimePickerKt$WheelTimePicker$1$1(onTimeSelected, selectedHour12Index$delegate2, selectedAmPmIndex$delegate, selectedMinuteIndex$delegate, null);
                $composer3.updateRememberedValue(wheelTimePickerKt$WheelTimePicker$1$1);
            } else {
                num = valueOf;
                wheelTimePickerKt$WheelTimePicker$1$1 = rememberedValue7;
                selectedHour12Index$delegate = selectedHour12Index$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(num, valueOf2, valueOf3, (Function2) wheelTimePickerKt$WheelTimePicker$1$1, $composer3, 0);
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(16));
            Arrangement.Horizontal center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            $composer2 = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, i8);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m731paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = (i10 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i12 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 422463372, "C63@2248L28,60@2117L215,68@2369L203,80@2734L28,77@2601L217,84@2828L29,90@3018L26,87@2886L214:WheelTimePicker.kt#qonjpd");
                int WheelTimePicker$lambda$3 = WheelTimePicker$lambda$3(selectedHour12Index$delegate);
                ComposerKt.sourceInformationMarkerStart($composer3, 429273084, "CC(remember):WheelTimePicker.kt#9igjgp");
                rememberedValue = $composer3.rememberedValue();
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WheelTimePickerKt.WheelTimePicker$lambda$18$lambda$13$lambda$12(MutableState.this, ((Integer) obj).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                m7673WheelPickerColumnHYR8e34(hours, WheelTimePicker$lambda$3, (Function1) rememberedValue, SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(64)), 0, 0.0f, $composer3, 3456, 48);
                TextKt.m2816Text4IGK_g(":", PaddingKt.m732paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7226constructorimpl(8), 0.0f, 2, null), Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200118, 0, 131024);
                int WheelTimePicker$lambda$6 = WheelTimePicker$lambda$6(selectedMinuteIndex$delegate);
                ComposerKt.sourceInformationMarkerStart($composer3, 429288636, "CC(remember):WheelTimePicker.kt#9igjgp");
                rememberedValue2 = $composer3.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return WheelTimePickerKt.WheelTimePicker$lambda$18$lambda$15$lambda$14(MutableState.this, ((Integer) obj2).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    rememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                m7673WheelPickerColumnHYR8e34(minutes, WheelTimePicker$lambda$6, (Function1) rememberedValue2, SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(64)), 0, 0.0f, $composer3, 3456, 48);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), $composer3, 6);
                int WheelTimePicker$lambda$9 = WheelTimePicker$lambda$9(selectedAmPmIndex$delegate);
                ComposerKt.sourceInformationMarkerStart($composer3, 429297722, "CC(remember):WheelTimePicker.kt#9igjgp");
                rememberedValue3 = $composer3.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return WheelTimePickerKt.WheelTimePicker$lambda$18$lambda$17$lambda$16(MutableState.this, ((Integer) obj3).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    rememberedValue3 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                m7673WheelPickerColumnHYR8e34(amPmList, WheelTimePicker$lambda$9, (Function1) rememberedValue3, SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(64)), 0, 0.0f, $composer3, 3462, 48);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i112 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i122 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 422463372, "C63@2248L28,60@2117L215,68@2369L203,80@2734L28,77@2601L217,84@2828L29,90@3018L26,87@2886L214:WheelTimePicker.kt#qonjpd");
            int WheelTimePicker$lambda$32 = WheelTimePicker$lambda$3(selectedHour12Index$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, 429273084, "CC(remember):WheelTimePicker.kt#9igjgp");
            rememberedValue = $composer3.rememberedValue();
            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            m7673WheelPickerColumnHYR8e34(hours, WheelTimePicker$lambda$32, (Function1) rememberedValue, SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(64)), 0, 0.0f, $composer3, 3456, 48);
            TextKt.m2816Text4IGK_g(":", PaddingKt.m732paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7226constructorimpl(8), 0.0f, 2, null), Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200118, 0, 131024);
            int WheelTimePicker$lambda$62 = WheelTimePicker$lambda$6(selectedMinuteIndex$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, 429288636, "CC(remember):WheelTimePicker.kt#9igjgp");
            rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            m7673WheelPickerColumnHYR8e34(minutes, WheelTimePicker$lambda$62, (Function1) rememberedValue2, SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(64)), 0, 0.0f, $composer3, 3456, 48);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), $composer3, 6);
            int WheelTimePicker$lambda$92 = WheelTimePicker$lambda$9(selectedAmPmIndex$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, 429297722, "CC(remember):WheelTimePicker.kt#9igjgp");
            rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            m7673WheelPickerColumnHYR8e34(amPmList, WheelTimePicker$lambda$92, (Function1) rememberedValue3, SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(64)), 0, 0.0f, $composer3, 3462, 48);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final int i13 = i2;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return WheelTimePickerKt.WheelTimePicker$lambda$19(initialHour24, i13, onTimeSelected, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WheelTimePicker$lambda$3(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void WheelTimePicker$lambda$4(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WheelTimePicker$lambda$6(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void WheelTimePicker$lambda$7(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final void WheelTimePicker$lambda$10(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WheelTimePicker$lambda$9(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WheelTimePicker$lambda$18$lambda$13$lambda$12(MutableState $selectedHour12Index$delegate, int it) {
        WheelTimePicker$lambda$4($selectedHour12Index$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WheelTimePicker$lambda$18$lambda$15$lambda$14(MutableState $selectedMinuteIndex$delegate, int it) {
        WheelTimePicker$lambda$7($selectedMinuteIndex$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WheelTimePicker$lambda$18$lambda$17$lambda$16(MutableState $selectedAmPmIndex$delegate, int it) {
        WheelTimePicker$lambda$10($selectedAmPmIndex$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x018c, code lost:
    
        if (r4 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0318, code lost:
    
        if (r8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0304  */
    /* renamed from: WheelPickerColumn-HYR8e34, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m7673WheelPickerColumnHYR8e34(final List<String> list, final int initialIndex, final Function1<? super Integer, Unit> function1, Modifier modifier, int visibleItemsCount, float itemHeight, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        int visibleItemsCount2;
        final float itemHeight2;
        final Modifier modifier3;
        final int visibleItemsCount3;
        final float itemHeight3;
        Function0 function0;
        boolean changed;
        Modifier modifier4;
        Composer $composer2 = $composer.startRestartGroup(550408584);
        ComposerKt.sourceInformation($composer2, "C(WheelPickerColumn)N(items,initialIndex,onSelectedIndexChanged,modifier,visibleItemsCount,itemHeight:c#ui.unit.Dp)107@3431L116,111@3568L68,112@3665L52,114@3744L169,121@3949L53,121@3919L83,125@4008L1327:WheelTimePicker.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(initialIndex) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            visibleItemsCount2 = visibleItemsCount;
        } else if (($changed & 24576) == 0) {
            visibleItemsCount2 = visibleItemsCount;
            $dirty |= $composer2.changed(visibleItemsCount2) ? 16384 : 8192;
        } else {
            visibleItemsCount2 = visibleItemsCount;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            itemHeight2 = itemHeight;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            itemHeight2 = itemHeight;
            $dirty |= $composer2.changed(itemHeight2) ? 131072 : 65536;
        } else {
            itemHeight2 = itemHeight;
        }
        if ($composer2.shouldExecute(($dirty & 74899) != 74898, $dirty & 1)) {
            if (i2 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i3 != 0) {
                visibleItemsCount2 = 3;
            }
            if (i4 != 0) {
                itemHeight2 = Dp.m7226constructorimpl(52);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(550408584, $dirty, -1, "com.example.ui.components.WheelPickerColumn (WheelTimePicker.kt:105)");
            }
            final int count = list.size();
            ComposerKt.sourceInformationMarkerStart($composer2, 661682204, "CC(remember):WheelTimePicker.kt#9igjgp");
            boolean z = ($dirty & 112) == 32;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object valueOf = Integer.valueOf((LockFreeTaskQueueCore.MAX_CAPACITY_MASK - (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % count)) + initialIndex);
                $composer2.updateRememberedValue(valueOf);
                rememberedValue = valueOf;
            }
            int startIndex = ((Number) rememberedValue).intValue();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final LazyListState listState = LazyListStateKt.rememberLazyListState(startIndex - 1, 0, $composer2, 0, 2);
            FlingBehavior snapFlingBehavior = LazyListSnapLayoutInfoProviderKt.rememberSnapFlingBehavior(listState, null, $composer2, 0, 2);
            ComposerKt.sourceInformationMarkerStart($composer2, 661692273, "CC(remember):WheelTimePicker.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object derivedStateOf = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(WheelTimePickerKt.WheelPickerColumn_HYR8e34$lambda$22$lambda$21(LazyListState.this, count));
                    }
                });
                $composer2.updateRememberedValue(derivedStateOf);
                rememberedValue2 = derivedStateOf;
            }
            final State selectedIndex$delegate = (State) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Integer valueOf2 = Integer.valueOf(WheelPickerColumn_HYR8e34$lambda$23(selectedIndex$delegate));
            ComposerKt.sourceInformationMarkerStart($composer2, 661698717, "CC(remember):WheelTimePicker.kt#9igjgp");
            boolean z2 = ($dirty & 896) == 256;
            int $dirty2 = $dirty;
            WheelTimePickerKt$WheelPickerColumn$1$1 rememberedValue3 = $composer2.rememberedValue();
            if (z2) {
            }
            rememberedValue3 = new WheelTimePickerKt$WheelPickerColumn$1$1(function1, selectedIndex$delegate, null);
            $composer2.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, $composer2, 0);
            Modifier m763height3ABfNKs = SizeKt.m763height3ABfNKs(modifier2, Dp.m7226constructorimpl(visibleItemsCount2 * itemHeight2));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m763height3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i7 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -1932197679, "C136@4425L904,129@4141L1188:WheelTimePicker.kt#qonjpd");
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier m763height3ABfNKs2 = SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(visibleItemsCount2 * itemHeight2));
                ComposerKt.sourceInformationMarkerStart($composer2, -616509482, "CC(remember):WheelTimePicker.kt#9igjgp");
                changed = $composer2.changed(count) | $composer2.changedInstance(list) | (($dirty2 & 458752) != 131072);
                Object rememberedValue4 = $composer2.rememberedValue();
                if (changed) {
                    modifier4 = m763height3ABfNKs2;
                } else {
                    modifier4 = m763height3ABfNKs2;
                }
                Object obj = new Function1() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return WheelTimePickerKt.WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27(count, list, itemHeight2, selectedIndex$delegate, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue4 = obj;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LazyDslKt.LazyColumn(modifier4, listState, null, false, null, centerHorizontally, snapFlingBehavior, false, (Function1) rememberedValue4, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 156);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                visibleItemsCount3 = visibleItemsCount2;
                itemHeight3 = itemHeight2;
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i62 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i72 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1932197679, "C136@4425L904,129@4141L1188:WheelTimePicker.kt#qonjpd");
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier m763height3ABfNKs22 = SizeKt.m763height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(visibleItemsCount2 * itemHeight2));
            ComposerKt.sourceInformationMarkerStart($composer2, -616509482, "CC(remember):WheelTimePicker.kt#9igjgp");
            changed = $composer2.changed(count) | $composer2.changedInstance(list) | (($dirty2 & 458752) != 131072);
            Object rememberedValue42 = $composer2.rememberedValue();
            if (changed) {
            }
            Object obj2 = new Function1() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    return WheelTimePickerKt.WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27(count, list, itemHeight2, selectedIndex$delegate, (LazyListScope) obj22);
                }
            };
            $composer2.updateRememberedValue(obj2);
            rememberedValue42 = obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(modifier4, listState, null, false, null, centerHorizontally2, snapFlingBehavior, false, (Function1) rememberedValue42, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 156);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            visibleItemsCount3 = visibleItemsCount2;
            itemHeight3 = itemHeight2;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            visibleItemsCount3 = visibleItemsCount2;
            itemHeight3 = itemHeight2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return WheelTimePickerKt.WheelPickerColumn_HYR8e34$lambda$30(list, initialIndex, function1, modifier3, visibleItemsCount3, itemHeight3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WheelPickerColumn_HYR8e34$lambda$23(State<Integer> state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int WheelPickerColumn_HYR8e34$lambda$22$lambda$21(LazyListState $listState, int $count) {
        int centerIndex = $listState.getFirstVisibleItemIndex() + 1;
        return ((centerIndex % $count) + $count) % $count;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27(final int $count, final List $items, final float $itemHeight, final State $selectedIndex$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.items$default(LazyColumn, Integer.MAX_VALUE, null, null, ComposableLambdaKt.composableLambdaInstance(1580063851, true, new Function4() { // from class: com.example.ui.components.WheelTimePickerKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return WheelTimePickerKt.WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27$lambda$26($count, $items, $itemHeight, $selectedIndex$delegate, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit WheelPickerColumn_HYR8e34$lambda$29$lambda$28$lambda$27$lambda$26(int $count, List $items, float $itemHeight, State $selectedIndex$delegate, LazyItemScope items, int index, Composer $composer, int $changed) {
        Function0 function0;
        long m4487copywmQWz5c;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        ComposerKt.sourceInformation($composer, "CN(index)142@4680L625:WheelTimePicker.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 48) == 0) {
            $dirty |= $composer.changed(index) ? 32 : 16;
        }
        if ($composer.shouldExecute(($dirty & 145) != 144, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1580063851, $dirty, -1, "com.example.ui.components.WheelPickerColumn.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WheelTimePicker.kt:138)");
            }
            int actualIndex = ((index % $count) + $count) % $count;
            String itemText = (String) $items.get(actualIndex);
            boolean isSelected = actualIndex == WheelPickerColumn_HYR8e34$lambda$23($selectedIndex$delegate);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, $itemHeight), 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i3 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1074172971, "C148@4906L381:WheelTimePicker.kt#qonjpd");
                long sp = !isSelected ? TextUnitKt.getSp(32) : TextUnitKt.getSp(26);
                FontWeight.Companion companion = FontWeight.INSTANCE;
                FontWeight bold = !isSelected ? companion.getBold() : companion.getNormal();
                Color.Companion companion2 = Color.INSTANCE;
                if (isSelected) {
                    m4487copywmQWz5c = Color.m4487copywmQWz5c(r19, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r19) : 0.35f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r19) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r19) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(companion2.m4526getWhite0d7_KjU()) : 0.0f);
                } else {
                    m4487copywmQWz5c = companion2.m4526getWhite0d7_KjU();
                }
                TextKt.m2816Text4IGK_g(itemText, (Modifier) null, m4487copywmQWz5c, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 130514);
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
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i32 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1074172971, "C148@4906L381:WheelTimePicker.kt#qonjpd");
            if (!isSelected) {
            }
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            if (!isSelected) {
            }
            Color.Companion companion22 = Color.INSTANCE;
            if (isSelected) {
            }
            TextKt.m2816Text4IGK_g(itemText, (Modifier) null, m4487copywmQWz5c, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 130514);
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
}
