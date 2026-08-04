with open('app/src/main/java/com/example/ui/theme/Type.kt', 'r') as f:
    text = f.read()
import re
text = re.sub(r'(titleMedium = .*?fontSize = )\d+\.sp', r'\g<1>18.sp', text)
text = re.sub(r'(bodyMedium = .*?fontSize = )\d+\.sp', r'\g<1>16.sp', text)

with open('app/src/main/java/com/example/ui/theme/Type.kt', 'w') as f:
    f.write(text)
