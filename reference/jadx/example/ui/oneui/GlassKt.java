package com.example.ui.oneui;

import android.os.Build;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import dev.chrisbanes.haze.HazeChildKt;
import dev.chrisbanes.haze.HazeState;
import dev.chrisbanes.haze.HazeStyle;
import dev.chrisbanes.haze.HazeTint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Glass.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"LocalHazeState", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Ldev/chrisbanes/haze/HazeState;", "getLocalHazeState", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "blurSupported", "", "getBlurSupported", "()Z", "oneUIGlass", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "base", "Landroidx/compose/ui/graphics/Color;", "alpha", "", "blurRadius", "", "oneUIGlass-T042LqI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JFILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GlassKt {
    private static final ProvidableCompositionLocal<HazeState> LocalHazeState = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: com.example.ui.oneui.GlassKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GlassKt.LocalHazeState$lambda$0();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final HazeState LocalHazeState$lambda$0() {
        return null;
    }

    public static final ProvidableCompositionLocal<HazeState> getLocalHazeState() {
        return LocalHazeState;
    }

    public static final boolean getBlurSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: oneUIGlass-T042LqI, reason: not valid java name */
    public static final Modifier m7674oneUIGlassT042LqI(Modifier oneUIGlass, Shape shape, long base, float alpha, int blurRadius, Composer $composer, int $changed, int i) {
        float alpha2;
        int blurRadius2;
        long m4487copywmQWz5c;
        Modifier m231backgroundbw27NRU$default;
        long m4487copywmQWz5c2;
        Intrinsics.checkNotNullParameter(oneUIGlass, "$this$oneUIGlass");
        Intrinsics.checkNotNullParameter(shape, "shape");
        ComposerKt.sourceInformationMarkerStart($composer, -16389748, "C(oneUIGlass)N(shape,base:c#ui.graphics.Color,alpha,blurRadius)33@1138L7:Glass.kt#78813j");
        if ((i & 4) != 0) {
            alpha2 = 0.72f;
        } else {
            alpha2 = alpha;
        }
        if ((i & 8) == 0) {
            blurRadius2 = blurRadius;
        } else {
            blurRadius2 = 28;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-16389748, $changed, -1, "com.example.ui.oneui.oneUIGlass (Glass.kt:32)");
        }
        ProvidableCompositionLocal<HazeState> providableCompositionLocal = LocalHazeState;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = $composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd($composer);
        HazeState state = (HazeState) consume;
        if (state != null && getBlurSupported()) {
            $composer.startReplaceGroup(1359521547);
            $composer.endReplaceGroup();
            Modifier clip = ClipKt.clip(oneUIGlass, shape);
            m4487copywmQWz5c2 = Color.m4487copywmQWz5c(base, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(base) : alpha2, (r12 & 2) != 0 ? Color.m4495getRedimpl(base) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(base) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(base) : 0.0f);
            m231backgroundbw27NRU$default = HazeChildKt.hazeEffect$default(clip, state, new HazeStyle(base, new HazeTint(m4487copywmQWz5c2, 0, 2, (DefaultConstructorMarker) null), Dp.m7226constructorimpl(blurRadius2), 0.04f, (HazeTint) null, 16, (DefaultConstructorMarker) null), null, 4, null);
        } else {
            $composer.startReplaceGroup(1359879659);
            ComposerKt.sourceInformation($composer, "47@1622L21");
            Modifier clip2 = ClipKt.clip(oneUIGlass, shape);
            m4487copywmQWz5c = Color.m4487copywmQWz5c(base, (r12 & 1) != 0 ? Color.m4491getAlphaimpl(base) : DarkThemeKt.isSystemInDarkTheme($composer, 0) ? 0.96f : 0.97f, (r12 & 2) != 0 ? Color.m4495getRedimpl(base) : 0.0f, (r12 & 4) != 0 ? Color.m4494getGreenimpl(base) : 0.0f, (r12 & 8) != 0 ? Color.m4492getBlueimpl(base) : 0.0f);
            m231backgroundbw27NRU$default = BackgroundKt.m231backgroundbw27NRU$default(clip2, m4487copywmQWz5c, null, 2, null);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return m231backgroundbw27NRU$default;
    }
}
