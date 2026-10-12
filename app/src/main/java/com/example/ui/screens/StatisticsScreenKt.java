package com.example.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.example.data.Dhikr;
import com.example.data.DhikrHistory;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.DhikrStats;
import com.example.ui.viewmodel.MainViewModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: StatisticsScreen.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aE\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\fH\u0002\u001a%\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0003¢\u0006\u0002\u0010 ¨\u0006!²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u0010\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u008a\u0084\u0002"}, d2 = {"StatisticsScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onBack", "Lkotlin/Function0;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StatsContent", "stats", "Lcom/example/ui/viewmodel/DhikrStats;", "titles", "", "", "", "history", "", "Lcom/example/data/DhikrHistory;", "(Lcom/example/ui/viewmodel/DhikrStats;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "dayCount", "n", "PeriodCell", "label", "value", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "donutColor", "Landroidx/compose/ui/graphics/Color;", "i", "(ILandroidx/compose/runtime/Composer;I)J", "Donut", "values", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "app", "allDhikr", "Lcom/example/data/Dhikr;", "allHistory"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StatisticsScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit Donut$lambda$34(List list, int i, Composer composer, int i2) {
        Donut(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PeriodCell$lambda$30(String str, int i, Modifier modifier, int i2, Composer composer, int i3) {
        PeriodCell(str, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatisticsScreen$lambda$5(MainViewModel mainViewModel, Function0 function0, int i, Composer composer, int i2) {
        StatisticsScreen(mainViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$28(DhikrStats dhikrStats, Map map, List list, Function0 function0, int i, Composer composer, int i2) {
        StatsContent(dhikrStats, map, list, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void StatisticsScreen(final MainViewModel viewModel, final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(-245001255);
        ComposerKt.sourceInformation($composer2, "C(StatisticsScreen)N(viewModel,onBack)34@1375L29,35@1444L29,36@1517L29,37@1564L63,38@1632L47:StatisticsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-245001255, $dirty2, -1, "com.example.ui.screens.StatisticsScreen (StatisticsScreen.kt:33)");
            }
            State stats$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getStats(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State allDhikr$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllDhikr(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State allHistory$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllHistory(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            Object StatisticsScreen$lambda$1 = StatisticsScreen$lambda$1(allDhikr$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 777004984, "CC(remember):StatisticsScreen.kt#9igjgp");
            boolean changed = $composer2.changed(StatisticsScreen$lambda$1);
            int i = 0;
            Object rememberedValue = $composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Iterable<Dhikr> StatisticsScreen$lambda$12 = StatisticsScreen$lambda$1(allDhikr$delegate);
                Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(StatisticsScreen$lambda$12, 10)), 16));
                for (Dhikr dhikr : StatisticsScreen$lambda$12) {
                    boolean z = changed;
                    Pair pair = TuplesKt.to(Integer.valueOf(dhikr.getId()), dhikr.getTitle());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    changed = z;
                    i = i;
                }
                $composer2.updateRememberedValue(linkedHashMap);
                rememberedValue = linkedHashMap;
            }
            Map titles = (Map) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            StatsContent(StatisticsScreen$lambda$0(stats$delegate), titles, StatisticsScreen$lambda$2(allHistory$delegate), onBack, $composer2, ($dirty2 << 6) & 7168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatisticsScreenKt.StatisticsScreen$lambda$5(MainViewModel.this, onBack, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final DhikrStats StatisticsScreen$lambda$0(State<DhikrStats> state) {
        return (DhikrStats) state.getValue();
    }

    private static final List<Dhikr> StatisticsScreen$lambda$1(State<? extends List<Dhikr>> state) {
        return (List) state.getValue();
    }

    private static final List<DhikrHistory> StatisticsScreen$lambda$2(State<? extends List<DhikrHistory>> state) {
        return (List) state.getValue();
    }

    public static final void StatsContent(final DhikrStats stats, final Map<Integer, String> titles, final List<DhikrHistory> history, final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(206996434);
        ComposerKt.sourceInformation($composer2, "C(StatsContent)N(stats,titles,history,onBack)43@1835L11,44@1956L4265,44@1851L4370:StatisticsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(stats) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(titles) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(history) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 2048 : 1024;
        }
        if ($composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206996434, $dirty, -1, "com.example.ui.screens.StatsContent (StatisticsScreen.kt:42)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            String str = OneUIKt.readsCount(stats.getTotalCount()) + " إجمالًا";
            ComposerKt.sourceInformationMarkerStart($composer2, 1355090459, "CC(remember):StatisticsScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(stats) | $composer2.changed(cs) | $composer2.changedInstance(titles) | $composer2.changedInstance(history);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return StatisticsScreenKt.StatsContent$lambda$27$lambda$26(history, stats, cs, titles, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIKt.m7686OneUIScreengMrHQkA("الإحصائيات", null, str, onBack, null, null, null, 0.0f, (Function1) rememberedValue, $composer2, ($dirty & 7168) | 6, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return StatisticsScreenKt.StatsContent$lambda$28(DhikrStats.this, titles, history, onBack, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26(final List $history, final DhikrStats $stats, final ColorScheme $cs, final Map $titles, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "donut", null, ComposableLambdaKt.composableLambdaInstance(1897587632, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$14(DhikrStats.this, $cs, $titles, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "periods-l", null, ComposableSingletons$StatisticsScreenKt.INSTANCE.getLambda$1332868377$app(), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "periods", null, ComposableLambdaKt.composableLambdaInstance(470564216, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$17(DhikrStats.this, $cs, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "streak", null, ComposableLambdaKt.composableLambdaInstance(-391739945, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$21(DhikrStats.this, $cs, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if (!$history.isEmpty()) {
            LazyListScope.CC.item$default(OneUIScreen, "hist-l", null, ComposableSingletons$StatisticsScreenKt.INSTANCE.getLambda$1126873205$app(), 2, null);
            LazyListScope.CC.item$default(OneUIScreen, "hist", null, ComposableLambdaKt.composableLambdaInstance(-1569858914, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$25($history, $titles, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$14(final DhikrStats $stats, final ColorScheme $cs, final Map $titles, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C46@2042L1878,46@2000L1920:StatisticsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897587632, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:46)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(20)), 0L, ComposableLambdaKt.rememberComposableLambda(1420373989, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$14$lambda$13(DhikrStats.this, $cs, $titles, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0288 A[LOOP:0: B:32:0x0282->B:34:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x054c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0382 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$14$lambda$13(DhikrStats $stats, ColorScheme $cs, Map $titles, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        Function0 function02;
        Composer m3828constructorimpl;
        Iterator it;
        Function0 function03;
        Composer m3828constructorimpl2;
        Function0 function04;
        Composer m3828constructorimpl3;
        Function0 function05;
        String str;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C47@2060L1846:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1420373989, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:47)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
            String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
            Composer m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl4.getInserting()) {
                i = 384;
            } else {
                i = 384;
                if (Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    String str3 = "C101@5126L9:Row.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i4 = ((i >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -2145039680, "C48@2134L508,55@2663L29,56@2713L1175:StatisticsScreen.kt#2thlc2");
                    Modifier m777size3ABfNKs = SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(120));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, m777size3ABfNKs);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                        function02 = constructor2;
                        $composer.useNode();
                    } else {
                        function02 = constructor2;
                        $composer.createNode(function02);
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i6 = (i5 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        int i7 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -42494840, "C49@2224L43,50@2292L328:StatisticsScreen.kt#2thlc2");
                        Iterable topReadDhikr = $stats.getTopReadDhikr();
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(topReadDhikr, 10));
                        it = topReadDhikr.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((Number) ((Pair) it.next()).getSecond()).intValue()));
                            topReadDhikr = topReadDhikr;
                        }
                        Donut((List) arrayList, $composer, 0);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier2);
                        Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i8 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                            function03 = constructor3;
                            $composer.useNode();
                        } else {
                            function03 = constructor3;
                            $composer.createNode(function03);
                        }
                        m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i9 = (i8 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i10 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 1615787177, "C51@2431L10,51@2381L98,52@2544L10,52@2508L86:StatisticsScreen.kt#2thlc2");
                            TextKt.m2816Text4IGK_g(String.valueOf($stats.getTodayCount()), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 0, 0, 65530);
                            TextKt.m2816Text4IGK_g("اليوم", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
                            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                            Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                            Arrangement.Vertical m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m610spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, weight$default);
                            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            int i11 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer.startReusableNode();
                            if ($composer.getInserting()) {
                                function04 = constructor4;
                                $composer.useNode();
                            } else {
                                function04 = constructor4;
                                $composer.createNode(function04);
                            }
                            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i12 = (i11 >> 6) & 14;
                                Composer composer = $composer;
                                int i13 = 0;
                                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                int i14 = ((48 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer, 1812421931, "C:StatisticsScreen.kt#2thlc2");
                                if ($stats.getTopReadDhikr().isEmpty()) {
                                    composer.startReplaceGroup(1809593955);
                                } else {
                                    composer.startReplaceGroup(1812427975);
                                    ComposerKt.sourceInformation(composer, "58@2930L10,58@2881L100");
                                    TextKt.m2816Text4IGK_g("لا توجد قراءات بعد", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
                                }
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(612662054);
                                ComposerKt.sourceInformation(composer, "*61@3122L718");
                                Iterable take = CollectionsKt.take($stats.getTopReadDhikr(), 3);
                                int i15 = 0;
                                int i16 = 0;
                                for (Object obj : take) {
                                    int i17 = i16 + 1;
                                    if (i16 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Pair pair = (Pair) obj;
                                    Iterable iterable = take;
                                    int intValue = ((Number) pair.component1()).intValue();
                                    int intValue2 = ((Number) pair.component2()).intValue();
                                    int i18 = i15;
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    Composer composer2 = composer;
                                    Modifier modifier3 = materializeModifier4;
                                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    Modifier modifier4 = Modifier.INSTANCE;
                                    int i19 = i13;
                                    int i20 = i14;
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifier4);
                                    Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i21 = ((((384 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, str2);
                                    if (!(composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        function05 = constructor5;
                                        composer.createNode(function05);
                                    } else {
                                        function05 = constructor5;
                                        composer.useNode();
                                    }
                                    String str4 = str2;
                                    Composer m3828constructorimpl5 = Updater.m3828constructorimpl(composer);
                                    Composer composer3 = composer;
                                    Updater.m3835setimpl(m3828constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3828constructorimpl5.getInserting() && Intrinsics.areEqual(m3828constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i22 = (i21 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str3);
                                        int i23 = ((384 >> 6) & 112) | 6;
                                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                        String str5 = str3;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 1493686281, "C62@3261L13,62@3208L68,63@3309L28,66@3496L10,64@3370L319,69@3759L10,69@3722L88:StatisticsScreen.kt#2thlc2");
                                        BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(9)), RoundedCornerShapeKt.getCircleShape()), donutColor(i16, composer3, 0), null, 2, null), composer3, 0);
                                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), composer3, 6);
                                        str = (String) $titles.get(Integer.valueOf(intValue));
                                        if (str != null) {
                                            str = "ذكر #" + intValue;
                                        }
                                        TextKt.m2816Text4IGK_g(str, RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 3120, 55288);
                                        TextKt.m2816Text4IGK_g(String.valueOf(intValue2), (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 65530);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        materializeModifier4 = modifier3;
                                        i16 = i17;
                                        take = iterable;
                                        i15 = i18;
                                        i13 = i19;
                                        i14 = i20;
                                        str2 = str4;
                                        str3 = str5;
                                        composer = composer2;
                                    }
                                    m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i222 = (i21 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str3);
                                    int i232 = ((384 >> 6) & 112) | 6;
                                    RowScope rowScope22 = RowScopeInstance.INSTANCE;
                                    String str52 = str3;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1493686281, "C62@3261L13,62@3208L68,63@3309L28,66@3496L10,64@3370L319,69@3759L10,69@3722L88:StatisticsScreen.kt#2thlc2");
                                    BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(9)), RoundedCornerShapeKt.getCircleShape()), donutColor(i16, composer3, 0), null, 2, null), composer3, 0);
                                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), composer3, 6);
                                    str = (String) $titles.get(Integer.valueOf(intValue));
                                    if (str != null) {
                                    }
                                    TextKt.m2816Text4IGK_g(str, RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7132getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 3120, 55288);
                                    TextKt.m2816Text4IGK_g(String.valueOf(intValue2), (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 65530);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    materializeModifier4 = modifier3;
                                    i16 = i17;
                                    take = iterable;
                                    i15 = i18;
                                    i13 = i19;
                                    i14 = i20;
                                    str2 = str4;
                                    str3 = str52;
                                    composer = composer2;
                                }
                                Composer composer4 = composer;
                                composer4.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer);
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
                            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            int i122 = (i11 >> 6) & 14;
                            Composer composer5 = $composer;
                            int i132 = 0;
                            ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                            int i142 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer5, 1812421931, "C:StatisticsScreen.kt#2thlc2");
                            if ($stats.getTopReadDhikr().isEmpty()) {
                            }
                            composer5.endReplaceGroup();
                            composer5.startReplaceGroup(612662054);
                            ComposerKt.sourceInformation(composer5, "*61@3122L718");
                            Iterable take2 = CollectionsKt.take($stats.getTopReadDhikr(), 3);
                            int i152 = 0;
                            int i162 = 0;
                            while (r53.hasNext()) {
                            }
                            Composer composer42 = composer5;
                            composer42.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer42);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
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
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        int i102 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1615787177, "C51@2431L10,51@2381L98,52@2544L10,52@2508L86:StatisticsScreen.kt#2thlc2");
                        TextKt.m2816Text4IGK_g(String.valueOf($stats.getTodayCount()), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 0, 0, 65530);
                        TextKt.m2816Text4IGK_g("اليوم", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                        Modifier weight$default2 = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                        Arrangement.Vertical m610spacedBy0680j_42 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m610spacedBy0680j_42, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, weight$default2);
                        Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        int i112 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting()) {
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1222 = (i112 >> 6) & 14;
                            Composer composer52 = $composer;
                            int i1322 = 0;
                            ComposerKt.sourceInformationMarkerStart(composer52, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                            int i1422 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer52, 1812421931, "C:StatisticsScreen.kt#2thlc2");
                            if ($stats.getTopReadDhikr().isEmpty()) {
                            }
                            composer52.endReplaceGroup();
                            composer52.startReplaceGroup(612662054);
                            ComposerKt.sourceInformation(composer52, "*61@3122L718");
                            Iterable take22 = CollectionsKt.take($stats.getTopReadDhikr(), 3);
                            int i1522 = 0;
                            int i1622 = 0;
                            while (r53.hasNext()) {
                            }
                            Composer composer422 = composer52;
                            composer422.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer422);
                            ComposerKt.sourceInformationMarkerEnd(composer52);
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
                        Composer composer522 = $composer;
                        int i13222 = 0;
                        ComposerKt.sourceInformationMarkerStart(composer522, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                        int i14222 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer522, 1812421931, "C:StatisticsScreen.kt#2thlc2");
                        if ($stats.getTopReadDhikr().isEmpty()) {
                        }
                        composer522.endReplaceGroup();
                        composer522.startReplaceGroup(612662054);
                        ComposerKt.sourceInformation(composer522, "*61@3122L718");
                        Iterable take222 = CollectionsKt.take($stats.getTopReadDhikr(), 3);
                        int i15222 = 0;
                        int i16222 = 0;
                        while (r53.hasNext()) {
                        }
                        Composer composer4222 = composer522;
                        composer4222.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer4222);
                        ComposerKt.sourceInformationMarkerEnd(composer522);
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
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i72 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -42494840, "C49@2224L43,50@2292L328:StatisticsScreen.kt#2thlc2");
                    Iterable topReadDhikr2 = $stats.getTopReadDhikr();
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(topReadDhikr2, 10));
                    it = topReadDhikr2.iterator();
                    while (it.hasNext()) {
                    }
                    Donut((List) arrayList2, $composer, 0);
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier22 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, modifier22);
                    Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    int i82 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl2.getInserting()) {
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        int i922 = (i82 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                        int i1022 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1615787177, "C51@2431L10,51@2381L98,52@2544L10,52@2508L86:StatisticsScreen.kt#2thlc2");
                        TextKt.m2816Text4IGK_g(String.valueOf($stats.getTodayCount()), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 0, 0, 65530);
                        TextKt.m2816Text4IGK_g("اليوم", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                        Modifier weight$default22 = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                        Arrangement.Vertical m610spacedBy0680j_422 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m610spacedBy0680j_422, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, weight$default22);
                        Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                        int i1122 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting()) {
                        }
                        m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422));
                        m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422), setCompositeKeyHash422);
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                        int i122222 = (i1122 >> 6) & 14;
                        Composer composer5222 = $composer;
                        int i132222 = 0;
                        ComposerKt.sourceInformationMarkerStart(composer5222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                        int i142222 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer5222, 1812421931, "C:StatisticsScreen.kt#2thlc2");
                        if ($stats.getTopReadDhikr().isEmpty()) {
                        }
                        composer5222.endReplaceGroup();
                        composer5222.startReplaceGroup(612662054);
                        ComposerKt.sourceInformation(composer5222, "*61@3122L718");
                        Iterable take2222 = CollectionsKt.take($stats.getTopReadDhikr(), 3);
                        int i152222 = 0;
                        int i162222 = 0;
                        while (r53.hasNext()) {
                        }
                        Composer composer42222 = composer5222;
                        composer42222.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer42222);
                        ComposerKt.sourceInformationMarkerEnd(composer5222);
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
                    ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
                    int i10222 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1615787177, "C51@2431L10,51@2381L98,52@2544L10,52@2508L86:StatisticsScreen.kt#2thlc2");
                    TextKt.m2816Text4IGK_g(String.valueOf($stats.getTodayCount()), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 0, 0, 65530);
                    TextKt.m2816Text4IGK_g("اليوم", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                    Modifier weight$default222 = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Arrangement.Vertical m610spacedBy0680j_4222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m610spacedBy0680j_4222, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, weight$default222);
                    Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i11222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4222));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4222), setCompositeKeyHash4222);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1222222 = (i11222 >> 6) & 14;
                    Composer composer52222 = $composer;
                    int i1322222 = 0;
                    ComposerKt.sourceInformationMarkerStart(composer52222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                    int i1422222 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer52222, 1812421931, "C:StatisticsScreen.kt#2thlc2");
                    if ($stats.getTopReadDhikr().isEmpty()) {
                    }
                    composer52222.endReplaceGroup();
                    composer52222.startReplaceGroup(612662054);
                    ComposerKt.sourceInformation(composer52222, "*61@3122L718");
                    Iterable take22222 = CollectionsKt.take($stats.getTopReadDhikr(), 3);
                    int i1522222 = 0;
                    int i1622222 = 0;
                    while (r53.hasNext()) {
                    }
                    Composer composer422222 = composer52222;
                    composer422222.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer422222);
                    ComposerKt.sourceInformationMarkerEnd(composer52222);
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
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            String str32 = "C101@5126L9:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i42 = ((i >> 6) & 112) | 6;
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -2145039680, "C48@2134L508,55@2663L29,56@2713L1175:StatisticsScreen.kt#2thlc2");
            Modifier m777size3ABfNKs2 = SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(120));
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, m777size3ABfNKs2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i622 = (i52 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i722 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -42494840, "C49@2224L43,50@2292L328:StatisticsScreen.kt#2thlc2");
                Iterable topReadDhikr22 = $stats.getTopReadDhikr();
                Collection arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(topReadDhikr22, 10));
                it = topReadDhikr22.iterator();
                while (it.hasNext()) {
                }
                Donut((List) arrayList22, $composer, 0);
                Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, modifier222);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i822 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i92222 = (i822 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
                int i102222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1615787177, "C51@2431L10,51@2381L98,52@2544L10,52@2508L86:StatisticsScreen.kt#2thlc2");
                TextKt.m2816Text4IGK_g(String.valueOf($stats.getTodayCount()), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 0, 0, 65530);
                TextKt.m2816Text4IGK_g("اليوم", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                Modifier weight$default2222 = RowScope.CC.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null);
                Arrangement.Vertical m610spacedBy0680j_42222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(m610spacedBy0680j_42222, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, weight$default2222);
                Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                int i112222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42222), setCompositeKeyHash42222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                int i12222222 = (i112222 >> 6) & 14;
                Composer composer522222 = $composer;
                int i13222222 = 0;
                ComposerKt.sourceInformationMarkerStart(composer522222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
                int i14222222 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer522222, 1812421931, "C:StatisticsScreen.kt#2thlc2");
                if ($stats.getTopReadDhikr().isEmpty()) {
                }
                composer522222.endReplaceGroup();
                composer522222.startReplaceGroup(612662054);
                ComposerKt.sourceInformation(composer522222, "*61@3122L718");
                Iterable take222222 = CollectionsKt.take($stats.getTopReadDhikr(), 3);
                int i15222222 = 0;
                int i16222222 = 0;
                while (r53.hasNext()) {
                }
                Composer composer4222222 = composer522222;
                composer4222222.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4222222);
                ComposerKt.sourceInformationMarkerEnd(composer522222);
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
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            int i7222 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -42494840, "C49@2224L43,50@2292L328:StatisticsScreen.kt#2thlc2");
            Iterable topReadDhikr222 = $stats.getTopReadDhikr();
            Collection arrayList222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(topReadDhikr222, 10));
            it = topReadDhikr222.iterator();
            while (it.hasNext()) {
            }
            Donut((List) arrayList222, $composer, 0);
            Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, modifier2222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i8222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i922222 = (i8222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance32222 = ColumnScopeInstance.INSTANCE;
            int i1022222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1615787177, "C51@2431L10,51@2381L98,52@2544L10,52@2508L86:StatisticsScreen.kt#2thlc2");
            TextKt.m2816Text4IGK_g(String.valueOf($stats.getTodayCount()), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 0, 0, 65530);
            TextKt.m2816Text4IGK_g("اليوم", (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
            Modifier weight$default22222 = RowScope.CC.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null);
            Arrangement.Vertical m610spacedBy0680j_422222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(m610spacedBy0680j_422222, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash422222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier($composer, weight$default22222);
            Function0 constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            int i1122222 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422222));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422222), setCompositeKeyHash422222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
            int i122222222 = (i1122222 >> 6) & 14;
            Composer composer5222222 = $composer;
            int i132222222 = 0;
            ComposerKt.sourceInformationMarkerStart(composer5222222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222222 = ColumnScopeInstance.INSTANCE;
            int i142222222 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer5222222, 1812421931, "C:StatisticsScreen.kt#2thlc2");
            if ($stats.getTopReadDhikr().isEmpty()) {
            }
            composer5222222.endReplaceGroup();
            composer5222222.startReplaceGroup(612662054);
            ComposerKt.sourceInformation(composer5222222, "*61@3122L718");
            Iterable take2222222 = CollectionsKt.take($stats.getTopReadDhikr(), 3);
            int i152222222 = 0;
            int i162222222 = 0;
            while (r53.hasNext()) {
            }
            Composer composer42222222 = composer5222222;
            composer42222222.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer42222222);
            ComposerKt.sourceInformationMarkerEnd(composer5222222);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$17(final DhikrStats $stats, final ColorScheme $cs, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C78@4053L582,78@4043L592:StatisticsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470564216, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:78)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(1429753965, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$17$lambda$16(DhikrStats.this, $cs, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$17$lambda$16(DhikrStats $stats, ColorScheme $cs, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C79@4071L550:StatisticsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1429753965, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:79)");
            }
            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(18), 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
                int i3 = ((6 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 1148586219, "C80@4148L58,81@4227L98,82@4346L59,83@4426L98,84@4545L58:StatisticsScreen.kt#2thlc2");
                PeriodCell("اليوم", $stats.getTodayCount(), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
                BoxKt.Box(rowScope.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), $cs.getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
                PeriodCell("الأسبوع", $stats.getWeekCount(), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
                BoxKt.Box(rowScope.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), $cs.getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
                PeriodCell("الشهر", $stats.getMonthCount(), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
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
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i32 = ((6 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1148586219, "C80@4148L58,81@4227L98,82@4346L59,83@4426L98,84@4545L58:StatisticsScreen.kt#2thlc2");
            PeriodCell("اليوم", $stats.getTodayCount(), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
            BoxKt.Box(rowScope2.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), $cs.getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
            PeriodCell("الأسبوع", $stats.getWeekCount(), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
            BoxKt.Box(rowScope2.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), $cs.getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
            PeriodCell("الشهر", $stats.getMonthCount(), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
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
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$21(final DhikrStats $stats, final ColorScheme $cs, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C89@4699L734,89@4689L744:StatisticsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-391739945, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:89)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(567449804, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$21$lambda$20(DhikrStats.this, $cs, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$21$lambda$20(final DhikrStats $stats, final ColorScheme $cs, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C93@4934L101,90@4717L336,95@5070L27,99@5305L96,96@5114L305:StatisticsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(567449804, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:90)");
            }
            OneUIKt.m7685OneUIRowRFMEUTM("الأيام المتتالية", null, "استمر في المحافظة على أذكارك اليومية", ComposableSingletons$StatisticsScreenKt.INSTANCE.m7712getLambda$224931044$app(), ComposableLambdaKt.rememberComposableLambda(1719040861, true, new Function2() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$21$lambda$20$lambda$18(DhikrStats.this, $cs, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0L, $composer, 28038, 98);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            OneUIKt.m7685OneUIRowRFMEUTM("إجمالي القراءات", null, "منذ بداية الاستخدام", ComposableSingletons$StatisticsScreenKt.INSTANCE.m7713getLambda$718958445$app(), ComposableLambdaKt.rememberComposableLambda(-872731500, true, new Function2() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$21$lambda$20$lambda$19(DhikrStats.this, $cs, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0L, $composer, 28038, 98);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$21$lambda$20$lambda$18(DhikrStats $stats, ColorScheme $cs, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C93@4991L10,93@4936L97:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1719040861, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:93)");
            }
            TextKt.m2816Text4IGK_g(dayCount($stats.getStreakDays()), (Modifier) null, ColorKt.getOneUICategoryViolet(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$21$lambda$20$lambda$19(DhikrStats $stats, ColorScheme $cs, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C99@5357L10,99@5307L92:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-872731500, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:99)");
            }
            TextKt.m2816Text4IGK_g(String.valueOf($stats.getTotalCount()), (Modifier) null, ColorKt.getOneUICategoryViolet(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$25(final List $history, final Map $titles, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C106@5605L586,106@5595L596:StatisticsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1569858914, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:106)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-401965229, true, new Function3() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StatisticsScreenKt.StatsContent$lambda$27$lambda$26$lambda$25$lambda$24($history, $titles, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsContent$lambda$27$lambda$26$lambda$25$lambda$24(List $history, Map $titles, ColumnScope OneUICard, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation(composer, "C*109@5767L157,112@5949L202:StatisticsScreen.kt#2thlc2");
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-401965229, $changed, -1, "com.example.ui.screens.StatsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsScreen.kt:107)");
            }
            int i = 0;
            for (Object obj : CollectionsKt.take($history, 10)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DhikrHistory dhikrHistory = (DhikrHistory) obj;
                if (i > 0) {
                    composer.startReplaceGroup(-598085251);
                    ComposerKt.sourceInformation(composer, "108@5704L27");
                    OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), composer, 6, 0);
                } else {
                    composer.startReplaceGroup(-1366433792);
                }
                composer.endReplaceGroup();
                long timestamp = dhikrHistory.getTimestamp();
                ComposerKt.sourceInformationMarkerStart(composer, -598083105, "CC(remember):StatisticsScreen.kt#9igjgp");
                boolean changed = composer.changed(timestamp);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object format = new SimpleDateFormat("d MMM yyyy  hh:mm a", new Locale("ar")).format(new Date(dhikrHistory.getTimestamp()));
                    $composer.updateRememberedValue(format);
                    rememberedValue = format;
                }
                String str = (String) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                String str2 = (String) $titles.get(Integer.valueOf(dhikrHistory.getDhikrId()));
                if (str2 == null) {
                    str2 = "ذكر #" + dhikrHistory.getDhikrId();
                }
                OneUIKt.m7685OneUIRowRFMEUTM(str2, null, str, ComposableSingletons$StatisticsScreenKt.INSTANCE.m7711getLambda$1733817710$app(), null, null, 0L, composer, 3072, 114);
                composer = $composer;
                i = i2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final String dayCount(int n) {
        StringBuilder append;
        String str;
        if (n == 0) {
            return "لا أيام";
        }
        if (n == 1) {
            return "يوم واحد";
        }
        if (n == 2) {
            return "يومان";
        }
        if (3 <= n && n < 11) {
            append = new StringBuilder().append(n);
            str = " أيام";
        } else {
            append = new StringBuilder().append(n);
            str = " يومًا";
        }
        return append.append(str).toString();
    }

    private static final void PeriodCell(String label, final int value, final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2;
        final String str = label;
        Composer $composer3 = $composer.startRestartGroup(-1288119891);
        ComposerKt.sourceInformation($composer3, "C(PeriodCell)N(label,value,modifier)127@6447L309:StatisticsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(str) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(modifier) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1288119891, $dirty, -1, "com.example.ui.screens.PeriodCell (StatisticsScreen.kt:126)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            int i = (($dirty >> 6) & 14) | 384;
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer3, ((i >> 3) & 14) | ((i >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((i << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting() || !Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -617128608, "C128@6563L10,128@6612L11,128@6526L108,129@6677L10,129@6721L11,129@6643L107:StatisticsScreen.kt#2thlc2");
            TextKt.m2816Text4IGK_g(String.valueOf(value), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getHeadlineMedium(), $composer3, 0, 0, 65530);
            $composer2 = $composer3;
            str = label;
            TextKt.m2816Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodySmall(), $composer3, $dirty & 14, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatisticsScreenKt.PeriodCell$lambda$30(str, value, modifier, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long donutColor(int i, Composer $composer, int $changed) {
        long j;
        int i2;
        Object obj;
        float f;
        ComposerKt.sourceInformationMarkerStart($composer, 156533192, "C(donutColor)N(i)135@6838L11:StatisticsScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(156533192, $changed, -1, "com.example.ui.screens.donutColor (StatisticsScreen.kt:134)");
        }
        MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable);
        long p = ColorKt.getOneUICategoryViolet();
        switch (i) {
            case 0:
                j = p;
                break;
            case 1:
                i2 = 14;
                obj = null;
                f = 0.6f;
                j = Color.m4487copywmQWz5c(p, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(p) : f, (r12 & 2) != 0 ? Color.m4495getRedimpl(p) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(p) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(p) : 0.0f);
                break;
            default:
                i2 = 14;
                obj = null;
                f = 0.32f;
                j = Color.m4487copywmQWz5c(p, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(p) : f, (r12 & 2) != 0 ? Color.m4495getRedimpl(p) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(p) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(p) : 0.0f);
                break;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return j;
    }

    private static final void Donut(final List<Integer> list, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-349556525);
        ComposerKt.sourceInformation($composer2, "C(Donut)N(values)141@7031L11,142@7082L13,142@7097L13,142@7112L13,143@7162L641,143@7131L672:StatisticsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349556525, $dirty, -1, "com.example.ui.screens.Donut (StatisticsScreen.kt:140)");
            }
            final long track = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant();
            final List colors = CollectionsKt.listOf((Object[]) new Color[]{Color.m4479boximpl(donutColor(0, $composer2, 6)), Color.m4479boximpl(donutColor(1, $composer2, 6)), Color.m4479boximpl(donutColor(2, $composer2, 6))});
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -916364012, "CC(remember):StatisticsScreen.kt#9igjgp");
            boolean changed = $composer2.changed(track) | $composer2.changedInstance(list) | $composer2.changed(colors);
            Object rememberedValue = $composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return StatisticsScreenKt.Donut$lambda$33$lambda$32(track, list, colors, (DrawScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, $composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.StatisticsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return StatisticsScreenKt.Donut$lambda$34(list, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit Donut$lambda$33$lambda$32(long $track, List $values, List $colors, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float stroke = Canvas.mo370toPx0680j_4(Dp.m7226constructorimpl(12));
        float d = Size.m4312getMinDimensionimpl(Canvas.mo4984getSizeNHjbRc()) - stroke;
        float intBitsToFloat = (Float.intBitsToFloat((int) (Canvas.mo4984getSizeNHjbRc() >> 32)) - d) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (Canvas.mo4984getSizeNHjbRc() & 4294967295L)) - d) / 2.0f;
        long tl = Offset.m4236constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        long sz = Size.m4304constructorimpl((Float.floatToRawIntBits(d) << 32) | (4294967295L & Float.floatToRawIntBits(d)));
        DrawScope.CC.m5054drawArcyD3GUKo$default(Canvas, $track, 0.0f, 360.0f, false, tl, sz, 0.0f, new Stroke(stroke, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
        long tl2 = tl;
        long sz2 = sz;
        float total = CollectionsKt.sumOfInt($values);
        if (total > 0.0f) {
            int i = 0;
            float start = -90.0f;
            for (Object obj : CollectionsKt.take($values, 3)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                float intValue = (((Number) obj).intValue() / total) * 360.0f;
                long m4499unboximpl = ((Color) $colors.get(i)).m4499unboximpl();
                float coerceAtLeast = RangesKt.coerceAtLeast(intValue - 3.0f, 1.0f);
                Stroke stroke2 = new Stroke(stroke, 0.0f, StrokeCap.INSTANCE.m4869getRoundKaPHkGw(), 0, null, 26, null);
                long sz3 = sz2;
                float start2 = start;
                long tl3 = tl2;
                DrawScope.CC.m5054drawArcyD3GUKo$default(Canvas, m4499unboximpl, start2, coerceAtLeast, false, tl3, sz3, 0.0f, stroke2, null, 0, 832, null);
                start = start2 + intValue;
                tl2 = tl3;
                sz2 = sz3;
                i = i2;
                total = total;
            }
        }
        return Unit.INSTANCE;
    }
}
