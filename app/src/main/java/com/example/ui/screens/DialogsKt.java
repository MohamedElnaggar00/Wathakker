package com.example.ui.screens;

import androidx.autofill.HintConstants;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material.icons.outlined.NotificationsKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import androidx.profileinstaller.ProfileVerifier;
import com.example.data.Dhikr;
import com.example.data.Dhikr$$ExternalSyntheticBackport1;
import com.example.data.Tag;
import com.example.ui.components.WheelTimePickerKt;
import com.example.ui.oneui.OneUIDialogKt;
import com.example.ui.oneui.OneUIKt;
import com.example.utils.DateTimeUtilsKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a±\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062l\u0010\u0007\u001ah\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\b2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a®\u0001\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062Q\u0010\u0007\u001aM\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u00182\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0019\u001a{\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\f\u001a\u00020\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\r\u001a\u00020\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010 \u001a9\u0010!\u001a\u00020\u0001*\u00020\u001b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010#\u001a=\u0010$\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010%\u001a7\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\t2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010*\u001a5\u0010+\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010-\u001a4\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b3H\u0007¢\u0006\u0004\b4\u00105¨\u00066²\u0006\n\u0010\f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\tX\u008a\u008e\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020\tX\u008a\u008e\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u000208X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020<X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020<X\u008a\u008e\u0002"}, d2 = {"DhikrAddDialog", "", "allTags", "", "Lcom/example/data/Tag;", "onDismiss", "Lkotlin/Function0;", "onConfirm", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "title", "content", "times", "", "tagIds", "onCreateTag", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DhikrEditDialog", "dhikr", "Lcom/example/data/Dhikr;", "initialTagIds", "Lkotlin/Function3;", "(Lcom/example/data/Dhikr;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DhikrAddForm", "Landroidx/compose/foundation/layout/ColumnScope;", "onTitle", "onContent", "selected", "", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "TimesEditor", "onChange", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DhikrMultipleTimesDialog", "(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "TimeRow", "timeStr", "onTimeChange", "onDelete", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DhikrDetailDialog", "onMarkAsRead", "(Lcom/example/data/Dhikr;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SimpleFlowRow", "spacing", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "SimpleFlowRow-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app", "showNew", "", "newName", "showPicker", "h", "", "m"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DialogsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddDialog$lambda$19(List list, Function0 function0, Function4 function4, Function1 function1, int i, int i2, Composer composer, int i3) {
        DhikrAddDialog(list, function0, function4, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddForm$lambda$54(ColumnScope columnScope, String str, Function1 function1, String str2, Function1 function12, List list, List list2, Function1 function13, int i, Composer composer, int i2) {
        DhikrAddForm(columnScope, str, function1, str2, function12, list, list2, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDetailDialog$lambda$102(Dhikr dhikr, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        DhikrDetailDialog(dhikr, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrEditDialog$lambda$35(Dhikr dhikr, List list, List list2, Function0 function0, Function3 function3, Function1 function1, int i, int i2, Composer composer, int i3) {
        DhikrEditDialog(dhikr, list, list2, function0, function3, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrMultipleTimesDialog$lambda$75(Dhikr dhikr, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        DhikrMultipleTimesDialog(dhikr, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SimpleFlowRow_Kz89ssw$lambda$104(float f, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m7714SimpleFlowRowKz89ssw(f, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeRow$lambda$96(String str, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        TimeRow(str, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimesEditor$lambda$66(ColumnScope columnScope, List list, Function1 function1, int i, Composer composer, int i2) {
        TimesEditor(columnScope, list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DhikrAddDialog(List<Tag> list, final Function0<Unit> onDismiss, final Function4<? super String, ? super String, ? super List<String>, ? super List<Long>, Unit> onConfirm, Function1<? super String, Unit> function1, Composer $composer, final int $changed, final int i) {
        List list2;
        Function1 function12;
        Composer $composer2;
        final List allTags;
        final Function1 onCreateTag;
        final List allTags2;
        final Function1 onCreateTag2;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Object mutableStateOf$default3;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer $composer3 = $composer.startRestartGroup(-1402154285);
        ComposerKt.sourceInformation($composer3, "C(DhikrAddDialog)N(allTags,onDismiss,onConfirm,onCreateTag)32@1233L31,33@1284L31,34@1333L44,35@1397L39,38@1525L139,40@1762L152,36@1441L473:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            list2 = list;
        } else if (($changed & 6) == 0) {
            list2 = list;
            $dirty |= $composer3.changedInstance(list2) ? 4 : 2;
        } else {
            list2 = list;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            function12 = function1;
        } else if (($changed & 3072) == 0) {
            function12 = function1;
            $dirty |= $composer3.changedInstance(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            allTags = list2;
            onCreateTag = function12;
        } else {
            if (i2 != 0) {
                allTags2 = CollectionsKt.emptyList();
            } else {
                allTags2 = list2;
            }
            if (i3 == 0) {
                onCreateTag2 = function12;
            } else {
                onCreateTag2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1402154285, $dirty2, -1, "com.example.ui.screens.DhikrAddDialog (Dialogs.kt:31)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1149471410, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default3 = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default3);
                rememberedValue = mutableStateOf$default3;
            }
            final MutableState title$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1149473042, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default2);
                rememberedValue2 = mutableStateOf$default2;
            }
            final MutableState content$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1149474623, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt.mutableStateOf$default(CollectionsKt.listOf("09:00"), null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default);
                rememberedValue3 = mutableStateOf$default;
            }
            final MutableState times$delegate = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1149476666, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object mutableStateListOf = SnapshotStateKt.mutableStateListOf();
                $composer3.updateRememberedValue(mutableStateListOf);
                rememberedValue4 = mutableStateListOf;
            }
            final SnapshotStateList selected = (SnapshotStateList) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1149480862, "CC(remember):Dialogs.kt#9igjgp");
            boolean z = ($dirty2 & 896) == 256;
            Object rememberedValue5 = $composer3.rememberedValue();
            if (z || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DialogsKt.DhikrAddDialog$lambda$11$lambda$10(Function4.this, selected, title$delegate, content$delegate, times$delegate);
                    }
                };
                $composer3.updateRememberedValue(obj);
                rememberedValue5 = obj;
            }
            Function0 function0 = (Function0) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            OneUIDialogKt.OneUIDialog("ذكر جديد", onDismiss, function0, null, null, (StringsKt.isBlank(DhikrAddDialog$lambda$1(title$delegate)) || StringsKt.isBlank(DhikrAddDialog$lambda$4(content$delegate)) || DhikrAddDialog$lambda$7(times$delegate).isEmpty()) ? false : true, ComposableLambdaKt.rememberComposableLambda(1160814964, true, new Function3() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return DialogsKt.DhikrAddDialog$lambda$18(allTags2, selected, onCreateTag2, title$delegate, content$delegate, times$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty2 & 112) | 1572870, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            allTags = allTags2;
            onCreateTag = onCreateTag2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DialogsKt.DhikrAddDialog$lambda$19(allTags, onDismiss, onConfirm, onCreateTag, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String DhikrAddDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String DhikrAddDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<String> DhikrAddDialog$lambda$7(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddDialog$lambda$11$lambda$10(Function4 $onConfirm, SnapshotStateList $selected, MutableState $title$delegate, MutableState $content$delegate, MutableState $times$delegate) {
        if (!StringsKt.isBlank(DhikrAddDialog$lambda$1($title$delegate)) && !StringsKt.isBlank(DhikrAddDialog$lambda$4($content$delegate)) && !DhikrAddDialog$lambda$7($times$delegate).isEmpty()) {
            $onConfirm.invoke(StringsKt.trim((CharSequence) DhikrAddDialog$lambda$1($title$delegate)).toString(), StringsKt.trim((CharSequence) DhikrAddDialog$lambda$4($content$delegate)).toString(), DhikrAddDialog$lambda$7($times$delegate), $selected.toList());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddDialog$lambda$18(List $allTags, SnapshotStateList $selected, Function1 $onCreateTag, final MutableState $title$delegate, final MutableState $content$delegate, final MutableState $times$delegate, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C41@1792L14,41@1817L16,41@1772L94,42@1894L14,42@1875L33:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(OneUIDialog) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160814964, $dirty2, -1, "com.example.ui.screens.DhikrAddDialog.<anonymous> (Dialogs.kt:41)");
            }
            String DhikrAddDialog$lambda$1 = DhikrAddDialog$lambda$1($title$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1148315582, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DialogsKt.DhikrAddDialog$lambda$18$lambda$13$lambda$12(MutableState.this, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            Function1 function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            String DhikrAddDialog$lambda$4 = DhikrAddDialog$lambda$4($content$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1148314780, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return DialogsKt.DhikrAddDialog$lambda$18$lambda$15$lambda$14(MutableState.this, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            DhikrAddForm(OneUIDialog, DhikrAddDialog$lambda$1, function1, DhikrAddDialog$lambda$4, (Function1) rememberedValue2, $allTags, $selected, $onCreateTag, $composer, ($dirty2 & 14) | 1597824);
            List<String> DhikrAddDialog$lambda$7 = DhikrAddDialog$lambda$7($times$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1148312318, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return DialogsKt.DhikrAddDialog$lambda$18$lambda$17$lambda$16(MutableState.this, (List) obj4);
                    }
                };
                $composer.updateRememberedValue(obj3);
                rememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TimesEditor(OneUIDialog, DhikrAddDialog$lambda$7, (Function1) rememberedValue3, $composer, ($dirty2 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddDialog$lambda$18$lambda$13$lambda$12(MutableState $title$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $title$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddDialog$lambda$18$lambda$15$lambda$14(MutableState $content$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $content$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddDialog$lambda$18$lambda$17$lambda$16(MutableState $times$delegate, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $times$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final void DhikrEditDialog(final Dhikr dhikr, List<Tag> list, List<Long> list2, final Function0<Unit> onDismiss, final Function3<? super String, ? super String, ? super List<Long>, Unit> onConfirm, Function1<? super String, Unit> function1, Composer $composer, final int $changed, final int i) {
        List list3;
        List list4;
        Function1 function12;
        final List allTags;
        final List initialTagIds;
        final Function1 onCreateTag;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer $composer2 = $composer.startRestartGroup(-101327221);
        ComposerKt.sourceInformation($composer2, "C(DhikrEditDialog)N(dhikr,allTags,initialTagIds,onDismiss,onConfirm,onCreateTag)55@2221L40,56@2281L42,57@2343L71,60@2506L110,62@2692L110,58@2419L383:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(dhikr) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            list3 = list;
        } else if (($changed & 48) == 0) {
            list3 = list;
            $dirty |= $composer2.changedInstance(list3) ? 32 : 16;
        } else {
            list3 = list;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            list4 = list2;
        } else if (($changed & 384) == 0) {
            list4 = list2;
            $dirty |= $composer2.changedInstance(list4) ? 256 : 128;
        } else {
            list4 = list2;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onConfirm) ? 16384 : 8192;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function12 = function1;
        } else if ((196608 & $changed) == 0) {
            function12 = function1;
            $dirty |= $composer2.changedInstance(function12) ? 131072 : 65536;
        } else {
            function12 = function1;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            final List allTags2 = i2 != 0 ? CollectionsKt.emptyList() : list3;
            List initialTagIds2 = i3 != 0 ? CollectionsKt.emptyList() : list4;
            final Function1 onCreateTag2 = i4 != 0 ? null : function12;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-101327221, $dirty2, -1, "com.example.ui.screens.DhikrEditDialog (Dialogs.kt:54)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1408798163, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(dhikr.getTitle(), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default2);
                rememberedValue = mutableStateOf$default2;
            }
            final MutableState title$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1408800085, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt.mutableStateOf$default(dhikr.getContent(), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue2 = mutableStateOf$default;
            }
            final MutableState content$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1408802098, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
                mutableStateListOf.addAll(initialTagIds2);
                $composer2.updateRememberedValue(mutableStateListOf);
                rememberedValue3 = mutableStateListOf;
            }
            final SnapshotStateList selected = (SnapshotStateList) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1408807353, "CC(remember):Dialogs.kt#9igjgp");
            boolean z = (57344 & $dirty2) == 16384;
            Object rememberedValue4 = $composer2.rememberedValue();
            if (z || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DialogsKt.DhikrEditDialog$lambda$29$lambda$28(Function3.this, selected, title$delegate, content$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue4 = obj;
            }
            Function0 function0 = (Function0) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIDialogKt.OneUIDialog("تعديل الذكر", onDismiss, function0, null, null, (StringsKt.isBlank(DhikrEditDialog$lambda$21(title$delegate)) || StringsKt.isBlank(DhikrEditDialog$lambda$24(content$delegate))) ? false : true, ComposableLambdaKt.rememberComposableLambda(-170146900, true, new Function3() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return DialogsKt.DhikrEditDialog$lambda$34(allTags2, selected, onCreateTag2, title$delegate, content$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 6) & 112) | 1572870, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            initialTagIds = initialTagIds2;
            allTags = allTags2;
            onCreateTag = onCreateTag2;
        } else {
            $composer2.skipToGroupEnd();
            allTags = list3;
            initialTagIds = list4;
            onCreateTag = function12;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DialogsKt.DhikrEditDialog$lambda$35(Dhikr.this, allTags, initialTagIds, onDismiss, onConfirm, onCreateTag, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String DhikrEditDialog$lambda$21(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String DhikrEditDialog$lambda$24(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrEditDialog$lambda$29$lambda$28(Function3 $onConfirm, SnapshotStateList $selected, MutableState $title$delegate, MutableState $content$delegate) {
        if (!StringsKt.isBlank(DhikrEditDialog$lambda$21($title$delegate)) && !StringsKt.isBlank(DhikrEditDialog$lambda$24($content$delegate))) {
            $onConfirm.invoke(StringsKt.trim((CharSequence) DhikrEditDialog$lambda$21($title$delegate)).toString(), StringsKt.trim((CharSequence) DhikrEditDialog$lambda$24($content$delegate)).toString(), $selected.toList());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrEditDialog$lambda$34(List $allTags, SnapshotStateList $selected, Function1 $onCreateTag, final MutableState $title$delegate, final MutableState $content$delegate, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C63@2722L14,63@2747L16,63@2702L94:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(OneUIDialog) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-170146900, $dirty2, -1, "com.example.ui.screens.DhikrEditDialog.<anonymous> (Dialogs.kt:63)");
            }
            String DhikrEditDialog$lambda$21 = DhikrEditDialog$lambda$21($title$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -302412678, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DialogsKt.DhikrEditDialog$lambda$34$lambda$31$lambda$30(MutableState.this, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            Function1 function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            String DhikrEditDialog$lambda$24 = DhikrEditDialog$lambda$24($content$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -302411876, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return DialogsKt.DhikrEditDialog$lambda$34$lambda$33$lambda$32(MutableState.this, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            DhikrAddForm(OneUIDialog, DhikrEditDialog$lambda$21, function1, DhikrEditDialog$lambda$24, (Function1) rememberedValue2, $allTags, $selected, $onCreateTag, $composer, ($dirty2 & 14) | 1597824);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrEditDialog$lambda$34$lambda$31$lambda$30(MutableState $title$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $title$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrEditDialog$lambda$34$lambda$33$lambda$32(MutableState $content$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $content$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x05d0, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DhikrAddForm(final ColumnScope $this$DhikrAddForm, final String title, final Function1<? super String, Unit> onTitle, final String content, final Function1<? super String, Unit> onContent, final List<Tag> allTags, final List<Long> selected, final Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        MutableState showNew$delegate;
        Function0 function0;
        final MutableState showNew$delegate2;
        String str;
        final MutableState newName$delegate;
        Function0 function02;
        Object rememberedValue;
        boolean z;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Intrinsics.checkNotNullParameter($this$DhikrAddForm, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onTitle, "onTitle");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onContent, "onContent");
        Intrinsics.checkNotNullParameter(allTags, "allTags");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Composer $composer3 = $composer.startRestartGroup(-482240221);
        ComposerKt.sourceInformation($composer3, "C(DhikrAddForm)N(title,onTitle,content,onContent,allTags,selected,onCreateTag)75@3102L11,76@3133L34,77@3187L31,78@3223L41,79@3269L30,80@3304L76,81@3385L30,82@3420L530,99@4427L241,99@4397L271:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onTitle) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(content) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onContent) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(allTags) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(selected) ? 1048576 : 524288;
        }
        if ((12582912 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute((4793489 & $dirty) != 4793488, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-482240221, $dirty, -1, "com.example.ui.screens.DhikrAddForm (Dialogs.kt:74)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            ComposerKt.sourceInformationMarkerStart($composer3, 423626085, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            int $dirty2 = $dirty;
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default2);
                rememberedValue2 = mutableStateOf$default2;
            }
            MutableState showNew$delegate3 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 423627810, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                showNew$delegate = showNew$delegate3;
                mutableStateOf$default = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default);
                rememberedValue3 = mutableStateOf$default;
            } else {
                showNew$delegate = showNew$delegate3;
            }
            MutableState newName$delegate2 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            OneUIKt.OneUITextField(title, onTitle, "العنوان", null, false, null, $composer3, (($dirty2 >> 3) & 14) | 384 | (($dirty2 >> 3) & 112), 56);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer3, 6);
            OneUIKt.OneUITextField(content, onContent, "نص الذكر أو الدعاء", null, false, null, $composer3, (($dirty2 >> 9) & 14) | 24960 | (($dirty2 >> 9) & 112), 40);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), $composer3, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer3, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
                int i2 = (i >> 6) & 14;
                Composer composer = $composer3;
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i3 = ((390 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 579948743, "C83@3547L10,83@3507L123:Dialogs.kt#2thlc2");
                TextKt.m2816Text4IGK_g("التصنيفات", RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 6, 0, 65528);
                if (function1 == null) {
                    composer.startReplaceGroup(580099619);
                    ComposerKt.sourceInformation(composer, "86@3762L10,87@3860L6,87@3884L22,85@3678L256");
                    String str2 = DhikrAddForm$lambda$37(showNew$delegate) ? "إلغاء" : "تصنيف جديد";
                    TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge();
                    long primary = cs.getPrimary();
                    Modifier clip = ClipKt.clip(Modifier.INSTANCE, MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable).getSmall());
                    str = "CC(remember):Dialogs.kt#9igjgp";
                    ComposerKt.sourceInformationMarkerStart(composer, 157267005, str);
                    Object rememberedValue4 = composer.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        showNew$delegate2 = showNew$delegate;
                        rememberedValue4 = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DialogsKt.DhikrAddForm$lambda$44$lambda$43$lambda$42(MutableState.this);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue4);
                    } else {
                        showNew$delegate2 = showNew$delegate;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    TextKt.m2816Text4IGK_g(str2, PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue4, 7, null), Dp.m7226constructorimpl(8)), primary, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelLarge, composer, 0, 0, 65528);
                    composer = composer;
                } else {
                    showNew$delegate2 = showNew$delegate;
                    str = "CC(remember):Dialogs.kt#9igjgp";
                    composer.startReplaceGroup(576455259);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (DhikrAddForm$lambda$37(showNew$delegate2) || function1 == null) {
                    newName$delegate = newName$delegate2;
                    $composer3.startReplaceGroup(244396767);
                } else {
                    $composer3.startReplaceGroup(248369262);
                    ComposerKt.sourceInformation($composer3, "92@4001L347,97@4357L29");
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifier);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function02 = constructor2;
                        $composer3.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer3.useNode();
                    }
                    Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer3);
                    Updater.m3835setimpl(m3828constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i5 = (i4 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i6 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer3, 1625277042, "C93@4091L16,93@4067L88,94@4168L28,95@4230L92,95@4209L129:Dialogs.kt#2thlc2");
                        String DhikrAddForm$lambda$40 = DhikrAddForm$lambda$40(newName$delegate2);
                        ComposerKt.sourceInformationMarkerStart($composer3, 1576449458, str);
                        rememberedValue = $composer3.rememberedValue();
                        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                            newName$delegate = newName$delegate2;
                            rememberedValue = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DialogsKt.DhikrAddForm$lambda$49$lambda$46$lambda$45(MutableState.this, (String) obj);
                                }
                            };
                            $composer3.updateRememberedValue(rememberedValue);
                        } else {
                            newName$delegate = newName$delegate2;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        OneUIKt.OneUITextField(DhikrAddForm$lambda$40, (Function1) rememberedValue, "اسم التصنيف", RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, $composer3, 432, 48);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer3, 6);
                        ComposerKt.sourceInformationMarkerStart($composer3, 1576453982, str);
                        z = ($dirty2 & 29360128) != 8388608;
                        Object rememberedValue5 = $composer3.rememberedValue();
                        if (z) {
                        }
                        Object obj = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DialogsKt.DhikrAddForm$lambda$49$lambda$48$lambda$47(Function1.this, newName$delegate, showNew$delegate2);
                            }
                        };
                        $composer3.updateRememberedValue(obj);
                        rememberedValue5 = obj;
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        OneUIKt.OneUIButton("إضافة", (Function0) rememberedValue5, null, true, null, false, $composer3, 3078, 52);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer3, 6);
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i52 = (i4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i62 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope22 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1625277042, "C93@4091L16,93@4067L88,94@4168L28,95@4230L92,95@4209L129:Dialogs.kt#2thlc2");
                    String DhikrAddForm$lambda$402 = DhikrAddForm$lambda$40(newName$delegate2);
                    ComposerKt.sourceInformationMarkerStart($composer3, 1576449458, str);
                    rememberedValue = $composer3.rememberedValue();
                    if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OneUIKt.OneUITextField(DhikrAddForm$lambda$402, (Function1) rememberedValue, "اسم التصنيف", RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, $composer3, 432, 48);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer3, 6);
                    ComposerKt.sourceInformationMarkerStart($composer3, 1576453982, str);
                    if (($dirty2 & 29360128) != 8388608) {
                    }
                    Object rememberedValue52 = $composer3.rememberedValue();
                    if (z) {
                    }
                    Object obj2 = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DialogsKt.DhikrAddForm$lambda$49$lambda$48$lambda$47(Function1.this, newName$delegate, showNew$delegate2);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    rememberedValue52 = obj2;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OneUIKt.OneUIButton("إضافة", (Function0) rememberedValue52, null, true, null, false, $composer3, 3078, 52);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer3, 6);
                }
                $composer3.endReplaceGroup();
                m7714SimpleFlowRowKz89ssw(Dp.m7226constructorimpl(8), null, ComposableLambdaKt.rememberComposableLambda(1051025200, true, new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return DialogsKt.DhikrAddForm$lambda$53(allTags, selected, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), $composer3, 390, 2);
                $composer2 = $composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            Composer composer2 = $composer3;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i32 = ((390 >> 6) & 112) | 6;
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 579948743, "C83@3547L10,83@3507L123:Dialogs.kt#2thlc2");
            TextKt.m2816Text4IGK_g("التصنيفات", RowScope.CC.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null), cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer2, 6, 0, 65528);
            if (function1 == null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (DhikrAddForm$lambda$37(showNew$delegate2)) {
            }
            newName$delegate = newName$delegate2;
            $composer3.startReplaceGroup(244396767);
            $composer3.endReplaceGroup();
            m7714SimpleFlowRowKz89ssw(Dp.m7226constructorimpl(8), null, ComposableLambdaKt.rememberComposableLambda(1051025200, true, new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return DialogsKt.DhikrAddForm$lambda$53(allTags, selected, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 390, 2);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return DialogsKt.DhikrAddForm$lambda$54(ColumnScope.this, title, onTitle, content, onContent, allTags, selected, function1, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean DhikrAddForm$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DhikrAddForm$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String DhikrAddForm$lambda$40(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddForm$lambda$44$lambda$43$lambda$42(MutableState $showNew$delegate) {
        DhikrAddForm$lambda$38($showNew$delegate, !DhikrAddForm$lambda$37($showNew$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddForm$lambda$49$lambda$46$lambda$45(MutableState $newName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $newName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddForm$lambda$49$lambda$48$lambda$47(Function1 $onCreateTag, MutableState $newName$delegate, MutableState $showNew$delegate) {
        if (!StringsKt.isBlank(DhikrAddForm$lambda$40($newName$delegate))) {
            $onCreateTag.invoke(StringsKt.trim((CharSequence) DhikrAddForm$lambda$40($newName$delegate)).toString());
            $newName$delegate.setValue("");
            DhikrAddForm$lambda$38($showNew$delegate, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddForm$lambda$53(List $allTags, final List $selected, Composer $composer, int $changed) {
        String str;
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*102@4548L67,102@4524L128:Dialogs.kt#2thlc2");
        if (!composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1051025200, $changed, -1, "com.example.ui.screens.DhikrAddForm.<anonymous> (Dialogs.kt:100)");
            }
            Iterator it = $allTags.iterator();
            while (it.hasNext()) {
                final Tag tag = (Tag) it.next();
                final boolean contains = $selected.contains(Long.valueOf(tag.getTagId()));
                String name = tag.getName();
                ComposerKt.sourceInformationMarkerStart(composer, 758205872, "CC(remember):Dialogs.kt#9igjgp");
                boolean changed = composer.changed(contains) | composer.changedInstance($selected) | composer.changed(tag);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    str = name;
                    Object obj = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DialogsKt.DhikrAddForm$lambda$53$lambda$52$lambda$51$lambda$50(contains, $selected, tag);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                } else {
                    str = name;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                OneUIKt.m7681OneUIChipM8YrEPQ(str, contains, (Function0) rememberedValue, null, Color.m4479boximpl(OneUIKt.m7688parseColorSafe4WTKRHQ$default(tag.getColorHex(), 0L, 2, null)), composer, 0, 8);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrAddForm$lambda$53$lambda$52$lambda$51$lambda$50(boolean $on, List $selected, Tag $tag) {
        Long valueOf = Long.valueOf($tag.getTagId());
        if ($on) {
            $selected.remove(valueOf);
        } else {
            $selected.add(valueOf);
        }
        return Unit.INSTANCE;
    }

    public static final void TimesEditor(final ColumnScope $this$TimesEditor, final List<String> times, final Function1<? super List<String>, Unit> onChange, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter($this$TimesEditor, "<this>");
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Composer $composer2 = $composer.startRestartGroup(1002012109);
        ComposerKt.sourceInformation($composer2, "C(TimesEditor)N(times,onChange)109@4796L11,110@4812L30,111@4891L10,111@4847L95,112@4947L29,113@5011L765,113@4981L795:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(times) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onChange) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 145) != 144, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1002012109, $dirty, -1, "com.example.ui.screens.TimesEditor (Dialogs.kt:108)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), $composer2, 6);
            TextKt.m2816Text4IGK_g("أوقات التنبيه", (Modifier) null, cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getTitleSmall(), $composer2, 6, 0, 65530);
            $composer2 = $composer2;
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer2, 6);
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, cs.getSurface(), ComposableLambdaKt.rememberComposableLambda(-994248830, true, new Function3() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DialogsKt.TimesEditor$lambda$65(times, onChange, cs, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 24576, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DialogsKt.TimesEditor$lambda$66(ColumnScope.this, times, onChange, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TimesEditor$lambda$65(final List $times, final Function1 $onChange, ColorScheme $cs, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Iterable iterable;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C120@5376L29,119@5325L445:Dialogs.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-994248830, $changed, -1, "com.example.ui.screens.TimesEditor.<anonymous> (Dialogs.kt:114)");
            }
            $composer.startReplaceGroup(-1990385176);
            ComposerKt.sourceInformation($composer, "*116@5126L59,116@5187L59,116@5115L132");
            List list = $times;
            final int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (i > 0) {
                    $composer.startReplaceGroup(-633970397);
                    ComposerKt.sourceInformation($composer, "115@5075L27");
                    OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(56), $composer, 6, 0);
                } else {
                    $composer.startReplaceGroup(1816717946);
                }
                $composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart($composer, -633968733, "CC(remember):Dialogs.kt#9igjgp");
                boolean changed = $composer.changed($onChange) | $composer.changedInstance($times) | $composer.changed(i);
                Object rememberedValue = $composer.rememberedValue();
                if (changed) {
                    iterable = list;
                } else {
                    iterable = list;
                }
                rememberedValue = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DialogsKt.TimesEditor$lambda$65$lambda$61$lambda$57$lambda$56(Function1.this, $times, i, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(rememberedValue);
                Function1 function1 = (Function1) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -633966781, "CC(remember):Dialogs.kt#9igjgp");
                boolean changed2 = $composer.changed($onChange) | $composer.changedInstance($times) | $composer.changed(i);
                Object rememberedValue2 = $composer.rememberedValue();
                if (!changed2 && rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    TimeRow(str, function1, (Function0) rememberedValue2, $composer, 0);
                    i = i2;
                    list = iterable;
                }
                Object obj2 = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DialogsKt.TimesEditor$lambda$65$lambda$61$lambda$60$lambda$59(Function1.this, $times, i);
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
                ComposerKt.sourceInformationMarkerEnd($composer);
                TimeRow(str, function1, (Function0) rememberedValue2, $composer, 0);
                i = i2;
                list = iterable;
            }
            $composer.endReplaceGroup();
            if ($times.isEmpty()) {
                $composer.startReplaceGroup(-1577393216);
            } else {
                $composer.startReplaceGroup(-1990376964);
                ComposerKt.sourceInformation($composer, "118@5290L26");
                OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(0), $composer, 6, 0);
            }
            $composer.endReplaceGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1990374209, "CC(remember):Dialogs.kt#9igjgp");
            boolean changed3 = $composer.changed($onChange) | $composer.changedInstance($times);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DialogsKt.TimesEditor$lambda$65$lambda$63$lambda$62(Function1.this, $times);
                    }
                };
                $composer.updateRememberedValue(obj3);
                rememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(ClickableKt.m264clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue3, 7, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(14));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m731paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                int i4 = (i3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i5 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1165788227, "C123@5536L82,124@5631L29,125@5719L10,125@5673L87:Dialogs.kt#2thlc2");
                IconKt.m2273Iconww6aTOc(AddKt.getAdd(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), $cs.getPrimary(), $composer, 432, 0);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                TextKt.m2816Text4IGK_g("إضافة وقت تنبيه", (Modifier) null, $cs.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65530);
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
            int i42 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i52 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1165788227, "C123@5536L82,124@5631L29,125@5719L10,125@5673L87:Dialogs.kt#2thlc2");
            IconKt.m2273Iconww6aTOc(AddKt.getAdd(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), $cs.getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            TextKt.m2816Text4IGK_g("إضافة وقت تنبيه", (Modifier) null, $cs.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65530);
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
    public static final Unit TimesEditor$lambda$65$lambda$61$lambda$57$lambda$56(Function1 $onChange, List $times, int $i, String n) {
        Intrinsics.checkNotNullParameter(n, "n");
        List mutableList = CollectionsKt.toMutableList((Collection) $times);
        mutableList.set($i, n);
        $onChange.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimesEditor$lambda$65$lambda$61$lambda$60$lambda$59(Function1 $onChange, List $times, int $i) {
        List mutableList = CollectionsKt.toMutableList((Collection) $times);
        mutableList.remove($i);
        $onChange.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimesEditor$lambda$65$lambda$63$lambda$62(Function1 $onChange, List $times) {
        $onChange.invoke(CollectionsKt.plus((Collection<? extends String>) $times, "12:00"));
        return Unit.INSTANCE;
    }

    public static final void DhikrMultipleTimesDialog(final Dhikr dhikr, final Function0<Unit> onDismiss, final Function1<? super List<String>, Unit> onConfirm, Composer $composer, final int $changed) {
        boolean z;
        Object mutableStateOf$default;
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer $composer2 = $composer.startRestartGroup(-672749364);
        ComposerKt.sourceInformation($composer2, "C(DhikrMultipleTimesDialog)N(dhikr,onDismiss,onConfirm)132@5912L48,135@6054L44,136@6142L37,133@5965L214:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(dhikr) ? 4 : 2;
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
                ComposerKt.traceEventStart(-672749364, $dirty2, -1, "com.example.ui.screens.DhikrMultipleTimesDialog (Dialogs.kt:131)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 2027927164, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                z = true;
                mutableStateOf$default = SnapshotStateKt.mutableStateOf$default(dhikr.getReminderTimes(), null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue = mutableStateOf$default;
            } else {
                z = true;
            }
            final MutableState times$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 2027931704, "CC(remember):Dialogs.kt#9igjgp");
            boolean z2 = ($dirty2 & 896) == 256 ? z : false;
            Object rememberedValue2 = $composer2.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DialogsKt.DhikrMultipleTimesDialog$lambda$71$lambda$70(Function1.this, times$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OneUIDialogKt.OneUIDialog("تكرار التنبيه", onDismiss, (Function0) rememberedValue2, null, null, !DhikrMultipleTimesDialog$lambda$68(times$delegate).isEmpty(), ComposableLambdaKt.rememberComposableLambda(1469886027, z, new Function3() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return DialogsKt.DhikrMultipleTimesDialog$lambda$74(MutableState.this, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty2 & 112) | 1572870, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DialogsKt.DhikrMultipleTimesDialog$lambda$75(Dhikr.this, onDismiss, onConfirm, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<String> DhikrMultipleTimesDialog$lambda$68(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrMultipleTimesDialog$lambda$71$lambda$70(Function1 $onConfirm, MutableState $times$delegate) {
        if (!DhikrMultipleTimesDialog$lambda$68($times$delegate).isEmpty()) {
            $onConfirm.invoke(DhikrMultipleTimesDialog$lambda$68($times$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrMultipleTimesDialog$lambda$74(final MutableState $times$delegate, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C136@6163L14,136@6144L33:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(OneUIDialog) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469886027, $dirty, -1, "com.example.ui.screens.DhikrMultipleTimesDialog.<anonymous> (Dialogs.kt:136)");
            }
            List<String> DhikrMultipleTimesDialog$lambda$68 = DhikrMultipleTimesDialog$lambda$68($times$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -483767751, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DialogsKt.DhikrMultipleTimesDialog$lambda$74$lambda$73$lambda$72(MutableState.this, (List) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TimesEditor(OneUIDialog, DhikrMultipleTimesDialog$lambda$68, (Function1) rememberedValue, $composer, ($dirty & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrMultipleTimesDialog$lambda$74$lambda$73$lambda$72(MutableState $times$delegate, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $times$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0482  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeRow(final String timeStr, final Function1<? super String, Unit> onTimeChange, Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        int hour;
        Function0 function02;
        long m4487copywmQWz5c;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Integer intOrNull;
        Integer intOrNull2;
        Object mutableStateOf$default3;
        final Function0<Unit> onDelete = function0;
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        Intrinsics.checkNotNullParameter(onTimeChange, "onTimeChange");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Composer $composer3 = $composer.startRestartGroup(858302178);
        ComposerKt.sourceInformation($composer3, "C(TimeRow)N(timeStr,onTimeChange,onDelete)141@6307L11,142@6341L34,147@6573L21,146@6526L694:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(timeStr) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onTimeChange) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDelete) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(858302178, $dirty2, -1, "com.example.ui.screens.TimeRow (Dialogs.kt:140)");
            }
            ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            ComposerKt.sourceInformationMarkerStart($composer3, 194677316, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default3 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default3);
                rememberedValue = mutableStateOf$default3;
            }
            final MutableState showPicker$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            List parts = StringsKt.split$default((CharSequence) timeStr, new String[]{":"}, false, 0, 6, (Object) null);
            String str = (String) CollectionsKt.getOrNull(parts, 0);
            int hour2 = (str == null || (intOrNull2 = StringsKt.toIntOrNull(str)) == null) ? 12 : intOrNull2.intValue();
            String str2 = (String) CollectionsKt.getOrNull(parts, 1);
            int minute = (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) ? 0 : intOrNull.intValue();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 194684727, "CC(remember):Dialogs.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                hour = hour2;
                Object obj = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DialogsKt.TimeRow$lambda$80$lambda$79(MutableState.this);
                    }
                };
                $composer3.updateRememberedValue(obj);
                rememberedValue2 = obj;
            } else {
                hour = hour2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier m731paddingVpY3zN4 = PaddingKt.m731paddingVpY3zN4(ClickableKt.m264clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue2, 7, null), Dp.m7226constructorimpl(16), Dp.m7226constructorimpl(10));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            final int minute2 = minute;
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m731paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function02 = constructor;
                $composer3.createNode(function02);
            } else {
                function02 = constructor;
                $composer3.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i3 = ((384 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer3, -418463312, "C150@6713L101,151@6823L29,152@6915L10,152@6861L129,155@7147L6,153@6999L215:Dialogs.kt#2thlc2");
                IconKt.m2273Iconww6aTOc(NotificationsKt.getNotifications(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), cs.getOnSurfaceVariant(), $composer3, 432, 0);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer3, 6);
                TextKt.m2816Text4IGK_g(DateTimeUtilsKt.formatTimeStr12h(timeStr), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), $composer3, 0, 0, 65528);
                ImageVector delete = DeleteKt.getDelete(Icons.Outlined.INSTANCE);
                m4487copywmQWz5c = Color.m4487copywmQWz5c(r41, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r41) : 0.85f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r41) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r41) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(cs.getError()) : 0.0f);
                final int hour3 = hour;
                onDelete = function0;
                IconKt.m2273Iconww6aTOc(delete, "حذف", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(36)), MaterialTheme.INSTANCE.getShapes($composer3, MaterialTheme.$stable).getLarge()), false, null, null, onDelete, 7, null), Dp.m7226constructorimpl(7)), m4487copywmQWz5c, $composer3, 48, 0);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (TimeRow$lambda$77(showPicker$delegate)) {
                    $composer2 = $composer3;
                    $composer2.startReplaceGroup(1733737184);
                } else {
                    $composer3.startReplaceGroup(1740939290);
                    ComposerKt.sourceInformation($composer3, "159@7260L33,160@7311L35,162@7415L22,163@7463L91,164@7565L252,161@7355L462");
                    ComposerKt.sourceInformationMarkerStart($composer3, 194706723, "CC(remember):Dialogs.kt#9igjgp");
                    Object rememberedValue3 = $composer3.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        mutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(hour3), null, 2, null);
                        $composer3.updateRememberedValue(mutableStateOf$default2);
                        rememberedValue3 = mutableStateOf$default2;
                    }
                    final MutableState h$delegate = (MutableState) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerStart($composer3, 194708357, "CC(remember):Dialogs.kt#9igjgp");
                    Object rememberedValue4 = $composer3.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        mutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(minute2), null, 2, null);
                        $composer3.updateRememberedValue(mutableStateOf$default);
                        rememberedValue4 = mutableStateOf$default;
                    }
                    final MutableState m$delegate = (MutableState) rememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerStart($composer3, 194711672, "CC(remember):Dialogs.kt#9igjgp");
                    Object rememberedValue5 = $composer3.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        Object obj2 = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda36
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DialogsKt.TimeRow$lambda$89$lambda$88(MutableState.this);
                            }
                        };
                        $composer3.updateRememberedValue(obj2);
                        rememberedValue5 = obj2;
                    }
                    Function0 function03 = (Function0) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerStart($composer3, 194713277, "CC(remember):Dialogs.kt#9igjgp");
                    boolean z = ($dirty2 & 112) == 32;
                    Object rememberedValue6 = $composer3.rememberedValue();
                    if (z || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        Object obj3 = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DialogsKt.TimeRow$lambda$91$lambda$90(Function1.this, h$delegate, m$delegate, showPicker$delegate);
                            }
                        };
                        $composer3.updateRememberedValue(obj3);
                        rememberedValue6 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OneUIDialogKt.OneUIDialog("وقت التنبيه", function03, (Function0) rememberedValue6, null, null, false, ComposableLambdaKt.rememberComposableLambda(1766930086, true, new Function3() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return DialogsKt.TimeRow$lambda$95(hour3, minute2, h$delegate, m$delegate, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    }, $composer3, 54), $composer3, 1572918, 56);
                    $composer2 = $composer3;
                }
                $composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i32 = ((384 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -418463312, "C150@6713L101,151@6823L29,152@6915L10,152@6861L129,155@7147L6,153@6999L215:Dialogs.kt#2thlc2");
            IconKt.m2273Iconww6aTOc(NotificationsKt.getNotifications(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), cs.getOnSurfaceVariant(), $composer3, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer3, 6);
            TextKt.m2816Text4IGK_g(DateTimeUtilsKt.formatTimeStr12h(timeStr), RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), $composer3, 0, 0, 65528);
            ImageVector delete2 = DeleteKt.getDelete(Icons.Outlined.INSTANCE);
            m4487copywmQWz5c = Color.m4487copywmQWz5c(r41, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r41) : 0.85f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r41) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r41) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(cs.getError()) : 0.0f);
            final int hour32 = hour;
            onDelete = function0;
            IconKt.m2273Iconww6aTOc(delete2, "حذف", PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(36)), MaterialTheme.INSTANCE.getShapes($composer3, MaterialTheme.$stable).getLarge()), false, null, null, onDelete, 7, null), Dp.m7226constructorimpl(7)), m4487copywmQWz5c, $composer3, 48, 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (TimeRow$lambda$77(showPicker$delegate)) {
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return DialogsKt.TimeRow$lambda$96(timeStr, onTimeChange, onDelete, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final boolean TimeRow$lambda$77(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void TimeRow$lambda$78(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeRow$lambda$80$lambda$79(MutableState $showPicker$delegate) {
        TimeRow$lambda$78($showPicker$delegate, true);
        return Unit.INSTANCE;
    }

    private static final int TimeRow$lambda$83(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void TimeRow$lambda$84(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final int TimeRow$lambda$86(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void TimeRow$lambda$87(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeRow$lambda$89$lambda$88(MutableState $showPicker$delegate) {
        TimeRow$lambda$78($showPicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeRow$lambda$91$lambda$90(Function1 $onTimeChange, MutableState $h$delegate, MutableState $m$delegate, MutableState $showPicker$delegate) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(TimeRow$lambda$83($h$delegate)), Integer.valueOf(TimeRow$lambda$86($m$delegate))}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        $onTimeChange.invoke(format);
        TimeRow$lambda$78($showPicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit TimeRow$lambda$95(int $hour, int $minute, final MutableState $h$delegate, final MutableState $m$delegate, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Object rememberedValue;
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C165@7579L228:Dialogs.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766930086, $changed, -1, "com.example.ui.screens.TimeRow.<anonymous> (Dialogs.kt:165)");
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
                ComposerKt.sourceInformationMarkerStart($composer, -644406699, "C166@7768L24,166@7689L104:Dialogs.kt#2thlc2");
                ComposerKt.sourceInformationMarkerStart($composer, -1129162716, "CC(remember):Dialogs.kt#9igjgp");
                rememberedValue = $composer.rememberedValue();
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DialogsKt.TimeRow$lambda$95$lambda$94$lambda$93$lambda$92(MutableState.this, $m$delegate, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                        }
                    };
                    $composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                WheelTimePickerKt.WheelTimePicker($hour, $minute, (Function2) rememberedValue, null, $composer, 384, 8);
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
            ComposerKt.sourceInformationMarkerStart($composer, -644406699, "C166@7768L24,166@7689L104:Dialogs.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart($composer, -1129162716, "CC(remember):Dialogs.kt#9igjgp");
            rememberedValue = $composer.rememberedValue();
            if (rememberedValue != Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            WheelTimePickerKt.WheelTimePicker($hour, $minute, (Function2) rememberedValue, null, $composer, 384, 8);
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
    public static final Unit TimeRow$lambda$95$lambda$94$lambda$93$lambda$92(MutableState $h$delegate, MutableState $m$delegate, int a, int b) {
        TimeRow$lambda$84($h$delegate, a);
        TimeRow$lambda$87($m$delegate, b);
        return Unit.INSTANCE;
    }

    public static final void DhikrDetailDialog(final Dhikr dhikr, final Function0<Unit> onDismiss, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        final Function0 onMarkAsRead;
        Function0 function03;
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(-480360382);
        ComposerKt.sourceInformation($composer2, "C(DhikrDetailDialog)N(dhikr,onDismiss,onMarkAsRead)174@7963L11,179@8174L187,175@7979L382:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(dhikr) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
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
            Function0 onMarkAsRead2 = i2 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-480360382, $dirty2, -1, "com.example.ui.screens.DhikrDetailDialog (Dialogs.kt:173)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            String title = dhikr.getTitle();
            if (onMarkAsRead2 == null) {
                $composer2.startReplaceGroup(415140002);
                $composer2.endReplaceGroup();
                function03 = null;
            } else {
                $composer2.startReplaceGroup(415140003);
                ComposerKt.sourceInformation($composer2, "*177@8084L21");
                final Function0 function04 = onMarkAsRead2;
                ComposerKt.sourceInformationMarkerStart($composer2, -258534632, "CC(remember):Dialogs.kt#9igjgp");
                boolean changed = $composer2.changed(function04) | (($dirty2 & 112) == 32);
                Object rememberedValue = $composer2.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DialogsKt.DhikrDetailDialog$lambda$99$lambda$98$lambda$97(Function0.this, onDismiss);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
                function03 = (Function0) rememberedValue;
            }
            OneUIDialogKt.OneUIDialog(title, onDismiss, function03, "تمت القراءة", "إغلاق", false, ComposableLambdaKt.rememberComposableLambda(-1807359069, true, new Function3() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return DialogsKt.DhikrDetailDialog$lambda$101(ColorScheme.this, dhikr, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty2 & 112) | 1600512, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onMarkAsRead = onMarkAsRead2;
        } else {
            $composer2.skipToGroupEnd();
            onMarkAsRead = function02;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DialogsKt.DhikrDetailDialog$lambda$102(Dhikr.this, onDismiss, onMarkAsRead, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDetailDialog$lambda$99$lambda$98$lambda$97(Function0 $it, Function0 $onDismiss) {
        $it.invoke();
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDetailDialog$lambda$101(final ColorScheme $cs, final Dhikr $dhikr, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C180@8246L109,180@8184L171:Dialogs.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1807359069, $changed, -1, "com.example.ui.screens.DhikrDetailDialog.<anonymous> (Dialogs.kt:180)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(16)), $cs.getSurface(), ComposableLambdaKt.rememberComposableLambda(-201056616, true, new Function3() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DialogsKt.DhikrDetailDialog$lambda$101$lambda$100(Dhikr.this, $cs, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DhikrDetailDialog$lambda$101$lambda$100(Dhikr $dhikr, ColorScheme $cs, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C181@8302L10,181@8260L85:Dialogs.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-201056616, $changed, -1, "com.example.ui.screens.DhikrDetailDialog.<anonymous>.<anonymous> (Dialogs.kt:181)");
            }
            TextKt.m2816Text4IGK_g($dhikr.getContent(), (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0186  */
    /* renamed from: SimpleFlowRow-Kz89ssw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7714SimpleFlowRowKz89ssw(final float spacing, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-146546935);
        ComposerKt.sourceInformation($composer2, "C(SimpleFlowRow)N(spacing:c#ui.unit.Dp,modifier,content)194@8805L1183,194@8758L1230:Dialogs.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(spacing) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-146546935, $dirty2, -1, "com.example.ui.screens.SimpleFlowRow (Dialogs.kt:193)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 902324200, "CC(remember):Dialogs.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (MeasurePolicy) new DialogsKt$SimpleFlowRow$1$1(spacing);
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int m = Dhikr$$ExternalSyntheticBackport1.m(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((($dirty2 >> 6) & 14) | ($dirty2 & 112)) << 6) & 896) | 6;
            Modifier modifier5 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(m))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                content.invoke($composer2, Integer.valueOf((i3 >> 6) & 14));
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(m));
            m3828constructorimpl.apply(Integer.valueOf(m), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            content.invoke($composer2, Integer.valueOf((i3 >> 6) & 14));
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DialogsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DialogsKt.SimpleFlowRow_Kz89ssw$lambda$104(spacing, modifier3, content, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
