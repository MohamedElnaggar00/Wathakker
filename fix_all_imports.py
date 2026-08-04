import os

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    old_content = content
    imports = []
    
    if "WathakkerSwitch(" in content and "import com.example.ui.components.WathakkerSwitch" not in content:
        imports.append("import com.example.ui.components.WathakkerSwitch")
    if "WathakkerDialog(" in content and "import com.example.ui.components.WathakkerDialog" not in content:
        imports.append("import com.example.ui.components.WathakkerDialog")
    if "WathakkerTopBar(" in content and "import com.example.ui.components.WathakkerTopBar" not in content:
        imports.append("import com.example.ui.components.WathakkerTopBar")
    if "WathakkerTextField(" in content and "import com.example.ui.components.WathakkerTextField" not in content:
        imports.append("import com.example.ui.components.WathakkerTextField")
    if "WathakkerBottomSheet(" in content and "import com.example.ui.components.WathakkerBottomSheet" not in content:
        imports.append("import com.example.ui.components.WathakkerBottomSheet")
    if "WathakkerButton(" in content and "import com.example.ui.components.WathakkerButton" not in content:
        imports.append("import com.example.ui.components.WathakkerButton")
    if "WathakkerCard(" in content and "import com.example.ui.components.WathakkerCard" not in content:
        imports.append("import com.example.ui.components.WathakkerCard")
    if "WathakkerChip(" in content and "import com.example.ui.components.WathakkerChip" not in content:
        imports.append("import com.example.ui.components.WathakkerChip")

    if imports:
        import_block = "\n".join(imports)
        content = content.replace("package com.example.ui.screens", f"package com.example.ui.screens\n\n{import_block}")
        
    if content != old_content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/ui/screens/'):
    for file in files:
        if file.endswith('.kt') and not file.endswith('WathakkerComponents.kt'):
            process_file(os.path.join(root, file))

