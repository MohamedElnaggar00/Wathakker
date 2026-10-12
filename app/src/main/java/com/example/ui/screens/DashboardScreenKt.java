package com.example.ui.screens;

import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.NotificationsActiveKt;
import androidx.compose.material.icons.outlined.CheckKt;
import androidx.compose.material.icons.outlined.KeyboardArrowLeftKt;
import androidx.compose.material3.ColorScheme;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.example.data.Dhikr;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.DhikrStats;
import com.example.ui.viewmodel.MainViewModel;
import com.example.utils.DateTimeUtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: DashboardScreen.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a.\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a;\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001ak\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u001a\u001a%\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\"\u001a#\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0007¢\u0006\u0002\u0010&¨\u0006'²\u0006\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"computeInstances", "Lkotlin/Pair;", "Lcom/example/ui/screens/DhikrInstance;", "enabledDhikr", "", "Lcom/example/data/Dhikr;", "now", "Ljava/util/Calendar;", "DashboardScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onNavigate", "Lkotlin/Function1;", "", "onMenu", "Lkotlin/Function0;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "HomeContent", "current", "next", "activeCount", "", "stats", "Lcom/example/ui/viewmodel/DhikrStats;", "onMarkRead", "(Lcom/example/ui/screens/DhikrInstance;Lcom/example/ui/screens/DhikrInstance;ILcom/example/ui/viewmodel/DhikrStats;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SummaryCell", "label", "value", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ChevronIcon", "(Landroidx/compose/runtime/Composer;I)V", "DhikrHighlightCard", "instance", "onMarkAsRead", "(Lcom/example/ui/screens/DhikrInstance;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DashboardScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChevronIcon$lambda$30(int i, Composer composer, int i2) {
        ChevronIcon(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DashboardScreen$lambda$7(MainViewModel mainViewModel, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        DashboardScreen(mainViewModel, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrHighlightCard$lambda$34(DhikrInstance dhikrInstance, Function0 function0, int i, Composer composer, int i2) {
        DhikrHighlightCard(dhikrInstance, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$27(DhikrInstance dhikrInstance, DhikrInstance dhikrInstance2, int i, DhikrStats dhikrStats, Function1 function1, Function1 function12, Function0 function0, int i2, int i3, Composer composer, int i4) {
        HomeContent(dhikrInstance, dhikrInstance2, i, dhikrStats, function1, function12, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SummaryCell$lambda$29(String str, String str2, Modifier modifier, int i, Composer composer, int i2) {
        SummaryCell(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Pair computeInstances$default(List list, Calendar calendar, int i, Object obj) {
        if ((i & 2) != 0) {
            calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        }
        return computeInstances(list, calendar);
    }

    public static final Pair<DhikrInstance, DhikrInstance> computeInstances(List<Dhikr> enabledDhikr, Calendar now) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(enabledDhikr, "enabledDhikr");
        Intrinsics.checkNotNullParameter(now, "now");
        int currentHour = now.get(11);
        int currentMinute = now.get(12);
        DhikrInstance next = null;
        DhikrInstance current = null;
        if (!enabledDhikr.isEmpty()) {
            List instances = new ArrayList();
            Iterator<Dhikr> it = enabledDhikr.iterator();
            while (true) {
                int i = 1;
                int m = 0;
                if (!it.hasNext()) {
                    break;
                }
                Dhikr dhikr = it.next();
                for (String timeStr : dhikr.getReminderTimes()) {
                    List parts = StringsKt.split$default((CharSequence) timeStr, new String[]{":"}, false, 0, 6, (Object) null);
                    if (parts.size() == 2 && (intOrNull = StringsKt.toIntOrNull((String) parts.get(m))) != null) {
                        int h = intOrNull.intValue();
                        Integer intOrNull2 = StringsKt.toIntOrNull((String) parts.get(i));
                        if (intOrNull2 != null) {
                            int m2 = intOrNull2.intValue();
                            instances.add(new DhikrInstance(dhikr, h, m2));
                            i = i;
                            m = m;
                        }
                    }
                }
            }
            List<DhikrInstance> sorted = CollectionsKt.sortedWith(instances, ComparisonsKt.compareBy(new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DashboardScreenKt.computeInstances$lambda$0((DhikrInstance) obj);
                }
            }, new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DashboardScreenKt.computeInstances$lambda$1((DhikrInstance) obj);
                }
            }));
            for (DhikrInstance instance : sorted) {
                if (instance.getHour() > currentHour || (instance.getHour() == currentHour && instance.getMinute() > currentMinute)) {
                    next = instance;
                    break;
                }
                current = instance;
            }
            if (next == null && !sorted.isEmpty()) {
                next = (DhikrInstance) CollectionsKt.first(sorted);
            }
            if (current == null && !sorted.isEmpty()) {
                current = (DhikrInstance) CollectionsKt.last(sorted);
            }
            if (Intrinsics.areEqual(next, current)) {
                next = null;
            }
        }
        return new Pair<>(current, next);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Comparable computeInstances$lambda$0(DhikrInstance it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getHour());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Comparable computeInstances$lambda$1(DhikrInstance it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getMinute());
    }

    public static final void DashboardScreen(final MainViewModel viewModel, final Function1<? super String, Unit> onNavigate, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        final Function0 onMenu;
        DhikrStats dhikrStats;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onNavigate, "onNavigate");
        Composer $composer2 = $composer.startRestartGroup(-607388952);
        ComposerKt.sourceInformation($composer2, "C(DashboardScreen)N(viewModel,onNavigate,onMenu)60@2550L29,61@2613L29,62@2669L57,68@2877L28,63@2731L238:DashboardScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onNavigate) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            function02 = function0;
        } else if (($changed & 384) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            onMenu = function02;
        } else {
            Function0 onMenu2 = i2 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-607388952, $dirty2, -1, "com.example.ui.screens.DashboardScreen (DashboardScreen.kt:59)");
            }
            State enabledDhikr$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getEnabledDhikr(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State stats$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getStats(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            List<Dhikr> DashboardScreen$lambda$2 = DashboardScreen$lambda$2(enabledDhikr$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 414778593, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changed = $composer2.changed(DashboardScreen$lambda$2);
            Object rememberedValue = $composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object computeInstances$default = computeInstances$default(DashboardScreen$lambda$2(enabledDhikr$delegate), null, 2, null);
                $composer2.updateRememberedValue(computeInstances$default);
                rememberedValue = computeInstances$default;
            }
            Pair pair = (Pair) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            DhikrInstance current = (DhikrInstance) pair.component1();
            DhikrInstance next = (DhikrInstance) pair.component2();
            int size = DashboardScreen$lambda$2(enabledDhikr$delegate).size();
            DhikrStats DashboardScreen$lambda$3 = DashboardScreen$lambda$3(stats$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 414785220, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                dhikrStats = DashboardScreen$lambda$3;
                Object obj = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DashboardScreenKt.DashboardScreen$lambda$6$lambda$5(MainViewModel.this, (Dhikr) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue2 = obj;
            } else {
                dhikrStats = DashboardScreen$lambda$3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function0 onMenu3 = onMenu2;
            HomeContent(current, next, size, dhikrStats, (Function1) rememberedValue2, onNavigate, onMenu3, $composer2, (($dirty2 << 12) & 458752) | (3670016 & ($dirty2 << 12)), 0);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onMenu = onMenu3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DashboardScreenKt.DashboardScreen$lambda$7(MainViewModel.this, onNavigate, onMenu, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<Dhikr> DashboardScreen$lambda$2(State<? extends List<Dhikr>> state) {
        return (List) state.getValue();
    }

    private static final DhikrStats DashboardScreen$lambda$3(State<DhikrStats> state) {
        return (DhikrStats) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DashboardScreen$lambda$6$lambda$5(MainViewModel $viewModel, Dhikr it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.markAsRead(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeContent(final DhikrInstance current, final DhikrInstance next, final int activeCount, final DhikrStats stats, final Function1<? super Dhikr, Unit> onMarkRead, final Function1<? super String, Unit> onNavigate, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 onMenu;
        Composer $composer2;
        final Function0 onMenu2;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(onMarkRead, "onMarkRead");
        Intrinsics.checkNotNullParameter(onNavigate, "onNavigate");
        Composer $composer3 = $composer.startRestartGroup(1775098082);
        ComposerKt.sourceInformation($composer3, "C(HomeContent)N(current,next,activeCount,stats,onMarkRead,onNavigate,onMenu)88@3426L2540,84@3210L2756:DashboardScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(current) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(next) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(activeCount) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(stats) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onMarkRead) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onNavigate) ? 131072 : 65536;
        }
        int i3 = i & 64;
        if (i3 != 0) {
            $dirty |= 1572864;
            onMenu = function0;
        } else if ((1572864 & $changed) == 0) {
            onMenu = function0;
            $dirty |= $composer3.changedInstance(onMenu) ? 1048576 : 524288;
        } else {
            onMenu = function0;
        }
        if (!$composer3.shouldExecute((599187 & $dirty) != 599186, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onMenu2 = onMenu;
        } else {
            if (i3 != 0) {
                onMenu = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1775098082, $dirty, -1, "com.example.ui.screens.HomeContent (DashboardScreen.kt:83)");
            }
            if (activeCount == 0) {
                str = "لا توجد تنبيهات مفعلة";
            } else {
                str = activeCount + " " + (3 <= activeCount && activeCount < 11 ? "تنبيهات" : "تنبيهًا") + " مفعلة";
            }
            String str2 = str;
            ComposerKt.sourceInformationMarkerStart($composer3, 767257326, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changedInstance = $composer3.changedInstance(stats) | $composer3.changedInstance(current) | (($dirty & 57344) == 16384) | $composer3.changedInstance(next) | ((458752 & $dirty) == 131072);
            Object rememberedValue = $composer3.rememberedValue();
            if (changedInstance) {
                i2 = 57344;
            } else {
                i2 = 57344;
            }
            rememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DashboardScreenKt.HomeContent$lambda$26$lambda$25(DhikrInstance.this, next, stats, onMarkRead, onNavigate, (LazyListScope) obj);
                }
            };
            $composer3.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            OneUIKt.m7686OneUIScreengMrHQkA("وَذكِّر", null, str2, null, onMenu, null, null, 0.0f, (Function1) rememberedValue, $composer2, (($dirty >> 6) & i2) | 6, 234);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onMenu2 = onMenu;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.HomeContent$lambda$27(DhikrInstance.this, next, activeCount, stats, onMarkRead, onNavigate, onMenu2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25(final DhikrInstance $current, final DhikrInstance $next, final DhikrStats $stats, final Function1 $onMarkRead, final Function1 $onNavigate, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "summary", null, ComposableLambdaKt.composableLambdaInstance(704932548, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$10(DhikrStats.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if ($current != null) {
            LazyListScope.CC.item$default(OneUIScreen, "cur-l", null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$901052319$app(), 2, null);
            LazyListScope.CC.item$default(OneUIScreen, "cur", null, ComposableLambdaKt.composableLambdaInstance(1041602454, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$13(DhikrInstance.this, $onMarkRead, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        if ($next != null) {
            LazyListScope.CC.item$default(OneUIScreen, "next-l", null, ComposableSingletons$DashboardScreenKt.INSTANCE.m7693getLambda$1135082090$app(), 2, null);
            LazyListScope.CC.item$default(OneUIScreen, "next", null, ComposableLambdaKt.composableLambdaInstance(789611469, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$16(DhikrInstance.this, $onMarkRead, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        if ($current == null && $next == null) {
            LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableSingletons$DashboardScreenKt.INSTANCE.m7695getLambda$1703054313$app(), 3, null);
        }
        LazyListScope.CC.item$default(OneUIScreen, "short-l", null, ComposableSingletons$DashboardScreenKt.INSTANCE.m7697getLambda$627620997$app(), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "short", null, ComposableLambdaKt.composableLambdaInstance(-1195593220, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$24(Function1.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$10(final DhikrStats $stats, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C90@3482L675,90@3472L685:DashboardScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(704932548, $changed, -1, "com.example.ui.screens.HomeContent.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:90)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-1309696465, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$10$lambda$9(DhikrStats.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$10$lambda$9(DhikrStats $stats, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C91@3500L643:DashboardScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1309696465, $changed, -1, "com.example.ui.screens.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:91)");
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
                ComposerKt.sourceInformationMarkerStart($composer, -1187401868, "C92@3577L70,93@3734L11,93@3668L121,94@3810L75,95@3972L11,95@3906L121,96@4048L77:DashboardScreen.kt#2thlc2");
                SummaryCell("اليوم", String.valueOf($stats.getTodayCount()), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
                BoxKt.Box(rowScope.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
                SummaryCell("هذا الأسبوع", String.valueOf($stats.getWeekCount()), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
                BoxKt.Box(rowScope.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
                SummaryCell("أيام متتالية", String.valueOf($stats.getStreakDays()), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
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
            ComposerKt.sourceInformationMarkerStart($composer, -1187401868, "C92@3577L70,93@3734L11,93@3668L121,94@3810L75,95@3972L11,95@3906L121,96@4048L77:DashboardScreen.kt#2thlc2");
            SummaryCell("اليوم", String.valueOf($stats.getTodayCount()), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
            BoxKt.Box(rowScope2.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
            SummaryCell("هذا الأسبوع", String.valueOf($stats.getWeekCount()), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
            BoxKt.Box(rowScope2.align(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.m763height3ABfNKs(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), Dp.m7226constructorimpl(44)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline(), null, 2, null), Alignment.INSTANCE.getCenterVertically()), $composer, 0);
            SummaryCell("أيام متتالية", String.valueOf($stats.getStreakDays()), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 6);
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
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$13(final DhikrInstance $current, final Function1 $onMarkRead, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C102@4341L29,102@4313L57:DashboardScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1041602454, $changed, -1, "com.example.ui.screens.HomeContent.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:102)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 252579315, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changed = $composer.changed($onMarkRead) | $composer.changedInstance($current);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$13$lambda$12$lambda$11(Function1.this, $current);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            DhikrHighlightCard($current, (Function0) rememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$13$lambda$12$lambda$11(Function1 $onMarkRead, DhikrInstance $current) {
        $onMarkRead.invoke($current.getDhikr());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$16(final DhikrInstance $next, final Function1 $onMarkRead, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C106@4537L26,106@4512L51:DashboardScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(789611469, $changed, -1, "com.example.ui.screens.HomeContent.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:106)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1392588793, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changed = $composer.changed($onMarkRead) | $composer.changedInstance($next);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$16$lambda$15$lambda$14(Function1.this, $next);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            DhikrHighlightCard($next, (Function0) rememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$16$lambda$15$lambda$14(Function1 $onMarkRead, DhikrInstance $next) {
        $onMarkRead.invoke($next.getDhikr());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$24(final Function1 $onNavigate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C113@4863L1087,113@4853L1097:DashboardScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1195593220, $changed, -1, "com.example.ui.screens.HomeContent.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:113)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-223824217, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$24$lambda$23(Function1.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$24$lambda$23(final Function1 $onNavigate, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C115@4957L25,114@4881L299,119@5197L27,121@5338L22,120@5241L330,125@5588L27,127@5715L27,126@5632L304:DashboardScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-223824217, $changed, -1, "com.example.ui.screens.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:114)");
            }
            Function2<Composer, Integer, Unit> lambda$1093490263$app = ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1093490263$app();
            Function2<Composer, Integer, Unit> m7696getLambda$1969345738$app = ComposableSingletons$DashboardScreenKt.INSTANCE.m7696getLambda$1969345738$app();
            ComposerKt.sourceInformationMarkerStart($composer, -346704704, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changed = $composer.changed($onNavigate);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$24$lambda$23$lambda$18$lambda$17(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.m7685OneUIRowRFMEUTM("السبحة", null, "عداد التسبيح", lambda$1093490263$app, m7696getLambda$1969345738$app, (Function0) rememberedValue, 0L, $composer, 28038, 66);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            Function2<Composer, Integer, Unit> lambda$159640256$app = ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$159640256$app();
            Function2<Composer, Integer, Unit> m7694getLambda$1173158945$app = ComposableSingletons$DashboardScreenKt.INSTANCE.m7694getLambda$1173158945$app();
            ComposerKt.sourceInformationMarkerStart($composer, -346692515, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changed2 = $composer.changed($onNavigate);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$24$lambda$23$lambda$20$lambda$19(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.m7685OneUIRowRFMEUTM("حصن المسلم", null, "أذكار وأدعية من الكتاب والسنة", lambda$159640256$app, m7694getLambda$1173158945$app, (Function0) rememberedValue2, 0L, $composer, 28038, 66);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            Function2<Composer, Integer, Unit> lambda$1825513951$app = ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1825513951$app();
            Function2<Composer, Integer, Unit> lambda$492714750$app = ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$492714750$app();
            ComposerKt.sourceInformationMarkerStart($composer, -346680446, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean changed3 = $composer.changed($onNavigate);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardScreenKt.HomeContent$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
                rememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.m7685OneUIRowRFMEUTM("المفضلة", null, "الأذكار التي تحبها", lambda$1825513951$app, lambda$492714750$app, (Function0) rememberedValue3, 0L, $composer, 28038, 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$24$lambda$23$lambda$18$lambda$17(Function1 $onNavigate) {
        $onNavigate.invoke("tasbeeh");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$24$lambda$23$lambda$20$lambda$19(Function1 $onNavigate) {
        $onNavigate.invoke("hisn");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeContent$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(Function1 $onNavigate) {
        $onNavigate.invoke("favorites");
        return Unit.INSTANCE;
    }

    private static final void SummaryCell(String label, final String value, final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2;
        final String str = label;
        Composer $composer3 = $composer.startRestartGroup(-1977460833);
        ComposerKt.sourceInformation($composer3, "C(SummaryCell)N(label,value,modifier)138@6062L306:DashboardScreen.kt#2thlc2");
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
                ComposerKt.traceEventStart(-1977460833, $dirty, -1, "com.example.ui.screens.SummaryCell (DashboardScreen.kt:137)");
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
            ComposerKt.sourceInformationMarkerStart($composer3, -749566723, "C139@6175L10,139@6224L11,139@6141L105,140@6289L10,140@6333L11,140@6255L107:DashboardScreen.kt#2thlc2");
            $composer2 = $composer3;
            TextKt.m2816Text4IGK_g(value, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getHeadlineMedium(), $composer3, ($dirty >> 3) & 14, 0, 65530);
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
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.SummaryCell$lambda$29(str, value, modifier, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ChevronIcon(Composer $composer, final int $changed) {
        long m4487copywmQWz5c;
        Composer $composer2 = $composer.startRestartGroup(-309809444);
        ComposerKt.sourceInformation($composer2, "C(ChevronIcon)150@6583L11,147@6492L144:DashboardScreen.kt#2thlc2");
        if (!$composer2.shouldExecute($changed != 0, $changed & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-309809444, $changed, -1, "com.example.ui.screens.ChevronIcon (DashboardScreen.kt:145)");
            }
            ImageVector keyboardArrowLeft = KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.Outlined.INSTANCE);
            m4487copywmQWz5c = Color.m4487copywmQWz5c(r8, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r8) : 0.7f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r8) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r8) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant()) : 0.0f);
            IconKt.m2273Iconww6aTOc(keyboardArrowLeft, (String) null, (Modifier) null, m4487copywmQWz5c, $composer2, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.ChevronIcon$lambda$30($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DhikrHighlightCard(final DhikrInstance instance, final Function0<Unit> onMarkAsRead, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(onMarkAsRead, "onMarkAsRead");
        Composer $composer2 = $composer.startRestartGroup(-1906714107);
        ComposerKt.sourceInformation($composer2, "C(DhikrHighlightCard)N(instance,onMarkAsRead)157@6786L11,158@6844L1123,158@6802L1165:DashboardScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(instance) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onMarkAsRead) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1906714107, $dirty, -1, "com.example.ui.screens.DhikrHighlightCard (DashboardScreen.kt:155)");
            }
            final Dhikr dhikr = instance.getDhikr();
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(18)), 0L, ComposableLambdaKt.rememberComposableLambda(999517242, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.DhikrHighlightCard$lambda$33(Dhikr.this, cs, onMarkAsRead, instance, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.DhikrHighlightCard$lambda$34(DhikrInstance.this, onMarkAsRead, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit DhikrHighlightCard$lambda$33(Dhikr $dhikr, ColorScheme $cs, Function0 $onMarkAsRead, DhikrInstance $instance, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Composer m3828constructorimpl;
        int i;
        Composer composer2;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C159@6894L10,159@6854L85,160@6948L29,161@6986L465,172@7460L30,173@7499L314,180@7822L30,181@7861L100:DashboardScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(OneUICard) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999517242, $dirty, -1, "com.example.ui.screens.DhikrHighlightCard.<anonymous> (DashboardScreen.kt:159)");
            }
            TextKt.m2816Text4IGK_g($dhikr.getTitle(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
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
            Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    Composer composer3 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i4 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1526429184, "C162@7052L142,166@7207L28,169@7386L10,167@7248L193:DashboardScreen.kt#2thlc2");
                    IconKt.m2273Iconww6aTOc(NotificationsActiveKt.getNotificationsActive(Icons.Filled.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), ColorKt.getOneUIUpcomingAmber(), composer3, 432, 0);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), composer3, 6);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf($instance.getHour()), Integer.valueOf($instance.getMinute())}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    TextKt.m2816Text4IGK_g(DateTimeUtilsKt.formatTimeStr12h(format), (Modifier) null, ColorKt.getOneUIUpcomingAmber(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(BackgroundKt.m230backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $cs.getSurfaceVariant(), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16))), Dp.m7226constructorimpl(14));
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        $composer.createNode(constructor2);
                    } else {
                        $composer.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        i = 0;
                        composer2 = $composer;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i5 >> 6) & 14;
                            Composer composer4 = composer2;
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            int i7 = ((i >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, -927804416, "C178@7746L10,178@7704L99:DashboardScreen.kt#2thlc2");
                            TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyLarge(), composer4, 0, 3072, 57338);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                            OneUIKt.OneUIButton("تمت القراءة", $onMarkAsRead, OneUICard.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), false, CheckKt.getCheck(Icons.Outlined.INSTANCE), false, $composer, 6, 40);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    } else {
                        i = 0;
                        composer2 = $composer;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i62 = (i5 >> 6) & 14;
                    Composer composer42 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer42, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i72 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer42, -927804416, "C178@7746L10,178@7704L99:DashboardScreen.kt#2thlc2");
                    TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer42, MaterialTheme.$stable).getBodyLarge(), composer42, 0, 3072, 57338);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                    OneUIKt.OneUIButton("تمت القراءة", $onMarkAsRead, OneUICard.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), false, CheckKt.getCheck(Icons.Outlined.INSTANCE), false, $composer, 6, 40);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            Composer composer32 = composer;
            ComposerKt.sourceInformationMarkerStart(composer32, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i42 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer32, 1526429184, "C162@7052L142,166@7207L28,169@7386L10,167@7248L193:DashboardScreen.kt#2thlc2");
            IconKt.m2273Iconww6aTOc(NotificationsActiveKt.getNotificationsActive(Icons.Filled.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), ColorKt.getOneUIUpcomingAmber(), composer32, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), composer32, 6);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf($instance.getHour()), Integer.valueOf($instance.getMinute())}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            TextKt.m2816Text4IGK_g(DateTimeUtilsKt.formatTimeStr12h(format2), (Modifier) null, ColorKt.getOneUIUpcomingAmber(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer32, MaterialTheme.$stable).getBodyMedium(), composer32, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer32);
            ComposerKt.sourceInformationMarkerEnd(composer32);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            Modifier m730padding3ABfNKs2 = PaddingKt.m730padding3ABfNKs(BackgroundKt.m230backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $cs.getSurfaceVariant(), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16))), Dp.m7226constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i622 = (i52 >> 6) & 14;
            Composer composer422 = composer2;
            ComposerKt.sourceInformationMarkerStart(composer422, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            int i722 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer422, -927804416, "C178@7746L10,178@7704L99:DashboardScreen.kt#2thlc2");
            TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer422, MaterialTheme.$stable).getBodyLarge(), composer422, 0, 3072, 57338);
            ComposerKt.sourceInformationMarkerEnd(composer422);
            ComposerKt.sourceInformationMarkerEnd(composer422);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
            OneUIKt.OneUIButton("تمت القراءة", $onMarkAsRead, OneUICard.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), false, CheckKt.getCheck(Icons.Outlined.INSTANCE), false, $composer, 6, 40);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
