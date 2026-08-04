import re

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'r') as f:
    content = f.read()

# Replace TodayOverviewCard
content = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\(24\.dp\),\s*color = MaterialTheme\.colorScheme\.surfaceVariant,\s*modifier = Modifier\.fillMaxWidth\(\)\s*\)\s*\{\s*Column\(\s*modifier = Modifier\s*\.fillMaxWidth\(\)\s*\.padding\(20\.dp\)',
    '    PrimaryCard(',
    content
)

# Replace StatPeriodCard
content = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\(20\.dp\),\s*color = MaterialTheme\.colorScheme\.surfaceVariant,\s*modifier = modifier\s*\)\s*\{\s*Column\(\s*modifier = Modifier\.padding\(14\.dp\)',
    '    PrimaryCard(\n        modifier = modifier\n    ) {',
    content
)

# Replace StreakCard
content = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\(24\.dp\),\s*color = MaterialTheme\.colorScheme\.surfaceVariant,\s*modifier = Modifier\.fillMaxWidth\(\)\s*\)\s*\{\s*Column\(\s*modifier = Modifier\s*\.fillMaxWidth\(\)\s*\.padding\(20\.dp\)',
    '    PrimaryCard(',
    content
)

# Replace TotalStatsCard
content = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\(20\.dp\),\s*color = MaterialTheme\.colorScheme\.surfaceVariant,\s*modifier = Modifier\.fillMaxWidth\(\)\s*\)\s*\{\s*Row\(\s*modifier = Modifier\s*\.fillMaxWidth\(\)\s*\.padding\(20\.dp\)',
    '    PrimaryCard(\n    ) {\n        Row(\n            modifier = Modifier.fillMaxWidth()',
    content
)

# Replace HistoryItemRow
content = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\(16\.dp\),\s*color = MaterialTheme\.colorScheme\.surfaceVariant\.copy\(alpha = 0\.6f\),\s*modifier = Modifier\.fillMaxWidth\(\)\s*\)\s*\{\s*Row\(\s*modifier = Modifier\s*\.fillMaxWidth\(\)\s*\.padding\(14\.dp\)',
    '    PrimaryCard(\n        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)\n    ) {\n        Row(\n            modifier = Modifier.fillMaxWidth()',
    content
)

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'w') as f:
    f.write(content)
