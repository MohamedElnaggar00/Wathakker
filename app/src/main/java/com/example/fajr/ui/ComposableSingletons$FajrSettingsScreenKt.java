package com.example.fajr.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AudioFileKt;
import androidx.compose.material.icons.outlined.MusicNoteKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FajrSettingsScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$FajrSettingsScreenKt {
    public static final ComposableSingletons$FajrSettingsScreenKt INSTANCE = new ComposableSingletons$FajrSettingsScreenKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$431213267 = ComposableLambdaKt.composableLambdaInstance(431213267, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrSettingsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrSettingsScreenKt.lambda_431213267$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1355645662, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f86lambda$1355645662 = ComposableLambdaKt.composableLambdaInstance(-1355645662, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrSettingsScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrSettingsScreenKt.lambda__1355645662$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$911125657 = ComposableLambdaKt.composableLambdaInstance(911125657, false, new Function3() { // from class: com.example.fajr.ui.ComposableSingletons$FajrSettingsScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FajrSettingsScreenKt.lambda_911125657$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1355645662$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7672getLambda$1355645662$app() {
        return f86lambda$1355645662;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$431213267$app() {
        return lambda$431213267;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$911125657$app() {
        return lambda$911125657;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_431213267$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C270@11385L69:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431213267, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrSettingsScreenKt.lambda$431213267.<anonymous> (FajrSettingsScreen.kt:270)");
            }
            TextKt.m2816Text4IGK_g("تغيير المدينة", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1355645662$lambda$1(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C378@16633L90,379@16748L28,380@16801L38:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355645662, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrSettingsScreenKt.lambda$-1355645662.<anonymous> (FajrSettingsScreen.kt:378)");
            }
            IconKt.m2273Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
            TextKt.m2816Text4IGK_g("نغمات النظام", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_911125657$lambda$2(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C387@17111L90,388@17226L28,389@17279L34:FajrSettingsScreen.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(911125657, $changed, -1, "com.example.fajr.ui.ComposableSingletons$FajrSettingsScreenKt.lambda$911125657.<anonymous> (FajrSettingsScreen.kt:387)");
            }
            IconKt.m2273Iconww6aTOc(AudioFileKt.getAudioFile(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m782width3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(6)), $composer, 6);
            TextKt.m2816Text4IGK_g("ملف صوتي", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
