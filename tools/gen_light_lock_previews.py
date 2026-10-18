#!/usr/bin/env python3
"""Generate LIGHT-theme (notnight) lock-preview variants from the dark originals.

- Capsule layer-list XMLs: drawable/lock_preview_*_capsule.xml -> drawable-notnight/
  with the dark capsule bg (#ff343636) swapped to the light card (#FFF6F6F6).
- Monochrome bitmap PNGs (white ink, alpha-carried antialiasing):
  drawable-{hdpi,mdpi}/lock_preview_*.png -> drawable-notnight-{hdpi,mdpi}/
  with ink re-colored to the app's real light-theme ink 0xFF1C1C1E, alpha preserved.
"""
import os, sys
from PIL import Image

INK = (28, 28, 30)  # 0xFF1C1C1E
ROOT = "app/src/main/res"

made = []

# 1) capsule XML variants
src_dir = os.path.join(ROOT, "drawable")
dst_dir = os.path.join(ROOT, "drawable-notnight")
os.makedirs(dst_dir, exist_ok=True)
for f in sorted(os.listdir(src_dir)):
    if not f.endswith("_capsule.xml"):
        continue
    s = open(os.path.join(src_dir, f)).read()
    if "#ff343636" in s:
        s = s.replace("#ff343636", "#FFF6F6F6")
    elif "#FF343636" in s:
        s = s.replace("#FF343636", "#FFF6F6F6")
    else:
        print("WARN: no dark capsule color in", f)
    open(os.path.join(dst_dir, f), "w").write(s)
    made.append(os.path.join(dst_dir, f))

# 2) PNG ink flips per density bucket
for dens in ("hdpi", "mdpi"):
    sd = os.path.join(ROOT, f"drawable-{dens}")
    dd = os.path.join(ROOT, f"drawable-notnight-{dens}")
    if not os.path.isdir(sd):
        continue
    os.makedirs(dd, exist_ok=True)
    for f in sorted(os.listdir(sd)):
        if not (f.startswith("lock_preview_") and f.endswith(".png")):
            continue
        im = Image.open(os.path.join(sd, f)).convert("RGBA")
        px = im.load()
        for y in range(im.height):
            for x in range(im.width):
                r, g, b, a = px[x, y]
                if a:
                    px[x, y] = (INK[0], INK[1], INK[2], a)
        im.save(os.path.join(dd, f))
        made.append(os.path.join(dd, f))

print(f"generated {len(made)} light lock-preview files")
for m in made:
    print(" ", m)
