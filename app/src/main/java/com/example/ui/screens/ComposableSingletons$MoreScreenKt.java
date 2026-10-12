package com.example.ui.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MoreScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$MoreScreenKt {
    public static final ComposableSingletons$MoreScreenKt INSTANCE = new ComposableSingletons$MoreScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1944419529 = ComposableLambdaKt.composableLambdaInstance(1944419529, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MoreScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MoreScreenKt.lambda_1944419529$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1944419529$app() {
        return lambda$1944419529;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1944419529$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C41@1896L13:MoreScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1944419529, $changed, -1, "com.example.ui.screens.ComposableSingletons$MoreScreenKt.lambda$1944419529.<anonymous> (MoreScreen.kt:41)");
            }
            DashboardScreenKt.ChevronIcon($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
