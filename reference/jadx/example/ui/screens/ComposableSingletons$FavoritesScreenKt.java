package com.example.ui.screens;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.StarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.example.ui.oneui.OneUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FavoritesScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$FavoritesScreenKt {
    public static final ComposableSingletons$FavoritesScreenKt INSTANCE = new ComposableSingletons$FavoritesScreenKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1280344781 = ComposableLambdaKt.composableLambdaInstance(1280344781, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$FavoritesScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FavoritesScreenKt.lambda_1280344781$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1280344781$app() {
        return lambda$1280344781;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1280344781$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C45@1719L59:FavoritesScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1280344781, $changed, -1, "com.example.ui.screens.ComposableSingletons$FavoritesScreenKt.lambda$1280344781.<anonymous> (FavoritesScreen.kt:45)");
            }
            OneUIKt.OneUIEmptyState("لا توجد أذكار مفضلة", StarKt.getStar(Icons.Outlined.INSTANCE), null, $composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
