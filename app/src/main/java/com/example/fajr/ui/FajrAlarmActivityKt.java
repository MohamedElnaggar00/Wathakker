package com.example.fajr.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AlarmKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FajrAlarmActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"FajrAlarmScreen", "", "onDismiss", "Lkotlin/Function0;", "onSnooze", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app", "currentTimeStr", "", "currentDateStr", "showSnoozeOptions", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FajrAlarmActivityKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrAlarmScreen$lambda$29(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        FajrAlarmScreen(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FajrAlarmScreen(final Function0<Unit> onDismiss, Function1<? super Integer, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Object mutableStateOf$default3;
        final Function1<? super Integer, Unit> onSnooze = function1;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSnooze, "onSnooze");
        Composer $composer3 = $composer.startRestartGroup(-533734274);
        ComposerKt.sourceInformation($composer3, "C(FajrAlarmScreen)N(onDismiss,onSnooze)182@6350L31,183@6408L31,184@6469L34,186@6530L433,186@6509L454,202@7092L6773,199@6969L6896:FajrAlarmActivity.kt#jcb7bm");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onSnooze) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-533734274, $dirty2, -1, "com.example.fajr.ui.FajrAlarmScreen (FajrAlarmActivity.kt:181)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1817525283, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default3 = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default3);
                rememberedValue = mutableStateOf$default3;
            }
            final MutableState currentTimeStr$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1817523427, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default2);
                rememberedValue2 = mutableStateOf$default2;
            }
            final MutableState currentDateStr$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1817521472, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default);
                rememberedValue3 = mutableStateOf$default;
            }
            final MutableState showSnoozeOptions$delegate = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1817519121, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new FajrAlarmActivityKt$FajrAlarmScreen$1$1(currentTimeStr$delegate, currentDateStr$delegate, null);
                $composer3.updateRememberedValue(obj);
                rememberedValue4 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, $composer3, 6);
            onSnooze = function1;
            $composer2 = $composer3;
            SurfaceKt.m2666SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ColorKt.Color(4279179050L), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1482650557, true, new Function2() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28(MutableState.this, currentDateStr$delegate, showSnoozeOptions$delegate, onSnooze, onDismiss, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 12583302, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$29(Function0.this, onSnooze, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String FajrAlarmScreen$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String FajrAlarmScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FajrAlarmScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FajrAlarmScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x09e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0835 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x068c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a96  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FajrAlarmScreen$lambda$28(MutableState $currentTimeStr$delegate, MutableState $currentDateStr$delegate, final MutableState $showSnoozeOptions$delegate, final Function1 $onSnooze, Function0 $onDismiss, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        Function0 function02;
        Composer m3828constructorimpl;
        Function0 function03;
        Composer m3828constructorimpl2;
        long m4487copywmQWz5c;
        Function0 function04;
        Composer m3828constructorimpl3;
        Function0 function05;
        Composer m3828constructorimpl4;
        Function0 function06;
        Composer m3828constructorimpl5;
        Function0 function07;
        Composer m3828constructorimpl6;
        Object rememberedValue;
        ComposerKt.sourceInformation($composer, "C203@7102L6757:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482650557, $changed, -1, "com.example.fajr.ui.FajrAlarmScreen.<anonymous> (FajrAlarmActivity.kt:203)");
            }
            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(24));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl7 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl7, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl7, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl7.getInserting()) {
                i = i2;
            } else {
                i = i2;
                if (Intrinsics.areEqual(m3828constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl7, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -509689108, "C209@7275L6574:FajrAlarmActivity.kt#jcb7bm");
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.Vertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, fillMaxHeight$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((438 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function02 = constructor2;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i6 = (i5 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i7 = ((438 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -723899036, "C214@7499L30,217@7583L1254,252@8892L555,268@9518L4317:FajrAlarmActivity.kt#jcb7bm");
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(32)), $composer, 6);
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
                        Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i8 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                            function03 = constructor3;
                            $composer.createNode(function03);
                        } else {
                            function03 = constructor3;
                            $composer.useNode();
                        }
                        m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i9 = (i8 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            int i10 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -379203509, "C218@7664L618,233@8304L30,235@8356L212,242@8590L29,244@8641L178:FajrAlarmActivity.kt#jcb7bm");
                            Modifier clip = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(90)), RoundedCornerShapeKt.getCircleShape());
                            m4487copywmQWz5c = Color.m4487copywmQWz5c(r86, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r86) : 0.2f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r86) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r86) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4282090230L)) : 0.0f);
                            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(clip, m4487copywmQWz5c, null, 2, null);
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default);
                            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            int i11 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                                function04 = constructor4;
                                $composer.createNode(function04);
                            } else {
                                function04 = constructor4;
                                $composer.useNode();
                            }
                            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i12 = (i11 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                int i13 = ((48 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
                                IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                                TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                                TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier modifier2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifier2);
                                Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                int i14 = ((((384 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                    function05 = constructor5;
                                    $composer.createNode(function05);
                                } else {
                                    function05 = constructor5;
                                    $composer.useNode();
                                }
                                m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl4.getInserting() && Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i15 = (i14 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                    int i16 = ((384 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                                    TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                                    TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
                                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = $composer.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
                                    Function0 constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i17 = ((((390 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!($composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer.startReusableNode();
                                    if (!$composer.getInserting()) {
                                        function06 = constructor6;
                                        $composer.createNode(function06);
                                    } else {
                                        function06 = constructor6;
                                        $composer.useNode();
                                    }
                                    m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                                    Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3828constructorimpl5.getInserting() && Intrinsics.areEqual(m3828constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i18 = (i17 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                        int i19 = ((390 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                                        if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                                            $composer.startReplaceGroup(2038200071);
                                            ComposerKt.sourceInformation($composer, "277@9958L2063,273@9742L2279,314@12046L30");
                                            SurfaceKt.m2666SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(24)), ColorKt.Color(4280166715L), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-821954973, true, new Function2() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21(Function1.this, (Composer) obj, ((Integer) obj2).intValue());
                                                }
                                            }, $composer, 54), $composer, 12583302, 120);
                                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                                        } else {
                                            $composer.startReplaceGroup(2028486965);
                                        }
                                        $composer.endReplaceGroup();
                                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Arrangement.Horizontal m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m610spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap7 = $composer.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2);
                                        Function0 constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                        int i20 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!($composer.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        $composer.startReusableNode();
                                        if (!$composer.getInserting()) {
                                            function07 = constructor7;
                                            $composer.createNode(function07);
                                        } else {
                                            function07 = constructor7;
                                            $composer.useNode();
                                        }
                                        m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                        Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2 setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m3828constructorimpl6.getInserting() && Intrinsics.areEqual(m3828constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i21 = (i20 >> 6) & 14;
                                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            int i22 = ((54 >> 6) & 112) | 6;
                                            RowScope rowScope = RowScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                                            RoundedCornerShape m1024RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                                            Modifier m763height3ABfNKs = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                                            ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                            rememberedValue = $composer.rememberedValue();
                                            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(MutableState.this);
                                                    }
                                                };
                                                $composer.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs, false, m1024RoundedCornerShape0680j_4, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                                            ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            $composer.endNode();
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            $composer.endNode();
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            $composer.endNode();
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
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
                                        m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                        m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i212 = (i20 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                        int i222 = ((54 >> 6) & 112) | 6;
                                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                                        RoundedCornerShape m1024RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                                        Modifier m763height3ABfNKs2 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                                        ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                        rememberedValue = $composer.rememberedValue();
                                        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                        }
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs2, false, m1024RoundedCornerShape0680j_42, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                                        ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                    m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                    m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i182 = (i17 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance42 = ColumnScopeInstance.INSTANCE;
                                    int i192 = ((390 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                                    if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                                    }
                                    $composer.endReplaceGroup();
                                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal m610spacedBy0680j_42 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash72 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap72 = $composer.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier72 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22);
                                    Function0 constructor72 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i202 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!($composer.getApplier() instanceof Applier)) {
                                    }
                                    $composer.startReusableNode();
                                    if (!$composer.getInserting()) {
                                    }
                                    m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                    Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3828constructorimpl6.getInserting()) {
                                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i2122 = (i202 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                        int i2222 = ((54 >> 6) & 112) | 6;
                                        RowScope rowScope22 = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                                        RoundedCornerShape m1024RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                                        Modifier m763height3ABfNKs22 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                                        ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                        rememberedValue = $composer.rememberedValue();
                                        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                        }
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs22, false, m1024RoundedCornerShape0680j_422, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                                        ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                    m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72));
                                    m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72), setCompositeKeyHash72);
                                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i21222 = (i202 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    int i22222 = ((54 >> 6) & 112) | 6;
                                    RowScope rowScope222 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                                    RoundedCornerShape m1024RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                                    Modifier m763height3ABfNKs222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                                    ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                    rememberedValue = $composer.rememberedValue();
                                    if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs222, false, m1024RoundedCornerShape0680j_4222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                                    ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                                m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                int i152 = (i14 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                                int i162 = ((384 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                                TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                                TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally42 = Alignment.INSTANCE.getCenterHorizontally();
                                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy42 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally42, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash62 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap62 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier62 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default3);
                                Function0 constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                                int i172 = ((((390 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                }
                                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl5.getInserting()) {
                                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i1822 = (i172 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance422 = ColumnScopeInstance.INSTANCE;
                                    int i1922 = ((390 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                                    if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                                    }
                                    $composer.endReplaceGroup();
                                    Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal m610spacedBy0680j_422 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash722 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap722 = $composer.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier722 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222);
                                    Function0 constructor722 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i2022 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!($composer.getApplier() instanceof Applier)) {
                                    }
                                    $composer.startReusableNode();
                                    if (!$composer.getInserting()) {
                                    }
                                    m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                    Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3828constructorimpl6.getInserting()) {
                                    }
                                    m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722));
                                    m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722), setCompositeKeyHash722);
                                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i212222 = (i2022 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    int i222222 = ((54 >> 6) & 112) | 6;
                                    RowScope rowScope2222 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                                    RoundedCornerShape m1024RoundedCornerShape0680j_42222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                                    Modifier m763height3ABfNKs2222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                                    ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                    rememberedValue = $composer.rememberedValue();
                                    if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs2222, false, m1024RoundedCornerShape0680j_42222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                                    ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash62));
                                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash62), setCompositeKeyHash62);
                                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                                int i18222 = (i172 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance4222 = ColumnScopeInstance.INSTANCE;
                                int i19222 = ((390 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                                if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                                }
                                $composer.endReplaceGroup();
                                Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal m610spacedBy0680j_4222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash7222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap7222 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier7222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2222);
                                Function0 constructor7222 = ComposeUiNode.INSTANCE.getConstructor();
                                int i20222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                }
                                m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash7222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl6.getInserting()) {
                                }
                                m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222));
                                m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7222), setCompositeKeyHash7222);
                                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7222, ComposeUiNode.INSTANCE.getSetModifier());
                                int i2122222 = (i20222 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i2222222 = ((54 >> 6) & 112) | 6;
                                RowScope rowScope22222 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                                RoundedCornerShape m1024RoundedCornerShape0680j_422222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                                Modifier m763height3ABfNKs22222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                                ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                rememberedValue = $composer.rememberedValue();
                                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs22222, false, m1024RoundedCornerShape0680j_422222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                                ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            int i122 = (i11 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            int i132 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
                            IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                            TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                            TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            Alignment.Horizontal centerHorizontally32 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier22 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally32, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash52 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap52 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier($composer, modifier22);
                            Function0 constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                            int i142 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl4.getInserting()) {
                                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                                int i1522 = (i142 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
                                int i1622 = ((384 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                                TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                                TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally422 = Alignment.INSTANCE.getCenterHorizontally();
                                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy422 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally422, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash622 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap622 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier622 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default32);
                                Function0 constructor622 = ComposeUiNode.INSTANCE.getConstructor();
                                int i1722 = ((((390 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                }
                                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl5.getInserting()) {
                                }
                                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash622));
                                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash622), setCompositeKeyHash622);
                                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
                                int i182222 = (i1722 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance42222 = ColumnScopeInstance.INSTANCE;
                                int i192222 = ((390 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                                if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                                }
                                $composer.endReplaceGroup();
                                Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal m610spacedBy0680j_42222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash72222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap72222 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier72222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22222);
                                Function0 constructor72222 = ComposeUiNode.INSTANCE.getConstructor();
                                int i202222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                }
                                m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash72222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl6.getInserting()) {
                                }
                                m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222));
                                m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72222), setCompositeKeyHash72222);
                                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72222, ComposeUiNode.INSTANCE.getSetModifier());
                                int i21222222 = (i202222 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i22222222 = ((54 >> 6) & 112) | 6;
                                RowScope rowScope222222 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                                RoundedCornerShape m1024RoundedCornerShape0680j_4222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                                Modifier m763height3ABfNKs222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                                ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                rememberedValue = $composer.rememberedValue();
                                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs222222, false, m1024RoundedCornerShape0680j_4222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                                ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash52));
                            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash52), setCompositeKeyHash52);
                            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                            int i15222 = (i142 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
                            int i16222 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                            TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            Modifier fillMaxWidth$default322 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally4222 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy4222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash6222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap6222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default322);
                            Function0 constructor6222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i17222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash6222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl5.getInserting()) {
                            }
                            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6222));
                            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6222), setCompositeKeyHash6222);
                            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1822222 = (i17222 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance422222 = ColumnScopeInstance.INSTANCE;
                            int i1922222 = ((390 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                            if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                            }
                            $composer.endReplaceGroup();
                            Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal m610spacedBy0680j_422222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash722222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap722222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier722222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222222);
                            Function0 constructor722222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i2022222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash722222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl6.getInserting()) {
                            }
                            m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222));
                            m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722222), setCompositeKeyHash722222);
                            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i212222222 = (i2022222 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i222222222 = ((54 >> 6) & 112) | 6;
                            RowScope rowScope2222222 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                            RoundedCornerShape m1024RoundedCornerShape0680j_42222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                            Modifier m763height3ABfNKs2222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                            ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                            rememberedValue = $composer.rememberedValue();
                            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs2222222, false, m1024RoundedCornerShape0680j_42222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                            ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                        m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i92 = (i8 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        int i102 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -379203509, "C218@7664L618,233@8304L30,235@8356L212,242@8590L29,244@8641L178:FajrAlarmActivity.kt#jcb7bm");
                        Modifier clip2 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(90)), RoundedCornerShapeKt.getCircleShape());
                        m4487copywmQWz5c = Color.m4487copywmQWz5c(r86, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r86) : 0.2f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r86) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r86) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4282090230L)) : 0.0f);
                        Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(clip2, m4487copywmQWz5c, null, 2, null);
                        Alignment center22 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default2);
                        Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        int i112 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting()) {
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1222 = (i112 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                            int i1322 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
                            IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                            TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                            TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            Alignment.Horizontal centerHorizontally322 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier222 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally322, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash522 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap522 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier522 = ComposedModifierKt.materializeModifier($composer, modifier222);
                            Function0 constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                            int i1422 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl4.getInserting()) {
                            }
                            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash522));
                            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash522), setCompositeKeyHash522);
                            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                            int i152222 = (i1422 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance32222 = ColumnScopeInstance.INSTANCE;
                            int i162222 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                            TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            Modifier fillMaxWidth$default3222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally42222 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy42222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally42222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash62222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap62222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier62222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default3222);
                            Function0 constructor62222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i172222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy42222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap62222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash62222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl5.getInserting()) {
                            }
                            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash62222));
                            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash62222), setCompositeKeyHash62222);
                            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i18222222 = (i172222 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance4222222 = ColumnScopeInstance.INSTANCE;
                            int i19222222 = ((390 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                            if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                            }
                            $composer.endReplaceGroup();
                            Modifier fillMaxWidth$default2222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal m610spacedBy0680j_4222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash7222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap7222222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier7222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2222222);
                            Function0 constructor7222222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i20222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash7222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl6.getInserting()) {
                            }
                            m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222222));
                            m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7222222), setCompositeKeyHash7222222);
                            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7222222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i2122222222 = (i20222222 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i2222222222 = ((54 >> 6) & 112) | 6;
                            RowScope rowScope22222222 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                            RoundedCornerShape m1024RoundedCornerShape0680j_422222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                            Modifier m763height3ABfNKs22222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                            ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                            rememberedValue = $composer.rememberedValue();
                            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs22222222, false, m1024RoundedCornerShape0680j_422222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                            ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                        m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42));
                        m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42), setCompositeKeyHash42);
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        int i12222 = (i112 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                        int i13222 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
                        IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                        TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                        TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Alignment.Horizontal centerHorizontally3222 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier2222 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap5222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier($composer, modifier2222);
                        Function0 constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i14222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl4.getInserting()) {
                        }
                        m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5222));
                        m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5222), setCompositeKeyHash5222);
                        Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1522222 = (i14222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance322222 = ColumnScopeInstance.INSTANCE;
                        int i1622222 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                        TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Modifier fillMaxWidth$default32222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally422222 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy422222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally422222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash622222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap622222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier622222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default32222);
                        Function0 constructor622222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i1722222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy422222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap622222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash622222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl5.getInserting()) {
                        }
                        m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash622222));
                        m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash622222), setCompositeKeyHash622222);
                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier622222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i182222222 = (i1722222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance42222222 = ColumnScopeInstance.INSTANCE;
                        int i192222222 = ((390 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                        if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                        }
                        $composer.endReplaceGroup();
                        Modifier fillMaxWidth$default22222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal m610spacedBy0680j_42222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash72222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap72222222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier72222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22222222);
                        Function0 constructor72222222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i202222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash72222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl6.getInserting()) {
                        }
                        m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222222));
                        m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72222222), setCompositeKeyHash72222222);
                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72222222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i21222222222 = (i202222222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i22222222222 = ((54 >> 6) & 112) | 6;
                        RowScope rowScope222222222 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                        RoundedCornerShape m1024RoundedCornerShape0680j_4222222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                        Modifier m763height3ABfNKs222222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                        ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                        rememberedValue = $composer.rememberedValue();
                        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs222222222, false, m1024RoundedCornerShape0680j_4222222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                        ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i62 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    int i72 = ((438 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -723899036, "C214@7499L30,217@7583L1254,252@8892L555,268@9518L4317:FajrAlarmActivity.kt#jcb7bm");
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(32)), $composer, 6);
                    Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier3 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, modifier3);
                    Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    int i82 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl2.getInserting()) {
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        int i922 = (i82 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                        int i1022 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -379203509, "C218@7664L618,233@8304L30,235@8356L212,242@8590L29,244@8641L178:FajrAlarmActivity.kt#jcb7bm");
                        Modifier clip22 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(90)), RoundedCornerShapeKt.getCircleShape());
                        m4487copywmQWz5c = Color.m4487copywmQWz5c(r86, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r86) : 0.2f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r86) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r86) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4282090230L)) : 0.0f);
                        Modifier m231backgroundbw27NRU$default22 = BackgroundKt.m231backgroundbw27NRU$default(clip22, m4487copywmQWz5c, null, 2, null);
                        Alignment center222 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default22);
                        Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                        int i1122 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting()) {
                        }
                        m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422));
                        m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422), setCompositeKeyHash422);
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                        int i122222 = (i1122 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                        int i132222 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
                        IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                        TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                        TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Alignment.Horizontal centerHorizontally32222 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier22222 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy32222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally32222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash52222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap52222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier($composer, modifier22222);
                        Function0 constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i142222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl4.getInserting()) {
                        }
                        m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash52222));
                        m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash52222), setCompositeKeyHash52222);
                        Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i15222222 = (i142222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3222222 = ColumnScopeInstance.INSTANCE;
                        int i16222222 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                        TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Modifier fillMaxWidth$default322222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally4222222 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy4222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4222222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash6222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap6222222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default322222);
                        Function0 constructor6222222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i17222222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy4222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash6222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl5.getInserting()) {
                        }
                        m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6222222));
                        m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6222222), setCompositeKeyHash6222222);
                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6222222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1822222222 = (i17222222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance422222222 = ColumnScopeInstance.INSTANCE;
                        int i1922222222 = ((390 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                        if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                        }
                        $composer.endReplaceGroup();
                        Modifier fillMaxWidth$default222222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal m610spacedBy0680j_422222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy22222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash722222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap722222222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier722222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222222222);
                        Function0 constructor722222222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i2022222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash722222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl6.getInserting()) {
                        }
                        m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222222));
                        m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722222222), setCompositeKeyHash722222222);
                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722222222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i212222222222 = (i2022222222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i222222222222 = ((54 >> 6) & 112) | 6;
                        RowScope rowScope2222222222 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                        RoundedCornerShape m1024RoundedCornerShape0680j_42222222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                        Modifier m763height3ABfNKs2222222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                        ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                        rememberedValue = $composer.rememberedValue();
                        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs2222222222, false, m1024RoundedCornerShape0680j_42222222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                        ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9222 = (i82 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                    int i10222 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -379203509, "C218@7664L618,233@8304L30,235@8356L212,242@8590L29,244@8641L178:FajrAlarmActivity.kt#jcb7bm");
                    Modifier clip222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(90)), RoundedCornerShapeKt.getCircleShape());
                    m4487copywmQWz5c = Color.m4487copywmQWz5c(r86, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r86) : 0.2f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r86) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r86) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4282090230L)) : 0.0f);
                    Modifier m231backgroundbw27NRU$default222 = BackgroundKt.m231backgroundbw27NRU$default(clip222, m4487copywmQWz5c, null, 2, null);
                    Alignment center2222 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default222);
                    Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i11222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4222));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4222), setCompositeKeyHash4222);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1222222 = (i11222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                    int i1322222 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                    TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                    TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Alignment.Horizontal centerHorizontally322222 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier222222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy322222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally322222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash522222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap522222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier522222 = ComposedModifierKt.materializeModifier($composer, modifier222222);
                    Function0 constructor522222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1422222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap522222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash522222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl4.getInserting()) {
                    }
                    m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash522222));
                    m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash522222), setCompositeKeyHash522222);
                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier522222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i152222222 = (i1422222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance32222222 = ColumnScopeInstance.INSTANCE;
                    int i162222222 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                    TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier fillMaxWidth$default3222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally42222222 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy42222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally42222222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash62222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap62222222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier62222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default3222222);
                    Function0 constructor62222222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i172222222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy42222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap62222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash62222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl5.getInserting()) {
                    }
                    m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash62222222));
                    m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash62222222), setCompositeKeyHash62222222);
                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62222222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i18222222222 = (i172222222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance4222222222 = ColumnScopeInstance.INSTANCE;
                    int i19222222222 = ((390 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                    if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                    }
                    $composer.endReplaceGroup();
                    Modifier fillMaxWidth$default2222222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal m610spacedBy0680j_4222222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy222222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash7222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap7222222222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7222222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2222222222);
                    Function0 constructor7222222222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i20222222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash7222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl6.getInserting()) {
                    }
                    m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222222222));
                    m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7222222222), setCompositeKeyHash7222222222);
                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7222222222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2122222222222 = (i20222222222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i2222222222222 = ((54 >> 6) & 112) | 6;
                    RowScope rowScope22222222222 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                    RoundedCornerShape m1024RoundedCornerShape0680j_422222222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                    Modifier m763height3ABfNKs22222222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                    ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                    rememberedValue = $composer.rememberedValue();
                    if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs22222222222, false, m1024RoundedCornerShape0680j_422222222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                    ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope22222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl7, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            int i42 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -509689108, "C209@7275L6574:FajrAlarmActivity.kt#jcb7bm");
            Alignment.Horizontal centerHorizontally5 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Modifier fillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(spaceBetween2, centerHorizontally5, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, fillMaxHeight$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i622 = (i52 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance52 = ColumnScopeInstance.INSTANCE;
                int i722 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -723899036, "C214@7499L30,217@7583L1254,252@8892L555,268@9518L4317:FajrAlarmActivity.kt#jcb7bm");
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(32)), $composer, 6);
                Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier32 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, modifier32);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i822 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i92222 = (i822 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                int i102222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -379203509, "C218@7664L618,233@8304L30,235@8356L212,242@8590L29,244@8641L178:FajrAlarmActivity.kt#jcb7bm");
                Modifier clip2222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(90)), RoundedCornerShapeKt.getCircleShape());
                m4487copywmQWz5c = Color.m4487copywmQWz5c(r86, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r86) : 0.2f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r86) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r86) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4282090230L)) : 0.0f);
                Modifier m231backgroundbw27NRU$default2222 = BackgroundKt.m231backgroundbw27NRU$default(clip2222, m4487copywmQWz5c, null, 2, null);
                Alignment center22222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default2222);
                Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                int i112222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42222), setCompositeKeyHash42222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                int i12222222 = (i112222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
                int i13222222 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Alignment.Horizontal centerHorizontally3222222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier2222222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy3222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3222222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap5222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5222222 = ComposedModifierKt.materializeModifier($composer, modifier2222222);
                Function0 constructor5222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i14222222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy3222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl4.getInserting()) {
                }
                m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5222222));
                m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5222222), setCompositeKeyHash5222222);
                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i1522222222 = (i14222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance322222222 = ColumnScopeInstance.INSTANCE;
                int i1622222222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
                TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier fillMaxWidth$default32222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally422222222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy422222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally422222222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash622222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap622222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier622222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default32222222);
                Function0 constructor622222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i1722222222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy422222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap622222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash622222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl5.getInserting()) {
                }
                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash622222222));
                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash622222222), setCompositeKeyHash622222222);
                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier622222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i182222222222 = (i1722222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance42222222222 = ColumnScopeInstance.INSTANCE;
                int i192222222222 = ((390 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
                if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
                }
                $composer.endReplaceGroup();
                Modifier fillMaxWidth$default22222222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal m610spacedBy0680j_42222222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2222222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash72222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap72222222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier72222222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22222222222);
                Function0 constructor72222222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i202222222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash72222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl6.getInserting()) {
                }
                m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222222222));
                m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72222222222), setCompositeKeyHash72222222222);
                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72222222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i21222222222222 = (i202222222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i22222222222222 = ((54 >> 6) & 112) | 6;
                RowScope rowScope222222222222 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
                RoundedCornerShape m1024RoundedCornerShape0680j_4222222222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
                Modifier m763height3ABfNKs222222222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
                ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                rememberedValue = $composer.rememberedValue();
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs222222222222, false, m1024RoundedCornerShape0680j_4222222222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
                ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope222222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i6222 = (i52 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance522 = ColumnScopeInstance.INSTANCE;
            int i7222 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -723899036, "C214@7499L30,217@7583L1254,252@8892L555,268@9518L4317:FajrAlarmActivity.kt#jcb7bm");
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(32)), $composer, 6);
            Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier322 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, modifier322);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i8222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i922222 = (i8222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
            int i1022222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -379203509, "C218@7664L618,233@8304L30,235@8356L212,242@8590L29,244@8641L178:FajrAlarmActivity.kt#jcb7bm");
            Modifier clip22222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(90)), RoundedCornerShapeKt.getCircleShape());
            m4487copywmQWz5c = Color.m4487copywmQWz5c(r86, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r86) : 0.2f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r86) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r86) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4282090230L)) : 0.0f);
            Modifier m231backgroundbw27NRU$default22222 = BackgroundKt.m231backgroundbw27NRU$default(clip22222, m4487copywmQWz5c, null, 2, null);
            Alignment center222222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(center222222, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash422222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default22222);
            Function0 constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            int i1122222 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422222));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422222), setCompositeKeyHash422222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
            int i122222222 = (i1122222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222222 = BoxScopeInstance.INSTANCE;
            int i132222222 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 278590744, "C225@7988L272:FajrAlarmActivity.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), "Fajr Alarm", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(50)), ColorKt.Color(4284524026L), $composer, 3504, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
            TextKt.m2816Text4IGK_g("صلاة الفجر", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
            TextKt.m2816Text4IGK_g("حان الآن موعد صلاة الفجر", (Modifier) null, ColorKt.Color(4287931320L), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Alignment.Horizontal centerHorizontally32222222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier22222222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy32222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally32222222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash52222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap52222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier52222222 = ComposedModifierKt.materializeModifier($composer, modifier22222222);
            Function0 constructor52222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i142222222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl4, columnMeasurePolicy32222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash52222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl4.getInserting()) {
            }
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash52222222));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash52222222), setCompositeKeyHash52222222);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i15222222222 = (i142222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3222222222 = ColumnScopeInstance.INSTANCE;
            int i16222222222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -877064433, "C253@8973L219,259@9213L29,260@9263L166:FajrAlarmActivity.kt#jcb7bm");
            TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$1($currentTimeStr$delegate), (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(48), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
            TextKt.m2816Text4IGK_g(FajrAlarmScreen$lambda$4($currentDateStr$delegate), (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier fillMaxWidth$default322222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally4222222222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy4222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4222222222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap6222222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier6222222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default322222222);
            Function0 constructor6222222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i17222222222 = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy4222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl5.getInserting()) {
            }
            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6222222222));
            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6222222222), setCompositeKeyHash6222222222);
            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6222222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i1822222222222 = (i17222222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance422222222222 = ColumnScopeInstance.INSTANCE;
            int i1922222222222 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2038231258, "C317@12120L1645,349@13787L30:FajrAlarmActivity.kt#jcb7bm");
            if (!FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate)) {
            }
            $composer.endReplaceGroup();
            Modifier fillMaxWidth$default222222222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal m610spacedBy0680j_422222222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22222222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash722222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap722222222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier722222222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222222222222);
            Function0 constructor722222222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i2022222222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy22222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash722222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl6.getInserting()) {
            }
            m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222222222));
            m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722222222222), setCompositeKeyHash722222222222);
            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722222222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i212222222222222 = (i2022222222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i222222222222222 = ((54 >> 6) & 112) | 6;
            RowScope rowScope2222222222222 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -407970655, "C323@12404L42,322@12350L623,338@13213L48,335@13041L702:FajrAlarmActivity.kt#jcb7bm");
            RoundedCornerShape m1024RoundedCornerShape0680j_42222222222222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20));
            Modifier m763height3ABfNKs2222222222222 = SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56));
            ComposerKt.sourceInformationMarkerStart($composer, 1926502683, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            rememberedValue = $composer.rememberedValue();
            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) rememberedValue, m763height3ABfNKs2222222222222, false, m1024RoundedCornerShape0680j_42222222222222, null, null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7671getLambda$648692605$app(), $composer, 805306374, 500);
            ButtonKt.Button($onDismiss, SizeKt.m763height3ABfNKs(RowScope.CC.weight$default(rowScope2222222222222, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7226constructorimpl(56)), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(20)), ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7670getLambda$591054335$app(), $composer, 805306368, 484);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), $composer, 6);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03df, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21(final Function1 $onSnooze, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        Function0 function02;
        Composer m3828constructorimpl;
        Composer composer;
        boolean changed;
        Composer composer2;
        boolean changed2;
        Composer composer3;
        boolean changed3;
        Composer composer4;
        ComposerKt.sourceInformation($composer, "C278@9988L2007:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-821954973, $changed, -1, "com.example.fajr.ui.FajrAlarmScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrAlarmActivity.kt:278)");
            }
            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                i = i2;
            } else {
                i = i2;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i4 = ((390 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -322005156, "C282@10211L287,288@10531L30,289@10594L1371:FajrAlarmActivity.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("اختر مدة الغفوة (Snooze):", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function02 = constructor2;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        composer = $composer;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i5 >> 6) & 14;
                            Composer composer5 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            int i7 = ((54 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer5, -639367030, "C294@10885L15,295@10966L48,293@10827L342,300@11264L16,301@11346L48,299@11206L344,306@11645L16,307@11727L48,305@11587L344:FajrAlarmActivity.kt#jcb7bm");
                            ComposerKt.sourceInformationMarkerStart(composer5, -20623976, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                            changed = composer5.changed($onSnooze);
                            Object rememberedValue = composer5.rememberedValue();
                            if (changed) {
                                composer2 = composer5;
                            } else {
                                composer2 = composer5;
                                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Composer composer6 = composer2;
                                    ButtonKt.Button((Function0) rememberedValue, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.getLambda$1436389849$app(), composer6, 805306368, 494);
                                    ComposerKt.sourceInformationMarkerStart(composer6, -20611847, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                    changed2 = composer6.changed($onSnooze);
                                    Object rememberedValue2 = composer6.rememberedValue();
                                    if (changed2) {
                                        composer3 = composer6;
                                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Composer composer7 = composer3;
                                            ButtonKt.Button((Function0) rememberedValue2, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7669getLambda$326624574$app(), composer7, 805306368, 494);
                                            ComposerKt.sourceInformationMarkerStart(composer7, -20599655, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                            changed3 = composer7.changed($onSnooze);
                                            Object rememberedValue3 = composer7.rememberedValue();
                                            if (!changed3) {
                                                composer4 = composer7;
                                            } else {
                                                composer4 = composer7;
                                            }
                                            rememberedValue3 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(Function1.this);
                                                }
                                            };
                                            composer7.updateRememberedValue(rememberedValue3);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Composer composer8 = composer4;
                                            ButtonKt.Button((Function0) rememberedValue3, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7668getLambda$1127691935$app(), composer8, 805306368, 494);
                                            ComposerKt.sourceInformationMarkerEnd(composer8);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            composer.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer);
                                            ComposerKt.sourceInformationMarkerEnd(composer);
                                            ComposerKt.sourceInformationMarkerEnd(composer);
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
                                    } else {
                                        composer3 = composer6;
                                    }
                                    rememberedValue2 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$16$lambda$15(Function1.this);
                                        }
                                    };
                                    composer6.updateRememberedValue(rememberedValue2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Composer composer72 = composer3;
                                    ButtonKt.Button((Function0) rememberedValue2, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7669getLambda$326624574$app(), composer72, 805306368, 494);
                                    ComposerKt.sourceInformationMarkerStart(composer72, -20599655, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                                    changed3 = composer72.changed($onSnooze);
                                    Object rememberedValue32 = composer72.rememberedValue();
                                    if (!changed3) {
                                    }
                                    rememberedValue32 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(Function1.this);
                                        }
                                    };
                                    composer72.updateRememberedValue(rememberedValue32);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    Composer composer82 = composer4;
                                    ButtonKt.Button((Function0) rememberedValue32, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7668getLambda$1127691935$app(), composer82, 805306368, 494);
                                    ComposerKt.sourceInformationMarkerEnd(composer82);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                            rememberedValue = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$14$lambda$13(Function1.this);
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Composer composer62 = composer2;
                            ButtonKt.Button((Function0) rememberedValue, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.getLambda$1436389849$app(), composer62, 805306368, 494);
                            ComposerKt.sourceInformationMarkerStart(composer62, -20611847, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                            changed2 = composer62.changed($onSnooze);
                            Object rememberedValue22 = composer62.rememberedValue();
                            if (changed2) {
                            }
                            rememberedValue22 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$16$lambda$15(Function1.this);
                                }
                            };
                            composer62.updateRememberedValue(rememberedValue22);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Composer composer722 = composer3;
                            ButtonKt.Button((Function0) rememberedValue22, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7669getLambda$326624574$app(), composer722, 805306368, 494);
                            ComposerKt.sourceInformationMarkerStart(composer722, -20599655, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                            changed3 = composer722.changed($onSnooze);
                            Object rememberedValue322 = composer722.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue322 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(Function1.this);
                                }
                            };
                            composer722.updateRememberedValue(rememberedValue322);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            Composer composer822 = composer4;
                            ButtonKt.Button((Function0) rememberedValue322, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7668getLambda$1127691935$app(), composer822, 805306368, 494);
                            ComposerKt.sourceInformationMarkerEnd(composer822);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    } else {
                        composer = $composer;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i62 = (i5 >> 6) & 14;
                    Composer composer52 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer52, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i72 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer52, -639367030, "C294@10885L15,295@10966L48,293@10827L342,300@11264L16,301@11346L48,299@11206L344,306@11645L16,307@11727L48,305@11587L344:FajrAlarmActivity.kt#jcb7bm");
                    ComposerKt.sourceInformationMarkerStart(composer52, -20623976, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                    changed = composer52.changed($onSnooze);
                    Object rememberedValue4 = composer52.rememberedValue();
                    if (changed) {
                    }
                    rememberedValue4 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$14$lambda$13(Function1.this);
                        }
                    };
                    composer52.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Composer composer622 = composer2;
                    ButtonKt.Button((Function0) rememberedValue4, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.getLambda$1436389849$app(), composer622, 805306368, 494);
                    ComposerKt.sourceInformationMarkerStart(composer622, -20611847, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                    changed2 = composer622.changed($onSnooze);
                    Object rememberedValue222 = composer622.rememberedValue();
                    if (changed2) {
                    }
                    rememberedValue222 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$16$lambda$15(Function1.this);
                        }
                    };
                    composer622.updateRememberedValue(rememberedValue222);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Composer composer7222 = composer3;
                    ButtonKt.Button((Function0) rememberedValue222, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7669getLambda$326624574$app(), composer7222, 805306368, 494);
                    ComposerKt.sourceInformationMarkerStart(composer7222, -20599655, "CC(remember):FajrAlarmActivity.kt#9igjgp");
                    changed3 = composer7222.changed($onSnooze);
                    Object rememberedValue3222 = composer7222.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3222 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(Function1.this);
                        }
                    };
                    composer7222.updateRememberedValue(rememberedValue3222);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    Composer composer8222 = composer4;
                    ButtonKt.Button((Function0) rememberedValue3222, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7668getLambda$1127691935$app(), composer8222, 805306368, 494);
                    ComposerKt.sourceInformationMarkerEnd(composer8222);
                    ComposerKt.sourceInformationMarkerEnd(composer52);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i42 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -322005156, "C282@10211L287,288@10531L30,289@10594L1371:FajrAlarmActivity.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("اختر مدة الغفوة (Snooze):", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceEvenly2 = Arrangement.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly2, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i622 = (i52 >> 6) & 14;
            Composer composer522 = composer;
            ComposerKt.sourceInformationMarkerStart(composer522, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i722 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer522, -639367030, "C294@10885L15,295@10966L48,293@10827L342,300@11264L16,301@11346L48,299@11206L344,306@11645L16,307@11727L48,305@11587L344:FajrAlarmActivity.kt#jcb7bm");
            ComposerKt.sourceInformationMarkerStart(composer522, -20623976, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            changed = composer522.changed($onSnooze);
            Object rememberedValue42 = composer522.rememberedValue();
            if (changed) {
            }
            rememberedValue42 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$14$lambda$13(Function1.this);
                }
            };
            composer522.updateRememberedValue(rememberedValue42);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Composer composer6222 = composer2;
            ButtonKt.Button((Function0) rememberedValue42, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.getLambda$1436389849$app(), composer6222, 805306368, 494);
            ComposerKt.sourceInformationMarkerStart(composer6222, -20611847, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            changed2 = composer6222.changed($onSnooze);
            Object rememberedValue2222 = composer6222.rememberedValue();
            if (changed2) {
            }
            rememberedValue2222 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$16$lambda$15(Function1.this);
                }
            };
            composer6222.updateRememberedValue(rememberedValue2222);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Composer composer72222 = composer3;
            ButtonKt.Button((Function0) rememberedValue2222, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7669getLambda$326624574$app(), composer72222, 805306368, 494);
            ComposerKt.sourceInformationMarkerStart(composer72222, -20599655, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            changed3 = composer72222.changed($onSnooze);
            Object rememberedValue32222 = composer72222.rememberedValue();
            if (!changed3) {
            }
            rememberedValue32222 = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrAlarmActivityKt.FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(Function1.this);
                }
            };
            composer72222.updateRememberedValue(rememberedValue32222);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            Composer composer82222 = composer4;
            ButtonKt.Button((Function0) rememberedValue32222, null, false, null, ButtonDefaults.INSTANCE.m1932buttonColorsro_MJ88(ColorKt.Color(4281549141L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$FajrAlarmActivityKt.INSTANCE.m7668getLambda$1127691935$app(), composer82222, 805306368, 494);
            ComposerKt.sourceInformationMarkerEnd(composer82222);
            ComposerKt.sourceInformationMarkerEnd(composer522);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$14$lambda$13(Function1 $onSnooze) {
        $onSnooze.invoke(5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$16$lambda$15(Function1 $onSnooze) {
        $onSnooze.invoke(10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(Function1 $onSnooze) {
        $onSnooze.invoke(15);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrAlarmScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(MutableState $showSnoozeOptions$delegate) {
        FajrAlarmScreen$lambda$8($showSnoozeOptions$delegate, !FajrAlarmScreen$lambda$7($showSnoozeOptions$delegate));
        return Unit.INSTANCE;
    }
}
