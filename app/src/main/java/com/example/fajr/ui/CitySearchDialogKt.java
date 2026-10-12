package com.example.fajr.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.LocationOnKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.core.location.LocationRequestCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.example.fajr.data.CitiesDatabase;
import com.example.fajr.data.CityItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CitySearchDialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a#\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"CitySearchDialog", "", "onDismiss", "Lkotlin/Function0;", "onCitySelected", "Lkotlin/Function1;", "Lcom/example/fajr/data/CityItem;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CityRowItem", "city", "onClick", "(Lcom/example/fajr/data/CityItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "searchQuery", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CitySearchDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CityRowItem$lambda$25(CityItem cityItem, Function0 function0, int i, Composer composer, int i2) {
        CityRowItem(cityItem, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CitySearchDialog$lambda$19(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        CitySearchDialog(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CitySearchDialog(final Function0<Unit> onDismiss, final Function1<? super CityItem, Unit> onCitySelected, Composer $composer, final int $changed) {
        final Function0 onDismiss2;
        Object mutableStateOf$default;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onCitySelected, "onCitySelected");
        Composer $composer2 = $composer.startRestartGroup(-143598027);
        ComposerKt.sourceInformation($composer2, "C(CitySearchDialog)N(onDismiss,onCitySelected)30@1127L31,31@1184L78,35@1305L3189,35@1268L3226:CitySearchDialog.kt#jcb7bm");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onCitySelected) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            onDismiss2 = onDismiss;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-143598027, $dirty, -1, "com.example.fajr.ui.CitySearchDialog (CitySearchDialog.kt:29)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -558746380, "CC(remember):CitySearchDialog.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(mutableStateOf$default);
                rememberedValue = mutableStateOf$default;
            }
            final MutableState searchQuery$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            String CitySearchDialog$lambda$1 = CitySearchDialog$lambda$1(searchQuery$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -558744509, "CC(remember):CitySearchDialog.kt#9igjgp");
            boolean changed = $composer2.changed(CitySearchDialog$lambda$1);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object searchCities = CitiesDatabase.INSTANCE.searchCities(CitySearchDialog$lambda$1(searchQuery$delegate));
                $composer2.updateRememberedValue(searchCities);
                rememberedValue2 = searchCities;
            }
            final List filteredCities = (List) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            onDismiss2 = onDismiss;
            AndroidDialog_androidKt.Dialog(onDismiss2, null, ComposableLambdaKt.rememberComposableLambda(-999588226, true, new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CitySearchDialogKt.CitySearchDialog$lambda$18(filteredCities, onCitySelected, onDismiss, searchQuery$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CitySearchDialogKt.CitySearchDialog$lambda$19(Function0.this, onCitySelected, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String CitySearchDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CitySearchDialog$lambda$18(final List $filteredCities, final Function1 $onCitySelected, final Function0 $onDismiss, final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C38@1405L11,43@1573L2915,36@1315L3173:CitySearchDialog.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-999588226, $changed, -1, "com.example.fajr.ui.CitySearchDialog.<anonymous> (CitySearchDialog.kt:36)");
            }
            SurfaceKt.m2666SurfaceT9BRK9s(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.85f), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(28)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), 0L, Dp.m7226constructorimpl(6), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(276972867, true, new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17($filteredCities, $onCitySelected, $onDismiss, $searchQuery$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12607494, LocationRequestCompat.QUALITY_LOW_POWER);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit CitySearchDialog$lambda$18$lambda$17(final List $filteredCities, final Function1 $onCitySelected, final Function0 $onDismiss, final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        Composer composer;
        Composer composer2;
        Composer m3828constructorimpl;
        Object rememberedValue;
        Composer composer3;
        Function0 function0;
        Composer composer4;
        ComposerKt.sourceInformation($composer, "C44@1587L2891:CitySearchDialog.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(276972867, $changed, -1, "com.example.fajr.ui.CitySearchDialog.<anonymous>.<anonymous> (CitySearchDialog.kt:44)");
            }
            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(20));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            Composer m3828constructorimpl2 = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl2.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    int i3 = ((6 >> 6) & 112) | 6;
                    ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733452570, "C50@1760L659,66@2437L30,71@2611L20,74@2833L297,69@2515L783,86@3316L30:CitySearchDialog.kt#jcb7bm");
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    m3828constructorimpl = Updater.m3828constructorimpl(composer2);
                    Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i5 = (i4 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i6 = ((438 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1791895379, "C59@2201L11,55@1998L246,61@2265L136:CitySearchDialog.kt#jcb7bm");
                        TextKt.m2816Text4IGK_g("اختر الدولة والمدينة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 0, 131026);
                        IconButtonKt.IconButton($onDismiss, null, false, null, null, ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$507763706$app(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer2, 6);
                        String CitySearchDialog$lambda$1 = CitySearchDialog$lambda$1($searchQuery$delegate);
                        RoundedCornerShape m1024RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16));
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 854968301, "CC(remember):CitySearchDialog.kt#9igjgp");
                        rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object obj = new Function1() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$6$lambda$5(MutableState.this, (String) obj2);
                                }
                            };
                            composer2.updateRememberedValue(obj);
                            rememberedValue = obj;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        OutlinedTextFieldKt.OutlinedTextField(CitySearchDialog$lambda$1, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1579394866$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1443367569$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1307340272, true, new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$9(MutableState.this, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        }, composer2, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m1024RoundedCornerShape0680j_4, (TextFieldColors) null, composer2, 918553008, 12582912, 0, 6159480);
                        SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer2, 6);
                        if (!$filteredCities.isEmpty()) {
                            composer2.startReplaceGroup(735035367);
                            ComposerKt.sourceInformation(composer2, "90@3447L442");
                            Modifier weight$default = ColumnScope.CC.weight$default(columnScope, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            int i7 = ((((48 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                function0 = constructor3;
                                composer2.createNode(function0);
                            } else {
                                function0 = constructor3;
                                composer2.useNode();
                            }
                            Composer m3828constructorimpl3 = Updater.m3828constructorimpl(composer2);
                            Updater.m3835setimpl(m3828constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3835setimpl(m3828constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3828constructorimpl3.getInserting()) {
                                composer4 = composer2;
                                if (Intrinsics.areEqual(m3828constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    Updater.m3835setimpl(m3828constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i8 = (i7 >> 6) & 14;
                                    Composer composer5 = composer4;
                                    ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    int i9 = ((48 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer5, 845251255, "C98@3813L11,96@3689L178:CitySearchDialog.kt#jcb7bm");
                                    TextKt.m2816Text4IGK_g("لم يتم العثور على نتائج للبحث", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 6, 0, 131066);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer2.endReplaceGroup();
                                    composer3 = composer2;
                                }
                            } else {
                                composer4 = composer2;
                            }
                            m3828constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3828constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m3835setimpl(m3828constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i82 = (i7 >> 6) & 14;
                            Composer composer52 = composer4;
                            ComposerKt.sourceInformationMarkerStart(composer52, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            int i92 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer52, 845251255, "C98@3813L11,96@3689L178:CitySearchDialog.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g("لم يتم العثور على نتائج للبحث", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer52, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer52, 6, 0, 131066);
                            ComposerKt.sourceInformationMarkerEnd(composer52);
                            ComposerKt.sourceInformationMarkerEnd(composer52);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer2.endReplaceGroup();
                            composer3 = composer2;
                        } else {
                            composer2.startReplaceGroup(735521602);
                            ComposerKt.sourceInformation(composer2, "105@4098L348,102@3935L511");
                            Modifier weight$default2 = ColumnScope.CC.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                            Arrangement.HorizontalOrVertical m610spacedBy0680j_4 = Arrangement.INSTANCE.m610spacedBy0680j_4(Dp.m7226constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart(composer2, 855016213, "CC(remember):CitySearchDialog.kt#9igjgp");
                            boolean changedInstance = composer2.changedInstance($filteredCities) | composer2.changed($onCitySelected) | composer2.changed($onDismiss);
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                Object obj2 = new Function1() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14($filteredCities, $onCitySelected, $onDismiss, (LazyListScope) obj3);
                                    }
                                };
                                composer2.updateRememberedValue(obj2);
                                rememberedValue2 = obj2;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LazyDslKt.LazyColumn(weight$default2, null, null, false, m610spacedBy0680j_4, null, null, false, (Function1) rememberedValue2, composer2, 24576, 238);
                            composer3 = composer2;
                            composer3.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i52 = (i4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i62 = ((438 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1791895379, "C59@2201L11,55@1998L246,61@2265L136:CitySearchDialog.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g("اختر الدولة والمدينة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 0, 131026);
                    IconButtonKt.IconButton($onDismiss, null, false, null, null, ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$507763706$app(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer2, 6);
                    String CitySearchDialog$lambda$12 = CitySearchDialog$lambda$1($searchQuery$delegate);
                    RoundedCornerShape m1024RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16));
                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 854968301, "CC(remember):CitySearchDialog.kt#9igjgp");
                    rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    OutlinedTextFieldKt.OutlinedTextField(CitySearchDialog$lambda$12, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default22, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1579394866$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1443367569$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1307340272, true, new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj22, Object obj3) {
                            return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$9(MutableState.this, (Composer) obj22, ((Integer) obj3).intValue());
                        }
                    }, composer2, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m1024RoundedCornerShape0680j_42, (TextFieldColors) null, composer2, 918553008, 12582912, 0, 6159480);
                    SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer2, 6);
                    if (!$filteredCities.isEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int i32 = ((6 >> 6) & 112) | 6;
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 733452570, "C50@1760L659,66@2437L30,71@2611L20,74@2833L297,69@2515L783,86@3316L30:CitySearchDialog.kt#jcb7bm");
            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default3);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl(composer2);
            Updater.m3835setimpl(m3828constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting()) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                int i522 = (i42 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                int i622 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 1791895379, "C59@2201L11,55@1998L246,61@2265L136:CitySearchDialog.kt#jcb7bm");
                TextKt.m2816Text4IGK_g("اختر الدولة والمدينة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 0, 131026);
                IconButtonKt.IconButton($onDismiss, null, false, null, null, ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$507763706$app(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer2, 6);
                String CitySearchDialog$lambda$122 = CitySearchDialog$lambda$1($searchQuery$delegate);
                RoundedCornerShape m1024RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16));
                Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 854968301, "CC(remember):CitySearchDialog.kt#9igjgp");
                rememberedValue = composer2.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                OutlinedTextFieldKt.OutlinedTextField(CitySearchDialog$lambda$122, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1579394866$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1443367569$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1307340272, true, new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj22, Object obj3) {
                        return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$9(MutableState.this, (Composer) obj22, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m1024RoundedCornerShape0680j_422, (TextFieldColors) null, composer2, 918553008, 12582912, 0, 6159480);
                SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer2, 6);
                if (!$filteredCities.isEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i5222 = (i42 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            int i6222 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1791895379, "C59@2201L11,55@1998L246,61@2265L136:CitySearchDialog.kt#jcb7bm");
            TextKt.m2816Text4IGK_g("اختر الدولة والمدينة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 0, 131026);
            IconButtonKt.IconButton($onDismiss, null, false, null, null, ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$507763706$app(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer2, 6);
            String CitySearchDialog$lambda$1222 = CitySearchDialog$lambda$1($searchQuery$delegate);
            RoundedCornerShape m1024RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16));
            Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 854968301, "CC(remember):CitySearchDialog.kt#9igjgp");
            rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            OutlinedTextFieldKt.OutlinedTextField(CitySearchDialog$lambda$1222, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default2222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1579394866$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CitySearchDialogKt.INSTANCE.getLambda$1443367569$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1307340272, true, new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj3) {
                    return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$9(MutableState.this, (Composer) obj22, ((Integer) obj3).intValue());
                }
            }, composer2, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m1024RoundedCornerShape0680j_4222, (TextFieldColors) null, composer2, 918553008, 12582912, 0, 6159480);
            SpacerKt.Spacer(SizeKt.m763height3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(16)), composer2, 6);
            if (!$filteredCities.isEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$6$lambda$5(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$9(final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        Composer $composer2;
        ComposerKt.sourceInformation($composer, "C:CitySearchDialog.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1307340272, $changed, -1, "com.example.fajr.ui.CitySearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CitySearchDialog.kt:75)");
            }
            if (CitySearchDialog$lambda$1($searchQuery$delegate).length() > 0) {
                $composer.startReplaceGroup(210665367);
                ComposerKt.sourceInformation($composer, "76@2940L20,76@2919L163");
                ComposerKt.sourceInformationMarkerStart($composer, -2071412892, "CC(remember):CitySearchDialog.kt#9igjgp");
                Object rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$9$lambda$8$lambda$7(MutableState.this);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer2 = $composer;
                IconButtonKt.IconButton((Function0) rememberedValue, null, false, null, null, ComposableSingletons$CitySearchDialogKt.INSTANCE.m7667getLambda$477638408$app(), $composer2, 196614, 30);
            } else {
                $composer2 = $composer;
                $composer2.startReplaceGroup(207791698);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$9$lambda$8$lambda$7(MutableState $searchQuery$delegate) {
        $searchQuery$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(final List $filteredCities, final Function1 $onCitySelected, final Function0 $onDismiss, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CitySearchDialogKt.CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$lambda$11((CityItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.fajr.ui.CitySearchDialogKt$CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CityItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CityItem cityItem) {
                return null;
            }
        };
        LazyColumn.items($filteredCities.size(), new Function1<Integer, Object>() { // from class: com.example.fajr.ui.CitySearchDialogKt$CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($filteredCities.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.fajr.ui.CitySearchDialogKt$CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($filteredCities.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.fajr.ui.CitySearchDialogKt$CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$$inlined$items$default$4
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
                final CityItem cityItem = (CityItem) $filteredCities.get(it);
                $composer.startReplaceGroup(1279061214);
                ComposerKt.sourceInformation($composer, "CN(city)*107@4269L128,107@4234L164:CitySearchDialog.kt#jcb7bm");
                ComposerKt.sourceInformationMarkerStart($composer, 2119471105, "CC(remember):CitySearchDialog.kt#9igjgp");
                boolean changed = ((((i & 112) ^ 48) > 32 && $composer.changed(cityItem)) || (i & 48) == 32) | $composer.changed($onCitySelected) | $composer.changed($onDismiss);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = $onCitySelected;
                    final Function0 function0 = $onDismiss;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.example.fajr.ui.CitySearchDialogKt$CitySearchDialog$1$1$1$5$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(cityItem);
                            function0.invoke();
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                CitySearchDialogKt.CityRowItem(cityItem, (Function0) rememberedValue, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object CitySearchDialog$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$lambda$11(CityItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCountryNameEn() + "_" + it.getCityNameEn();
    }

    public static final void CityRowItem(final CityItem city, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        long m4487copywmQWz5c;
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(990365837);
        ComposerKt.sourceInformation($composer2, "C(CityRowItem)N(city,onClick)126@4661L11,130@4832L13,131@4852L999,124@4579L1272:CitySearchDialog.kt#jcb7bm");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(city) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onClick) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(990365837, $dirty, -1, "com.example.fajr.ui.CityRowItem (CitySearchDialog.kt:123)");
            }
            RoundedCornerShape m1024RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16));
            m4487copywmQWz5c = Color.m4487copywmQWz5c(r15, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(r15) : 0.5f, (r12 & 2) != 0 ? Color.m4495getRedimpl(r15) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(r15) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant()) : 0.0f);
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1024RoundedCornerShape0680j_4(Dp.m7226constructorimpl(16)));
            ComposerKt.sourceInformationMarkerStart($composer2, -1741159654, "CC(remember):CitySearchDialog.kt#9igjgp");
            boolean z = ($dirty & 112) == 32;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CitySearchDialogKt.CityRowItem$lambda$21$lambda$20(Function0.this);
                    }
                };
                $composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SurfaceKt.m2666SurfaceT9BRK9s(ClickableKt.m264clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue, 7, null), m1024RoundedCornerShape0680j_4, m4487copywmQWz5c, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1368715282, true, new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CitySearchDialogKt.CityRowItem$lambda$24(CityItem.this, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 12582912, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.fajr.ui.CitySearchDialogKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CitySearchDialogKt.CityRowItem$lambda$25(CityItem.this, onClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CityRowItem$lambda$21$lambda$20(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit CityRowItem$lambda$24(CityItem $city, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Composer composer2;
        Function0 function02;
        Composer m3828constructorimpl;
        Composer composer3;
        ComposerKt.sourceInformation($composer, "C132@4862L983:CitySearchDialog.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1368715282, $changed, -1, "com.example.fajr.ui.CityRowItem.<anonymous> (CitySearchDialog.kt:132)");
            }
            Modifier m730padding3ABfNKs = PaddingKt.m730padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7226constructorimpl(14));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m730padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            if (!m3828constructorimpl2.getInserting()) {
                composer = $composer;
                if (Intrinsics.areEqual(m3828constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i3 = ((390 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1998058873, "C141@5190L11,138@5047L225,144@5285L29,145@5327L508:CitySearchDialog.kt#jcb7bm");
                    IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 432, 0);
                    SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                    Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3828constructorimpl.getInserting()) {
                        composer3 = composer2;
                        if (Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i5 = (i4 >> 6) & 14;
                            Composer composer4 = composer3;
                            ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i6 = ((0 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, 2064872866, "C150@5561L11,146@5352L248,155@5775L11,152@5617L204:CitySearchDialog.kt#jcb7bm");
                            TextKt.m2816Text4IGK_g($city.getCityNameAr() + " - " + $city.getCountryNameAr(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 199680, 0, 131026);
                            TextKt.m2816Text4IGK_g($city.getCityNameEn() + ", " + $city.getCountryNameEn(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    } else {
                        composer3 = composer2;
                    }
                    m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3835setimpl(m3828constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i52 = (i4 >> 6) & 14;
                    Composer composer42 = composer3;
                    ComposerKt.sourceInformationMarkerStart(composer42, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i62 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer42, 2064872866, "C150@5561L11,146@5352L248,155@5775L11,152@5617L204:CitySearchDialog.kt#jcb7bm");
                    TextKt.m2816Text4IGK_g($city.getCityNameAr() + " - " + $city.getCountryNameAr(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer42, 199680, 0, 131026);
                    TextKt.m2816Text4IGK_g($city.getCityNameEn() + ", " + $city.getCountryNameEn(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer42, 3072, 0, 131058);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                composer = $composer;
            }
            m3828constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i32 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1998058873, "C141@5190L11,138@5047L225,144@5285L29,145@5327L508:CitySearchDialog.kt#jcb7bm");
            IconKt.m2273Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(22)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 432, 0);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(12)), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, modifier2);
            Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            int i42 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m3828constructorimpl = Updater.m3828constructorimpl(composer2);
            Updater.m3835setimpl(m3828constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3828constructorimpl.getInserting()) {
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            int i522 = (i42 >> 6) & 14;
            Composer composer422 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer422, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            int i622 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer422, 2064872866, "C150@5561L11,146@5352L248,155@5775L11,152@5617L204:CitySearchDialog.kt#jcb7bm");
            TextKt.m2816Text4IGK_g($city.getCityNameAr() + " - " + $city.getCountryNameAr(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer422, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer422, 199680, 0, 131026);
            TextKt.m2816Text4IGK_g($city.getCityNameEn() + ", " + $city.getCountryNameEn(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer422, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer422, 3072, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd(composer422);
            ComposerKt.sourceInformationMarkerEnd(composer422);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        return Unit.INSTANCE;
    }
}
