with open("app/src/main/java/com/example/ui/screens/TasbeehScreen.kt", "r") as f:
    content = f.read()

import re
old_button_pattern = r'WathakkerButton\([^)]*?\)\s*\{[^}]*?\}'
# Actually, since I don't want to mess up regex, let's just find and replace the block manually

new_content = """package com.example.ui.screens
import com.example.ui.components.WathakkerButton

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.ui.viewmodel.MainViewModel

@Composable
fun TasbeehScreen(viewModel: MainViewModel) {
    val counter by viewModel.tasbeehCounter.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "المسبحة",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        )
        
        Spacer(modifier = Modifier.height(48.dp))
        
        Text(
            text = counter.toString(),
            fontSize = 72.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
        
        Spacer(modifier = Modifier.height(64.dp))
        
        WathakkerButton(
            text = "سبّح",
            onClick = { viewModel.incrementTasbeeh() },
            modifier = Modifier.size(120.dp),
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        TextButton(onClick = { viewModel.resetTasbeeh() }) {
            Text("تصفير العداد", color = MaterialTheme.colorScheme.error)
        }
    }
}
"""
with open("app/src/main/java/com/example/ui/screens/TasbeehScreen.kt", "w") as f:
    f.write(new_content)
