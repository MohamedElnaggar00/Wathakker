with open("app/src/main/java/com/example/ui/screens/MainScreen.kt", "r") as f:
    lines = f.readlines()

new_lines = []
r_imported = False
for line in lines:
    if "import com.example.R" in line:
        if not r_imported:
            new_lines.append(line)
            r_imported = True
    else:
        new_lines.append(line)

with open("app/src/main/java/com/example/ui/screens/MainScreen.kt", "w") as f:
    f.writelines(new_lines)
