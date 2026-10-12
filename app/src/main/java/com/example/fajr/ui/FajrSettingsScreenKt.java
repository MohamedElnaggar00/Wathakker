package com.example.fajr.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AlarmKt;
import androidx.compose.material.icons.outlined.AlarmOffKt;
import androidx.compose.material.icons.outlined.AlarmOnKt;
import androidx.compose.material.icons.outlined.CheckKt;
import androidx.compose.material.icons.outlined.EditLocationKt;
import androidx.compose.material.icons.outlined.GpsFixedKt;
import androidx.compose.material.icons.outlined.LocationOnKt;
import androidx.compose.material.icons.outlined.MusicNoteKt;
import androidx.compose.material.icons.outlined.PlayArrowKt;
import androidx.compose.material.icons.outlined.RefreshKt;
import androidx.compose.material.icons.outlined.StopKt;
import androidx.compose.material.icons.outlined.TuneKt;
import androidx.compose.material.icons.outlined.VibrationKt;
import androidx.compose.material.icons.outlined.VolumeUpKt;
import androidx.compose.material.icons.outlined.WarningKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
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
import com.example.fajr.calculation.CalculationMethod;
import com.example.fajr.data.CityItem;
import com.example.fajr.data.FajrPreferences;
import com.example.fajr.sound.RingtoneHelper;
import com.example.ui.oneui.OneUIDialogKt;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.screens.FajrDrawerAction;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.ranges.RangesKt;

