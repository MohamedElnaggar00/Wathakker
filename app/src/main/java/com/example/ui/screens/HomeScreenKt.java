package com.example.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material.icons.outlined.MoreVertKt;
import androidx.compose.material.icons.outlined.ScheduleKt;
import androidx.compose.material.icons.outlined.SearchKt;
import androidx.compose.material.icons.outlined.StarBorderKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.example.data.Dhikr;
import com.example.data.DhikrWithTags;
import com.example.data.Tag;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.viewmodel.MainViewModel;
import com.example.utils.DateTimeUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nH\u0007¢\u0006\u0002\u0010\f\u001aF\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u001a5\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a\u008b\u0002\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010#\u001a¼\u0001\u0010$\u001a\u00020\u0001*\u00020%2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u001c2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u001a\u0083\u0001\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u000e2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001cH\u0007¢\u0006\u0002\u0010,¨\u0006-²\u0006\u0010\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\bX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u008e\u0002"}, d2 = {"DhikrDialogsHost", "", "state", "Lcom/example/ui/screens/DhikrDialogState;", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "allTags", "", "Lcom/example/data/Tag;", "tagsMap", "", "", "(Lcom/example/ui/screens/DhikrDialogState;Lcom/example/ui/viewmodel/MainViewModel;Ljava/util/List;Ljava/util/Map;Landroidx/compose/runtime/Composer;I)V", "filterDhikr", "Lcom/example/data/Dhikr;", "all", "query", "", "selectedTag", "AzkarListScreen", "onAdd", "Lkotlin/Function0;", "onMenu", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AzkarListContent", "dhikrs", "totalCount", "onQuery", "Lkotlin/Function1;", "onSelectTag", "onToggleEnabled", "onToggleFavorite", "onClickTimes", "onEdit", "onDelete", "(Ljava/util/List;ILjava/util/List;Ljava/util/Map;Lcom/example/data/Tag;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "dhikrCards", "Landroidx/compose/foundation/lazy/LazyListScope;", "DhikrItemCard", "dhikr", "tags", "onEditClick", "onDeleteClick", "onTagClick", "(Lcom/example/data/Dhikr;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app", "allDhikr", "dhikrsWithTags", "Lcom/example/data/DhikrWithTags;", "menu", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$50(List list, int i, List list2, Map map, Tag tag, String str, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function0 function02, int i2, int i3, int i4, Composer composer, int i5) {
        AzkarListContent(list, i, list2, map, tag, str, function1, function12, function0, function13, function14, function15, function16, function17, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListScreen$lambda$35(MainViewModel mainViewModel, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        AzkarListScreen(mainViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDialogsHost$lambda$13(DhikrDialogState dhikrDialogState, MainViewModel mainViewModel, List list, Map map, int i, Composer composer, int i2) {
        DhikrDialogsHost(dhikrDialogState, mainViewModel, list, map, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$89(Dhikr dhikr, List list, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, int i, int i2, Composer composer, int i3) {
        DhikrItemCard(dhikr, list, function0, function02, function03, function04, function05, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void DhikrDialogsHost(final DhikrDialogState state, final MainViewModel viewModel, final List<Tag> allTags, final Map<Integer, ? extends List<Tag>> tagsMap, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(allTags, "allTags");
        Intrinsics.checkNotNullParameter(tagsMap, "tagsMap");
        Composer $composer2 = $composer.startRestartGroup(682264318);
        ComposerKt.sourceInformation($composer2, "C(DhikrDialogsHost)N(state,viewModel,allTags,tagsMap):HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(allTags) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(tagsMap) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(682264318, $dirty2, -1, "com.example.ui.screens.DhikrDialogsHost (HomeScreen.kt:44)");
            }
            final Dhikr times = state.getTimes();
            if (times == null) {
                $composer2.startReplaceGroup(1551231210);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(1551231211);
                ComposerKt.sourceInformation($composer2, "*48@1771L22,49@1819L117,46@1694L252");
                ComposerKt.sourceInformationMarkerStart($composer2, 2026881723, "CC(remember):HomeScreen.kt#9igjgp");
                boolean z = ($dirty2 & 14) == 4;
                Object rememberedValue = $composer2.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.DhikrDialogsHost$lambda$4$lambda$1$lambda$0(DhikrDialogState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 2026883354, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance = $composer2.changedInstance(viewModel) | $composer2.changedInstance(times) | (($dirty2 & 14) == 4);
                Object rememberedValue2 = $composer2.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return HomeScreenKt.DhikrDialogsHost$lambda$4$lambda$3$lambda$2(MainViewModel.this, times, state, (List) obj3);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    rememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                DialogsKt.DhikrMultipleTimesDialog(times, function0, (Function1) rememberedValue2, $composer2, 0);
                $composer2.endReplaceGroup();
            }
            final Dhikr edit = state.getEdit();
            if (edit == null) {
                $composer2.startReplaceGroup(1551534359);
            } else {
                $composer2.startReplaceGroup(1551534360);
                ComposerKt.sourceInformation($composer2, "*61@2214L21,62@2261L164,66@2453L24,57@2072L415");
                Iterable iterable = (List) tagsMap.get(Integer.valueOf(edit.getId()));
                if (iterable == null) {
                    iterable = CollectionsKt.emptyList();
                }
                Iterable iterable2 = iterable;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Tag) it.next()).getTagId()));
                }
                List list = (List) arrayList;
                ComposerKt.sourceInformationMarkerStart($composer2, 30032593, "CC(remember):HomeScreen.kt#9igjgp");
                boolean z2 = ($dirty2 & 14) == 4;
                Object rememberedValue3 = $composer2.rememberedValue();
                if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.DhikrDialogsHost$lambda$12$lambda$7$lambda$6(DhikrDialogState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    rememberedValue3 = obj3;
                }
                Function0 function02 = (Function0) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 30034240, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance2 = $composer2.changedInstance(viewModel) | $composer2.changedInstance(edit) | (($dirty2 & 14) == 4);
                Object rememberedValue4 = $composer2.rememberedValue();
                if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            return HomeScreenKt.DhikrDialogsHost$lambda$12$lambda$9$lambda$8(MainViewModel.this, edit, state, (String) obj5, (String) obj6, (List) obj7);
                        }
                    };
                    $composer2.updateRememberedValue(obj4);
                    rememberedValue4 = obj4;
                }
                Function3 function3 = (Function3) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 30040244, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance3 = $composer2.changedInstance(viewModel);
                Object rememberedValue5 = $composer2.rememberedValue();
                if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            return HomeScreenKt.DhikrDialogsHost$lambda$12$lambda$11$lambda$10(MainViewModel.this, (String) obj6);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    rememberedValue5 = obj5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                DialogsKt.DhikrEditDialog(edit, allTags, list, function02, function3, (Function1) rememberedValue5, $composer2, ($dirty2 >> 3) & 112, 0);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return HomeScreenKt.DhikrDialogsHost$lambda$13(DhikrDialogState.this, viewModel, allTags, tagsMap, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDialogsHost$lambda$4$lambda$1$lambda$0(DhikrDialogState $state) {
        $state.setTimes(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDialogsHost$lambda$4$lambda$3$lambda$2(MainViewModel $viewModel, Dhikr $dhikr, DhikrDialogState $state, List newTimes) {
        Intrinsics.checkNotNullParameter(newTimes, "newTimes");
        $viewModel.updateTimes($dhikr, newTimes);
        $state.setTimes(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDialogsHost$lambda$12$lambda$7$lambda$6(DhikrDialogState $state) {
        $state.setEdit(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDialogsHost$lambda$12$lambda$9$lambda$8(MainViewModel $viewModel, Dhikr $dhikr, DhikrDialogState $state, String newTitle, String newContent, List tagIds) {
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        Intrinsics.checkNotNullParameter(newContent, "newContent");
        Intrinsics.checkNotNullParameter(tagIds, "tagIds");
        $viewModel.updateDhikrWithTags($dhikr, newTitle, newContent, tagIds);
        $state.setEdit(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDialogsHost$lambda$12$lambda$11$lambda$10(MainViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainViewModel.addTag$default($viewModel, it, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<Dhikr> filterDhikr(List<Dhikr> all, String query, Tag selectedTag, Map<Integer, ? extends List<Tag>> map) {
        boolean z;
        String obj;
        boolean z2;
        boolean z3;
        Iterable iterable;
        boolean z4;
        String query2 = query;
        Map<Integer, ? extends List<Tag>> tagsMap = map;
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(query2, "query");
        Intrinsics.checkNotNullParameter(tagsMap, "tagsMap");
        Collection arrayList = new ArrayList();
        for (Object obj2 : all) {
            Dhikr dhikr = (Dhikr) obj2;
            List list = tagsMap.get(Integer.valueOf(dhikr.getId()));
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            if (selectedTag != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = false;
                            break;
                        }
                        if ((((Tag) it.next()).getTagId() == selectedTag.getTagId() ? 1 : null) != null) {
                            z4 = true;
                            break;
                        }
                    }
                } else {
                    z4 = false;
                }
                if (!z4) {
                    z = false;
                    obj = StringsKt.trim((CharSequence) query2).toString();
                    if (!StringsKt.isBlank(obj)) {
                        z2 = true;
                    } else if (StringsKt.contains((CharSequence) dhikr.getTitle(), (CharSequence) obj, true)) {
                        z2 = true;
                    } else if (StringsKt.contains((CharSequence) dhikr.getContent(), (CharSequence) obj, true)) {
                        z2 = true;
                    } else {
                        List list3 = list;
                        int i = 0;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            iterable = null;
                            z2 = true;
                        } else {
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = true;
                                    iterable = null;
                                    break;
                                }
                                Iterable iterable2 = list3;
                                int i2 = i;
                                z2 = true;
                                if (StringsKt.contains((CharSequence) ((Tag) it2.next()).getName(), (CharSequence) obj, true)) {
                                    iterable = 1;
                                    break;
                                }
                                i = i2;
                                list3 = iterable2;
                            }
                        }
                        if (iterable == null) {
                            z3 = false;
                            if ((z || !z3) ? false : z2) {
                                arrayList.add(obj2);
                            }
                            query2 = query;
                            tagsMap = map;
                        }
                    }
                    z3 = z2;
                    if ((z || !z3) ? false : z2) {
                    }
                    query2 = query;
                    tagsMap = map;
                }
            }
            z = true;
            obj = StringsKt.trim((CharSequence) query2).toString();
            if (!StringsKt.isBlank(obj)) {
            }
            z3 = z2;
            if ((z || !z3) ? false : z2) {
            }
            query2 = query;
            tagsMap = map;
        }
        return (List) arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f8, code lost:
    
        if (r15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0231, code lost:
    
        if (r14 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a9, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0347, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AzkarListScreen(final MainViewModel viewModel, final Function0<Unit> onAdd, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        final Function0 onMenu;
        List filtered;
        List<Tag> list;
        Map tagsMap;
        DhikrDialogState dialogs;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onAdd, "onAdd");
        Composer $composer2 = $composer.startRestartGroup(-332873457);
        ComposerKt.sourceInformation($composer2, "C(AzkarListScreen)N(viewModel,onAdd,onMenu)89@3212L29,90@3279L29,91@3360L29,92@3435L29,93@3504L29,94@3552L31,95@3602L80,96@3702L102,105@4021L25,106@4070L25,108@4146L24,109@4199L25,110@4249L22,111@4290L21,112@4332L22,98@3810L575,115@4390L54:HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onAdd) ? 32 : 16;
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
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            Function0 onMenu2 = i2 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-332873457, $dirty2, -1, "com.example.ui.screens.AzkarListScreen (HomeScreen.kt:88)");
            }
            State allDhikr$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllDhikr(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State allTags$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllTags(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State dhikrsWithTags$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getDhikrsWithTags(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State selectedTag$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getSelectedTag(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State query$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getSearchQuery(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063796626, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object dhikrDialogState = new DhikrDialogState();
                $composer2.updateRememberedValue(dhikrDialogState);
                rememberedValue = dhikrDialogState;
            }
            final DhikrDialogState dialogs2 = (DhikrDialogState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<DhikrWithTags> AzkarListScreen$lambda$19 = AzkarListScreen$lambda$19(dhikrsWithTags$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063794977, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed = $composer2.changed(AzkarListScreen$lambda$19);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Iterable<DhikrWithTags> AzkarListScreen$lambda$192 = AzkarListScreen$lambda$19(dhikrsWithTags$delegate);
                int coerceAtLeast = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(AzkarListScreen$lambda$192, 10)), 16);
                Map linkedHashMap = new LinkedHashMap(coerceAtLeast);
                for (DhikrWithTags dhikrWithTags : AzkarListScreen$lambda$192) {
                    int i3 = coerceAtLeast;
                    Pair pair = TuplesKt.to(Integer.valueOf(dhikrWithTags.getDhikr().getId()), dhikrWithTags.getTags());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    coerceAtLeast = i3;
                    changed = changed;
                }
                $composer2.updateRememberedValue(linkedHashMap);
                rememberedValue2 = linkedHashMap;
            }
            Map tagsMap2 = (Map) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<Dhikr> AzkarListScreen$lambda$17 = AzkarListScreen$lambda$17(allDhikr$delegate);
            String AzkarListScreen$lambda$21 = AzkarListScreen$lambda$21(query$delegate);
            Tag AzkarListScreen$lambda$20 = AzkarListScreen$lambda$20(selectedTag$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063791755, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed2 = $composer2.changed(AzkarListScreen$lambda$17) | $composer2.changed(AzkarListScreen$lambda$21) | $composer2.changed(AzkarListScreen$lambda$20) | $composer2.changed(tagsMap2);
            Object rememberedValue3 = $composer2.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object filterDhikr = filterDhikr(AzkarListScreen$lambda$17(allDhikr$delegate), AzkarListScreen$lambda$21(query$delegate), AzkarListScreen$lambda$20(selectedTag$delegate), tagsMap2);
                $composer2.updateRememberedValue(filterDhikr);
                rememberedValue3 = filterDhikr;
            }
            List filtered2 = (List) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            int size = AzkarListScreen$lambda$17(allDhikr$delegate).size();
            List<Tag> AzkarListScreen$lambda$18 = AzkarListScreen$lambda$18(allTags$delegate);
            Tag AzkarListScreen$lambda$202 = AzkarListScreen$lambda$20(selectedTag$delegate);
            String AzkarListScreen$lambda$212 = AzkarListScreen$lambda$21(query$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063781624, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue4 = $composer2.rememberedValue();
            if (changedInstance) {
                filtered = filtered2;
            } else {
                filtered = filtered2;
            }
            Object obj = (KFunction) new HomeScreenKt$AzkarListScreen$1$1(viewModel);
            $composer2.updateRememberedValue(obj);
            rememberedValue4 = obj;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function1 = (Function1) ((KFunction) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063780056, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance2 = $composer2.changedInstance(viewModel);
            Object rememberedValue5 = $composer2.rememberedValue();
            if (changedInstance2) {
            }
            Object obj2 = (KFunction) new HomeScreenKt$AzkarListScreen$2$1(viewModel);
            $composer2.updateRememberedValue(obj2);
            rememberedValue5 = obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function12 = (Function1) ((KFunction) rememberedValue5);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063777625, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance3 = $composer2.changedInstance(viewModel);
            HomeScreenKt$AzkarListScreen$3$1 rememberedValue6 = $composer2.rememberedValue();
            if (changedInstance3) {
                list = AzkarListScreen$lambda$18;
            } else {
                list = AzkarListScreen$lambda$18;
            }
            rememberedValue6 = new HomeScreenKt$AzkarListScreen$3$1(viewModel);
            $composer2.updateRememberedValue(rememberedValue6);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function13 = (Function1) ((KFunction) rememberedValue6);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063775928, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance4 = $composer2.changedInstance(viewModel);
            HomeScreenKt$AzkarListScreen$4$1 rememberedValue7 = $composer2.rememberedValue();
            if (changedInstance4) {
                tagsMap = tagsMap2;
            } else {
                tagsMap = tagsMap2;
            }
            rememberedValue7 = new HomeScreenKt$AzkarListScreen$4$1(viewModel);
            $composer2.updateRememberedValue(rememberedValue7);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function14 = (Function1) ((KFunction) rememberedValue7);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063774331, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue8 = $composer2.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return HomeScreenKt.AzkarListScreen$lambda$31$lambda$30(DhikrDialogState.this, (Dhikr) obj3);
                    }
                };
                $composer2.updateRememberedValue(rememberedValue8);
            }
            Function1 function15 = (Function1) rememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063773020, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue9 = $composer2.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return HomeScreenKt.AzkarListScreen$lambda$33$lambda$32(DhikrDialogState.this, (Dhikr) obj3);
                    }
                };
                $composer2.updateRememberedValue(rememberedValue9);
            }
            Function1 function16 = (Function1) rememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -2063771675, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance5 = $composer2.changedInstance(viewModel);
            HomeScreenKt$AzkarListScreen$7$1 rememberedValue10 = $composer2.rememberedValue();
            if (changedInstance5) {
                dialogs = dialogs2;
            } else {
                dialogs = dialogs2;
            }
            rememberedValue10 = new HomeScreenKt$AzkarListScreen$7$1(viewModel);
            $composer2.updateRememberedValue(rememberedValue10);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Map tagsMap3 = tagsMap;
            List filtered3 = filtered;
            AzkarListContent(filtered3, size, list, tagsMap3, AzkarListScreen$lambda$202, AzkarListScreen$lambda$212, function1, function12, onAdd, function13, function14, function15, function16, (Function1) ((KFunction) rememberedValue10), onMenu2, $composer2, ($dirty2 << 21) & 234881024, (($dirty2 << 6) & 57344) | 432, 0);
            $composer2 = $composer2;
            DhikrDialogsHost(dialogs, viewModel, AzkarListScreen$lambda$18(allTags$delegate), tagsMap3, $composer2, (($dirty2 << 3) & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onMenu = onMenu2;
        } else {
            $composer2.skipToGroupEnd();
            onMenu = function02;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return HomeScreenKt.AzkarListScreen$lambda$35(MainViewModel.this, onAdd, onMenu, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final List<Dhikr> AzkarListScreen$lambda$17(State<? extends List<Dhikr>> state) {
        return (List) state.getValue();
    }

    private static final List<Tag> AzkarListScreen$lambda$18(State<? extends List<Tag>> state) {
        return (List) state.getValue();
    }

    private static final List<DhikrWithTags> AzkarListScreen$lambda$19(State<? extends List<DhikrWithTags>> state) {
        return (List) state.getValue();
    }

    private static final Tag AzkarListScreen$lambda$20(State<Tag> state) {
        return (Tag) state.getValue();
    }

    private static final String AzkarListScreen$lambda$21(State<String> state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListScreen$lambda$31$lambda$30(DhikrDialogState $dialogs, Dhikr it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $dialogs.setTimes(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListScreen$lambda$33$lambda$32(DhikrDialogState $dialogs, Dhikr it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $dialogs.setEdit(it);
        return Unit.INSTANCE;
    }

    public static final void AzkarListContent(final List<Dhikr> dhikrs, final int totalCount, final List<Tag> allTags, final Map<Integer, ? extends List<Tag>> tagsMap, final Tag selectedTag, final String query, final Function1<? super String, Unit> onQuery, final Function1<? super Tag, Unit> onSelectTag, final Function0<Unit> onAdd, final Function1<? super Dhikr, Unit> onToggleEnabled, final Function1<? super Dhikr, Unit> onToggleFavorite, final Function1<? super Dhikr, Unit> onClickTimes, final Function1<? super Dhikr, Unit> onEdit, final Function1<? super Dhikr, Unit> onDelete, Function0<Unit> function0, Composer $composer, final int $changed, final int $changed1, final int i) {
        int $dirty;
        int i2;
        Composer $composer2;
        Function0 onMenu;
        int $dirty1;
        Intrinsics.checkNotNullParameter(dhikrs, "dhikrs");
        Intrinsics.checkNotNullParameter(allTags, "allTags");
        Intrinsics.checkNotNullParameter(tagsMap, "tagsMap");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(onQuery, "onQuery");
        Intrinsics.checkNotNullParameter(onSelectTag, "onSelectTag");
        Intrinsics.checkNotNullParameter(onAdd, "onAdd");
        Intrinsics.checkNotNullParameter(onToggleEnabled, "onToggleEnabled");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(onClickTimes, "onClickTimes");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Composer $composer3 = $composer.startRestartGroup(557612862);
        ComposerKt.sourceInformation($composer3, "C(AzkarListContent)N(dhikrs,totalCount,allTags,tagsMap,selectedTag,query,onQuery,onSelectTag,onAdd,onToggleEnabled,onToggleFavorite,onClickTimes,onEdit,onDelete,onMenu)140@5054L59,141@5120L1246,136@4928L1438:HomeScreen.kt#2thlc2");
        int $dirty12 = $changed1;
        if (($changed & 6) == 0) {
            $dirty = $changed | ($composer3.changedInstance(dhikrs) ? 4 : 2);
        } else {
            $dirty = $changed;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(totalCount) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(allTags) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(tagsMap) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(selectedTag) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty |= $composer3.changed(query) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changedInstance(onQuery) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty |= $composer3.changedInstance(onSelectTag) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(onAdd) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changedInstance(onToggleEnabled) ? 536870912 : 268435456;
        }
        int $dirty2 = $dirty;
        int $dirty3 = $changed1 & 6;
        if ($dirty3 == 0) {
            $dirty12 |= $composer3.changedInstance(onToggleFavorite) ? 4 : 2;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= $composer3.changedInstance(onClickTimes) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            $dirty12 |= $composer3.changedInstance(onEdit) ? 256 : 128;
        }
        if (($changed1 & 3072) == 0) {
            $dirty12 |= $composer3.changedInstance(onDelete) ? 2048 : 1024;
        }
        int $dirty13 = $dirty12;
        int i3 = i & 16384;
        if (i3 != 0) {
            $dirty13 |= 24576;
            i2 = i3;
        } else {
            i2 = i3;
            if (($changed1 & 24576) == 0) {
                $dirty13 |= $composer3.changedInstance(function0) ? 16384 : 8192;
            }
        }
        if ($composer3.shouldExecute((($dirty2 & 306783379) == 306783378 && ($dirty13 & 9363) == 9362) ? false : true, $dirty2 & 1)) {
            if (i2 != 0) {
                onMenu = null;
            } else {
                onMenu = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(557612862, $dirty2, $dirty13, "com.example.ui.screens.AzkarListContent (HomeScreen.kt:135)");
            }
            String azkarCount = OneUIKt.azkarCount(totalCount);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-92074448, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.AzkarListContent$lambda$36(Function0.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54);
            ComposerKt.sourceInformationMarkerStart($composer3, -1004928868, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changedInstance = ((458752 & $dirty2) == 131072) | ((3670016 & $dirty2) == 1048576) | $composer3.changedInstance(allTags) | ((57344 & $dirty2) == 16384) | ((29360128 & $dirty2) == 8388608) | $composer3.changedInstance(dhikrs) | $composer3.changedInstance(tagsMap) | ((1879048192 & $dirty2) == 536870912) | (($dirty13 & 14) == 4) | (($dirty13 & 112) == 32) | (($dirty13 & 896) == 256) | (($dirty13 & 7168) == 2048);
            Object rememberedValue = $composer3.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                $dirty1 = $dirty13;
                $composer2 = $composer3;
                rememberedValue = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt.AzkarListContent$lambda$49$lambda$48(allTags, dhikrs, tagsMap, onToggleEnabled, onToggleFavorite, onClickTimes, onEdit, onDelete, onSelectTag, selectedTag, query, onQuery, (LazyListScope) obj);
                    }
                };
                $composer3.updateRememberedValue(rememberedValue);
            } else {
                $dirty1 = $dirty13;
                $composer2 = $composer3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIKt.m7686OneUIScreengMrHQkA("الأذكار", null, azkarCount, null, onMenu, rememberComposableLambda, null, 0.0f, (Function1) rememberedValue, $composer2, ($dirty1 & 57344) | 196614, ComposerKt.compositionLocalMapKey);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onMenu = function0;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0 onMenu2 = onMenu;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.AzkarListContent$lambda$50(dhikrs, totalCount, allTags, tagsMap, selectedTag, query, onQuery, onSelectTag, onAdd, onToggleEnabled, onToggleFavorite, onClickTimes, onEdit, onDelete, onMenu2, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$36(Function0 $onAdd, RowScope OneUIScreen, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        ComposerKt.sourceInformation($composer, "C140@5056L55:HomeScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92074448, $changed, -1, "com.example.ui.screens.AzkarListContent.<anonymous> (HomeScreen.kt:140)");
            }
            OneUIKt.OneUIIconAction(AddKt.getAdd(Icons.Outlined.INSTANCE), "إضافة ذكر", $onAdd, $composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$49$lambda$48(final List $allTags, List $dhikrs, Map $tagsMap, Function1 $onToggleEnabled, Function1 $onToggleFavorite, Function1 $onClickTimes, Function1 $onEdit, Function1 $onDelete, Function1 $onSelectTag, final Tag $selectedTag, final String $query, final Function1 $onQuery, LazyListScope OneUIScreen) {
        final Function1 function1;
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "search", null, ComposableLambdaKt.composableLambdaInstance(-663546464, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.AzkarListContent$lambda$49$lambda$48$lambda$37($query, $onQuery, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if ($allTags.isEmpty()) {
            function1 = $onSelectTag;
        } else {
            function1 = $onSelectTag;
            LazyListScope.CC.item$default(OneUIScreen, "chips", null, ComposableLambdaKt.composableLambdaInstance(1015896891, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.AzkarListContent$lambda$49$lambda$48$lambda$46(Tag.this, function1, $allTags, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        if ($dhikrs.isEmpty()) {
            LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(717000946, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.AzkarListContent$lambda$49$lambda$48$lambda$47($query, $selectedTag, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            dhikrCards(OneUIScreen, $dhikrs, $tagsMap, $onToggleEnabled, $onToggleFavorite, $onClickTimes, $onEdit, $onDelete, function1, $selectedTag);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$49$lambda$48$lambda$37(String $query, Function1 $onQuery, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C142@5153L56:HomeScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-663546464, $changed, -1, "com.example.ui.screens.AzkarListContent.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:142)");
            }
            OneUIKt.OneUISearchField($query, $onQuery, "ابحث عن ذكر أو تصنيف", null, $composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$49$lambda$48$lambda$46(final Tag $selectedTag, final Function1 $onSelectTag, final List $allTags, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C145@5394L388,145@5298L484:HomeScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1015896891, $changed, -1, "com.example.ui.screens.AzkarListContent.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:145)");
            }
            Arrangement.HorizontalOrVertical m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = m610spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer, 1319340095, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed = $composer.changed($selectedTag) | $composer.changed($onSelectTag) | $composer.changedInstance($allTags);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomeScreenKt.AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44($allTags, $selectedTag, $onSelectTag, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyRow(fillMaxWidth$default, null, null, false, horizontalOrVertical, null, null, false, (Function1) rememberedValue, $composer, 24582, 238);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44(final List $allTags, final Tag $selectedTag, final Function1 $onSelectTag, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.CC.item$default(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-2122964007, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$lambda$40(Tag.this, $onSelectTag, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeScreenKt.AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$lambda$41((Tag) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Tag) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Tag tag) {
                return null;
            }
        };
        LazyRow.items($allTags.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($allTags.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($allTags.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.HomeScreenKt$AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final Tag tag = (Tag) $allTags.get(it);
                $composer.startReplaceGroup(-1392063913);
                ComposerKt.sourceInformation($composer, "CN(tag)*149@5666L39,149@5641L101:HomeScreen.kt#2thlc2");
                final boolean z = $selectedTag != null && $selectedTag.getTagId() == tag.getTagId();
                String name = tag.getName();
                ComposerKt.sourceInformationMarkerStart($composer, -460544500, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changed = $composer.changed($onSelectTag) | $composer.changed(z) | ((((i & 112) ^ 48) > 32 && $composer.changed(tag)) || (i & 48) == 32);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = $onSelectTag;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$AzkarListContent$2$1$2$1$1$3$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(z ? null : tag);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                OneUIKt.m7681OneUIChipM8YrEPQ(name, z, (Function0) rememberedValue, null, Color.m4479boximpl(OneUIKt.m7688parseColorSafe4WTKRHQ$default(tag.getColorHex(), 0L, 2, null)), $composer, 0, 8);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$lambda$40(Tag $selectedTag, final Function1 $onSelectTag, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C146@5462L21,146@5423L61:HomeScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2122964007, $changed, -1, "com.example.ui.screens.AzkarListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:146)");
            }
            boolean z = $selectedTag == null;
            ComposerKt.sourceInformationMarkerStart($composer, -58943794, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed = $composer.changed($onSelectTag);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$lambda$40$lambda$39$lambda$38(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.m7681OneUIChipM8YrEPQ("الكل", z, (Function0) rememberedValue, null, null, $composer, 6, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$lambda$40$lambda$39$lambda$38(Function1 $onSelectTag) {
        $onSelectTag.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object AzkarListContent$lambda$49$lambda$48$lambda$46$lambda$45$lambda$44$lambda$41(Tag it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getTagId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AzkarListContent$lambda$49$lambda$48$lambda$47(String $query, Tag $selectedTag, LazyItemScope item, Composer $composer, int $changed) {
        String str;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C156@5874L312:HomeScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(717000946, $changed, -1, "com.example.ui.screens.AzkarListContent.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:156)");
            }
            if (StringsKt.isBlank($query) && $selectedTag == null) {
                str = "لا توجد أذكار";
            } else if (StringsKt.isBlank($query)) {
                str = "لا توجد أذكار تحت تصنيف \"" + ($selectedTag != null ? $selectedTag.getName() : null) + "\"";
            } else {
                str = "لا توجد نتائج تطابق \"" + $query + "\"";
            }
            OneUIKt.OneUIEmptyState(str, SearchKt.getSearch(Icons.Outlined.INSTANCE), null, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void dhikrCards$default(LazyListScope lazyListScope, List list, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Tag tag, int i, Object obj) {
        if ((i & 128) != 0) {
            function16 = null;
        }
        if ((i & 256) != 0) {
            tag = null;
        }
        dhikrCards(lazyListScope, list, map, function1, function12, function13, function14, function15, function16, tag);
    }

    public static final void dhikrCards(LazyListScope $this$dhikrCards, final List<Dhikr> dhikrs, final Map<Integer, ? extends List<Tag>> tagsMap, final Function1<? super Dhikr, Unit> onToggleEnabled, final Function1<? super Dhikr, Unit> onToggleFavorite, final Function1<? super Dhikr, Unit> onClickTimes, final Function1<? super Dhikr, Unit> onEdit, final Function1<? super Dhikr, Unit> onDelete, final Function1<? super Tag, Unit> function1, final Tag selectedTag) {
        Intrinsics.checkNotNullParameter($this$dhikrCards, "<this>");
        Intrinsics.checkNotNullParameter(dhikrs, "dhikrs");
        Intrinsics.checkNotNullParameter(tagsMap, "tagsMap");
        Intrinsics.checkNotNullParameter(onToggleEnabled, "onToggleEnabled");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(onClickTimes, "onClickTimes");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        final Function1 function12 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeScreenKt.dhikrCards$lambda$51((Dhikr) obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Dhikr) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Dhikr dhikr) {
                return null;
            }
        };
        $this$dhikrCards.items(dhikrs.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke(dhikrs.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke(dhikrs.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:62:0x0211, code lost:
            
                if (r2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L77;
             */
            /* JADX WARN: Removed duplicated region for block: B:53:0x01d1  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x024b  */
            /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                boolean changed;
                Function1 function14;
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final Dhikr dhikr = (Dhikr) dhikrs.get(it);
                $composer.startReplaceGroup(-1975360679);
                ComposerKt.sourceInformation($composer, "CN(dhikr)*184@6892L26,185@6951L27,186@7007L23,187@7058L17,188@7105L19,181@6767L489:HomeScreen.kt#2thlc2");
                List list = (List) tagsMap.get(Integer.valueOf(dhikr.getId()));
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                ComposerKt.sourceInformationMarkerStart($composer, -1864833093, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changed2 = $composer.changed(onToggleEnabled) | $composer.changedInstance(dhikr);
                Object rememberedValue = $composer.rememberedValue();
                if (changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function15 = onToggleEnabled;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function15.invoke(dhikr);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1864831204, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changed3 = $composer.changed(onToggleFavorite) | $composer.changedInstance(dhikr);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changed3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function1 function16 = onToggleFavorite;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function16.invoke(dhikr);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    rememberedValue2 = obj2;
                }
                Function0 function02 = (Function0) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1864829416, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changed4 = $composer.changed(onClickTimes) | $composer.changedInstance(dhikr);
                Object rememberedValue3 = $composer.rememberedValue();
                if (changed4 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final Function1 function17 = onClickTimes;
                    Object obj3 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$2$3$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function17.invoke(dhikr);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    rememberedValue3 = obj3;
                }
                Function0 function03 = (Function0) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1864827790, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changed5 = $composer.changed(onEdit) | $composer.changedInstance(dhikr);
                Object rememberedValue4 = $composer.rememberedValue();
                if (!changed5 && rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                    Function0 function04 = (Function0) rememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1864826284, "CC(remember):HomeScreen.kt#9igjgp");
                    changed = $composer.changed(onDelete) | $composer.changedInstance(dhikr);
                    Object rememberedValue5 = $composer.rememberedValue();
                    if (!changed && rememberedValue5 != Composer.INSTANCE.getEmpty()) {
                        Function0 function05 = (Function0) rememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        if (function1 != null) {
                            $composer.startReplaceGroup(-1974979474);
                            $composer.endReplaceGroup();
                            function14 = null;
                        } else {
                            $composer.startReplaceGroup(-1974979473);
                            ComposerKt.sourceInformation($composer, "*189@7175L69");
                            final Function1 function18 = function1;
                            ComposerKt.sourceInformationMarkerStart($composer, 2141489595, "CC(remember):HomeScreen.kt#9igjgp");
                            boolean changed6 = $composer.changed(function18) | $composer.changed(selectedTag);
                            Object rememberedValue6 = $composer.rememberedValue();
                            if (changed6) {
                            }
                            final Tag tag = selectedTag;
                            rememberedValue6 = (Function1) new Function1<Tag, Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$2$6$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Tag tag2) {
                                    invoke2(tag2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Tag tag2) {
                                    Intrinsics.checkNotNullParameter(tag2, "tag");
                                    Function1<Tag, Unit> function19 = function18;
                                    Tag tag3 = tag;
                                    boolean z = false;
                                    if (tag3 != null && tag3.getTagId() == tag2.getTagId()) {
                                        z = true;
                                    }
                                    function19.invoke(z ? null : tag2);
                                }
                            };
                            $composer.updateRememberedValue(rememberedValue6);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endReplaceGroup();
                            function14 = (Function1) rememberedValue6;
                        }
                        HomeScreenKt.DhikrItemCard(dhikr, list, function0, function02, function03, function04, function05, function14, $composer, (i >> 3) & 14, 0);
                        $composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            return;
                        }
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    final Function1 function19 = onDelete;
                    Object obj4 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$2$5$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function19.invoke(dhikr);
                        }
                    };
                    $composer.updateRememberedValue(obj4);
                    rememberedValue5 = obj4;
                    Function0 function052 = (Function0) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (function1 != null) {
                    }
                    HomeScreenKt.DhikrItemCard(dhikr, list, function0, function02, function03, function04, function052, function14, $composer, (i >> 3) & 14, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                final Function1 function110 = onEdit;
                Object obj5 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$2$4$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function110.invoke(dhikr);
                    }
                };
                $composer.updateRememberedValue(obj5);
                rememberedValue4 = obj5;
                Function0 function042 = (Function0) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1864826284, "CC(remember):HomeScreen.kt#9igjgp");
                changed = $composer.changed(onDelete) | $composer.changedInstance(dhikr);
                Object rememberedValue52 = $composer.rememberedValue();
                if (!changed) {
                    Function0 function0522 = (Function0) rememberedValue52;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (function1 != null) {
                    }
                    HomeScreenKt.DhikrItemCard(dhikr, list, function0, function02, function03, function042, function0522, function14, $composer, (i >> 3) & 14, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                final Function1<? super Dhikr, Unit> function192 = onDelete;
                Object obj42 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$dhikrCards$2$5$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function192.invoke(dhikr);
                    }
                };
                $composer.updateRememberedValue(obj42);
                rememberedValue52 = obj42;
                Function0 function05222 = (Function0) rememberedValue52;
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (function1 != null) {
                }
                HomeScreenKt.DhikrItemCard(dhikr, list, function0, function02, function03, function042, function05222, function14, $composer, (i >> 3) & 14, 0);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object dhikrCards$lambda$51(Dhikr it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "d" + it.getId();
    }

    public static final void DhikrItemCard(final Dhikr dhikr, List<Tag> list, final Function0<Unit> onToggleEnabled, final Function0<Unit> onToggleFavorite, final Function0<Unit> onClickTimes, final Function0<Unit> onEditClick, final Function0<Unit> onDeleteClick, Function1<? super Tag, Unit> function1, Composer $composer, final int $changed, final int i) {
        List list2;
        Function1 function12;
        Composer $composer2;
        final List tags;
        final Function1 onTagClick;
        ColorScheme cs;
        Object mutableStateOf$default;
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(onToggleEnabled, "onToggleEnabled");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(onClickTimes, "onClickTimes");
        Intrinsics.checkNotNullParameter(onEditClick, "onEditClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Composer $composer3 = $composer.startRestartGroup(-1839065413);
        ComposerKt.sourceInformation($composer3, "C(DhikrItemCard)N(dhikr,tags,onToggleEnabled,onToggleFavorite,onClickTimes,onEditClick,onDeleteClick,onTagClick)205@7579L11,206@7607L34,207@7738L3487,207@7646L3579:HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(dhikr) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            list2 = list;
        } else if (($changed & 48) == 0) {
            list2 = list;
            $dirty |= $composer3.changedInstance(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onToggleEnabled) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onToggleFavorite) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onClickTimes) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onEditClick) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onDeleteClick) ? 1048576 : 524288;
        }
        int i3 = i & 128;
        if (i3 != 0) {
            $dirty |= 12582912;
            function12 = function1;
        } else if ((12582912 & $changed) == 0) {
            function12 = function1;
            $dirty |= $composer3.changedInstance(function12) ? 8388608 : 4194304;
        } else {
            function12 = function1;
        }
        if ($composer3.shouldExecute(($dirty & 4793491) != 4793490, $dirty & 1)) {
            final List tags2 = i2 != 0 ? CollectionsKt.emptyList() : list2;
            final Function1 onTagClick2 = i3 != 0 ? null : function12;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1839065413, $dirty, -1, "com.example.ui.screens.DhikrItemCard (HomeScreen.kt:204)");
            }
            ColorScheme cs2 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            ComposerKt.sourceInformationMarkerStart($composer3, -2110292291, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                cs = cs2;
                mutableStateOf$default = SnapshotStateKt.mutableStateOf(false, SnapshotStateKt.structuralEqualityPolicy());
                $composer3.updateRememberedValue(mutableStateOf$default);
                rememberedValue = mutableStateOf$default;
            } else {
                cs = cs2;
            }
            final MutableState menu$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ColorScheme cs3 = cs;
            List tags3 = tags2;
            Function1 onTagClick3 = onTagClick2;
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m726PaddingValuesa9UjIt4(Dp.m7226constructorimpl(18), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(18), Dp.m7226constructorimpl(10)), 0L, ComposableLambdaKt.rememberComposableLambda(674640294, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.DhikrItemCard$lambda$88(Dhikr.this, onClickTimes, cs3, onToggleEnabled, onToggleFavorite, tags2, onTagClick2, menu$delegate, onEditClick, onDeleteClick, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 24576, 11);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            tags = tags3;
            onTagClick = onTagClick3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            tags = list2;
            onTagClick = function12;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.DhikrItemCard$lambda$89(Dhikr.this, tags, onToggleEnabled, onToggleFavorite, onClickTimes, onEditClick, onDeleteClick, onTagClick, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean DhikrItemCard$lambda$61(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DhikrItemCard$lambda$62(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01df, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c55 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x082b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0567 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x089b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit DhikrItemCard$lambda$88(Dhikr $dhikr, final Function0 $onClickTimes, ColorScheme $cs, final Function0 $onToggleEnabled, Function0 $onToggleFavorite, List $tags, Function1 $onTagClick, final MutableState $menu$delegate, final Function0 $onEditClick, final Function0 $onDeleteClick, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        boolean changed;
        Composer composer2;
        Object rememberedValue;
        Function0 function02;
        Composer m3828constructorimpl;
        Function0 function03;
        Composer m3828constructorimpl2;
        Function0 function04;
        Composer m3828constructorimpl3;
        Function0 function05;
        Composer m3828constructorimpl4;
        Function0 function06;
        Composer m3828constructorimpl5;
        Object rememberedValue2;
        Object rememberedValue3;
        Modifier modifier;
        Modifier.Companion companion;
        Function0 function07;
        final Function1 function1 = $onTagClick;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C208@7748L377,218@8134L29,219@8223L24,220@8256L642,236@8907L30,237@8946L237,242@9192L2027:HomeScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674640294, $changed, -1, "com.example.ui.screens.DhikrItemCard.<anonymous> (HomeScreen.kt:208)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier2);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl6.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (Intrinsics.areEqual(m3828constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    Composer composer3 = composer;
                    String str = "C101@5126L9:Row.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i3 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1435558324, "C211@7887L10,209@7814L195,215@8022L29,216@8093L21,216@8064L51:HomeScreen.kt#2thlc2");
                    TextKt.m2816Text4IGK_g($dhikr.getTitle(), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, 0, 0, 65528);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer3, 6);
                    boolean isEnabled = $dhikr.isEnabled();
                    ComposerKt.sourceInformationMarkerStart(composer3, -2031893001, "CC(remember):HomeScreen.kt#9igjgp");
                    changed = composer3.changed($onToggleEnabled);
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (changed) {
                        composer2 = composer3;
                    } else {
                        composer2 = composer3;
                    }
                    rememberedValue4 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeScreenKt.DhikrItemCard$lambda$88$lambda$65$lambda$64$lambda$63(Function0.this, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Composer composer4 = composer2;
                    OneUIKt.OneUISwitch(isEnabled, (Function1) rememberedValue4, null, composer4, 0, 4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), $composer, 6);
                    List<String> reminderTimes = $dhikr.getReminderTimes();
                    ComposerKt.sourceInformationMarkerStart($composer, -210723618, "CC(remember):HomeScreen.kt#9igjgp");
                    rememberedValue = $composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomeScreenKt.DhikrItemCard$lambda$88$lambda$67$lambda$66((String) obj2);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        rememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    String times = CollectionsKt.joinToString$default(reminderTimes, r34, null, null, 0, null, (Function1) rememberedValue, 30, null);
                    Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(8))), false, null, null, $onClickTimes, 7, null), 0.0f, Dp.m7226constructorimpl(4), 1, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                    Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i5 = (i4 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i6 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1082936008, "C224@8456L195,229@8664L28,232@8772L10,230@8705L183:HomeScreen.kt#2thlc2");
                        IconKt.m2273Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), $composer, 432, 0);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
                        TextKt.m2816Text4IGK_g(times, (Modifier) null, !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                        Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16))), $cs.getSurfaceVariant(), null, 2, null), Dp.m7226constructorimpl(14));
                        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs);
                        Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                        Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i8 = (i7 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            int i9 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 114573614, "C240@9130L10,240@9088L85:HomeScreen.kt#2thlc2");
                            TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            Modifier m734paddingqDBjuR0$default = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(6), 0.0f, 0.0f, 13, null);
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default);
                            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            int i10 = ((((390 << 3) & 112) << 6) & 896) | 6;
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
                            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i11 = (i10 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i12 = ((390 >> 6) & 112) | 6;
                                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
                                Modifier weight$default = RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                Arrangement.Horizontal m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4, centerVertically4, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier($composer, weight$default);
                                Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                int i13 = ((((432 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                $composer.startReusableNode();
                                if ($composer.getInserting()) {
                                    function05 = constructor5;
                                    $composer.useNode();
                                } else {
                                    function05 = constructor5;
                                    $composer.createNode(function05);
                                }
                                m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl4.getInserting() && Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i14 = (i13 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    int i15 = ((432 >> 6) & 112) | 6;
                                    RowScope rowScope3 = RowScopeInstance.INSTANCE;
                                    Composer composer5 = $composer;
                                    ComposerKt.sourceInformationMarkerStart(composer5, -1213454859, "C:HomeScreen.kt#2thlc2");
                                    composer5.startReplaceGroup(-870427295);
                                    ComposerKt.sourceInformation(composer5, "*248@9531L612");
                                    Iterable<Tag> take = CollectionsKt.take($tags, 3);
                                    int i16 = 0;
                                    for (final Tag tag : take) {
                                        Iterable iterable = take;
                                        int i17 = i16;
                                        RowScope rowScope4 = rowScope3;
                                        Modifier clip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape());
                                        if (function1 != null) {
                                            composer5.startReplaceGroup(576030560);
                                            ComposerKt.sourceInformation(composer5, "250@9664L19");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer5, 576030870, "CC(remember):HomeScreen.kt#9igjgp");
                                            boolean changed2 = composer5.changed(function1) | composer5.changed(tag);
                                            Composer composer6 = composer5;
                                            Object rememberedValue5 = composer6.rememberedValue();
                                            if (changed2) {
                                                modifier = materializeModifier5;
                                            } else {
                                                modifier = materializeModifier5;
                                                if (rememberedValue5 != Composer.INSTANCE.getEmpty()) {
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    companion = ClickableKt.m264clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue5, 7, null);
                                                    composer5.endReplaceGroup();
                                                }
                                            }
                                            rememberedValue5 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda28
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$74$lambda$73$lambda$71$lambda$70(Function1.this, tag);
                                                }
                                            };
                                            composer6.updateRememberedValue(rememberedValue5);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            companion = ClickableKt.m264clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue5, 7, null);
                                            composer5.endReplaceGroup();
                                        } else {
                                            modifier = materializeModifier5;
                                            composer5.startReplaceGroup(576031659);
                                            composer5.endReplaceGroup();
                                            companion = Modifier.INSTANCE;
                                        }
                                        Modifier m732paddingVpY3zN4$default2 = PaddingKt.m732paddingVpY3zN4$default(clip.then(companion), 0.0f, Dp.m7226constructorimpl(6), 1, null);
                                        Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
                                        Composer composer7 = composer5;
                                        ComposerKt.sourceInformationMarkerStart(composer7, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically5, composer7, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                        ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                                        Composer composer8 = composer5;
                                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer7, m732paddingVpY3zN4$default2);
                                        Function0 constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                        int i18 = ((((384 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer7.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            function07 = constructor6;
                                            composer7.createNode(function07);
                                        } else {
                                            function07 = constructor6;
                                            composer7.useNode();
                                        }
                                        Composer m3828constructorimpl7 = Updater.m3828constructorimpl(composer7);
                                        Updater.m3835setimpl(m3828constructorimpl7, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3835setimpl(m3828constructorimpl7, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2 setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m3828constructorimpl7.getInserting() && Intrinsics.areEqual(m3828constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                            Updater.m3835setimpl(m3828constructorimpl7, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i19 = (i18 >> 6) & 14;
                                            ComposerKt.sourceInformationMarkerStart(composer7, -407840262, str);
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            int i20 = ((384 >> 6) & 112) | 6;
                                            ComposerKt.sourceInformationMarkerStart(composer7, -273183668, "C254@9873L83,255@9981L28,256@10071L10,256@10034L87:HomeScreen.kt#2thlc2");
                                            BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), RoundedCornerShapeKt.getCircleShape()), OneUIKt.m7688parseColorSafe4WTKRHQ$default(tag.getColorHex(), 0L, 2, null), null, 2, null), composer7, 0);
                                            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(5)), composer7, 6);
                                            TextKt.m2816Text4IGK_g(tag.getName(), (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getBodySmall(), composer7, 0, 0, 65530);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            composer7.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            function1 = $onTagClick;
                                            take = iterable;
                                            i16 = i17;
                                            rowScope3 = rowScope4;
                                            composer5 = composer8;
                                            materializeModifier5 = modifier;
                                            str = str;
                                        }
                                        m3828constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        m3828constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        Updater.m3835setimpl(m3828constructorimpl7, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i192 = (i18 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart(composer7, -407840262, str);
                                        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                                        int i202 = ((384 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer7, -273183668, "C254@9873L83,255@9981L28,256@10071L10,256@10034L87:HomeScreen.kt#2thlc2");
                                        BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), RoundedCornerShapeKt.getCircleShape()), OneUIKt.m7688parseColorSafe4WTKRHQ$default(tag.getColorHex(), 0L, 2, null), null, 2, null), composer7, 0);
                                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(5)), composer7, 6);
                                        TextKt.m2816Text4IGK_g(tag.getName(), (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getBodySmall(), composer7, 0, 0, 65530);
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                        composer7.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                        function1 = $onTagClick;
                                        take = iterable;
                                        i16 = i17;
                                        rowScope3 = rowScope4;
                                        composer5 = composer8;
                                        materializeModifier5 = modifier;
                                        str = str;
                                    }
                                    Composer composer9 = composer5;
                                    composer9.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    Modifier modifier3 = Modifier.INSTANCE;
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = $composer.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier($composer, modifier3);
                                    Function0 constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i21 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!($composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer.startReusableNode();
                                    if ($composer.getInserting()) {
                                        function06 = constructor7;
                                        $composer.useNode();
                                    } else {
                                        function06 = constructor7;
                                        $composer.createNode(function06);
                                    }
                                    m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                                    Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3828constructorimpl5.getInserting() && Intrinsics.areEqual(m3828constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i22 = (i21 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        int i23 = ((0 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                                        ImageVector moreVert = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                                        long onSurfaceVariant = $cs.getOnSurfaceVariant();
                                        Modifier clip2 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                                        ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                                        rememberedValue2 = $composer.rememberedValue();
                                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda29
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$76$lambda$75(MutableState.this);
                                                }
                                            };
                                            $composer.updateRememberedValue(rememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        IconKt.m2273Iconww6aTOc(moreVert, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip2, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant, $composer, 48, 0);
                                        boolean DhikrItemCard$lambda$61 = DhikrItemCard$lambda$61($menu$delegate);
                                        ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                                        rememberedValue3 = $composer.rememberedValue();
                                        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda30
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$78$lambda$77(MutableState.this);
                                                }
                                            };
                                            $composer.updateRememberedValue(rememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        OneUIKt.OneUIMenu(DhikrItemCard$lambda$61, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                            }
                                        }, $composer, 54), $composer, 432);
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
                                    m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                    m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i222 = (i21 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                    int i232 = ((0 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                                    ImageVector moreVert2 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                                    long onSurfaceVariant2 = $cs.getOnSurfaceVariant();
                                    Modifier clip22 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                                    ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                                    rememberedValue2 = $composer.rememberedValue();
                                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    IconKt.m2273Iconww6aTOc(moreVert2, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip22, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant2, $composer, 48, 0);
                                    boolean DhikrItemCard$lambda$612 = DhikrItemCard$lambda$61($menu$delegate);
                                    ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                                    rememberedValue3 = $composer.rememberedValue();
                                    if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    OneUIKt.OneUIMenu(DhikrItemCard$lambda$612, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                        }
                                    }, $composer, 54), $composer, 432);
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
                                int i142 = (i13 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i152 = ((432 >> 6) & 112) | 6;
                                RowScope rowScope32 = RowScopeInstance.INSTANCE;
                                Composer composer52 = $composer;
                                ComposerKt.sourceInformationMarkerStart(composer52, -1213454859, "C:HomeScreen.kt#2thlc2");
                                composer52.startReplaceGroup(-870427295);
                                ComposerKt.sourceInformation(composer52, "*248@9531L612");
                                Iterable<Tag> take2 = CollectionsKt.take($tags, 3);
                                int i162 = 0;
                                while (r59.hasNext()) {
                                }
                                Composer composer92 = composer52;
                                composer92.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer92);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                Modifier modifier32 = Modifier.INSTANCE;
                                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash72 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap72 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier72 = ComposedModifierKt.materializeModifier($composer, modifier32);
                                Function0 constructor72 = ComposeUiNode.INSTANCE.getConstructor();
                                int i212 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if ($composer.getInserting()) {
                                }
                                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl5.getInserting()) {
                                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i2222 = (i212 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                                    int i2322 = ((0 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                                    ImageVector moreVert22 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                                    long onSurfaceVariant22 = $cs.getOnSurfaceVariant();
                                    Modifier clip222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                                    ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                                    rememberedValue2 = $composer.rememberedValue();
                                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    IconKt.m2273Iconww6aTOc(moreVert22, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant22, $composer, 48, 0);
                                    boolean DhikrItemCard$lambda$6122 = DhikrItemCard$lambda$61($menu$delegate);
                                    ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                                    rememberedValue3 = $composer.rememberedValue();
                                    if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    OneUIKt.OneUIMenu(DhikrItemCard$lambda$6122, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                        }
                                    }, $composer, 54), $composer, 432);
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
                                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72));
                                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash72), setCompositeKeyHash72);
                                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                                int i22222 = (i212 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                                int i23222 = ((0 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                                ImageVector moreVert222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                                long onSurfaceVariant222 = $cs.getOnSurfaceVariant();
                                Modifier clip2222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                                ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                                rememberedValue2 = $composer.rememberedValue();
                                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                IconKt.m2273Iconww6aTOc(moreVert222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip2222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant222, $composer, 48, 0);
                                boolean DhikrItemCard$lambda$61222 = DhikrItemCard$lambda$61($menu$delegate);
                                ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                                rememberedValue3 = $composer.rememberedValue();
                                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                OneUIKt.OneUIMenu(DhikrItemCard$lambda$61222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                    }
                                }, $composer, 54), $composer, 432);
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
                            int i112 = (i10 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i122 = ((390 >> 6) & 112) | 6;
                            RowScope rowScope22 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
                            Modifier weight$default2 = RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null);
                            Arrangement.Horizontal m610spacedBy0680j_42 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                            Alignment.Vertical centerVertically42 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42, centerVertically42, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash52 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap52 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier($composer, weight$default2);
                            Function0 constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                            int i132 = ((((432 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if ($composer.getInserting()) {
                            }
                            m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl4.getInserting()) {
                                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                                int i1422 = (i132 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i1522 = ((432 >> 6) & 112) | 6;
                                RowScope rowScope322 = RowScopeInstance.INSTANCE;
                                Composer composer522 = $composer;
                                ComposerKt.sourceInformationMarkerStart(composer522, -1213454859, "C:HomeScreen.kt#2thlc2");
                                composer522.startReplaceGroup(-870427295);
                                ComposerKt.sourceInformation(composer522, "*248@9531L612");
                                Iterable<Tag> take22 = CollectionsKt.take($tags, 3);
                                int i1622 = 0;
                                while (r59.hasNext()) {
                                }
                                Composer composer922 = composer522;
                                composer922.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer922);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                Modifier modifier322 = Modifier.INSTANCE;
                                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash722 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap722 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier722 = ComposedModifierKt.materializeModifier($composer, modifier322);
                                Function0 constructor722 = ComposeUiNode.INSTANCE.getConstructor();
                                int i2122 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if ($composer.getInserting()) {
                                }
                                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl5.getInserting()) {
                                }
                                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722));
                                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash722), setCompositeKeyHash722);
                                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
                                int i222222 = (i2122 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                                int i232222 = ((0 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                                ImageVector moreVert2222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                                long onSurfaceVariant2222 = $cs.getOnSurfaceVariant();
                                Modifier clip22222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                                ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                                rememberedValue2 = $composer.rememberedValue();
                                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                IconKt.m2273Iconww6aTOc(moreVert2222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip22222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant2222, $composer, 48, 0);
                                boolean DhikrItemCard$lambda$612222 = DhikrItemCard$lambda$61($menu$delegate);
                                ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                                rememberedValue3 = $composer.rememberedValue();
                                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                OneUIKt.OneUIMenu(DhikrItemCard$lambda$612222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                    }
                                }, $composer, 54), $composer, 432);
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
                            int i14222 = (i132 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i15222 = ((432 >> 6) & 112) | 6;
                            RowScope rowScope3222 = RowScopeInstance.INSTANCE;
                            Composer composer5222 = $composer;
                            ComposerKt.sourceInformationMarkerStart(composer5222, -1213454859, "C:HomeScreen.kt#2thlc2");
                            composer5222.startReplaceGroup(-870427295);
                            ComposerKt.sourceInformation(composer5222, "*248@9531L612");
                            Iterable<Tag> take222 = CollectionsKt.take($tags, 3);
                            int i16222 = 0;
                            while (r59.hasNext()) {
                            }
                            Composer composer9222 = composer5222;
                            composer9222.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer9222);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            Modifier modifier3222 = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash7222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap7222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier7222 = ComposedModifierKt.materializeModifier($composer, modifier3222);
                            Function0 constructor7222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i21222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if ($composer.getInserting()) {
                            }
                            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap7222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash7222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl5.getInserting()) {
                            }
                            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222));
                            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash7222), setCompositeKeyHash7222);
                            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier7222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i2222222 = (i21222 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                            int i2322222 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                            ImageVector moreVert22222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                            long onSurfaceVariant22222 = $cs.getOnSurfaceVariant();
                            Modifier clip222222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                            ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                            rememberedValue2 = $composer.rememberedValue();
                            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            IconKt.m2273Iconww6aTOc(moreVert22222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip222222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant22222, $composer, 48, 0);
                            boolean DhikrItemCard$lambda$6122222 = DhikrItemCard$lambda$61($menu$delegate);
                            ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                            rememberedValue3 = $composer.rememberedValue();
                            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            OneUIKt.OneUIMenu(DhikrItemCard$lambda$6122222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                }
                            }, $composer, 54), $composer, 432);
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
                        int i82 = (i7 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        int i92 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 114573614, "C240@9130L10,240@9088L85:HomeScreen.kt#2thlc2");
                        TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Modifier m734paddingqDBjuR0$default2 = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(6), 0.0f, 0.0f, 13, null);
                        Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default2);
                        Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        int i102 = ((((390 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting()) {
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1122 = (i102 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i1222 = ((390 >> 6) & 112) | 6;
                            RowScope rowScope222 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
                            Modifier weight$default22 = RowScope.CC.weight$default(rowScope222, Modifier.INSTANCE, 1.0f, false, 2, null);
                            Arrangement.Horizontal m610spacedBy0680j_422 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                            Alignment.Vertical centerVertically422 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy422 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422, centerVertically422, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash522 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap522 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier522 = ComposedModifierKt.materializeModifier($composer, weight$default22);
                            Function0 constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                            int i1322 = ((((432 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if ($composer.getInserting()) {
                            }
                            m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl4.getInserting()) {
                            }
                            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash522));
                            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash522), setCompositeKeyHash522);
                            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                            int i142222 = (i1322 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i152222 = ((432 >> 6) & 112) | 6;
                            RowScope rowScope32222 = RowScopeInstance.INSTANCE;
                            Composer composer52222 = $composer;
                            ComposerKt.sourceInformationMarkerStart(composer52222, -1213454859, "C:HomeScreen.kt#2thlc2");
                            composer52222.startReplaceGroup(-870427295);
                            ComposerKt.sourceInformation(composer52222, "*248@9531L612");
                            Iterable<Tag> take2222 = CollectionsKt.take($tags, 3);
                            int i162222 = 0;
                            while (r59.hasNext()) {
                            }
                            Composer composer92222 = composer52222;
                            composer92222.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer92222);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            Modifier modifier32222 = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash72222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap72222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier72222 = ComposedModifierKt.materializeModifier($composer, modifier32222);
                            Function0 constructor72222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i212222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if ($composer.getInserting()) {
                            }
                            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap72222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash72222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl5.getInserting()) {
                            }
                            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222));
                            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash72222), setCompositeKeyHash72222);
                            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier72222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i22222222 = (i212222 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
                            int i23222222 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                            ImageVector moreVert222222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                            long onSurfaceVariant222222 = $cs.getOnSurfaceVariant();
                            Modifier clip2222222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                            ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                            rememberedValue2 = $composer.rememberedValue();
                            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            IconKt.m2273Iconww6aTOc(moreVert222222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip2222222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant222222, $composer, 48, 0);
                            boolean DhikrItemCard$lambda$61222222 = DhikrItemCard$lambda$61($menu$delegate);
                            ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                            rememberedValue3 = $composer.rememberedValue();
                            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            OneUIKt.OneUIMenu(DhikrItemCard$lambda$61222222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                }
                            }, $composer, 54), $composer, 432);
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
                        int i11222 = (i102 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i12222 = ((390 >> 6) & 112) | 6;
                        RowScope rowScope2222 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
                        Modifier weight$default222 = RowScope.CC.weight$default(rowScope2222, Modifier.INSTANCE, 1.0f, false, 2, null);
                        Arrangement.Horizontal m610spacedBy0680j_4222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                        Alignment.Vertical centerVertically4222 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy4222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222, centerVertically4222, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap5222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier($composer, weight$default222);
                        Function0 constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i13222 = ((((432 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl4.getInserting()) {
                        }
                        m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5222));
                        m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5222), setCompositeKeyHash5222);
                        Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1422222 = (i13222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i1522222 = ((432 >> 6) & 112) | 6;
                        RowScope rowScope322222 = RowScopeInstance.INSTANCE;
                        Composer composer522222 = $composer;
                        ComposerKt.sourceInformationMarkerStart(composer522222, -1213454859, "C:HomeScreen.kt#2thlc2");
                        composer522222.startReplaceGroup(-870427295);
                        ComposerKt.sourceInformation(composer522222, "*248@9531L612");
                        Iterable<Tag> take22222 = CollectionsKt.take($tags, 3);
                        int i1622222 = 0;
                        while (r59.hasNext()) {
                        }
                        Composer composer922222 = composer522222;
                        composer922222.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer922222);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        Modifier modifier322222 = Modifier.INSTANCE;
                        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash722222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap722222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier722222 = ComposedModifierKt.materializeModifier($composer, modifier322222);
                        Function0 constructor722222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i2122222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap722222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash722222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl5.getInserting()) {
                        }
                        m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222));
                        m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash722222), setCompositeKeyHash722222);
                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier722222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i222222222 = (i2122222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22222222 = BoxScopeInstance.INSTANCE;
                        int i232222222 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                        ImageVector moreVert2222222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                        long onSurfaceVariant2222222 = $cs.getOnSurfaceVariant();
                        Modifier clip22222222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                        ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                        rememberedValue2 = $composer.rememberedValue();
                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        IconKt.m2273Iconww6aTOc(moreVert2222222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip22222222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant2222222, $composer, 48, 0);
                        boolean DhikrItemCard$lambda$612222222 = DhikrItemCard$lambda$61($menu$delegate);
                        ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                        rememberedValue3 = $composer.rememberedValue();
                        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        OneUIKt.OneUIMenu(DhikrItemCard$lambda$612222222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                            }
                        }, $composer, 54), $composer, 432);
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
                    int i52 = (i4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    int i62 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1082936008, "C224@8456L195,229@8664L28,232@8772L10,230@8705L183:HomeScreen.kt#2thlc2");
                    if (!$dhikr.isEnabled()) {
                    }
                    IconKt.m2273Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), $composer, 432, 0);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
                    TextKt.m2816Text4IGK_g(times, (Modifier) null, !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                    Modifier m730padding3ABfNKs2 = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16))), $cs.getSurfaceVariant(), null, 2, null), Dp.m7226constructorimpl(14));
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs2);
                    Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    int i72 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl2.getInserting()) {
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        int i822 = (i72 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                        int i922 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 114573614, "C240@9130L10,240@9088L85:HomeScreen.kt#2thlc2");
                        TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Modifier m734paddingqDBjuR0$default22 = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(6), 0.0f, 0.0f, 13, null);
                        Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default22);
                        Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                        int i1022 = ((((390 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting()) {
                        }
                        m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422));
                        m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422), setCompositeKeyHash422);
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                        int i112222 = (i1022 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i122222 = ((390 >> 6) & 112) | 6;
                        RowScope rowScope22222 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
                        Modifier weight$default2222 = RowScope.CC.weight$default(rowScope22222, Modifier.INSTANCE, 1.0f, false, 2, null);
                        Arrangement.Horizontal m610spacedBy0680j_42222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                        Alignment.Vertical centerVertically42222 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy42222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222, centerVertically42222, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash52222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap52222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier($composer, weight$default2222);
                        Function0 constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i132222 = ((((432 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy42222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl4.getInserting()) {
                        }
                        m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash52222));
                        m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash52222), setCompositeKeyHash52222);
                        Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i14222222 = (i132222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i15222222 = ((432 >> 6) & 112) | 6;
                        RowScope rowScope3222222 = RowScopeInstance.INSTANCE;
                        Composer composer5222222 = $composer;
                        ComposerKt.sourceInformationMarkerStart(composer5222222, -1213454859, "C:HomeScreen.kt#2thlc2");
                        composer5222222.startReplaceGroup(-870427295);
                        ComposerKt.sourceInformation(composer5222222, "*248@9531L612");
                        Iterable<Tag> take222222 = CollectionsKt.take($tags, 3);
                        int i16222222 = 0;
                        while (r59.hasNext()) {
                        }
                        Composer composer9222222 = composer5222222;
                        composer9222222.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer9222222);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        Modifier modifier3222222 = Modifier.INSTANCE;
                        MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash7222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap7222222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier7222222 = ComposedModifierKt.materializeModifier($composer, modifier3222222);
                        Function0 constructor7222222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i21222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                        }
                        m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap7222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash7222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl5.getInserting()) {
                        }
                        m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222222));
                        m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash7222222), setCompositeKeyHash7222222);
                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier7222222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i2222222222 = (i21222222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance222222222 = BoxScopeInstance.INSTANCE;
                        int i2322222222 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                        ImageVector moreVert22222222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                        long onSurfaceVariant22222222 = $cs.getOnSurfaceVariant();
                        Modifier clip222222222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                        ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                        rememberedValue2 = $composer.rememberedValue();
                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        IconKt.m2273Iconww6aTOc(moreVert22222222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip222222222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant22222222, $composer, 48, 0);
                        boolean DhikrItemCard$lambda$6122222222 = DhikrItemCard$lambda$61($menu$delegate);
                        ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                        rememberedValue3 = $composer.rememberedValue();
                        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        OneUIKt.OneUIMenu(DhikrItemCard$lambda$6122222222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                            }
                        }, $composer, 54), $composer, 432);
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
                    int i8222 = (i72 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                    int i9222 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 114573614, "C240@9130L10,240@9088L85:HomeScreen.kt#2thlc2");
                    TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier m734paddingqDBjuR0$default222 = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(6), 0.0f, 0.0f, 13, null);
                    Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default222);
                    Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i10222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4222));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4222), setCompositeKeyHash4222);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1122222 = (i10222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i1222222 = ((390 >> 6) & 112) | 6;
                    RowScope rowScope222222 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
                    Modifier weight$default22222 = RowScope.CC.weight$default(rowScope222222, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Arrangement.Horizontal m610spacedBy0680j_422222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                    Alignment.Vertical centerVertically422222 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy422222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222, centerVertically422222, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash522222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap522222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier522222 = ComposedModifierKt.materializeModifier($composer, weight$default22222);
                    Function0 constructor522222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1322222 = ((((432 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy422222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap522222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash522222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl4.getInserting()) {
                    }
                    m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash522222));
                    m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash522222), setCompositeKeyHash522222);
                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier522222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i142222222 = (i1322222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i152222222 = ((432 >> 6) & 112) | 6;
                    RowScope rowScope32222222 = RowScopeInstance.INSTANCE;
                    Composer composer52222222 = $composer;
                    ComposerKt.sourceInformationMarkerStart(composer52222222, -1213454859, "C:HomeScreen.kt#2thlc2");
                    composer52222222.startReplaceGroup(-870427295);
                    ComposerKt.sourceInformation(composer52222222, "*248@9531L612");
                    Iterable<Tag> take2222222 = CollectionsKt.take($tags, 3);
                    int i162222222 = 0;
                    while (r59.hasNext()) {
                    }
                    Composer composer92222222 = composer52222222;
                    composer92222222.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer92222222);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    Modifier modifier32222222 = Modifier.INSTANCE;
                    MeasurePolicy maybeCachedBoxMeasurePolicy22222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash72222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap72222222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier72222222 = ComposedModifierKt.materializeModifier($composer, modifier32222222);
                    Function0 constructor72222222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i212222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap72222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash72222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl5.getInserting()) {
                    }
                    m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222222));
                    m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash72222222), setCompositeKeyHash72222222);
                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier72222222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i22222222222 = (i212222222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2222222222 = BoxScopeInstance.INSTANCE;
                    int i23222222222 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                    ImageVector moreVert222222222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                    long onSurfaceVariant222222222 = $cs.getOnSurfaceVariant();
                    Modifier clip2222222222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                    ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                    rememberedValue2 = $composer.rememberedValue();
                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    IconKt.m2273Iconww6aTOc(moreVert222222222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip2222222222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant222222222, $composer, 48, 0);
                    boolean DhikrItemCard$lambda$61222222222 = DhikrItemCard$lambda$61($menu$delegate);
                    ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                    rememberedValue3 = $composer.rememberedValue();
                    if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    OneUIKt.OneUIMenu(DhikrItemCard$lambda$61222222222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                        }
                    }, $composer, 54), $composer, 432);
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
            m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i24 = (i >> 6) & 14;
            Composer composer32 = composer;
            String str2 = "C101@5126L9:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer32, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i32 = ((384 >> 6) & 112) | 6;
            RowScope rowScope5 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer32, 1435558324, "C211@7887L10,209@7814L195,215@8022L29,216@8093L21,216@8064L51:HomeScreen.kt#2thlc2");
            TextKt.m2816Text4IGK_g($dhikr.getTitle(), RowScope.CC.weight$default(rowScope5, Modifier.INSTANCE, 1.0f, false, 2, null), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer32, MaterialTheme.$stable).getTitleMedium(), composer32, 0, 0, 65528);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer32, 6);
            boolean isEnabled2 = $dhikr.isEnabled();
            ComposerKt.sourceInformationMarkerStart(composer32, -2031893001, "CC(remember):HomeScreen.kt#9igjgp");
            changed = composer32.changed($onToggleEnabled);
            Object rememberedValue42 = composer32.rememberedValue();
            if (changed) {
            }
            rememberedValue42 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HomeScreenKt.DhikrItemCard$lambda$88$lambda$65$lambda$64$lambda$63(Function0.this, ((Boolean) obj2).booleanValue());
                }
            };
            composer32.updateRememberedValue(rememberedValue42);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Composer composer42 = composer2;
            OneUIKt.OneUISwitch(isEnabled2, (Function1) rememberedValue42, null, composer42, 0, 4);
            ComposerKt.sourceInformationMarkerEnd(composer42);
            ComposerKt.sourceInformationMarkerEnd(composer32);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), $composer, 6);
            List<String> reminderTimes2 = $dhikr.getReminderTimes();
            ComposerKt.sourceInformationMarkerStart($composer, -210723618, "CC(remember):HomeScreen.kt#9igjgp");
            rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            String times2 = CollectionsKt.joinToString$default(reminderTimes2, r34, null, null, 0, null, (Function1) rememberedValue, 30, null);
            Modifier m732paddingVpY3zN4$default3 = PaddingKt.m732paddingVpY3zN4$default(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(8))), false, null, null, $onClickTimes, 7, null), 0.0f, Dp.m7226constructorimpl(4), 1, null);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default3);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i522 = (i42 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                int i622 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1082936008, "C224@8456L195,229@8664L28,232@8772L10,230@8705L183:HomeScreen.kt#2thlc2");
                if (!$dhikr.isEnabled()) {
                }
                IconKt.m2273Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), $composer, 432, 0);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
                TextKt.m2816Text4IGK_g(times2, (Modifier) null, !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                Modifier m730padding3ABfNKs22 = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16))), $cs.getSurfaceVariant(), null, 2, null), Dp.m7226constructorimpl(14));
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs22);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i722 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i82222 = (i722 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                int i92222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 114573614, "C240@9130L10,240@9088L85:HomeScreen.kt#2thlc2");
                TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier m734paddingqDBjuR0$default2222 = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(6), 0.0f, 0.0f, 13, null);
                Alignment.Vertical centerVertically32222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy32222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default2222);
                Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                int i102222 = ((((390 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42222), setCompositeKeyHash42222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                int i11222222 = (i102222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i12222222 = ((390 >> 6) & 112) | 6;
                RowScope rowScope2222222 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
                Modifier weight$default222222 = RowScope.CC.weight$default(rowScope2222222, Modifier.INSTANCE, 1.0f, false, 2, null);
                Arrangement.Horizontal m610spacedBy0680j_4222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                Alignment.Vertical centerVertically4222222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy4222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222222, centerVertically4222222, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap5222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5222222 = ComposedModifierKt.materializeModifier($composer, weight$default222222);
                Function0 constructor5222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i13222222 = ((((432 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy4222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl4.getInserting()) {
                }
                m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5222222));
                m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5222222), setCompositeKeyHash5222222);
                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i1422222222 = (i13222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i1522222222 = ((432 >> 6) & 112) | 6;
                RowScope rowScope322222222 = RowScopeInstance.INSTANCE;
                Composer composer522222222 = $composer;
                ComposerKt.sourceInformationMarkerStart(composer522222222, -1213454859, "C:HomeScreen.kt#2thlc2");
                composer522222222.startReplaceGroup(-870427295);
                ComposerKt.sourceInformation(composer522222222, "*248@9531L612");
                Iterable<Tag> take22222222 = CollectionsKt.take($tags, 3);
                int i1622222222 = 0;
                while (r59.hasNext()) {
                }
                Composer composer922222222 = composer522222222;
                composer922222222.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer922222222);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Modifier modifier322222222 = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash722222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap722222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier722222222 = ComposedModifierKt.materializeModifier($composer, modifier322222222);
                Function0 constructor722222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i2122222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap722222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash722222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl5.getInserting()) {
                }
                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222222));
                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash722222222), setCompositeKeyHash722222222);
                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier722222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i222222222222 = (i2122222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22222222222 = BoxScopeInstance.INSTANCE;
                int i232222222222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
                ImageVector moreVert2222222222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
                long onSurfaceVariant2222222222 = $cs.getOnSurfaceVariant();
                Modifier clip22222222222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
                rememberedValue2 = $composer.rememberedValue();
                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconKt.m2273Iconww6aTOc(moreVert2222222222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip22222222222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant2222222222, $composer, 48, 0);
                boolean DhikrItemCard$lambda$612222222222 = DhikrItemCard$lambda$61($menu$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
                rememberedValue3 = $composer.rememberedValue();
                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                OneUIKt.OneUIMenu(DhikrItemCard$lambda$612222222222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), $composer, 432);
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
            int i5222 = (i42 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
            int i6222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1082936008, "C224@8456L195,229@8664L28,232@8772L10,230@8705L183:HomeScreen.kt#2thlc2");
            if (!$dhikr.isEnabled()) {
            }
            IconKt.m2273Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
            TextKt.m2816Text4IGK_g(times2, (Modifier) null, !$dhikr.isEnabled() ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
            Modifier m730padding3ABfNKs222 = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16))), $cs.getSurfaceVariant(), null, 2, null), Dp.m7226constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i7222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i822222 = (i7222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
            int i922222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 114573614, "C240@9130L10,240@9088L85:HomeScreen.kt#2thlc2");
            TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier m734paddingqDBjuR0$default22222 = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(6), 0.0f, 0.0f, 13, null);
            Alignment.Vertical centerVertically322222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy322222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322222, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash422222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier($composer, m734paddingqDBjuR0$default22222);
            Function0 constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            int i1022222 = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422222));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422222), setCompositeKeyHash422222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
            int i112222222 = (i1022222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i122222222 = ((390 >> 6) & 112) | 6;
            RowScope rowScope22222222 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -922510231, "C246@9337L838,260@10188L342,266@10543L666:HomeScreen.kt#2thlc2");
            Modifier weight$default2222222 = RowScope.CC.weight$default(rowScope22222222, Modifier.INSTANCE, 1.0f, false, 2, null);
            Arrangement.Horizontal m610spacedBy0680j_42222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
            Alignment.Vertical centerVertically42222222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy42222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222222, centerVertically42222222, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash52222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap52222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier52222222 = ComposedModifierKt.materializeModifier($composer, weight$default2222222);
            Function0 constructor52222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i132222222 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy42222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash52222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl4.getInserting()) {
            }
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash52222222));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash52222222), setCompositeKeyHash52222222);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i14222222222 = (i132222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i15222222222 = ((432 >> 6) & 112) | 6;
            RowScope rowScope3222222222 = RowScopeInstance.INSTANCE;
            Composer composer5222222222 = $composer;
            ComposerKt.sourceInformationMarkerStart(composer5222222222, -1213454859, "C:HomeScreen.kt#2thlc2");
            composer5222222222.startReplaceGroup(-870427295);
            ComposerKt.sourceInformation(composer5222222222, "*248@9531L612");
            Iterable<Tag> take222222222 = CollectionsKt.take($tags, 3);
            int i16222222222 = 0;
            while (r59.hasNext()) {
            }
            Composer composer9222222222 = composer5222222222;
            composer9222222222.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer9222222222);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconKt.m2273Iconww6aTOc(!$dhikr.isFavorite() ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onToggleFavorite, 7, null), Dp.m7226constructorimpl(10)), !$dhikr.isFavorite() ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier3222222222 = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy2222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash7222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap7222222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier7222222222 = ComposedModifierKt.materializeModifier($composer, modifier3222222222);
            Function0 constructor7222222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i21222222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl5, maybeCachedBoxMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap7222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash7222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl5.getInserting()) {
            }
            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222222222));
            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash7222222222), setCompositeKeyHash7222222222);
            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier7222222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i2222222222222 = (i21222222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222222222222 = BoxScopeInstance.INSTANCE;
            int i2322222222222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1976372617, "C269@10734L15,267@10565L217,271@10815L16,271@10833L362,271@10799L396:HomeScreen.kt#2thlc2");
            ImageVector moreVert22222222222 = MoreVertKt.getMoreVert(Icons.Outlined.INSTANCE);
            long onSurfaceVariant22222222222 = $cs.getOnSurfaceVariant();
            Modifier clip222222222222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
            ComposerKt.sourceInformationMarkerStart($composer, -1321714573, "CC(remember):HomeScreen.kt#9igjgp");
            rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconKt.m2273Iconww6aTOc(moreVert22222222222, "خيارات", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip222222222222, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(10)), onSurfaceVariant22222222222, $composer, 48, 0);
            boolean DhikrItemCard$lambda$6122222222222 = DhikrItemCard$lambda$61($menu$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1321711980, "CC(remember):HomeScreen.kt#9igjgp");
            rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUIMenu(DhikrItemCard$lambda$6122222222222, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(1236587400, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(Function0.this, $onClickTimes, $onDeleteClick, $menu$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 432);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$65$lambda$64$lambda$63(Function0 $onToggleEnabled, boolean it) {
        $onToggleEnabled.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final CharSequence DhikrItemCard$lambda$88$lambda$67$lambda$66(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DateTimeUtilsKt.formatTimeStr12h(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$87$lambda$74$lambda$73$lambda$71$lambda$70(Function1 $onTagClick, Tag $tag) {
        $onTagClick.invoke($tag);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$76$lambda$75(MutableState $menu$delegate) {
        DhikrItemCard$lambda$62($menu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$78$lambda$77(MutableState $menu$delegate) {
        DhikrItemCard$lambda$62($menu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85(final Function0 $onEditClick, final Function0 $onClickTimes, final Function0 $onDeleteClick, final MutableState $menu$delegate, ColumnScope OneUIMenu, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIMenu, "$this$OneUIMenu");
        ComposerKt.sourceInformation($composer, "C272@10895L31,272@10855L93,273@11000L32,273@10969L89,274@11100L33,274@11079L98:HomeScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236587400, $changed, -1, "com.example.ui.screens.DhikrItemCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:272)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1345447577, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed = $composer.changed($onEditClick);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85$lambda$80$lambda$79(Function0.this, $menu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUIMenuItem("تعديل الذكر والتصنيفات", (Function0) rememberedValue, EditKt.getEdit(Icons.Outlined.INSTANCE), false, $composer, 6, 8);
            ComposerKt.sourceInformationMarkerStart($composer, -1345444216, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed2 = $composer.changed($onClickTimes);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85$lambda$82$lambda$81(Function0.this, $menu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUIMenuItem("أوقات التنبيه", (Function0) rememberedValue2, ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), false, $composer, 6, 8);
            ComposerKt.sourceInformationMarkerStart($composer, -1345441015, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed3 = $composer.changed($onDeleteClick);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84$lambda$83(Function0.this, $menu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                rememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUIMenuItem("حذف", (Function0) rememberedValue3, DeleteKt.getDelete(Icons.Outlined.INSTANCE), true, $composer, 3078, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85$lambda$80$lambda$79(Function0 $onEditClick, MutableState $menu$delegate) {
        DhikrItemCard$lambda$62($menu$delegate, false);
        $onEditClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85$lambda$82$lambda$81(Function0 $onClickTimes, MutableState $menu$delegate) {
        DhikrItemCard$lambda$62($menu$delegate, false);
        $onClickTimes.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrItemCard$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84$lambda$83(Function0 $onDeleteClick, MutableState $menu$delegate) {
        DhikrItemCard$lambda$62($menu$delegate, false);
        $onDeleteClick.invoke();
        return Unit.INSTANCE;
    }
}
