package com.example.prayer;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrayerTimesScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.prayer.PrayerTimesScreenKt$PrayerTimesScreen$1$1", f = "PrayerTimesScreen.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class PrayerTimesScreenKt$PrayerTimesScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $now$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrayerTimesScreenKt$PrayerTimesScreen$1$1(MutableState<Long> mutableState, Continuation<? super PrayerTimesScreenKt$PrayerTimesScreen$1$1> continuation) {
        super(2, continuation);
        this.$now$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrayerTimesScreenKt$PrayerTimesScreen$1$1(this.$now$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrayerTimesScreenKt$PrayerTimesScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        PrayerTimesScreenKt$PrayerTimesScreen$1$1 prayerTimesScreenKt$PrayerTimesScreen$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                prayerTimesScreenKt$PrayerTimesScreen$1$1 = this;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                prayerTimesScreenKt$PrayerTimesScreen$1$1 = this;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            PrayerTimesScreenKt.PrayerTimesScreen$lambda$18(prayerTimesScreenKt$PrayerTimesScreen$1$1.$now$delegate, System.currentTimeMillis());
            prayerTimesScreenKt$PrayerTimesScreen$1$1.label = 1;
        } while (DelayKt.delay(1000L, prayerTimesScreenKt$PrayerTimesScreen$1$1) != coroutine_suspended);
        return coroutine_suspended;
    }
}
