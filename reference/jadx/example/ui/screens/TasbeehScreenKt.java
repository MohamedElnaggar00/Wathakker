package com.example.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.RefreshKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.MainViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: TasbeehScreen.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aA\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"TasbeehScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onMenu", "Lkotlin/Function0;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TasbeehContent", "count", "", "onTap", "onReset", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "target"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TasbeehScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TasbeehContent$lambda$26(int i, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        TasbeehContent(i, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TasbeehScreen$lambda$3(MainViewModel mainViewModel, Function0 function0, int i, int i2, Composer composer, int i3) {
        TasbeehScreen(mainViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void TasbeehScreen(final MainViewModel viewModel, final Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer2 = $composer.startRestartGroup(-764919717);
        ComposerKt.sourceInformation($composer2, "C(TasbeehScreen)N(viewModel,onMenu)31@1351L29,32@1415L27,32@1444L23,32@1385L83:TasbeehScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (i2 != 0) {
                function0 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764919717, $dirty, -1, "com.example.ui.screens.TasbeehScreen (TasbeehScreen.kt:30)");
            }
            State count$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getTasbeehCount(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            int TasbeehScreen$lambda$0 = TasbeehScreen$lambda$0(count$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -648434250, "CC(remember):TasbeehScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (KFunction) new TasbeehScreenKt$TasbeehScreen$1$1(viewModel);
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function0 function02 = (Function0) ((KFunction) rememberedValue);
            ComposerKt.sourceInformationMarkerStart($composer2, -648433326, "CC(remember):TasbeehScreen.kt#9igjgp");
            boolean changedInstance2 = $composer2.changedInstance(viewModel);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (KFunction) new TasbeehScreenKt$TasbeehScreen$2$1(viewModel);
                $composer2.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function0<Unit> function03 = function0;
            TasbeehContent(TasbeehScreen$lambda$0, function03, function02, (Function0) ((KFunction) rememberedValue2), $composer2, $dirty & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function0 = function03;
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return TasbeehScreenKt.TasbeehScreen$lambda$3(MainViewModel.this, function0, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final int TasbeehScreen$lambda$0(State<Integer> state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TasbeehContent(final int count, final Function0<Unit> function0, final Function0<Unit> onTap, final Function0<Unit> onReset, Composer $composer, final int $changed) {
        Function0<Unit> function02;
        Composer $composer2;
        ColorScheme cs;
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(onReset, "onReset");
        Composer $composer3 = $composer.startRestartGroup(499476840);
        ComposerKt.sourceInformation($composer3, "C(TasbeehContent)N(count,onMenu,onTap,onReset)37@1607L11,38@1656L7,40@1720L34,42@1948L2408,42@1873L2483:TasbeehScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(count) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onTap) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onReset) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(499476840, $dirty2, -1, "com.example.ui.screens.TasbeehContent (TasbeehScreen.kt:36)");
            }
            ColorScheme cs2 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localHapticFeedback);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final HapticFeedback haptic = (HapticFeedback) consume;
            final List targets = CollectionsKt.listOf((Object[]) new Integer[]{33, 99, 100});
            ComposerKt.sourceInformationMarkerStart($composer3, -1039085942, "CC(remember):TasbeehScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(33);
                $composer3.updateRememberedValue(mutableIntStateOf);
                rememberedValue = mutableIntStateOf;
            }
            final MutableIntState target$delegate = (MutableIntState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            float progress = (count % TasbeehContent$lambda$5(target$delegate)) / TasbeehContent$lambda$5(target$delegate);
            if (count > 0 && count % TasbeehContent$lambda$5(target$delegate) == 0) {
                progress = 1.0f;
            }
            String str = count + " تسبيحة";
            ComposerKt.sourceInformationMarkerStart($composer3, -1039076272, "CC(remember):TasbeehScreen.kt#9igjgp");
            boolean changed = (($dirty2 & 7168) == 2048) | (($dirty2 & 896) == 256) | $composer3.changed(cs2) | $composer3.changedInstance(haptic) | $composer3.changed(progress) | (($dirty2 & 14) == 4);
            Object rememberedValue2 = $composer3.rememberedValue();
            if (changed) {
                cs = cs2;
            } else {
                cs = cs2;
                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OneUIKt.m7686OneUIScreengMrHQkA("السبحة", null, str, null, function02, null, null, 0.0f, (Function1) rememberedValue2, $composer3, (($dirty2 << 9) & 57344) | 6, 234);
                    $composer2 = $composer3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            final float progress2 = progress;
            final ColorScheme cs3 = cs;
            rememberedValue2 = new Function1() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24(ColorScheme.this, haptic, onTap, progress2, count, targets, target$delegate, onReset, (LazyListScope) obj);
                }
            };
            $composer3.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            OneUIKt.m7686OneUIScreengMrHQkA("السبحة", null, str, null, function02, null, null, 0.0f, (Function1) rememberedValue2, $composer3, (($dirty2 << 9) & 57344) | 6, 234);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TasbeehScreenKt.TasbeehContent$lambda$26(count, function0, onTap, onReset, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int TasbeehContent$lambda$5(MutableIntState $target$delegate) {
        return $target$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TasbeehContent$lambda$25$lambda$24(final ColorScheme $cs, final HapticFeedback $haptic, final Function0 $onTap, final float $progress, final int $count, final List $targets, final MutableIntState $target$delegate, final Function0 $onReset, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "ring", null, ComposableLambdaKt.composableLambdaInstance(2115343562, true, new Function3() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$16(ColorScheme.this, $haptic, $onTap, $progress, $count, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "targets", null, ComposableLambdaKt.composableLambdaInstance(1950916289, true, new Function3() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$21($targets, $target$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "reset", null, ComposableLambdaKt.composableLambdaInstance(1247053314, true, new Function3() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$23(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01d3, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0357 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TasbeehContent$lambda$25$lambda$24$lambda$16(ColorScheme $cs, final HapticFeedback $haptic, final Function0 $onTap, final float $progress, int $count, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Object rememberedValue;
        boolean changedInstance;
        Composer composer;
        Modifier m261clickableO2vRcR0;
        Composer composer2;
        Function0 function02;
        Composer m3828constructorimpl;
        Composer composer3;
        Composer composer4;
        boolean changed;
        Function0 function03;
        Composer m3828constructorimpl2;
        Composer composer5;
        Composer composer6;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C44@1991L1824:TasbeehScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115343562, $changed, -1, "com.example.ui.screens.TasbeehContent.<anonymous>.<anonymous>.<anonymous> (TasbeehScreen.kt:44)");
            }
            Modifier m734paddingqDBjuR0$default = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(12), 0.0f, 0.0f, 13, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1033392234, "C51@2343L39,53@2456L155,45@2096L1705:TasbeehScreen.kt#2thlc2");
                Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(268)), RoundedCornerShapeKt.getCircleShape()), $cs.getSurface(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, -243753193, "CC(remember):TasbeehScreen.kt#9igjgp");
                rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                    $composer.updateRememberedValue(MutableInteractionSource);
                    rememberedValue = MutableInteractionSource;
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -243749461, "CC(remember):TasbeehScreen.kt#9igjgp");
                changedInstance = $composer.changedInstance($haptic) | $composer.changed($onTap);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changedInstance) {
                    composer = $composer;
                } else {
                    composer = $composer;
                }
                rememberedValue2 = new Function0() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$10$lambda$9(HapticFeedback.this, $onTap);
                    }
                };
                $composer.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(composer);
                m261clickableO2vRcR0 = ClickableKt.m261clickableO2vRcR0(m231backgroundbw27NRU$default, mutableInteractionSource, null, (r14 & 4) != 0, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : null, (Function0) rememberedValue2);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m261clickableO2vRcR0);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function02 = constructor2;
                    composer2.useNode();
                } else {
                    function02 = constructor2;
                    composer2.createNode(function02);
                }
                m3828constructorimpl = Updater.m3828constructorimpl(composer2);
                Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl.getInserting()) {
                    composer3 = composer2;
                    if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i5 = (i4 >> 6) & 14;
                        composer4 = composer3;
                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        int i6 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer4, 1281063739, "C61@2846L561,61@2800L607,69@3428L355:TasbeehScreen.kt#2thlc2");
                        final long surfaceVariant = $cs.getSurfaceVariant();
                        final long oneUIActiveGreen = ColorKt.getOneUIActiveGreen();
                        Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(14));
                        ComposerKt.sourceInformationMarkerStart(composer4, -651408153, "CC(remember):TasbeehScreen.kt#9igjgp");
                        changed = composer4.changed(surfaceVariant) | composer4.changed(oneUIActiveGreen) | composer4.changed($progress);
                        Object rememberedValue3 = composer4.rememberedValue();
                        if (changed && rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            CanvasKt.Canvas(m730padding3ABfNKs, (Function1) rememberedValue3, composer4, 6);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifier);
                            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            int i7 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                            m3828constructorimpl2 = Updater.m3828constructorimpl(composer4);
                            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3828constructorimpl2.getInserting()) {
                                composer5 = composer4;
                                composer6 = composer4;
                            } else {
                                composer5 = composer4;
                                composer6 = composer4;
                                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i8 = (i7 >> 6) & 14;
                                    Composer composer7 = composer6;
                                    ComposerKt.sourceInformationMarkerStart(composer7, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    int i9 = ((384 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer7, 97517183, "C70@3558L10,70@3513L129,71@3710L10,71@3667L94:TasbeehScreen.kt#2thlc2");
                                    TextKt.m2816Text4IGK_g(String.valueOf($count), (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(72), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(80), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getDisplayLarge(), composer7, 3072, 6, 64498);
                                    TextKt.m2816Text4IGK_g("اضغط للتسبيح", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getBodyMedium(), composer7, 6, 0, 65530);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    composer6.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i82 = (i7 >> 6) & 14;
                            Composer composer72 = composer6;
                            ComposerKt.sourceInformationMarkerStart(composer72, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            int i92 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer72, 97517183, "C70@3558L10,70@3513L129,71@3710L10,71@3667L94:TasbeehScreen.kt#2thlc2");
                            TextKt.m2816Text4IGK_g(String.valueOf($count), (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(72), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(80), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer72, MaterialTheme.$stable).getDisplayLarge(), composer72, 3072, 6, 64498);
                            TextKt.m2816Text4IGK_g("اضغط للتسبيح", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer72, MaterialTheme.$stable).getBodyMedium(), composer72, 6, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd(composer72);
                            ComposerKt.sourceInformationMarkerEnd(composer72);
                            composer6.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                        Object obj = new Function1() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$14$lambda$12$lambda$11(surfaceVariant, oneUIActiveGreen, $progress, (DrawScope) obj2);
                            }
                        };
                        composer4.updateRememberedValue(obj);
                        rememberedValue3 = obj;
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        CanvasKt.Canvas(m730padding3ABfNKs, (Function1) rememberedValue3, composer4, 6);
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer4, modifier2);
                        Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                        int i72 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer4.getApplier() instanceof Applier)) {
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                        }
                        m3828constructorimpl2 = Updater.m3828constructorimpl(composer4);
                        Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3828constructorimpl2.getInserting()) {
                        }
                        m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                        m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        int i822 = (i72 >> 6) & 14;
                        Composer composer722 = composer6;
                        ComposerKt.sourceInformationMarkerStart(composer722, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        int i922 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer722, 97517183, "C70@3558L10,70@3513L129,71@3710L10,71@3667L94:TasbeehScreen.kt#2thlc2");
                        TextKt.m2816Text4IGK_g(String.valueOf($count), (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(72), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(80), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer722, MaterialTheme.$stable).getDisplayLarge(), composer722, 3072, 6, 64498);
                        TextKt.m2816Text4IGK_g("اضغط للتسبيح", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer722, MaterialTheme.$stable).getBodyMedium(), composer722, 6, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer722);
                        ComposerKt.sourceInformationMarkerEnd(composer722);
                        composer6.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                } else {
                    composer3 = composer2;
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                composer4 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i62 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, 1281063739, "C61@2846L561,61@2800L607,69@3428L355:TasbeehScreen.kt#2thlc2");
                final long surfaceVariant2 = $cs.getSurfaceVariant();
                final long oneUIActiveGreen2 = ColorKt.getOneUIActiveGreen();
                Modifier m730padding3ABfNKs2 = PaddingKt.m730padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(14));
                ComposerKt.sourceInformationMarkerStart(composer4, -651408153, "CC(remember):TasbeehScreen.kt#9igjgp");
                changed = composer4.changed(surfaceVariant2) | composer4.changed(oneUIActiveGreen2) | composer4.changed($progress);
                Object rememberedValue32 = composer4.rememberedValue();
                if (changed) {
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    CanvasKt.Canvas(m730padding3ABfNKs2, (Function1) rememberedValue32, composer4, 6);
                    Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier22 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap322 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer4, modifier22);
                    Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                    int i722 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer4.getApplier() instanceof Applier)) {
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl(composer4);
                    Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl2.getInserting()) {
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8222 = (i722 >> 6) & 14;
                    Composer composer7222 = composer6;
                    ComposerKt.sourceInformationMarkerStart(composer7222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                    int i9222 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer7222, 97517183, "C70@3558L10,70@3513L129,71@3710L10,71@3667L94:TasbeehScreen.kt#2thlc2");
                    TextKt.m2816Text4IGK_g(String.valueOf($count), (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(72), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(80), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7222, MaterialTheme.$stable).getDisplayLarge(), composer7222, 3072, 6, 64498);
                    TextKt.m2816Text4IGK_g("اضغط للتسبيح", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7222, MaterialTheme.$stable).getBodyMedium(), composer7222, 6, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer7222);
                    ComposerKt.sourceInformationMarkerEnd(composer7222);
                    composer6.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                Object obj2 = new Function1() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$14$lambda$12$lambda$11(surfaceVariant2, oneUIActiveGreen2, $progress, (DrawScope) obj22);
                    }
                };
                composer4.updateRememberedValue(obj2);
                rememberedValue32 = obj2;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                CanvasKt.Canvas(m730padding3ABfNKs2, (Function1) rememberedValue32, composer4, 6);
                Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap3222 = composer4.getCurrentCompositionLocalMap();
                Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(composer4, modifier222);
                Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                int i7222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer4.getApplier() instanceof Applier)) {
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl(composer4);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                int i82222 = (i7222 >> 6) & 14;
                Composer composer72222 = composer6;
                ComposerKt.sourceInformationMarkerStart(composer72222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                int i92222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer72222, 97517183, "C70@3558L10,70@3513L129,71@3710L10,71@3667L94:TasbeehScreen.kt#2thlc2");
                TextKt.m2816Text4IGK_g(String.valueOf($count), (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(72), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(80), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer72222, MaterialTheme.$stable).getDisplayLarge(), composer72222, 3072, 6, 64498);
                TextKt.m2816Text4IGK_g("اضغط للتسبيح", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer72222, MaterialTheme.$stable).getBodyMedium(), composer72222, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer72222);
                ComposerKt.sourceInformationMarkerEnd(composer72222);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            int i32 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1033392234, "C51@2343L39,53@2456L155,45@2096L1705:TasbeehScreen.kt#2thlc2");
            Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(268)), RoundedCornerShapeKt.getCircleShape()), $cs.getSurface(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -243753193, "CC(remember):TasbeehScreen.kt#9igjgp");
            rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -243749461, "CC(remember):TasbeehScreen.kt#9igjgp");
            changedInstance = $composer.changedInstance($haptic) | $composer.changed($onTap);
            Object rememberedValue22 = $composer.rememberedValue();
            if (changedInstance) {
            }
            rememberedValue22 = new Function0() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$10$lambda$9(HapticFeedback.this, $onTap);
                }
            };
            $composer.updateRememberedValue(rememberedValue22);
            ComposerKt.sourceInformationMarkerEnd(composer);
            m261clickableO2vRcR0 = ClickableKt.m261clickableO2vRcR0(m231backgroundbw27NRU$default2, mutableInteractionSource2, null, (r14 & 4) != 0, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : null, (Function0) rememberedValue22);
            Alignment center22 = Alignment.INSTANCE.getCenter();
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, m261clickableO2vRcR0);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl(composer2);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i522 = (i42 >> 6) & 14;
            composer4 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            int i622 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer4, 1281063739, "C61@2846L561,61@2800L607,69@3428L355:TasbeehScreen.kt#2thlc2");
            final long surfaceVariant22 = $cs.getSurfaceVariant();
            final long oneUIActiveGreen22 = ColorKt.getOneUIActiveGreen();
            Modifier m730padding3ABfNKs22 = PaddingKt.m730padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart(composer4, -651408153, "CC(remember):TasbeehScreen.kt#9igjgp");
            changed = composer4.changed(surfaceVariant22) | composer4.changed(oneUIActiveGreen22) | composer4.changed($progress);
            Object rememberedValue322 = composer4.rememberedValue();
            if (changed) {
            }
            Object obj22 = new Function1() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj222) {
                    return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$14$lambda$12$lambda$11(surfaceVariant22, oneUIActiveGreen22, $progress, (DrawScope) obj222);
                }
            };
            composer4.updateRememberedValue(obj22);
            rememberedValue322 = obj22;
            ComposerKt.sourceInformationMarkerEnd(composer4);
            CanvasKt.Canvas(m730padding3ABfNKs22, (Function1) rememberedValue322, composer4, 6);
            Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash32222 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap32222 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(composer4, modifier2222);
            Function0 constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
            int i72222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer4.getApplier() instanceof Applier)) {
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl(composer4);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32222), setCompositeKeyHash32222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
            int i822222 = (i72222 >> 6) & 14;
            Composer composer722222 = composer6;
            ComposerKt.sourceInformationMarkerStart(composer722222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
            int i922222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer722222, 97517183, "C70@3558L10,70@3513L129,71@3710L10,71@3667L94:TasbeehScreen.kt#2thlc2");
            TextKt.m2816Text4IGK_g(String.valueOf($count), (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(72), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(80), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer722222, MaterialTheme.$stable).getDisplayLarge(), composer722222, 3072, 6, 64498);
            TextKt.m2816Text4IGK_g("اضغط للتسبيح", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer722222, MaterialTheme.$stable).getBodyMedium(), composer722222, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer722222);
            ComposerKt.sourceInformationMarkerEnd(composer722222);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$10$lambda$9(HapticFeedback $haptic, Function0 $onTap) {
        $haptic.mo5267performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5284getTextHandleMove5zf0vsI());
        $onTap.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TasbeehContent$lambda$25$lambda$24$lambda$16$lambda$15$lambda$14$lambda$12$lambda$11(long $track, long $arc, float $progress, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float stroke = Canvas.mo370toPx0680j_4(Dp.m7226constructorimpl(12));
        float inset = stroke / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo4984getSizeNHjbRc() >> 32)) - stroke;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo4984getSizeNHjbRc() & 4294967295L)) - stroke;
        long m4304constructorimpl = Size.m4304constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        DrawScope.CC.m5054drawArcyD3GUKo$default(Canvas, $track, 0.0f, 360.0f, false, Offset.m4236constructorimpl((Float.floatToRawIntBits(inset) << 32) | (Float.floatToRawIntBits(inset) & 4294967295L)), m4304constructorimpl, 0.0f, new Stroke(stroke, 0.0f, StrokeCap.INSTANCE.m4869getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        DrawScope.CC.m5054drawArcyD3GUKo$default(Canvas, $arc, -90.0f, $progress * (-360.0f), false, Offset.m4236constructorimpl((Float.floatToRawIntBits(inset) << 32) | (Float.floatToRawIntBits(inset) & 4294967295L)), m4304constructorimpl, 0.0f, new Stroke(stroke, 0.0f, StrokeCap.INSTANCE.m4869getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TasbeehContent$lambda$25$lambda$24$lambda$21(List $targets, final MutableIntState $target$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Iterator it;
        Composer composer;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C77@3870L232:TasbeehScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1950916289, $changed, -1, "com.example.ui.screens.TasbeehContent.<anonymous>.<anonymous>.<anonymous> (TasbeehScreen.kt:77)");
            }
            Modifier m734paddingqDBjuR0$default = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(8), 0.0f, 0.0f, 13, null);
            Arrangement.Horizontal m611spacedByD5KLDUw = Arrangement.INSTANCE.m611spacedByD5KLDUw(Dp.m7226constructorimpl(8), Alignment.INSTANCE.getCenterHorizontally());
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m611spacedByD5KLDUw, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i3 = ((54 >> 6) & 112) | 6;
                Composer composer2 = $composer;
                ComposerKt.sourceInformationMarkerStart(composer2, 1119125977, "C:TasbeehScreen.kt#2thlc2");
                composer2.startReplaceGroup(174648418);
                ComposerKt.sourceInformation(composer2, "*78@4071L14,78@4042L44");
                List list = $targets;
                int i4 = 0;
                it = list.iterator();
                while (it.hasNext()) {
                    Iterable iterable = list;
                    final int intValue = ((Number) it.next()).intValue();
                    String valueOf = String.valueOf(intValue);
                    int i5 = i4;
                    boolean z = TasbeehContent$lambda$5($target$delegate) == intValue;
                    int i6 = i3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -232276341, "CC(remember):TasbeehScreen.kt#9igjgp");
                    boolean changed = composer2.changed(intValue);
                    Composer composer3 = composer2;
                    Object rememberedValue = composer3.rememberedValue();
                    if (changed) {
                        composer = composer2;
                    } else {
                        composer = composer2;
                        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            Composer composer4 = composer;
                            OneUIKt.m7681OneUIChipM8YrEPQ(valueOf, z, (Function0) rememberedValue, null, null, composer4, 0, 24);
                            composer2 = composer4;
                            list = iterable;
                            i4 = i5;
                            i3 = i6;
                        }
                    }
                    rememberedValue = new Function0() { // from class: com.example.ui.screens.TasbeehScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TasbeehScreenKt.TasbeehContent$lambda$25$lambda$24$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(intValue, $target$delegate);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    Composer composer42 = composer;
                    OneUIKt.m7681OneUIChipM8YrEPQ(valueOf, z, (Function0) rememberedValue, null, null, composer42, 0, 24);
                    composer2 = composer42;
                    list = iterable;
                    i4 = i5;
                    i3 = i6;
                }
                Composer composer5 = composer2;
                composer5.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer5);
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
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i32 = ((54 >> 6) & 112) | 6;
            Composer composer22 = $composer;
            ComposerKt.sourceInformationMarkerStart(composer22, 1119125977, "C:TasbeehScreen.kt#2thlc2");
            composer22.startReplaceGroup(174648418);
            ComposerKt.sourceInformation(composer22, "*78@4071L14,78@4042L44");
            List list2 = $targets;
            int i42 = 0;
            it = list2.iterator();
            while (it.hasNext()) {
            }
            Composer composer52 = composer22;
            composer52.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer52);
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
    public static final Unit TasbeehContent$lambda$25$lambda$24$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(int $t, MutableIntState $target$delegate) {
        $target$delegate.setIntValue($t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TasbeehContent$lambda$25$lambda$24$lambda$23(Function0 $onReset, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C82@4155L185:TasbeehScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1247053314, $changed, -1, "com.example.ui.screens.TasbeehContent.<anonymous>.<anonymous>.<anonymous> (TasbeehScreen.kt:82)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
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
                int i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 701893060, "C83@4239L87:TasbeehScreen.kt#2thlc2");
                OneUIKt.OneUIButton("تصفير العداد", $onReset, null, false, RefreshKt.getRefresh(Icons.Outlined.INSTANCE), true, $composer, 196614, 12);
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
            int i32 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 701893060, "C83@4239L87:TasbeehScreen.kt#2thlc2");
            OneUIKt.OneUIButton("تصفير العداد", $onReset, null, false, RefreshKt.getRefresh(Icons.Outlined.INSTANCE), true, $composer, 196614, 12);
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
}
