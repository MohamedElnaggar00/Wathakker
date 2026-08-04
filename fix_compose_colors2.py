import os
import re

def fix_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    pattern = r"val (\w+) = remember\(([^)]+)\) \{\s*try \{\s*androidx\.compose\.ui\.graphics\.Color\([^)]+\)\s*\} catch \([^)]+\) \{\s*MaterialTheme\.colorScheme\.onSurfaceVariant\s*\}\s*\}"
    
    def repl(m):
        var_name = m.group(1)
        args = m.group(2)
        return f"val default{var_name.capitalize()} = MaterialTheme.colorScheme.onSurfaceVariant\n    val {var_name} = remember({args}) {{\n        try {{\n            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor({args}))\n        }} catch (e: Exception) {{\n            default{var_name.capitalize()}\n        }}\n    }}"
    
    content = re.sub(pattern, repl, content)

    if content != open(filepath, 'r', encoding='utf-8').read():
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/ui/screens/'):
    for file in files:
        if file.endswith('.kt'):
            fix_file(os.path.join(root, file))
