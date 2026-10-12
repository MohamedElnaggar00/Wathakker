package com.example.ui.screens;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.ui.oneui.OneUIDialogKt;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.theme.FontChoice;
import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: SettingsScreen.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n\u001a{\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"SettingsScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onBack", "Lkotlin/Function0;", "onNavigateToFajr", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LockWidgetsDialog", "onDismiss", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SettingsContent", "vibration", "", "fontTitle", "", "onVibration", "Lkotlin/Function1;", "onPickFont", "onPickSound", "onFajr", "onLockWidgets", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app", "appFont", "Lcom/example/ui/theme/FontChoice;", "showFontPicker", "showLockWidgets"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SettingsScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LockWidgetsDialog$lambda$27(Function0 function0, int i, Composer composer, int i2) {
        LockWidgetsDialog(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$43(boolean z, String str, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, int i2, Composer composer, int i3) {
        SettingsContent(z, str, function0, function1, function02, function03, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsScreen$lambda$23(MainViewModel mainViewModel, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        SettingsScreen(mainViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x015f, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c8, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsScreen(final MainViewModel viewModel, final Function0<Unit> onBack, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        final Function0 onNavigateToFajr;
        boolean z;
        String str;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer2 = $composer.startRestartGroup(623246221);
        ComposerKt.sourceInformation($composer2, "C(SettingsScreen)N(viewModel,onBack,onNavigateToFajr)28@1175L16,29@1229L16,30@1272L34,31@1334L34,32@1480L264,32@1396L348,42@1881L33,43@1937L25,44@1986L365,52@2412L26,38@1749L695:SettingsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onBack) ? 32 : 16;
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
            Function0 onNavigateToFajr2 = i2 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(623246221, $dirty2, -1, "com.example.ui.screens.SettingsScreen (SettingsScreen.kt:27)");
            }
            State vibration$delegate = SnapshotStateKt.collectAsState(viewModel.getVibrationEnabled(), null, $composer2, 0, 1);
            State appFont$delegate = SnapshotStateKt.collectAsState(viewModel.getAppFont(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 1939172719, "CC(remember):SettingsScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default2);
                rememberedValue = mutableStateOf$default2;
            }
            final MutableState showFontPicker$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1939174703, "CC(remember):SettingsScreen.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue2 = mutableStateOf$default;
            }
            final MutableState showLockWidgets$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            ComposerKt.sourceInformationMarkerStart($composer2, 1939179605, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue3 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.SettingsScreen$lambda$9$lambda$8(MainViewModel.this, (ActivityResult) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher ringtoneLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) rememberedValue3, $composer2, 0);
            boolean SettingsScreen$lambda$0 = SettingsScreen$lambda$0(vibration$delegate);
            String titleAr = SettingsScreen$lambda$1(appFont$delegate).getTitleAr();
            ComposerKt.sourceInformationMarkerStart($composer2, 1939192206, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean changedInstance2 = $composer2.changedInstance(viewModel);
            Object rememberedValue4 = $composer2.rememberedValue();
            if (changedInstance2) {
                z = SettingsScreen$lambda$0;
            } else {
                z = SettingsScreen$lambda$0;
            }
            Object obj2 = (KFunction) new SettingsScreenKt$SettingsScreen$1$1(viewModel);
            $composer2.updateRememberedValue(obj2);
            rememberedValue4 = obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function1 function1 = (Function1) ((KFunction) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart($composer2, 1939193990, "CC(remember):SettingsScreen.kt#9igjgp");
            Object rememberedValue5 = $composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$12$lambda$11(MutableState.this);
                    }
                };
                $composer2.updateRememberedValue(obj3);
                rememberedValue5 = obj3;
            }
            Function0 function03 = (Function0) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1939195898, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean changedInstance3 = $composer2.changedInstance(ringtoneLauncher);
            Object rememberedValue6 = $composer2.rememberedValue();
            if (changedInstance3) {
                str = titleAr;
            } else {
                str = titleAr;
            }
            rememberedValue6 = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SettingsScreenKt.SettingsScreen$lambda$15$lambda$14(ManagedActivityResultLauncher.this);
                }
            };
            $composer2.updateRememberedValue(rememberedValue6);
            Function0 function04 = (Function0) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1939209191, "CC(remember):SettingsScreen.kt#9igjgp");
            Object rememberedValue7 = $composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$17$lambda$16(MutableState.this);
                    }
                };
                $composer2.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsContent(z, str, onBack, function1, function03, function04, onNavigateToFajr2, (Function0) rememberedValue7, $composer2, (($dirty2 << 3) & 896) | 12607488 | (($dirty2 << 12) & 3670016), 0);
            if (SettingsScreen$lambda$3(showFontPicker$delegate)) {
                $composer2.startReplaceGroup(-13995066);
                ComposerKt.sourceInformation($composer2, "58@2553L24,59@2603L26,56@2480L159");
                FontChoice SettingsScreen$lambda$1 = SettingsScreen$lambda$1(appFont$delegate);
                ComposerKt.sourceInformationMarkerStart($composer2, 1939213701, "CC(remember):SettingsScreen.kt#9igjgp");
                boolean changedInstance4 = $composer2.changedInstance(viewModel);
                Object rememberedValue8 = $composer2.rememberedValue();
                if (changedInstance4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = (KFunction) new SettingsScreenKt$SettingsScreen$5$1(viewModel);
                    $composer2.updateRememberedValue(obj4);
                    rememberedValue8 = obj4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Function1 function12 = (Function1) ((KFunction) rememberedValue8);
                ComposerKt.sourceInformationMarkerStart($composer2, 1939215303, "CC(remember):SettingsScreen.kt#9igjgp");
                Object rememberedValue9 = $composer2.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsScreenKt.SettingsScreen$lambda$20$lambda$19(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    rememberedValue9 = obj5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                FontPickerDialogKt.FontPickerDialog(SettingsScreen$lambda$1, function12, (Function0) rememberedValue9, $composer2, 384);
            } else {
                $composer2.startReplaceGroup(-16451723);
            }
            $composer2.endReplaceGroup();
            if (SettingsScreen$lambda$6(showLockWidgets$delegate)) {
                $composer2.startReplaceGroup(-13798805);
                ComposerKt.sourceInformation($composer2, "63@2711L27,63@2681L58");
                ComposerKt.sourceInformationMarkerStart($composer2, 1939218760, "CC(remember):SettingsScreen.kt#9igjgp");
                Object rememberedValue10 = $composer2.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsScreenKt.SettingsScreen$lambda$22$lambda$21(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj6);
                    rememberedValue10 = obj6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LockWidgetsDialog((Function0) rememberedValue10, $composer2, 6);
            } else {
                $composer2.startReplaceGroup(-16451723);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onNavigateToFajr = onNavigateToFajr2;
        } else {
            $composer2.skipToGroupEnd();
            onNavigateToFajr = function02;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return SettingsScreenKt.SettingsScreen$lambda$23(MainViewModel.this, onBack, onNavigateToFajr, $changed, i, (Composer) obj7, ((Integer) obj8).intValue());
                }
            });
        }
    }

    private static final boolean SettingsScreen$lambda$0(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final FontChoice SettingsScreen$lambda$1(State<? extends FontChoice> state) {
        return (FontChoice) state.getValue();
    }

    private static final boolean SettingsScreen$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SettingsScreen$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SettingsScreen$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SettingsScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsScreen$lambda$9$lambda$8(MainViewModel $viewModel, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Uri uri = data != null ? (Uri) data.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : null;
            if (uri != null) {
                String uri2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                $viewModel.updateNotificationSound(uri2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsScreen$lambda$12$lambda$11(MutableState $showFontPicker$delegate) {
        SettingsScreen$lambda$4($showFontPicker$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsScreen$lambda$15$lambda$14(ManagedActivityResultLauncher $ringtoneLauncher) {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        $ringtoneLauncher.launch(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsScreen$lambda$17$lambda$16(MutableState $showLockWidgets$delegate) {
        SettingsScreen$lambda$7($showLockWidgets$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsScreen$lambda$20$lambda$19(MutableState $showFontPicker$delegate) {
        SettingsScreen$lambda$4($showFontPicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsScreen$lambda$22$lambda$21(MutableState $showLockWidgets$delegate) {
        SettingsScreen$lambda$7($showLockWidgets$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void LockWidgetsDialog(final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        final Function0 onDismiss2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(29496887);
        ComposerKt.sourceInformation($composer2, "C(LockWidgetsDialog)N(onDismiss)71@3010L7,72@3045L11,76@3161L657,90@3892L932,73@3061L1763:SettingsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            onDismiss2 = onDismiss;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(29496887, $dirty, -1, "com.example.ui.screens.LockWidgetsDialog (SettingsScreen.kt:70)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) consume;
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            ComposerKt.sourceInformationMarkerStart($composer2, -1718254296, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(context) | (($dirty & 14) == 4);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.LockWidgetsDialog$lambda$25$lambda$24(context, onDismiss);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            onDismiss2 = onDismiss;
            OneUIDialogKt.OneUIDialog("ويدجت شاشة القفل", onDismiss2, (Function0) rememberedValue, "فتح المحرر", "إغلاق", false, ComposableLambdaKt.rememberComposableLambda(-916915786, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return SettingsScreenKt.LockWidgetsDialog$lambda$26(ColorScheme.this, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty << 3) & 112) | 1600518, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.LockWidgetsDialog$lambda$27(Function0.this, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LockWidgetsDialog$lambda$25$lambda$24(Context $context, Function0 $onDismiss) {
        Intent launch = $context.getPackageManager().getLaunchIntentForPackage("com.samsung.android.app.dressroom");
        if (launch == null) {
            Toast.makeText($context, "اضغط مطولًا على شاشة القفل لإضافة الويدجت", 1).show();
        } else {
            try {
                $context.startActivity(launch);
            } catch (ActivityNotFoundException e) {
                Toast.makeText($context, "اضغط مطولًا على شاشة القفل لإضافة الويدجت", 1).show();
            }
        }
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LockWidgetsDialog$lambda$26(ColorScheme $cs, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C93@4047L10,91@3902L215,95@4126L30,101@4484L10,96@4165L389,103@4563L30,106@4710L10,104@4602L216:SettingsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-916915786, $changed, -1, "com.example.ui.screens.LockWidgetsDialog.<anonymous> (SettingsScreen.kt:91)");
            }
            TextKt.m2816Text4IGK_g("كل ويدجتات وَذكِّر متاحة في المساحة المخصصة تحت الساعة على شاشة القفل (One UI 8 أو أحدث).", (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 3078, 0, 65522);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
            TextKt.m2816Text4IGK_g("١. على شاشة القفل اضغط مطولًا على مكان فارغ، ثم أكّد هويتك.\n٢. اضغط «إضافة ويدجت» واختار «وَذكِّر» من القائمة.\n٣. اختار الويدجت الذي يعجبك، مثل «الإقامة (مصغر)» أو «شريط الصلاة».\n٤. رتّبها بالسحب ثم اضغط «تم».", (Modifier) null, $cs.getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 3072, 0, 65522);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
            TextKt.m2816Text4IGK_g("الضغط على الويدجت من شاشة القفل يفتح التطبيق مباشرة.", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void SettingsContent(final boolean vibration, final String fontTitle, final Function0<Unit> onBack, final Function1<? super Boolean, Unit> onVibration, final Function0<Unit> onPickFont, final Function0<Unit> onPickSound, final Function0<Unit> function0, Function0<Unit> function02, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function03;
        Function0 function04;
        Composer $composer2;
        final Function0 onLockWidgets;
        final Function0 onLockWidgets2;
        int $dirty;
        Function0 onLockWidgets3;
        Intrinsics.checkNotNullParameter(fontTitle, "fontTitle");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onVibration, "onVibration");
        Intrinsics.checkNotNullParameter(onPickFont, "onPickFont");
        Intrinsics.checkNotNullParameter(onPickSound, "onPickSound");
        Composer $composer3 = $composer.startRestartGroup(1463299687);
        ComposerKt.sourceInformation($composer3, "C(SettingsContent)N(vibration,fontTitle,onBack,onVibration,onPickFont,onPickSound,onFajr,onLockWidgets)121@5084L2,123@5118L11,124@5184L1623,124@5134L1673:SettingsScreen.kt#2thlc2");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(vibration) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changed(fontTitle) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onBack) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changedInstance(onVibration) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer3.changedInstance(onPickFont) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty2 |= $composer3.changedInstance(onPickSound) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            function03 = function0;
            $dirty2 |= $composer3.changedInstance(function03) ? 1048576 : 524288;
        } else {
            function03 = function0;
        }
        int i2 = i & 128;
        if (i2 != 0) {
            $dirty2 |= 12582912;
            function04 = function02;
        } else if (($changed & 12582912) == 0) {
            function04 = function02;
            $dirty2 |= $composer3.changedInstance(function04) ? 8388608 : 4194304;
        } else {
            function04 = function02;
        }
        if ($composer3.shouldExecute(($dirty2 & 4793491) != 4793490, $dirty2 & 1)) {
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 1776701609, "CC(remember):SettingsScreen.kt#9igjgp");
                Object rememberedValue = $composer3.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                Function0 onLockWidgets4 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onLockWidgets2 = onLockWidgets4;
            } else {
                onLockWidgets2 = function04;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1463299687, $dirty2, -1, "com.example.ui.screens.SettingsContent (SettingsScreen.kt:122)");
            }
            MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable);
            ComposerKt.sourceInformationMarkerStart($composer3, 1776706430, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean z = ((3670016 & $dirty2) == 1048576) | ((29360128 & $dirty2) == 8388608) | ((458752 & $dirty2) == 131072) | (($dirty2 & 14) == 4) | (($dirty2 & 7168) == 2048) | (($dirty2 & 112) == 32) | ((57344 & $dirty2) == 16384);
            Object rememberedValue2 = $composer3.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                final Function0<Unit> function05 = function03;
                rememberedValue2 = new Function1() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.SettingsContent$lambda$42$lambda$41(Function0.this, onLockWidgets2, onPickSound, onVibration, vibration, fontTitle, onPickFont, (LazyListScope) obj2);
                    }
                };
                onLockWidgets3 = onLockWidgets2;
                $composer3.updateRememberedValue(rememberedValue2);
            } else {
                $dirty = $dirty2;
                onLockWidgets3 = onLockWidgets2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            OneUIKt.m7686OneUIScreengMrHQkA("الإعدادات", null, null, onBack, null, null, null, 0.0f, (Function1) rememberedValue2, $composer3, (($dirty << 3) & 7168) | 6, 246);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onLockWidgets = onLockWidgets3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onLockWidgets = function04;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsContent$lambda$43(vibration, fontTitle, onBack, onVibration, onPickFont, onPickSound, function0, onLockWidgets, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41(final Function0 $onFajr, final Function0 $onLockWidgets, final Function0 $onPickSound, final Function1 $onVibration, final boolean $vibration, final String $fontTitle, final Function0 $onPickFont, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        if ($onFajr != null) {
            LazyListScope.CC.item$default(OneUIScreen, "fajr", null, ComposableLambdaKt.composableLambdaInstance(1469562314, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$31(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        LazyListScope.CC.item$default(OneUIScreen, "lock-l", null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$958101957$app(), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "lock", null, ComposableLambdaKt.composableLambdaInstance(-489260178, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$33(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "notif-l", null, ComposableSingletons$SettingsScreenKt.INSTANCE.m7706getLambda$1526270579$app(), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "notif", null, ComposableLambdaKt.composableLambdaInstance(1731686316, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$38(Function0.this, $onVibration, $vibration, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "look-l", null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$694675915$app(), 2, null);
        LazyListScope.CC.item$default(OneUIScreen, "look", null, ComposableLambdaKt.composableLambdaInstance(-342334486, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$40($fontTitle, $onPickFont, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$31(final Function0 $onFajr, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C127@5275L233,127@5265L243:SettingsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469562314, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:127)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-210245889, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$31$lambda$30(Function0.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$31$lambda$30(Function0 $onFajr, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C128@5297L193:SettingsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-210245889, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:128)");
            }
            Function2<Composer, Integer, Unit> lambda$1680360783$app = ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1680360783$app();
            Function2<Composer, Integer, Unit> lambda$1541575376$app = ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1541575376$app();
            OneUIKt.m7685OneUIRowRFMEUTM("تغيير الموقع", null, "المدينة وطريقة الحساب وإعدادات منبه الفجر", lambda$1680360783$app, lambda$1541575376$app, $onFajr, 0L, $composer, 28038, 66);
            OneUIKt.m7682OneUIDividerkHDZbjc(70.0f, $composer, 6, 0);
            OneUIKt.m7685OneUIRowRFMEUTM("منبه صلاة الفجر", null, "تفعيل المنبه والنغمة", lambda$1680360783$app, lambda$1541575376$app, $onFajr, 0L, $composer, 28038, 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$33(final Function0 $onLockWidgets, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C135@5644L246,135@5634L256:SettingsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-489260178, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:135)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-208033373, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$33$lambda$32(Function0.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$33$lambda$32(Function0 $onLockWidgets, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C136@5662L214:SettingsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208033373, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:136)");
            }
            OneUIKt.m7685OneUIRowRFMEUTM("ويدجت شاشة القفل", null, "أضف ويدجت وَذكِّر تحت الساعة على شاشة القفل", ComposableSingletons$SettingsScreenKt.INSTANCE.m7708getLambda$1770694669$app(), ComposableSingletons$SettingsScreenKt.INSTANCE.m7709getLambda$219040140$app(), $onLockWidgets, 0L, $composer, 28038, 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$38(final Function0 $onPickSound, final Function1 $onVibration, final boolean $vibration, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C142@6013L456,142@6003L466:SettingsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1731686316, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:142)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(2012913121, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$38$lambda$37(Function0.this, $onVibration, $vibration, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$38$lambda$37(Function0 $onPickSound, final Function1 $onVibration, final boolean $vibration, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C143@6031L176,145@6224L27,147@6376L39,147@6427L27,146@6268L187:SettingsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2012913121, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:143)");
            }
            OneUIKt.m7685OneUIRowRFMEUTM("نغمة الإشعار", null, "الافتراضي", ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$450251825$app(), ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$2001906354$app(), $onPickSound, 0L, $composer, 28038, 66);
            OneUIKt.m7682OneUIDividerkHDZbjc(Dp.m7226constructorimpl(70), $composer, 6, 0);
            Function2<Composer, Integer, Unit> lambda$1487475048$app = ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1487475048$app();
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2021141591, true, new Function2() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$38$lambda$37$lambda$34($vibration, $onVibration, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54);
            ComposerKt.sourceInformationMarkerStart($composer, 1674239356, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean changed = $composer.changed($onVibration) | $composer.changed($vibration);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$38$lambda$37$lambda$36$lambda$35(Function1.this, $vibration);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.m7685OneUIRowRFMEUTM("الاهتزاز", null, null, lambda$1487475048$app, rememberComposableLambda, (Function0) rememberedValue, 0L, $composer, 27654, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$38$lambda$37$lambda$34(boolean $vibration, Function1 $onVibration, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C147@6378L35:SettingsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2021141591, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:147)");
            }
            OneUIKt.OneUISwitch($vibration, $onVibration, null, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$38$lambda$37$lambda$36$lambda$35(Function1 $onVibration, boolean $vibration) {
        $onVibration.invoke(Boolean.valueOf(!$vibration));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$40(final String $fontTitle, final Function0 $onPickFont, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C152@6587L204,152@6577L214:SettingsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-342334486, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:152)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, null, 0L, ComposableLambdaKt.rememberComposableLambda(-61107681, true, new Function3() { // from class: com.example.ui.screens.SettingsScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsContent$lambda$42$lambda$41$lambda$40$lambda$39($fontTitle, $onPickFont, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsContent$lambda$42$lambda$41$lambda$40$lambda$39(String $fontTitle, Function0 $onPickFont, ColumnScope OneUICard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C153@6605L172:SettingsScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-61107681, $changed, -1, "com.example.ui.screens.SettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:153)");
            }
            OneUIKt.m7685OneUIRowRFMEUTM("خط التطبيق", null, $fontTitle, ComposableSingletons$SettingsScreenKt.INSTANCE.m7707getLambda$1623768977$app(), ComposableSingletons$SettingsScreenKt.INSTANCE.m7710getLambda$72114448$app(), $onPickFont, 0L, $composer, 27654, 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
