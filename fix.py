with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'r') as f:
    text = f.read()

text = text.replace("    PrimaryCard {\n        modifier = modifier\n    ) {\n            horizontalAlignment = Alignment.Start\n        ) {\n", "    PrimaryCard(\n        modifier = modifier\n    ) {\n        Column(\n            horizontalAlignment = Alignment.Start\n        ) {\n")

with open('app/src/main/java/com/example/ui/screens/StatisticsScreen.kt', 'w') as f:
    f.write(text)
