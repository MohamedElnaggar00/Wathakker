package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ui.viewmodel.MainViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: MainViewModel) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = MaterialTheme.colorScheme.surface,
                modifier = Modifier.width(300.dp)
            ) {
                Spacer(Modifier.height(24.dp))
                Text(
                    text = "وَذكِّر",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(16.dp)
                )
                NavigationDrawerItem(
                    icon = { Icon(Icons.AutoMirrored.Filled.List, contentDescription = null) },
                    label = { Text("الشاشة الرئيسية", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurface) },
                    selected = false,
                    onClick = {
                        navController.navigate("dashboard") {
                            popUpTo("dashboard") { inclusive = true }
                        }
                        scope.launch { drawerState.close() }
                    },
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                )
                NavigationDrawerItem(
                    icon = { Icon(Icons.AutoMirrored.Filled.List, contentDescription = null) },
                    label = { Text("قائمه الاذكار والتنبيه", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurface) },
                    selected = false,
                    onClick = {
                        navController.navigate("list")
                        scope.launch { drawerState.close() }
                    },
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                )
                NavigationDrawerItem(
                    icon = { Icon(Icons.Default.Star, contentDescription = null) },
                    label = { Text("الاذكار المفضلة", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurface) },
                    selected = false,
                    onClick = {
                        navController.navigate("favorites")
                        scope.launch { drawerState.close() }
                    },
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                )
                NavigationDrawerItem(
                    icon = { Icon(Icons.AutoMirrored.Filled.List, contentDescription = null) },
                    label = { Text("عداد التسبيح", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurface) },
                    selected = false,
                    onClick = {
                        navController.navigate("tasbeeh")
                        scope.launch { drawerState.close() }
                    },
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                )
                NavigationDrawerItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = null) },
                    label = { Text("حول التطبيق", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurface) },
                    selected = false,
                    onClick = {
                        navController.navigate("about")
                        scope.launch { drawerState.close() }
                    },
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                )
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                var isSearchActive by remember { mutableStateOf(false) }
                var searchQuery by remember { mutableStateOf("") }
                var showMenu by remember { mutableStateOf(false) }
                var showAddDialog by remember { mutableStateOf(false) }

                // Custom Header with extra padding for status bar and aesthetic
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .windowInsetsPadding(WindowInsets.statusBars)
                        .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (isSearchActive) {
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            placeholder = { Text("بحث...") },
                            modifier = Modifier.weight(1f).padding(end = 8.dp),
                            singleLine = true,
                            trailingIcon = {
                                IconButton(onClick = { 
                                    isSearchActive = false
                                    searchQuery = ""
                                }) {
                                    Icon(Icons.Default.Close, contentDescription = "Close Search")
                                }
                            }
                        )
                    } else {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(onClick = { scope.launch { drawerState.open() } }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu", tint = MaterialTheme.colorScheme.onBackground)
                            }
                            Text(
                                text = "وَذكِّر",
                                fontSize = 32.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(onClick = { showAddDialog = true }) {
                                Icon(Icons.Default.Add, contentDescription = "Add", tint = MaterialTheme.colorScheme.onBackground)
                            }
                            IconButton(onClick = { 
                                isSearchActive = true 
                                navController.navigate("list") {
                                    popUpTo("list") { inclusive = true }
                                }
                            }) {
                                Icon(Icons.Default.Search, contentDescription = "Search", tint = MaterialTheme.colorScheme.onBackground)
                            }
                            Box {
                                IconButton(onClick = { showMenu = true }) {
                                    Icon(Icons.Default.MoreVert, contentDescription = "More", tint = MaterialTheme.colorScheme.onBackground)
                                }
                                DropdownMenu(
                                    expanded = showMenu,
                                    onDismissRequest = { showMenu = false },
                                    shape = RoundedCornerShape(16.dp),
                                    containerColor = MaterialTheme.colorScheme.surface,
                                    modifier = Modifier.width(220.dp)
                                ) {
                                    DropdownMenuItem(
                                        text = { Text("الإعدادات", fontSize = 16.sp, color = MaterialTheme.colorScheme.onSurface, modifier = Modifier.padding(horizontal = 12.dp)) },
                                        onClick = { 
                                            showMenu = false
                                            navController.navigate("settings")
                                        }
                                    )
                                    DashedDivider()
                                    DropdownMenuItem(
                                        text = { Text("عن التطبيق", fontSize = 16.sp, color = MaterialTheme.colorScheme.onSurface, modifier = Modifier.padding(horizontal = 12.dp)) },
                                        onClick = { 
                                            showMenu = false
                                            navController.navigate("about")
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
                
                NavHost(
                    navController = navController,
                    startDestination = "dashboard",
                    modifier = Modifier.weight(1f)
                ) {
                    composable("dashboard") {
                        DashboardScreen(viewModel = viewModel)
                    }
                    composable("list") {
                        HomeScreen(viewModel = viewModel, searchQuery = searchQuery)
                    }
                    composable("favorites") {
                        FavoritesScreen(viewModel = viewModel)
                    }
                    composable("tasbeeh") {
                        TasbeehScreen(viewModel = viewModel)
                    }
                    composable("settings") {
                        SettingsScreen(viewModel = viewModel, onBack = { navController.popBackStack() })
                    }
                    composable("about") {
                        AboutScreen()
                    }
                }

                if (showAddDialog) {
                    DhikrAddDialog(
                        onDismiss = { showAddDialog = false },
                        onConfirm = { title, content, times ->
                            viewModel.addDhikrWithSchedule(title, content, times)
                            showAddDialog = false
                        }
                    )
                }
            }
        }
    }
}

