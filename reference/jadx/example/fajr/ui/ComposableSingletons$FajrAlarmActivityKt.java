package com.example.fajr.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.NotificationsOffKt;
import androidx.compose.material.icons.outlined.SnoozeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FajrAlarmActivity.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$FajrAlarmActivityKt {
    public static final ComposableSingletons$FajrAlarmActivityKt INSTANCE = new ComposableSingletons$FajrAlarmActivityKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1436389849 = ComposableLambdaKt.composableLambdaInstance(1436389849, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrAlarmActivityKt.lambda_1436389849$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-326624574, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f83lambda$326624574 = ComposableLambdaKt.composableLambdaInstance(-326624574, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrAlarmActivityKt.lambda__326624574$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1127691935, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f82lambda$1127691935 = ComposableLambdaKt.composableLambdaInstance(-1127691935, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrAlarmActivityKt.lambda__1127691935$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-648692605, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f85lambda$648692605 = ComposableLambdaKt.composableLambdaInstance(-648692605, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrAlarmActivityKt.lambda__648692605$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-591054335, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f84lambda$591054335 = ComposableLambdaKt.composableLambdaInstance(-591054335, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrAlarmActivityKt.lambda__591054335$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1127691935$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7668getLambda$1127691935$app() {
        return f82lambda$1127691935;
    }

    /* renamed from: getLambda$-326624574$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7669getLambda$326624574$app() {
        return f83lambda$326624574;
    }

    /* renamed from: getLambda$-591054335$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7670getLambda$591054335$app() {
        return f84lambda$591054335;
    }

    /* renamed from: getLambda$-648692605$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7671getLambda$648692605$app() {
        return f85lambda$648692605;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1436389849$app() {
        return lambda$1436389849;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1436389849$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C297@11095L36:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1436389849, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt.lambda$1436389849.<anonymous> (FajrAlarmActivity.kt:297)");
            }
            TextKt.m2816Text4IGK_g("5 دقائق", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__326624574$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C303@11475L37:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-326624574, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt.lambda$-326624574.<anonymous> (FajrAlarmActivity.kt:303)");
            }
            TextKt.m2816Text4IGK_g("10 دقائق", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1127691935$lambda$2(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C309@11856L37:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127691935, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt.lambda$-1127691935.<anonymous> (FajrAlarmActivity.kt:309)");
            }
            TextKt.m2816Text4IGK_g("15 دقيقة", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__648692605$lambda$3(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C329@12706L74,330@12809L28,331@12866L81:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-648692605, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt.lambda$-648692605.<anonymous> (FajrAlarmActivity.kt:329)");
            }
            IconKt.m2273Iconww6aTOc(SnoozeKt.getSnooze(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), $composer, 3120, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
            TextKt.m2816Text4IGK_g("غفوة", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__591054335$lambda$4(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C343@13458L84,344@13571L28,345@13628L89:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-591054335, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrAlarmActivityKt.lambda$-591054335.<anonymous> (FajrAlarmActivity.kt:343)");
            }
            IconKt.m2273Iconww6aTOc(NotificationsOffKt.getNotificationsOff(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), $composer, 3120, 4);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(8)), $composer, 6);
            TextKt.m2816Text4IGK_g("إيقاف المنبه", (Modifier) null, Color.INSTANCE.m4526getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
