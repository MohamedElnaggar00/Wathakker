package com.example.ui.hisn;

import com.example.data.HisnDao;
import com.example.data.HisnFavorite;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HisnViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.hisn.HisnViewModel$toggle$1", f = "HisnViewModel.kt", i = {0, 1}, l = {57, 57}, m = "invokeSuspend", n = {"exists", "exists"}, s = {"I$0", "I$0"})
/* loaded from: classes9.dex */
public final class HisnViewModel$toggle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $chapterId;
    final /* synthetic */ int $itemId;
    int I$0;
    int label;
    final /* synthetic */ HisnViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HisnViewModel$toggle$1(HisnViewModel hisnViewModel, int i, int i2, Continuation<? super HisnViewModel$toggle$1> continuation) {
        super(2, (Continuation) continuation);
        this.this$0 = hisnViewModel;
        this.$chapterId = i;
        this.$itemId = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation) new HisnViewModel$toggle$1(this.this$0, this.$chapterId, this.$itemId, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HisnViewModel$toggle$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Iterable value = this.this$0.getFavorites().getValue();
                int i = this.$chapterId;
                int i2 = this.$itemId;
                int i3 = 0;
                if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
                    Iterator it = value.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            HisnFavorite hisnFavorite = (HisnFavorite) it.next();
                            if (((hisnFavorite.getChapterId() == i && hisnFavorite.getItemId() == i2) ? 1 : null) != null) {
                                i3 = 1;
                            }
                        }
                    }
                }
                HisnDao hisnDao = this.this$0.dao;
                if (i3 == 0) {
                    this.I$0 = i3;
                    this.label = 2;
                    if (hisnDao.addFavorite(new HisnFavorite(0L, this.$chapterId, this.$itemId, 1, null), this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                } else {
                    this.I$0 = i3;
                    this.label = 1;
                    if (hisnDao.removeFavorite(this.$chapterId, this.$itemId, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
                int i4 = this.I$0;
                ResultKt.throwOnFailure($result);
                break;
            case 2:
                int i5 = this.I$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
