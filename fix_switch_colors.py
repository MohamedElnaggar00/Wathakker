import os
import re

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    # Regex to remove colors = SwitchDefaults.colors(...) from WathakkerSwitch
    pattern = r'(WathakkerSwitch\([^)]*?)(,\s*colors\s*=\s*SwitchDefaults\.colors\([^)]+\)\s*,?)'
    
    # Wait, the regex might be complex because of nested parentheses in SwitchDefaults.colors(...)
    # Let's just do a simpler replace.
    # Actually, WathakkerSwitch has checked, onCheckedChange, modifier.
    # The colors parameter is just extra.
    # We can just use re.sub for a multi-line block.
    
    # Or just replace the exact text in SettingsScreen.kt
    # WathakkerSwitch(
    #    checked = vibrationEnabled,
    #    onCheckedChange = { viewModel.updateVibrationEnabled(it) },
    #    colors = SwitchDefaults.colors( ... ),
    # )
    
    old_content = content
    content = re.sub(r'colors\s*=\s*SwitchDefaults\.colors\([^)]+\),?\s*', '', content, flags=re.DOTALL)
    
    # DashboardScreen issue
    content = content.replace("package com.example.ui.screens\n\nimport com.example.ui.components.WathakkerButton\npackage com.example.ui.screens", "package com.example.ui.screens\n\nimport com.example.ui.components.WathakkerButton")
    
    if content != old_content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/ui/screens/'):
    for file in files:
        if file.endswith('.kt') and not file.endswith('WathakkerComponents.kt'):
            process_file(os.path.join(root, file))

