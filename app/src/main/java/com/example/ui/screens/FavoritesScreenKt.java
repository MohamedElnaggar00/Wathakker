package com.example.ui.screens;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.example.data.Dhikr;
import com.example.data.DhikrWithTags;
import com.example.data.Tag;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.viewmodel.MainViewModel;
import java.util.LinkedHashMap;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* compiled from: FavoritesScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a§\u0001\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\tX\u008a\u0084\u0002"}, d2 = {"FavoritesScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onBack", "Lkotlin/Function0;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FavoritesContent", "favorites", "", "Lcom/example/data/Dhikr;", "tagsMap", "", "", "Lcom/example/data/Tag;", "onToggleEnabled", "Lkotlin/Function1;", "onToggleFavorite", "onClickTimes", "onEdit", "onDelete", "(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app", "favoriteDhikr", "allTags", "dhikrsWithTags", "Lcom/example/data/DhikrWithTags;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FavoritesScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FavoritesContent$lambda$16(List list, Map map, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i, Composer composer, int i2) {
        FavoritesContent(list, map, function0, function1, function12, function13, function14, function15, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FavoritesScreen$lambda$13(MainViewModel mainViewModel, Function0 function0, int i, Composer composer, int i2) {
        FavoritesScreen(mainViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x021e, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FavoritesScreen(final MainViewModel viewModel, Function0<Unit> onBack, Composer $composer, final int $changed) {
        final Function0<Unit> function0;
        Map tagsMap;
        DhikrDialogState dialogs;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(-1635862789);
        ComposerKt.sourceInformation($composer2, "C(FavoritesScreen)N(viewModel,onBack)14@538L29,15@605L29,16@686L29,17@734L31,18@784L80,23@1000L24,24@1053L25,25@1103L22,26@1144L21,27@1186L22,19@869L345,29@1219L54:FavoritesScreen.kt#2thlc2");
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
                ComposerKt.traceEventStart(-1635862789, $dirty2, -1, "com.example.ui.screens.FavoritesScreen (FavoritesScreen.kt:13)");
            }
            State favoriteDhikr$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getFavoriteDhikr(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State allTags$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllTags(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State dhikrsWithTags$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getDhikrsWithTags(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, -106099462, "CC(remember):FavoritesScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object dhikrDialogState = new DhikrDialogState();
                $composer2.updateRememberedValue(dhikrDialogState);
                rememberedValue = dhikrDialogState;
            }
            final DhikrDialogState dialogs2 = (DhikrDialogState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<DhikrWithTags> FavoritesScreen$lambda$2 = FavoritesScreen$lambda$2(dhikrsWithTags$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -106097813, "CC(remember):FavoritesScreen.kt#9igjgp");
            boolean changed = $composer2.changed(FavoritesScreen$lambda$2);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Iterable<DhikrWithTags> FavoritesScreen$lambda$22 = FavoritesScreen$lambda$2(dhikrsWithTags$delegate);
                int coerceAtLeast = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(FavoritesScreen$lambda$22, 10)), 16);
                Map linkedHashMap = new LinkedHashMap(coerceAtLeast);
                for (DhikrWithTags dhikrWithTags : FavoritesScreen$lambda$22) {
                    int i = coerceAtLeast;
                    Pair pair = TuplesKt.to(Integer.valueOf(dhikrWithTags.getDhikr().getId()), dhikrWithTags.getTags());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    coerceAtLeast = i;
                }
                $composer2.updateRememberedValue(linkedHashMap);
                rememberedValue2 = linkedHashMap;
            }
            Map tagsMap2 = (Map) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<Dhikr> FavoritesScreen$lambda$0 = FavoritesScreen$lambda$0(favoriteDhikr$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -106090957, "CC(remember):FavoritesScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue3 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = (KFunction) new FavoritesScreenKt$FavoritesScreen$1$1(viewModel);
                $composer2.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function1 = (Function1) ((KFunction) rememberedValue3);
            ComposerKt.sourceInformationMarkerStart($composer2, -106089260, "CC(remember):FavoritesScreen.kt#9igjgp");
            boolean changedInstance2 = $composer2.changedInstance(viewModel);
            Object rememberedValue4 = $composer2.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                tagsMap = tagsMap2;
                Object obj2 = (KFunction) new FavoritesScreenKt$FavoritesScreen$2$1(viewModel);
                $composer2.updateRememberedValue(obj2);
                rememberedValue4 = obj2;
            } else {
                tagsMap = tagsMap2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function12 = (Function1) ((KFunction) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart($composer2, -106087663, "CC(remember):FavoritesScreen.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.example.ui.screens.FavoritesScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return FavoritesScreenKt.FavoritesScreen$lambda$9$lambda$8(DhikrDialogState.this, (Dhikr) obj4);
                    }
                };
                $composer2.updateRememberedValue(obj3);
                rememberedValue5 = obj3;
            }
            Function1 function13 = (Function1) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -106086352, "CC(remember):FavoritesScreen.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function1() { // from class: com.example.ui.screens.FavoritesScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return FavoritesScreenKt.FavoritesScreen$lambda$11$lambda$10(DhikrDialogState.this, (Dhikr) obj5);
                    }
                };
                $composer2.updateRememberedValue(obj4);
                rememberedValue6 = obj4;
            }
            Function1 function14 = (Function1) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -106085007, "CC(remember):FavoritesScreen.kt#9igjgp");
            boolean changedInstance3 = $composer2.changedInstance(viewModel);
            Object rememberedValue7 = $composer2.rememberedValue();
            if (changedInstance3) {
                dialogs = dialogs2;
            } else {
                dialogs = dialogs2;
            }
            Object obj5 = (KFunction) new FavoritesScreenKt$FavoritesScreen$5$1(viewModel);
            $composer2.updateRememberedValue(obj5);
            rememberedValue7 = obj5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Map tagsMap3 = tagsMap;
            FavoritesContent(FavoritesScreen$lambda$0, tagsMap3, onBack, function1, function12, function13, function14, (Function1) ((KFunction) rememberedValue7), $composer2, (($dirty2 << 3) & 896) | 1769472);
            function0 = onBack;
            $composer2 = $composer2;
            HomeScreenKt.DhikrDialogsHost(dialogs, viewModel, FavoritesScreen$lambda$1(allTags$delegate), tagsMap3, $composer2, (($dirty2 << 3) & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function0 = onBack;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.FavoritesScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return FavoritesScreenKt.FavoritesScreen$lambda$13(MainViewModel.this, function0, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    private static final List<Dhikr> FavoritesScreen$lambda$0(State<? extends List<Dhikr>> state) {
        return (List) state.getValue();
    }

    private static final List<Tag> FavoritesScreen$lambda$1(State<? extends List<Tag>> state) {
        return (List) state.getValue();
    }

    private static final List<DhikrWithTags> FavoritesScreen$lambda$2(State<? extends List<DhikrWithTags>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FavoritesScreen$lambda$9$lambda$8(DhikrDialogState $dialogs, Dhikr it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $dialogs.setTimes(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FavoritesScreen$lambda$11$lambda$10(DhikrDialogState $dialogs, Dhikr it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $dialogs.setEdit(it);
        return Unit.INSTANCE;
    }

    public static final void FavoritesContent(final List<Dhikr> favorites, final Map<Integer, ? extends List<Tag>> tagsMap, final Function0<Unit> onBack, final Function1<? super Dhikr, Unit> onToggleEnabled, final Function1<? super Dhikr, Unit> onToggleFavorite, final Function1<? super Dhikr, Unit> onClickTimes, final Function1<? super Dhikr, Unit> onEdit, final Function1<? super Dhikr, Unit> onDelete, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(tagsMap, "tagsMap");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onToggleEnabled, "onToggleEnabled");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(onClickTimes, "onClickTimes");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Composer $composer3 = $composer.startRestartGroup(-1689007638);
        ComposerKt.sourceInformation($composer3, "C(FavoritesContent)N(favorites,tagsMap,onBack,onToggleEnabled,onToggleFavorite,onClickTimes,onEdit,onDelete)43@1663L260,43@1576L347:FavoritesScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(favorites) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(tagsMap) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onBack) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onToggleEnabled) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onToggleFavorite) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onClickTimes) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onEdit) ? 1048576 : 524288;
        }
        if ((12582912 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onDelete) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute((4793491 & $dirty) != 4793490, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1689007638, $dirty, -1, "com.example.ui.screens.FavoritesContent (FavoritesScreen.kt:42)");
            }
            String azkarCount = OneUIKt.azkarCount(favorites.size());
            ComposerKt.sourceInformationMarkerStart($composer3, 361310382, "CC(remember):FavoritesScreen.kt#9igjgp");
            boolean changedInstance = $composer3.changedInstance(favorites) | $composer3.changedInstance(tagsMap) | (($dirty & 7168) == 2048) | ((57344 & $dirty) == 16384) | ((458752 & $dirty) == 131072) | ((3670016 & $dirty) == 1048576) | ((29360128 & $dirty) == 8388608);
            Object rememberedValue = $composer3.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.example.ui.screens.FavoritesScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavoritesScreenKt.FavoritesContent$lambda$15$lambda$14(favorites, tagsMap, onToggleEnabled, onToggleFavorite, onClickTimes, onEdit, onDelete, (LazyListScope) obj);
                    }
                };
                $composer3.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            OneUIKt.m7686OneUIScreengMrHQkA("المفضلة", null, azkarCount, onBack, null, null, null, 0.0f, (Function1) rememberedValue, $composer3, (($dirty << 3) & 7168) | 6, 242);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.FavoritesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FavoritesScreenKt.FavoritesContent$lambda$16(favorites, tagsMap, onBack, onToggleEnabled, onToggleFavorite, onClickTimes, onEdit, onDelete, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FavoritesContent$lambda$15$lambda$14(List $favorites, Map $tagsMap, Function1 $onToggleEnabled, Function1 $onToggleFavorite, Function1 $onClickTimes, Function1 $onEdit, Function1 $onDelete, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        if ($favorites.isEmpty()) {
            LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableSingletons$FavoritesScreenKt.INSTANCE.getLambda$1280344781$app(), 3, null);
        } else {
            HomeScreenKt.dhikrCards$default(OneUIScreen, $favorites, $tagsMap, $onToggleEnabled, $onToggleFavorite, $onClickTimes, $onEdit, $onDelete, null, null, 384, null);
        }
        return Unit.INSTANCE;
    }
}
