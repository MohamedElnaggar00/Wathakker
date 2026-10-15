package com.example.data;

import androidx.compose.runtime.ComposerKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppDatabase.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1", f = "AppDatabase.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {85, 94}, m = "invokeSuspend", n = {"dao\\1", "defaultAdhkar\\1", "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$1\\1\\52\\0", "tagDao\\2", "$this$forEach\\3", "defaultTags\\2", "element\\3", "it\\4", "$i$a$-let-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2\\2\\87\\0", "$i$f$forEach\\3\\94", "$i$a$-forEach-AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1$2$1\\4\\110\\2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2"})
/* loaded from: classes7.dex */
final class AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1(Continuation<? super AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1> continuation) {
        super(2, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1((Continuation) continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x019b A[Catch: Exception -> 0x01e8, TRY_LEAVE, TryCatch #1 {Exception -> 0x01e8, blocks: (B:12:0x0195, B:14:0x019b), top: B:11:0x0195 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x01ce -> B:10:0x01db). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object $result) {
        DhikrDao dhikrDao;
        AppDatabase appDatabase;
        TagDao tagDao;
        TagDao tagDao2;
        Iterable iterable;
        Iterable iterable2;
        int i;
        int i2;
        Object $result2;
        AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1 appDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
        Iterator it;
        Object $result3;
        TagDao tagDao3;
        Iterable iterable3;
        Iterable iterable4;
        Iterator it2;
        AppDatabase$Companion$getDatabase$1$instance$1$onCreate$1 appDatabase$Companion$getDatabase$1$instance$1$onCreate$12;
        int i3;
        int i4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (Exception e) {
            e = e;
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                try {
                    AppDatabase appDatabase2 = AppDatabase.INSTANCE;
                    if (appDatabase2 != null && (dhikrDao = appDatabase2.dhikrDao()) != null) {
                        List listOf = CollectionsKt.listOf((Object[]) new Dhikr[]{new Dhikr(0, "سؤال العفو والعافية", "اللهم إنك عفو تحب العفو فاعف عني", false, CollectionsKt.listOf("10:00"), true, 0, 0L, ComposerKt.providerKey, null), new Dhikr(0, "الثبات على الدين", "يا مقلب القلوب ثبت قلبي على دينك", false, CollectionsKt.listOf("14:00"), true, 0, 0L, ComposerKt.providerKey, null), new Dhikr(0, "خير الدنيا والآخرة", "اللهم آتنا في الدنيا حسنة وفي الآخرة حسنة وقنا عذاب النار", false, CollectionsKt.listOf("18:00"), true, 0, 0L, ComposerKt.providerKey, null), new Dhikr(0, "سؤال الهدى والتقى", "اللهم إني أسألك الهدى والتقى والعفاف والغنى", false, CollectionsKt.listOf("08:00"), true, 0, 0L, ComposerKt.providerKey, null), new Dhikr(0, "الإعانة على الذكر", "اللهم أعني على ذكرك وشكرك وحسن عبادتك", false, CollectionsKt.listOf("20:00"), true, 0, 0L, ComposerKt.providerKey, null)});
                        this.L$0 = SpillingKt.nullOutSpilledVariable(dhikrDao);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(listOf);
                        this.I$0 = 0;
                        this.label = 1;
                        if (dhikrDao.insertAll(listOf, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    appDatabase = AppDatabase.INSTANCE;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return Unit.INSTANCE;
                }
                if (appDatabase != null || (tagDao = appDatabase.tagDao()) == null) {
                    return Unit.INSTANCE;
                }
                Iterable listOf2 = CollectionsKt.listOf((Object[]) new Tag[]{new Tag(0L, "أذكار الصباح", "#008080", 1, null), new Tag(0L, "أذكار المساء", "#800080", 1, null), new Tag(0L, "أذكار النوم", "#1E3A8A", 1, null), new Tag(0L, "أدعية عامة", "#059669", 1, null)});
                Iterable iterable5 = listOf2;
                Iterator it3 = iterable5.iterator();
                tagDao2 = tagDao;
                iterable = listOf2;
                iterable2 = iterable5;
                i = 0;
                i2 = 0;
                $result2 = $result;
                appDatabase$Companion$getDatabase$1$instance$1$onCreate$1 = this;
                it = it3;
                try {
                    if (it.hasNext()) {
                        Object next = it.next();
                        Tag tag = (Tag) next;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.L$0 = tagDao2;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.L$1 = SpillingKt.nullOutSpilledVariable(iterable2);
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.L$2 = SpillingKt.nullOutSpilledVariable(iterable);
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.L$3 = it;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.L$4 = SpillingKt.nullOutSpilledVariable(next);
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.L$5 = SpillingKt.nullOutSpilledVariable(tag);
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.I$0 = i2;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.I$1 = i;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.I$2 = 0;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1.label = 2;
                        if (tagDao2.insertTag(tag, appDatabase$Companion$getDatabase$1$instance$1$onCreate$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        int i5 = i;
                        $result3 = $result2;
                        tagDao3 = tagDao2;
                        iterable3 = iterable2;
                        iterable4 = iterable;
                        it2 = it;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$12 = appDatabase$Companion$getDatabase$1$instance$1$onCreate$1;
                        i3 = i2;
                        i4 = i5;
                        $result2 = $result3;
                        i = i4;
                        i2 = i3;
                        appDatabase$Companion$getDatabase$1$instance$1$onCreate$1 = appDatabase$Companion$getDatabase$1$instance$1$onCreate$12;
                        it = it2;
                        iterable = iterable4;
                        iterable2 = iterable3;
                        tagDao2 = tagDao3;
                        if (it.hasNext()) {
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                int i6 = this.I$0;
                ResultKt.throwOnFailure($result);
                appDatabase = AppDatabase.INSTANCE;
                if (appDatabase != null) {
                    break;
                }
                return Unit.INSTANCE;
            case 2:
                int i7 = this.I$2;
                int i8 = this.I$1;
                int i9 = this.I$0;
                Object obj = this.L$4;
                Iterator it4 = (Iterator) this.L$3;
                Iterable iterable6 = (List) this.L$2;
                Iterable iterable7 = (Iterable) this.L$1;
                TagDao tagDao4 = (TagDao) this.L$0;
                ResultKt.throwOnFailure($result);
                tagDao3 = tagDao4;
                i3 = i9;
                iterable3 = iterable7;
                i4 = i8;
                iterable4 = iterable6;
                $result3 = $result;
                it2 = it4;
                appDatabase$Companion$getDatabase$1$instance$1$onCreate$12 = this;
                $result2 = $result3;
                i = i4;
                i2 = i3;
                appDatabase$Companion$getDatabase$1$instance$1$onCreate$1 = appDatabase$Companion$getDatabase$1$instance$1$onCreate$12;
                it = it2;
                iterable = iterable4;
                iterable2 = iterable3;
                tagDao2 = tagDao3;
                if (it.hasNext()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
