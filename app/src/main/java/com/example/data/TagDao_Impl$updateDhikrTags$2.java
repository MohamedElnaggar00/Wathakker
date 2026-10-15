package com.example.data;

import com.example.data.TagDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: TagDao_Impl.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.TagDao_Impl$updateDhikrTags$2", f = "TagDao_Impl.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class TagDao_Impl$updateDhikrTags$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ int $dhikrId;
    final /* synthetic */ List<Long> $tagIds;
    int label;
    final /* synthetic */ TagDao_Impl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagDao_Impl$updateDhikrTags$2(TagDao_Impl tagDao_Impl, int i, List<Long> list, Continuation<? super TagDao_Impl$updateDhikrTags$2> continuation) {
        super(1, (Continuation) continuation);
        this.this$0 = tagDao_Impl;
        this.$dhikrId = i;
        this.$tagIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return (Continuation) new TagDao_Impl$updateDhikrTags$2(this.this$0, this.$dhikrId, this.$tagIds, (Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TagDao_Impl$updateDhikrTags$2) (Object) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object updateDhikrTags$suspendImpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                updateDhikrTags$suspendImpl = TagDao.CC.updateDhikrTags$suspendImpl(this.this$0, this.$dhikrId, this.$tagIds, this);
                if (updateDhikrTags$suspendImpl == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
