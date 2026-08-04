sed -i 's/text = "المدة القصوى لرنين المنبه"/text = "المدة القصوى لرنين المنبه (دقائق)"/g' app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt
sed -i 's/Text("$mins دقائق")/Text("$mins", modifier = Modifier.fillMaxWidth(), textAlign = androidx.compose.ui.text.style.TextAlign.Center, maxLines = 1)/g' app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt
sed -i 's/color = MaterialTheme.colorScheme.primaryContainer,/color = MaterialTheme.colorScheme.surfaceVariant,/g' app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt
sed -i 's/color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.8f)/color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)/g' app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt
sed -i 's/color = MaterialTheme.colorScheme.onPrimaryContainer/color = MaterialTheme.colorScheme.onSurfaceVariant/g' app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt
