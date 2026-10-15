package com.example.ui.screens;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material.icons.outlined.EditKt;
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
import com.example.data.DhikrWithTags;
import com.example.data.Tag;
import com.example.ui.oneui.OneUIDialogKt;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.viewmodel.MainViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TagsScreen.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001as\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0013\u001a9\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\tX\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020#X\u008a\u008e\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u001cX\u008a\u008e\u0002"}, d2 = {"TagsScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onBack", "Lkotlin/Function0;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TagsContent", "tags", "", "Lcom/example/data/Tag;", "counts", "", "", "", "onAdd", "onEdit", "Lkotlin/Function1;", "onDelete", "(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "TagRow", "tag", "count", "(Lcom/example/data/Tag;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TagAddEditDialog", "onDismiss", "onConfirm", "Lkotlin/Function2;", "", "(Lcom/example/data/Tag;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app", "allTags", "dhikrsWithTags", "Lcom/example/data/DhikrWithTags;", "showAdd", "", "toEdit", "toDelete", HintConstants.AUTOFILL_HINT_NAME, "color"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TagsScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagAddEditDialog$lambda$68(Tag tag, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        TagAddEditDialog(tag, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagRow$lambda$51(Tag tag, int i, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        TagRow(tag, i, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsContent$lambda$46(List list, Map map, Function0 function0, Function0 function02, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        TagsContent(list, map, function0, function02, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$35(MainViewModel mainViewModel, Function0 function0, int i, Composer composer, int i2) {
        TagsScreen(mainViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x032e, code lost:
    
        if (r8 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TagsScreen(final MainViewModel viewModel, final Function0<Unit> onBack, Composer $composer, final int $changed) {
        int i;
        int $dirty;
        List<Tag> list;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Object mutableStateOf$default3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(488461229);
        ComposerKt.sourceInformation($composer2, "C(TagsScreen)N(viewModel,onBack)29@1193L29,30@1274L29,31@1323L34,32@1376L39,33@1436L39,34@1493L185,39@1728L18,39@1757L15,39@1785L17,39@1683L120:TagsScreen.kt#2thlc2");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(onBack) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488461229, $dirty2, -1, "com.example.ui.screens.TagsScreen (TagsScreen.kt:28)");
            }
            State allTags$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getAllTags(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            State dhikrsWithTags$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getDhikrsWithTags(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, 1259813583, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                i = 0;
                mutableStateOf$default3 = SnapshotStateKt.mutableStateOf(false, SnapshotStateKt.structuralEqualityPolicy());
                $composer2.updateRememberedValue(mutableStateOf$default3);
                rememberedValue = mutableStateOf$default3;
            } else {
                i = 0;
            }
            final MutableState showAdd$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1259815284, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
                $composer2.updateRememberedValue(mutableStateOf$default2);
                rememberedValue2 = mutableStateOf$default2;
            }
            final MutableState toEdit$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1259817204, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue3 = mutableStateOf$default;
            }
            final MutableState toDelete$delegate = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<DhikrWithTags> TagsScreen$lambda$1 = TagsScreen$lambda$1(dhikrsWithTags$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1259819174, "CC(remember):TagsScreen.kt#9igjgp");
            boolean changed = $composer2.changed(TagsScreen$lambda$1);
            Object rememberedValue4 = $composer2.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Map linkedHashMap = new LinkedHashMap();
                Iterator it = TagsScreen$lambda$1(dhikrsWithTags$delegate).iterator();
                while (it.hasNext()) {
                    for (Tag tag : ((DhikrWithTags) it.next()).getTags()) {
                        boolean z = changed;
                        Long valueOf = Long.valueOf(tag.getTagId());
                        int $dirty3 = $dirty2;
                        Integer num = (Integer) linkedHashMap.get(Long.valueOf(tag.getTagId()));
                        linkedHashMap.put(valueOf, Integer.valueOf((num != null ? num.intValue() : i) + 1));
                        changed = z;
                        $dirty2 = $dirty3;
                    }
                }
                $dirty = $dirty2;
                $composer2.updateRememberedValue(linkedHashMap);
                rememberedValue4 = linkedHashMap;
            } else {
                $dirty = $dirty2;
            }
            Map counts = (Map) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<Tag> TagsScreen$lambda$0 = TagsScreen$lambda$0(allTags$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1259826527, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                list = TagsScreen$lambda$0;
                Object obj = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TagsScreenKt.TagsScreen$lambda$15$lambda$14(MutableState.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue5 = obj;
            } else {
                list = TagsScreen$lambda$0;
            }
            Function0 function0 = (Function0) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1259827452, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue6 = $composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return TagsScreenKt.TagsScreen$lambda$17$lambda$16(MutableState.this, (Tag) obj3);
                    }
                };
                $composer2.updateRememberedValue(obj2);
                rememberedValue6 = obj2;
            }
            Function1 function1 = (Function1) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1259828350, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return TagsScreenKt.TagsScreen$lambda$19$lambda$18(MutableState.this, (Tag) obj4);
                    }
                };
                $composer2.updateRememberedValue(obj3);
                rememberedValue7 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            TagsContent(list, counts, onBack, function0, function1, (Function1) rememberedValue7, $composer2, (($dirty << 3) & 896) | 224256);
            if (TagsScreen$lambda$3(showAdd$delegate)) {
                $composer2.startReplaceGroup(1259829626);
                ComposerKt.sourceInformation($composer2, "41@1845L19,41@1866L65,41@1822L109");
                ComposerKt.sourceInformationMarkerStart($composer2, 1259830272, "CC(remember):TagsScreen.kt#9igjgp");
                Object rememberedValue8 = $composer2.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TagsScreenKt.TagsScreen$lambda$21$lambda$20(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj4);
                    rememberedValue8 = obj4;
                }
                Function0 function02 = (Function0) rememberedValue8;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1259830990, "CC(remember):TagsScreen.kt#9igjgp");
                boolean changedInstance = $composer2.changedInstance(viewModel);
                Object rememberedValue9 = $composer2.rememberedValue();
                if (changedInstance || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            return TagsScreenKt.TagsScreen$lambda$23$lambda$22(MainViewModel.this, showAdd$delegate, (String) obj6, (String) obj7);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    rememberedValue9 = obj5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                TagAddEditDialog(null, function02, (Function2) rememberedValue9, $composer2, 54);
            } else {
                $composer2.startReplaceGroup(398200949);
            }
            $composer2.endReplaceGroup();
            final Tag TagsScreen$lambda$6 = TagsScreen$lambda$6(toEdit$delegate);
            if (TagsScreen$lambda$6 == null) {
                $composer2.startReplaceGroup(400136030);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(400136031);
                ComposerKt.sourceInformation($composer2, "*43@1987L17,43@2006L114,43@1965L155");
                ComposerKt.sourceInformationMarkerStart($composer2, 1555192467, "CC(remember):TagsScreen.kt#9igjgp");
                Object rememberedValue10 = $composer2.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TagsScreenKt.TagsScreen$lambda$28$lambda$25$lambda$24(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj6);
                    rememberedValue10 = obj6;
                }
                Function0 function03 = (Function0) rememberedValue10;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1555193172, "CC(remember):TagsScreen.kt#9igjgp");
                boolean changedInstance2 = $composer2.changedInstance(viewModel) | $composer2.changed(TagsScreen$lambda$6);
                Object rememberedValue11 = $composer2.rememberedValue();
                if (changedInstance2) {
                }
                Object obj7 = new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj8, Object obj9) {
                        return TagsScreenKt.TagsScreen$lambda$28$lambda$27$lambda$26(MainViewModel.this, TagsScreen$lambda$6, toEdit$delegate, (String) obj8, (String) obj9);
                    }
                };
                $composer2.updateRememberedValue(obj7);
                rememberedValue11 = obj7;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                TagAddEditDialog(TagsScreen$lambda$6, function03, (Function2) rememberedValue11, $composer2, 48);
                $composer2.endReplaceGroup();
            }
            final Tag TagsScreen$lambda$9 = TagsScreen$lambda$9(toDelete$delegate);
            if (TagsScreen$lambda$9 == null) {
                $composer2.startReplaceGroup(400340692);
                $composer2.endReplaceGroup();
                $composer2 = $composer2;
            } else {
                $composer2.startReplaceGroup(400340693);
                ComposerKt.sourceInformation($composer2, "*50@2234L19,51@2279L45,53@2368L247,48@2162L453");
                ComposerKt.sourceInformationMarkerStart($composer2, 502015628, "CC(remember):TagsScreen.kt#9igjgp");
                Object rememberedValue12 = $composer2.rememberedValue();
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    Object obj8 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TagsScreenKt.TagsScreen$lambda$34$lambda$30$lambda$29(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj8);
                    rememberedValue12 = obj8;
                }
                Function0 function04 = (Function0) rememberedValue12;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 502017094, "CC(remember):TagsScreen.kt#9igjgp");
                boolean changedInstance3 = $composer2.changedInstance(viewModel) | $composer2.changed(TagsScreen$lambda$9);
                Object rememberedValue13 = $composer2.rememberedValue();
                if (changedInstance3 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    Object obj9 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TagsScreenKt.TagsScreen$lambda$34$lambda$32$lambda$31(MainViewModel.this, TagsScreen$lambda$9, toDelete$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj9);
                    rememberedValue13 = obj9;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                OneUIDialogKt.OneUIDialog("حذف التصنيف", function04, (Function0) rememberedValue13, "حذف", null, false, ComposableLambdaKt.rememberComposableLambda(97908538, true, new Function3() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        return TagsScreenKt.TagsScreen$lambda$34$lambda$33(Tag.this, (ColumnScope) obj10, (Composer) obj11, ((Integer) obj12).intValue());
                    }
                }, $composer2, 54), $composer2, 1575990, 48);
                $composer2 = $composer2;
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    return TagsScreenKt.TagsScreen$lambda$35(MainViewModel.this, onBack, $changed, (Composer) obj10, ((Integer) obj11).intValue());
                }
            });
        }
    }

    private static final List<Tag> TagsScreen$lambda$0(State<? extends List<Tag>> state) {
        return (List) state.getValue();
    }

    private static final List<DhikrWithTags> TagsScreen$lambda$1(State<? extends List<DhikrWithTags>> state) {
        return (List) state.getValue();
    }

    private static final boolean TagsScreen$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void TagsScreen$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Tag TagsScreen$lambda$6(MutableState<Tag> mutableState) {
        return mutableState.getValue();
    }

    private static final Tag TagsScreen$lambda$9(MutableState<Tag> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$15$lambda$14(MutableState $showAdd$delegate) {
        TagsScreen$lambda$4($showAdd$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$17$lambda$16(MutableState $toEdit$delegate, Tag it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $toEdit$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$19$lambda$18(MutableState $toDelete$delegate, Tag it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $toDelete$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$21$lambda$20(MutableState $showAdd$delegate) {
        TagsScreen$lambda$4($showAdd$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$23$lambda$22(MainViewModel $viewModel, MutableState $showAdd$delegate, String name, String color) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        MainViewModel.addTag$default($viewModel, name, color, null, 4, null);
        TagsScreen$lambda$4($showAdd$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$28$lambda$25$lambda$24(MutableState $toEdit$delegate) {
        $toEdit$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$28$lambda$27$lambda$26(MainViewModel $viewModel, Tag $tag, MutableState $toEdit$delegate, String name, String color) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        $viewModel.updateTag(Tag.copy$default($tag, 0L, name, color, 1, null));
        $toEdit$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$34$lambda$30$lambda$29(MutableState $toDelete$delegate) {
        $toDelete$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$34$lambda$32$lambda$31(MainViewModel $viewModel, Tag $tag, MutableState $toDelete$delegate) {
        $viewModel.deleteTag($tag);
        $toDelete$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsScreen$lambda$34$lambda$33(Tag $tag, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C56@2519L10,56@2563L11,54@2382L223:TagsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(97908538, $changed, -1, "com.example.ui.screens.TagsScreen.<anonymous>.<anonymous> (TagsScreen.kt:54)");
            }
            TextKt.m2816Text4IGK_g("سيتم حذف التصنيف \"" + $tag.getName() + "\" من جميع الأذكار. لن تُحذف الأذكار نفسها.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void TagsContent(final List<Tag> tags, final Map<Long, Integer> counts, final Function0<Unit> onBack, final Function0<Unit> onAdd, final Function1<? super Tag, Unit> onEdit, final Function1<? super Tag, Unit> onDelete, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(counts, "counts");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onAdd, "onAdd");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Composer $composer2 = $composer.startRestartGroup(1306817689);
        ComposerKt.sourceInformation($composer2, "C(TagsContent)N(tags,counts,onBack,onAdd,onEdit,onDelete)75@2983L61,76@3051L476,71@2813L714:TagsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(tags) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(counts) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onAdd) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onEdit) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onDelete) ? 131072 : 65536;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306817689, $dirty, -1, "com.example.ui.screens.TagsContent (TagsScreen.kt:70)");
            }
            int size = tags.size();
            int size2 = tags.size();
            String str = size + " " + (3 <= size2 && size2 < 11 ? "تصنيفات" : "تصنيف");
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1856714983, true, new Function3() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TagsScreenKt.TagsContent$lambda$36(Function0.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54);
            ComposerKt.sourceInformationMarkerStart($composer2, 1721362805, "CC(remember):TagsScreen.kt#9igjgp");
            boolean changedInstance = ((57344 & $dirty) == 16384) | $composer2.changedInstance(tags) | $composer2.changedInstance(counts) | ((458752 & $dirty) == 131072);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TagsScreenKt.TagsContent$lambda$45$lambda$44(tags, counts, onEdit, onDelete, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIKt.m7686OneUIScreengMrHQkA("التصنيفات", null, str, onBack, null, rememberComposableLambda, null, 0.0f, (Function1) rememberedValue, $composer2, (($dirty << 3) & 7168) | 196614, 210);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return TagsScreenKt.TagsContent$lambda$46(tags, counts, onBack, onAdd, onEdit, onDelete, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsContent$lambda$36(Function0 $onAdd, RowScope OneUIScreen, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        ComposerKt.sourceInformation($composer, "C75@2985L57:TagsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1856714983, $changed, -1, "com.example.ui.screens.TagsContent.<anonymous> (TagsScreen.kt:75)");
            }
            OneUIKt.OneUIIconAction(AddKt.getAdd(Icons.Outlined.INSTANCE), "إضافة تصنيف", $onAdd, $composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsContent$lambda$45$lambda$44(final List $tags, final Map $counts, final Function1 $onEdit, final Function1 $onDelete, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        if ($tags.isEmpty()) {
            LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableSingletons$TagsScreenKt.INSTANCE.getLambda$1635241148$app(), 3, null);
        } else {
            LazyListScope.CC.item$default(OneUIScreen, "group", null, ComposableLambdaKt.composableLambdaInstance(-1489787821, true, new Function3() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TagsScreenKt.TagsContent$lambda$45$lambda$44$lambda$43($tags, $counts, $onEdit, $onDelete, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsContent$lambda$45$lambda$44$lambda$43(final List $tags, final Map $counts, final Function1 $onEdit, final Function1 $onDelete, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C81@3245L252,81@3235L262:TagsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1489787821, $changed, -1, "com.example.ui.screens.TagsContent.<anonymous>.<anonymous>.<anonymous> (TagsScreen.kt:81)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(1011794952, true, new Function3() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TagsScreenKt.TagsContent$lambda$45$lambda$44$lambda$43$lambda$42($tags, $counts, $onEdit, $onDelete, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
    public static final Unit TagsContent$lambda$45$lambda$44$lambda$43$lambda$42(List $tags, Map $counts, Function1 $onEdit, final Function1 $onDelete, ColumnScope OneUICard, Composer $composer, int $changed) {
        int i;
        boolean changed;
        final Function1 function1 = $onEdit;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation(composer, "C*84@3422L15,84@3439L17,84@3386L71:TagsScreen.kt#2thlc2");
        int i2 = 0;
        if (composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1011794952, $changed, -1, "com.example.ui.screens.TagsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TagsScreen.kt:82)");
            }
            int i3 = 0;
            for (Object obj : $tags) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i5 = i3;
                final Tag tag = (Tag) obj;
                if (i5 > 0) {
                    composer.startReplaceGroup(1109547952);
                    ComposerKt.sourceInformation(composer, "83@3334L27");
                    OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), composer, 6, i2);
                } else {
                    composer.startReplaceGroup(32938989);
                }
                composer.endReplaceGroup();
                Integer num = (Integer) $counts.get(Long.valueOf(tag.getTagId()));
                int intValue = num != null ? num.intValue() : i2;
                ComposerKt.sourceInformationMarkerStart(composer, 1109550756, "CC(remember):TagsScreen.kt#9igjgp");
                boolean changed2 = composer.changed(function1) | composer.changed(tag);
                Object rememberedValue = $composer.rememberedValue();
                if (changed2) {
                    i = intValue;
                } else {
                    i = intValue;
                    if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                        Function0 function0 = (Function0) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerStart(composer, 1109551302, "CC(remember):TagsScreen.kt#9igjgp");
                        changed = composer.changed($onDelete) | composer.changed(tag);
                        Object rememberedValue2 = $composer.rememberedValue();
                        if (!changed && rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            TagRow(tag, i, function0, (Function0) rememberedValue2, composer, 0);
                            function1 = $onEdit;
                            composer = $composer;
                            i3 = i4;
                            i2 = 0;
                        }
                        Object obj2 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TagsScreenKt.TagsContent$lambda$45$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40$lambda$39(Function1.this, tag);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        rememberedValue2 = obj2;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        TagRow(tag, i, function0, (Function0) rememberedValue2, composer, 0);
                        function1 = $onEdit;
                        composer = $composer;
                        i3 = i4;
                        i2 = 0;
                    }
                }
                Object obj3 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TagsScreenKt.TagsContent$lambda$45$lambda$44$lambda$43$lambda$42$lambda$41$lambda$38$lambda$37(Function1.this, tag);
                    }
                };
                $composer.updateRememberedValue(obj3);
                rememberedValue = obj3;
                Function0 function02 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 1109551302, "CC(remember):TagsScreen.kt#9igjgp");
                changed = composer.changed($onDelete) | composer.changed(tag);
                Object rememberedValue22 = $composer.rememberedValue();
                if (!changed) {
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    TagRow(tag, i, function02, (Function0) rememberedValue22, composer, 0);
                    function1 = $onEdit;
                    composer = $composer;
                    i3 = i4;
                    i2 = 0;
                }
                Object obj22 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TagsScreenKt.TagsContent$lambda$45$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40$lambda$39(Function1.this, tag);
                    }
                };
                $composer.updateRememberedValue(obj22);
                rememberedValue22 = obj22;
                ComposerKt.sourceInformationMarkerEnd(composer);
                TagRow(tag, i, function02, (Function0) rememberedValue22, composer, 0);
                function1 = $onEdit;
                composer = $composer;
                i3 = i4;
                i2 = 0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsContent$lambda$45$lambda$44$lambda$43$lambda$42$lambda$41$lambda$38$lambda$37(Function1 $onEdit, Tag $tag) {
        $onEdit.invoke($tag);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagsContent$lambda$45$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40$lambda$39(Function1 $onDelete, Tag $tag) {
        $onDelete.invoke($tag);
        return Unit.INSTANCE;
    }

    private static final void TagRow(final Tag tag, int count, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        int i;
        Composer $composer2 = $composer.startRestartGroup(-1457028524);
        ComposerKt.sourceInformation($composer2, "C(TagRow)N(tag,count,onEdit,onDelete)94@3655L11,99@3788L282,104@4091L477,95@3671L903:TagsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(tag) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            i = count;
            $dirty |= $composer2.changed(i) ? 32 : 16;
        } else {
            i = count;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(function02) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1457028524, $dirty2, -1, "com.example.ui.screens.TagRow (TagsScreen.kt:93)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            OneUIKt.m7685OneUIRowRFMEUTM(tag.getName(), null, OneUIKt.azkarCount(i), ComposableLambdaKt.rememberComposableLambda(53713060, true, new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TagsScreenKt.TagRow$lambda$48(Tag.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(112933797, true, new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TagsScreenKt.TagRow$lambda$50(ColorScheme.this, function0, function02, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), function0, 0L, $composer2, (($dirty2 << 9) & 458752) | 27648, 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final int i2 = i;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TagsScreenKt.TagRow$lambda$51(Tag.this, i2, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TagRow$lambda$48(Tag $tag, Composer $composer, int $changed) {
        long m4487copywmQWz5c;
        int i;
        ComposerKt.sourceInformation($composer, "C100@3802L258:TagsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(53713060, $changed, -1, "com.example.ui.screens.TagRow.<anonymous> (TagsScreen.kt:100)");
            }
            Modifier clip = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape());
            m4487copywmQWz5c = Color.m4487copywmQWz5c(r14, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r14) : 0.18f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r14) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r14) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(OneUIKt.m7688parseColorSafe4WTKRHQ$default($tag.getColorHex(), 0L, 2, null)) : 0.0f);
            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(clip, m4487copywmQWz5c, null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            if (m3828constructorimpl.getInserting()) {
                i = currentCompositeKeyHash;
            } else {
                i = currentCompositeKeyHash;
                if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1197065851, "C101@3962L84:TagsScreen.kt#2thlc2");
                    BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), RoundedCornerShapeKt.getCircleShape()), OneUIKt.m7688parseColorSafe4WTKRHQ$default($tag.getColorHex(), 0L, 2, null), null, 2, null), $composer, 0);
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
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i42 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1197065851, "C101@3962L84:TagsScreen.kt#2thlc2");
            BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), RoundedCornerShapeKt.getCircleShape()), OneUIKt.m7688parseColorSafe4WTKRHQ$default($tag.getColorHex(), 0L, 2, null), null, 2, null), $composer, 0);
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
    /* JADX WARN: Removed duplicated region for block: B:22:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TagRow$lambda$50(ColorScheme $cs, Function0 $onEdit, Function0 $onDelete, Composer $composer, int $changed) {
        int i;
        ComposerKt.sourceInformation($composer, "C105@4105L453:TagsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(112933797, $changed, -1, "com.example.ui.screens.TagRow.<anonymous> (TagsScreen.kt:105)");
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
            if (m3828constructorimpl.getInserting()) {
                i = 384;
            } else {
                i = 384;
                if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i4 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 814260937, "C106@4175L175,108@4367L177:TagsScreen.kt#2thlc2");
                    IconKt.m2273Iconww6aTOc(EditKt.getEdit(Icons.Outlined.INSTANCE), "تعديل", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onEdit, 7, null), Dp.m7226constructorimpl(9)), $cs.getOnSurfaceVariant(), $composer, 48, 0);
                    IconKt.m2273Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), "حذف", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onDelete, 7, null), Dp.m7226constructorimpl(9)), $cs.getOnSurfaceVariant(), $composer, 48, 0);
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
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i42 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 814260937, "C106@4175L175,108@4367L177:TagsScreen.kt#2thlc2");
            IconKt.m2273Iconww6aTOc(EditKt.getEdit(Icons.Outlined.INSTANCE), "تعديل", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onEdit, 7, null), Dp.m7226constructorimpl(9)), $cs.getOnSurfaceVariant(), $composer, 48, 0);
            IconKt.m2273Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), "حذف", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, $onDelete, 7, null), Dp.m7226constructorimpl(9)), $cs.getOnSurfaceVariant(), $composer, 48, 0);
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

    public static final void TagAddEditDialog(final Tag tag, Function0<Unit> function0, final Function2<? super String, ? super String, Unit> onConfirm, Composer $composer, final int $changed) {
        String str;
        Object mutableStateOf$default;
        String str2;
        Object mutableStateOf$default2;
        final Function0<Unit> onDismiss = function0;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer $composer2 = $composer.startRestartGroup(-1435496868);
        ComposerKt.sourceInformation($composer2, "C(TagAddEditDialog)N(tag,onDismiss,onConfirm)117@4700L44,118@4762L55,126@5132L56,128@5239L924,123@5000L1163:TagsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(tag) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onConfirm) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1435496868, $dirty2, -1, "com.example.ui.screens.TagAddEditDialog (TagsScreen.kt:116)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -827984184, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                if (tag == null || (str2 = tag.getName()) == null) {
                    str2 = "";
                }
                mutableStateOf$default2 = SnapshotStateKt.mutableStateOf(str2, SnapshotStateKt.structuralEqualityPolicy());
                $composer2.updateRememberedValue(mutableStateOf$default2);
                rememberedValue = mutableStateOf$default2;
            }
            final MutableState name$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -827982189, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (tag == null || (str = tag.getColorHex()) == null) {
                    str = "#008080";
                }
                mutableStateOf$default = SnapshotStateKt.mutableStateOf(str, SnapshotStateKt.structuralEqualityPolicy());
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue2 = mutableStateOf$default;
            }
            final MutableState color$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final List colors = CollectionsKt.listOf((Object[]) new String[]{"#008080", "#800080", "#1E3A8A", "#059669", "#DC2626", "#D97706", "#4F46E5", "#2563EB", "#0284C7", "#0D9488", "#16A34A", "#CA8A04"});
            String str3 = tag == null ? "تصنيف جديد" : "تعديل التصنيف";
            ComposerKt.sourceInformationMarkerStart($composer2, -827970348, "CC(remember):TagsScreen.kt#9igjgp");
            boolean z = ($dirty2 & 896) == 256;
            Object rememberedValue3 = $composer2.rememberedValue();
            if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TagsScreenKt.TagAddEditDialog$lambda$59$lambda$58(Function2.this, name$delegate, color$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            onDismiss = function0;
            OneUIDialogKt.OneUIDialog(str3, onDismiss, (Function0) rememberedValue3, null, null, !StringsKt.isBlank(TagAddEditDialog$lambda$53(name$delegate)), ComposableLambdaKt.rememberComposableLambda(1532471741, true, new Function3() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return TagsScreenKt.TagAddEditDialog$lambda$67(colors, name$delegate, color$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty2 & 112) | 1572864, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return TagsScreenKt.TagAddEditDialog$lambda$68(Tag.this, onDismiss, onConfirm, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String TagAddEditDialog$lambda$53(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String TagAddEditDialog$lambda$56(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagAddEditDialog$lambda$59$lambda$58(Function2 $onConfirm, MutableState $name$delegate, MutableState $color$delegate) {
        if (!StringsKt.isBlank(TagAddEditDialog$lambda$53($name$delegate))) {
            $onConfirm.invoke(StringsKt.trim((CharSequence) TagAddEditDialog$lambda$53($name$delegate)).toString(), TagAddEditDialog$lambda$56($color$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TagAddEditDialog$lambda$67(List $colors, final MutableState $name$delegate, final MutableState $color$delegate, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Function0 function0;
        List list;
        Modifier modifier;
        Arrangement.Horizontal horizontal;
        Modifier.Companion companion;
        String str;
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C129@5270L13,129@5249L50,130@5308L30,131@5383L10,131@5428L11,131@5347L110,132@5466L30,*134@5558L546,144@6117L30:TagsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1532471741, $changed, -1, "com.example.ui.screens.TagAddEditDialog.<anonymous> (TagsScreen.kt:129)");
            }
            String TagAddEditDialog$lambda$53 = TagAddEditDialog$lambda$53($name$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -468438422, "CC(remember):TagsScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TagsScreenKt.TagAddEditDialog$lambda$67$lambda$61$lambda$60(MutableState.this, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUITextField(TagAddEditDialog$lambda$53, (Function1) rememberedValue, "اسم التصنيف", null, false, null, $composer, 432, 56);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), $composer, 6);
            String str2 = "CC(remember):TagsScreen.kt#9igjgp";
            TextKt.m2816Text4IGK_g("اللون", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65530);
            int i = 6;
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
            Iterable chunked = CollectionsKt.chunked($colors, 6);
            int i2 = 0;
            Iterator it = chunked.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                int i3 = 0;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                int i4 = i;
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Iterable iterable = chunked;
                Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = i2;
                int i6 = ((((54 << 3) & 112) << 6) & 896) | 6;
                Iterator it2 = it;
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
                if (m3828constructorimpl.getInserting()) {
                    list = list2;
                } else {
                    list = list2;
                    if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i7 = (i6 >> 6) & 14;
                        int i8 = 0;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i9 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 197616076, "C:TagsScreen.kt#2thlc2");
                        $composer.startReplaceGroup(-1102003635);
                        ComposerKt.sourceInformation($composer, "*140@6035L15,137@5761L311");
                        List<String> list3 = list;
                        int i10 = 0;
                        for (final String str3 : list3) {
                            Iterable iterable2 = list3;
                            int i11 = i10;
                            int i12 = i8;
                            boolean equals = StringsKt.equals(TagAddEditDialog$lambda$56($color$delegate), str3, true);
                            int i13 = i9;
                            int i14 = i3;
                            Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), OneUIKt.m7688parseColorSafe4WTKRHQ$default(str3, 0L, 2, null), null, 2, null);
                            if (equals) {
                                $composer.startReplaceGroup(1979860050);
                                ComposerKt.sourceInformation($composer, "139@5945L11");
                                modifier = fillMaxWidth$default;
                                horizontal = spaceBetween;
                                companion = BorderKt.m242borderxT4_qwU(Modifier.INSTANCE, Dp.m7226constructorimpl(3), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), RoundedCornerShapeKt.getCircleShape());
                                $composer.endReplaceGroup();
                            } else {
                                modifier = fillMaxWidth$default;
                                horizontal = spaceBetween;
                                $composer.startReplaceGroup(1979862172);
                                $composer.endReplaceGroup();
                                companion = Modifier.INSTANCE;
                            }
                            Modifier then = m231backgroundbw27NRU$default.then(companion);
                            String str4 = str2;
                            ComposerKt.sourceInformationMarkerStart($composer, 1979863747, str4);
                            boolean changed = $composer.changed(str3);
                            Object rememberedValue2 = $composer.rememberedValue();
                            if (!changed && rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                str = str4;
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                BoxKt.Box(ClickableKt.m264clickableXHw0xAI$default(then, false, null, null, (Function0) rememberedValue2, 7, null), $composer, 0);
                                fillMaxWidth$default = modifier;
                                list3 = iterable2;
                                i10 = i11;
                                i8 = i12;
                                i3 = i14;
                                i9 = i13;
                                spaceBetween = horizontal;
                                str2 = str;
                            }
                            str = str4;
                            Object obj2 = new Function0() { // from class: com.example.ui.screens.TagsScreenKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TagsScreenKt.TagAddEditDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(str3, $color$delegate);
                                }
                            };
                            $composer.updateRememberedValue(obj2);
                            rememberedValue2 = obj2;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            BoxKt.Box(ClickableKt.m264clickableXHw0xAI$default(then, false, null, null, (Function0) rememberedValue2, 7, null), $composer, 0);
                            fillMaxWidth$default = modifier;
                            list3 = iterable2;
                            i10 = i11;
                            i8 = i12;
                            i3 = i14;
                            i9 = i13;
                            spaceBetween = horizontal;
                            str2 = str;
                        }
                        $composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        i = i4;
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, i);
                        chunked = iterable;
                        i2 = i5;
                        it = it2;
                    }
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i72 = (i6 >> 6) & 14;
                int i82 = 0;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i92 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 197616076, "C:TagsScreen.kt#2thlc2");
                $composer.startReplaceGroup(-1102003635);
                ComposerKt.sourceInformation($composer, "*140@6035L15,137@5761L311");
                List<String> list32 = list;
                int i102 = 0;
                while (r29.hasNext()) {
                }
                $composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                i = i4;
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, i);
                chunked = iterable;
                i2 = i5;
                it = it2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagAddEditDialog$lambda$67$lambda$61$lambda$60(MutableState $name$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $name$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TagAddEditDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(String $hex, MutableState $color$delegate) {
        $color$delegate.setValue($hex);
        return Unit.INSTANCE;
    }
}
