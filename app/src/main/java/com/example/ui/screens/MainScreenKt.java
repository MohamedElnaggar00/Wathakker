package com.example.ui.screens;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.LabelKt;
import androidx.compose.material.icons.outlined.BarChartKt;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.material.icons.outlined.NotificationsKt;
import androidx.compose.material.icons.outlined.SettingsKt;
import androidx.compose.material.icons.outlined.StarKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.example.data.Dhikr;
import com.example.data.HisnChapter;
import com.example.data.Tag;
import com.example.fajr.ui.FajrSettingsScreenKt;
import com.example.fajr.ui.FajrViewModel;
import com.example.lockwidgets.HomeWidgets;
import com.example.prayer.PrayerTimesScreenKt;
import com.example.ui.hisn.HisnScreensKt;
import com.example.ui.hisn.HisnViewModel;
import com.example.ui.oneui.BottomTab;
import com.example.ui.oneui.GlassKt;
import com.example.ui.oneui.HeaderTools;
import com.example.ui.oneui.OneUIDrawerItem;
import com.example.ui.oneui.OneUIKt;
import com.example.ui.viewmodel.MainViewModel;
import dev.chrisbanes.haze.HazeKt;
import dev.chrisbanes.haze.HazeState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainScreen.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004¨\u0006\r²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002"}, d2 = {"oneUITabs", "", "Lcom/example/ui/oneui/BottomTab;", "getOneUITabs", "()Ljava/util/List;", "oneUIDrawerItems", "Lcom/example/ui/oneui/OneUIDrawerItem;", "getOneUIDrawerItems", "MainScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;I)V", "app", "selectedDhikrNotif", "Lcom/example/data/Dhikr;", "allTags", "Lcom/example/data/Tag;", "showAddDialog", "", "drawerOpen", "backEntry", "Landroidx/navigation/NavBackStackEntry;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MainScreenKt {
    private static final List<BottomTab> oneUITabs = CollectionsKt.listOf((Object[]) new BottomTab[]{new BottomTab("prayer", "الصلاة", ComposableSingletons$MainScreenKt.INSTANCE.getLambda$467767065$app()), new BottomTab("azkar", "الأذكار", ComposableSingletons$MainScreenKt.INSTANCE.getLambda$1635963320$app()), new BottomTab("hisn", "حصن المسلم", ComposableSingletons$MainScreenKt.INSTANCE.m7698getLambda$1490807721$app()), new BottomTab("fajr_settings", "الفجر", FajrTabIcon.INSTANCE), new BottomTab("tasbeeh", "السبحة", ComposableSingletons$MainScreenKt.INSTANCE.m7699getLambda$322611466$app())});
    private static final List<OneUIDrawerItem> oneUIDrawerItems = CollectionsKt.listOf((Object[]) new OneUIDrawerItem[]{new OneUIDrawerItem("favorites", "المفضلة", StarKt.getStar(Icons.Outlined.INSTANCE), ColorKt.Color(4293243989L), null), new OneUIDrawerItem("reminders", "التنبيهات", NotificationsKt.getNotifications(Icons.Outlined.INSTANCE), ColorKt.Color(4293243989L), null), new OneUIDrawerItem("statistics", "الإحصائيات", BarChartKt.getBarChart(Icons.Outlined.INSTANCE), ColorKt.Color(4283289796L), null), new OneUIDrawerItem("tags", "التصنيفات", LabelKt.getLabel(Icons.AutoMirrored.Outlined.INSTANCE), ColorKt.Color(4290617322L), null), new OneUIDrawerItem("settings", "الإعدادات", SettingsKt.getSettings(Icons.Outlined.INSTANCE), ColorKt.Color(4287669422L), null), new OneUIDrawerItem("about", "حول التطبيق", InfoKt.getInfo(Icons.Outlined.INSTANCE), ColorKt.Color(4287532691L), null)});

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$89(MainViewModel mainViewModel, int i, Composer composer, int i2) {
        MainScreen(mainViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final List<BottomTab> getOneUITabs() {
        return oneUITabs;
    }

    public static final List<OneUIDrawerItem> getOneUIDrawerItems() {
        return oneUIDrawerItems;
    }

    public static final void MainScreen(MainViewModel viewModel, Composer $composer, final int $changed) {
        Composer $composer2;
        NavHostController navController;
        NavDestination destination;
        Object mutableStateOf$default;
        Object mutableStateOf$default2;
        final MainViewModel viewModel2 = viewModel;
        Intrinsics.checkNotNullParameter(viewModel2, "viewModel");
        Composer $composer3 = $composer.startRestartGroup(-424675079);
        ComposerKt.sourceInformation($composer3, "C(MainScreen)N(viewModel)70@3732L23,71@3776L19,72@3866L29,73@3933L29,74@4002L11,75@4039L34,76@4096L34,77@4183L18,77@4152L50,78@4219L24,80@4280L30,85@4552L5063,85@4492L5123:MainScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel2) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-424675079, $dirty2, -1, "com.example.ui.screens.MainScreen (MainScreen.kt:69)");
            }
            NavHostController navController2 = NavHostControllerKt.rememberNavController(new Navigator[0], $composer3, 0);
            HeaderTools.setNav(navController2);
            HazeState hazeState = HazeKt.rememberHazeState(false, $composer3, 0, 1);
            final State selectedDhikrNotif$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel2.getSelectedDhikrFromNotification(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer3, 0, 7);
            final State allTags$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel2.getAllTags(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer3, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel3 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HisnViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer3, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | ((0 << 3) & 57344), 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final HisnViewModel hisnViewModel = (HisnViewModel) viewModel3;
            ComposerKt.sourceInformationMarkerStart($composer3, -90845413, "CC(remember):MainScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                navController = navController2;
                mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default2);
                rememberedValue = mutableStateOf$default2;
            } else {
                navController = navController2;
            }
            final MutableState showAddDialog$delegate = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -90843589, "CC(remember):MainScreen.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(mutableStateOf$default);
                rememberedValue2 = mutableStateOf$default;
            }
            final MutableState drawerOpen$delegate = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -90840821, "CC(remember):MainScreen.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int size;
                        size = MainScreenKt.oneUITabs.size();
                        return Integer.valueOf(size);
                    }
                };
                $composer3.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final PagerState pagerState = PagerStateKt.rememberPagerState(HomeWidgets.initialPage(), 0.0f, (Function0) rememberedValue3, $composer3, 384, 2);
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(rememberedValue4);
            }
            final CoroutineScope scope = (CoroutineScope) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            State backEntry$delegate = NavHostControllerKt.currentBackStackEntryAsState(navController, $composer3, 0);
            NavBackStackEntry MainScreen$lambda$10 = MainScreen$lambda$10(backEntry$delegate);
            String route = (MainScreen$lambda$10 == null || (destination = MainScreen$lambda$10.getDestination()) == null) ? null : destination.getRoute();
            final boolean isTab = Intrinsics.areEqual(route, "tabs");
            final String currentTabRoute = oneUITabs.get(RangesKt.coerceIn(pagerState.getCurrentPage(), 0, oneUITabs.size() - 1)).getRoute();
            $composer2 = $composer3;
            viewModel2 = viewModel;
            final String route2 = route;
            final NavHostController navController3 = navController;
            CompositionLocalKt.CompositionLocalProvider(GlassKt.getLocalHazeState().provides(hazeState), ComposableLambdaKt.rememberComposableLambda(-458564167, true, new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainScreenKt.MainScreen$lambda$88(MainViewModel.this, navController3, pagerState, hisnViewModel, isTab, currentTabRoute, scope, route2, drawerOpen$delegate, showAddDialog$delegate, allTags$delegate, selectedDhikrNotif$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MainScreenKt.MainScreen$lambda$89(MainViewModel.this, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final Dhikr MainScreen$lambda$0(State<Dhikr> state) {
        return (Dhikr) state.getValue();
    }

    private static final List<Tag> MainScreen$lambda$1(State<? extends List<Tag>> state) {
        return (List) state.getValue();
    }

    private static final boolean MainScreen$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MainScreen$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MainScreen$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MainScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final NavBackStackEntry MainScreen$lambda$10(State<NavBackStackEntry> state) {
        return (NavBackStackEntry) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit MainScreen$lambda$88(final MainViewModel $viewModel, final NavHostController $navController, final PagerState $pagerState, final HisnViewModel $hisnViewModel, boolean $isTab, String $currentTabRoute, final CoroutineScope $scope, String $route, final MutableState $drawerOpen$delegate, final MutableState $showAddDialog$delegate, State $allTags$delegate, State $selectedDhikrNotif$delegate, Composer $composer, int $changed) {
        BoxScope boxScope;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        boolean changed;
        Object rememberedValue5;
        String str;
        BoxScope boxScope2;
        Composer composer;
        String str2;
        boolean changedInstance;
        Object rememberedValue6;
        final MutableState mutableState;
        Object rememberedValue7;
        final MainViewModel mainViewModel;
        Composer composer2;
        final Dhikr MainScreen$lambda$0;
        Function0 function0;
        final MutableState mutableState2;
        List<Tag> list;
        ComposerKt.sourceInformation($composer, "C86@4562L4332:MainScreen.kt#2thlc2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-458564167, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous> (MainScreen.kt:86)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer m3828constructorimpl = Updater.m3828constructorimpl($composer);
            Updater.m3835setimpl(m3828constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3835setimpl(m3828constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3828constructorimpl.getInserting() && Intrinsics.areEqual(m3828constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int i3 = ((6 >> 6) & 112) | 6;
                boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -1153934996, "C93@4983L73,94@5095L23,95@5161L24,96@5227L74,97@5320L2359,87@4604L3075,145@8334L105,149@8469L22,141@8147L737:MainScreen.kt#2thlc2");
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, 655520872, "CC(remember):MainScreen.kt#9igjgp");
                rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$13$lambda$12((AnimatedContentTransitionScope) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                Function1 function1 = (Function1) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 655524406, "CC(remember):MainScreen.kt#9igjgp");
                rememberedValue2 = $composer.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$15$lambda$14((AnimatedContentTransitionScope) obj3);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    rememberedValue2 = obj2;
                }
                Function1 function12 = (Function1) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 655526519, "CC(remember):MainScreen.kt#9igjgp");
                rememberedValue3 = $composer.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$17$lambda$16((AnimatedContentTransitionScope) obj4);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    rememberedValue3 = obj3;
                }
                Function1 function13 = (Function1) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 655528681, "CC(remember):MainScreen.kt#9igjgp");
                rememberedValue4 = $composer.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$20$lambda$19((AnimatedContentTransitionScope) obj5);
                        }
                    };
                    $composer.updateRememberedValue(obj4);
                    rememberedValue4 = obj4;
                }
                Function1 function14 = (Function1) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 655533942, "CC(remember):MainScreen.kt#9igjgp");
                changed = $composer.changed($pagerState) | $composer.changedInstance($viewModel) | $composer.changedInstance($navController) | $composer.changedInstance($hisnViewModel);
                rememberedValue5 = $composer.rememberedValue();
                if (!changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    str = "CC(remember):MainScreen.kt#9igjgp";
                    boxScope2 = boxScope;
                    composer = $composer;
                    rememberedValue5 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68(PagerState.this, $viewModel, $navController, $hisnViewModel, $drawerOpen$delegate, $showAddDialog$delegate, (NavGraphBuilder) obj5);
                        }
                    };
                    $composer.updateRememberedValue(rememberedValue5);
                } else {
                    str = "CC(remember):MainScreen.kt#9igjgp";
                    boxScope2 = boxScope;
                    composer = $composer;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Composer composer3 = composer;
                NavHostKt.NavHost($navController, "tabs", fillMaxSize$default2, null, null, function1, function12, function13, function14, null, (Function1) rememberedValue5, $composer, 115016112, 0, 536);
                if ($isTab) {
                    str2 = str;
                    $composer.startReplaceGroup(-1158635837);
                } else {
                    $composer.startReplaceGroup(-1150980108);
                    ComposerKt.sourceInformation($composer, "134@7859L172,131@7721L399");
                    List<BottomTab> list2 = oneUITabs;
                    str2 = str;
                    ComposerKt.sourceInformationMarkerStart($composer, 655613003, str2);
                    boolean changedInstance2 = $composer.changedInstance($scope) | $composer.changed($pagerState);
                    Object rememberedValue8 = $composer.rememberedValue();
                    if (changedInstance2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        Object obj5 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$71$lambda$70(CoroutineScope.this, $pagerState, (BottomTab) obj6);
                            }
                        };
                        $composer.updateRememberedValue(obj5);
                        rememberedValue8 = obj5;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    OneUIKt.OneUIBottomBar(list2, $currentTabRoute, (Function1) rememberedValue8, boxScope2.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), $composer, 0, 0);
                }
                $composer.endReplaceGroup();
                boolean MainScreen$lambda$6 = MainScreen$lambda$6($drawerOpen$delegate);
                String str3 = !$isTab ? $currentTabRoute : $route;
                List<OneUIDrawerItem> list3 = oneUIDrawerItems;
                ComposerKt.sourceInformationMarkerStart($composer, 655628136, str2);
                changedInstance = $composer.changedInstance($navController);
                rememberedValue6 = $composer.rememberedValue();
                if (!changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    mutableState = $drawerOpen$delegate;
                    Object obj6 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$73$lambda$72(NavHostController.this, mutableState, (String) obj7);
                        }
                    };
                    $composer.updateRememberedValue(obj6);
                    rememberedValue6 = obj6;
                } else {
                    mutableState = $drawerOpen$delegate;
                }
                Function1 function15 = (Function1) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 655632373, str2);
                rememberedValue7 = $composer.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object obj7 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$75$lambda$74(MutableState.this);
                        }
                    };
                    $composer.updateRememberedValue(obj7);
                    rememberedValue7 = obj7;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                OneUIKt.OneUIDrawer(MainScreen$lambda$6, str3, list3, function15, (Function0) rememberedValue7, ComposableSingletons$MainScreenKt.INSTANCE.getLambda$99215418$app(), $composer, 221184, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (MainScreen$lambda$3($showAddDialog$delegate)) {
                    mainViewModel = $viewModel;
                    composer2 = $composer;
                    composer2.startReplaceGroup(1201352905);
                } else {
                    $composer.startReplaceGroup(1210218254);
                    ComposerKt.sourceInformation($composer, "163@9016L25,164@9071L183,168@9286L24,161@8937L387");
                    List<Tag> MainScreen$lambda$1 = MainScreen$lambda$1($allTags$delegate);
                    ComposerKt.sourceInformationMarkerStart($composer, 1701609874, str2);
                    Object rememberedValue9 = $composer.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        mutableState2 = $showAddDialog$delegate;
                        Object obj8 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MainScreenKt.MainScreen$lambda$88$lambda$78$lambda$77(MutableState.this);
                            }
                        };
                        $composer.updateRememberedValue(obj8);
                        rememberedValue9 = obj8;
                    } else {
                        mutableState2 = $showAddDialog$delegate;
                    }
                    Function0 function02 = (Function0) rememberedValue9;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1701611792, str2);
                    mainViewModel = $viewModel;
                    boolean changedInstance3 = $composer.changedInstance(mainViewModel);
                    Object rememberedValue10 = $composer.rememberedValue();
                    if (changedInstance3 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        list = MainScreen$lambda$1;
                        Object obj9 = new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                                return MainScreenKt.MainScreen$lambda$88$lambda$80$lambda$79(MainViewModel.this, mutableState2, (String) obj10, (String) obj11, (List) obj12, (List) obj13);
                            }
                        };
                        $composer.updateRememberedValue(obj9);
                        rememberedValue10 = obj9;
                    } else {
                        list = MainScreen$lambda$1;
                    }
                    Function4 function4 = (Function4) rememberedValue10;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1701618513, str2);
                    boolean changedInstance4 = $composer.changedInstance(mainViewModel);
                    Object rememberedValue11 = $composer.rememberedValue();
                    if (changedInstance4 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        Object obj10 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                return MainScreenKt.MainScreen$lambda$88$lambda$82$lambda$81(MainViewModel.this, (String) obj11);
                            }
                        };
                        $composer.updateRememberedValue(obj10);
                        rememberedValue11 = obj10;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    DialogsKt.DhikrAddDialog(list, function02, function4, (Function1) rememberedValue11, $composer, 48, 0);
                    composer2 = $composer;
                }
                composer2.endReplaceGroup();
                MainScreen$lambda$0 = MainScreen$lambda$0($selectedDhikrNotif$delegate);
                if (MainScreen$lambda$0 != null) {
                    composer2.startReplaceGroup(1210649618);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1210649619);
                    ComposerKt.sourceInformation(composer2, "*174@9468L50,175@9551L34,172@9390L209");
                    ComposerKt.sourceInformationMarkerStart(composer2, 1209541810, str2);
                    boolean changedInstance5 = composer2.changedInstance(mainViewModel);
                    Object rememberedValue12 = $composer.rememberedValue();
                    if (changedInstance5 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        Object obj11 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MainScreenKt.MainScreen$lambda$88$lambda$87$lambda$84$lambda$83(MainViewModel.this);
                            }
                        };
                        $composer.updateRememberedValue(obj11);
                        rememberedValue12 = obj11;
                    }
                    Function0 function03 = (Function0) rememberedValue12;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1209544450, str2);
                    boolean changedInstance6 = composer2.changedInstance(mainViewModel) | composer2.changedInstance(MainScreen$lambda$0);
                    Object rememberedValue13 = $composer.rememberedValue();
                    if (changedInstance6 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        function0 = function03;
                        Object obj12 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MainScreenKt.MainScreen$lambda$88$lambda$87$lambda$86$lambda$85(MainViewModel.this, MainScreen$lambda$0);
                            }
                        };
                        $composer.updateRememberedValue(obj12);
                        rememberedValue13 = obj12;
                    } else {
                        function0 = function03;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    DialogsKt.DhikrDetailDialog(MainScreen$lambda$0, function0, (Function0) rememberedValue13, composer2, 0, 0);
                    Unit unit = Unit.INSTANCE;
                    $composer.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            m3828constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3828constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3835setimpl(m3828constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int i32 = ((6 >> 6) & 112) | 6;
            boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1153934996, "C93@4983L73,94@5095L23,95@5161L24,96@5227L74,97@5320L2359,87@4604L3075,145@8334L105,149@8469L22,141@8147L737:MainScreen.kt#2thlc2");
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 655520872, "CC(remember):MainScreen.kt#9igjgp");
            rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            Function1 function16 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 655524406, "CC(remember):MainScreen.kt#9igjgp");
            rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            Function1 function122 = (Function1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 655526519, "CC(remember):MainScreen.kt#9igjgp");
            rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            Function1 function132 = (Function1) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 655528681, "CC(remember):MainScreen.kt#9igjgp");
            rememberedValue4 = $composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            Function1 function142 = (Function1) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 655533942, "CC(remember):MainScreen.kt#9igjgp");
            changed = $composer.changed($pagerState) | $composer.changedInstance($viewModel) | $composer.changedInstance($navController) | $composer.changedInstance($hisnViewModel);
            rememberedValue5 = $composer.rememberedValue();
            if (!changed) {
            }
            str = "CC(remember):MainScreen.kt#9igjgp";
            boxScope2 = boxScope;
            composer = $composer;
            rememberedValue5 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj52) {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68(PagerState.this, $viewModel, $navController, $hisnViewModel, $drawerOpen$delegate, $showAddDialog$delegate, (NavGraphBuilder) obj52);
                }
            };
            $composer.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Composer composer32 = composer;
            NavHostKt.NavHost($navController, "tabs", fillMaxSize$default22, null, null, function16, function122, function132, function142, null, (Function1) rememberedValue5, $composer, 115016112, 0, 536);
            if ($isTab) {
            }
            $composer.endReplaceGroup();
            boolean MainScreen$lambda$62 = MainScreen$lambda$6($drawerOpen$delegate);
            if (!$isTab) {
            }
            List<OneUIDrawerItem> list32 = oneUIDrawerItems;
            ComposerKt.sourceInformationMarkerStart($composer, 655628136, str2);
            changedInstance = $composer.changedInstance($navController);
            rememberedValue6 = $composer.rememberedValue();
            if (!changedInstance) {
            }
            mutableState = $drawerOpen$delegate;
            Object obj62 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj72) {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$73$lambda$72(NavHostController.this, mutableState, (String) obj72);
                }
            };
            $composer.updateRememberedValue(obj62);
            rememberedValue6 = obj62;
            Function1 function152 = (Function1) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 655632373, str2);
            rememberedValue7 = $composer.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OneUIKt.OneUIDrawer(MainScreen$lambda$62, str3, list32, function152, (Function0) rememberedValue7, ComposableSingletons$MainScreenKt.INSTANCE.getLambda$99215418$app(), $composer, 221184, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd(composer32);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (MainScreen$lambda$3($showAddDialog$delegate)) {
            }
            composer2.endReplaceGroup();
            MainScreen$lambda$0 = MainScreen$lambda$0($selectedDhikrNotif$delegate);
            if (MainScreen$lambda$0 != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final EnterTransition MainScreen$lambda$88$lambda$76$lambda$13$lambda$12(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null), new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$13$lambda$12$lambda$11(((Integer) obj).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int MainScreen$lambda$88$lambda$76$lambda$13$lambda$12$lambda$11(int it) {
        return -it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final ExitTransition MainScreen$lambda$88$lambda$76$lambda$15$lambda$14(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return ExitTransition.INSTANCE.getNone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final EnterTransition MainScreen$lambda$88$lambda$76$lambda$17$lambda$16(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return EnterTransition.INSTANCE.getNone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final ExitTransition MainScreen$lambda$88$lambda$76$lambda$20$lambda$19(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null), new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$20$lambda$19$lambda$18(((Integer) obj).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int MainScreen$lambda$88$lambda$76$lambda$20$lambda$19$lambda$18(int it) {
        return -it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68(final PagerState $pagerState, final MainViewModel $viewModel, final NavHostController $navController, final HisnViewModel $hisnViewModel, final MutableState $drawerOpen$delegate, final MutableState $showAddDialog$delegate, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, "tabs", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1016328994, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38(PagerState.this, $viewModel, $navController, $hisnViewModel, $drawerOpen$delegate, $showAddDialog$delegate, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, "hisn/{id}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("id", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$39((NavArgumentBuilder) obj);
            }
        })), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-863018791, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44(HisnViewModel.this, $navController, $viewModel, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, null);
        NavGraphBuilderKt.composable$default(NavHost, "favorites", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1699813734, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$47(MainViewModel.this, $navController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, "reminders", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1758358619, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$50(MainViewModel.this, $navController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, "statistics", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(921563676, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$53(MainViewModel.this, $navController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, "tags", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(84768733, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$56(MainViewModel.this, $navController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, "settings", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-752026210, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61(MainViewModel.this, $navController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, "fajr_settings", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1588821153, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$64(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, "about", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1869351200, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$67(NavHostController.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38(PagerState $pagerState, final MainViewModel $viewModel, final NavHostController $navController, final HisnViewModel $hisnViewModel, final MutableState $drawerOpen$delegate, final MutableState $showAddDialog$delegate, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)99@5450L747,99@5379L818:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016328994, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:99)");
        }
        PagerKt.m972HorizontalPageroI3XNZo($pagerState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-866383548, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37(MainViewModel.this, $navController, $hisnViewModel, $drawerOpen$delegate, $showAddDialog$delegate, (PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }, $composer, 54), $composer, 48, 3072, 8188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37(MainViewModel $viewModel, final NavHostController $navController, HisnViewModel $hisnViewModel, final MutableState $drawerOpen$delegate, final MutableState $showAddDialog$delegate, PagerScope HorizontalPager, int page, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "CN(page):MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-866383548, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:100)");
        }
        String route = oneUITabs.get(page).getRoute();
        if (!route.equals("fajr_settings")) {
            switch (route.hashCode()) {
                case -1537503028:
                    if (route.equals("tasbeeh")) {
                        $composer.startReplaceGroup(629086428);
                        ComposerKt.sourceInformation($composer, "105@6127L21,105@6093L56");
                        ComposerKt.sourceInformationMarkerStart($composer, 629087481, "CC(remember):MainScreen.kt#9igjgp");
                        Object rememberedValue = $composer.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda36
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$36$lambda$35(MutableState.this);
                                }
                            };
                            $composer.updateRememberedValue(obj);
                            rememberedValue = obj;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        TasbeehScreenKt.TasbeehScreen($viewModel, (Function0) rememberedValue, $composer, 48, 0);
                        break;
                    }
                    $composer.startReplaceGroup(-1979204194);
                    break;
                case -980211737:
                    if (route.equals("prayer")) {
                        $composer.startReplaceGroup(629074357);
                        ComposerKt.sourceInformation($composer, "102@5743L21,102@5716L49");
                        ComposerKt.sourceInformationMarkerStart($composer, 629075193, "CC(remember):MainScreen.kt#9igjgp");
                        Object rememberedValue2 = $composer.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object obj2 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda30
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$26$lambda$25(MutableState.this);
                                }
                            };
                            $composer.updateRememberedValue(obj2);
                            rememberedValue2 = obj2;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        PrayerTimesScreenKt.PrayerTimesScreen((Function0) rememberedValue2, $composer, 6, 0);
                        $composer.endReplaceGroup();
                        break;
                    }
                    $composer.startReplaceGroup(-1979204194);
                    break;
                case 3202844:
                    if (route.equals("hisn")) {
                        $composer.startReplaceGroup(629081463);
                        ComposerKt.sourceInformation($composer, "104@5975L43,104@6029L21,104@5936L115");
                        ComposerKt.sourceInformationMarkerStart($composer, 629082639, "CC(remember):MainScreen.kt#9igjgp");
                        boolean changedInstance = $composer.changedInstance($navController);
                        Object rememberedValue3 = $composer.rememberedValue();
                        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            Object obj3 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda34
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$32$lambda$31(NavHostController.this, (HisnChapter) obj4);
                                }
                            };
                            $composer.updateRememberedValue(obj3);
                            rememberedValue3 = obj3;
                        }
                        Function1 function1 = (Function1) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 629084345, "CC(remember):MainScreen.kt#9igjgp");
                        Object rememberedValue4 = $composer.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            Object obj4 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda35
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$34$lambda$33(MutableState.this);
                                }
                            };
                            $composer.updateRememberedValue(obj4);
                            rememberedValue4 = obj4;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        HisnScreensKt.HisnListScreen($hisnViewModel, function1, (Function0) rememberedValue4, $composer, 384, 0);
                        $composer.endReplaceGroup();
                        break;
                    }
                    $composer.startReplaceGroup(-1979204194);
                    break;
                case 3208415:
                    if (route.equals("home")) {
                        $composer.startReplaceGroup(629069195);
                        ComposerKt.sourceInformation($composer, "101@5593L30,101@5634L21,101@5553L103");
                        ComposerKt.sourceInformationMarkerStart($composer, 629070402, "CC(remember):MainScreen.kt#9igjgp");
                        boolean changedInstance2 = $composer.changedInstance($navController);
                        Object rememberedValue5 = $composer.rememberedValue();
                        if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            Object obj5 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda28
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$22$lambda$21(NavHostController.this, (String) obj6);
                                }
                            };
                            $composer.updateRememberedValue(obj5);
                            rememberedValue5 = obj5;
                        }
                        Function1 function12 = (Function1) rememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 629071705, "CC(remember):MainScreen.kt#9igjgp");
                        Object rememberedValue6 = $composer.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            Object obj6 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda29
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$24$lambda$23(MutableState.this);
                                }
                            };
                            $composer.updateRememberedValue(obj6);
                            rememberedValue6 = obj6;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        DashboardScreenKt.DashboardScreen($viewModel, function12, (Function0) rememberedValue6, $composer, 384, 0);
                        $composer.endReplaceGroup();
                        break;
                    }
                    $composer.startReplaceGroup(-1979204194);
                    break;
                case 93321987:
                    if (!route.equals("azkar")) {
                        $composer.startReplaceGroup(-1979204194);
                        break;
                    } else {
                        $composer.startReplaceGroup(629077248);
                        ComposerKt.sourceInformation($composer, "103@5840L24,103@5875L21,103@5805L92");
                        ComposerKt.sourceInformationMarkerStart($composer, 629078300, "CC(remember):MainScreen.kt#9igjgp");
                        Object rememberedValue7 = $composer.rememberedValue();
                        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            Object obj7 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda31
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$28$lambda$27(MutableState.this);
                                }
                            };
                            $composer.updateRememberedValue(obj7);
                            rememberedValue7 = obj7;
                        }
                        Function0 function0 = (Function0) rememberedValue7;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, 629079417, "CC(remember):MainScreen.kt#9igjgp");
                        Object rememberedValue8 = $composer.rememberedValue();
                        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            Object obj8 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda32
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$30$lambda$29(MutableState.this);
                                }
                            };
                            $composer.updateRememberedValue(obj8);
                            rememberedValue8 = obj8;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        HomeScreenKt.AzkarListScreen($viewModel, function0, (Function0) rememberedValue8, $composer, 432, 0);
                        $composer.endReplaceGroup();
                        break;
                    }
                default:
                    $composer.startReplaceGroup(-1979204194);
                    break;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        $composer.startReplaceGroup(1985229328);
        FajrTabScreen($drawerOpen$delegate, $composer, 0);
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$22$lambda$21(NavHostController $navController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NavController.navigate$default((NavController) $navController, it, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$24$lambda$23(MutableState $drawerOpen$delegate) {
        MainScreen$lambda$7($drawerOpen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$26$lambda$25(MutableState $drawerOpen$delegate) {
        MainScreen$lambda$7($drawerOpen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$28$lambda$27(MutableState $showAddDialog$delegate) {
        MainScreen$lambda$4($showAddDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$30$lambda$29(MutableState $drawerOpen$delegate) {
        MainScreen$lambda$7($drawerOpen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$32$lambda$31(NavHostController $navController, HisnChapter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NavController.navigate$default((NavController) $navController, "hisn/" + it.getId(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$34$lambda$33(MutableState $drawerOpen$delegate) {
        MainScreen$lambda$7($drawerOpen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$36$lambda$35(MutableState $drawerOpen$delegate) {
        MainScreen$lambda$7($drawerOpen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$39(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.IntType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44(HisnViewModel $hisnViewModel, final NavHostController $navController, final MainViewModel $viewModel, AnimatedContentScope composable, NavBackStackEntry entry, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        ComposerKt.sourceInformation($composer, "CN(entry)113@6532L32,114@6607L85,110@6357L357:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-863018791, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:110)");
        }
        Bundle arguments = entry.getArguments();
        int i = arguments != null ? arguments.getInt("id") : 0;
        ComposerKt.sourceInformationMarkerStart($composer, -432363399, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44$lambda$41$lambda$40(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        Function0 function0 = (Function0) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -432360946, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance2 = $composer.changedInstance($viewModel);
        Object rememberedValue2 = $composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object obj2 = new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44$lambda$43$lambda$42(MainViewModel.this, (String) obj3, (String) obj4);
                }
            };
            $composer.updateRememberedValue(obj2);
            rememberedValue2 = obj2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        HisnScreensKt.HisnChapterScreen(i, $hisnViewModel, function0, (Function2) rememberedValue2, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44$lambda$41$lambda$40(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$44$lambda$43$lambda$42(MainViewModel $viewModel, String title, String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        $viewModel.addDhikrWithSchedule(title, content, CollectionsKt.listOf("09:00"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$47(MainViewModel $viewModel, final NavHostController $navController, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)117@6802L32,117@6775L59:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1699813734, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:117)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -1433424934, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$47$lambda$46$lambda$45(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        FavoritesScreenKt.FavoritesScreen($viewModel, (Function0) rememberedValue, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$47$lambda$46$lambda$45(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$50(MainViewModel $viewModel, final NavHostController $navController, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)118@6906L32,118@6879L59:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1758358619, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:118)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 1860486491, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$50$lambda$49$lambda$48(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        RemindersScreenKt.RemindersScreen($viewModel, (Function0) rememberedValue, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$50$lambda$49$lambda$48(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$53(MainViewModel $viewModel, final NavHostController $navController, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)119@7012L32,119@6984L60:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(921563676, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:119)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 859430652, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$53$lambda$52$lambda$51(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        StatisticsScreenKt.StatisticsScreen($viewModel, (Function0) rememberedValue, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$53$lambda$52$lambda$51(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$56(MainViewModel $viewModel, final NavHostController $navController, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)120@7106L32,120@7084L54:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(84768733, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:120)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -141625411, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$56$lambda$55$lambda$54(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        TagsScreenKt.TagsScreen($viewModel, (Function0) rememberedValue, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$56$lambda$55$lambda$54(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61(MainViewModel $viewModel, final NavHostController $navController, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)122@7237L32,122@7290L43,122@7202L132:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-752026210, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:122)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -1142680226, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61$lambda$58$lambda$57(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        Function0 function0 = (Function0) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -1142678519, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance2 = $composer.changedInstance($navController);
        Object rememberedValue2 = $composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object obj2 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61$lambda$60$lambda$59(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj2);
            rememberedValue2 = obj2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        SettingsScreenKt.SettingsScreen($viewModel, function0, (Function0) rememberedValue2, $composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61$lambda$58$lambda$57(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$61$lambda$60$lambda$59(NavHostController $navController) {
        NavController.navigate$default((NavController) $navController, "fajr_settings", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit FajrTabScreen(final MutableState mutableState, Composer composer, int i) {
        CreationExtras creationExtras;
        ComposerKt.sourceInformation(composer, "CN(it)125@7454L11,126@7529L32,126@7486L76:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588821153, i, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:125)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FajrViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, creationExtras, composer, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | ((0 << 3) & 57344), 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        FajrViewModel fajrViewModel = (FajrViewModel) viewModel;
        ComposerKt.sourceInformationMarkerStart(composer, -2143733697, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(mutableState);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.FajrDrawerAction
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$38$lambda$37$lambda$26$lambda$25(MutableState.this);
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        FajrSettingsScreenKt.FajrSettingsScreen(fajrViewModel, (Function0) rememberedValue, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$64(final NavHostController $navController, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        CreationExtras creationExtras;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)125@7454L11,126@7529L32,126@7486L76:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588821153, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:125)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FajrViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, creationExtras, $composer, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | ((0 << 3) & 57344), 0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        FajrViewModel fajrViewModel = (FajrViewModel) viewModel;
        ComposerKt.sourceInformationMarkerStart($composer, -2143733697, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$64$lambda$63$lambda$62(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        FajrSettingsScreenKt.FajrSettingsScreen(fajrViewModel, (Function0) rememberedValue, $composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$64$lambda$63$lambda$62(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$67(final NavHostController $navController, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)128@7631L32,128@7619L44:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1869351200, $changed, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:128)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 1150173952, "CC(remember):MainScreen.kt#9igjgp");
        boolean changedInstance = $composer.changedInstance($navController);
        Object rememberedValue = $composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$67$lambda$66$lambda$65(NavHostController.this);
                }
            };
            $composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        AboutScreenKt.AboutScreen((Function0) rememberedValue, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$69$lambda$68$lambda$67$lambda$66$lambda$65(NavHostController $navController) {
        $navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$71$lambda$70(CoroutineScope $scope, PagerState $pagerState, BottomTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        int i = oneUITabs.indexOf(tab);
        if (i >= 0) {
            BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MainScreenKt$MainScreen$1$1$6$1$1($pagerState, i, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$73$lambda$72(NavHostController $navController, MutableState $drawerOpen$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainScreen$lambda$7($drawerOpen$delegate, false);
        NavController.navigate$default((NavController) $navController, it, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$76$lambda$75$lambda$74(MutableState $drawerOpen$delegate) {
        MainScreen$lambda$7($drawerOpen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$78$lambda$77(MutableState $showAddDialog$delegate) {
        MainScreen$lambda$4($showAddDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$80$lambda$79(MainViewModel $viewModel, MutableState $showAddDialog$delegate, String title, String content, List times, List tagIds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(tagIds, "tagIds");
        $viewModel.addDhikrWithScheduleAndTags(title, content, times, tagIds);
        MainScreen$lambda$4($showAddDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$82$lambda$81(MainViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainViewModel.addTag$default($viewModel, it, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$87$lambda$84$lambda$83(MainViewModel $viewModel) {
        $viewModel.clearSelectedDhikrFromNotification();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreen$lambda$88$lambda$87$lambda$86$lambda$85(MainViewModel $viewModel, Dhikr $dhikr) {
        $viewModel.markAsRead($dhikr.getId());
        return Unit.INSTANCE;
    }
}
