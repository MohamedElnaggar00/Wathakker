import os
import re

allowed_sizes = [13, 16, 18, 22, 32]

def get_closest_size(val):
    return min(allowed_sizes, key=lambda x: abs(x - val))

def replacer(match):
    prefix = match.group(1)
    val = int(match.group(2))
    new_val = get_closest_size(val)
    return f"{prefix}{new_val}.sp"

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    new_content = re.sub(r'(fontSize\s*=\s*)(\d+)\.sp', replacer, content)

    if new_content != content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(new_content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/'):
    for file in files:
        if file.endswith('.kt'):
            process_file(os.path.join(root, file))
