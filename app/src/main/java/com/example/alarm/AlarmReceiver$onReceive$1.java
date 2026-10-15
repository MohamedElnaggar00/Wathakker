package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.example.data.AppDatabase;
import com.example.data.Dhikr;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AlarmReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.alarm.AlarmReceiver$onReceive$1", f = "AlarmReceiver.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"db"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class AlarmReceiver$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $id;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmReceiver$onReceive$1(Context context, int i, BroadcastReceiver.PendingResult pendingResult, Continuation<? super AlarmReceiver$onReceive$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$id = i;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlarmReceiver$onReceive$1(this.$context, this.$id, this.$pendingResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AlarmReceiver$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object dhikrById;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    AppDatabase db = AppDatabase.Companion.getDatabase(this.$context);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(db);
                    this.label = 1;
                    dhikrById = db.dhikrDao().getDhikrById(this.$id, this);
                    if (dhikrById != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    dhikrById = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Dhikr dhikr = (Dhikr) dhikrById;
            if (dhikr != null && dhikr.isEnabled()) {
                new AlarmScheduler(this.$context).schedule(dhikr);
            }
            this.$pendingResult.finish();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }
}
