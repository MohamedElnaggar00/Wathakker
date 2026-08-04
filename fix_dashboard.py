with open("app/src/main/java/com/example/ui/screens/DashboardScreen.kt", "r") as f:
    content = f.read()

if "import com.example.ui.components.WathakkerButton" not in content:
    content = content.replace("package com.example.ui.screens", "package com.example.ui.screens\n\nimport com.example.ui.components.WathakkerButton")

with open("app/src/main/java/com/example/ui/screens/DashboardScreen.kt", "w") as f:
    f.write(content)

