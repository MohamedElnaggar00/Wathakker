import os
import re

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
        
    old_content = content
    
    # Imports
    content = content.replace("import com.example.ui.components.PrimaryButton", "import com.example.ui.components.WathakkerButton")
    content = content.replace("import com.example.ui.components.SecondaryButton", "")
    content = content.replace("import com.example.ui.components.SmallButton", "")
    content = content.replace("import com.example.ui.components.SmallSecondaryButton", "")
    content = content.replace("import com.example.ui.components.ChipButton", "import com.example.ui.components.WathakkerChip")
    content = content.replace("import com.example.ui.components.PrimaryCard", "import com.example.ui.components.WathakkerCard")
    content = content.replace("import com.example.ui.components.Cards", "")
    content = content.replace("import com.example.ui.components.Buttons", "")

    # Buttons
    content = re.sub(r'\bPrimaryButton\(', 'WathakkerButton(', content)
    content = re.sub(r'\bSecondaryButton\(', 'WathakkerButton(\n    isSecondary = true,', content)
    content = re.sub(r'\bSmallButton\(', 'WathakkerButton(\n    isSmall = true,', content)
    content = re.sub(r'\bSmallSecondaryButton\(', 'WathakkerButton(\n    isSecondary = true,\n    isSmall = true,', content)
    content = re.sub(r'\bChipButton\(', 'WathakkerChip(', content)
    content = re.sub(r'\bPrimaryCard\(', 'WathakkerCard(', content)
    content = re.sub(r'\bPrimaryCard \{', 'WathakkerCard {', content)

    if content != old_content:
        # Check if we need to add imports
        if "WathakkerButton(" in content and "import com.example.ui.components.WathakkerButton" not in content:
            content = content.replace("import com.example.ui.components.", "import com.example.ui.components.WathakkerButton\nimport com.example.ui.components.")
            
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/'):
    for file in files:
        if file.endswith('.kt') and not file.endswith('WathakkerComponents.kt') and not file.endswith('Buttons.kt') and not file.endswith('Cards.kt'):
            process_file(os.path.join(root, file))
