package com.example.ui.oneui;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneUIDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0083\u0001\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001ao\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"BlurBehindDialogWindow", "", "radiusDp", "", "(ILandroidx/compose/runtime/Composer;II)V", "OneUIDialogSurface", "title", "", "onDismiss", "Lkotlin/Function0;", "onConfirm", "modifier", "Landroidx/compose/ui/Modifier;", "confirmText", "dismissText", "confirmEnabled", "", "scrollable", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OneUIDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneUIDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BlurBehindDialogWindow$lambda$3(int i, int i2, int i3, Composer composer, int i4) {
        BlurBehindDialogWindow(i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDialog$lambda$12(String str, Function0 function0, Function0 function02, String str2, String str3, boolean z, Function3 function3, int i, int i2, Composer composer, int i3) {
        OneUIDialog(str, function0, function02, str2, str3, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDialogSurface$lambda$10(String str, Function0 function0, Function0 function02, Modifier modifier, String str2, String str3, boolean z, boolean z2, Function3 function3, int i, int i2, Composer composer, int i3) {
        OneUIDialogSurface(str, function0, function02, modifier, str2, str3, z, z2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BlurBehindDialogWindow(final int radiusDp, Composer $composer, final int $changed, final int i) {
        Composer $composer2 = $composer.startRestartGroup(71337497);
        ComposerKt.sourceInformation($composer2, "C(BlurBehindDialogWindow)N(radiusDp)30@1288L7,31@1327L7,32@1350L494,32@1339L505:OneUIDialog.kt#78813j");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(radiusDp) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                radiusDp = 28;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(71337497, $dirty, -1, "com.example.ui.oneui.BlurBehindDialogWindow (OneUIDialog.kt:29)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final View view = (View) consume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = $composer2.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart($composer2, -164136889, "CC(remember):OneUIDialog.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(view) | $composer2.changed(density) | (($dirty & 14) == 4);
            Object rememberedValue = $composer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.oneui.OneUIDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OneUIDialogKt.BlurBehindDialogWindow$lambda$2$lambda$1(view, density, radiusDp);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.SideEffect((Function0) rememberedValue, $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OneUIDialogKt.BlurBehindDialogWindow$lambda$3(radiusDp, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BlurBehindDialogWindow$lambda$2$lambda$1(View $view, Density $density, int $radiusDp) {
        Window window;
        ViewParent parent = $view.getParent();
        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
        if (dialogWindowProvider == null || (window = dialogWindowProvider.getWindow()) == null) {
            return Unit.INSTANCE;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            window.addFlags(4);
            WindowManager.LayoutParams attrs = window.getAttributes();
            attrs.setBlurBehindRadius($density.mo364roundToPx0680j_4(Dp.m7226constructorimpl($radiusDp)));
            window.setAttributes(attrs);
            window.setDimAmount(0.28f);
        } else {
            window.setDimAmount(0.5f);
        }
        return Unit.INSTANCE;
    }

    public static final void OneUIDialogSurface(final String title, final Function0<Unit> onDismiss, final Function0<Unit> function0, Modifier modifier, String confirmText, String dismissText, boolean confirmEnabled, boolean scrollable, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        final Function0<Unit> function02;
        final Modifier modifier2;
        String str;
        String str2;
        int i2;
        final boolean confirmEnabled2;
        final boolean confirmEnabled3;
        final String confirmText2;
        final String dismissText2;
        final Modifier modifier3;
        int i3;
        final String confirmText3;
        final String dismissText3;
        final boolean confirmEnabled4;
        final boolean scrollable2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-1999530162);
        ComposerKt.sourceInformation($composer2, "C(OneUIDialogSurface)N(title,onDismiss,onConfirm,modifier,confirmText,dismissText,confirmEnabled,scrollable,content)59@2284L11,60@2366L1993,60@2300L2059:OneUIDialog.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            str = confirmText;
        } else if (($changed & 24576) == 0) {
            str = confirmText;
            $dirty |= $composer2.changed(str) ? 16384 : 8192;
        } else {
            str = confirmText;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            str2 = dismissText;
        } else if ((196608 & $changed) == 0) {
            str2 = dismissText;
            $dirty |= $composer2.changed(str2) ? 131072 : 65536;
        } else {
            str2 = dismissText;
        }
        int i7 = i & 64;
        if (i7 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty |= $composer2.changed(confirmEnabled) ? 1048576 : 524288;
        }
        int i8 = i & 128;
        if (i8 != 0) {
            $dirty |= 12582912;
            i2 = i8;
        } else if (($changed & 12582912) == 0) {
            i2 = i8;
            $dirty |= $composer2.changed(scrollable) ? 8388608 : 4194304;
        } else {
            i2 = i8;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer2.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ($composer2.shouldExecute(($dirty & 38347923) != 38347922, $dirty & 1)) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 == 0) {
                i3 = i6;
                confirmText3 = str;
            } else {
                confirmText3 = "حفظ";
                i3 = i6;
            }
            if (i3 == 0) {
                dismissText3 = str2;
            } else {
                dismissText3 = "إلغاء";
            }
            if (i7 == 0) {
                confirmEnabled4 = confirmEnabled;
            } else {
                confirmEnabled4 = true;
            }
            if (i2 == 0) {
                scrollable2 = scrollable;
            } else {
                scrollable2 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1999530162, $dirty, -1, "com.example.ui.oneui.OneUIDialogSurface (OneUIDialog.kt:58)");
            }
            final ColorScheme cs = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4479boximpl(cs.getOnSurface())), ComposableLambdaKt.rememberComposableLambda(-1528915314, true, new Function2() { // from class: com.example.ui.oneui.OneUIDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIDialogKt.OneUIDialogSurface$lambda$9(Modifier.this, cs, title, scrollable2, content, onDismiss, function02, confirmEnabled4, dismissText3, confirmText3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            confirmEnabled2 = confirmEnabled4;
            dismissText2 = dismissText3;
            confirmText2 = confirmText3;
            confirmEnabled3 = scrollable2;
            modifier2 = modifier3;
        } else {
            $composer2.skipToGroupEnd();
            confirmEnabled2 = confirmEnabled;
            confirmEnabled3 = scrollable;
            confirmText2 = str;
            dismissText2 = str2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIDialogKt.OneUIDialogSurface$lambda$10(title, onDismiss, function0, modifier2, confirmText2, dismissText2, confirmEnabled2, confirmEnabled3, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OneUIDialogSurface$lambda$9(Modifier $modifier, ColorScheme $cs, String $title, boolean $scrollable, Function3 $content, Function0 $onDismiss, Function0 $onConfirm, boolean $confirmEnabled, String $dismissText, String $confirmText, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Composer m3828constructorimpl;
        Modifier.Companion companion;
        Function0 function03;
        Composer m3828constructorimpl2;
        Function0 function04;
        Composer m3828constructorimpl3;
        Composer composer;
        Composer composer2;
        Function0 function05;
        Composer m3828constructorimpl4;
        Function0 function06;
        Composer composer3;
        ComposerKt.sourceInformation($composer, "C61@2372L1985:OneUIDialog.kt#78813j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1528915314, $changed, -1, "com.example.ui.oneui.OneUIDialogSurface.<anonymous> (OneUIDialog.kt:61)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default($modifier, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl5 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl5, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl5, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl5.getInserting() && Intrinsics.areEqual(m3828constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl5, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i3 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1419794678, "C62@2410L739,84@3154L30,86@3241L1110:OneUIDialog.kt#78813j");
                Modifier m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(30))), $cs.getSurface(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    int i6 = ((0 >> 6) & 112) | 6;
                    ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, 981891322, "C70@2619L10,68@2560L279,75@2848L256,82@3113L30:OneUIDialog.kt#78813j");
                    TextKt.m2816Text4IGK_g($title, PaddingKt.m733paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(12)), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 65016);
                    Modifier weight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
                    if ($scrollable) {
                        $composer.startReplaceGroup(-522501622);
                        $composer.endReplaceGroup();
                        companion = Modifier.INSTANCE;
                    } else {
                        $composer.startReplaceGroup(-522502969);
                        ComposerKt.sourceInformation($composer, "78@2981L21");
                        companion = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null);
                        $composer.endReplaceGroup();
                    }
                    Modifier m732paddingVpY3zN4$default = PaddingKt.m732paddingVpY3zN4$default(weight.then(companion), Dp.m7226constructorimpl(24), 0.0f, 2, null);
                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default);
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
                    Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl2.getInserting() && Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i8 = (i7 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                        Modifier m763height3ABfNKs = SizeKt.m763height3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28))), $cs.getSurfaceContainerHighest(), null, 2, null), Dp.m7226constructorimpl(56));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer, m763height3ABfNKs);
                        Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        int i9 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                        Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3828constructorimpl3.getInserting()) {
                            composer = $composer;
                            if (Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                int i10 = (i9 >> 6) & 14;
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                int i11 = ((384 >> 6) & 112) | 6;
                                RowScope rowScope = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1616578877, "C94@3491L243:OneUIDialog.kt#78813j");
                                Modifier m264clickableXHw0xAI$default = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, $onDismiss, 7, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default);
                                Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                int i12 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    function05 = constructor5;
                                    composer2.createNode(function05);
                                } else {
                                    function05 = constructor5;
                                    composer2.useNode();
                                }
                                m3828constructorimpl4 = Updater.m3828constructorimpl(composer2);
                                Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3828constructorimpl4.getInserting() && Intrinsics.areEqual(m3828constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i13 = (i12 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    int i14 = ((48 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                                    TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if ($onConfirm != null) {
                                        composer2.startReplaceGroup(1616846995);
                                        ComposerKt.sourceInformation(composer2, "99@3788L66,100@3871L456");
                                        BoxKt.Box(BackgroundKt.m231backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl((float) 0.5d)), 0.0f, 1, null), $cs.getOutline(), null, 2, null), composer2, 0);
                                        Modifier m264clickableXHw0xAI$default2 = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), $confirmEnabled, null, null, $onConfirm, 6, null);
                                        Alignment center2 = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default2);
                                        Function0 constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                        int i15 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            function06 = constructor6;
                                            composer2.createNode(function06);
                                        } else {
                                            function06 = constructor6;
                                            composer2.useNode();
                                        }
                                        Composer m3828constructorimpl6 = Updater.m3828constructorimpl(composer2);
                                        Updater.m3835setimpl(m3828constructorimpl6, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3835setimpl(m3828constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2 setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3828constructorimpl6.getInserting()) {
                                            composer3 = composer2;
                                        } else {
                                            composer3 = composer2;
                                            if (Intrinsics.areEqual(m3828constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                Updater.m3835setimpl(m3828constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                                int i16 = (i15 >> 6) & 14;
                                                Composer composer4 = composer3;
                                                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                int i17 = ((48 >> 6) & 112) | 6;
                                                ComposerKt.sourceInformationMarkerStart(composer4, -481905880, "C106@4175L10,104@4086L223:OneUIDialog.kt#78813j");
                                                TextKt.m2816Text4IGK_g($confirmText, (Modifier) null, !$confirmEnabled ? $cs.getOnSurface() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelLarge(), composer4, 0, 0, 65530);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer3.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                            }
                                        }
                                        m3828constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        m3828constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        Updater.m3835setimpl(m3828constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i162 = (i15 >> 6) & 14;
                                        Composer composer42 = composer3;
                                        ComposerKt.sourceInformationMarkerStart(composer42, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                        int i172 = ((48 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer42, -481905880, "C106@4175L10,104@4086L223:OneUIDialog.kt#78813j");
                                        TextKt.m2816Text4IGK_g($confirmText, (Modifier) null, !$confirmEnabled ? $cs.getOnSurface() : $cs.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer42, MaterialTheme.$stable).getLabelLarge(), composer42, 0, 0, 65530);
                                        ComposerKt.sourceInformationMarkerEnd(composer42);
                                        ComposerKt.sourceInformationMarkerEnd(composer42);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                    } else {
                                        composer2.startReplaceGroup(1613088462);
                                    }
                                    composer2.endReplaceGroup();
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
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                int i132 = (i12 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                int i142 = ((48 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                                TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if ($onConfirm != null) {
                                }
                                composer2.endReplaceGroup();
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
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        } else {
                            composer = $composer;
                        }
                        m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i102 = (i9 >> 6) & 14;
                        composer2 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        int i112 = ((384 >> 6) & 112) | 6;
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1616578877, "C94@3491L243:OneUIDialog.kt#78813j");
                        Modifier m264clickableXHw0xAI$default3 = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, $onDismiss, 7, null);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash52 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap52 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default3);
                        Function0 constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                        int i122 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        m3828constructorimpl4 = Updater.m3828constructorimpl(composer2);
                        Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3828constructorimpl4.getInserting()) {
                            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                            int i1322 = (i122 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                            int i1422 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                            TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if ($onConfirm != null) {
                            }
                            composer2.endReplaceGroup();
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
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                        m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash52));
                        m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash52), setCompositeKeyHash52);
                        Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                        int i13222 = (i122 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                        int i14222 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                        TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if ($onConfirm != null) {
                        }
                        composer2.endReplaceGroup();
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
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i82 = (i7 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    Modifier m763height3ABfNKs2 = SizeKt.m763height3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28))), $cs.getSurfaceContainerHighest(), null, 2, null), Dp.m7226constructorimpl(56));
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier($composer, m763height3ABfNKs2);
                    Function0 constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    int i92 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42), setCompositeKeyHash42);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1022 = (i92 >> 6) & 14;
                    composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i1122 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope22 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1616578877, "C94@3491L243:OneUIDialog.kt#78813j");
                    Modifier m264clickableXHw0xAI$default32 = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope22, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, $onDismiss, 7, null);
                    Alignment center32 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(center32, false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash522 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap522 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default32);
                    Function0 constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    m3828constructorimpl4 = Updater.m3828constructorimpl(composer2);
                    Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl4.getInserting()) {
                    }
                    m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash522));
                    m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash522), setCompositeKeyHash522);
                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                    int i132222 = (i1222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                    int i142222 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                    TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if ($onConfirm != null) {
                    }
                    composer2.endReplaceGroup();
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
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int i62 = ((0 >> 6) & 112) | 6;
                ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 981891322, "C70@2619L10,68@2560L279,75@2848L256,82@3113L30:OneUIDialog.kt#78813j");
                TextKt.m2816Text4IGK_g($title, PaddingKt.m733paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(12)), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 65016);
                Modifier weight2 = columnScope2.weight(Modifier.INSTANCE, 1.0f, false);
                if ($scrollable) {
                }
                Modifier m732paddingVpY3zN4$default2 = PaddingKt.m732paddingVpY3zN4$default(weight2.then(companion), Dp.m7226constructorimpl(24), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash32 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap32 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default2);
                Function0 constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                int i72 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    int i822 = (i72 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                    Modifier m763height3ABfNKs22 = SizeKt.m763height3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28))), $cs.getSurfaceContainerHighest(), null, 2, null), Dp.m7226constructorimpl(56));
                    Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash422 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = $composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier($composer, m763height3ABfNKs22);
                    Function0 constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    int i922 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                    }
                    m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                    Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl3.getInserting()) {
                    }
                    m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422));
                    m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422), setCompositeKeyHash422);
                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    int i10222 = (i922 >> 6) & 14;
                    composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int i11222 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope222 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1616578877, "C94@3491L243:OneUIDialog.kt#78813j");
                    Modifier m264clickableXHw0xAI$default322 = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, $onDismiss, 7, null);
                    Alignment center322 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(center322, false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash5222 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5222 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default322);
                    Function0 constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i12222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    m3828constructorimpl4 = Updater.m3828constructorimpl(composer2);
                    Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl4.getInserting()) {
                    }
                    m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5222));
                    m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5222), setCompositeKeyHash5222);
                    Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
                    int i1322222 = (i12222 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
                    int i1422222 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                    TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if ($onConfirm != null) {
                    }
                    composer2.endReplaceGroup();
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
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash32));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash32), setCompositeKeyHash32);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                int i8222 = (i72 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                Modifier m763height3ABfNKs222 = SizeKt.m763height3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28))), $cs.getSurfaceContainerHighest(), null, 2, null), Dp.m7226constructorimpl(56));
                Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier($composer, m763height3ABfNKs222);
                Function0 constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                int i9222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash4222), setCompositeKeyHash4222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                int i102222 = (i9222 >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i112222 = ((384 >> 6) & 112) | 6;
                RowScope rowScope2222 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1616578877, "C94@3491L243:OneUIDialog.kt#78813j");
                Modifier m264clickableXHw0xAI$default3222 = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope2222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, $onDismiss, 7, null);
                Alignment center3222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(center3222, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash52222 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap52222 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default3222);
                Function0 constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
                int i122222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                m3828constructorimpl4 = Updater.m3828constructorimpl(composer2);
                Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl4.getInserting()) {
                }
                m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash52222));
                m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash52222), setCompositeKeyHash52222);
                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
                int i13222222 = (i122222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance322222 = BoxScopeInstance.INSTANCE;
                int i14222222 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if ($onConfirm != null) {
                }
                composer2.endReplaceGroup();
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
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl5, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i32 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1419794678, "C62@2410L739,84@3154L30,86@3241L1110:OneUIDialog.kt#78813j");
            Modifier m231backgroundbw27NRU$default2 = BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(30))), $cs.getSurface(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier($composer, m231backgroundbw27NRU$default2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i522 = (i42 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int i622 = ((0 >> 6) & 112) | 6;
                ColumnScope columnScope22 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 981891322, "C70@2619L10,68@2560L279,75@2848L256,82@3113L30:OneUIDialog.kt#78813j");
                TextKt.m2816Text4IGK_g($title, PaddingKt.m733paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(12)), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 65016);
                Modifier weight22 = columnScope22.weight(Modifier.INSTANCE, 1.0f, false);
                if ($scrollable) {
                }
                Modifier m732paddingVpY3zN4$default22 = PaddingKt.m732paddingVpY3zN4$default(weight22.then(companion), Dp.m7226constructorimpl(24), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash322 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default22);
                Function0 constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                int i722 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3828constructorimpl2.getInserting()) {
                }
                m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash322));
                m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash322), setCompositeKeyHash322);
                Updater.m3835setimpl(m3828constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                int i82222 = (i722 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
                Modifier m763height3ABfNKs2222 = SizeKt.m763height3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28))), $cs.getSurfaceContainerHighest(), null, 2, null), Dp.m7226constructorimpl(56));
                Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash42222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier($composer, m763height3ABfNKs2222);
                Function0 constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                int i92222 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                }
                m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
                Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl3.getInserting()) {
                }
                m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash42222));
                m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash42222), setCompositeKeyHash42222);
                Updater.m3835setimpl(m3828constructorimpl3, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                int i1022222 = (i92222 >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int i1122222 = ((384 >> 6) & 112) | 6;
                RowScope rowScope22222 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1616578877, "C94@3491L243:OneUIDialog.kt#78813j");
                Modifier m264clickableXHw0xAI$default32222 = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope22222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, $onDismiss, 7, null);
                Alignment center32222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(center32222, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash522222 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap522222 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier522222 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default32222);
                Function0 constructor522222 = ComposeUiNode.INSTANCE.getConstructor();
                int i1222222 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                m3828constructorimpl4 = Updater.m3828constructorimpl(composer2);
                Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap522222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash522222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3828constructorimpl4.getInserting()) {
                }
                m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash522222));
                m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash522222), setCompositeKeyHash522222);
                Updater.m3835setimpl(m3828constructorimpl4, materializeModifier522222, ComposeUiNode.INSTANCE.getSetModifier());
                int i132222222 = (i1222222 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3222222 = BoxScopeInstance.INSTANCE;
                int i142222222 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
                TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if ($onConfirm != null) {
                }
                composer2.endReplaceGroup();
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
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i5222 = (i42 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int i6222 = ((0 >> 6) & 112) | 6;
            ColumnScope columnScope222 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 981891322, "C70@2619L10,68@2560L279,75@2848L256,82@3113L30:OneUIDialog.kt#78813j");
            TextKt.m2816Text4IGK_g($title, PaddingKt.m733paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(24), Dp.m7226constructorimpl(12)), $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7073boximpl(TextAlign.INSTANCE.m7080getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 65016);
            Modifier weight222 = columnScope222.weight(Modifier.INSTANCE, 1.0f, false);
            if ($scrollable) {
            }
            Modifier m732paddingVpY3zN4$default222 = PaddingKt.m732paddingVpY3zN4$default(weight222.then(companion), Dp.m7226constructorimpl(24), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier($composer, m732paddingVpY3zN4$default222);
            Function0 constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            int i7222 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl2.getInserting()) {
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3222));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash3222), setCompositeKeyHash3222);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            int i822222 = (i7222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            $content.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((0 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(20)), $composer, 6);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), $composer, 6);
            Modifier m763height3ABfNKs22222 = SizeKt.m763height3ABfNKs(BackgroundKt.m231backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28))), $cs.getSurfaceContainerHighest(), null, 2, null), Dp.m7226constructorimpl(56));
            Alignment.Vertical centerVertically22222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22222, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash422222 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier($composer, m763height3ABfNKs22222);
            Function0 constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            int i922222 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
            }
            m3828constructorimpl3 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl3, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl3.getInserting()) {
            }
            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash422222));
            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash422222), setCompositeKeyHash422222);
            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
            int i10222222 = (i922222 >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int i11222222 = ((384 >> 6) & 112) | 6;
            RowScope rowScope222222 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1616578877, "C94@3491L243:OneUIDialog.kt#78813j");
            Modifier m264clickableXHw0xAI$default322222 = ClickableKt.m264clickableXHw0xAI$default(SizeKt.fillMaxHeight$default(RowScope.CC.weight$default(rowScope222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, $onDismiss, 7, null);
            Alignment center322222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy322222 = BoxKt.maybeCachedBoxMeasurePolicy(center322222, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5222222 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5222222 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222222 = ComposedModifierKt.materializeModifier(composer2, m264clickableXHw0xAI$default322222);
            Function0 constructor5222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i12222222 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m3828constructorimpl4 = Updater.m3828constructorimpl(composer2);
            Updater.m3835setimpl(m3828constructorimpl4, maybeCachedBoxMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl4, currentCompositionLocalMap5222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl4.getInserting()) {
            }
            m3828constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5222222));
            m3828constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash5222222), setCompositeKeyHash5222222);
            Updater.m3835setimpl(m3828constructorimpl4, materializeModifier5222222, ComposeUiNode.INSTANCE.getSetModifier());
            int i1322222222 = (i12222222 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32222222 = BoxScopeInstance.INSTANCE;
            int i1422222222 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -1640767487, "C97@3688L10,97@3648L84:OneUIDialog.kt#78813j");
            TextKt.m2816Text4IGK_g($dismissText, (Modifier) null, $cs.getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if ($onConfirm != null) {
            }
            composer2.endReplaceGroup();
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
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final void OneUIDialog(final String title, final Function0<Unit> onDismiss, final Function0<Unit> function0, String confirmText, String dismissText, boolean confirmEnabled, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        String str;
        String str2;
        boolean z;
        Composer $composer2;
        final String confirmText2;
        final String dismissText2;
        final boolean confirmEnabled2;
        final String confirmText3;
        final String dismissText3;
        final boolean confirmEnabled3;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer3 = $composer.startRestartGroup(-1756923516);
        ComposerKt.sourceInformation($composer3, "C(OneUIDialog)N(title,onDismiss,onConfirm,confirmText,dismissText,confirmEnabled,content)126@4733L412,126@4632L513:OneUIDialog.kt#78813j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            str = confirmText;
        } else if (($changed & 3072) == 0) {
            str = confirmText;
            $dirty |= $composer3.changed(str) ? 2048 : 1024;
        } else {
            str = confirmText;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            str2 = dismissText;
        } else if (($changed & 24576) == 0) {
            str2 = dismissText;
            $dirty |= $composer3.changed(str2) ? 16384 : 8192;
        } else {
            str2 = dismissText;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z = confirmEnabled;
        } else if ((196608 & $changed) == 0) {
            z = confirmEnabled;
            $dirty |= $composer3.changed(z) ? 131072 : 65536;
        } else {
            z = confirmEnabled;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(content) ? 1048576 : 524288;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute((599187 & $dirty2) != 599186, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            confirmText2 = str;
            dismissText2 = str2;
            confirmEnabled2 = z;
        } else {
            if (i2 != 0) {
                confirmText3 = "حفظ";
            } else {
                confirmText3 = str;
            }
            if (i3 == 0) {
                dismissText3 = str2;
            } else {
                dismissText3 = "إلغاء";
            }
            if (i4 == 0) {
                confirmEnabled3 = z;
            } else {
                confirmEnabled3 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1756923516, $dirty2, -1, "com.example.ui.oneui.OneUIDialog (OneUIDialog.kt:125)");
            }
            DialogProperties dialogProperties = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
            Function2 function2 = new Function2() { // from class: com.example.ui.oneui.OneUIDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIDialogKt.OneUIDialog$lambda$11(title, onDismiss, function0, confirmText3, dismissText3, confirmEnabled3, content, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            String dismissText4 = dismissText3;
            boolean confirmEnabled4 = confirmEnabled3;
            String confirmText4 = confirmText3;
            AndroidDialog_androidKt.Dialog(onDismiss, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1764860723, true, function2, $composer3, 54), $composer3, (($dirty2 >> 3) & 14) | 432, 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            confirmText2 = confirmText4;
            dismissText2 = dismissText4;
            confirmEnabled2 = confirmEnabled4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.oneui.OneUIDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneUIDialogKt.OneUIDialog$lambda$12(title, onDismiss, function0, confirmText2, dismissText2, confirmEnabled2, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OneUIDialog$lambda$11(String $title, Function0 $onDismiss, Function0 $onConfirm, String $confirmText, String $dismissText, boolean $confirmEnabled, Function3 $content, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C127@4743L24,128@4776L363:OneUIDialog.kt#78813j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1764860723, $changed, -1, "com.example.ui.oneui.OneUIDialog.<anonymous> (OneUIDialog.kt:127)");
            }
            BlurBehindDialogWindow(0, $composer, 0, 1);
            OneUIDialogSurface($title, $onDismiss, $onConfirm, SizeKt.m765heightInVpY3zN4$default(PaddingKt.m732paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7226constructorimpl(20), 0.0f, 2, null), 0.0f, Dp.m7226constructorimpl(620), 1, null), $confirmText, $dismissText, $confirmEnabled, false, $content, $composer, 3072, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
