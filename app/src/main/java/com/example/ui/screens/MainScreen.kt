package com.example.ui.screens

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Label
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.AdsClick
import androidx.compose.material.icons.outlined.FormatListBulleted
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Mosque
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.R
import com.example.fajr.ui.FajrViewModel
import com.example.lockwidgets.HomeWidgets
import com.example.prayer.PrayerTimesScreen
import com.example.ui.hisn.HisnChapterScreen
import com.example.ui.hisn.HisnListScreen
import com.example.ui.hisn.HisnViewModel
import com.example.ui.oneui.BottomTab
import com.example.ui.oneui.HeaderTools
import com.example.ui.oneui.LocalHazeState
import com.example.ui.oneui.OneUIBottomBar
import com.example.ui.oneui.OneUIDrawer
import com.example.ui.oneui.OneUIDrawerItem
import com.example.ui.viewmodel.MainViewModel
import dev.chrisbanes.haze.rememberHazeState
import kotlinx.coroutines.launch
import com.example.ui.i18n.L10n
import com.example.ui.i18n.S

val oneUITabs: List<BottomTab> = listOf(
    BottomTab("prayer", L10n.t(S.PrayerTab)) { c ->
        Icon(Icons.Outlined.Mosque, null, Modifier.size(24.dp), tint = c)
    },
    BottomTab("azkar", L10n.t(S.AzkarTab)) { c ->
        Icon(Icons.Outlined.FormatListBulleted, null, Modifier.size(24.dp), tint = c)
    },
    BottomTab("hisn", L10n.t(S.HisnTab)) { c ->
        Icon(Icons.AutoMirrored.Outlined.MenuBook, null, Modifier.size(24.dp), tint = c)
    },
    BottomTab("calendar", L10n.t(S.CalendarTab)) { c ->
        Icon(Icons.Outlined.CalendarMonth, null, Modifier.size(24.dp), tint = c)
    }
)

val oneUIDrawerItems: List<OneUIDrawerItem> = listOf(
    OneUIDrawerItem("favorites", L10n.t(S.Favorites), Icons.Outlined.Star, Color(4293243989L)),
    OneUIDrawerItem("reminders", L10n.t(S.Reminders), Icons.Outlined.Notifications, Color(4293243989L)),
    OneUIDrawerItem("statistics", L10n.t(S.Stats), Icons.Outlined.BarChart, Color(4283289796L)),
    OneUIDrawerItem("tags", L10n.t(S.Tags), Icons.AutoMirrored.Outlined.Label, Color(4290617322L)),
    OneUIDrawerItem("hijri_converter", L10n.t(S.HijriConvTitle), Icons.Outlined.DateRange, Color(4284061916L)),
    OneUIDrawerItem("qibla", L10n.t(S.QiblaTitle), Icons.Outlined.Explore, Color(4280391411L)),
    OneUIDrawerItem("tasbeeh", L10n.t(S.TasbeehTab), Icons.Outlined.AdsClick, Color(4290617322L)),
    OneUIDrawerItem("settings", L10n.t(S.Settings), Icons.Outlined.Settings, Color(4287669422L)),
    OneUIDrawerItem("about", L10n.t(S.About), Icons.Outlined.Info, Color(4287532691L))
)


