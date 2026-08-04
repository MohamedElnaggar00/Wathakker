import os

filepath = 'app/src/main/java/com/example/ui/screens/HomeScreen.kt'
with open(filepath, 'r', encoding='utf-8') as f:
    content = f.read()

to_replace = """                        val tagColor = remember(tag.colorHex) {
                            try {
                                androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
                            } catch (e: Exception) {
                                MaterialTheme.colorScheme.onSurfaceVariant
                            }
                        }"""
                        
replacement = """                        val defaultTagColor = MaterialTheme.colorScheme.onSurfaceVariant
                        val tagColor = remember(tag.colorHex, defaultTagColor) {
                            try {
                                androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(tag.colorHex))
                            } catch (e: Exception) {
                                defaultTagColor
                            }
                        }"""

content = content.replace(to_replace, replacement)

with open(filepath, 'w', encoding='utf-8') as f:
    f.write(content)

