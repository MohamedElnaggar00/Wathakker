package com.example

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import com.example.ui.screens.MainScreen
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.viewmodel.MainViewModel
import com.example.widget.WidgetUpdater
import com.example.lockwidgets.HomeWidgets
import com.example.ui.i18n.L10n

class MainActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        // A widget tap that targets a specific tab starts the activity fresh, without saved state.
        val state = if (HomeWidgets.handleIntent(intent)) null else savedInstanceState
        super.onCreate(state)
        L10n.init(this)
        ThemeSettings.init(this)
        WidgetUpdater.INSTANCE.updateAll(this)
        handleIntent(intent)
        enableEdgeToEdge()
        setContent {
            val appFont by mainViewModel.appFont.collectAsState()
            val dark = ThemeSettings.isDark()
            val launcher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { }
            LaunchedEffect(Unit) {
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        launcher.launch("android.permission.POST_NOTIFICATIONS")
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
            MyApplicationTheme(fontChoice = appFont, darkTheme = dark, dynamicColor = false) {
                MainScreen(mainViewModel)
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleIntent(intent)
        if (HomeWidgets.handleIntent(intent)) {
            setIntent(intent)
            recreate()
        }
    }

    private fun handleIntent(intent: Intent?) {
        HomeWidgets.handleIntent(intent)
        val dhikrId = intent?.getIntExtra("DHIKR_ID", -1) ?: -1
        if (dhikrId != -1) mainViewModel.onDhikrSelectedFromNotification(dhikrId)
    }
}

