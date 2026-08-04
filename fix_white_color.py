import os

def replace_in_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
        
    new_content = content.replace("Color.White", "MaterialTheme.colorScheme.onPrimary")
    
    if new_content != content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(new_content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/ui/'):
    for file in files:
        if file.endswith('.kt'):
            replace_in_file(os.path.join(root, file))
