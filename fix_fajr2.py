import re

with open('app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt', 'r') as f:
    text = f.read()

text = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\([^)]+\),\s*color = ([^,]+),\s*modifier = Modifier\.fillMaxWidth\(\)\s*\)\s*\{\s*Column\(\s*modifier = Modifier\s*\.fillMaxWidth\(\)\s*\.padding\([^)]+\)\s*\)\s*\{',
    r'    PrimaryCard(color = \1) {',
    text
)

text = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\([^)]+\),\s*color = ([^,]+),\s*modifier = Modifier\.fillMaxWidth\(\)\s*\)\s*\{\s*Row\(\s*modifier = Modifier\s*\.fillMaxWidth\(\)\s*\.padding\([^)]+\),\s*verticalAlignment = Alignment\.CenterVertically,\s*horizontalArrangement = Arrangement\.SpaceBetween\s*\)\s*\{',
    r'    PrimaryCard(color = \1) {\n        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {',
    text
)

text = re.sub(
    r'    Surface\(\s*shape = RoundedCornerShape\([^)]+\),\s*color = ([^,]+)\s*\)\s*\{\s*Row\(\s*modifier = Modifier\s*\.fillMaxWidth\(\)\s*\.padding\([^)]+\),\s*verticalAlignment = Alignment\.CenterVertically\s*\)\s*\{',
    r'    PrimaryCard(color = \1) {\n        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {',
    text
)

with open('app/src/main/java/com/example/fajr/ui/FajrSettingsScreen.kt', 'w') as f:
    f.write(text)
