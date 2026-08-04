import os
import re

allowed_spacings = [0, 4, 8, 12, 16, 24, 32]

def get_closest(val):
    if val == 0:
        return 0
    # Find closest allowed value
    closest = min(allowed_spacings[1:], key=lambda x: abs(x - val))
    return closest

def replace_in_block(block):
    # This function takes the string inside the parentheses and replaces \d+\.dp
    def replacer(match):
        val = int(match.group(1))
        new_val = get_closest(val)
        return f"{new_val}.dp"
    
    return re.sub(r'\b(\d+)\.dp\b', replacer, block)

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    keywords = ["padding", "PaddingValues", "spacedBy", "Spacer"]
    
    new_content = ""
    i = 0
    n = len(content)
    while i < n:
        match_found = False
        for kw in keywords:
            if content.startswith(kw, i):
                # Ensure it's not a suffix of another word
                if i > 0 and (content[i-1].isalnum() or content[i-1] == '_'):
                    continue
                
                # Check for optional spaces and '('
                j = i + len(kw)
                while j < n and content[j].isspace():
                    j += 1
                if j < n and content[j] == '(':
                    # Found a block! Let's extract until balanced ')'
                    start_paren = j
                    open_count = 1
                    k = j + 1
                    while k < n and open_count > 0:
                        if content[k] == '(':
                            open_count += 1
                        elif content[k] == ')':
                            open_count -= 1
                        k += 1
                    
                    if open_count == 0:
                        # Extract the block
                        block_inside = content[start_paren+1:k-1]
                        new_block = replace_in_block(block_inside)
                        
                        new_content += content[i:start_paren+1] + new_block + ")"
                        i = k
                        match_found = True
                        break
        if not match_found:
            new_content += content[i]
            i += 1

    if new_content != content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(new_content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/'):
    for file in files:
        if file.endswith('.kt'):
            process_file(os.path.join(root, file))
