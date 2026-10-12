package com.example.ui.screens;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.NotificationsOffKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.example.ui.oneui.OneUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemindersScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$RemindersScreenKt {
    public static final ComposableSingletons$RemindersScreenKt INSTANCE = new ComposableSingletons$RemindersScreenKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1944684617 = ComposableLambdaKt.composableLambdaInstance(1944684617, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$RemindersScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$RemindersScreenKt.lambda_1944684617$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1944684617$app() {
        return lambda$1944684617;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1944684617$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C33@1213L67:RemindersScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1944684617, $changed, -1, "com.example.ui.screens.ComposableSingletons$RemindersScreenKt.lambda$1944684617.<anonymous> (RemindersScreen.kt:33)");
            }
            OneUIKt.OneUIEmptyState("لا توجد تنبيهات", NotificationsOffKt.getNotificationsOff(Icons.Outlined.INSTANCE), null, $composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
