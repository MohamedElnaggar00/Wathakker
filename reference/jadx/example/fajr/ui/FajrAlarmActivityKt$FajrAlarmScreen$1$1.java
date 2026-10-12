package com.example.fajr.ui;

import androidx.compose.runtime.MutableState;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FajrAlarmActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.fajr.ui.FajrAlarmActivityKt$FajrAlarmScreen$1$1", f = "FajrAlarmActivity.kt", i = {0, 0, 0, 0}, l = {196}, m = "invokeSuspend", n = {"timeSdf", "amPmSdf", "dateSdf", "now"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes11.dex */
public final class FajrAlarmActivityKt$FajrAlarmScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $currentDateStr$delegate;
    final /* synthetic */ MutableState<String> $currentTimeStr$delegate;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FajrAlarmActivityKt$FajrAlarmScreen$1$1(MutableState<String> mutableState, MutableState<String> mutableState2, Continuation<? super FajrAlarmActivityKt$FajrAlarmScreen$1$1> continuation) {
        super(2, continuation);
        this.$currentTimeStr$delegate = mutableState;
        this.$currentDateStr$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FajrAlarmActivityKt$FajrAlarmScreen$1$1(this.$currentTimeStr$delegate, this.$currentDateStr$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FajrAlarmActivityKt$FajrAlarmScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00aa -> B:7:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object $result) {
        SimpleDateFormat dateSdf;
        SimpleDateFormat amPmSdf;
        SimpleDateFormat amPmSdf2;
        FajrAlarmActivityKt$FajrAlarmScreen$1$1 fajrAlarmActivityKt$FajrAlarmScreen$1$1;
        FajrAlarmActivityKt$FajrAlarmScreen$1$1 fajrAlarmActivityKt$FajrAlarmScreen$1$12;
        SimpleDateFormat timeSdf;
        SimpleDateFormat timeSdf2;
        SimpleDateFormat amPmSdf3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                SimpleDateFormat timeSdf3 = new SimpleDateFormat("hh:mm", new Locale("ar"));
                SimpleDateFormat amPmSdf4 = new SimpleDateFormat("a", new Locale("ar"));
                dateSdf = amPmSdf4;
                amPmSdf = new SimpleDateFormat("EEEE, d MMMM yyyy", new Locale("ar"));
                amPmSdf2 = timeSdf3;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1 = this;
                Date now = new Date();
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.$currentTimeStr$delegate.setValue(amPmSdf2.format(now) + " " + dateSdf.format(now));
                MutableState<String> mutableState = fajrAlarmActivityKt$FajrAlarmScreen$1$1.$currentDateStr$delegate;
                String format = amPmSdf.format(now);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                mutableState.setValue(format);
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$0 = amPmSdf2;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$1 = dateSdf;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$2 = amPmSdf;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$3 = SpillingKt.nullOutSpilledVariable(now);
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.label = 1;
                if (DelayKt.delay(1000L, fajrAlarmActivityKt$FajrAlarmScreen$1$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SimpleDateFormat simpleDateFormat = amPmSdf;
                fajrAlarmActivityKt$FajrAlarmScreen$1$12 = fajrAlarmActivityKt$FajrAlarmScreen$1$1;
                timeSdf = amPmSdf2;
                timeSdf2 = dateSdf;
                amPmSdf3 = simpleDateFormat;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1 = fajrAlarmActivityKt$FajrAlarmScreen$1$12;
                amPmSdf = amPmSdf3;
                dateSdf = timeSdf2;
                amPmSdf2 = timeSdf;
                Date now2 = new Date();
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.$currentTimeStr$delegate.setValue(amPmSdf2.format(now2) + " " + dateSdf.format(now2));
                MutableState<String> mutableState2 = fajrAlarmActivityKt$FajrAlarmScreen$1$1.$currentDateStr$delegate;
                String format2 = amPmSdf.format(now2);
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                mutableState2.setValue(format2);
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$0 = amPmSdf2;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$1 = dateSdf;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$2 = amPmSdf;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$3 = SpillingKt.nullOutSpilledVariable(now2);
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.label = 1;
                if (DelayKt.delay(1000L, fajrAlarmActivityKt$FajrAlarmScreen$1$1) == coroutine_suspended) {
                }
            case 1:
                SimpleDateFormat dateSdf2 = (SimpleDateFormat) this.L$2;
                SimpleDateFormat amPmSdf5 = (SimpleDateFormat) this.L$1;
                SimpleDateFormat timeSdf4 = (SimpleDateFormat) this.L$0;
                ResultKt.throwOnFailure($result);
                timeSdf = timeSdf4;
                timeSdf2 = amPmSdf5;
                amPmSdf3 = dateSdf2;
                fajrAlarmActivityKt$FajrAlarmScreen$1$12 = this;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1 = fajrAlarmActivityKt$FajrAlarmScreen$1$12;
                amPmSdf = amPmSdf3;
                dateSdf = timeSdf2;
                amPmSdf2 = timeSdf;
                Date now22 = new Date();
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.$currentTimeStr$delegate.setValue(amPmSdf2.format(now22) + " " + dateSdf.format(now22));
                MutableState<String> mutableState22 = fajrAlarmActivityKt$FajrAlarmScreen$1$1.$currentDateStr$delegate;
                String format22 = amPmSdf.format(now22);
                Intrinsics.checkNotNullExpressionValue(format22, "format(...)");
                mutableState22.setValue(format22);
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$0 = amPmSdf2;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$1 = dateSdf;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$2 = amPmSdf;
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.L$3 = SpillingKt.nullOutSpilledVariable(now22);
                fajrAlarmActivityKt$FajrAlarmScreen$1$1.label = 1;
                if (DelayKt.delay(1000L, fajrAlarmActivityKt$FajrAlarmScreen$1$1) == coroutine_suspended) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
