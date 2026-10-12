package com.example.ui.viewmodel;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.example.alarm.AlarmScheduler;
import com.example.data.AppDatabase;
import com.example.data.Dhikr;
import com.example.data.DhikrHistory;
import com.example.data.DhikrRepository;
import com.example.data.DhikrWithTags;
import com.example.data.Tag;
import com.example.ui.theme.FontChoice;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0010J\u000e\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u0010J\u000e\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u0010J\u0010\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000104J\u0016\u0010D\u001a\u00020B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\u000e\u0010R\u001a\u00020!2\u0006\u0010S\u001a\u00020GJ\u000e\u0010T\u001a\u00020!2\u0006\u0010S\u001a\u00020GJ\u001c\u0010U\u001a\u00020!2\u0006\u0010S\u001a\u00020G2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00100>J$\u0010W\u001a\u00020!2\u0006\u0010X\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00100>J2\u0010[\u001a\u00020!2\u0006\u0010X\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00100>2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0>J,\u0010^\u001a\u00020!2\u0006\u0010S\u001a\u00020G2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00102\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0>J\u001e\u0010a\u001a\u00020!2\u0006\u0010S\u001a\u00020G2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u0010J\u001c\u0010b\u001a\u00020!2\u0006\u0010c\u001a\u00020:2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0>J0\u0010d\u001a\u00020!2\u0006\u0010e\u001a\u00020\u00102\b\b\u0002\u0010f\u001a\u00020\u00102\u0016\b\u0002\u0010g\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020!\u0018\u00010hJ\u000e\u0010i\u001a\u00020!2\u0006\u00108\u001a\u000204J\u000e\u0010j\u001a\u00020!2\u0006\u00108\u001a\u000204J\u000e\u0010k\u001a\u00020!2\u0006\u0010S\u001a\u00020GJ\u0006\u0010l\u001a\u00020!J\u000e\u0010p\u001a\u00020!2\u0006\u0010c\u001a\u00020:J\u0006\u0010q\u001a\u00020!J\u000e\u0010r\u001a\u00020!2\u0006\u0010c\u001a\u00020:J\u000e\u0010r\u001a\u00020!2\u0006\u0010S\u001a\u00020GJ\u0006\u0010s\u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0014R\u0016\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0014R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0014R\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0\u0012¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0014R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0012¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0014R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0>0\u0012¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0014R\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0>0\u0012¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0014R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0>0\u0012¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0014R\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040>0\u0012¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0014R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0>0\u0012¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0014R\u0016\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0\u0012¢\u0006\b\n\u0000\u001a\u0004\bo\u0010\u0014¨\u0006t"}, d2 = {"Lcom/example/ui/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "repository", "Lcom/example/data/DhikrRepository;", "alarmScheduler", "Lcom/example/alarm/AlarmScheduler;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "appPrefs", "_language", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "language", "Lkotlinx/coroutines/flow/StateFlow;", "getLanguage", "()Lkotlinx/coroutines/flow/StateFlow;", "_vibrationEnabled", "", "vibrationEnabled", "getVibrationEnabled", "_useDeviceFont", "useDeviceFont", "getUseDeviceFont", "_appFont", "Lcom/example/ui/theme/FontChoice;", "appFont", "getAppFont", "updateAppFont", "", "choice", "_notificationSound", "notificationSound", "getNotificationSound", "updateLanguage", "lang", "updateVibrationEnabled", "enabled", "updateUseDeviceFont", "use", "updateNotificationSound", "sound", "_searchQuery", "searchQuery", "getSearchQuery", "setSearchQuery", "query", "_selectedTag", "Lcom/example/data/Tag;", "selectedTag", "getSelectedTag", "setSelectedTag", "tag", "_tasbeehCount", "", "tasbeehCount", "getTasbeehCount", "allHistory", "", "Lcom/example/data/DhikrHistory;", "getAllHistory", "stats", "Lcom/example/ui/viewmodel/DhikrStats;", "getStats", "calculateStats", "historyList", "allDhikr", "Lcom/example/data/Dhikr;", "getAllDhikr", "favoriteDhikr", "getFavoriteDhikr", "enabledDhikr", "getEnabledDhikr", "allTags", "getAllTags", "dhikrsWithTags", "Lcom/example/data/DhikrWithTags;", "getDhikrsWithTags", "toggleFavorite", "dhikr", "toggleEnabled", "updateTimes", "newTimes", "addDhikrWithSchedule", "title", "content", "times", "addDhikrWithScheduleAndTags", "tagIds", "", "updateDhikrWithTags", "newTitle", "newContent", "updateDhikrText", "updateDhikrTags", "dhikrId", "addTag", HintConstants.AUTOFILL_HINT_NAME, "colorHex", "onCreated", "Lkotlin/Function1;", "updateTag", "deleteTag", "deleteDhikr", "incrementTasbeeh", "_selectedDhikrFromNotification", "selectedDhikrFromNotification", "getSelectedDhikrFromNotification", "onDhikrSelectedFromNotification", "clearSelectedDhikrFromNotification", "markAsRead", "resetTasbeeh", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MainViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<FontChoice> _appFont;
    private final MutableStateFlow<String> _language;
    private final MutableStateFlow<String> _notificationSound;
    private final MutableStateFlow<String> _searchQuery;
    private final MutableStateFlow<Dhikr> _selectedDhikrFromNotification;
    private final MutableStateFlow<Tag> _selectedTag;
    private final MutableStateFlow<Integer> _tasbeehCount;
    private final MutableStateFlow<Boolean> _useDeviceFont;
    private final MutableStateFlow<Boolean> _vibrationEnabled;
    private final AlarmScheduler alarmScheduler;
    private final StateFlow<List<Dhikr>> allDhikr;
    private final StateFlow<List<DhikrHistory>> allHistory;
    private final StateFlow<List<Tag>> allTags;
    private final StateFlow<FontChoice> appFont;
    private final SharedPreferences appPrefs;
    private final StateFlow<List<DhikrWithTags>> dhikrsWithTags;
    private final StateFlow<List<Dhikr>> enabledDhikr;
    private final StateFlow<List<Dhikr>> favoriteDhikr;
    private final StateFlow<String> language;
    private final StateFlow<String> notificationSound;
    private final SharedPreferences prefs;
    private final DhikrRepository repository;
    private final StateFlow<String> searchQuery;
    private final StateFlow<Dhikr> selectedDhikrFromNotification;
    private final StateFlow<Tag> selectedTag;
    private final StateFlow<DhikrStats> stats;
    private final StateFlow<Integer> tasbeehCount;
    private final StateFlow<Boolean> useDeviceFont;
    private final StateFlow<Boolean> vibrationEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.prefs = application.getSharedPreferences("tasbeeh_prefs", 0);
        this.appPrefs = application.getSharedPreferences("app_prefs", 0);
        String string = this.appPrefs.getString("language", "ar");
        this._language = StateFlowKt.MutableStateFlow(string != null ? string : "ar");
        this.language = FlowKt.asStateFlow(this._language);
        this._vibrationEnabled = StateFlowKt.MutableStateFlow(Boolean.valueOf(this.appPrefs.getBoolean("vibration_enabled", true)));
        this.vibrationEnabled = FlowKt.asStateFlow(this._vibrationEnabled);
        this._useDeviceFont = StateFlowKt.MutableStateFlow(Boolean.valueOf(this.appPrefs.getBoolean("use_device_font", true)));
        this.useDeviceFont = FlowKt.asStateFlow(this._useDeviceFont);
        FontChoice.Companion companion = FontChoice.INSTANCE;
        String string2 = this.appPrefs.getString("app_font", null);
        this._appFont = StateFlowKt.MutableStateFlow(companion.fromId(string2 == null ? this.appPrefs.getBoolean("use_device_font", true) ? "system" : "app" : string2));
        this.appFont = FlowKt.asStateFlow(this._appFont);
        String string3 = this.appPrefs.getString("notification_sound", "default");
        this._notificationSound = StateFlowKt.MutableStateFlow(string3 != null ? string3 : "default");
        this.notificationSound = FlowKt.asStateFlow(this._notificationSound);
        this._searchQuery = StateFlowKt.MutableStateFlow("");
        this.searchQuery = FlowKt.asStateFlow(this._searchQuery);
        this._selectedTag = StateFlowKt.MutableStateFlow(null);
        this.selectedTag = FlowKt.asStateFlow(this._selectedTag);
        this._tasbeehCount = StateFlowKt.MutableStateFlow(Integer.valueOf(this.prefs.getInt("count", 0)));
        this.tasbeehCount = FlowKt.asStateFlow(this._tasbeehCount);
        AppDatabase db = AppDatabase.INSTANCE.getDatabase(application);
        this.repository = new DhikrRepository(db.dhikrDao(), db.tagDao(), db.historyDao());
        this.alarmScheduler = new AlarmScheduler(application);
        this.allHistory = FlowKt.stateIn(this.repository.getAllHistory(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        final Flow allHistory = this.repository.getAllHistory();
        this.stats = FlowKt.stateIn(new Flow<DhikrStats>() { // from class: com.example.ui.viewmodel.MainViewModel$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DhikrStats> flowCollector, Continuation $completion) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.example.ui.viewmodel.MainViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes11.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ MainViewModel this$0;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$special$$inlined$map$1$2", f = "MainViewModel.kt", i = {0, 0, 0, 0, 0}, l = {AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.ui.viewmodel.MainViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
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

                public AnonymousClass2(FlowCollector flowCollector, MainViewModel mainViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = mainViewModel;
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
                    DhikrStats calculateStats;
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
                                    calculateStats = this.this$0.calculateStats((List) value);
                                    $completion2.L$0 = SpillingKt.nullOutSpilledVariable(value);
                                    $completion2.L$1 = SpillingKt.nullOutSpilledVariable($completion2);
                                    $completion2.L$2 = SpillingKt.nullOutSpilledVariable(value);
                                    $completion2.L$3 = SpillingKt.nullOutSpilledVariable($this$map_u24lambda_u245);
                                    $completion2.I$0 = 0;
                                    $completion2.label = 1;
                                    if ($this$map_u24lambda_u245.emit(calculateStats, $completion2) != coroutine_suspended) {
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
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new DhikrStats(0, 0, 0, 0, 0, null, 63, null));
        this.allDhikr = FlowKt.stateIn(this.repository.getAllDhikr(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.favoriteDhikr = FlowKt.stateIn(this.repository.getFavoriteDhikr(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.enabledDhikr = FlowKt.stateIn(this.repository.getEnabledDhikr(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.allTags = FlowKt.stateIn(this.repository.getAllTags(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.dhikrsWithTags = FlowKt.stateIn(this.repository.getDhikrsWithTags(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this._selectedDhikrFromNotification = StateFlowKt.MutableStateFlow(null);
        this.selectedDhikrFromNotification = FlowKt.asStateFlow(this._selectedDhikrFromNotification);
    }

    public final StateFlow<String> getLanguage() {
        return this.language;
    }

    public final StateFlow<Boolean> getVibrationEnabled() {
        return this.vibrationEnabled;
    }

    public final StateFlow<Boolean> getUseDeviceFont() {
        return this.useDeviceFont;
    }

    public final StateFlow<FontChoice> getAppFont() {
        return this.appFont;
    }

    public final void updateAppFont(FontChoice choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        this._appFont.setValue(choice);
        this.appPrefs.edit().putString("app_font", choice.getId()).apply();
    }

    public final StateFlow<String> getNotificationSound() {
        return this.notificationSound;
    }

    public final void updateLanguage(String lang) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        this._language.setValue(lang);
        this.appPrefs.edit().putString("language", lang).apply();
    }

    public final void updateVibrationEnabled(boolean enabled) {
        this._vibrationEnabled.setValue(Boolean.valueOf(enabled));
        this.appPrefs.edit().putBoolean("vibration_enabled", enabled).apply();
    }

    public final void updateUseDeviceFont(boolean use) {
        this._useDeviceFont.setValue(Boolean.valueOf(use));
        this.appPrefs.edit().putBoolean("use_device_font", use).apply();
    }

    public final void updateNotificationSound(String sound) {
        Intrinsics.checkNotNullParameter(sound, "sound");
        this._notificationSound.setValue(sound);
        this.appPrefs.edit().putString("notification_sound", sound).apply();
    }

    public final StateFlow<String> getSearchQuery() {
        return this.searchQuery;
    }

    public final void setSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._searchQuery.setValue(query);
    }

    public final StateFlow<Tag> getSelectedTag() {
        return this.selectedTag;
    }

    public final void setSelectedTag(Tag tag) {
        this._selectedTag.setValue(tag);
    }

    public final StateFlow<Integer> getTasbeehCount() {
        return this.tasbeehCount;
    }

    public final StateFlow<List<DhikrHistory>> getAllHistory() {
        return this.allHistory;
    }

    public final StateFlow<DhikrStats> getStats() {
        return this.stats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DhikrStats calculateStats(List<DhikrHistory> historyList) {
        Map dhikrCountsMap;
        int streak;
        if (historyList.isEmpty()) {
            return new DhikrStats(0, 0, 0, 0, 0, null, 63, null);
        }
        Calendar cal = Calendar.getInstance();
        cal.set(11, 0);
        cal.set(12, 0);
        cal.set(13, 0);
        cal.set(14, 0);
        long startOfToday = cal.getTimeInMillis();
        Object clone = cal.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar weekCal = (Calendar) clone;
        weekCal.add(6, -6);
        long startOfWeek = weekCal.getTimeInMillis();
        Object clone2 = cal.clone();
        Intrinsics.checkNotNull(clone2, "null cannot be cast to non-null type java.util.Calendar");
        Calendar monthCal = (Calendar) clone2;
        monthCal.set(5, 1);
        long startOfMonth = monthCal.getTimeInMillis();
        int todayCount = 0;
        int weekCount = 0;
        int totalCount = historyList.size();
        Map dhikrCountsMap2 = new LinkedHashMap();
        Set dateSet = new LinkedHashSet();
        int monthCount = 0;
        for (DhikrHistory item : historyList) {
            if (item.getTimestamp() >= startOfToday) {
                todayCount++;
            }
            if (item.getTimestamp() >= startOfWeek) {
                weekCount++;
            }
            if (item.getTimestamp() >= startOfMonth) {
                monthCount++;
            }
            Integer valueOf = Integer.valueOf(item.getDhikrId());
            Calendar cal2 = cal;
            Integer num = (Integer) dhikrCountsMap2.get(Integer.valueOf(item.getDhikrId()));
            dhikrCountsMap2.put(valueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            dateSet.add(item.getDateString());
            cal = cal2;
        }
        Calendar cal3 = cal;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Object clone3 = cal3.clone();
        Intrinsics.checkNotNull(clone3, "null cannot be cast to non-null type java.util.Calendar");
        Calendar checkCal = (Calendar) clone3;
        String currentDateStr = sdf.format(checkCal.getTime());
        if (dateSet.contains(currentDateStr)) {
            dhikrCountsMap = dhikrCountsMap2;
            streak = 0;
        } else {
            dhikrCountsMap = dhikrCountsMap2;
            checkCal.add(6, -1);
            currentDateStr = sdf.format(checkCal.getTime());
            streak = 0;
        }
        while (dateSet.contains(currentDateStr)) {
            streak++;
            checkCal.add(6, -1);
            currentDateStr = sdf.format(checkCal.getTime());
        }
        List topRead = CollectionsKt.sortedWith(MapsKt.toList(dhikrCountsMap), new Comparator() { // from class: com.example.ui.viewmodel.MainViewModel$calculateStats$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Integer) ((Pair) t2).getSecond(), (Integer) ((Pair) t).getSecond());
            }
        });
        return new DhikrStats(todayCount, weekCount, monthCount, totalCount, streak, topRead);
    }

    public final StateFlow<List<Dhikr>> getAllDhikr() {
        return this.allDhikr;
    }

    public final StateFlow<List<Dhikr>> getFavoriteDhikr() {
        return this.favoriteDhikr;
    }

    public final StateFlow<List<Dhikr>> getEnabledDhikr() {
        return this.enabledDhikr;
    }

    public final StateFlow<List<Tag>> getAllTags() {
        return this.allTags;
    }

    public final StateFlow<List<DhikrWithTags>> getDhikrsWithTags() {
        return this.dhikrsWithTags;
    }

    public final void toggleFavorite(Dhikr dhikr) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$toggleFavorite$1(this, dhikr, null), 3, null);
    }

    public final void toggleEnabled(Dhikr dhikr) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$toggleEnabled$1(dhikr, this, null), 3, null);
    }

    public final void updateTimes(Dhikr dhikr, List<String> newTimes) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(newTimes, "newTimes");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateTimes$1(dhikr, newTimes, this, null), 3, null);
    }

    public final void addDhikrWithSchedule(String title, String content, List<String> times) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(times, "times");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$addDhikrWithSchedule$1(title, content, times, this, null), 3, null);
    }

    public final void addDhikrWithScheduleAndTags(String title, String content, List<String> times, List<Long> tagIds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(tagIds, "tagIds");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$addDhikrWithScheduleAndTags$1(title, content, times, this, tagIds, null), 3, null);
    }

    public final void updateDhikrWithTags(Dhikr dhikr, String newTitle, String newContent, List<Long> tagIds) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        Intrinsics.checkNotNullParameter(newContent, "newContent");
        Intrinsics.checkNotNullParameter(tagIds, "tagIds");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateDhikrWithTags$1(dhikr, newTitle, newContent, this, tagIds, null), 3, null);
    }

    public final void updateDhikrText(Dhikr dhikr, String newTitle, String newContent) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        Intrinsics.checkNotNullParameter(newContent, "newContent");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateDhikrText$1(dhikr, newTitle, newContent, this, null), 3, null);
    }

    public final void updateDhikrTags(int dhikrId, List<Long> tagIds) {
        Intrinsics.checkNotNullParameter(tagIds, "tagIds");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateDhikrTags$1(this, dhikrId, tagIds, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addTag$default(MainViewModel mainViewModel, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "#008080";
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        mainViewModel.addTag(str, str2, function1);
    }

    public final void addTag(String name, String colorHex, Function1<? super Tag, Unit> onCreated) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$addTag$1(this, name, colorHex, onCreated, null), 3, null);
    }

    public final void updateTag(Tag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateTag$1(this, tag, null), 3, null);
    }

    public final void deleteTag(Tag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$deleteTag$1(this, tag, null), 3, null);
    }

    public final void deleteDhikr(Dhikr dhikr) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$deleteDhikr$1(this, dhikr, null), 3, null);
    }

    public final void incrementTasbeeh() {
        int newCount = this._tasbeehCount.getValue().intValue() + 1;
        this._tasbeehCount.setValue(Integer.valueOf(newCount));
        this.prefs.edit().putInt("count", newCount).apply();
    }

    public final StateFlow<Dhikr> getSelectedDhikrFromNotification() {
        return this.selectedDhikrFromNotification;
    }

    public final void onDhikrSelectedFromNotification(int dhikrId) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$onDhikrSelectedFromNotification$1(this, dhikrId, null), 3, null);
    }

    public final void clearSelectedDhikrFromNotification() {
        this._selectedDhikrFromNotification.setValue(null);
    }

    public final void markAsRead(int dhikrId) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$markAsRead$1(this, dhikrId, null), 3, null);
    }

    public final void markAsRead(Dhikr dhikr) {
        Intrinsics.checkNotNullParameter(dhikr, "dhikr");
        markAsRead(dhikr.getId());
    }

    public final void resetTasbeeh() {
        this._tasbeehCount.setValue(0);
        this.prefs.edit().putInt("count", 0).apply();
    }
}
