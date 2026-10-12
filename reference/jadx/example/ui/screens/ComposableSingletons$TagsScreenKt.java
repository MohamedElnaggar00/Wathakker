package com.example.ui.screens;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.LabelKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.example.ui.oneui.OneUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TagsScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$TagsScreenKt {
    public static final ComposableSingletons$TagsScreenKt INSTANCE = new ComposableSingletons$TagsScreenKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1635241148 = ComposableLambdaKt.composableLambdaInstance(1635241148, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$TagsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$TagsScreenKt.lambda_1635241148$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1635241148$app() {
        return lambda$1635241148;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1635241148$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C78@3102L63:TagsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1635241148, $changed, -1, "com.example.ui.screens.ComposableSingletons$TagsScreenKt.lambda$1635241148.<anonymous> (TagsScreen.kt:78)");
            }
            OneUIKt.OneUIEmptyState("لا توجد تصنيفات حاليًا", LabelKt.getLabel(Icons.Outlined.INSTANCE), null, $composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
