package com.example.ui.screens;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.MenuBookKt;
import androidx.compose.material.icons.outlined.FormatListBulletedKt;
import androidx.compose.material.icons.outlined.HomeKt;
import androidx.compose.material.icons.outlined.MosqueKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: MainScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$MainScreenKt {
    public static final ComposableSingletons$MainScreenKt INSTANCE = new ComposableSingletons$MainScreenKt();

    /* renamed from: lambda$-700429190, reason: not valid java name */
    private static Function3<Color, Composer, Integer, Unit> f98lambda$700429190 = ComposableLambdaKt.composableLambdaInstance(-700429190, false, new Function3<Color, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ComposableSingletons$MainScreenKt$lambda$-700429190$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Color color, Composer composer, Integer num) {
            m7703invokeek8zF_U(color.m4499unboximpl(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ek8zF_U, reason: not valid java name */
        public final void m7703invokeek8zF_U(long it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "CN(it:c#ui.graphics.Color)51@2381L75:MainScreen.kt#2thlc2");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(it) ? 4 : 2;
            }
            if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
                $composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-700429190, $dirty, -1, "com.example.ui.screens.ComposableSingletons$MainScreenKt.lambda$-700429190.<anonymous> (MainScreen.kt:51)");
            }
            IconKt.m2273Iconww6aTOc(HomeKt.getHome(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), it, $composer, (($dirty << 9) & 7168) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Color, Composer, Integer, Unit> lambda$467767065 = ComposableLambdaKt.composableLambdaInstance(467767065, false, new Function3<Color, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ComposableSingletons$MainScreenKt$lambda$467767065$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Color color, Composer composer, Integer num) {
            m7705invokeek8zF_U(color.m4499unboximpl(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ek8zF_U, reason: not valid java name */
        public final void m7705invokeek8zF_U(long it, Composer $composer, int $changed) {
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
            IconKt.m2273Iconww6aTOc(MosqueKt.getMosque(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), it, $composer, (($dirty << 9) & 7168) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Color, Composer, Integer, Unit> lambda$1635963320 = ComposableLambdaKt.composableLambdaInstance(1635963320, false, new Function3<Color, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ComposableSingletons$MainScreenKt$lambda$1635963320$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Color color, Composer composer, Integer num) {
            m7704invokeek8zF_U(color.m4499unboximpl(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ek8zF_U, reason: not valid java name */
        public final void m7704invokeek8zF_U(long it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "CN(it:c#ui.graphics.Color)53@2613L89:MainScreen.kt#2thlc2");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(it) ? 4 : 2;
            }
            if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
                $composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1635963320, $dirty, -1, "com.example.ui.screens.ComposableSingletons$MainScreenKt.lambda$1635963320.<anonymous> (MainScreen.kt:53)");
            }
            IconKt.m2273Iconww6aTOc(FormatListBulletedKt.getFormatListBulleted(Icons.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), it, $composer, (($dirty << 9) & 7168) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1490807721, reason: not valid java name */
    private static Function3<Color, Composer, Integer, Unit> f96lambda$1490807721 = ComposableLambdaKt.composableLambdaInstance(-1490807721, false, new Function3<Color, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ComposableSingletons$MainScreenKt$lambda$-1490807721$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Color color, Composer composer, Integer num) {
            m7701invokeek8zF_U(color.m4499unboximpl(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ek8zF_U, reason: not valid java name */
        public final void m7701invokeek8zF_U(long it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "CN(it:c#ui.graphics.Color)54@2744L92:MainScreen.kt#2thlc2");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(it) ? 4 : 2;
            }
            if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
                $composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490807721, $dirty, -1, "com.example.ui.screens.ComposableSingletons$MainScreenKt.lambda$-1490807721.<anonymous> (MainScreen.kt:54)");
            }
            IconKt.m2273Iconww6aTOc(MenuBookKt.getMenuBook(Icons.AutoMirrored.Outlined.INSTANCE), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), it, $composer, (($dirty << 9) & 7168) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-322611466, reason: not valid java name */
    private static Function3<Color, Composer, Integer, Unit> f97lambda$322611466 = ComposableLambdaKt.composableLambdaInstance(-322611466, false, new Function3<Color, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ComposableSingletons$MainScreenKt$lambda$-322611466$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Color color, Composer composer, Integer num) {
            m7702invokeek8zF_U(color.m4499unboximpl(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ek8zF_U, reason: not valid java name */
        public final void m7702invokeek8zF_U(long it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "CN(it:c#ui.graphics.Color)55@2882L38,55@2877L94:MainScreen.kt#2thlc2");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(it) ? 4 : 2;
            }
            int $dirty2 = $dirty;
            if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
                $composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-322611466, $dirty2, -1, "com.example.ui.screens.ComposableSingletons$MainScreenKt.lambda$-322611466.<anonymous> (MainScreen.kt:55)");
            }
            IconKt.m2272Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_tasbeeh, $composer, 0), (String) null, SizeKt.m777size3ABfNKs(Modifier.INSTANCE, Dp.m7226constructorimpl(24)), it, $composer, (($dirty2 << 9) & 7168) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$99215418 = ComposableLambdaKt.composableLambdaInstance(99215418, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MainScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainScreenKt.lambda_99215418$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1490807721$app, reason: not valid java name */
    public final Function3<Color, Composer, Integer, Unit> m7698getLambda$1490807721$app() {
        return f96lambda$1490807721;
    }

    /* renamed from: getLambda$-322611466$app, reason: not valid java name */
    public final Function3<Color, Composer, Integer, Unit> m7699getLambda$322611466$app() {
        return f97lambda$322611466;
    }

    /* renamed from: getLambda$-700429190$app, reason: not valid java name */
    public final Function3<Color, Composer, Integer, Unit> m7700getLambda$700429190$app() {
        return f98lambda$700429190;
    }

    public final Function3<Color, Composer, Integer, Unit> getLambda$1635963320$app() {
        return lambda$1635963320;
    }

    public final Function3<Color, Composer, Integer, Unit> getLambda$467767065$app() {
        return lambda$467767065;
    }

    public final Function2<Composer, Integer, Unit> getLambda$99215418$app() {
        return lambda$99215418;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_99215418$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C153@8707L10,154@8802L11,151@8567L285:MainScreen.kt#2thlc2");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(99215418, $changed, -1, "com.example.ui.screens.ComposableSingletons$MainScreenKt.lambda$99215418.<anonymous> (MainScreen.kt:151)");
            }
            TextKt.m2816Text4IGK_g("brought to you by Instinct", ClickableKt.m264clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new ComposableSingletons$AboutScreenKt$$ExternalSyntheticLambda1((UriHandler) $composer.consume(CompositionLocalsKt.getLocalUriHandler())), 7, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
