package com.example.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.core.view.MotionEventCompat;
import com.example.alarm.AlarmScheduler;
import com.example.data.AppDatabase;
import com.example.data.Dhikr;
import com.example.data.DhikrDao;
import com.example.fajr.alarm.FajrAlarmScheduler;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: BootReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.receiver.BootReceiver$onReceive$1", f = "BootReceiver.kt", i = {0, 0}, l = {MotionEventCompat.AXIS_RELATIVE_Y}, m = "invokeSuspend", n = {"db", "dao"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
final class BootReceiver$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootReceiver$onReceive$1(Context context, BroadcastReceiver.PendingResult pendingResult, Continuation<? super BootReceiver$onReceive$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BootReceiver$onReceive$1(this.$context, this.$pendingResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BootReceiver$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object enabledDhikrSync;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        AppDatabase db = AppDatabase.INSTANCE.getDatabase(this.$context);
                        DhikrDao dao = db.dhikrDao();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(db);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(dao);
                        this.label = 1;
                        enabledDhikrSync = dao.getEnabledDhikrSync(this);
                        if (enabledDhikrSync != coroutine_suspended) {
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        enabledDhikrSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterable enabledDhikrs = (List) enabledDhikrSync;
                AlarmScheduler scheduler = new AlarmScheduler(this.$context);
                Iterator it = enabledDhikrs.iterator();
                while (it.hasNext()) {
                    scheduler.schedule((Dhikr) it.next());
                }
                FajrAlarmScheduler fajrScheduler = new FajrAlarmScheduler(this.$context);
                fajrScheduler.scheduleNextFajrAlarm();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.$pendingResult.finish();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }
}
