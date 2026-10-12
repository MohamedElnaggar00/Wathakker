package com.example.ui.screens;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AlarmKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: MainScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FajrTabIcon implements Function3<Color, Composer, Integer, Unit> {
    public static final FajrTabIcon INSTANCE = new FajrTabIcon();

    FajrTabIcon() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Color color, Composer composer, Integer num) {
        m7715invokeek8zF_U(color.m4499unboximpl(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ek8zF_U, reason: not valid java name */
    public final void m7715invokeek8zF_U(long it, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "CN(it:c#ui.graphics.Color)52@2496L77:MainScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(it) ? 4 : 2;
        }
        if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(467767065, $dirty, -1, "com.example.ui.screens.ComposableSingletons$MainScreenKt.lambda$467767065.<anonymous> (MainScreen.kt:52)");
        }
        IconKt.m2273Iconww6aTOc(AlarmKt.getAlarm(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), it, $composer, (($dirty << 9) & 7168) | 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
