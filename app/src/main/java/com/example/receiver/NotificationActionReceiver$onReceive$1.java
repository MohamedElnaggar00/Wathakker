package com.example.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.core.view.MotionEventCompat;
import com.example.data.AppDatabase;
import com.example.data.DhikrRepository;
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

/* compiled from: NotificationActionReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.receiver.NotificationActionReceiver$onReceive$1", f = "NotificationActionReceiver.kt", i = {0, 0}, l = {MotionEventCompat.AXIS_GENERIC_6}, m = "invokeSuspend", n = {"db", "repo"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
final class NotificationActionReceiver$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $dhikrId;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionReceiver$onReceive$1(Context context, int i, BroadcastReceiver.PendingResult pendingResult, Continuation<? super NotificationActionReceiver$onReceive$1> continuation) {
        super(2, (Continuation) continuation);
        this.$context = context;
        this.$dhikrId = i;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationActionReceiver$onReceive$1(this.$context, this.$dhikrId, this.$pendingResult, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationActionReceiver$onReceive$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        AppDatabase db = AppDatabase.Companion.getDatabase(this.$context);
                        DhikrRepository repo = new DhikrRepository(db.dhikrDao(), db.tagDao(), db.historyDao());
                        this.L$0 = SpillingKt.nullOutSpilledVariable(db);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(repo);
                        this.label = 1;
                        if (repo.markAsRead(this.$dhikrId, this) != coroutine_suspended) {
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        } finally {
            this.$pendingResult.finish();
        }
    }
}
