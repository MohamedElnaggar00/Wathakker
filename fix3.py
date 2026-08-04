with open('app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt', 'r') as f:
    text = f.read()

text = text.replace("OneUICard {", "PrimaryCard {")

with open('app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt', 'w') as f:
    f.write(text)

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'r') as f:
    text = f.read()

text = text.replace("    PrimaryCard {\n        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)\n    ) {", "    PrimaryCard(\n        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)\n    ) {")

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'w') as f:
    f.write(text)
