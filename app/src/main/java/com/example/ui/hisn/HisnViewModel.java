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
    final MutableStateFlow<Boolean> _onlyFavorites;
    final MutableStateFlow<String> _query;
    final StateFlow<List<HisnItem>> allItems;
    final StateFlow<List<HisnChapter>> chapters;
    final HisnDao dao;
    final StateFlow<List<HisnFavorite>> favorites;
    final StateFlow<Map<Integer, Integer>> itemCounts;
    final StateFlow<Boolean> onlyFavorites;
    final StateFlow<String> query;
    final StateFlow<Set<Integer>> readToday;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HisnViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.dao = AppDatabase.Companion.getDatabase(application).hisnDao();
        this._query = StateFlowKt.MutableStateFlow("");
        this.query = FlowKt.asStateFlow(this._query);
        this._onlyFavorites = StateFlowKt.MutableStateFlow(false);
        this.onlyFavorites = FlowKt.asStateFlow(this._onlyFavorites);
        this.chapters = FlowKt.stateIn(this.dao.chapters(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed(5000L, 0L), CollectionsKt.emptyList());
        this.allItems = FlowKt.stateIn(this.dao.allItems(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed(5000L, 0L), CollectionsKt.emptyList());
        final Flow itemCounts = this.dao.itemCounts();
        this.itemCounts = FlowKt.stateIn(FlowKt.map((Flow) itemCounts, (kotlin.jvm.functions.Function2) (value, c) -> { java.util.LinkedHashMap m = new java.util.LinkedHashMap(); for (Object o : (java.util.List) value) { ChapterItemCount cc = (ChapterItemCount) o; m.put(Integer.valueOf(cc.getChapterId()), Integer.valueOf(cc.getItemCount())); } return m; }), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed(5000L, 0L), MapsKt.emptyMap());
        this.favorites = FlowKt.stateIn(this.dao.favorites(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed(5000L, 0L), CollectionsKt.emptyList());
        final Flow chaptersReadOn = this.dao.chaptersReadOn(getToday());
        this.readToday = FlowKt.stateIn(FlowKt.map((Flow) chaptersReadOn, (kotlin.jvm.functions.Function2) (value, c) -> { return CollectionsKt.toSet((java.util.List) value); }), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed(5000L, 0L), SetsKt.emptySet());
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), kotlinx.coroutines.CoroutineStart.DEFAULT, new AnonymousClass1(null));
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
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return (Continuation) new AnonymousClass1((Continuation) continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), kotlinx.coroutines.CoroutineStart.DEFAULT, new HisnViewModel$toggle$1(this, chapterId, itemId, null));
    }

    public final void markChapterRead(int chapterId) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), kotlinx.coroutines.CoroutineStart.DEFAULT, new HisnViewModel$markChapterRead$1(this, chapterId, null));
    }
}
