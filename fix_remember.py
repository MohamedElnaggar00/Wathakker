import os

def fix_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    to_replace = """    val tagColor = remember(tag.colorHex) {
        try {
            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
        } catch (e: Exception) {
            MaterialTheme.colorScheme.onSurfaceVariant
        }
    }"""
    replacement = """    val defaultTagColor = MaterialTheme.colorScheme.onSurfaceVariant
    val tagColor = remember(tag.colorHex, defaultTagColor) {
        try {
            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
        } catch (e: Exception) {
            defaultTagColor
        }
    }"""
    content = content.replace(to_replace, replacement)

    to_replace2 = """    val color = remember(colorHex) {
        try {
            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(colorHex))
        } catch (e: Exception) {
            MaterialTheme.colorScheme.onSurfaceVariant
        }
    }"""
    replacement2 = """    val defaultColor = MaterialTheme.colorScheme.onSurfaceVariant
    val color = remember(colorHex, defaultColor) {
        try {
            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(colorHex))
        } catch (e: Exception) {
            defaultColor
        }
    }"""
    content = content.replace(to_replace2, replacement2)
    
    to_replace3 = """                    val tagColor = remember(tag.colorHex) {
                        try {
                            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
                        } catch (e: Exception) {
                            MaterialTheme.colorScheme.onSurfaceVariant
                        }
                    }"""
    replacement3 = """                    val defaultTagColor = MaterialTheme.colorScheme.onSurfaceVariant
                    val tagColor = remember(tag.colorHex, defaultTagColor) {
                        try {
                            androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
                        } catch (e: Exception) {
                            defaultTagColor
                        }
                    }"""
    content = content.replace(to_replace3, replacement3)

    if content != open(filepath, 'r', encoding='utf-8').read():
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Updated {filepath}")

for root, _, files in os.walk('app/src/main/java/com/example/ui/screens/'):
    for file in files:
        if file.endswith('.kt'):
            fix_file(os.path.join(root, file))
