package com.example

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.screens.MainScreen
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.viewmodel.MainViewModel

import android.content.Intent
import androidx.activity.viewModels

class MainActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleIntent(intent)
        
        enableEdgeToEdge()
        setContent {
            val useDeviceFont by mainViewModel.useDeviceFont.collectAsState()
            
            // Safely request notification permission using Compose
            val launcher = rememberLauncherForActivityResult(
                ActivityResultContracts.RequestPermission()
            ) { isGranted: Boolean -> }
            
            LaunchedEffect(Unit) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    try {
                        launcher.launch(Manifest.permission.POST_NOTIFICATIONS)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }

            MyApplicationTheme(useDeviceFont = useDeviceFont) {
                MainScreen(viewModel = mainViewModel)
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        val dhikrId = intent?.getIntExtra("DHIKR_ID", -1) ?: -1
        if (dhikrId != -1) {
            mainViewModel.onDhikrSelectedFromNotification(dhikrId)
        }
    }
}
