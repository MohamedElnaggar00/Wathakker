package com.example.ui.oneui;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.MenuKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OneUI.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$OneUIKt {
    public static final ComposableSingletons$OneUIKt INSTANCE = new ComposableSingletons$OneUIKt();
    private static Function2<Composer, Integer, Unit> lambda$512895802 = ComposableLambdaKt.composableLambdaInstance(512895802, false, new Function2() { // from class: com.example.ui.oneui.ComposableSingletons$OneUIKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$OneUIKt.lambda_512895802$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$512895802$app() {
        return lambda$512895802;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_512895802$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C124@5514L11,124@5456L83:OneUI.kt#78813j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(512895802, $changed, -1, "com.example.ui.oneui.ComposableSingletons$OneUIKt.lambda$512895802.<anonymous> (OneUI.kt:124)");
            }
            IconKt.m2273Iconww6aTOc(MenuKt.getMenu(Icons.Outlined.INSTANCE), "القائمة", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnBackground(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
