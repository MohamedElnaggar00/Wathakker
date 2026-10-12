package com.example.ui.screens;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EmojiEventsKt;
import androidx.compose.material.icons.outlined.HistoryKt;
import androidx.compose.material.icons.outlined.LocalFireDepartmentKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.example.ui.oneui.OneUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatisticsScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$StatisticsScreenKt {
    public static final ComposableSingletons$StatisticsScreenKt INSTANCE = new ComposableSingletons$StatisticsScreenKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1332868377 = ComposableLambdaKt.composableLambdaInstance(1332868377, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$StatisticsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$StatisticsScreenKt.lambda_1332868377$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-224931044, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f105lambda$224931044 = ComposableLambdaKt.composableLambdaInstance(-224931044, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$StatisticsScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$StatisticsScreenKt.lambda__224931044$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-718958445, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f106lambda$718958445 = ComposableLambdaKt.composableLambdaInstance(-718958445, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$StatisticsScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$StatisticsScreenKt.lambda__718958445$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1126873205 = ComposableLambdaKt.composableLambdaInstance(1126873205, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$StatisticsScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$StatisticsScreenKt.lambda_1126873205$lambda$3((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1733817710, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f104lambda$1733817710 = ComposableLambdaKt.composableLambdaInstance(-1733817710, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$StatisticsScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$StatisticsScreenKt.lambda__1733817710$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1733817710$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7711getLambda$1733817710$app() {
        return f104lambda$1733817710;
    }

    /* renamed from: getLambda$-224931044$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7712getLambda$224931044$app() {
        return f105lambda$224931044;
    }

    /* renamed from: getLambda$-718958445$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7713getLambda$718958445$app() {
        return f106lambda$718958445;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1126873205$app() {
        return lambda$1126873205;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1332868377$app() {
        return lambda$1332868377;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1332868377$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C76@3965L31:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1332868377, $changed, -1, "com.example.ui.screens.ComposableSingletons$StatisticsScreenKt.lambda$1332868377.<anonymous> (StatisticsScreen.kt:76)");
            }
            OneUIKt.SectionLabel("الفترات الزمنية", null, false, $composer, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__224931044$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C92@4849L50:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-224931044, $changed, -1, "com.example.ui.screens.ComposableSingletons$StatisticsScreenKt.lambda$-224931044.<anonymous> (StatisticsScreen.kt:92)");
            }
            OneUIKt.m7683OneUIIconBadgeaMcp0Q(LocalFireDepartmentKt.getLocalFireDepartment(Icons.Outlined.INSTANCE), 0L, 0.0f, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__718958445$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C98@5228L42:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-718958445, $changed, -1, "com.example.ui.screens.ComposableSingletons$StatisticsScreenKt.lambda$-718958445.<anonymous> (StatisticsScreen.kt:98)");
            }
            OneUIKt.m7683OneUIIconBadgeaMcp0Q(EmojiEventsKt.getEmojiEvents(Icons.Outlined.INSTANCE), 0L, 0.0f, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1126873205$lambda$3(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C104@5515L28:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1126873205, $changed, -1, "com.example.ui.screens.ComposableSingletons$StatisticsScreenKt.lambda$1126873205.<anonymous> (StatisticsScreen.kt:104)");
            }
            OneUIKt.SectionLabel("آخر القراءات", null, false, $composer, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1733817710$lambda$4(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C114@6085L38:StatisticsScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1733817710, $changed, -1, "com.example.ui.screens.ComposableSingletons$StatisticsScreenKt.lambda$-1733817710.<anonymous> (StatisticsScreen.kt:114)");
            }
            OneUIKt.m7683OneUIIconBadgeaMcp0Q(HistoryKt.getHistory(Icons.Outlined.INSTANCE), 0L, 0.0f, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
