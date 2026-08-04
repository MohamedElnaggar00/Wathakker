import os
import re

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    # Replace specific hardcoded colors
    content = content.replace("Color(0xFF6B6B73)", "MaterialTheme.colorScheme.onSurfaceVariant")
    content = content.replace("Color(0xFFFFC107)", "MaterialTheme.customColors.warning")
    content = content.replace("StarYellow", "MaterialTheme.customColors.warning")
    content = content.replace("Color(android.graphics.Color.parseColor(tag.colorHex))", "androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))")
    content = content.replace("Color(android.graphics.Color.parseColor(colorHex))", "androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(colorHex))")

    if content != open(filepath, 'r', encoding='utf-8').read():
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/'):
    for file in files:
        if file.endswith('.kt'):
            process_file(os.path.join(root, file))
