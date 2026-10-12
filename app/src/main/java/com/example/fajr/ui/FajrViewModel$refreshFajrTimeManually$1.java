package com.example.fajr.ui;

import com.example.fajr.alarm.FajrAlarmScheduler;
import com.example.fajr.data.FajrPreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FajrViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.fajr.ui.FajrViewModel$refreshFajrTimeManually$1", f = "FajrViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class FajrViewModel$refreshFajrTimeManually$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FajrViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FajrViewModel$refreshFajrTimeManually$1(FajrViewModel fajrViewModel, Continuation<? super FajrViewModel$refreshFajrTimeManually$1> continuation) {
        super(2, continuation);
        this.this$0 = fajrViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FajrViewModel$refreshFajrTimeManually$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FajrViewModel$refreshFajrTimeManually$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        FajrPreferences fajrPreferences;
        FajrPreferences fajrPreferences2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        FajrAlarmScheduler fajrAlarmScheduler;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                mutableStateFlow = this.this$0._uiState;
                mutableStateFlow2 = this.this$0._uiState;
                mutableStateFlow.setValue(FajrSettingsState.copy$default((FajrSettingsState) mutableStateFlow2.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, true, false, false, 28671, null));
                fajrPreferences = this.this$0.prefs;
                boolean useCurrentLocation = fajrPreferences.getUseCurrentLocation();
                FajrViewModel fajrViewModel = this.this$0;
                if (!useCurrentLocation) {
                    fajrViewModel.refreshFajrTimeInternal();
                } else {
                    fajrViewModel.updateLocationFromGps();
                }
                fajrPreferences2 = this.this$0.prefs;
                if (fajrPreferences2.isAlarmEnabled()) {
                    fajrAlarmScheduler = this.this$0.scheduler;
                    fajrAlarmScheduler.scheduleNextFajrAlarm();
                }
                mutableStateFlow3 = this.this$0._uiState;
                mutableStateFlow4 = this.this$0._uiState;
                mutableStateFlow3.setValue(FajrSettingsState.copy$default((FajrSettingsState) mutableStateFlow4.getValue(), false, false, null, 0.0d, 0.0d, null, 0L, null, null, false, 0, 0, false, false, false, 28671, null));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
