import os
import re

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
        
    old_content = content
    
    # Imports
    content = content.replace("import androidx.compose.material3.Switch", "import com.example.ui.components.WathakkerSwitch")
    content = content.replace("import androidx.compose.material3.AlertDialog", "import com.example.ui.components.WathakkerDialog")
    content = content.replace("import androidx.compose.material3.TopAppBar", "import com.example.ui.components.WathakkerTopBar")
    content = content.replace("import androidx.compose.material3.CenterAlignedTopAppBar", "import com.example.ui.components.WathakkerTopBar")
    content = content.replace("import androidx.compose.material3.TextField", "import com.example.ui.components.WathakkerTextField")
    content = content.replace("import androidx.compose.material3.OutlinedTextField", "import com.example.ui.components.WathakkerTextField")
    content = content.replace("import androidx.compose.material3.ModalBottomSheet", "import com.example.ui.components.WathakkerBottomSheet")

    # Replace usages
    content = re.sub(r'\bSwitch\(', 'WathakkerSwitch(', content)
    content = re.sub(r'\bAlertDialog\(', 'WathakkerDialog(', content)
    content = re.sub(r'\bTopAppBar\(', 'WathakkerTopBar(', content)
    content = re.sub(r'\bCenterAlignedTopAppBar\(', 'WathakkerTopBar(', content)
    content = re.sub(r'\bTextField\(', 'WathakkerTextField(', content)
    content = re.sub(r'\bOutlinedTextField\(', 'WathakkerTextField(', content)
    content = re.sub(r'\bModalBottomSheet\(', 'WathakkerBottomSheet(', content)

    # Some imports might be missing
    if content != old_content:
        imports_to_add = set()
        if "WathakkerSwitch(" in content and "import com.example.ui.components.WathakkerSwitch" not in content:
            imports_to_add.add("import com.example.ui.components.WathakkerSwitch")
        if "WathakkerDialog(" in content and "import com.example.ui.components.WathakkerDialog" not in content:
            imports_to_add.add("import com.example.ui.components.WathakkerDialog")
        if "WathakkerTopBar(" in content and "import com.example.ui.components.WathakkerTopBar" not in content:
            imports_to_add.add("import com.example.ui.components.WathakkerTopBar")
        if "WathakkerTextField(" in content and "import com.example.ui.components.WathakkerTextField" not in content:
            imports_to_add.add("import com.example.ui.components.WathakkerTextField")
        if "WathakkerBottomSheet(" in content and "import com.example.ui.components.WathakkerBottomSheet" not in content:
            imports_to_add.add("import com.example.ui.components.WathakkerBottomSheet")
            
        import_block = "\n".join(imports_to_add)
        if import_block:
            content = content.replace("package com.example.ui.screens", f"package com.example.ui.screens\n\n{import_block}")
            
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/ui/screens/'):
    for file in files:
        if file.endswith('.kt') and not file.endswith('WathakkerComponents.kt'):
            process_file(os.path.join(root, file))
