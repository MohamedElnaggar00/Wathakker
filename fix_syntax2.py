import re

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'r') as f:
    content = f.read()

content = content.replace("    PrimaryCard(\n        modifier = modifier\n    ) {\n            horizontalAlignment = Alignment.Start\n        ) {\n            Box(", "    PrimaryCard(\n        modifier = modifier\n    ) {\n        Column(\n            horizontalAlignment = Alignment.Start\n        ) {\n            Box(")

# I also need to check for other broken syntax. Let me look at line 247:
# "Expecting a top level declaration". This means I deleted a `}` or added an extra `}`.
