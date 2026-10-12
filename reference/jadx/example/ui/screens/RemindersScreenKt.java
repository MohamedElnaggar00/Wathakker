package com.example.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import com.example.ui.viewmodel.MainViewModel;
import com.example.utils.DateTimeUtilsKt;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: RemindersScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a=\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002"}, d2 = {"RemindersScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onBack", "Lkotlin/Function0;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RemindersContent", "all", "", "Lcom/example/data/Dhikr;", "onToggle", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReminderRow", "dhikr", "(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "allDhikr"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemindersScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReminderRow$lambda$21(Dhikr dhikr, Function0 function0, int i, Composer composer, int i2) {
        ReminderRow(dhikr, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit RemindersContent$lambda$12(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        RemindersContent(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit RemindersScreen$lambda$2(MainViewModel mainViewModel, Function0 function0, int i, Composer composer, int i2) {
        RemindersScreen(mainViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RemindersScreen(final MainViewModel viewModel, final Function0<Unit> onBack, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(907084475);
        ComposerKt.sourceInformation($composer2, "C(RemindersScreen)N(viewModel,onBack)20@793L29,21@862L24,21@827L60:RemindersScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(907084475, $dirty, -1, "com.example.ui.screens.RemindersScreen (RemindersScreen.kt:19)");
            }
            State allDhikr$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllDhikr(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            List<Dhikr> RemindersScreen$lambda$0 = RemindersScreen$lambda$0(allDhikr$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -170174573, "CC(remember):RemindersScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (KFunction) new RemindersScreenKt$RemindersScreen$1$1(viewModel);
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            RemindersContent(RemindersScreen$lambda$0, onBack, (Function1) ((KFunction) rememberedValue), $composer2, $dirty & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RemindersScreenKt.RemindersScreen$lambda$2(MainViewModel.this, onBack, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<Dhikr> RemindersScreen$lambda$0(State<? extends List<Dhikr>> state) {
        return (List) state.getValue();
    }

    public static final void RemindersContent(final List<Dhikr> all, final Function0<Unit> onBack, final Function1<? super Dhikr, Unit> onToggle, Composer $composer, final int $changed) {
        int i;
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onToggle, "onToggle");
        Composer $composer2 = $composer.startRestartGroup(-715487514);
        ComposerKt.sourceInformation($composer2, "C(RemindersContent)N(all,onBack,onToggle)31@1163L489,27@1039L613:RemindersScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(all) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onToggle) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-715487514, $dirty2, -1, "com.example.ui.screens.RemindersContent (RemindersScreen.kt:25)");
            }
            List<Dhikr> list = all;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Dhikr) it.next()).isEnabled() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            int active = i;
            String str = active + " من " + all.size() + " مفعّلة";
            ComposerKt.sourceInformationMarkerStart($composer2, -388724401, "CC(remember):RemindersScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(all) | (($dirty2 & 896) == 256);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RemindersScreenKt.RemindersContent$lambda$11$lambda$10(all, onToggle, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIKt.m7686OneUIScreengMrHQkA("التنبيهات", null, str, onBack, null, null, null, 0.0f, (Function1) rememberedValue, $composer2, (($dirty2 << 6) & 7168) | 6, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RemindersScreenKt.RemindersContent$lambda$12(all, onBack, onToggle, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit RemindersContent$lambda$11$lambda$10(final List $all, final Function1 $onToggle, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        if ($all.isEmpty()) {
            LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableSingletons$RemindersScreenKt.INSTANCE.getLambda$1944684617$app(), 3, null);
        } else {
            LazyListScope.CC.item$default(OneUIScreen, "group", null, ComposableLambdaKt.composableLambdaInstance(1249535008, true, new Function3() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return RemindersScreenKt.RemindersContent$lambda$11$lambda$10$lambda$9($all, $onToggle, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit RemindersContent$lambda$11$lambda$10$lambda$9(final List $all, final Function1 $onToggle, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C36@1360L262,36@1350L272:RemindersScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249535008, $changed, -1, "com.example.ui.screens.RemindersContent.<anonymous>.<anonymous>.<anonymous> (RemindersScreen.kt:36)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(415888533, true, new Function3() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return RemindersScreenKt.RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8($all, $onToggle, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8(List $all, final Function1 $onToggle, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C*39@1563L19,39@1544L38:RemindersScreen.kt#2thlc2");
        int i = 0;
        int i2 = 1;
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(415888533, $changed, -1, "com.example.ui.screens.RemindersContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RemindersScreen.kt:37)");
            }
            int i3 = 0;
            for (Object obj : CollectionsKt.sortedWith($all, new Comparator() { // from class: com.example.ui.screens.RemindersScreenKt$RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    String str = (String) CollectionsKt.firstOrNull((List) ((Dhikr) t).getReminderTimes());
                    if (str == null) {
                        str = "99:99";
                    }
                    String str2 = str;
                    String str3 = (String) CollectionsKt.firstOrNull((List) ((Dhikr) t2).getReminderTimes());
                    return ComparisonsKt.compareValues(str2, str3 != null ? str3 : "99:99");
                }
            })) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final Dhikr dhikr = (Dhikr) obj;
                if (i3 > 0) {
                    $composer.startReplaceGroup(-135624642);
                    ComposerKt.sourceInformation($composer, "38@1505L14");
                    OneUIKt.m7682OneUIDividerkHDZbjc(0.0f, $composer, i, i2);
                } else {
                    $composer.startReplaceGroup(89109010);
                }
                $composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart($composer, -135622781, "CC(remember):RemindersScreen.kt#9igjgp");
                boolean changed = $composer.changed($onToggle) | $composer.changedInstance(dhikr);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RemindersScreenKt.RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(Function1.this, dhikr);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    rememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ReminderRow(dhikr, (Function0) rememberedValue, $composer, 0);
                i = 0;
                i3 = i4;
                i2 = 1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit RemindersContent$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(Function1 $onToggle, Dhikr $dhikr) {
        $onToggle.invoke($dhikr);
        return Unit.INSTANCE;
    }

    public static final void ReminderRow(final Dhikr dhikr, final Function0<Unit> onToggle, Composer $composer, final int $changed) {
        String str;
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(onToggle, "onToggle");
        Composer $composer2 = $composer.startRestartGroup(-305210313);
        ComposerKt.sourceInformation($composer2, "C(ReminderRow)N(dhikr,onToggle)49@1749L11,54@2043L24,55@2087L584,69@2692L48,52@1947L827:RemindersScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(dhikr) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onToggle) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-305210313, $dirty2, -1, "com.example.ui.screens.ReminderRow (RemindersScreen.kt:48)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            String str2 = (String) CollectionsKt.firstOrNull((List) dhikr.getReminderTimes());
            if (str2 == null || (str = DateTimeUtilsKt.formatTimeStr12h(str2)) == null) {
                str = "--";
            }
            final String first = str;
            final String extra = dhikr.getReminderTimes().size() > 1 ? " +" + (dhikr.getReminderTimes().size() - 1) : "";
            String title = dhikr.getTitle();
            List<String> reminderTimes = dhikr.getReminderTimes();
            ComposerKt.sourceInformationMarkerStart($composer2, -1249322257, "CC(remember):RemindersScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RemindersScreenKt.ReminderRow$lambda$15$lambda$14((String) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIKt.m7685OneUIRowRFMEUTM(title, null, CollectionsKt.joinToString$default(reminderTimes, r17, null, null, 0, null, (Function1) rememberedValue, 30, null), ComposableLambdaKt.rememberComposableLambda(1099712135, true, new Function2() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RemindersScreenKt.ReminderRow$lambda$17(first, dhikr, cs, extra, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-2064468536, true, new Function2() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RemindersScreenKt.ReminderRow$lambda$20(Dhikr.this, onToggle, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), onToggle, 0L, $composer2, (($dirty2 << 12) & 458752) | 27648, 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RemindersScreenKt.ReminderRow$lambda$21(Dhikr.this, onToggle, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final CharSequence ReminderRow$lambda$15$lambda$14(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DateTimeUtilsKt.formatTimeStr12h(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit ReminderRow$lambda$17(String $first, Dhikr $dhikr, ColorScheme $cs, String $extra, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        ComposerKt.sourceInformation($composer, "C56@2101L560:RemindersScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1099712135, $changed, -1, "com.example.ui.screens.ReminderRow.<anonymous> (RemindersScreen.kt:56)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier m782width3ABfNKs = SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(72));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m782width3ABfNKs);
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
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
                i = currentCompositeKeyHash;
            } else {
                i = currentCompositeKeyHash;
                if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i4 = ((390 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -950846637, "C59@2308L10,57@2212L224,64@2560L10,62@2453L194:RemindersScreen.kt#2thlc2");
                    TextKt.m2816Text4IGK_g(StringsKt.substringBefore$default($first, ' ', (String) null, 2, (Object) null), (Modifier) null, !$dhikr.isEnabled() ? $cs.getOnSurface() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 65530);
                    TextKt.m2816Text4IGK_g(StringsKt.substringAfter($first, ' ', "") + $extra, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
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
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(i));
            m3828constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i42 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -950846637, "C59@2308L10,57@2212L224,64@2560L10,62@2453L194:RemindersScreen.kt#2thlc2");
            TextKt.m2816Text4IGK_g(StringsKt.substringBefore$default($first, ' ', (String) null, 2, (Object) null), (Modifier) null, !$dhikr.isEnabled() ? $cs.getOnSurface() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 65530);
            TextKt.m2816Text4IGK_g(StringsKt.substringAfter($first, ' ', "") + $extra, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
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
    public static final Unit ReminderRow$lambda$20(Dhikr $dhikr, final Function0 $onToggle, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C69@2723L14,69@2694L44:RemindersScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2064468536, $changed, -1, "com.example.ui.screens.ReminderRow.<anonymous> (RemindersScreen.kt:69)");
            }
            boolean isEnabled = $dhikr.isEnabled();
            ComposerKt.sourceInformationMarkerStart($composer, 320628662, "CC(remember):RemindersScreen.kt#9igjgp");
            boolean changed = $composer.changed($onToggle);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.RemindersScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RemindersScreenKt.ReminderRow$lambda$20$lambda$19$lambda$18(Function0.this, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUISwitch(isEnabled, (Function1) rememberedValue, null, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ReminderRow$lambda$20$lambda$19$lambda$18(Function0 $onToggle, boolean it) {
        $onToggle.invoke();
        return Unit.INSTANCE;
    }
}
