package com.example.ui.hisn;

import android.app.Application;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.example.data.AppDatabase;
import com.example.data.ChapterItemCount;
import com.example.data.HisnChapter;
import com.example.data.HisnDao;
import com.example.data.HisnFavorite;
import com.example.data.HisnImporter;
import com.example.data.HisnItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: HisnViewModel.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$J\u0016\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020$J\u0018\u00100\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020$H\u0002J\u000e\u00101\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#0\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u001c0\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0011R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0011¨\u00062"}, d2 = {"Lcom/example/ui/hisn/HisnViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "dao", "Lcom/example/data/HisnDao;", "today", "", "getToday", "()Ljava/lang/String;", "_query", "Lkotlinx/coroutines/flow/MutableStateFlow;", "query", "Lkotlinx/coroutines/flow/StateFlow;", "getQuery", "()Lkotlinx/coroutines/flow/StateFlow;", "setQuery", "", "q", "_onlyFavorites", "", "onlyFavorites", "getOnlyFavorites", "setOnlyFavorites", "v", "chapters", "", "Lcom/example/data/HisnChapter;", "getChapters", "allItems", "Lcom/example/data/HisnItem;", "getAllItems", "itemCounts", "", "", "getItemCounts", "favorites", "Lcom/example/data/HisnFavorite;", "getFavorites", "readToday", "", "getReadToday", "toggleChapterFavorite", "chapterId", "toggleItemFavorite", "itemId", "toggle", "markChapterRead", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HisnViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _onlyFavorites;
    private final MutableStateFlow<String> _query;
    private final StateFlow<List<HisnItem>> allItems;
    private final StateFlow<List<HisnChapter>> chapters;
    private final HisnDao dao;
    private final StateFlow<List<HisnFavorite>> favorites;
    private final StateFlow<Map<Integer, Integer>> itemCounts;
    private final StateFlow<Boolean> onlyFavorites;
    private final StateFlow<String> query;
    private final StateFlow<Set<Integer>> readToday;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HisnViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.dao = AppDatabase.INSTANCE.getDatabase(application).hisnDao();
        this._query = StateFlowKt.MutableStateFlow("");
        this.query = FlowKt.asStateFlow(this._query);
        this._onlyFavorites = StateFlowKt.MutableStateFlow(false);
        this.onlyFavorites = FlowKt.asStateFlow(this._onlyFavorites);
        this.chapters = FlowKt.stateIn(this.dao.chapters(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.allItems = FlowKt.stateIn(this.dao.allItems(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        final Flow itemCounts = this.dao.itemCounts();
        this.itemCounts = FlowKt.stateIn(new Flow<Map<Integer, ? extends Integer>>() { // from class: com.example.ui.hisn.HisnViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.example.ui.hisn.HisnViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes9.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "com.example.ui.hisn.HisnViewModel$special$$inlined$map$1$2", f = "HisnViewModel.kt", i = {0, 0, 0, 0, 0}, l = {AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.ui.hisn.HisnViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes9.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object value, Continuation $completion) {
                    AnonymousClass1 anonymousClass1;
                    if ($completion instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) $completion;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object $result = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            switch (anonymousClass1.label) {
                                case 0:
                                    ResultKt.throwOnFailure($result);
                                    FlowCollector $this$map_u24lambda_u245 = this.$this_unsafeFlow;
                                    Continuation $completion2 = anonymousClass1;
                                    Iterable<ChapterItemCount> iterable = (List) value;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                                    for (ChapterItemCount chapterItemCount : iterable) {
                                        Pair pair = TuplesKt.to(Boxing.boxInt(chapterItemCount.getChapterId()), Boxing.boxInt(chapterItemCount.getItemCount()));
                                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                                    }
                                    anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(value);
                                    anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                                    anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(value);
                                    anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if ($this$map_u24lambda_u245.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    break;
                                case 1:
                                    int i = anonymousClass1.I$0;
                                    Object obj = anonymousClass1.L$2;
                                    Object obj2 = anonymousClass1.L$0;
                                    ResultKt.throwOnFailure($result);
                                    break;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1($completion);
                    Object $result2 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (anonymousClass1.label) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<Integer, ? extends Integer>> flowCollector, Continuation $completion) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), MapsKt.emptyMap());
        this.favorites = FlowKt.stateIn(this.dao.favorites(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        final Flow chaptersReadOn = this.dao.chaptersReadOn(getToday());
        this.readToday = FlowKt.stateIn(new Flow<Set<? extends Integer>>() { // from class: com.example.ui.hisn.HisnViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.example.ui.hisn.HisnViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes9.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "com.example.ui.hisn.HisnViewModel$special$$inlined$map$2$2", f = "HisnViewModel.kt", i = {0, 0, 0, 0, 0}, l = {AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.ui.hisn.HisnViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes9.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object value, Continuation $completion) {
                    AnonymousClass1 $completion2;
                    if ($completion instanceof AnonymousClass1) {
                        $completion2 = (AnonymousClass1) $completion;
                        if (($completion2.label & Integer.MIN_VALUE) != 0) {
                            $completion2.label -= Integer.MIN_VALUE;
                            Object $result = $completion2.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            switch ($completion2.label) {
                                case 0:
                                    ResultKt.throwOnFailure($result);
                                    FlowCollector $this$map_u24lambda_u245 = this.$this_unsafeFlow;
                                    Set set = CollectionsKt.toSet((List) value);
                                    $completion2.L$0 = SpillingKt.nullOutSpilledVariable(value);
                                    $completion2.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                                    $completion2.L$2 = SpillingKt.nullOutSpilledVariable(value);
                                    $completion2.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                                    $completion2.I$0 = 0;
                                    $completion2.label = 1;
                                    if ($this$map_u24lambda_u245.emit(set, $completion2) != coroutine_suspended) {
                                        break;
                                    } else {
                                        return coroutine_suspended;
                                    }
                                case 1:
                                    int i = $completion2.I$0;
                                    Object obj = $completion2.L$2;
                                    Object value2 = $completion2.L$0;
                                    ResultKt.throwOnFailure($result);
                                    break;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    $completion2 = new AnonymousClass1($completion);
                    Object $result2 = $completion2.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch ($completion2.label) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Set<? extends Integer>> flowCollector, Continuation $completion) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), SetsKt.emptySet());
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getToday() {
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final StateFlow<String> getQuery() {
        return this.query;
    }

    public final void setQuery(String q) {
        Intrinsics.checkNotNullParameter(q, "q");
        this._query.setValue(q);
    }

    public final StateFlow<Boolean> getOnlyFavorites() {
        return this.onlyFavorites;
    }

    public final void setOnlyFavorites(boolean v) {
        this._onlyFavorites.setValue(Boolean.valueOf(v));
    }

    public final StateFlow<List<HisnChapter>> getChapters() {
        return this.chapters;
    }

    public final StateFlow<List<HisnItem>> getAllItems() {
        return this.allItems;
    }

    public final StateFlow<Map<Integer, Integer>> getItemCounts() {
        return this.itemCounts;
    }

    public final StateFlow<List<HisnFavorite>> getFavorites() {
        return this.favorites;
    }

    public final StateFlow<Set<Integer>> getReadToday() {
        return this.readToday;
    }

    /* compiled from: HisnViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.hisn.HisnViewModel$1", f = "HisnViewModel.kt", i = {}, l = {MotionEventCompat.AXIS_GENERIC_16}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.ui.hisn.HisnViewModel$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        if (HisnImporter.INSTANCE.ensureImported(HisnViewModel.this.getApplication(), HisnViewModel.this.dao, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
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
        }
    }

    public final void toggleChapterFavorite(int chapterId) {
        toggle(chapterId, 0);
    }

    public final void toggleItemFavorite(int chapterId, int itemId) {
        toggle(chapterId, itemId);
    }

    private final void toggle(int chapterId, int itemId) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new HisnViewModel$toggle$1(this, chapterId, itemId, null), 2, null);
    }

    public final void markChapterRead(int chapterId) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new HisnViewModel$markChapterRead$1(this, chapterId, null), 2, null);
    }
}
