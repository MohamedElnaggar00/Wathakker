package com.example.widget;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.example.fajr.data.FajrPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetConfigActivity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/example/widget/WidgetConfigActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "appWidgetId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WidgetConfigActivity extends ComponentActivity {
    public static final int $stable = 8;
    private int appWidgetId;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setResult(0);
        Intent intent = getIntent();
        this.appWidgetId = intent != null ? intent.getIntExtra("appWidgetId", 0) : 0;
        final FajrPreferences prefs = new FajrPreferences(this);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-2001601843, true, new Function2() { // from class: com.example.widget.WidgetConfigActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WidgetConfigActivity.onCreate$lambda$3(FajrPreferences.this, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$3(final FajrPreferences $prefs, final WidgetConfigActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C51@2237L445,51@2161L521:WidgetConfigActivity.kt#9u2u6t");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2001601843, $changed, -1, "com.example.widget.WidgetConfigActivity.onCreate.<anonymous> (WidgetConfigActivity.kt:51)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Rtl), ComposableLambdaKt.rememberComposableLambda(-895058035, true, new Function2() { // from class: com.example.widget.WidgetConfigActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WidgetConfigActivity.onCreate$lambda$3$lambda$2(FajrPreferences.this, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$3$lambda$2(final FajrPreferences $prefs, final WidgetConfigActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C52@2300L368,52@2255L413:WidgetConfigActivity.kt#9u2u6t");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895058035, $changed, -1, "com.example.widget.WidgetConfigActivity.onCreate.<anonymous>.<anonymous> (WidgetConfigActivity.kt:52)");
            }
            String widgetBarColor = $prefs.getWidgetBarColor();
            ComposerKt.sourceInformationMarkerStart($composer, -1157310051, "CC(remember):WidgetConfigActivity.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($prefs) | $composer.changedInstance(this$0);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.example.widget.WidgetConfigActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return WidgetConfigActivity.onCreate$lambda$3$lambda$2$lambda$1$lambda$0(FajrPreferences.this, this$0, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            WidgetConfigActivityKt.ConfigScreen(widgetBarColor, (Function1) rememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$3$lambda$2$lambda$1$lambda$0(FajrPreferences $prefs, WidgetConfigActivity this$0, String choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        $prefs.setWidgetBarColor(choice);
        WidgetUpdater.INSTANCE.updateAll(this$0);
        this$0.setResult(-1, new Intent().putExtra("appWidgetId", this$0.appWidgetId));
        this$0.finish();
        return Unit.INSTANCE;
    }
}
