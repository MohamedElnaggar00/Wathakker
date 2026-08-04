import re

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'r') as f:
    content = f.read()

content = content.replace("    PrimaryCard {\n        ) {\n            Row", "    PrimaryCard {\n            Row")
content = content.replace("    PrimaryCard {\n        modifier = modifier\n    ) {,", "    PrimaryCard(\n        modifier = modifier\n    ) {")
content = content.replace("    PrimaryCard {\n    ) {\n        Row(", "    PrimaryCard {\n        Row(")
content = content.replace("    PrimaryCard {\n        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)\n    ) {\n        Row(", "    PrimaryCard(\n        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)\n    ) {\n        Row(")

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'w') as f:
    f.write(content)
