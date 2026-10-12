package com.example.ui.hisn;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.outlined.CheckKt;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.material.icons.outlined.NotificationAddKt;
import androidx.compose.material.icons.outlined.SearchKt;
import androidx.compose.material.icons.outlined.StarBorderKt;
import androidx.compose.material.icons.outlined.TouchAppKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.example.data.HisnChapter;
import com.example.data.HisnFavorite;
import com.example.data.HisnItem;
import com.example.ui.oneui.OneUIKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: HisnScreens.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\u001a\u0085\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0003¢\u0006\u0002\u0010\u001c\u001a\u0085\u0001\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0007¢\u0006\u0002\u0010&\u001a+\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0007¢\u0006\u0002\u0010)\u001a;\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010-\u001ac\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001226\u0010%\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0013\u0012\u00110\f¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\b00H\u0007¢\u0006\u0002\u00105¨\u00066²\u0006\n\u00107\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u008a\u0084\u0002²\u0006\u0016\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170;X\u008a\u0084\u0002²\u0006\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170 X\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0001X\u008a\u0084\u0002"}, d2 = {"filterChapters", "", "Lcom/example/data/HisnChapter;", "s", "Lcom/example/ui/hisn/HisnListState;", "items", "Lcom/example/data/HisnItem;", "HisnListContent", "", "state", "onQuery", "Lkotlin/Function1;", "", "onOnlyFavorites", "", "onOpen", "onToggleFavorite", "onMenu", "Lkotlin/Function0;", "(Lcom/example/ui/hisn/HisnListState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ChapterRow", "chapter", "count", "", "favorite", "read", "onClick", "onFavorite", "(Lcom/example/data/HisnChapter;IZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HisnChapterContent", "favoriteChapter", "favoriteItemIds", "", "onBack", "onToggleChapterFavorite", "onToggleItemFavorite", "onMarkRead", "onAddToMyAzkar", "(Lcom/example/data/HisnChapter;Ljava/util/List;ZLjava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HisnItemCard", "item", "(Lcom/example/data/HisnItem;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HisnListScreen", "viewModel", "Lcom/example/ui/hisn/HisnViewModel;", "(Lcom/example/ui/hisn/HisnViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "HisnChapterScreen", "chapterId", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "title", "content", "(ILcom/example/ui/hisn/HisnViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app", "remaining", "showFadl", "chapters", "counts", "", "favs", "Lcom/example/data/HisnFavorite;", "query", "only", "all"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HisnScreensKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChapterRow$lambda$29(HisnChapter hisnChapter, int i, boolean z, boolean z2, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        ChapterRow(hisnChapter, i, z, z2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterContent$lambda$38(HisnChapter hisnChapter, List list, boolean z, Set set, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, int i, Composer composer, int i2) {
        HisnChapterContent(hisnChapter, list, z, set, function0, function02, function1, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterScreen$lambda$74(int i, HisnViewModel hisnViewModel, Function0 function0, Function2 function2, int i2, Composer composer, int i3) {
        HisnChapterScreen(i, hisnViewModel, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterScreen$lambda$89(int i, HisnViewModel hisnViewModel, Function0 function0, Function2 function2, int i2, Composer composer, int i3) {
        HisnChapterScreen(i, hisnViewModel, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnItemCard$lambda$55(HisnItem hisnItem, boolean z, Function0 function0, int i, Composer composer, int i2) {
        HisnItemCard(hisnItem, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$25(HisnListState hisnListState, List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i, int i2, Composer composer, int i3) {
        HisnListContent(hisnListState, list, function1, function12, function13, function14, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListScreen$lambda$69(HisnViewModel hisnViewModel, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        HisnListScreen(hisnViewModel, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final List<HisnChapter> filterChapters(HisnListState s, List<HisnItem> items) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(items, "items");
        String q = HisnViewModelKt.normalizeArabic(StringsKt.trim((CharSequence) s.getQuery()).toString());
        List list = s.getChapters();
        if (s.getOnlyFavorites()) {
            Collection arrayList = new ArrayList();
            for (Object obj : list) {
                if (s.getFavoriteChapterIds().contains(Integer.valueOf(((HisnChapter) obj).getId()))) {
                    arrayList.add(obj);
                }
            }
            list = (List) arrayList;
        }
        if (StringsKt.isBlank(q)) {
            return list;
        }
        Collection arrayList2 = new ArrayList();
        for (Object obj2 : items) {
            String q2 = q;
            if (StringsKt.contains$default((CharSequence) HisnViewModelKt.normalizeArabic(((HisnItem) obj2).getText()), (CharSequence) q2, false, 2, (Object) null)) {
                arrayList2.add(obj2);
            }
            q = q2;
        }
        String q3 = q;
        Iterable iterable = (List) arrayList2;
        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((HisnItem) it.next()).getChapterId()));
        }
        Set hitIds = CollectionsKt.toSet((List) arrayList3);
        Iterable iterable2 = list;
        Collection arrayList4 = new ArrayList();
        for (Object obj3 : iterable2) {
            HisnChapter hisnChapter = (HisnChapter) obj3;
            Iterable iterable3 = iterable2;
            if (StringsKt.contains$default((CharSequence) HisnViewModelKt.normalizeArabic(hisnChapter.getName()), (CharSequence) q3, false, 2, (Object) null) || hitIds.contains(Integer.valueOf(hisnChapter.getId()))) {
                arrayList4.add(obj3);
            }
            iterable2 = iterable3;
        }
        return (List) arrayList4;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HisnListContent(final HisnListState state, final List<HisnItem> items, final Function1<? super String, Unit> onQuery, final Function1<? super Boolean, Unit> onOnlyFavorites, final Function1<? super HisnChapter, Unit> onOpen, final Function1<? super HisnChapter, Unit> onToggleFavorite, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        Composer $composer2;
        Function0 onMenu;
        List filtered;
        int $dirty;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onQuery, "onQuery");
        Intrinsics.checkNotNullParameter(onOnlyFavorites, "onOnlyFavorites");
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Composer $composer3 = $composer.startRestartGroup(801559718);
        ComposerKt.sourceInformation($composer3, "C(HisnListContent)N(state,items,onQuery,onOnlyFavorites,onOpen,onToggleFavorite,onMenu)65@2438L55,70@2682L1413,66@2498L1597:HisnScreens.kt#9egyij");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(items) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onQuery) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changedInstance(onOnlyFavorites) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer3.changedInstance(onOpen) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty2 |= $composer3.changedInstance(onToggleFavorite) ? 131072 : 65536;
        }
        int i2 = i & 64;
        if (i2 != 0) {
            $dirty2 |= 1572864;
            function02 = function0;
        } else if ((1572864 & $changed) == 0) {
            function02 = function0;
            $dirty2 |= $composer3.changedInstance(function02) ? 1048576 : 524288;
        } else {
            function02 = function0;
        }
        if ($composer3.shouldExecute(($dirty2 & 599187) != 599186, $dirty2 & 1)) {
            if (i2 != 0) {
                onMenu = null;
            } else {
                onMenu = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(801559718, $dirty2, -1, "com.example.ui.hisn.HisnListContent (HisnScreens.kt:64)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1499752445, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changed = $composer3.changed(state) | $composer3.changed(items);
            Object rememberedValue = $composer3.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object filterChapters = filterChapters(state, items);
                $composer3.updateRememberedValue(filterChapters);
                rememberedValue = filterChapters;
            }
            List filtered2 = (List) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            String str = state.getChapters().isEmpty() ? null : state.getChapters().size() + " بابًا من الأذكار والأدعية";
            ComposerKt.sourceInformationMarkerStart($composer3, 1499761611, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance = $composer3.changedInstance(state) | (($dirty2 & 896) == 256) | (($dirty2 & 7168) == 2048) | $composer3.changedInstance(filtered2) | (($dirty2 & 57344) == 16384) | ((458752 & $dirty2) == 131072);
            Object rememberedValue2 = $composer3.rememberedValue();
            if (changedInstance) {
                filtered = filtered2;
            } else {
                filtered = filtered2;
                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    $dirty = $dirty2;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer2 = $composer3;
                    OneUIKt.m7686OneUIScreengMrHQkA("حصن المسلم", null, str, null, onMenu, null, null, 0.0f, (Function1) rememberedValue2, $composer2, (($dirty >> 6) & 57344) | 6, 234);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            $dirty = $dirty2;
            final List filtered3 = filtered;
            Object obj = new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HisnScreensKt.HisnListContent$lambda$24$lambda$23(filtered3, state, onQuery, onOnlyFavorites, onOpen, onToggleFavorite, (LazyListScope) obj2);
                }
            };
            $composer3.updateRememberedValue(obj);
            rememberedValue2 = obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            OneUIKt.m7686OneUIScreengMrHQkA("حصن المسلم", null, str, null, onMenu, null, null, 0.0f, (Function1) rememberedValue2, $composer2, (($dirty >> 6) & 57344) | 6, 234);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onMenu = function02;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0 onMenu2 = onMenu;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return HisnScreensKt.HisnListContent$lambda$25(HisnListState.this, items, onQuery, onOnlyFavorites, onOpen, onToggleFavorite, onMenu2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23(final List $filtered, final HisnListState $state, final Function1 $onQuery, final Function1 $onOnlyFavorites, final Function1 $onOpen, final Function1 $onToggleFavorite, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, "search", null, ComposableLambdaKt.composableLambdaInstance(44678404, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$5(HisnListState.this, $onQuery, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "chips", null, ComposableLambdaKt.composableLambdaInstance(518206509, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$14(HisnListState.this, $onOnlyFavorites, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if ($filtered.isEmpty()) {
            LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(881860745, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$15(HisnListState.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            LazyListScope.CC.item$default(OneUIScreen, "group", null, ComposableLambdaKt.composableLambdaInstance(386014432, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$22($filtered, $state, $onOpen, $onToggleFavorite, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$5(HisnListState $state, Function1 $onQuery, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C72@2727L60:HisnScreens.kt#9egyij");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(44678404, $changed, -1, "com.example.ui.hisn.HisnListContent.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:72)");
            }
            OneUIKt.OneUISearchField($state.getQuery(), $onQuery, "ابحث في حصن المسلم", null, $composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$14(final HisnListState $state, final Function1 $onOnlyFavorites, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C78@2982L202,75@2840L344:HisnScreens.kt#9egyij");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(518206509, $changed, -1, "com.example.ui.hisn.HisnListContent.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:75)");
            }
            Arrangement.HorizontalOrVertical m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = m610spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer, -219745993, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($state) | $composer.changed($onOnlyFavorites);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12(HisnListState.this, $onOnlyFavorites, (LazyListScope) obj2);
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12(final HisnListState $state, final Function1 $onOnlyFavorites, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.CC.item$default(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(114511567, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$8(HisnListState.this, $onOnlyFavorites, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.CC.item$default(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-973230522, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$11(HisnListState.this, $onOnlyFavorites, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$8(HisnListState $state, final Function1 $onOnlyFavorites, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C79@3047L26,79@3007L67:HisnScreens.kt#9egyij");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(114511567, $changed, -1, "com.example.ui.hisn.HisnListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:79)");
            }
            boolean z = !$state.getOnlyFavorites();
            ComposerKt.sourceInformationMarkerStart($composer, -1623532439, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changed = $composer.changed($onOnlyFavorites);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$8$lambda$7$lambda$6(Function1.this);
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
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$8$lambda$7$lambda$6(Function1 $onOnlyFavorites) {
        $onOnlyFavorites.invoke(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$11(HisnListState $state, final Function1 $onOnlyFavorites, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C80@3142L25,80@3100L68:HisnScreens.kt#9egyij");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-973230522, $changed, -1, "com.example.ui.hisn.HisnListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:80)");
            }
            boolean onlyFavorites = $state.getOnlyFavorites();
            ComposerKt.sourceInformationMarkerStart($composer, 1028340319, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changed = $composer.changed($onOnlyFavorites);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9(Function1.this);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.m7681OneUIChipM8YrEPQ("المفضلة", onlyFavorites, (Function0) rememberedValue, null, null, $composer, 6, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9(Function1 $onOnlyFavorites) {
        $onOnlyFavorites.invoke(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$15(HisnListState $state, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C84@3248L107:HisnScreens.kt#9egyij");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(881860745, $changed, -1, "com.example.ui.hisn.HisnListContent.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:84)");
            }
            OneUIKt.OneUIEmptyState($state.getOnlyFavorites() ? "لا توجد أبواب مفضلة" : "لا توجد نتائج", SearchKt.getSearch(Icons.Outlined.INSTANCE), null, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$22(final List $filtered, final HisnListState $state, final Function1 $onOpen, final Function1 $onToggleFavorite, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C87@3435L630,87@3425L640:HisnScreens.kt#9egyij");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(386014432, $changed, -1, "com.example.ui.hisn.HisnListContent.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:87)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-1937942827, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$22$lambda$21($filtered, $state, $onOpen, $onToggleFavorite, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$22$lambda$21(List $filtered, HisnListState $state, Function1 $onOpen, final Function1 $onToggleFavorite, ColumnScope OneUICard, Composer $composer, int $changed) {
        int i;
        final Function1 function1 = $onOpen;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation(composer, "C*95@3908L19,96@3970L29,90@3592L433:HisnScreens.kt#9egyij");
        int i2 = 0;
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937942827, $changed, -1, "com.example.ui.hisn.HisnListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:88)");
            }
            int i3 = 0;
            for (Object obj : $filtered) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i5 = i3;
                final HisnChapter hisnChapter = (HisnChapter) obj;
                if (i5 > 0) {
                    composer.startReplaceGroup(853227238);
                    ComposerKt.sourceInformation(composer, "89@3540L27");
                    OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(16), composer, 6, i2);
                } else {
                    composer.startReplaceGroup(676727095);
                }
                composer.endReplaceGroup();
                Integer num = $state.getItemCounts().get(Integer.valueOf(hisnChapter.getId()));
                int intValue = num != null ? num.intValue() : i2;
                boolean contains = $state.getFavoriteChapterIds().contains(Integer.valueOf(hisnChapter.getId()));
                boolean contains2 = $state.getReadTodayIds().contains(Integer.valueOf(hisnChapter.getId()));
                ComposerKt.sourceInformationMarkerStart(composer, 853239006, "CC(remember):HisnScreens.kt#9igjgp");
                boolean changed = composer.changed(function1) | composer.changed(hisnChapter);
                Object rememberedValue = $composer.rememberedValue();
                if (changed) {
                    i = intValue;
                } else {
                    i = intValue;
                }
                Object obj2 = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$17$lambda$16(Function1.this, hisnChapter);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue = obj2;
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 853241000, "CC(remember):HisnScreens.kt#9igjgp");
                boolean changed2 = composer.changed($onToggleFavorite) | composer.changed(hisnChapter);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HisnScreensKt.HisnListContent$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(Function1.this, hisnChapter);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    rememberedValue2 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChapterRow(hisnChapter, i, contains, contains2, function0, (Function0) rememberedValue2, composer, 0);
                function1 = $onOpen;
                composer = $composer;
                i3 = i4;
                i2 = 0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$17$lambda$16(Function1 $onOpen, HisnChapter $chapter) {
        $onOpen.invoke($chapter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListContent$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(Function1 $onToggleFavorite, HisnChapter $chapter) {
        $onToggleFavorite.invoke($chapter);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0602  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ChapterRow(final HisnChapter chapter, int count, final boolean favorite, final boolean read, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        int i;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Function0 function05;
        Function0 function06;
        Composer m3828constructorimpl;
        Composer composer;
        Composer $composer2 = $composer.startRestartGroup(1310551449);
        ComposerKt.sourceInformation($composer2, "C(ChapterRow)N(chapter,count,favorite,read,onClick,onFavorite)114@4302L11,115@4318L1360:HisnScreens.kt#9egyij");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(chapter) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            i = count;
            $dirty |= $composer2.changed(i) ? 32 : 16;
        } else {
            i = count;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(favorite) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(read) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            function03 = function0;
            $dirty |= $composer2.changedInstance(function03) ? 16384 : 8192;
        } else {
            function03 = function0;
        }
        if ((196608 & $changed) == 0) {
            function04 = function02;
            $dirty |= $composer2.changedInstance(function04) ? 131072 : 65536;
        } else {
            function04 = function02;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1310551449, $dirty, -1, "com.example.ui.hisn.ChapterRow (HisnScreens.kt:113)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(SizeKt.m765heightInVpY3zN4$default(ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, function03, 7, null), Dp.m7226constructorimpl(64), 0.0f, 2, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(10));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m731paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting() || !Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i4 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 843820382, "C123@4576L330,133@4915L29,134@4953L404,142@5366L306:HisnScreens.kt#9egyij");
            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), cs.getSurfaceVariant(), null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer2, m231backgroundbw27NRU$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function05 = constructor2;
                $composer2.createNode(function05);
            } else {
                function05 = constructor2;
                $composer2.useNode();
            }
            Composer m3828constructorimpl3 = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i7 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -1495286049, "C129@4815L10,127@4735L161:HisnScreens.kt#9egyij");
                TextKt.m2816Text4IGK_g(String.valueOf(chapter.getOrder()), (Modifier) null, cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getLabelMedium(), $composer2, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer2, 6);
                Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer2, weight$default);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i8 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if (!$composer2.getInserting()) {
                    function06 = constructor3;
                    $composer2.createNode(function06);
                } else {
                    function06 = constructor3;
                    $composer2.useNode();
                }
                m3828constructorimpl = Updater.m3828constructorimpl($composer2);
                Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl.getInserting()) {
                    composer = $composer2;
                    if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i9 = (i8 >> 6) & 14;
                        Composer composer2 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i10 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 188031888, "C135@5036L10,135@4995L98,138@5242L10,136@5106L241:HisnScreens.kt#9egyij");
                        TextKt.m2816Text4IGK_g(chapter.getName(), (Modifier) null, cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 0, 3072, 57338);
                        String azkarCount = OneUIKt.azkarCount(i);
                        if (read) {
                            azkarCount = azkarCount + " · تمت قراءته اليوم";
                        }
                        TextKt.m2816Text4IGK_g(azkarCount, (Modifier) null, read ? cs.getPrimary() : cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        IconKt.m2273Iconww6aTOc(favorite ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(26)), RoundedCornerShapeKt.getCircleShape()), false, null, null, function04, 7, null), favorite ? ColorKt.Color(4294951175L) : cs.getOnSurfaceVariant(), $composer2, 48, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                } else {
                    composer = $composer2;
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i92 = (i8 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i102 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, 188031888, "C135@5036L10,135@4995L98,138@5242L10,136@5106L241:HisnScreens.kt#9egyij");
                TextKt.m2816Text4IGK_g(chapter.getName(), (Modifier) null, cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodyLarge(), composer22, 0, 3072, 57338);
                String azkarCount2 = OneUIKt.azkarCount(i);
                if (read) {
                }
                TextKt.m2816Text4IGK_g(azkarCount2, (Modifier) null, read ? cs.getPrimary() : cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodySmall(), composer22, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (favorite) {
                }
                IconKt.m2273Iconww6aTOc(favorite ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(26)), RoundedCornerShapeKt.getCircleShape()), false, null, null, function04, 7, null), favorite ? ColorKt.Color(4294951175L) : cs.getOnSurfaceVariant(), $composer2, 48, 0);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i62 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i72 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1495286049, "C129@4815L10,127@4735L161:HisnScreens.kt#9egyij");
            TextKt.m2816Text4IGK_g(String.valueOf(chapter.getOrder()), (Modifier) null, cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getLabelMedium(), $composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer2, 6);
            Modifier weight$default2 = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap32 = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer2, weight$default2);
            Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            int i82 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
            }
            $composer2.startReusableNode();
            if (!$composer2.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            int i922 = (i82 >> 6) & 14;
            Composer composer222 = composer;
            ComposerKt.sourceInformationMarkerStart(composer222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            int i1022 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer222, 188031888, "C135@5036L10,135@4995L98,138@5242L10,136@5106L241:HisnScreens.kt#9egyij");
            TextKt.m2816Text4IGK_g(chapter.getName(), (Modifier) null, cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer222, MaterialTheme.$stable).getBodyLarge(), composer222, 0, 3072, 57338);
            String azkarCount22 = OneUIKt.azkarCount(i);
            if (read) {
            }
            TextKt.m2816Text4IGK_g(azkarCount22, (Modifier) null, read ? cs.getPrimary() : cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer222, MaterialTheme.$stable).getBodySmall(), composer222, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer222);
            ComposerKt.sourceInformationMarkerEnd(composer222);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (favorite) {
            }
            IconKt.m2273Iconww6aTOc(favorite ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(26)), RoundedCornerShapeKt.getCircleShape()), false, null, null, function04, 7, null), favorite ? ColorKt.Color(4294951175L) : cs.getOnSurfaceVariant(), $composer2, 48, 0);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final int i11 = i;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HisnScreensKt.ChapterRow$lambda$29(HisnChapter.this, i11, favorite, read, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0169, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HisnChapterContent(final HisnChapter chapter, final List<HisnItem> items, final boolean favoriteChapter, final Set<Integer> favoriteItemIds, final Function0<Unit> onBack, final Function0<Unit> onToggleChapterFavorite, final Function1<? super HisnItem, Unit> onToggleItemFavorite, final Function0<Unit> onMarkRead, final Function0<Unit> onAddToMyAzkar, Composer $composer, final int $changed) {
        ComposableLambda composableLambda;
        Intrinsics.checkNotNullParameter(chapter, "chapter");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(favoriteItemIds, "favoriteItemIds");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onToggleChapterFavorite, "onToggleChapterFavorite");
        Intrinsics.checkNotNullParameter(onToggleItemFavorite, "onToggleItemFavorite");
        Intrinsics.checkNotNullParameter(onMarkRead, "onMarkRead");
        Intrinsics.checkNotNullParameter(onAddToMyAzkar, "onAddToMyAzkar");
        Composer $composer2 = $composer.startRestartGroup(901409046);
        ComposerKt.sourceInformation($composer2, "C(HisnChapterContent)N(chapter,items,favoriteChapter,favoriteItemIds,onBack,onToggleChapterFavorite,onToggleItemFavorite,onMarkRead,onAddToMyAzkar)167@6139L208,174@6354L569,163@6010L913:HisnScreens.kt#9egyij");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(chapter) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(items) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(favoriteChapter) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(favoriteItemIds) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty |= $composer2.changedInstance(onToggleChapterFavorite) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onToggleItemFavorite) ? 1048576 : 524288;
        }
        if ((12582912 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onMarkRead) ? 8388608 : 4194304;
        }
        if ((100663296 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onAddToMyAzkar) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ($composer2.shouldExecute((38347923 & $dirty) != 38347922, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(901409046, $dirty, -1, "com.example.ui.hisn.HisnChapterContent (HisnScreens.kt:162)");
            }
            String name = chapter.getName();
            String azkarCount = OneUIKt.azkarCount(items.size());
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2120199672, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HisnScreensKt.HisnChapterContent$lambda$30(favoriteChapter, onToggleChapterFavorite, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54);
            ComposerKt.sourceInformationMarkerStart($composer2, -1329278513, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(items) | $composer2.changedInstance(favoriteItemIds) | ((3670016 & $dirty) == 1048576) | ((29360128 & $dirty) == 8388608) | ((234881024 & $dirty) == 67108864);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance) {
                composableLambda = rememberComposableLambda;
            } else {
                composableLambda = rememberComposableLambda;
            }
            rememberedValue = new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HisnScreensKt.HisnChapterContent$lambda$37$lambda$36(items, favoriteItemIds, onToggleItemFavorite, onMarkRead, onAddToMyAzkar, (LazyListScope) obj);
                }
            };
            $composer2.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIKt.m7686OneUIScreengMrHQkA(name, null, azkarCount, onBack, null, composableLambda, null, 0.0f, (Function1) rememberedValue, $composer2, (($dirty >> 3) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 210);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HisnScreensKt.HisnChapterContent$lambda$38(HisnChapter.this, items, favoriteChapter, favoriteItemIds, onBack, onToggleChapterFavorite, onToggleItemFavorite, onMarkRead, onAddToMyAzkar, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterContent$lambda$30(boolean $favoriteChapter, Function0 $onToggleChapterFavorite, RowScope OneUIScreen, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        ComposerKt.sourceInformation($composer, "C168@6153L184:HisnScreens.kt#9egyij");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120199672, $changed, -1, "com.example.ui.hisn.HisnChapterContent.<anonymous> (HisnScreens.kt:168)");
            }
            OneUIKt.OneUIIconAction($favoriteChapter ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", $onToggleChapterFavorite, $composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterContent$lambda$37$lambda$36(final List $items, final Set $favoriteItemIds, final Function1 $onToggleItemFavorite, final Function0 $onMarkRead, final Function0 $onAddToMyAzkar, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        final Function1 function1 = new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnScreensKt.HisnChapterContent$lambda$37$lambda$36$lambda$31((HisnItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$HisnChapterContent$lambda$37$lambda$36$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((HisnItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(HisnItem hisnItem) {
                return null;
            }
        };
        OneUIScreen.items($items.size(), new Function1<Integer, Object>() { // from class: com.example.ui.hisn.HisnScreensKt$HisnChapterContent$lambda$37$lambda$36$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($items.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.hisn.HisnScreensKt$HisnChapterContent$lambda$37$lambda$36$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($items.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.hisn.HisnScreensKt$HisnChapterContent$lambda$37$lambda$36$$inlined$items$default$4
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
                final HisnItem hisnItem = (HisnItem) $items.get(it);
                $composer.startReplaceGroup(-1386097891);
                ComposerKt.sourceInformation($composer, "CN(item)*176@6463L30,176@6416L77:HisnScreens.kt#9egyij");
                boolean contains = $favoriteItemIds.contains(Integer.valueOf(hisnItem.getId()));
                ComposerKt.sourceInformationMarkerStart($composer, 1340761943, "CC(remember):HisnScreens.kt#9igjgp");
                boolean changed = ((((i & 112) ^ 48) > 32 && $composer.changed(hisnItem)) || (i & 48) == 32) | $composer.changed($onToggleItemFavorite);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = $onToggleItemFavorite;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.hisn.HisnScreensKt$HisnChapterContent$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(hisnItem);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                HisnScreensKt.HisnItemCard(hisnItem, contains, (Function0) rememberedValue, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.CC.item$default(OneUIScreen, "actions", null, ComposableLambdaKt.composableLambdaInstance(-1874818696, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HisnScreensKt.HisnChapterContent$lambda$37$lambda$36$lambda$35(Function0.this, $onAddToMyAzkar, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object HisnChapterContent$lambda$37$lambda$36$lambda$31(HisnItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit HisnChapterContent$lambda$37$lambda$36$lambda$35(Function0 $onMarkRead, Function0 $onAddToMyAzkar, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C179@6548L359:HisnScreens.kt#9egyij");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1874818696, $changed, -1, "com.example.ui.hisn.HisnChapterContent.<anonymous>.<anonymous>.<anonymous> (HisnScreens.kt:179)");
            }
            Modifier m734paddingqDBjuR0$default = PaddingKt.m734paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7226constructorimpl(4), 0.0f, 0.0f, 13, null);
            Arrangement.Horizontal m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m610spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
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
                $composer.createNode(constructor);
            } else {
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
                int i3 = ((54 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 1787574182, "C180@6668L103,181@6788L105:HisnScreens.kt#9egyij");
                OneUIKt.OneUIButton("تمت القراءة", $onMarkRead, RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), true, CheckKt.getCheck(Icons.Outlined.INSTANCE), false, $composer, 3078, 32);
                OneUIKt.OneUIButton("أضف إلى أذكاري", $onAddToMyAzkar, RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), false, NotificationAddKt.getNotificationAdd(Icons.Outlined.INSTANCE), false, $composer, 6, 40);
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
            int i32 = ((54 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1787574182, "C180@6668L103,181@6788L105:HisnScreens.kt#9egyij");
            OneUIKt.OneUIButton("تمت القراءة", $onMarkRead, RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), true, CheckKt.getCheck(Icons.Outlined.INSTANCE), false, $composer, 3078, 32);
            OneUIKt.OneUIButton("أضف إلى أذكاري", $onAddToMyAzkar, RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), false, NotificationAddKt.getNotificationAdd(Icons.Outlined.INSTANCE), false, $composer, 6, 40);
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

    public static final void HisnItemCard(final HisnItem item, final boolean favorite, final Function0<Unit> onFavorite, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onFavorite, "onFavorite");
        Composer $composer2 = $composer.startRestartGroup(741663934);
        ComposerKt.sourceInformation($composer2, "C(HisnItemCard)N(item,favorite,onFavorite)189@7044L11,190@7103L33,190@7077L59,191@7183L25,191@7157L51,192@7246L7,193@7300L2849,193@7258L2891:HisnScreens.kt#9egyij");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(item) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(favorite) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onFavorite) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(741663934, $dirty2, -1, "com.example.ui.hisn.HisnItemCard (HisnScreens.kt:188)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            Object[] objArr = {Integer.valueOf(item.getId())};
            ComposerKt.sourceInformationMarkerStart($composer2, -225524897, "CC(remember):HisnScreens.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableIntState mutableIntStateOf;
                        mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(HisnItem.this.getCount());
                        return mutableIntStateOf;
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final MutableIntState remaining$delegate = (MutableIntState) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue, $composer2, 0);
            Object[] objArr2 = {Integer.valueOf(item.getId())};
            ComposerKt.sourceInformationMarkerStart($composer2, -225522345, "CC(remember):HisnScreens.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HisnScreensKt.HisnItemCard$lambda$44$lambda$43();
                    }
                };
                $composer2.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final MutableState showFadl$delegate = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) rememberedValue2, $composer2, 48);
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localHapticFeedback);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final HapticFeedback haptic = (HapticFeedback) consume;
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(16)), 0L, ComposableLambdaKt.rememberComposableLambda(-2109684429, true, new Function3() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return HisnScreensKt.HisnItemCard$lambda$54(HisnItem.this, cs, haptic, remaining$delegate, showFadl$delegate, favorite, onFavorite, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), $composer2, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return HisnScreensKt.HisnItemCard$lambda$55(HisnItem.this, favorite, onFavorite, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final int HisnItemCard$lambda$41(MutableIntState $remaining$delegate) {
        return $remaining$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final MutableState HisnItemCard$lambda$44$lambda$43() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        return mutableStateOf$default;
    }

    private static final boolean HisnItemCard$lambda$45(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HisnItemCard$lambda$46(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0255, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x054b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit HisnItemCard$lambda$54(final HisnItem $item, ColorScheme $cs, final HapticFeedback $haptic, final MutableIntState $remaining$delegate, MutableState $showFadl$delegate, boolean $favorite, Function0 $onFavorite, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        boolean z;
        boolean changedInstance;
        Function0 function02;
        Composer m3828constructorimpl;
        Composer composer;
        String str;
        final MutableState mutableState;
        int i;
        String meta;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C196@7373L10,194@7310L237,202@7556L30,203@7595L2064:HisnScreens.kt#9egyij");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2109684429, $changed, -1, "com.example.ui.hisn.HisnItemCard.<anonymous> (HisnScreens.kt:194)");
            }
            TextKt.m2816Text4IGK_g($item.getText(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $cs.getOnSurface(), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(36), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 3120, 6, 64496);
            Composer composer2 = $composer;
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), composer2, 6);
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
            if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i4 = ((384 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -1439911049, "C211@7978L196,206@7746L1168,231@8927L27,240@9330L319:HisnScreens.kt#9egyij");
                z = HisnItemCard$lambda$41($remaining$delegate) != 0;
                Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), !z ? Color.m4487copywmQWz5c(r54, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r54) : 0.16f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r54) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r54) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl($cs.getPrimary()) : 0.0f) : $cs.getSurfaceVariant(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, -462083845, "CC(remember):HisnScreens.kt#9igjgp");
                changedInstance = $composer.changedInstance($haptic) | $composer.changed($remaining$delegate) | $composer.changed($item);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance) {
                }
                rememberedValue = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HisnScreensKt.HisnItemCard$lambda$54$lambda$52$lambda$48$lambda$47(HapticFeedback.this, $item, $remaining$delegate);
                    }
                };
                $composer.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(ClickableKt.m264clickableXHw0xAI$default(m231backgroundbw27NRU$default, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7226constructorimpl(16), 0.0f, 2, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                if (m3828constructorimpl.getInserting()) {
                    composer = $composer;
                    if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i6 = (i5 >> 6) & 14;
                        Composer composer3 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i7 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer3, 1033808164, "C218@8320L256,224@8593L28,227@8793L10,225@8638L262:HisnScreens.kt#9egyij");
                        Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                        IconKt.m2273Iconww6aTOc(z ? CheckKt.getCheck(outlined) : TouchAppKt.getTouchApp(outlined), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), z ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), composer3, 432, 0);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), composer3, 6);
                        if (z) {
                            str = "تم";
                        } else if ($item.getCount() > 1) {
                            str = HisnItemCard$lambda$41($remaining$delegate) + " / " + $item.getCount();
                        } else {
                            str = "اضغط للعد";
                        }
                        TextKt.m2816Text4IGK_g(str, (Modifier) null, z ? $cs.getPrimary() : $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelLarge(), composer3, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        SpacerKt.Spacer(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
                        if (StringsKt.isBlank($item.getFadl())) {
                            mutableState = $showFadl$delegate;
                            $composer.startReplaceGroup(-1447618549);
                        } else {
                            $composer.startReplaceGroup(-1438684535);
                            ComposerKt.sourceInformation($composer, "237@9247L24,233@9013L290");
                            ImageVector info = InfoKt.getInfo(Icons.Outlined.INSTANCE);
                            long primary = HisnItemCard$lambda$45($showFadl$delegate) ? $cs.getPrimary() : $cs.getOnSurfaceVariant();
                            Modifier clip = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape());
                            ComposerKt.sourceInformationMarkerStart($composer, -462043409, "CC(remember):HisnScreens.kt#9igjgp");
                            mutableState = $showFadl$delegate;
                            boolean changed = $composer.changed(mutableState);
                            Object rememberedValue2 = $composer.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HisnScreensKt.HisnItemCard$lambda$54$lambda$52$lambda$51$lambda$50(MutableState.this);
                                    }
                                };
                                $composer.updateRememberedValue(obj);
                                rememberedValue2 = obj;
                            }
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            IconKt.m2273Iconww6aTOc(info, "الفضل", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(8)), primary, $composer, 48, 0);
                        }
                        $composer.endReplaceGroup();
                        IconKt.m2273Iconww6aTOc($favorite ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onFavorite, 7, null), Dp.m7226constructorimpl(8)), $favorite ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        if (HisnItemCard$lambda$45(mutableState) || StringsKt.isBlank($item.getFadl())) {
                            i = 6;
                            composer2.startReplaceGroup(-1359624561);
                        } else {
                            composer2.startReplaceGroup(-1349988397);
                            ComposerKt.sourceInformation(composer2, "248@9722L30,249@9803L10,249@9765L89");
                            i = 6;
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer2, 6);
                            TextKt.m2816Text4IGK_g($item.getFadl(), (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65530);
                            composer2 = composer2;
                        }
                        composer2.endReplaceGroup();
                        Iterable listOf = CollectionsKt.listOf((Object[]) new String[]{$item.getSource(), $item.getHokm()});
                        Collection arrayList = new ArrayList();
                        for (Object obj2 : listOf) {
                            if (!StringsKt.isBlank((String) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        meta = CollectionsKt.joinToString$default((List) arrayList, " · ", null, null, 0, null, null, 62, null);
                        if (StringsKt.isBlank(meta)) {
                            composer2.startReplaceGroup(-1359624561);
                        } else {
                            composer2.startReplaceGroup(-1349705863);
                            ComposerKt.sourceInformation(composer2, "253@10007L30,254@10083L10,254@10050L83");
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer2, i);
                            Composer composer4 = composer2;
                            TextKt.m2816Text4IGK_g(meta, (Modifier) null, $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer4, 0, 0, 65530);
                            composer2 = composer4;
                        }
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                } else {
                    composer = $composer;
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i62 = (i5 >> 6) & 14;
                Composer composer32 = composer;
                ComposerKt.sourceInformationMarkerStart(composer32, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i72 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer32, 1033808164, "C218@8320L256,224@8593L28,227@8793L10,225@8638L262:HisnScreens.kt#9egyij");
                Icons.Outlined outlined2 = Icons.Outlined.INSTANCE;
                IconKt.m2273Iconww6aTOc(z ? CheckKt.getCheck(outlined2) : TouchAppKt.getTouchApp(outlined2), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), z ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), composer32, 432, 0);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), composer32, 6);
                if (z) {
                }
                TextKt.m2816Text4IGK_g(str, (Modifier) null, z ? $cs.getPrimary() : $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer32, MaterialTheme.$stable).getLabelLarge(), composer32, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer32);
                ComposerKt.sourceInformationMarkerEnd(composer32);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SpacerKt.Spacer(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
                if (StringsKt.isBlank($item.getFadl())) {
                }
                $composer.endReplaceGroup();
                IconKt.m2273Iconww6aTOc($favorite ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onFavorite, 7, null), Dp.m7226constructorimpl(8)), $favorite ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (HisnItemCard$lambda$45(mutableState)) {
                }
                i = 6;
                composer2.startReplaceGroup(-1359624561);
                composer2.endReplaceGroup();
                Iterable listOf2 = CollectionsKt.listOf((Object[]) new String[]{$item.getSource(), $item.getHokm()});
                Collection arrayList2 = new ArrayList();
                while (r9.hasNext()) {
                }
                meta = CollectionsKt.joinToString$default((List) arrayList2, " · ", null, null, 0, null, null, 62, null);
                if (StringsKt.isBlank(meta)) {
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i42 = ((384 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1439911049, "C211@7978L196,206@7746L1168,231@8927L27,240@9330L319:HisnScreens.kt#9egyij");
            z = HisnItemCard$lambda$41($remaining$delegate) != 0;
            Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), !z ? Color.m4487copywmQWz5c(r54, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r54) : 0.16f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r54) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r54) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl($cs.getPrimary()) : 0.0f) : $cs.getSurfaceVariant(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -462083845, "CC(remember):HisnScreens.kt#9igjgp");
            changedInstance = $composer.changedInstance($haptic) | $composer.changed($remaining$delegate) | $composer.changed($item);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changedInstance) {
            }
            rememberedValue3 = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HisnScreensKt.HisnItemCard$lambda$54$lambda$52$lambda$48$lambda$47(HapticFeedback.this, $item, $remaining$delegate);
                }
            };
            $composer.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier m732paddingVpY3zN4$default2 = PaddingKt.m732paddingVpY3zN4$default(ClickableKt.m264clickableXHw0xAI$default(m231backgroundbw27NRU$default2, false, null, null, (Function0) rememberedValue3, 7, null), Dp.m7226constructorimpl(16), 0.0f, 2, null);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i622 = (i52 >> 6) & 14;
            Composer composer322 = composer;
            ComposerKt.sourceInformationMarkerStart(composer322, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i722 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer322, 1033808164, "C218@8320L256,224@8593L28,227@8793L10,225@8638L262:HisnScreens.kt#9egyij");
            Icons.Outlined outlined22 = Icons.Outlined.INSTANCE;
            IconKt.m2273Iconww6aTOc(z ? CheckKt.getCheck(outlined22) : TouchAppKt.getTouchApp(outlined22), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), z ? $cs.getPrimary() : $cs.getOnSurfaceVariant(), composer322, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), composer322, 6);
            if (z) {
            }
            TextKt.m2816Text4IGK_g(str, (Modifier) null, z ? $cs.getPrimary() : $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer322, MaterialTheme.$stable).getLabelLarge(), composer322, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer322);
            ComposerKt.sourceInformationMarkerEnd(composer322);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
            if (StringsKt.isBlank($item.getFadl())) {
            }
            $composer.endReplaceGroup();
            IconKt.m2273Iconww6aTOc($favorite ? StarKt.getStar(Icons.Filled.INSTANCE) : StarBorderKt.getStarBorder(Icons.Outlined.INSTANCE), "المفضلة", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onFavorite, 7, null), Dp.m7226constructorimpl(8)), $favorite ? ColorKt.Color(4294951175L) : $cs.getOnSurfaceVariant(), $composer, 48, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (HisnItemCard$lambda$45(mutableState)) {
            }
            i = 6;
            composer2.startReplaceGroup(-1359624561);
            composer2.endReplaceGroup();
            Iterable listOf22 = CollectionsKt.listOf((Object[]) new String[]{$item.getSource(), $item.getHokm()});
            Collection arrayList22 = new ArrayList();
            while (r9.hasNext()) {
            }
            meta = CollectionsKt.joinToString$default((List) arrayList22, " · ", null, null, 0, null, null, 62, null);
            if (StringsKt.isBlank(meta)) {
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnItemCard$lambda$54$lambda$52$lambda$48$lambda$47(HapticFeedback $haptic, HisnItem $item, MutableIntState $remaining$delegate) {
        $haptic.mo5267performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5284getTextHandleMove5zf0vsI());
        $remaining$delegate.setIntValue(HisnItemCard$lambda$41($remaining$delegate) > 0 ? HisnItemCard$lambda$41($remaining$delegate) - 1 : $item.getCount());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnItemCard$lambda$54$lambda$52$lambda$51$lambda$50(MutableState $showFadl$delegate) {
        HisnItemCard$lambda$46($showFadl$delegate, !HisnItemCard$lambda$45($showFadl$delegate));
        return Unit.INSTANCE;
    }

    public static final void HisnListScreen(final HisnViewModel viewModel, final Function1<? super HisnChapter, Unit> onOpen, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        final Function0 onMenu;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        Composer $composer2 = $composer.startRestartGroup(419573667);
        ComposerKt.sourceInformation($composer2, "C(HisnListScreen)N(viewModel,onOpen,onMenu)267@10359L29,268@10425L29,269@10494L29,270@10560L29,271@10626L29,272@10689L29,273@10759L29,280@11016L19,281@11063L27,283@11144L42,277@10935L282:HisnScreens.kt#9egyij");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onOpen) ? 32 : 16;
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
                ComposerKt.traceEventStart(419573667, $dirty2, -1, "com.example.ui.hisn.HisnListScreen (HisnScreens.kt:266)");
            }
            State chapters$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getChapters(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State items$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllItems(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State counts$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getItemCounts(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State favs$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getFavorites(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State read$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getReadToday(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State query$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getQuery(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State only$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getOnlyFavorites(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            List<HisnChapter> HisnListScreen$lambda$56 = HisnListScreen$lambda$56(chapters$delegate);
            Map<Integer, Integer> HisnListScreen$lambda$58 = HisnListScreen$lambda$58(counts$delegate);
            Iterable HisnListScreen$lambda$59 = HisnListScreen$lambda$59(favs$delegate);
            Collection arrayList = new ArrayList();
            for (Object obj : HisnListScreen$lambda$59) {
                if ((((HisnFavorite) obj).getItemId() == 0 ? 1 : null) != null) {
                    arrayList.add(obj);
                }
            }
            Iterable iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((HisnFavorite) it.next()).getChapterId()));
            }
            HisnListState state = new HisnListState(HisnListScreen$lambda$56, HisnListScreen$lambda$58, CollectionsKt.toSet((List) arrayList2), HisnListScreen$lambda$60(read$delegate), HisnListScreen$lambda$61(query$delegate), HisnListScreen$lambda$62(only$delegate));
            List<HisnItem> HisnListScreen$lambda$57 = HisnListScreen$lambda$57(items$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -516605258, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (KFunction) new HisnScreensKt$HisnListScreen$1$1(viewModel);
                $composer2.updateRememberedValue(obj2);
                rememberedValue = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function1 = (Function1) ((KFunction) rememberedValue);
            ComposerKt.sourceInformationMarkerStart($composer2, -516603746, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance2 = $composer2.changedInstance(viewModel);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = (KFunction) new HisnScreensKt$HisnListScreen$2$1(viewModel);
                $composer2.updateRememberedValue(obj3);
                rememberedValue2 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function12 = (Function1) ((KFunction) rememberedValue2);
            ComposerKt.sourceInformationMarkerStart($composer2, -516601139, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance3 = $composer2.changedInstance(viewModel);
            Object rememberedValue3 = $composer2.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return HisnScreensKt.HisnListScreen$lambda$68$lambda$67(HisnViewModel.this, (HisnChapter) obj5);
                    }
                };
                $composer2.updateRememberedValue(obj4);
                rememberedValue3 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function0 onMenu3 = onMenu2;
            HisnListContent(state, HisnListScreen$lambda$57, function1, function12, onOpen, (Function1) rememberedValue3, onMenu3, $composer2, (($dirty2 << 9) & 57344) | (($dirty2 << 12) & 3670016), 0);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onMenu = onMenu3;
        } else {
            $composer2.skipToGroupEnd();
            onMenu = function02;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return HisnScreensKt.HisnListScreen$lambda$69(HisnViewModel.this, onOpen, onMenu, $changed, i, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final List<HisnChapter> HisnListScreen$lambda$56(State<? extends List<HisnChapter>> state) {
        return (List) state.getValue();
    }

    private static final List<HisnItem> HisnListScreen$lambda$57(State<? extends List<HisnItem>> state) {
        return (List) state.getValue();
    }

    private static final Map<Integer, Integer> HisnListScreen$lambda$58(State<? extends Map<Integer, Integer>> state) {
        return (Map) state.getValue();
    }

    private static final List<HisnFavorite> HisnListScreen$lambda$59(State<? extends List<HisnFavorite>> state) {
        return (List) state.getValue();
    }

    private static final Set<Integer> HisnListScreen$lambda$60(State<? extends Set<Integer>> state) {
        return (Set) state.getValue();
    }

    private static final String HisnListScreen$lambda$61(State<String> state) {
        return (String) state.getValue();
    }

    private static final boolean HisnListScreen$lambda$62(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnListScreen$lambda$68$lambda$67(HisnViewModel $viewModel, HisnChapter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.toggleChapterFavorite(it.getId());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f5, code lost:
    
        if (r9 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x033a, code lost:
    
        if (r9 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HisnChapterScreen(final int chapterId, final HisnViewModel viewModel, final Function0<Unit> onBack, final Function2<? super String, ? super String, Unit> onAddToMyAzkar, Composer $composer, final int $changed) {
        final int i;
        final HisnViewModel hisnViewModel;
        Object obj;
        boolean z;
        Set set;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onAddToMyAzkar, "onAddToMyAzkar");
        Composer $composer2 = $composer.startRestartGroup(2076710340);
        ComposerKt.sourceInformation($composer2, "C(HisnChapterScreen)N(chapterId,viewModel,onBack,onAddToMyAzkar)295@11434L29,296@11498L29,297@11564L29,299@11682L69,306@12082L46,307@12161L50,308@12234L40,309@12301L72,300@11756L623:HisnScreens.kt#9egyij");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(chapterId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onAddToMyAzkar) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2076710340, $dirty2, -1, "com.example.ui.hisn.HisnChapterScreen (HisnScreens.kt:294)");
            }
            State chapters$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getChapters(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State all$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllItems(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State favs$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getFavorites(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            Iterator it = HisnChapterScreen$lambda$70(chapters$delegate).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if ((((HisnChapter) obj).getId() == chapterId ? 1 : null) != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            final HisnChapter chapter = (HisnChapter) obj;
            if (chapter == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return HisnScreensKt.HisnChapterScreen$lambda$74(chapterId, viewModel, onBack, onAddToMyAzkar, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i = chapterId;
            hisnViewModel = viewModel;
            List<HisnItem> HisnChapterScreen$lambda$71 = HisnChapterScreen$lambda$71(all$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -1441141079, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changed = $composer2.changed(HisnChapterScreen$lambda$71) | (($dirty2 & 14) == 4);
            int i2 = 0;
            Object rememberedValue = $composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Iterable HisnChapterScreen$lambda$712 = HisnChapterScreen$lambda$71(all$delegate);
                Collection arrayList = new ArrayList();
                for (Object obj2 : HisnChapterScreen$lambda$712) {
                    boolean z2 = changed;
                    int i3 = i2;
                    if (((HisnItem) obj2).getChapterId() == i) {
                        arrayList.add(obj2);
                    }
                    changed = z2;
                    i2 = i3;
                }
                Object obj3 = (List) arrayList;
                $composer2.updateRememberedValue(obj3);
                rememberedValue = obj3;
            }
            final List items = (List) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Iterable HisnChapterScreen$lambda$72 = HisnChapterScreen$lambda$72(favs$delegate);
            if (!(HisnChapterScreen$lambda$72 instanceof Collection) || !((Collection) HisnChapterScreen$lambda$72).isEmpty()) {
                Iterator it2 = HisnChapterScreen$lambda$72.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    HisnFavorite hisnFavorite = (HisnFavorite) it2.next();
                    if (((hisnFavorite.getChapterId() == i && hisnFavorite.getItemId() == 0) ? 1 : null) != null) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
            }
            Iterable HisnChapterScreen$lambda$722 = HisnChapterScreen$lambda$72(favs$delegate);
            Collection arrayList2 = new ArrayList();
            for (Object obj4 : HisnChapterScreen$lambda$722) {
                boolean z3 = z;
                HisnFavorite hisnFavorite2 = (HisnFavorite) obj4;
                Iterable iterable = HisnChapterScreen$lambda$722;
                if (hisnFavorite2.getChapterId() == i && hisnFavorite2.getItemId() != 0) {
                    arrayList2.add(obj4);
                }
                z = z3;
                HisnChapterScreen$lambda$722 = iterable;
            }
            boolean z4 = z;
            Iterable iterable2 = (List) arrayList2;
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it3 = iterable2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((HisnFavorite) it3.next()).getItemId()));
                iterable2 = iterable2;
            }
            Set set2 = CollectionsKt.toSet((List) arrayList3);
            ComposerKt.sourceInformationMarkerStart($composer2, -1441128302, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(hisnViewModel) | (($dirty2 & 14) == 4);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                set = set2;
                Object obj5 = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HisnScreensKt.HisnChapterScreen$lambda$81$lambda$80(HisnViewModel.this, i);
                    }
                };
                $composer2.updateRememberedValue(obj5);
                rememberedValue2 = obj5;
            } else {
                set = set2;
            }
            Function0 function0 = (Function0) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1441125770, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance2 = $composer2.changedInstance(hisnViewModel) | (($dirty2 & 14) == 4);
            Object rememberedValue3 = $composer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj6 = new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        return HisnScreensKt.HisnChapterScreen$lambda$83$lambda$82(HisnViewModel.this, i, (HisnItem) obj7);
                    }
                };
                $composer2.updateRememberedValue(obj6);
                rememberedValue3 = obj6;
            }
            Function1 function1 = (Function1) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1441123444, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changedInstance3 = $composer2.changedInstance(hisnViewModel) | (($dirty2 & 14) == 4);
            Object rememberedValue4 = $composer2.rememberedValue();
            if (changedInstance3) {
            }
            Object obj7 = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HisnScreensKt.HisnChapterScreen$lambda$85$lambda$84(HisnViewModel.this, i);
                }
            };
            $composer2.updateRememberedValue(obj7);
            rememberedValue4 = obj7;
            Function0 function02 = (Function0) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1441121268, "CC(remember):HisnScreens.kt#9igjgp");
            boolean changed2 = (($dirty2 & 7168) == 2048) | $composer2.changed(chapter) | $composer2.changedInstance(items);
            Object rememberedValue5 = $composer2.rememberedValue();
            if (changed2) {
            }
            Object obj8 = new Function0() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HisnScreensKt.HisnChapterScreen$lambda$88$lambda$87(Function2.this, chapter, items);
                }
            };
            $composer2.updateRememberedValue(obj8);
            rememberedValue5 = obj8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            HisnChapterContent(chapter, items, z4, set, onBack, function0, function1, function02, (Function0) rememberedValue5, $composer2, 57344 & ($dirty2 << 6));
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i = chapterId;
            hisnViewModel = viewModel;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup2 = $composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i4 = i;
            final HisnViewModel hisnViewModel2 = hisnViewModel;
            endRestartGroup2.updateScope(new Function2() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return HisnScreensKt.HisnChapterScreen$lambda$89(i4, hisnViewModel2, onBack, onAddToMyAzkar, $changed, (Composer) obj9, ((Integer) obj10).intValue());
                }
            });
        }
    }

    private static final List<HisnChapter> HisnChapterScreen$lambda$70(State<? extends List<HisnChapter>> state) {
        return (List) state.getValue();
    }

    private static final List<HisnItem> HisnChapterScreen$lambda$71(State<? extends List<HisnItem>> state) {
        return (List) state.getValue();
    }

    private static final List<HisnFavorite> HisnChapterScreen$lambda$72(State<? extends List<HisnFavorite>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterScreen$lambda$81$lambda$80(HisnViewModel $viewModel, int $chapterId) {
        $viewModel.toggleChapterFavorite($chapterId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterScreen$lambda$83$lambda$82(HisnViewModel $viewModel, int $chapterId, HisnItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.toggleItemFavorite($chapterId, it.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterScreen$lambda$85$lambda$84(HisnViewModel $viewModel, int $chapterId) {
        $viewModel.markChapterRead($chapterId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HisnChapterScreen$lambda$88$lambda$87(Function2 $onAddToMyAzkar, HisnChapter $chapter, List $items) {
        $onAddToMyAzkar.invoke($chapter.getName(), CollectionsKt.joinToString$default($items, "\n\n", null, null, 0, null, new Function1() { // from class: com.example.ui.hisn.HisnScreensKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HisnScreensKt.HisnChapterScreen$lambda$88$lambda$87$lambda$86((HisnItem) obj);
            }
        }, 30, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final CharSequence HisnChapterScreen$lambda$88$lambda$87$lambda$86(HisnItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }
}
