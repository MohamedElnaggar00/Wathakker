package com.example.fajr.ui;

import android.app.KeyguardManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.example.fajr.alarm.FajrAlarmScheduler;
import com.example.fajr.data.FajrPreferences;
import com.example.fajr.sound.RingtoneHelper;
import com.example.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FajrAlarmActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/fajr/ui/FajrAlarmActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "mediaPlayer", "Landroid/media/MediaPlayer;", "vibrator", "Landroid/os/Vibrator;", "handler", "Landroid/os/Handler;", "autoStopRunnable", "Ljava/lang/Runnable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startAlarmEffects", "prefs", "Lcom/example/fajr/data/FajrPreferences;", "handleAutoStop", "stopAndFinish", "onDestroy", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FajrAlarmActivity extends ComponentActivity {
    public static final int $stable = 8;
    private Runnable autoStopRunnable;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private MediaPlayer mediaPlayer;
    private Vibrator vibrator;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            Object systemService = getSystemService("keyguard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
            KeyguardManager keyguardManager = (KeyguardManager) systemService;
            keyguardManager.requestDismissKeyguard(this, null);
        } else {
            getWindow().addFlags(6815872);
        }
        FajrPreferences prefs = new FajrPreferences(this);
        startAlarmEffects(prefs);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-772655782, true, new Function2() { // from class: com.example.fajr.ui.FajrAlarmActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FajrAlarmActivity.onCreate$lambda$6(FajrAlarmActivity.this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$6(final FajrAlarmActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C72@2737L597,72@2718L616:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-772655782, $changed, -1, "com.example.fajr.ui.FajrAlarmActivity.onCreate.<anonymous> (FajrAlarmActivity.kt:72)");
            }
            ThemeKt.MyApplicationTheme(null, false, false, ComposableLambdaKt.rememberComposableLambda(-1683052283, true, new Function2() { // from class: com.example.fajr.ui.FajrAlarmActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FajrAlarmActivity.onCreate$lambda$6$lambda$5(FajrAlarmActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$6$lambda$5(final FajrAlarmActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C73@2885L435,73@2755L565:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1683052283, $changed, -1, "com.example.fajr.ui.FajrAlarmActivity.onCreate.<anonymous>.<anonymous> (FajrAlarmActivity.kt:73)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Rtl), ComposableLambdaKt.rememberComposableLambda(1454050373, true, new Function2() { // from class: com.example.fajr.ui.FajrAlarmActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FajrAlarmActivity.onCreate$lambda$6$lambda$5$lambda$4(FajrAlarmActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$4(final FajrAlarmActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C75@2960L19,76@3016L264,74@2907L395:FajrAlarmActivity.kt#jcb7bm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454050373, $changed, -1, "com.example.fajr.ui.FajrAlarmActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FajrAlarmActivity.kt:74)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1478039672, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance(this$0);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.fajr.ui.FajrAlarmActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FajrAlarmActivity.onCreate$lambda$6$lambda$5$lambda$4$lambda$1$lambda$0(FajrAlarmActivity.this);
                    }
                };
                $composer.updateRememberedValue(obj);
                rememberedValue = obj;
            }
            Function0 function0 = (Function0) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1478041709, "CC(remember):FajrAlarmActivity.kt#9igjgp");
            boolean changedInstance2 = $composer.changedInstance(this$0);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.example.fajr.ui.FajrAlarmActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return FajrAlarmActivity.onCreate$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(FajrAlarmActivity.this, ((Integer) obj3).intValue());
                    }
                };
                $composer.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            FajrAlarmActivityKt.FajrAlarmScreen(function0, (Function1) rememberedValue2, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$4$lambda$1$lambda$0(FajrAlarmActivity this$0) {
        this$0.stopAndFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(FajrAlarmActivity this$0, int minutes) {
        FajrPreferences p = new FajrPreferences(this$0);
        p.setSnoozeCount(p.getSnoozeCount() + 1);
        new FajrAlarmScheduler(this$0).scheduleSnooze(minutes);
        this$0.stopAndFinish();
        return Unit.INSTANCE;
    }

    private final void startAlarmEffects(FajrPreferences prefs) {
        try {
            RingtoneHelper ringtoneHelper = new RingtoneHelper(this);
            Uri uri = ringtoneHelper.getValidRingtoneUri(prefs);
            float volume = prefs.getAlarmVolume() / 100.0f;
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(4).setContentType(2).build());
            mediaPlayer.setDataSource(this, uri);
            mediaPlayer.setLooping(true);
            mediaPlayer.setVolume(volume, volume);
            mediaPlayer.prepare();
            mediaPlayer.start();
            this.mediaPlayer = mediaPlayer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (prefs.isVibrationEnabled()) {
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    Object systemService = getSystemService("vibrator_manager");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                    VibratorManager vibratorManager = (VibratorManager) systemService;
                    this.vibrator = vibratorManager.getDefaultVibrator();
                } else {
                    Object systemService2 = getSystemService("vibrator");
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                    this.vibrator = (Vibrator) systemService2;
                }
                long[] pattern = {0, 800, 500, 800, 500};
                int i = Build.VERSION.SDK_INT;
                Vibrator vibrator = this.vibrator;
                if (i >= 26) {
                    if (vibrator != null) {
                        vibrator.vibrate(VibrationEffect.createWaveform(pattern, 0));
                    }
                } else if (vibrator != null) {
                    vibrator.vibrate(pattern, 0);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.autoStopRunnable = new Runnable() { // from class: com.example.fajr.ui.FajrAlarmActivity$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                FajrAlarmActivity.this.handleAutoStop();
            }
        };
        Handler handler = this.handler;
        Runnable runnable = this.autoStopRunnable;
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, 60000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAutoStop() {
        FajrPreferences prefs = new FajrPreferences(this);
        if (prefs.getSnoozeCount() < 3) {
            prefs.setSnoozeCount(prefs.getSnoozeCount() + 1);
            new FajrAlarmScheduler(this).scheduleSnooze(prefs.getMaxDurationMinutes());
        }
        stopAndFinish();
    }

    private final void stopAndFinish() {
        Runnable runnable = this.autoStopRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
            this.mediaPlayer = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Vibrator vibrator = this.vibrator;
            if (vibrator != null) {
                vibrator.cancel();
            }
            this.vibrator = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        stopAndFinish();
        super.onDestroy();
    }
}