@Composable
fun MainScreen(viewModel: MainViewModel) {
    val navController = rememberNavController()
    HeaderTools.setNav(navController)
    val hazeState = rememberHazeState()
    val selectedDhikrNotif by viewModel.selectedDhikrFromNotification.collectAsStateWithLifecycle()
    val allTags by viewModel.allTags.collectAsStateWithLifecycle()
    val hisnViewModel: HisnViewModel = viewModel()
    var showAddDialog by remember { mutableStateOf(false) }
    var drawerOpen by remember { mutableStateOf(false) }
    val pagerState = rememberPagerState(initialPage = HomeWidgets.initialPage()) { oneUITabs.size }
    val scope = rememberCoroutineScope()
    val backEntry by navController.currentBackStackEntryAsState()
    val route = backEntry?.destination?.route
    val isTab = route == "tabs"
    val currentTabRoute = oneUITabs[pagerState.currentPage.coerceIn(0, oneUITabs.size - 1)].route

    CompositionLocalProvider(LocalHazeState provides hazeState) {
        Box(Modifier.fillMaxSize()) {
            val slideDirState = rememberUpdatedState(if (LocalLayoutDirection.current == LayoutDirection.Rtl) -1 else 1)
            NavHost(
                navController = navController,
                startDestination = "tabs",
                modifier = Modifier.fillMaxSize(),
                enterTransition = { slideInHorizontally(tween(300, 0, FastOutSlowInEasing)) { slideDirState.value * it } },
                exitTransition = { slideOutHorizontally(tween(300, 0, FastOutSlowInEasing)) { -slideDirState.value * it } },
                popEnterTransition = { slideInHorizontally(tween(300, 0, FastOutSlowInEasing)) { -slideDirState.value * it } },
                popExitTransition = { slideOutHorizontally(tween(300, 0, FastOutSlowInEasing)) { slideDirState.value * it } }
            ) {
                composable("tabs") {
                    HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) { page ->
                        when (oneUITabs[page].route) {
                            "calendar" -> HijriCalendarScreen { drawerOpen = true }
                            "prayer" -> PrayerTimesScreen({ navController.navigate("qibla") }) { drawerOpen = true }
                            "hisn" -> HisnListScreen(
                                hisnViewModel,
                                { chapter -> navController.navigate("hisn/" + chapter.id) },
                                { drawerOpen = true }
                            )
                            "home" -> DashboardScreen(
                                viewModel,
                                { navController.navigate(it) },
                                { drawerOpen = true }
                            )
                            else -> AzkarListScreen(viewModel, { showAddDialog = true }, { drawerOpen = true })
                        }
                    }
                }
                composable(
                    "hisn/{id}",
                    arguments = listOf(navArgument("id") { type = NavType.IntType })
                ) { entry ->
                    val id = entry.arguments?.getInt("id") ?: 0
                    HisnChapterScreen(
                        id,
                        hisnViewModel,
                        { navController.popBackStack() },
                        { title, content -> viewModel.addDhikrWithSchedule(title, content, listOf("09:00")) }
                    )
                }
                composable("favorites") { FavoritesScreen(viewModel) { navController.popBackStack() } }
                composable("reminders") { RemindersScreen(viewModel) { navController.popBackStack() } }
                composable("statistics") { StatisticsScreen(viewModel) { navController.popBackStack() } }
                composable("tags") { TagsScreen(viewModel) { navController.popBackStack() } }
                composable("settings") {
                    SettingsScreen(
                        viewModel,
                        { navController.popBackStack() },
                        onNavigateToLocation = { navController.navigate("location_calc") },
                        onNavigateToOptionalTimes = { navController.navigate("optional_times") },
                        onNavigateToHijriConverter = { navController.navigate("hijri_converter") },
                        onNavigateToAbout = { navController.navigate("about") }
                    )
                }
                composable("optional_times") {
                    com.example.prayer.OptionalTimesScreen { navController.popBackStack() }
                }
                composable("qibla") {
                    com.example.prayer.QiblaScreen { navController.popBackStack() }
                }
                composable("hijri_converter") {
                    com.example.prayer.HijriConverterScreen { navController.popBackStack() }
                }
                composable("location_calc") {
                    val fajrViewModel: FajrViewModel = viewModel()
                    com.example.prayer.LocationCalculationScreen(fajrViewModel) { navController.popBackStack() }
                }
                composable("about") { AboutScreen { navController.popBackStack() } }
                composable("tasbeeh") { TasbeehScreen(viewModel) { navController.popBackStack() } }
            }
            if (isTab) {
                OneUIBottomBar(
                    tabs = oneUITabs,
                    selectedRoute = currentTabRoute,
                    onSelect = { tab ->
                        val i = oneUITabs.indexOf(tab)
                        if (i >= 0) scope.launch {
                            // Animating across several pages composes every heavy screen in between
                            // mid-animation (the visible stutter). Animate only adjacent hops.
                            if (kotlin.math.abs(i - pagerState.currentPage) <= 1) pagerState.animateScrollToPage(i)
                            else pagerState.scrollToPage(i)
                        }
                    },
                    modifier = Modifier.align(Alignment.BottomCenter)
                )
            }
            OneUIDrawer(
                open = drawerOpen,
                currentRoute = if (isTab) currentTabRoute else (route ?: ""),
                items = oneUIDrawerItems,
                onSelect = {
                    drawerOpen = false
                    if (route != it) navController.navigate(it) { launchSingleTop = true }
                },
                onDismiss = { drawerOpen = false },
                footer = {
                    val uri = LocalUriHandler.current
                    Text(
                        "brought to you by Instinct",
                        modifier = Modifier.clickable { uri.openUri("https://instinct.com") },
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            )
            if (showAddDialog) {
                DhikrAddDialog(
                    allTags = allTags,
                    onDismiss = { showAddDialog = false },
                    onConfirm = { title, content, times, tagIds ->
                        viewModel.addDhikrWithScheduleAndTags(title, content, times, tagIds)
                        showAddDialog = false
                    },
                    onCreateTag = { viewModel.addTag(it, "#008080", null) }
                )
            }
            val notifDhikr = selectedDhikrNotif
            if (notifDhikr != null) {
                DhikrDetailDialog(
                    dhikr = notifDhikr,
                    onDismiss = { viewModel.clearSelectedDhikrFromNotification() },
                    onMarkAsRead = { viewModel.markAsRead(notifDhikr.id) }
                )
            }
        }
    }
}


