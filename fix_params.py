import os
import re

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    old_content = content
    content = content.replace("selectedColor =", "color =")

    if content != old_content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/ui/screens/'):
    for file in files:
        if file.endswith('.kt') and not file.endswith('WathakkerComponents.kt'):
            process_file(os.path.join(root, file))