/* compiled from: FajrSettingsScreen.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0087\u0002\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u001a\u001a;\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020 H\u0007¢\u0006\u0002\u0010(\u001a7\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010.¨\u0006/²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u00100\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"FajrSettingsScreen", "", "viewModel", "Lcom/example/fajr/ui/FajrViewModel;", "onBack", "Lkotlin/Function0;", "(Lcom/example/fajr/ui/FajrViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FajrSettingsContent", "state", "Lcom/example/fajr/ui/FajrSettingsState;", "onToggleAlarm", "Lkotlin/Function1;", "", "onSelectGps", "onSelectManualCity", "onChangeCity", "onChangeMethod", "onRefresh", "isPlayingPreview", "onTogglePreview", "onPickSystemRingtone", "onPickAudioFile", "onToggleVibration", "onSetVolume", "", "onSetMaxDuration", "(Lcom/example/fajr/ui/FajrSettingsState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LocationOptionRow", "selected", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "title", "", "subtitle", "onClick", "(ZLandroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FajrHeader", "nextFajrTimeFormatted", "isAlarmEnabled", "cityName", "(Ljava/lang/String;ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CalculationMethodDialog", "currentMethod", "Lcom/example/fajr/calculation/CalculationMethod;", "onDismiss", "onMethodSelected", "(Lcom/example/fajr/calculation/CalculationMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app", "showCityDialog", "showMethodDialog"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FajrSettingsScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CalculationMethodDialog$lambda$139(CalculationMethod calculationMethod, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        CalculationMethodDialog(calculationMethod, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrHeader$lambda$131$lambda$130$lambda$129(boolean z, Composer composer, int i) {
        ImageVector alarmOff;
        String str;
        long j;
        Icons.Outlined outlined = Icons.Outlined.INSTANCE;
        if (z) {
            alarmOff = AlarmOnKt.getAlarmOn(outlined);
            str = "المنبه مفعّل";
            j = 4279286145L;
        } else {
            alarmOff = AlarmOffKt.getAlarmOff(outlined);
            str = "المنبه معطّل";
            j = 4288256409L;
        }
        IconKt.m2273Iconww6aTOc(alarmOff, str, SizeKt.m777size3ABfNKs(PaddingKt.m730padding3ABfNKs(Modifier.INSTANCE, 11.0f), 24.0f), ColorKt.Color(j), composer, 0, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrHeader$lambda$132(String str, boolean z, String str2, int i, Composer composer, int i2) {
        FajrHeader(str, z, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$125(FajrSettingsState fajrSettingsState, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, boolean z, Function0 function07, Function0 function08, Function0 function09, Function1 function12, Function1 function13, Function1 function14, int i, int i2, int i3, Composer composer, int i4) {
        FajrSettingsContent(fajrSettingsState, function0, function1, function02, function03, function04, function05, function06, z, function07, function08, function09, function12, function13, function14, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$55(FajrViewModel fajrViewModel, Function0 function0, int i, int i2, Composer composer, int i3) {
        FajrSettingsScreen(fajrViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LocationOptionRow$lambda$128(boolean z, ImageVector imageVector, String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        LocationOptionRow(z, imageVector, str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x04f6, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x052e, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0566, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x059e, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05d6, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x060d, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018b, code lost:
    
        if (r10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d4, code lost:
    
        if (r11 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x021d, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02d1, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03a6, code lost:
    
        if (r15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03e5, code lost:
    
        if (r13 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x041c, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04b5, code lost:
    
        if (r1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FajrSettingsScreen(final FajrViewModel viewModel, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        final Function0 onBack;
        Function0 onBack2;
        int $dirty;
        Function0 onBack3;
        FajrSettingsState fajrSettingsState;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        Object mutableStateOf$default3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer2 = $composer.startRestartGroup(-597563523);
        ComposerKt.sourceInformation($composer2, "C(FajrSettingsScreen)N(viewModel,onBack)50@2256L2,51@2297L29,52@2358L7,54@2393L34,55@2456L34,56@2519L34,60@2705L129,58@2592L242,67@2978L391,65@2869L500,80@3498L173,78@3401L270,87@3700L61,87@3677L84,109@4315L29,110@4368L376,121@4775L42,122@4842L25,123@4894L27,124@4943L39,126@5055L380,136@5468L480,145@5976L41,146@6047L33,147@6104L32,148@6165L32,106@4222L1981:FajrSettingsScreen.kt#jcb7bm");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty2 |= 48;
            onBack = function0;
        } else if (($changed & 48) == 0) {
            onBack = function0;
            $dirty2 |= $composer2.changedInstance(onBack) ? 32 : 16;
        } else {
            onBack = function0;
        }
        int $dirty3 = $dirty2;
        if ($composer2.shouldExecute(($dirty3 & 19) != 18, $dirty3 & 1)) {
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, 1267074687, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue = $composer2.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                Function0 onBack4 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                onBack2 = onBack4;
            } else {
                onBack2 = onBack;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-597563523, $dirty3, -1, "com.example.fajr.ui.FajrSettingsScreen (FajrSettingsScreen.kt:50)");
            }
            final State state$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart($composer2, 1267079103, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default3 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default3);
                rememberedValue2 = mutableStateOf$default3;
            }
            final MutableState showCityDialog$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267081119, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default2);
                rememberedValue3 = mutableStateOf$default2;
            }
            final MutableState showMethodDialog$delegate = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267083135, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue4 = mutableStateOf$default;
            }
            final MutableState isPlayingPreview$delegate = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
            ComposerKt.sourceInformationMarkerStart($composer2, 1267089182, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(viewModel);
            Object rememberedValue5 = $composer2.rememberedValue();
            if (changedInstance) {
                $dirty = $dirty3;
            } else {
                $dirty = $dirty3;
            }
            rememberedValue5 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$14$lambda$13(FajrViewModel.this, (Map) obj2);
                }
            };
            $composer2.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher locationPermissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (Function1) rememberedValue5, $composer2, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            ComposerKt.sourceInformationMarkerStart($composer2, 1267098180, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance2 = $composer2.changedInstance(context) | $composer2.changedInstance(viewModel);
            Object rememberedValue6 = $composer2.rememberedValue();
            if (changedInstance2) {
            }
            rememberedValue6 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$16$lambda$15(context, viewModel, (ActivityResult) obj2);
                }
            };
            $composer2.updateRememberedValue(rememberedValue6);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher ringtonePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) rememberedValue6, $composer2, 0);
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer2, 1267114602, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance3 = $composer2.changedInstance(context) | $composer2.changedInstance(viewModel);
            Object rememberedValue7 = $composer2.rememberedValue();
            if (changedInstance3) {
                onBack3 = onBack2;
            } else {
                onBack3 = onBack2;
            }
            rememberedValue7 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$18$lambda$17(context, viewModel, (Uri) obj2);
                }
            };
            $composer2.updateRememberedValue(rememberedValue7);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher audioPickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) rememberedValue7, $composer2, 0);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1267120954, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance4 = $composer2.changedInstance(viewModel);
            Object rememberedValue8 = $composer2.rememberedValue();
            if (changedInstance4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return FajrSettingsScreenKt.FajrSettingsScreen$lambda$21$lambda$20(FajrViewModel.this, (DisposableEffectScope) obj3);
                    }
                };
                $composer2.updateRememberedValue(obj2);
                rememberedValue8 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue8, $composer2, 6);
            if (FajrSettingsScreen$lambda$4(showCityDialog$delegate)) {
                $composer2.startReplaceGroup(626133285);
                ComposerKt.sourceInformation($composer2, "93@3839L26,94@3896L35,92@3797L144");
                ComposerKt.sourceInformationMarkerStart($composer2, 1267125367, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue9 = $composer2.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FajrSettingsScreenKt.FajrSettingsScreen$lambda$23$lambda$22(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    rememberedValue9 = obj3;
                }
                Function0 function02 = (Function0) rememberedValue9;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1267127200, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                boolean changedInstance5 = $composer2.changedInstance(viewModel);
                Object rememberedValue10 = $composer2.rememberedValue();
                if (changedInstance5) {
                }
                rememberedValue10 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return FajrSettingsScreenKt.FajrSettingsScreen$lambda$25$lambda$24(FajrViewModel.this, (CityItem) obj4);
                    }
                };
                $composer2.updateRememberedValue(rememberedValue10);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                CitySearchDialogKt.CitySearchDialog(function02, (Function1) rememberedValue10, $composer2, 6);
            } else {
                $composer2.startReplaceGroup(622370629);
            }
            $composer2.endReplaceGroup();
            if (FajrSettingsScreen$lambda$7(showMethodDialog$delegate)) {
                $composer2.startReplaceGroup(626322292);
                ComposerKt.sourceInformation($composer2, "101@4087L28,102@4148L52,99@3985L225");
                CalculationMethod calculationMethod = FajrSettingsScreen$lambda$2(state$delegate).getCalculationMethod();
                ComposerKt.sourceInformationMarkerStart($composer2, 1267133305, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue11 = $composer2.rememberedValue();
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FajrSettingsScreenKt.FajrSettingsScreen$lambda$27$lambda$26(MutableState.this);
                        }
                    };
                    $composer2.updateRememberedValue(rememberedValue11);
                }
                Function0 function03 = (Function0) rememberedValue11;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1267135281, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                boolean changedInstance6 = $composer2.changedInstance(viewModel);
                Object rememberedValue12 = $composer2.rememberedValue();
                if (changedInstance6 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return FajrSettingsScreenKt.FajrSettingsScreen$lambda$29$lambda$28(FajrViewModel.this, (CalculationMethod) obj5);
                        }
                    };
                    $composer2.updateRememberedValue(obj4);
                    rememberedValue12 = obj4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                CalculationMethodDialog(calculationMethod, function03, (Function1) rememberedValue12, $composer2, 48);
            } else {
                $composer2.startReplaceGroup(622370629);
            }
            $composer2.endReplaceGroup();
            FajrSettingsState FajrSettingsScreen$lambda$2 = FajrSettingsScreen$lambda$2(state$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267140602, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance7 = $composer2.changedInstance(viewModel);
            Object rememberedValue13 = $composer2.rememberedValue();
            if (changedInstance7) {
                fajrSettingsState = FajrSettingsScreen$lambda$2;
            } else {
                fajrSettingsState = FajrSettingsScreen$lambda$2;
            }
            Object obj5 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj6) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$31$lambda$30(FajrViewModel.this, ((Boolean) obj6).booleanValue());
                }
            };
            $composer2.updateRememberedValue(obj5);
            rememberedValue13 = obj5;
            Function1 function1 = (Function1) rememberedValue13;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267142645, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance8 = $composer2.changedInstance(viewModel) | $composer2.changed(state$delegate) | $composer2.changedInstance(locationPermissionLauncher);
            Object rememberedValue14 = $composer2.rememberedValue();
            if (changedInstance8) {
            }
            Object obj6 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$33$lambda$32(FajrViewModel.this, locationPermissionLauncher, state$delegate);
                }
            };
            $composer2.updateRememberedValue(obj6);
            rememberedValue14 = obj6;
            Function0 function04 = (Function0) rememberedValue14;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267155335, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance9 = $composer2.changedInstance(viewModel);
            Object rememberedValue15 = $composer2.rememberedValue();
            if (changedInstance9) {
            }
            rememberedValue15 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$35$lambda$34(FajrViewModel.this);
                }
            };
            $composer2.updateRememberedValue(rememberedValue15);
            Function0 function05 = (Function0) rememberedValue15;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267157462, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            Object rememberedValue16 = $composer2.rememberedValue();
            if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FajrSettingsScreenKt.FajrSettingsScreen$lambda$37$lambda$36(MutableState.this);
                    }
                };
                $composer2.updateRememberedValue(rememberedValue16);
            }
            Function0 function06 = (Function0) rememberedValue16;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267159128, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            Object rememberedValue17 = $composer2.rememberedValue();
            if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                rememberedValue17 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FajrSettingsScreenKt.FajrSettingsScreen$lambda$39$lambda$38(MutableState.this);
                    }
                };
                $composer2.updateRememberedValue(rememberedValue17);
            }
            Function0 function07 = (Function0) rememberedValue17;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267160708, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance10 = $composer2.changedInstance(viewModel);
            Object rememberedValue18 = $composer2.rememberedValue();
            if (changedInstance10) {
            }
            rememberedValue18 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$41$lambda$40(FajrViewModel.this);
                }
            };
            $composer2.updateRememberedValue(rememberedValue18);
            Function0 function08 = (Function0) rememberedValue18;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            boolean FajrSettingsScreen$lambda$10 = FajrSettingsScreen$lambda$10(isPlayingPreview$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267164633, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance11 = $composer2.changedInstance(viewModel) | $composer2.changedInstance(context);
            Object rememberedValue19 = $composer2.rememberedValue();
            if (changedInstance11) {
            }
            rememberedValue19 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$43$lambda$42(FajrViewModel.this, context, isPlayingPreview$delegate);
                }
            };
            $composer2.updateRememberedValue(rememberedValue19);
            Function0 function09 = (Function0) rememberedValue19;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267177949, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance12 = $composer2.changedInstance(ringtonePickerLauncher);
            Object rememberedValue20 = $composer2.rememberedValue();
            if (changedInstance12) {
            }
            rememberedValue20 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$46$lambda$45(ManagedActivityResultLauncher.this);
                }
            };
            $composer2.updateRememberedValue(rememberedValue20);
            Function0 function010 = (Function0) rememberedValue20;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267193766, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance13 = $composer2.changedInstance(audioPickerLauncher);
            Object rememberedValue21 = $composer2.rememberedValue();
            if (changedInstance13) {
            }
            rememberedValue21 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$48$lambda$47(ManagedActivityResultLauncher.this);
                }
            };
            $composer2.updateRememberedValue(rememberedValue21);
            Function0 function011 = (Function0) rememberedValue21;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267196030, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance14 = $composer2.changedInstance(viewModel);
            Object rememberedValue22 = $composer2.rememberedValue();
            if (changedInstance14) {
            }
            rememberedValue22 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj7) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$50$lambda$49(FajrViewModel.this, ((Boolean) obj7).booleanValue());
                }
            };
            $composer2.updateRememberedValue(rememberedValue22);
            Function1 function12 = (Function1) rememberedValue22;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267197853, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance15 = $composer2.changedInstance(viewModel);
            Object rememberedValue23 = $composer2.rememberedValue();
            if (changedInstance15) {
            }
            rememberedValue23 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj7) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$52$lambda$51(FajrViewModel.this, ((Integer) obj7).intValue());
                }
            };
            $composer2.updateRememberedValue(rememberedValue23);
            Function1 function13 = (Function1) rememberedValue23;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1267199805, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean changedInstance16 = $composer2.changedInstance(viewModel);
            Object rememberedValue24 = $composer2.rememberedValue();
            if (changedInstance16) {
            }
            rememberedValue24 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj7) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$54$lambda$53(FajrViewModel.this, ((Integer) obj7).intValue());
                }
            };
            $composer2.updateRememberedValue(rememberedValue24);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function0 onBack5 = onBack3;
            FajrSettingsContent(fajrSettingsState, onBack5, function1, function04, function05, function06, function07, function08, FajrSettingsScreen$lambda$10, function09, function010, function011, function12, function13, (Function1) rememberedValue24, $composer2, ($dirty & 112) | 1769472, 0, 0);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onBack = onBack5;
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return FajrSettingsScreenKt.FajrSettingsScreen$lambda$55(FajrViewModel.this, onBack, $changed, i, (Composer) obj7, ((Integer) obj8).intValue());
                }
            });
        }
    }

    private static final FajrSettingsState FajrSettingsScreen$lambda$2(State<FajrSettingsState> state) {
        return (FajrSettingsState) state.getValue();
    }

    private static final boolean FajrSettingsScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FajrSettingsScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean FajrSettingsScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FajrSettingsScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean FajrSettingsScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FajrSettingsScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$14$lambda$13(FajrViewModel $viewModel, Map permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Iterable values = permissions.values();
        boolean granted = false;
        if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Boolean) it.next()).booleanValue()) {
                    granted = true;
                    break;
                }
            }
        }
        if (granted) {
            $viewModel.updateLocationFromGps();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$16$lambda$15(Context $context, FajrViewModel $viewModel, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Uri uri = data != null ? (Uri) data.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : null;
            if (uri != null) {
                String title = new RingtoneHelper($context).getRingtoneTitle(uri);
                $viewModel.setRingtone(uri, title);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$18$lambda$17(Context $context, FajrViewModel $viewModel, Uri uri) {
        if (uri != null) {
            String title = new RingtoneHelper($context).getRingtoneTitle(uri);
            $viewModel.setRingtone(uri, title);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final DisposableEffectResult FajrSettingsScreen$lambda$21$lambda$20(final FajrViewModel $viewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$FajrSettingsScreen$lambda$21$lambda$20$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                FajrViewModel.this.stopRingtonePreview();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$23$lambda$22(MutableState $showCityDialog$delegate) {
        FajrSettingsScreen$lambda$5($showCityDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$25$lambda$24(FajrViewModel $viewModel, CityItem city) {
        Intrinsics.checkNotNullParameter(city, "city");
        $viewModel.setCity(city);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$27$lambda$26(MutableState $showMethodDialog$delegate) {
        FajrSettingsScreen$lambda$8($showMethodDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$29$lambda$28(FajrViewModel $viewModel, CalculationMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        $viewModel.setCalculationMethod(method);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$31$lambda$30(FajrViewModel $viewModel, boolean it) {
        $viewModel.toggleAlarm(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$33$lambda$32(FajrViewModel $viewModel, ManagedActivityResultLauncher $locationPermissionLauncher, State $state$delegate) {
        $viewModel.setUseCurrentLocation(true);
        if (!FajrSettingsScreen$lambda$2($state$delegate).getHasLocationPermission()) {
            $locationPermissionLauncher.launch(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$35$lambda$34(FajrViewModel $viewModel) {
        $viewModel.setUseCurrentLocation(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$37$lambda$36(MutableState $showCityDialog$delegate) {
        FajrSettingsScreen$lambda$5($showCityDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$39$lambda$38(MutableState $showMethodDialog$delegate) {
        FajrSettingsScreen$lambda$8($showMethodDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$41$lambda$40(FajrViewModel $viewModel) {
        $viewModel.refreshFajrTimeManually();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$43$lambda$42(FajrViewModel $viewModel, Context $context, MutableState $isPlayingPreview$delegate) {
        if (FajrSettingsScreen$lambda$10($isPlayingPreview$delegate)) {
            $viewModel.stopRingtonePreview();
            FajrSettingsScreen$lambda$11($isPlayingPreview$delegate, false);
        } else {
            Uri uri = new RingtoneHelper($context).getValidRingtoneUri(new FajrPreferences($context));
            $viewModel.playRingtonePreview(uri);
            FajrSettingsScreen$lambda$11($isPlayingPreview$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$46$lambda$45(ManagedActivityResultLauncher $ringtonePickerLauncher) {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TYPE", 4);
        intent.putExtra("android.intent.extra.ringtone.TITLE", "اختر نغمة المنبه");
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        $ringtonePickerLauncher.launch(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$48$lambda$47(ManagedActivityResultLauncher $audioPickerLauncher) {
        $audioPickerLauncher.launch("audio/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$50$lambda$49(FajrViewModel $viewModel, boolean it) {
        $viewModel.toggleVibration(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$52$lambda$51(FajrViewModel $viewModel, int it) {
        $viewModel.setAlarmVolume(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsScreen$lambda$54$lambda$53(FajrViewModel $viewModel, int it) {
        $viewModel.setMaxDuration(it);
        return Unit.INSTANCE;
    }

    public static final void FajrSettingsContent(final FajrSettingsState state, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, boolean isPlayingPreview, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Function1<? super Boolean, Unit> function12, Function1<? super Integer, Unit> function13, Function1<? super Integer, Unit> function14, Composer $composer, final int $changed, final int $changed1, final int i) {
        Function0 onBack;
        Function1 function15;
        Function0 function010;
        Function0 onSelectManualCity;
        Function0 function011;
        Function0 function012;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer $composer2;
        final Function0 onChangeCity;
        final Function1 onSetVolume;
        int $dirty;
        int $dirty1;
        final Function0 onChangeCity2;
        final Function0 onChangeMethod;
        final Function1 onToggleAlarm;
        final Function0 onRefresh;
        final Function0 onBack2;
        final Function0 onSelectManualCity2;
        final boolean isPlayingPreview2;
        final Function0 onTogglePreview;
        final Function0 onPickSystemRingtone;
        final Function0 onPickAudioFile;
        final Function1 onToggleVibration;
        final Function1 onSetMaxDuration;
        Function1 onToggleAlarm2;
        Function1 onToggleAlarm3;
        Function0 onSelectGps;
        Function0 onSelectGps2;
        Function0 onChangeCity3;
        Function0 onChangeMethod2;
        Function0 onRefresh2;
        Function0 onChangeCity4;
        Function0 onTogglePreview2;
        final Function0 onTogglePreview3;
        Function0 onPickSystemRingtone2;
        Function0 onPickSystemRingtone3;
        Function0 onPickAudioFile2;
        Function0 onPickAudioFile3;
        Function1 onToggleVibration2;
        Function1 onToggleVibration3;
        Function1 onSetVolume2;
        Function1 onSetVolume3;
        Function1 onSetMaxDuration2;
        Function1 onToggleAlarm4;
        Function0 onChangeCity5;
        Function0 onChangeMethod3;
        Function0 onRefresh3;
        Function0 onTogglePreview4;
        boolean isPlayingPreview3;
        Function0 onPickSystemRingtone4;
        Function0 onPickAudioFile4;
        Function1 onToggleVibration4;
        Function1 onSetVolume4;
        Function1 onSetMaxDuration3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer3 = $composer.startRestartGroup(620913404);
        ComposerKt.sourceInformation($composer3, "C(FajrSettingsContent)N(state,onBack,onToggleAlarm,onSelectGps,onSelectManualCity,onChangeCity,onChangeMethod,onRefresh,isPlayingPreview,onTogglePreview,onPickSystemRingtone,onPickAudioFile,onToggleVibration,onSetVolume,onSetMaxDuration)155@6299L2,156@6342L2,157@6376L2,158@6417L2,159@6452L2,160@6489L2,161@6521L2,163@6598L2,164@6641L2,165@6679L2,166@6726L2,167@6763L2,168@6805L2,170@6872L13576,170@6816L13632:FajrSettingsScreen.kt#jcb7bm");
        int $dirty2 = $changed;
        int $dirty12 = $changed1;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(state) ? 4 : 2;
        }
        int i9 = i & 2;
        if (i9 != 0) {
            $dirty2 |= 48;
            onBack = function0;
        } else if (($changed & 48) == 0) {
            onBack = function0;
            $dirty2 |= $composer3.changedInstance(onBack) ? 32 : 16;
        } else {
            onBack = function0;
        }
        int i10 = i & 4;
        if (i10 != 0) {
            $dirty2 |= 384;
            function15 = function1;
        } else if (($changed & 384) == 0) {
            function15 = function1;
            $dirty2 |= $composer3.changedInstance(function15) ? 256 : 128;
        } else {
            function15 = function1;
        }
        int i11 = i & 8;
        if (i11 != 0) {
            $dirty2 |= 3072;
            function010 = function02;
        } else if (($changed & 3072) == 0) {
            function010 = function02;
            $dirty2 |= $composer3.changedInstance(function010) ? 2048 : 1024;
        } else {
            function010 = function02;
        }
        int i12 = i & 16;
        if (i12 != 0) {
            $dirty2 |= 24576;
            onSelectManualCity = function03;
        } else if (($changed & 24576) == 0) {
            onSelectManualCity = function03;
            $dirty2 |= $composer3.changedInstance(onSelectManualCity) ? 16384 : 8192;
        } else {
            onSelectManualCity = function03;
        }
        int i13 = i & 32;
        if (i13 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function011 = function04;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            function011 = function04;
            $dirty2 |= $composer3.changedInstance(function011) ? 131072 : 65536;
        } else {
            function011 = function04;
        }
        int i14 = i & 64;
        if (i14 != 0) {
            $dirty2 |= 1572864;
            function012 = function05;
        } else if (($changed & 1572864) == 0) {
            function012 = function05;
            $dirty2 |= $composer3.changedInstance(function012) ? 1048576 : 524288;
        } else {
            function012 = function05;
        }
        int i15 = i & 128;
        if (i15 != 0) {
            $dirty2 |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty2 |= $composer3.changedInstance(function06) ? 8388608 : 4194304;
        }
        int i16 = i & 256;
        if (i16 != 0) {
            $dirty2 |= 100663296;
            i2 = i16;
        } else if (($changed & 100663296) == 0) {
            i2 = i16;
            $dirty2 |= $composer3.changed(isPlayingPreview) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            i2 = i16;
        }
        int i17 = i & 512;
        if (i17 != 0) {
            $dirty2 |= 805306368;
            i3 = i17;
        } else if (($changed & 805306368) == 0) {
            i3 = i17;
            $dirty2 |= $composer3.changedInstance(function07) ? 536870912 : 268435456;
        } else {
            i3 = i17;
        }
        int i18 = i & 1024;
        if (i18 != 0) {
            $dirty12 |= 6;
            i4 = i18;
        } else if (($changed1 & 6) == 0) {
            i4 = i18;
            $dirty12 |= $composer3.changedInstance(function08) ? 4 : 2;
        } else {
            i4 = i18;
        }
        int i19 = i & 2048;
        if (i19 != 0) {
            $dirty12 |= 48;
            i5 = i19;
        } else if (($changed1 & 48) == 0) {
            i5 = i19;
            $dirty12 |= $composer3.changedInstance(function09) ? 32 : 16;
        } else {
            i5 = i19;
        }
        int i20 = i & 4096;
        if (i20 != 0) {
            $dirty12 |= 384;
            i6 = i20;
        } else {
            i6 = i20;
            if (($changed1 & 384) == 0) {
                $dirty12 |= $composer3.changedInstance(function12) ? 256 : 128;
            }
        }
        int i21 = i & 8192;
        if (i21 != 0) {
            $dirty12 |= 3072;
            i7 = i21;
        } else {
            i7 = i21;
            if (($changed1 & 3072) == 0) {
                $dirty12 |= $composer3.changedInstance(function13) ? 2048 : 1024;
            }
        }
        int i22 = i & 16384;
        if (i22 != 0) {
            $dirty12 |= 24576;
            i8 = i22;
        } else {
            i8 = i22;
            if (($changed1 & 24576) == 0) {
                $dirty12 |= $composer3.changedInstance(function14) ? 16384 : 8192;
            }
        }
        if ($composer3.shouldExecute((($dirty2 & 306783379) == 306783378 && ($dirty12 & 9363) == 9362) ? false : true, $dirty2 & 1)) {
            if (i9 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302669954, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue = $composer3.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda33
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
                Function0 onBack3 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onBack = onBack3;
            }
            if (i10 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302668578, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue2 = $composer3.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda58
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Unit unit;
                            ((Boolean) obj3).booleanValue();
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    rememberedValue2 = obj2;
                }
                onToggleAlarm2 = (Function1) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onToggleAlarm2 = function15;
            }
            if (i11 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302667490, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue3 = $composer3.rememberedValue();
                onToggleAlarm3 = onToggleAlarm2;
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj3);
                    rememberedValue3 = obj3;
                }
                onSelectGps = (Function0) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onToggleAlarm3 = onToggleAlarm2;
                onSelectGps = function010;
            }
            if (i12 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302666178, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue4 = $composer3.rememberedValue();
                onSelectGps2 = onSelectGps;
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj4);
                    rememberedValue4 = obj4;
                }
                Function0 onSelectManualCity3 = (Function0) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onSelectManualCity = onSelectManualCity3;
            } else {
                onSelectGps2 = onSelectGps;
            }
            if (i13 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302665058, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue5 = $composer3.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj5);
                    rememberedValue5 = obj5;
                }
                onChangeCity3 = (Function0) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onChangeCity3 = function011;
            }
            if (i14 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302663874, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue6 = $composer3.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj6);
                    rememberedValue6 = obj6;
                }
                onChangeMethod2 = (Function0) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onChangeMethod2 = function012;
            }
            if (i15 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302662850, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue7 = $composer3.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object obj7 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj7);
                    rememberedValue7 = obj7;
                }
                onRefresh2 = (Function0) rememberedValue7;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onRefresh2 = function06;
            }
            boolean isPlayingPreview4 = i2 != 0 ? false : isPlayingPreview;
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302660386, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue8 = $composer3.rememberedValue();
                onChangeCity4 = onChangeCity3;
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Object obj8 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj8);
                    rememberedValue8 = obj8;
                }
                onTogglePreview2 = (Function0) rememberedValue8;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onChangeCity4 = onChangeCity3;
                onTogglePreview2 = function07;
            }
            if (i4 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302659010, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue9 = $composer3.rememberedValue();
                onTogglePreview3 = onTogglePreview2;
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Object obj9 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj9);
                    rememberedValue9 = obj9;
                }
                onPickSystemRingtone2 = (Function0) rememberedValue9;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onTogglePreview3 = onTogglePreview2;
                onPickSystemRingtone2 = function08;
            }
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302657794, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue10 = $composer3.rememberedValue();
                onPickSystemRingtone3 = onPickSystemRingtone2;
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj10 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj10);
                    rememberedValue10 = obj10;
                }
                onPickAudioFile2 = (Function0) rememberedValue10;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onPickSystemRingtone3 = onPickSystemRingtone2;
                onPickAudioFile2 = function09;
            }
            if (i6 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302656290, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue11 = $composer3.rememberedValue();
                onPickAudioFile3 = onPickAudioFile2;
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    Object obj11 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda44
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj12) {
                            Unit unit;
                            ((Boolean) obj12).booleanValue();
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj11);
                    rememberedValue11 = obj11;
                }
                onToggleVibration2 = (Function1) rememberedValue11;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onPickAudioFile3 = onPickAudioFile2;
                onToggleVibration2 = function12;
            }
            if (i7 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302655106, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue12 = $composer3.rememberedValue();
                onToggleVibration3 = onToggleVibration2;
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    Object obj12 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda54
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            Unit unit;
                            ((Integer) obj13).intValue();
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj12);
                    rememberedValue12 = obj12;
                }
                onSetVolume2 = (Function1) rememberedValue12;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onToggleVibration3 = onToggleVibration2;
                onSetVolume2 = function13;
            }
            if (i8 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -302653762, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                Object rememberedValue13 = $composer3.rememberedValue();
                onSetVolume3 = onSetVolume2;
                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    Object obj13 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda55
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj14) {
                            Unit unit;
                            ((Integer) obj14).intValue();
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj13);
                    rememberedValue13 = obj13;
                }
                onSetMaxDuration2 = (Function1) rememberedValue13;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onSetVolume3 = onSetVolume2;
                onSetMaxDuration2 = function14;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620913404, $dirty2, $dirty12, "com.example.fajr.ui.FajrSettingsContent (FajrSettingsScreen.kt:169)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -302638044, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            boolean z = (($dirty2 & 14) == 4) | (($dirty2 & 896) == 256) | (($dirty2 & 7168) == 2048) | ((57344 & $dirty2) == 16384) | ((458752 & $dirty2) == 131072) | ((3670016 & $dirty2) == 1048576) | ((29360128 & $dirty2) == 8388608) | ((1879048192 & $dirty2) == 536870912) | ((234881024 & $dirty2) == 67108864) | (($dirty12 & 14) == 4) | (($dirty12 & 112) == 32) | (($dirty12 & 896) == 256) | (($dirty12 & 7168) == 2048) | ((57344 & $dirty12) == 16384);
            Object rememberedValue14 = $composer3.rememberedValue();
            if (z || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                final Function0 onPickSystemRingtone5 = onPickSystemRingtone3;
                final Function0 onPickAudioFile5 = onPickAudioFile3;
                final Function1 onToggleVibration5 = onToggleVibration3;
                final Function1 onSetVolume5 = onSetVolume3;
                final Function1 onSetMaxDuration4 = onSetMaxDuration2;
                final Function0 onChangeMethod4 = onChangeMethod2;
                final Function0 onRefresh4 = onRefresh2;
                final boolean isPlayingPreview5 = isPlayingPreview4;
                final Function0 onPickAudioFile6 = onSelectManualCity;
                final Function0 onPickSystemRingtone6 = onSelectGps2;
                final Function0 onChangeCity6 = onChangeCity4;
                final Function1 onToggleAlarm5 = onToggleAlarm3;
                Function1 onToggleAlarm6 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj14) {
                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123(FajrSettingsState.this, onToggleAlarm5, onPickSystemRingtone6, onPickAudioFile6, onChangeCity6, onChangeMethod4, onRefresh4, onTogglePreview3, isPlayingPreview5, onPickSystemRingtone5, onPickAudioFile5, onToggleVibration5, onSetVolume5, onSetMaxDuration4, (LazyListScope) obj14);
                    }
                };
                onToggleAlarm4 = onToggleAlarm5;
                onRefresh = onPickSystemRingtone6;
                onChangeCity5 = onChangeCity6;
                onChangeMethod3 = onChangeMethod4;
                onRefresh3 = onRefresh4;
                onTogglePreview4 = onTogglePreview3;
                isPlayingPreview3 = isPlayingPreview5;
                onPickSystemRingtone4 = onPickSystemRingtone5;
                onPickAudioFile4 = onPickAudioFile5;
                onToggleVibration4 = onToggleVibration5;
                onSetVolume4 = onSetVolume5;
                onSetMaxDuration3 = onSetMaxDuration4;
                $composer3.updateRememberedValue(onToggleAlarm6);
                rememberedValue14 = onToggleAlarm6;
            } else {
                onPickSystemRingtone4 = onPickSystemRingtone3;
                onPickAudioFile4 = onPickAudioFile3;
                onToggleVibration4 = onToggleVibration3;
                onSetVolume4 = onSetVolume3;
                onTogglePreview4 = onTogglePreview3;
                onSetMaxDuration3 = onSetMaxDuration2;
                onChangeMethod3 = onChangeMethod2;
                onRefresh3 = onRefresh2;
                isPlayingPreview3 = isPlayingPreview4;
                onToggleAlarm4 = onToggleAlarm3;
                onRefresh = onSelectGps2;
                onChangeCity5 = onChangeCity4;
            }
            Function1 function16 = (Function1) rememberedValue14;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            int i23 = (($dirty2 << 6) & 7168) | 6;
            int i24 = 246;
            Function0 onBack4 = onBack;
            Function0 function013 = null;
            if (onBack instanceof FajrDrawerAction) {
                onBack4 = null;
                function013 = onBack;
                i24 = 230;
            }
            OneUIKt.m7686OneUIScreengMrHQkA("منبه صلاة الفجر", null, null, onBack4, function013, null, null, 0.0f, function16, $composer3, i23, i24);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onToggleAlarm = onToggleAlarm4;
            $dirty = $dirty2;
            $dirty1 = $dirty12;
            onChangeCity2 = onChangeCity5;
            onBack2 = onBack;
            onChangeMethod = onChangeMethod3;
            onSelectManualCity2 = onSelectManualCity;
            onChangeCity = onRefresh3;
            isPlayingPreview2 = isPlayingPreview3;
            onTogglePreview = onTogglePreview4;
            onPickSystemRingtone = onPickSystemRingtone4;
            onPickAudioFile = onPickAudioFile4;
            onToggleVibration = onToggleVibration4;
            onSetVolume = onSetVolume4;
            onSetMaxDuration = onSetMaxDuration3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onChangeCity = function06;
            onSetVolume = function13;
            $dirty = $dirty2;
            $dirty1 = $dirty12;
            onChangeCity2 = function011;
            onChangeMethod = function012;
            onToggleAlarm = function15;
            onRefresh = function010;
            onBack2 = onBack;
            onSelectManualCity2 = onSelectManualCity;
            isPlayingPreview2 = isPlayingPreview;
            onTogglePreview = function07;
            onPickSystemRingtone = function08;
            onPickAudioFile = function09;
            onToggleVibration = function12;
            onSetMaxDuration = function14;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj14, Object obj15) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$125(FajrSettingsState.this, onBack2, onToggleAlarm, onRefresh, onSelectManualCity2, onChangeCity2, onChangeMethod, onChangeCity, isPlayingPreview2, onTogglePreview, onPickSystemRingtone, onPickAudioFile, onToggleVibration, onSetVolume, onSetMaxDuration, $changed, $changed1, i, (Composer) obj14, ((Integer) obj15).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123(final FajrSettingsState $state, final Function1 $onToggleAlarm, final Function0 $onSelectGps, final Function0 $onSelectManualCity, final Function0 $onChangeCity, final Function0 $onChangeMethod, final Function0 $onRefresh, final Function0 $onTogglePreview, final boolean $isPlayingPreview, final Function0 $onPickSystemRingtone, final Function0 $onPickAudioFile, final Function1 $onToggleVibration, final Function1 $onSetVolume, final Function1 $onSetMaxDuration, LazyListScope OneUIScreen) {
        Intrinsics.checkNotNullParameter(OneUIScreen, "$this$OneUIScreen");
        LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(-1169439782, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$82(FajrSettingsState.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(-1140692797, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$88(FajrSettingsState.this, $onToggleAlarm, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(-87656030, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$94(FajrSettingsState.this, $onSelectGps, $onSelectManualCity, $onChangeCity, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(965380737, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$100(Function0.this, $state, $onRefresh, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(2018417504, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107(Function0.this, $state, $isPlayingPreview, $onPickSystemRingtone, $onPickAudioFile, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.CC.item$default(OneUIScreen, null, null, ComposableLambdaKt.composableLambdaInstance(-1223513025, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122(FajrSettingsState.this, $onToggleVibration, $onSetVolume, $onSetMaxDuration, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$82(FajrSettingsState $state, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C173@6958L191:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169439782, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:173)");
            }
            FajrHeader($state.getNextFajrTimeFormatted(), $state.isAlarmEnabled(), $state.getCityName(), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$88(final FajrSettingsState $state, final Function1 $onToggleAlarm, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C182@7259L2001,182@7217L2043:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1140692797, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:182)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(18)), 0L, ComposableLambdaKt.rememberComposableLambda(395684152, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$88$lambda$87(FajrSettingsState.this, $onToggleAlarm, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$88$lambda$87(FajrSettingsState $state, Function1 $onToggleAlarm, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Composer m3828constructorimpl;
        long m4487copywmQWz5c;
        Function0 function03;
        Composer m3828constructorimpl2;
        Function0 function04;
        Composer m3828constructorimpl3;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C183@7277L1969:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(395684152, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:183)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            if (!m3828constructorimpl4.getInserting() && Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i3 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 58942102, "C188@7515L1546,218@9082L146:FajrSettingsScreen.kt#jcb7bm");
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                    function02 = constructor2;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor2;
                    $composer.useNode();
                }
                m3828constructorimpl = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i6 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1701113123, "C193@7800L11,189@7593L695,203@8313L29,204@8367L672:FajrSettingsScreen.kt#jcb7bm");
                    Modifier clip = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                    m4487copywmQWz5c = Color.m4487copywmQWz5c(r56, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r56) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r56) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r56) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary()) : 0.0f);
                    Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(clip, m4487copywmQWz5c, null, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i7 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function03 = constructor3;
                        $composer.createNode(function03);
                    } else {
                        function03 = constructor3;
                        $composer.useNode();
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
                        int i9 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 199871825, "C199@8148L11,196@7962L300:FajrSettingsScreen.kt#jcb7bm");
                        IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier2);
                        Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        int i10 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                            function04 = constructor4;
                            $composer.createNode(function04);
                        } else {
                            function04 = constructor4;
                            $composer.useNode();
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            int i11 = (i10 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i12 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                            TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
                            OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
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
                        int i112 = (i10 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        int i122 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                        if (!$state.isAlarmEnabled()) {
                        }
                        TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
                        OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
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
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i92 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 199871825, "C199@8148L11,196@7962L300:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier22 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, modifier22);
                    Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    int i102 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl3.getInserting()) {
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1122 = (i102 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        int i1222 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                        if (!$state.isAlarmEnabled()) {
                        }
                        TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
                        OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
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
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                    int i12222 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                    if (!$state.isAlarmEnabled()) {
                    }
                    TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
                    OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
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
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                int i62 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1701113123, "C193@7800L11,189@7593L695,203@8313L29,204@8367L672:FajrSettingsScreen.kt#jcb7bm");
                Modifier clip2 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                m4487copywmQWz5c = Color.m4487copywmQWz5c(r56, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r56) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r56) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r56) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary()) : 0.0f);
                Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(clip2, m4487copywmQWz5c, null, 2, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default2);
                Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                int i72 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    int i822 = (i72 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    int i922 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 199871825, "C199@8148L11,196@7962L300:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, modifier222);
                    Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1022 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422), setCompositeKeyHash422);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    int i112222 = (i1022 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                    int i122222 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                    if (!$state.isAlarmEnabled()) {
                    }
                    TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
                    OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
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
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                int i9222 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 199871825, "C199@8148L11,196@7962L300:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier2222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, modifier2222);
                Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                int i10222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4222), setCompositeKeyHash4222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                int i1122222 = (i10222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                int i1222222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                if (!$state.isAlarmEnabled()) {
                }
                TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
                OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            int i32 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 58942102, "C188@7515L1546,218@9082L146:FajrSettingsScreen.kt#jcb7bm");
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, modifier3);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i522 = (i42 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                int i622 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1701113123, "C193@7800L11,189@7593L695,203@8313L29,204@8367L672:FajrSettingsScreen.kt#jcb7bm");
                Modifier clip22 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
                m4487copywmQWz5c = Color.m4487copywmQWz5c(r56, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r56) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r56) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r56) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary()) : 0.0f);
                Modifier m231backgroundbw27NRU$default22 = BackgroundKt.m231backgroundbw27NRU$default(clip22, m4487copywmQWz5c, null, 2, null);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default22);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i722 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i82222 = (i722 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                int i92222 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 199871825, "C199@8148L11,196@7962L300:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier22222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, modifier22222);
                Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                int i102222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42222), setCompositeKeyHash42222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                int i11222222 = (i102222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                int i12222222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                if (!$state.isAlarmEnabled()) {
                }
                TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
                OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
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
            RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
            int i6222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1701113123, "C193@7800L11,189@7593L695,203@8313L29,204@8367L672:FajrSettingsScreen.kt#jcb7bm");
            Modifier clip222 = ClipKt.clip(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
            m4487copywmQWz5c = Color.m4487copywmQWz5c(r56, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r56) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r56) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r56) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary()) : 0.0f);
            Modifier m231backgroundbw27NRU$default222 = BackgroundKt.m231backgroundbw27NRU$default(clip222, m4487copywmQWz5c, null, 2, null);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i7222 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i822222 = (i7222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            int i922222 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 199871825, "C199@8148L11,196@7962L300:FajrSettingsScreen.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier222222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash422222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier($composer, modifier222222);
            Function0 constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            int i1022222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422222));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422222), setCompositeKeyHash422222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
            int i112222222 = (i1022222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
            int i122222222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1295631436, "C209@8640L11,205@8404L287,214@8955L11,211@8720L293:FajrSettingsScreen.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("تفعيل منبه صلاة الفجر", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
            if (!$state.isAlarmEnabled()) {
            }
            TextKt.m2816Text4IGK_g(!$state.isAlarmEnabled() ? "المنبه يعطي تنبيهاً وقت الفجر" : "المنبه متوقف حالياً", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
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
            OneUIKt.OneUISwitch($state.isAlarmEnabled(), $onToggleAlarm, null, $composer, 0, 4);
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
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$94(final FajrSettingsState $state, final Function0 $onSelectGps, final Function0 $onSelectManualCity, final Function0 $onChangeCity, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C228@9366L2986,228@9324L3028:FajrSettingsScreen.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87656030, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:228)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(18)), 0L, ComposableLambdaKt.rememberComposableLambda(1448720919, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$94$lambda$93(FajrSettingsState.this, $onSelectGps, $onSelectManualCity, $onChangeCity, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$94$lambda$93(FajrSettingsState $state, Function0 $onSelectGps, Function0 $onSelectManualCity, Function0 $onChangeCity, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        Composer composer;
        Composer composer2;
        Function0 function02;
        Composer m3828constructorimpl;
        Function0 function03;
        Composer m3828constructorimpl2;
        int i2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C233@9569L11,229@9384L224,235@9625L30,237@9673L301,244@9991L29,245@10037L337,253@10392L30,255@10440L1080:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1448720919, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:229)");
            }
            TextKt.m2816Text4IGK_g("طريقة تحديد الموقع", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            LocationOptionRow($state.getUseCurrentLocation(), GpsFixedKt.getGpsFixed(Icons.Outlined.INSTANCE), "الموقع الحالي", "تحديث تلقائي لموعد الفجر حسب موقعك", $onSelectGps, $composer, 3456);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
            LocationOptionRow(!$state.getUseCurrentLocation(), EditLocationKt.getEditLocation(Icons.Outlined.INSTANCE), "اختيار الدولة والمدينة", "اختيار مدينتك يدوياً بدون الحاجة إلى تحديد الموقع", $onSelectManualCity, $composer, 3456);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(14)), $composer, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl3.getInserting()) {
                i = 438;
                composer = $composer;
            } else {
                i = 438;
                composer = $composer;
                if (Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i4 = (i3 >> 6) & 14;
                    composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i5 = ((i >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 636110256, "C260@10678L564:FajrSettingsScreen.kt#jcb7bm");
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i6 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        function02 = constructor2;
                        composer2.createNode(function02);
                    } else {
                        function02 = constructor2;
                        composer2.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl(composer2);
                    Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i7 = (i6 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i8 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1123948844, "C261@10868L11,261@10788L100,262@10913L29,263@10967L253:FajrSettingsScreen.kt#jcb7bm");
                        IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 48, 4);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier);
                        Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i9 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            function03 = constructor3;
                            composer2.createNode(function03);
                        } else {
                            function03 = constructor3;
                            composer2.useNode();
                        }
                        m3828constructorimpl2 = Updater.m3828constructorimpl(composer2);
                        Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i10 = (i9 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i11 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1872814160, "C264@11068L11,264@11004L93,265@11126L68:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g("المدينة الحالية", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                            TextKt.m2816Text4IGK_g($state.getCityName(), (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if ($state.getUseCurrentLocation()) {
                                composer2.startReplaceGroup(636702231);
                                ComposerKt.sourceInformation(composer2, "269@11320L160");
                                ButtonKt.TextButton($onChangeCity, null, false, null, null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$431213267$app(), composer2, 805306368, 510);
                            } else {
                                composer2.startReplaceGroup(625491143);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if ($state.getUseCurrentLocation() || ($state.getHasLocationPermission() && $state.isGpsAvailable())) {
                                $composer.startReplaceGroup(-1290751637);
                            } else {
                                $composer.startReplaceGroup(-1279194620);
                                ComposerKt.sourceInformation($composer, "276@11649L30,277@11700L620");
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                Modifier modifier2 = Modifier.INSTANCE;
                                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier2);
                                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                int i12 = ((((384 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                $composer.startReusableNode();
                                if ($composer.getInserting()) {
                                    $composer.createNode(constructor4);
                                } else {
                                    $composer.useNode();
                                }
                                Composer m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3828constructorimpl4.getInserting()) {
                                    i2 = 384;
                                    composer3 = $composer;
                                } else {
                                    i2 = 384;
                                    composer3 = $composer;
                                    if (Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        Updater.m3835setimpl(m3828constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i13 = (i12 >> 6) & 14;
                                        Composer composer4 = composer3;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                        int i14 = ((i2 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 1152824421, "C278@11855L11,278@11778L95,279@11898L29,284@12255L11,280@11952L346:FajrSettingsScreen.kt#jcb7bm");
                                        IconKt.m2273Iconww6aTOc(WarningKt.getWarning(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getError(), composer4, 48, 4);
                                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer4, 6);
                                        TextKt.m2816Text4IGK_g($state.getHasLocationPermission() ? "صلاحية الموقع غير ممنوحة. يرجى المتابعة لمنح الصلاحية." : "خدمة الموقع (GPS) غير مفعلة في الهاتف.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getError(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                    }
                                }
                                m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i132 = (i12 >> 6) & 14;
                                Composer composer42 = composer3;
                                ComposerKt.sourceInformationMarkerStart(composer42, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                                int i142 = ((i2 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer42, 1152824421, "C278@11855L11,278@11778L95,279@11898L29,284@12255L11,280@11952L346:FajrSettingsScreen.kt#jcb7bm");
                                IconKt.m2273Iconww6aTOc(WarningKt.getWarning(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getError(), composer42, 48, 4);
                                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer42, 6);
                                if ($state.getHasLocationPermission()) {
                                }
                                TextKt.m2816Text4IGK_g($state.getHasLocationPermission() ? "صلاحية الموقع غير ممنوحة. يرجى المتابعة لمنح الصلاحية." : "خدمة الموقع (GPS) غير مفعلة في الهاتف.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getError(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer42, 3072, 0, 131058);
                                ComposerKt.sourceInformationMarkerEnd(composer42);
                                ComposerKt.sourceInformationMarkerEnd(composer42);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                            }
                            $composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i102 = (i9 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        int i112 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1872814160, "C264@11068L11,264@11004L93,265@11126L68:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("المدينة الحالية", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                        TextKt.m2816Text4IGK_g($state.getCityName(), (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if ($state.getUseCurrentLocation()) {
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if ($state.getUseCurrentLocation()) {
                        }
                        $composer.startReplaceGroup(-1290751637);
                        $composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i72 = (i6 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    int i82 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1123948844, "C261@10868L11,261@10788L100,262@10913L29,263@10967L253:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 48, 4);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier3 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer2, modifier3);
                    Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    int i92 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl(composer2);
                    Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl2.getInserting()) {
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1022 = (i92 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        int i1122 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1872814160, "C264@11068L11,264@11004L93,265@11126L68:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("المدينة الحالية", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                        TextKt.m2816Text4IGK_g($state.getCityName(), (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if ($state.getUseCurrentLocation()) {
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if ($state.getUseCurrentLocation()) {
                        }
                        $composer.startReplaceGroup(-1290751637);
                        $composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    int i10222 = (i92 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                    int i11222 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1872814160, "C264@11068L11,264@11004L93,265@11126L68:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("المدينة الحالية", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                    TextKt.m2816Text4IGK_g($state.getCityName(), (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if ($state.getUseCurrentLocation()) {
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if ($state.getUseCurrentLocation()) {
                    }
                    $composer.startReplaceGroup(-1290751637);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i42 = (i3 >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i52 = ((i >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 636110256, "C260@10678L564:FajrSettingsScreen.kt#jcb7bm");
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            Modifier weight$default2 = RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, weight$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i62 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl(composer2);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i722 = (i62 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                int i822 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1123948844, "C261@10868L11,261@10788L100,262@10913L29,263@10967L253:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier32 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap322 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer2, modifier32);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i922 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl(composer2);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i102222 = (i922 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                int i112222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 1872814160, "C264@11068L11,264@11004L93,265@11126L68:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("المدينة الحالية", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                TextKt.m2816Text4IGK_g($state.getCityName(), (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if ($state.getUseCurrentLocation()) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if ($state.getUseCurrentLocation()) {
                }
                $composer.startReplaceGroup(-1290751637);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i7222 = (i62 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
            int i8222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -1123948844, "C261@10868L11,261@10788L100,262@10913L29,263@10967L253:FajrSettingsScreen.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 48, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier322 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(composer2, modifier322);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i9222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl(composer2);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i1022222 = (i9222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
            int i1122222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1872814160, "C264@11068L11,264@11004L93,265@11126L68:FajrSettingsScreen.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("المدينة الحالية", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
            TextKt.m2816Text4IGK_g($state.getCityName(), (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if ($state.getUseCurrentLocation()) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if ($state.getUseCurrentLocation()) {
            }
            $composer.startReplaceGroup(-1290751637);
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$100(final Function0 $onChangeMethod, final FajrSettingsState $state, final Function0 $onRefresh, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C293@12463L2164,293@12421L2206:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(965380737, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:293)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(18)), 0L, ComposableLambdaKt.rememberComposableLambda(-1793209610, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99(Function0.this, $state, $onRefresh, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99(Function0 $onChangeMethod, final FajrSettingsState $state, Function0 $onRefresh, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Composer m3828constructorimpl;
        Function0 function02;
        Composer m3828constructorimpl2;
        Composer composer;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C294@12481L68,295@12566L30,297@12614L1155,317@13787L30,324@14071L542,319@13835L778:FajrSettingsScreen.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1793209610, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:294)");
            }
            TextKt.m2816Text4IGK_g("طريقة الحساب", (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(12))), false, null, null, $onChangeMethod, 7, null), 0.0f, Dp.m7226constructorimpl(6), 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i3 = ((432 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 1213302311, "C306@13045L581,314@13731L11,314@13647L104:FajrSettingsScreen.kt#jcb7bm");
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, weight$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer.useNode();
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
                    ComposerKt.sourceInformationMarkerStart($composer, -546752604, "C307@13229L11,307@13155L94,308@13274L29,309@13328L276:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(TuneKt.getTune(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function02 = constructor3;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor3;
                        $composer.useNode();
                    }
                    m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl2.getInserting()) {
                        composer = $composer;
                        if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i8 = (i7 >> 6) & 14;
                            Composer composer2 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i9 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, -1844956710, "C310@13435L11,310@13365L99,311@13493L85:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g("طريقة الحساب المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                            TextKt.m2816Text4IGK_g($state.getCalculationMethod().getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            TextKt.m2816Text4IGK_g("تغيير", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                            ButtonKt.OutlinedButton($onRefresh, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !$state.isRefreshing(), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1597870056, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda52
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99$lambda$98(FajrSettingsState.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            }, $composer, 54), $composer, 805306416, 496);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    } else {
                        composer = $composer;
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i82 = (i7 >> 6) & 14;
                    Composer composer22 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer22, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i92 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer22, -1844956710, "C310@13435L11,310@13365L99,311@13493L85:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("طريقة الحساب المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer22, 3078, 0, 131058);
                    TextKt.m2816Text4IGK_g($state.getCalculationMethod().getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer22, 199680, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd(composer22);
                    ComposerKt.sourceInformationMarkerEnd(composer22);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    TextKt.m2816Text4IGK_g("تغيير", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    ButtonKt.OutlinedButton($onRefresh, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !$state.isRefreshing(), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1597870056, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda52
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99$lambda$98(FajrSettingsState.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, $composer, 54), $composer, 805306416, 496);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i62 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -546752604, "C307@13229L11,307@13155L94,308@13274L29,309@13328L276:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(TuneKt.getTune(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, modifier2);
                Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                int i72 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                int i822 = (i72 >> 6) & 14;
                Composer composer222 = composer;
                ComposerKt.sourceInformationMarkerStart(composer222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                int i922 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer222, -1844956710, "C310@13435L11,310@13365L99,311@13493L85:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("طريقة الحساب المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer222, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer222, 3078, 0, 131058);
                TextKt.m2816Text4IGK_g($state.getCalculationMethod().getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer222, 199680, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd(composer222);
                ComposerKt.sourceInformationMarkerEnd(composer222);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                TextKt.m2816Text4IGK_g("تغيير", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                ButtonKt.OutlinedButton($onRefresh, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !$state.isRefreshing(), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1597870056, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99$lambda$98(FajrSettingsState.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 805306416, 496);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i32 = ((432 >> 6) & 112) | 6;
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1213302311, "C306@13045L581,314@13731L11,314@13647L104:FajrSettingsScreen.kt#jcb7bm");
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            Modifier weight$default2 = RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, weight$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i522 = (i42 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                int i622 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -546752604, "C307@13229L11,307@13155L94,308@13274L29,309@13328L276:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(TuneKt.getTune(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier22 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, modifier22);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i722 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i8222 = (i722 >> 6) & 14;
                Composer composer2222 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                int i9222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2222, -1844956710, "C310@13435L11,310@13365L99,311@13493L85:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("طريقة الحساب المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2222, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2222, 3078, 0, 131058);
                TextKt.m2816Text4IGK_g($state.getCalculationMethod().getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2222, 199680, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd(composer2222);
                ComposerKt.sourceInformationMarkerEnd(composer2222);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                TextKt.m2816Text4IGK_g("تغيير", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                ButtonKt.OutlinedButton($onRefresh, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !$state.isRefreshing(), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1597870056, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99$lambda$98(FajrSettingsState.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 805306416, 496);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i5222 = (i42 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            int i6222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -546752604, "C307@13229L11,307@13155L94,308@13274L29,309@13328L276:FajrSettingsScreen.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(TuneKt.getTune(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, modifier222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i7222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i82222 = (i7222 >> 6) & 14;
            Composer composer22222 = composer;
            ComposerKt.sourceInformationMarkerStart(composer22222, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            int i92222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer22222, -1844956710, "C310@13435L11,310@13365L99,311@13493L85:FajrSettingsScreen.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("طريقة الحساب المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer22222, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer22222, 3078, 0, 131058);
            TextKt.m2816Text4IGK_g($state.getCalculationMethod().getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer22222, 199680, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd(composer22222);
            ComposerKt.sourceInformationMarkerEnd(composer22222);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextKt.m2816Text4IGK_g("تغيير", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            ButtonKt.OutlinedButton($onRefresh, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !$state.isRefreshing(), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1597870056, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99$lambda$98(FajrSettingsState.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306416, 496);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$100$lambda$99$lambda$98(FajrSettingsState $state, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1597870056, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:325)");
            }
            if ($state.isRefreshing()) {
                $composer.startReplaceGroup(1024349554);
                ComposerKt.sourceInformation($composer, "326@14143L78,327@14246L28,328@14299L28");
                ProgressIndicatorKt.m2490CircularProgressIndicatorLxG7B9w(SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), 0L, Dp.m7226constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                TextKt.m2816Text4IGK_g("جاري تحديث الموعد...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1024585898);
                ComposerKt.sourceInformation($composer, "330@14381L55,331@14461L28,332@14514L59");
                IconKt.m2273Iconww6aTOc(RefreshKt.getRefresh(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                TextKt.m2816Text4IGK_g("تحديث موعد الفجر الآن", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$107(final Function0 $onTogglePreview, final FajrSettingsState $state, final boolean $isPlayingPreview, final Function0 $onPickSystemRingtone, final Function0 $onPickAudioFile, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C340@14736L2631,340@14694L2673:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2018417504, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:340)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(18)), 0L, ComposableLambdaKt.rememberComposableLambda(-740172843, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106(Function0.this, $state, $isPlayingPreview, $onPickSystemRingtone, $onPickAudioFile, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106(Function0 $onTogglePreview, FajrSettingsState $state, final boolean $isPlayingPreview, Function0 $onPickSystemRingtone, Function0 $onPickAudioFile, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Composer m3828constructorimpl;
        Function0 function02;
        Composer m3828constructorimpl2;
        Function0 function03;
        Composer m3828constructorimpl3;
        int i;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C341@14754L74,342@14845L30,344@14893L1267,367@16178L30,369@16226L1127:FajrSettingsScreen.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740172843, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:341)");
            }
            TextKt.m2816Text4IGK_g("نغمة المنبه والصوت", (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl4.getInserting() && Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i4 = ((438 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 1790507479, "C349@15131L568,357@15758L384,357@15720L422:FajrSettingsScreen.kt#jcb7bm");
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, weight$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer.useNode();
                }
                m3828constructorimpl = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i7 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 30442706, "C350@15320L11,350@15241L99,351@15365L29,352@15419L258:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i8 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function02 = constructor3;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor3;
                        $composer.useNode();
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
                        int i10 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -1267761555, "C353@15520L11,353@15456L93,354@15578L73:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("النغمة المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
                        TextKt.m2816Text4IGK_g($state.getRingtoneTitle(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
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
                        IconButtonKt.IconButton($onTogglePreview, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1895645290, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106$lambda$104$lambda$103($isPlayingPreview, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2);
                        Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        int i11 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                            function03 = constructor4;
                            $composer.createNode(function03);
                        } else {
                            function03 = constructor4;
                            $composer.useNode();
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3828constructorimpl3.getInserting()) {
                            i = currentCompositeKeyHash4;
                            if (Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(i))) {
                                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i12 = (i11 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i13 = ((54 >> 6) & 112) | 6;
                                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart($composer, 268235883, "C373@16399L462,382@16882L453:FajrSettingsScreen.kt#jcb7bm");
                                ButtonKt.OutlinedButton($onPickSystemRingtone, RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.m7672getLambda$1355645662$app(), $composer, 805306368, 500);
                                ButtonKt.OutlinedButton($onPickAudioFile, RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$911125657$app(), $composer, 805306368, 500);
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
                        } else {
                            i = currentCompositeKeyHash4;
                        }
                        m3828constructorimpl3.updateRememberedValue(Integer.valueOf(i));
                        m3828constructorimpl3.apply(Integer.valueOf(i), setCompositeKeyHash4);
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i122 = (i11 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i132 = ((54 >> 6) & 112) | 6;
                        RowScope rowScope22 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer, 268235883, "C373@16399L462,382@16882L453:FajrSettingsScreen.kt#jcb7bm");
                        ButtonKt.OutlinedButton($onPickSystemRingtone, RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.m7672getLambda$1355645662$app(), $composer, 805306368, 500);
                        ButtonKt.OutlinedButton($onPickAudioFile, RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$911125657$app(), $composer, 805306368, 500);
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
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i102 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1267761555, "C353@15520L11,353@15456L93,354@15578L73:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("النغمة المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
                    TextKt.m2816Text4IGK_g($state.getRingtoneTitle(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
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
                    IconButtonKt.IconButton($onTogglePreview, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1895645290, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106$lambda$104$lambda$103($isPlayingPreview, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal m610spacedBy0680j_42 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22);
                    Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    int i112 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(i));
                    m3828constructorimpl3.apply(Integer.valueOf(i), setCompositeKeyHash42);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1222 = (i112 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i1322 = ((54 >> 6) & 112) | 6;
                    RowScope rowScope222 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, 268235883, "C373@16399L462,382@16882L453:FajrSettingsScreen.kt#jcb7bm");
                    ButtonKt.OutlinedButton($onPickSystemRingtone, RowScope.CC.weight$default(rowScope222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.m7672getLambda$1355645662$app(), $composer, 805306368, 500);
                    ButtonKt.OutlinedButton($onPickAudioFile, RowScope.CC.weight$default(rowScope222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$911125657$app(), $composer, 805306368, 500);
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
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i72 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 30442706, "C350@15320L11,350@15241L99,351@15365L29,352@15419L258:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, modifier2);
                Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                int i82 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    int i922 = (i82 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    int i1022 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1267761555, "C353@15520L11,353@15456L93,354@15578L73:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("النغمة المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
                    TextKt.m2816Text4IGK_g($state.getRingtoneTitle(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
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
                    IconButtonKt.IconButton($onTogglePreview, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1895645290, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106$lambda$104$lambda$103($isPlayingPreview, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal m610spacedBy0680j_422 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222);
                    Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1122 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(i));
                    m3828constructorimpl3.apply(Integer.valueOf(i), setCompositeKeyHash422);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    int i12222 = (i1122 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i13222 = ((54 >> 6) & 112) | 6;
                    RowScope rowScope2222 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, 268235883, "C373@16399L462,382@16882L453:FajrSettingsScreen.kt#jcb7bm");
                    ButtonKt.OutlinedButton($onPickSystemRingtone, RowScope.CC.weight$default(rowScope2222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.m7672getLambda$1355645662$app(), $composer, 805306368, 500);
                    ButtonKt.OutlinedButton($onPickAudioFile, RowScope.CC.weight$default(rowScope2222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$911125657$app(), $composer, 805306368, 500);
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
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                int i10222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1267761555, "C353@15520L11,353@15456L93,354@15578L73:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("النغمة المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
                TextKt.m2816Text4IGK_g($state.getRingtoneTitle(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
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
                IconButtonKt.IconButton($onTogglePreview, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1895645290, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106$lambda$104$lambda$103($isPlayingPreview, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal m610spacedBy0680j_4222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2222);
                Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                int i11222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(i));
                m3828constructorimpl3.apply(Integer.valueOf(i), setCompositeKeyHash4222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                int i122222 = (i11222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i132222 = ((54 >> 6) & 112) | 6;
                RowScope rowScope22222 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 268235883, "C373@16399L462,382@16882L453:FajrSettingsScreen.kt#jcb7bm");
                ButtonKt.OutlinedButton($onPickSystemRingtone, RowScope.CC.weight$default(rowScope22222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.m7672getLambda$1355645662$app(), $composer, 805306368, 500);
                ButtonKt.OutlinedButton($onPickAudioFile, RowScope.CC.weight$default(rowScope22222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$911125657$app(), $composer, 805306368, 500);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i42 = ((438 >> 6) & 112) | 6;
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1790507479, "C349@15131L568,357@15758L384,357@15720L422:FajrSettingsScreen.kt#jcb7bm");
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            Modifier weight$default2 = RowScope.CC.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, weight$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i622 = (i52 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                int i722 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 30442706, "C350@15320L11,350@15241L99,351@15365L29,352@15419L258:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier22 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, modifier22);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i822 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i92222 = (i822 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                int i102222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1267761555, "C353@15520L11,353@15456L93,354@15578L73:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("النغمة المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
                TextKt.m2816Text4IGK_g($state.getRingtoneTitle(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
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
                IconButtonKt.IconButton($onTogglePreview, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1895645290, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106$lambda$104$lambda$103($isPlayingPreview, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal m610spacedBy0680j_42222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy32222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22222);
                Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                int i112222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(i));
                m3828constructorimpl3.apply(Integer.valueOf(i), setCompositeKeyHash42222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                int i1222222 = (i112222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i1322222 = ((54 >> 6) & 112) | 6;
                RowScope rowScope222222 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 268235883, "C373@16399L462,382@16882L453:FajrSettingsScreen.kt#jcb7bm");
                ButtonKt.OutlinedButton($onPickSystemRingtone, RowScope.CC.weight$default(rowScope222222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.m7672getLambda$1355645662$app(), $composer, 805306368, 500);
                ButtonKt.OutlinedButton($onPickAudioFile, RowScope.CC.weight$default(rowScope222222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$911125657$app(), $composer, 805306368, 500);
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
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            int i7222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 30442706, "C350@15320L11,350@15241L99,351@15365L29,352@15419L258:FajrSettingsScreen.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, modifier222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i8222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i922222 = (i8222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
            int i1022222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1267761555, "C353@15520L11,353@15456L93,354@15578L73:FajrSettingsScreen.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("النغمة المختارة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
            TextKt.m2816Text4IGK_g($state.getRingtoneTitle(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
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
            IconButtonKt.IconButton($onTogglePreview, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1895645290, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106$lambda$104$lambda$103($isPlayingPreview, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal m610spacedBy0680j_422222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy322222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash422222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222222);
            Function0 constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            int i1122222 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(i));
            m3828constructorimpl3.apply(Integer.valueOf(i), setCompositeKeyHash422222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
            int i12222222 = (i1122222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i13222222 = ((54 >> 6) & 112) | 6;
            RowScope rowScope2222222 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 268235883, "C373@16399L462,382@16882L453:FajrSettingsScreen.kt#jcb7bm");
            ButtonKt.OutlinedButton($onPickSystemRingtone, RowScope.CC.weight$default(rowScope2222222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.m7672getLambda$1355645662$app(), $composer, 805306368, 500);
            ButtonKt.OutlinedButton($onPickAudioFile, RowScope.CC.weight$default(rowScope2222222, Modifier.INSTANCE, 1.0f, false, 2, null), false, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14)), null, null, null, null, null, ComposableSingletons$FajrSettingsScreenKt.INSTANCE.getLambda$911125657$app(), $composer, 805306368, 500);
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
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$107$lambda$106$lambda$104$lambda$103(boolean $isPlayingPreview, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C361@16014L11,358@15784L336:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895645290, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:358)");
            }
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            IconKt.m2273Iconww6aTOc($isPlayingPreview ? StopKt.getStop(outlined) : PlayArrowKt.getPlayArrow(outlined), "Preview", SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(28)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$122(final FajrSettingsState $state, final Function1 $onToggleVibration, final Function1 $onSetVolume, final Function1 $onSetMaxDuration, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C397@17474L2958,397@17432L3000:FajrSettingsScreen.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223513025, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:397)");
            }
            OneUIKt.m7680OneUICarduDo3WH8(null, null, PaddingKt.m723PaddingValues0680j_4(Dp.m7226constructorimpl(18)), 0L, ComposableLambdaKt.rememberComposableLambda(312863924, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121(FajrSettingsState.this, $onToggleVibration, $onSetVolume, $onSetMaxDuration, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x07e9, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0a87 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0912 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x069a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0b17  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121(FajrSettingsState $state, Function1 $onToggleVibration, final Function1 $onSetVolume, final Function1 $onSetMaxDuration, ColumnScope OneUICard, Composer $composer, int $changed) {
        Function0 function0;
        Composer m3828constructorimpl;
        Function0 function02;
        Composer m3828constructorimpl2;
        Function0 function03;
        Composer m3828constructorimpl3;
        Function0 function04;
        Composer m3828constructorimpl4;
        boolean changed;
        float f;
        Function0 function05;
        Composer m3828constructorimpl5;
        Function0 function06;
        Composer m3828constructorimpl6;
        Iterator it;
        int i;
        Intrinsics.checkNotNullParameter(OneUICard, "$this$OneUICard");
        ComposerKt.sourceInformation($composer, "C398@17492L70,399@17579L30,401@17627L791,417@18436L30,419@18484L953,438@19455L30,440@19503L915:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(312863924, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:398)");
            }
            TextKt.m2816Text4IGK_g("إعدادات إضافية", (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl7 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl7, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl7, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl7.getInserting() && Intrinsics.areEqual(m3828constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl7, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i4 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1927278860, "C406@17865L360,411@18246L154:FajrSettingsScreen.kt#jcb7bm");
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer.useNode();
                }
                m3828constructorimpl = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i7 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 607632963, "C407@18022L11,407@17943L99,408@18067L29,409@18121L82:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(VibrationKt.getVibration(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                    TextKt.m2816Text4IGK_g("الاهتزاز أثناء التنبيه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    OneUIKt.OneUISwitch($state.isVibrationEnabled(), $onToggleVibration, null, $composer, 0, 4);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier2 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier2);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i8 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                        function02 = constructor3;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor3;
                        $composer.useNode();
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
                        int i10 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -122784753, "C420@18513L679,433@19322L27,431@19213L206:FajrSettingsScreen.kt#jcb7bm");
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2);
                        Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        int i11 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                            function03 = constructor4;
                            $composer.createNode(function03);
                        } else {
                            function03 = constructor4;
                            $composer.useNode();
                        }
                        m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl3.getInserting() && Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            int i12 = (i11 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            int i13 = ((54 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier modifier3 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifier3);
                            Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            int i14 = ((((384 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                                function04 = constructor5;
                                $composer.createNode(function04);
                            } else {
                                function04 = constructor5;
                                $composer.useNode();
                            }
                            m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl4.getInserting() && Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                int i15 = (i14 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                int i16 = ((384 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                                IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                                TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                float alarmVolume = $state.getAlarmVolume();
                                ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                                changed = $composer.changed($onSetVolume);
                                Object rememberedValue = $composer.rememberedValue();
                                if (changed) {
                                    f = alarmVolume;
                                } else {
                                    f = alarmVolume;
                                }
                                Object obj = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj2).floatValue());
                                    }
                                };
                                $composer.updateRememberedValue(obj);
                                rememberedValue = obj;
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                SliderKt.Slider(f, (Function1) rememberedValue, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                $composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                ComposerKt.sourceInformationMarkerEnd($composer);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier modifier4 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier($composer, modifier4);
                                Function0 constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                int i17 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                    function05 = constructor6;
                                    $composer.createNode(function05);
                                } else {
                                    function05 = constructor6;
                                    $composer.useNode();
                                }
                                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl5.getInserting() && Intrinsics.areEqual(m3828constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i18 = (i17 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    int i19 = ((0 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                                    TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                                    Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = $composer.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default3);
                                    Function0 constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i20 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!($composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer.startReusableNode();
                                    if (!$composer.getInserting()) {
                                        function06 = constructor7;
                                        $composer.createNode(function06);
                                    } else {
                                        function06 = constructor7;
                                        $composer.useNode();
                                    }
                                    m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                    Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3828constructorimpl6.getInserting() && Intrinsics.areEqual(m3828constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i21 = (i20 >> 6) & 14;
                                        int i22 = 0;
                                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                        int i23 = ((54 >> 6) & 112) | 6;
                                        RowScope rowScope = RowScopeInstance.INSTANCE;
                                        RowScope rowScope2 = null;
                                        ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                                        $composer.startReplaceGroup(-1063712266);
                                        ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                                        Iterable listOf = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                                        int i24 = 0;
                                        it = listOf.iterator();
                                        while (it.hasNext()) {
                                            Iterable iterable = listOf;
                                            final int intValue = ((Number) it.next()).intValue();
                                            int i25 = i24;
                                            boolean z = $state.getMaxDurationMinutes() == intValue;
                                            RowScope rowScope3 = rowScope2;
                                            ComposerKt.sourceInformationMarkerStart($composer, -1908965737, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                                            boolean changed2 = $composer.changed($onSetMaxDuration) | $composer.changed(intValue);
                                            Object rememberedValue2 = $composer.rememberedValue();
                                            if (changed2) {
                                                i = i22;
                                            } else {
                                                i = i22;
                                                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                                    ChipKt.FilterChip(z, (Function0) rememberedValue2, ComposableLambdaKt.rememberComposableLambda(1633580944, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda38
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj2, Object obj3) {
                                                            return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$120$lambda$119$lambda$118$lambda$117(intValue, (Composer) obj2, ((Integer) obj3).intValue());
                                                        }
                                                    }, $composer, 54), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, null, $composer, 384, 0, 4080);
                                                    listOf = iterable;
                                                    i24 = i25;
                                                    rowScope2 = rowScope3;
                                                    i22 = i;
                                                }
                                            }
                                            rememberedValue2 = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda37
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$120$lambda$119$lambda$118$lambda$116$lambda$115(Function1.this, intValue);
                                                }
                                            };
                                            $composer.updateRememberedValue(rememberedValue2);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ChipKt.FilterChip(z, (Function0) rememberedValue2, ComposableLambdaKt.rememberComposableLambda(1633580944, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda38
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$120$lambda$119$lambda$118$lambda$117(intValue, (Composer) obj2, ((Integer) obj3).intValue());
                                                }
                                            }, $composer, 54), RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, null, $composer, 384, 0, 4080);
                                            listOf = iterable;
                                            i24 = i25;
                                            rowScope2 = rowScope3;
                                            i22 = i;
                                        }
                                        $composer.endReplaceGroup();
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
                                    m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                    m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i212 = (i20 >> 6) & 14;
                                    int i222 = 0;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    int i232 = ((54 >> 6) & 112) | 6;
                                    RowScope rowScope4 = RowScopeInstance.INSTANCE;
                                    RowScope rowScope22 = null;
                                    ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                                    $composer.startReplaceGroup(-1063712266);
                                    ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                                    Iterable listOf2 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                                    int i242 = 0;
                                    it = listOf2.iterator();
                                    while (it.hasNext()) {
                                    }
                                    $composer.endReplaceGroup();
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
                                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                int i182 = (i17 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                                int i192 = ((0 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                                TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                                Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal m610spacedBy0680j_42 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy52 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash72 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap72 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier72 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default32);
                                Function0 constructor72 = ComposeUiNode.INSTANCE.getConstructor();
                                int i202 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                }
                                m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl6.getInserting()) {
                                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i2122 = (i202 >> 6) & 14;
                                    int i2222 = 0;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    int i2322 = ((54 >> 6) & 112) | 6;
                                    RowScope rowScope42 = RowScopeInstance.INSTANCE;
                                    RowScope rowScope222 = null;
                                    ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                                    $composer.startReplaceGroup(-1063712266);
                                    ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                                    Iterable listOf22 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                                    int i2422 = 0;
                                    it = listOf22.iterator();
                                    while (it.hasNext()) {
                                    }
                                    $composer.endReplaceGroup();
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
                                m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72));
                                m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72), setCompositeKeyHash72);
                                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                                int i21222 = (i202 >> 6) & 14;
                                int i22222 = 0;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i23222 = ((54 >> 6) & 112) | 6;
                                RowScope rowScope422 = RowScopeInstance.INSTANCE;
                                RowScope rowScope2222 = null;
                                ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                                $composer.startReplaceGroup(-1063712266);
                                ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                                Iterable listOf222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                                int i24222 = 0;
                                it = listOf222.iterator();
                                while (it.hasNext()) {
                                }
                                $composer.endReplaceGroup();
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
                            int i152 = (i14 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance42 = RowScopeInstance.INSTANCE;
                            int i162 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                            IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                            TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            float alarmVolume2 = $state.getAlarmVolume();
                            ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                            changed = $composer.changed($onSetVolume);
                            Object rememberedValue3 = $composer.rememberedValue();
                            if (changed) {
                            }
                            Object obj2 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj22) {
                                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj22).floatValue());
                                }
                            };
                            $composer.updateRememberedValue(obj2);
                            rememberedValue3 = obj2;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SliderKt.Slider(f, (Function1) rememberedValue3, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier42 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash62 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap62 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier($composer, modifier42);
                            Function0 constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                            int i172 = ((((0 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl5.getInserting()) {
                                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                                int i1822 = (i172 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                                int i1922 = ((0 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                                TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                                Modifier fillMaxWidth$default322 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal m610spacedBy0680j_422 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy522 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash722 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                CompositionLocalMap currentCompositionLocalMap722 = $composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier722 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default322);
                                Function0 constructor722 = ComposeUiNode.INSTANCE.getConstructor();
                                int i2022 = ((((54 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!($composer.getApplier() instanceof Applier)) {
                                }
                                $composer.startReusableNode();
                                if (!$composer.getInserting()) {
                                }
                                m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                                Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3828constructorimpl6.getInserting()) {
                                }
                                m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722));
                                m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722), setCompositeKeyHash722);
                                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
                                int i212222 = (i2022 >> 6) & 14;
                                int i222222 = 0;
                                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i232222 = ((54 >> 6) & 112) | 6;
                                RowScope rowScope4222 = RowScopeInstance.INSTANCE;
                                RowScope rowScope22222 = null;
                                ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                                $composer.startReplaceGroup(-1063712266);
                                ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                                Iterable listOf2222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                                int i242222 = 0;
                                it = listOf2222.iterator();
                                while (it.hasNext()) {
                                }
                                $composer.endReplaceGroup();
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
                            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash62));
                            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash62), setCompositeKeyHash62);
                            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                            int i18222 = (i172 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                            int i19222 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                            Modifier fillMaxWidth$default3222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal m610spacedBy0680j_4222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy5222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash7222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap7222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier7222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default3222);
                            Function0 constructor7222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i20222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy5222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash7222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl6.getInserting()) {
                            }
                            m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222));
                            m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7222), setCompositeKeyHash7222);
                            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i2122222 = (i20222 >> 6) & 14;
                            int i2222222 = 0;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i2322222 = ((54 >> 6) & 112) | 6;
                            RowScope rowScope42222 = RowScopeInstance.INSTANCE;
                            RowScope rowScope222222 = null;
                            ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                            $composer.startReplaceGroup(-1063712266);
                            ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                            Iterable listOf22222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                            int i2422222 = 0;
                            it = listOf22222.iterator();
                            while (it.hasNext()) {
                            }
                            $composer.endReplaceGroup();
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
                        int i122 = (i11 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                        int i132 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
                        Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier32 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash52 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap52 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier52 = ComposedModifierKt.materializeModifier($composer, modifier32);
                        Function0 constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                        int i142 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl4 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl4, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl4.getInserting()) {
                            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1522 = (i142 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance422 = RowScopeInstance.INSTANCE;
                            int i1622 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                            IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                            TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            float alarmVolume22 = $state.getAlarmVolume();
                            ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                            changed = $composer.changed($onSetVolume);
                            Object rememberedValue32 = $composer.rememberedValue();
                            if (changed) {
                            }
                            Object obj22 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj222) {
                                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj222).floatValue());
                                }
                            };
                            $composer.updateRememberedValue(obj22);
                            rememberedValue32 = obj22;
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SliderKt.Slider(f, (Function1) rememberedValue32, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier modifier422 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash622 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap622 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier622 = ComposedModifierKt.materializeModifier($composer, modifier422);
                            Function0 constructor622 = ComposeUiNode.INSTANCE.getConstructor();
                            int i1722 = ((((0 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl5.getInserting()) {
                            }
                            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash622));
                            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash622), setCompositeKeyHash622);
                            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
                            int i182222 = (i1722 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                            int i192222 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                            Modifier fillMaxWidth$default32222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal m610spacedBy0680j_42222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy52222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash72222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                            CompositionLocalMap currentCompositionLocalMap72222 = $composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier72222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default32222);
                            Function0 constructor72222 = ComposeUiNode.INSTANCE.getConstructor();
                            int i202222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!($composer.getApplier() instanceof Applier)) {
                            }
                            $composer.startReusableNode();
                            if (!$composer.getInserting()) {
                            }
                            m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                            Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy52222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash72222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl6.getInserting()) {
                            }
                            m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222));
                            m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72222), setCompositeKeyHash72222);
                            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72222, ComposeUiNode.INSTANCE.getSetModifier());
                            int i21222222 = (i202222 >> 6) & 14;
                            int i22222222 = 0;
                            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            int i23222222 = ((54 >> 6) & 112) | 6;
                            RowScope rowScope422222 = RowScopeInstance.INSTANCE;
                            RowScope rowScope2222222 = null;
                            ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                            $composer.startReplaceGroup(-1063712266);
                            ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                            Iterable listOf222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                            int i24222222 = 0;
                            it = listOf222222.iterator();
                            while (it.hasNext()) {
                            }
                            $composer.endReplaceGroup();
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
                        int i15222 = (i142 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance4222 = RowScopeInstance.INSTANCE;
                        int i16222 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                        IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                        TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        float alarmVolume222 = $state.getAlarmVolume();
                        ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                        changed = $composer.changed($onSetVolume);
                        Object rememberedValue322 = $composer.rememberedValue();
                        if (changed) {
                        }
                        Object obj222 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2222) {
                                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj2222).floatValue());
                            }
                        };
                        $composer.updateRememberedValue(obj222);
                        rememberedValue322 = obj222;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SliderKt.Slider(f, (Function1) rememberedValue322, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier4222 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash6222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap6222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6222 = ComposedModifierKt.materializeModifier($composer, modifier4222);
                        Function0 constructor6222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i17222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash6222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl5.getInserting()) {
                        }
                        m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6222));
                        m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6222), setCompositeKeyHash6222);
                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1822222 = (i17222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                        int i1922222 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                        Modifier fillMaxWidth$default322222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal m610spacedBy0680j_422222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy522222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash722222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap722222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier722222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default322222);
                        Function0 constructor722222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i2022222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy522222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash722222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl6.getInserting()) {
                        }
                        m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222));
                        m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722222), setCompositeKeyHash722222);
                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i212222222 = (i2022222 >> 6) & 14;
                        int i222222222 = 0;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i232222222 = ((54 >> 6) & 112) | 6;
                        RowScope rowScope4222222 = RowScopeInstance.INSTANCE;
                        RowScope rowScope22222222 = null;
                        ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                        $composer.startReplaceGroup(-1063712266);
                        ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                        Iterable listOf2222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                        int i242222222 = 0;
                        it = listOf2222222.iterator();
                        while (it.hasNext()) {
                        }
                        $composer.endReplaceGroup();
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
                    int i92 = (i8 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    int i102 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -122784753, "C420@18513L679,433@19322L27,431@19213L206:FajrSettingsScreen.kt#jcb7bm");
                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(spaceBetween22, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22);
                    Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    int i112 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl3.getInserting()) {
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        int i1222 = (i112 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
                        int i1322 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
                        Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier322 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy422 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash522 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap522 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier($composer, modifier322);
                        Function0 constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                        int i1422 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
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
                        int i152222 = (i1422 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance42222 = RowScopeInstance.INSTANCE;
                        int i162222 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                        IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                        SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                        TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        float alarmVolume2222 = $state.getAlarmVolume();
                        ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                        changed = $composer.changed($onSetVolume);
                        Object rememberedValue3222 = $composer.rememberedValue();
                        if (changed) {
                        }
                        Object obj2222 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj22222) {
                                return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj22222).floatValue());
                            }
                        };
                        $composer.updateRememberedValue(obj2222);
                        rememberedValue3222 = obj2222;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SliderKt.Slider(f, (Function1) rememberedValue3222, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier42222 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash62222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap62222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier62222 = ComposedModifierKt.materializeModifier($composer, modifier42222);
                        Function0 constructor62222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i172222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap62222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash62222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl5.getInserting()) {
                        }
                        m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash62222));
                        m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash62222), setCompositeKeyHash62222);
                        Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i18222222 = (i172222 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
                        int i19222222 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                        Modifier fillMaxWidth$default3222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.Horizontal m610spacedBy0680j_4222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy5222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash7222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap7222222 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier7222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default3222222);
                        Function0 constructor7222222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i20222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                        }
                        $composer.startReusableNode();
                        if (!$composer.getInserting()) {
                        }
                        m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                        Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy5222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash7222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl6.getInserting()) {
                        }
                        m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222222));
                        m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7222222), setCompositeKeyHash7222222);
                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7222222, ComposeUiNode.INSTANCE.getSetModifier());
                        int i2122222222 = (i20222222 >> 6) & 14;
                        int i2222222222 = 0;
                        ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i2322222222 = ((54 >> 6) & 112) | 6;
                        RowScope rowScope42222222 = RowScopeInstance.INSTANCE;
                        RowScope rowScope222222222 = null;
                        ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                        $composer.startReplaceGroup(-1063712266);
                        ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                        Iterable listOf22222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                        int i2422222222 = 0;
                        it = listOf22222222.iterator();
                        while (it.hasNext()) {
                        }
                        $composer.endReplaceGroup();
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
                    int i12222 = (i112 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3222 = RowScopeInstance.INSTANCE;
                    int i13222 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
                    Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier modifier3222 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy4222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash5222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap5222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier($composer, modifier3222);
                    Function0 constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i14222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
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
                    int i1522222 = (i14222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance422222 = RowScopeInstance.INSTANCE;
                    int i1622222 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                    TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    float alarmVolume22222 = $state.getAlarmVolume();
                    ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                    changed = $composer.changed($onSetVolume);
                    Object rememberedValue32222 = $composer.rememberedValue();
                    if (changed) {
                    }
                    Object obj22222 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj222222) {
                            return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj222222).floatValue());
                        }
                    };
                    $composer.updateRememberedValue(obj22222);
                    rememberedValue32222 = obj22222;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SliderKt.Slider(f, (Function1) rememberedValue32222, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier422222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash622222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap622222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier622222 = ComposedModifierKt.materializeModifier($composer, modifier422222);
                    Function0 constructor622222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1722222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap622222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash622222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl5.getInserting()) {
                    }
                    m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash622222));
                    m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash622222), setCompositeKeyHash622222);
                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier622222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i182222222 = (i1722222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22222222 = ColumnScopeInstance.INSTANCE;
                    int i192222222 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                    Modifier fillMaxWidth$default32222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal m610spacedBy0680j_42222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy52222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash72222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap72222222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier72222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default32222222);
                    Function0 constructor72222222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i202222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy52222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash72222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl6.getInserting()) {
                    }
                    m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222222));
                    m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72222222), setCompositeKeyHash72222222);
                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72222222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i21222222222 = (i202222222 >> 6) & 14;
                    int i22222222222 = 0;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i23222222222 = ((54 >> 6) & 112) | 6;
                    RowScope rowScope422222222 = RowScopeInstance.INSTANCE;
                    RowScope rowScope2222222222 = null;
                    ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                    $composer.startReplaceGroup(-1063712266);
                    ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                    Iterable listOf222222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                    int i24222222222 = 0;
                    it = listOf222222222.iterator();
                    while (it.hasNext()) {
                    }
                    $composer.endReplaceGroup();
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
                int i62 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                int i72 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 607632963, "C407@18022L11,407@17943L99,408@18067L29,409@18121L82:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(VibrationKt.getVibration(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                TextKt.m2816Text4IGK_g("الاهتزاز أثناء التنبيه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                OneUIKt.OneUISwitch($state.isVibrationEnabled(), $onToggleVibration, null, $composer, 0, 4);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier22 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, modifier22);
                Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                int i82 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
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
                    int i1022 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -122784753, "C420@18513L679,433@19322L27,431@19213L206:FajrSettingsScreen.kt#jcb7bm");
                    Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(spaceBetween222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222);
                    Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1122 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
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
                    int i122222 = (i1122 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance32222 = RowScopeInstance.INSTANCE;
                    int i132222 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
                    Alignment.Vertical centerVertically32222 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier modifier32222 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy42222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash52222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap52222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier($composer, modifier32222);
                    Function0 constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i142222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
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
                    int i15222222 = (i142222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance4222222 = RowScopeInstance.INSTANCE;
                    int i16222222 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                    TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    float alarmVolume222222 = $state.getAlarmVolume();
                    ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                    changed = $composer.changed($onSetVolume);
                    Object rememberedValue322222 = $composer.rememberedValue();
                    if (changed) {
                    }
                    Object obj222222 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2222222) {
                            return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj2222222).floatValue());
                        }
                    };
                    $composer.updateRememberedValue(obj222222);
                    rememberedValue322222 = obj222222;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SliderKt.Slider(f, (Function1) rememberedValue322222, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier4222222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash6222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap6222222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6222222 = ComposedModifierKt.materializeModifier($composer, modifier4222222);
                    Function0 constructor6222222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i17222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash6222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl5.getInserting()) {
                    }
                    m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6222222));
                    m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6222222), setCompositeKeyHash6222222);
                    Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6222222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1822222222 = (i17222222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222222222 = ColumnScopeInstance.INSTANCE;
                    int i1922222222 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                    Modifier fillMaxWidth$default322222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal m610spacedBy0680j_422222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy522222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash722222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap722222222 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier722222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default322222222);
                    Function0 constructor722222222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i2022222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if (!$composer.getInserting()) {
                    }
                    m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy522222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash722222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl6.getInserting()) {
                    }
                    m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222222));
                    m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722222222), setCompositeKeyHash722222222);
                    Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722222222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i212222222222 = (i2022222222 >> 6) & 14;
                    int i222222222222 = 0;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i232222222222 = ((54 >> 6) & 112) | 6;
                    RowScope rowScope4222222222 = RowScopeInstance.INSTANCE;
                    RowScope rowScope22222222222 = null;
                    ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                    $composer.startReplaceGroup(-1063712266);
                    ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                    Iterable listOf2222222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                    int i242222222222 = 0;
                    it = listOf2222222222.iterator();
                    while (it.hasNext()) {
                    }
                    $composer.endReplaceGroup();
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
                int i9222 = (i82 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
                int i10222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -122784753, "C420@18513L679,433@19322L27,431@19213L206:FajrSettingsScreen.kt#jcb7bm");
                Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal spaceBetween2222 = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(spaceBetween2222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default2222);
                Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                int i11222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
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
                int i1222222 = (i11222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance322222 = RowScopeInstance.INSTANCE;
                int i1322222 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
                Alignment.Vertical centerVertically322222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier322222 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy422222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash522222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap522222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier522222 = ComposedModifierKt.materializeModifier($composer, modifier322222);
                Function0 constructor522222 = ComposeUiNode.INSTANCE.getConstructor();
                int i1422222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
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
                int i152222222 = (i1422222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance42222222 = RowScopeInstance.INSTANCE;
                int i162222222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                float alarmVolume2222222 = $state.getAlarmVolume();
                ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                changed = $composer.changed($onSetVolume);
                Object rememberedValue3222222 = $composer.rememberedValue();
                if (changed) {
                }
                Object obj2222222 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22222222) {
                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj22222222).floatValue());
                    }
                };
                $composer.updateRememberedValue(obj2222222);
                rememberedValue3222222 = obj2222222;
                ComposerKt.sourceInformationMarkerEnd($composer);
                SliderKt.Slider(f, (Function1) rememberedValue3222222, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier42222222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy22222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash62222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap62222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier62222222 = ComposedModifierKt.materializeModifier($composer, modifier42222222);
                Function0 constructor62222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i172222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap62222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash62222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl5.getInserting()) {
                }
                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash62222222));
                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash62222222), setCompositeKeyHash62222222);
                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier62222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i18222222222 = (i172222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222222222 = ColumnScopeInstance.INSTANCE;
                int i19222222222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                Modifier fillMaxWidth$default3222222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal m610spacedBy0680j_4222222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy5222222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_4222222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash7222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap7222222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier7222222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default3222222222);
                Function0 constructor7222222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i20222222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy5222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap7222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash7222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl6.getInserting()) {
                }
                m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7222222222));
                m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash7222222222), setCompositeKeyHash7222222222);
                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier7222222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i2122222222222 = (i20222222222 >> 6) & 14;
                int i2222222222222 = 0;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i2322222222222 = ((54 >> 6) & 112) | 6;
                RowScope rowScope42222222222 = RowScopeInstance.INSTANCE;
                RowScope rowScope222222222222 = null;
                ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                $composer.startReplaceGroup(-1063712266);
                ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                Iterable listOf22222222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                int i2422222222222 = 0;
                it = listOf22222222222.iterator();
                while (it.hasNext()) {
                }
                $composer.endReplaceGroup();
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
            m3828constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl7, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
            int i42 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1927278860, "C406@17865L360,411@18246L154:FajrSettingsScreen.kt#jcb7bm");
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier5 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, modifier5);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i622 = (i52 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                int i722 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 607632963, "C407@18022L11,407@17943L99,408@18067L29,409@18121L82:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(VibrationKt.getVibration(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                TextKt.m2816Text4IGK_g("الاهتزاز أثناء التنبيه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                OneUIKt.OneUISwitch($state.isVibrationEnabled(), $onToggleVibration, null, $composer, 0, 4);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, modifier222);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i822 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
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
                int i102222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -122784753, "C420@18513L679,433@19322L27,431@19213L206:FajrSettingsScreen.kt#jcb7bm");
                Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal spaceBetween22222 = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy32222 = RowKt.rowMeasurePolicy(spaceBetween22222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default22222);
                Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                int i112222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
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
                int i12222222 = (i112222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3222222 = RowScopeInstance.INSTANCE;
                int i13222222 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
                Alignment.Vertical centerVertically3222222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier3222222 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy4222222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap5222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5222222 = ComposedModifierKt.materializeModifier($composer, modifier3222222);
                Function0 constructor5222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i14222222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
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
                int i1522222222 = (i14222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance422222222 = RowScopeInstance.INSTANCE;
                int i1622222222 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
                IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
                SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
                TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                float alarmVolume22222222 = $state.getAlarmVolume();
                ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                changed = $composer.changed($onSetVolume);
                Object rememberedValue32222222 = $composer.rememberedValue();
                if (changed) {
                }
                Object obj22222222 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj222222222) {
                        return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj222222222).floatValue());
                    }
                };
                $composer.updateRememberedValue(obj22222222);
                rememberedValue32222222 = obj22222222;
                ComposerKt.sourceInformationMarkerEnd($composer);
                SliderKt.Slider(f, (Function1) rememberedValue32222222, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier422222222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash622222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap622222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier622222222 = ComposedModifierKt.materializeModifier($composer, modifier422222222);
                Function0 constructor622222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i1722222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap622222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash622222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl5.getInserting()) {
                }
                m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash622222222));
                m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash622222222), setCompositeKeyHash622222222);
                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier622222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i182222222222 = (i1722222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222222222 = ColumnScopeInstance.INSTANCE;
                int i192222222222 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
                Modifier fillMaxWidth$default32222222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal m610spacedBy0680j_42222222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy52222222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_42222222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash72222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap72222222222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier72222222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default32222222222);
                Function0 constructor72222222222 = ComposeUiNode.INSTANCE.getConstructor();
                int i202222222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if (!$composer.getInserting()) {
                }
                m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy52222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap72222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash72222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl6.getInserting()) {
                }
                m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash72222222222));
                m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash72222222222), setCompositeKeyHash72222222222);
                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier72222222222, ComposeUiNode.INSTANCE.getSetModifier());
                int i21222222222222 = (i202222222222 >> 6) & 14;
                int i22222222222222 = 0;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i23222222222222 = ((54 >> 6) & 112) | 6;
                RowScope rowScope422222222222 = RowScopeInstance.INSTANCE;
                RowScope rowScope2222222222222 = null;
                ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
                $composer.startReplaceGroup(-1063712266);
                ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
                Iterable listOf222222222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
                int i24222222222222 = 0;
                it = listOf222222222222.iterator();
                while (it.hasNext()) {
                }
                $composer.endReplaceGroup();
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
            int i6222 = (i52 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
            int i7222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 607632963, "C407@18022L11,407@17943L99,408@18067L29,409@18121L82:FajrSettingsScreen.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(VibrationKt.getVibration(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
            TextKt.m2816Text4IGK_g("الاهتزاز أثناء التنبيه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUISwitch($state.isVibrationEnabled(), $onToggleVibration, null, $composer, 0, 4);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, modifier2222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i8222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
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
            int i1022222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -122784753, "C420@18513L679,433@19322L27,431@19213L206:FajrSettingsScreen.kt#jcb7bm");
            Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween222222 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy322222 = RowKt.rowMeasurePolicy(spaceBetween222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash422222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default222222);
            Function0 constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            int i1122222 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
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
            int i122222222 = (i1122222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance32222222 = RowScopeInstance.INSTANCE;
            int i132222222 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -27276546, "C424@18699L369,429@19093L77:FajrSettingsScreen.kt#jcb7bm");
            Alignment.Vertical centerVertically32222222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier32222222 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy42222222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32222222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash52222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap52222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier52222222 = ComposedModifierKt.materializeModifier($composer, modifier32222222);
            Function0 constructor52222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i142222222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
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
            int i15222222222 = (i142222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance4222222222 = RowScopeInstance.INSTANCE;
            int i16222222222 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1170969556, "C425@18859L11,425@18781L98,426@18908L29,427@18966L76:FajrSettingsScreen.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(VolumeUpKt.getVolumeUp(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer, 6);
            TextKt.m2816Text4IGK_g("مستوى صوت المنبه", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextKt.m2816Text4IGK_g($state.getAlarmVolume() + "%", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            float alarmVolume222222222 = $state.getAlarmVolume();
            ComposerKt.sourceInformationMarkerStart($composer, -1527956443, "CC(remember):FajrSettingsScreen.kt#9igjgp");
            changed = $composer.changed($onSetVolume);
            Object rememberedValue322222222 = $composer.rememberedValue();
            if (changed) {
            }
            Object obj222222222 = new Function1() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2222222222) {
                    return FajrSettingsScreenKt.FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1.this, ((Float) obj2222222222).floatValue());
                }
            };
            $composer.updateRememberedValue(obj222222222);
            rememberedValue322222222 = obj222222222;
            ComposerKt.sourceInformationMarkerEnd($composer);
            SliderKt.Slider(f, (Function1) rememberedValue322222222, null, false, RangesKt.rangeTo(10.0f, 100.0f), 0, null, null, null, $composer, 0, 492);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier4222222222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap6222222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier6222222222 = ComposedModifierKt.materializeModifier($composer, modifier4222222222);
            Function0 constructor6222222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i17222222222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap6222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl5.getInserting()) {
            }
            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6222222222));
            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash6222222222), setCompositeKeyHash6222222222);
            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier6222222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i1822222222222 = (i17222222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222222222 = ColumnScopeInstance.INSTANCE;
            int i1922222222222 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -213573730, "C441@19532L70,442@19623L29,443@19673L727:FajrSettingsScreen.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("مدة الغفوة", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
            Modifier fillMaxWidth$default322222222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal m610spacedBy0680j_422222222222 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy522222222222 = RowKt.rowMeasurePolicy(m610spacedBy0680j_422222222222, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash722222222222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap722222222222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier722222222222 = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default322222222222);
            Function0 constructor722222222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i2022222222222 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if (!$composer.getInserting()) {
            }
            m3828constructorimpl6 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl6, rowMeasurePolicy522222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap722222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash722222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl6.getInserting()) {
            }
            m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash722222222222));
            m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash722222222222), setCompositeKeyHash722222222222);
            Updater.m3835setimpl(m3828constructorimpl6, materializeModifier722222222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i212222222222222 = (i2022222222222 >> 6) & 14;
            int i222222222222222 = 0;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i232222222222222 = ((54 >> 6) & 112) | 6;
            RowScope rowScope4222222222222 = RowScopeInstance.INSTANCE;
            RowScope rowScope22222222222222 = null;
            ComposerKt.sourceInformationMarkerStart($composer, 1384638905, "C:FajrSettingsScreen.kt#jcb7bm");
            $composer.startReplaceGroup(-1063712266);
            ComposerKt.sourceInformation($composer, "*450@20058L26,451@20126L132,448@19927L425");
            Iterable listOf2222222222222 = CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 5, 10});
            int i242222222222222 = 0;
            it = listOf2222222222222.iterator();
            while (it.hasNext()) {
            }
            $composer.endReplaceGroup();
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$114$lambda$113$lambda$112(Function1 $onSetVolume, float it) {
        $onSetVolume.invoke(Integer.valueOf((int) it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$120$lambda$119$lambda$118$lambda$116$lambda$115(Function1 $onSetMaxDuration, int $mins) {
        $onSetMaxDuration.invoke(Integer.valueOf($mins));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FajrSettingsContent$lambda$124$lambda$123$lambda$122$lambda$121$lambda$120$lambda$119$lambda$118$lambda$117(int $mins, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C451@20128L128:FajrSettingsScreen.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1633580944, $changed, -1, "com.example.fajr.ui.FajrSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FajrSettingsScreen.kt:451)");
            }
            TextKt.m2816Text4IGK_g($mins + " (د)", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 3072, 122364);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LocationOptionRow(final boolean selected, final ImageVector icon, final String title, final String subtitle, final Function0<Unit> function0, Composer $composer, final int $changed) {
        ImageVector imageVector;
        Function0<Unit> function02;
        long m4524getTransparent0d7_KjU;
        Alignment.Vertical vertical;
        Function0 function03;
        Composer m3828constructorimpl;
        int i;
        long m4487copywmQWz5c;
        Composer $composer2 = $composer.startRestartGroup(-1026309192);
        ComposerKt.sourceInformation($composer2, "C(LocationOptionRow)N(selected,icon,title,subtitle,onClick)470@20614L830:FajrSettingsScreen.kt#jcb7bm");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(selected) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            imageVector = icon;
            $dirty |= $composer2.changed(imageVector) ? 32 : 16;
        } else {
            imageVector = icon;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(title) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(subtitle) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if ($composer2.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1026309192, $dirty, -1, "com.example.fajr.ui.LocationOptionRow (FajrSettingsScreen.kt:469)");
            }
            Modifier m264clickableXHw0xAI$default = ClickableKt.m264clickableXHw0xAI$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(14))), false, null, null, function02, 7, null);
            if (selected) {
                $composer2.startReplaceGroup(1559357355);
                ComposerKt.sourceInformation($composer2, "476@20831L11");
                m4487copywmQWz5c = Color.m4487copywmQWz5c(r22, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r22) : 0.12f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r22) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r22) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary()) : 0.0f);
                $composer2.endReplaceGroup();
                m4524getTransparent0d7_KjU = m4487copywmQWz5c;
            } else {
                $composer2.startReplaceGroup(1559358851);
                $composer2.endReplaceGroup();
                m4524getTransparent0d7_KjU = Color.INSTANCE.m4524getTransparent0d7_KjU();
            }
            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(m264clickableXHw0xAI$default, m4524getTransparent0d7_KjU, null, 2, null), Dp.m7226constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer2, m730padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
            int $dirty2 = $dirty;
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
            if (m3828constructorimpl2.getInserting()) {
                vertical = centerVertically;
            } else {
                vertical = centerVertically;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i4 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer2, -1776265399, "C482@21024L51,483@21084L28,484@21180L11,484@21121L79,485@21209L29,486@21247L191:FajrSettingsScreen.kt#jcb7bm");
                    RadioButtonKt.RadioButton(selected, function0, null, false, null, null, $composer2, (($dirty2 >> 9) & 112) | ($dirty2 & 14), 60);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer2, 6);
                    IconKt.m2273Iconww6aTOc(imageVector, (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), $composer2, (($dirty2 >> 3) & 14) | 48, 4);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer2, 6);
                    ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifier);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer2.startReusableNode();
                    if (!$composer2.getInserting()) {
                        function03 = constructor2;
                        $composer2.createNode(function03);
                    } else {
                        function03 = constructor2;
                        $composer2.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer2);
                    Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        i = i5;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i7 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer2, -966473391, "C487@21268L63,488@21399L11,488@21344L84:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 6) & 14) | 199680, 0, 131030);
                            TextKt.m2816Text4IGK_g(subtitle, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 9) & 14) | 3072, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            $composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
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
                        i = i5;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i62 = (i >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i72 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer2, -966473391, "C487@21268L63,488@21399L11,488@21344L84:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 6) & 14) | 199680, 0, 131030);
                    TextKt.m2816Text4IGK_g(subtitle, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 9) & 14) | 3072, 0, 131058);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i42 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1776265399, "C482@21024L51,483@21084L28,484@21180L11,484@21121L79,485@21209L29,486@21247L191:FajrSettingsScreen.kt#jcb7bm");
            RadioButtonKt.RadioButton(selected, function0, null, false, null, null, $composer2, (($dirty2 >> 9) & 112) | ($dirty2 & 14), 60);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer2, 6);
            IconKt.m2273Iconww6aTOc(imageVector, (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), $composer2, (($dirty2 >> 3) & 14) | 48, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(10)), $composer2, 6);
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer2, modifier2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
            }
            $composer2.startReusableNode();
            if (!$composer2.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer2);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i622 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            int i722 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -966473391, "C487@21268L63,488@21399L11,488@21344L84:FajrSettingsScreen.kt#jcb7bm");
            TextKt.m2816Text4IGK_g(title, (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 6) & 14) | 199680, 0, 131030);
            TextKt.m2816Text4IGK_g(subtitle, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 9) & 14) | 3072, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
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
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FajrSettingsScreenKt.LocationOptionRow$lambda$128(selected, icon, title, subtitle, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FajrHeader(final String nextFajrTimeFormatted, final boolean isAlarmEnabled, String cityName, Composer $composer, final int $changed) {
        final String str;
        Composer $composer2;
        int i;
        Composer m3828constructorimpl;
        MeasurePolicy measurePolicy;
        CompositionLocalMap compositionLocalMap;
        Intrinsics.checkNotNullParameter(nextFajrTimeFormatted, "nextFajrTimeFormatted");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Composer $composer3 = $composer.startRestartGroup(695755678);
        ComposerKt.sourceInformation($composer3, "C(FajrHeader)N(nextFajrTimeFormatted,isAlarmEnabled,cityName)499@21569L1531:FajrSettingsScreen.kt#jcb7bm");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(nextFajrTimeFormatted) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isAlarmEnabled) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(cityName) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            str = cityName;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(695755678, $dirty, -1, "com.example.fajr.ui.FajrHeader (FajrSettingsScreen.kt:498)");
            }
            Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(4), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            int $dirty2 = $dirty;
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m732paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                i = 6;
            } else {
                i = 6;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i4 = ((6 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 701726294, "C504@21808L11,500@21649L197,506@21855L29,507@21893L1017,531@22919L29,535@23056L11,532@22957L137:FajrSettingsScreen.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("موعد صلاة الفجر القادم", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 199686, 0, 131026);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), $composer3, i);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer3, fillMaxWidth$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((438 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if (!$composer3.getInserting()) {
                        $composer3.createNode(constructor2);
                    } else {
                        $composer3.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl($composer3);
                    Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        measurePolicy = rowMeasurePolicy;
                        compositionLocalMap = currentCompositionLocalMap2;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i5 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            int i7 = ((438 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer3, 437732406, "C516@22266L11,512@22091L208,521@22504L396,518@22312L588:FajrSettingsScreen.kt#jcb7bm");
                            $composer2 = $composer3;
                            TextKt.m2816Text4IGK_g(nextFajrTimeFormatted, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty2 & 14) | 199680, 0, 131026);
                            SurfaceKt.m2666SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(12)), isAlarmEnabled ? Color.m4487copywmQWz5c(r4, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r4) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r4) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r4) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4279286145L)) : 0.0f) : Color.m4487copywmQWz5c(r3, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r3) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r3) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r3) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(Color.INSTANCE.m4519getGray0d7_KjU()) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1995118263, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return FajrSettingsScreenKt.FajrHeader$lambda$131$lambda$130$lambda$129(isAlarmEnabled, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }, $composer3, 54), $composer3, 12582912, 121);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(2)), $composer3, 6);
                            str = cityName;
                            TextKt.m2816Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty2 >> 6) & 14) | 3072, 0, 131058);
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
                    } else {
                        measurePolicy = rowMeasurePolicy;
                        compositionLocalMap = currentCompositionLocalMap2;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i62 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i72 = ((438 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 437732406, "C516@22266L11,512@22091L208,521@22504L396,518@22312L588:FajrSettingsScreen.kt#jcb7bm");
                    $composer2 = $composer3;
                    TextKt.m2816Text4IGK_g(nextFajrTimeFormatted, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty2 & 14) | 199680, 0, 131026);
                    SurfaceKt.m2666SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(12)), isAlarmEnabled ? Color.m4487copywmQWz5c(r4, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r4) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r4) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r4) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4279286145L)) : 0.0f) : Color.m4487copywmQWz5c(r3, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r3) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r3) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r3) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(Color.INSTANCE.m4519getGray0d7_KjU()) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1995118263, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FajrSettingsScreenKt.FajrHeader$lambda$131$lambda$130$lambda$129(isAlarmEnabled, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, $composer3, 54), $composer3, 12582912, 121);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(2)), $composer3, 6);
                    str = cityName;
                    TextKt.m2816Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty2 >> 6) & 14) | 3072, 0, 131058);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i32 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i42 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 701726294, "C504@21808L11,500@21649L197,506@21855L29,507@21893L1017,531@22919L29,535@23056L11,532@22957L137:FajrSettingsScreen.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("موعد صلاة الفجر القادم", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 199686, 0, 131026);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(4)), $composer3, i);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer3, fillMaxWidth$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i52 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
            }
            $composer3.startReusableNode();
            if (!$composer3.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer3);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i622 = (i52 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i722 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 437732406, "C516@22266L11,512@22091L208,521@22504L396,518@22312L588:FajrSettingsScreen.kt#jcb7bm");
            $composer2 = $composer3;
            TextKt.m2816Text4IGK_g(nextFajrTimeFormatted, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty2 & 14) | 199680, 0, 131026);
            SurfaceKt.m2666SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(12)), isAlarmEnabled ? Color.m4487copywmQWz5c(r4, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r4) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r4) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r4) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(ColorKt.Color(4279286145L)) : 0.0f) : Color.m4487copywmQWz5c(r3, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r3) : 0.15f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r3) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r3) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(Color.INSTANCE.m4519getGray0d7_KjU()) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1995118263, true, new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FajrSettingsScreenKt.FajrHeader$lambda$131$lambda$130$lambda$129(isAlarmEnabled, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer3, 12582912, 121);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(2)), $composer3, 6);
            str = cityName;
            TextKt.m2816Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty2 >> 6) & 14) | 3072, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FajrSettingsScreenKt.FajrHeader$lambda$132(nextFajrTimeFormatted, isAlarmEnabled, str, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CalculationMethodDialog(final CalculationMethod currentMethod, final Function0<Unit> onDismiss, final Function1<? super CalculationMethod, Unit> onMethodSelected, Composer $composer, final int $changed) {
        final Function0 onDismiss2;
        Intrinsics.checkNotNullParameter(currentMethod, "currentMethod");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onMethodSelected, "onMethodSelected");
        Composer $composer2 = $composer.startRestartGroup(-99074921);
        ComposerKt.sourceInformation($composer2, "C(CalculationMethodDialog)N(currentMethod,onDismiss,onMethodSelected)550@23380L971,546@23268L1083:FajrSettingsScreen.kt#jcb7bm");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(currentMethod.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onMethodSelected) ? 256 : 128;
        }
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            onDismiss2 = onDismiss;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-99074921, $dirty, -1, "com.example.fajr.ui.CalculationMethodDialog (FajrSettingsScreen.kt:545)");
            }
            onDismiss2 = onDismiss;
            OneUIDialogKt.OneUIDialog("اختر طريقة الحساب", onDismiss2, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-1793363784, true, new Function3() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FajrSettingsScreenKt.CalculationMethodDialog$lambda$138(Function1.this, onDismiss, currentMethod, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty & 112) | 1573254, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FajrSettingsScreenKt.CalculationMethodDialog$lambda$139(CalculationMethod.this, onDismiss2, onMethodSelected, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit CalculationMethodDialog$lambda$138(Function1 $onMethodSelected, Function0 $onDismiss, CalculationMethod $currentMethod, ColumnScope OneUIDialog, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        int length;
        int i2;
        Composer composer;
        final CalculationMethod calculationMethod;
        Composer composer2;
        Function0 function02;
        Composer m3828constructorimpl;
        final Function1 function1 = $onMethodSelected;
        final Function0 function03 = $onDismiss;
        Intrinsics.checkNotNullParameter(OneUIDialog, "$this$OneUIDialog");
        ComposerKt.sourceInformation($composer, "C551@23390L955:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1793363784, $changed, -1, "com.example.fajr.ui.CalculationMethodDialog.<anonymous> (FajrSettingsScreen.kt:551)");
            }
            Arrangement.Vertical m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m610spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((48 << 3) & 112) << 6) & 896) | 6;
            String str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                i = 48;
            } else {
                i = 48;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i4 = (i3 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i5 = ((i >> 6) & 112) | 6;
                    Composer composer3 = $composer;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1059946711, "C:FajrSettingsScreen.kt#jcb7bm");
                    composer3.startReplaceGroup(-1351280655);
                    ComposerKt.sourceInformation(composer3, "*557@23701L120,553@23524L797");
                    CalculationMethod[] values = CalculationMethod.values();
                    length = values.length;
                    i2 = 0;
                    while (i2 < length) {
                        CalculationMethod calculationMethod2 = values[i2];
                        int i6 = i2;
                        int i7 = length;
                        int i8 = i5;
                        CompositionLocalMap compositionLocalMap = currentCompositionLocalMap;
                        Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(12)));
                        ComposerKt.sourceInformationMarkerStart(composer3, 1788610183, "CC(remember):FajrSettingsScreen.kt#9igjgp");
                        boolean changed = composer3.changed(function1) | composer3.changed(calculationMethod2.ordinal()) | composer3.changed(function03);
                        Composer composer4 = composer3;
                        Object rememberedValue = composer4.rememberedValue();
                        if (!changed && rememberedValue != Composer.INSTANCE.getEmpty()) {
                            composer = composer3;
                            calculationMethod = calculationMethod2;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7226constructorimpl(12));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            composer2 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m730padding3ABfNKs);
                            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            int i9 = ((((432 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (!composer2.getInserting()) {
                                function02 = constructor2;
                                composer2.createNode(function02);
                            } else {
                                function02 = constructor2;
                                composer2.useNode();
                            }
                            m3828constructorimpl = Updater.m3828constructorimpl(composer2);
                            String str2 = str;
                            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                int i10 = (i9 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                int i11 = ((432 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1090556401, "C565@24040L70:FajrSettingsScreen.kt#jcb7bm");
                                TextKt.m2816Text4IGK_g(calculationMethod.getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                                if (calculationMethod != $currentMethod) {
                                    composer2.startReplaceGroup(1090671720);
                                    ComposerKt.sourceInformation(composer2, "567@24261L11,567@24186L95");
                                    IconKt.m2273Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 48, 4);
                                } else {
                                    composer2.startReplaceGroup(1066699575);
                                }
                                composer2.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                i2 = i6 + 1;
                                function1 = $onMethodSelected;
                                function03 = $onDismiss;
                                length = i7;
                                i5 = i8;
                                currentCompositionLocalMap = compositionLocalMap;
                                composer3 = composer;
                                str = str2;
                            }
                            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i102 = (i9 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            int i112 = ((432 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1090556401, "C565@24040L70:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g(calculationMethod.getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                            if (calculationMethod != $currentMethod) {
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            i2 = i6 + 1;
                            function1 = $onMethodSelected;
                            function03 = $onDismiss;
                            length = i7;
                            i5 = i8;
                            currentCompositionLocalMap = compositionLocalMap;
                            composer3 = composer;
                            str = str2;
                        }
                        composer = composer3;
                        calculationMethod = calculationMethod2;
                        Object obj = new Function0() { // from class: com.example.fajr.ui.FajrSettingsScreenKt$$ExternalSyntheticLambda42
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FajrSettingsScreenKt.CalculationMethodDialog$lambda$138$lambda$137$lambda$136$lambda$134$lambda$133(Function1.this, calculationMethod, function03);
                            }
                        };
                        composer4.updateRememberedValue(obj);
                        rememberedValue = obj;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        Modifier m730padding3ABfNKs2 = PaddingKt.m730padding3ABfNKs(ClickableKt.m264clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7226constructorimpl(12));
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                        composer2 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, m730padding3ABfNKs2);
                        Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        int i92 = ((((432 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        m3828constructorimpl = Updater.m3828constructorimpl(composer2);
                        String str22 = str;
                        Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3828constructorimpl.getInserting()) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1022 = (i92 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            int i1122 = ((432 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1090556401, "C565@24040L70:FajrSettingsScreen.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g(calculationMethod.getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                            if (calculationMethod != $currentMethod) {
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            i2 = i6 + 1;
                            function1 = $onMethodSelected;
                            function03 = $onDismiss;
                            length = i7;
                            i5 = i8;
                            currentCompositionLocalMap = compositionLocalMap;
                            composer3 = composer;
                            str = str22;
                        }
                        m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
                        m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        int i10222 = (i92 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                        int i11222 = ((432 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1090556401, "C565@24040L70:FajrSettingsScreen.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g(calculationMethod.getTitleAr(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                        if (calculationMethod != $currentMethod) {
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        i2 = i6 + 1;
                        function1 = $onMethodSelected;
                        function03 = $onDismiss;
                        length = i7;
                        i5 = i8;
                        currentCompositionLocalMap = compositionLocalMap;
                        composer3 = composer;
                        str = str22;
                    }
                    Composer composer5 = composer3;
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
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i42 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i52 = ((i >> 6) & 112) | 6;
            Composer composer32 = $composer;
            ComposerKt.sourceInformationMarkerStart(composer32, 1059946711, "C:FajrSettingsScreen.kt#jcb7bm");
            composer32.startReplaceGroup(-1351280655);
            ComposerKt.sourceInformation(composer32, "*557@23701L120,553@23524L797");
            CalculationMethod[] values2 = CalculationMethod.values();
            length = values2.length;
            i2 = 0;
            while (i2 < length) {
            }
            Composer composer52 = composer32;
            composer52.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer52);
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
    public static final Unit CalculationMethodDialog$lambda$138$lambda$137$lambda$136$lambda$134$lambda$133(Function1 $onMethodSelected, CalculationMethod $method, Function0 $onDismiss) {
        $onMethodSelected.invoke($method);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }
}
