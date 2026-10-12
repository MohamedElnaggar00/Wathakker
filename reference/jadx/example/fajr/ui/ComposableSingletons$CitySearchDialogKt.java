package com.example.fajr.ui;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CloseKt;
import androidx.compose.material.icons.outlined.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: CitySearchDialog.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$CitySearchDialogKt {
    public static final ComposableSingletons$CitySearchDialogKt INSTANCE = new ComposableSingletons$CitySearchDialogKt();
    private static Function2<Composer, Integer, Unit> lambda$507763706 = ComposableLambdaKt.composableLambdaInstance(507763706, false, new Function2() { // from class: com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CitySearchDialogKt.lambda_507763706$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1579394866 = ComposableLambdaKt.composableLambdaInstance(1579394866, false, new Function2() { // from class: com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CitySearchDialogKt.lambda_1579394866$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1443367569 = ComposableLambdaKt.composableLambdaInstance(1443367569, false, new Function2() { // from class: com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CitySearchDialogKt.lambda_1443367569$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-477638408, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f81lambda$477638408 = ComposableLambdaKt.composableLambdaInstance(-477638408, false, new Function2() { // from class: com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CitySearchDialogKt.lambda__477638408$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-477638408$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7667getLambda$477638408$app() {
        return f81lambda$477638408;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1443367569$app() {
        return lambda$1443367569;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1579394866$app() {
        return lambda$1579394866;
    }

    public final Function2<Composer, Integer, Unit> getLambda$507763706$app() {
        return lambda$507763706;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_507763706$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C62@2323L56:CitySearchDialog.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(507763706, $changed, -1, "com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt.lambda$507763706.<anonymous> (CitySearchDialog.kt:62)");
            }
            IconKt.m2273Iconww6aTOc(CloseKt.getClose(Icons.Outlined.INSTANCE), "Close", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1579394866$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C72@2669L31:CitySearchDialog.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1579394866, $changed, -1, "com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt.lambda$1579394866.<anonymous> (CitySearchDialog.kt:72)");
            }
            TextKt.m2816Text4IGK_g("بحث عن مدينة أو دولة...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1443367569$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C73@2740L54:CitySearchDialog.kt#jcb7bm");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1443367569, $changed, -1, "com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt.lambda$1443367569.<anonymous> (CitySearchDialog.kt:73)");
            }
            IconKt.m2273Iconww6aTOc(SearchKt.getSearch(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__477638408$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C77@2996L56:CitySearchDialog.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-477638408, $changed, -1, "com.example.fajr.ui.ComposableSingletons$CitySearchDialogKt.lambda$-477638408.<anonymous> (CitySearchDialog.kt:77)");
            }
            IconKt.m2273Iconww6aTOc(CloseKt.getClose(Icons.Outlined.INSTANCE), "Clear", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
