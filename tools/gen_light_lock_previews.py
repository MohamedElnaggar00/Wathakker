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


# --- home hero_large fallback: palette-flip the dark preview into the light one ---
# Used when the emulator render of hero_large is corrupt (deterministic skia
# encoder failure on the 866x420 bitmap). Palette from HomeWidgets.renderKind.
def flip_hero_large():
    import math
    src = os.path.join(ROOT, "drawable-nodpi", "home_preview_hero_large.png")
    dst = os.path.join(ROOT, "drawable-notnight-nodpi", "home_preview_hero_large.png")
    if not (os.path.exists(src) and os.path.isdir(os.path.dirname(dst))):
        print("hero_large flip skipped: paths missing")
        return
    PAL = [
        ((0x17, 0x17, 0x19), (0xF6, 0xF6, 0xF6)),
        ((0xFF, 0xFF, 0xFF), (0x1C, 0x1C, 0x1E)),
        ((0xC9, 0xC9, 0xCE), (0x63, 0x63, 0x6B)),
        ((0x96, 0x96, 0x9E), (0x6E, 0x6E, 0x76)),
        ((0xE5, 0xB4, 0x55), (0xB4, 0x7A, 0x1E)),
        ((0x4C, 0x4C, 0x4E), (0xD8, 0xD8, 0xDE)),
    ]
    im = Image.open(src).convert("RGBA")
    px = im.load()
    for y in range(im.height):
        for x in range(im.width):
            r, g, b, a = px[x, y]
            if not a:
                continue
            best, bd = None, 1e9
            for dk, lt in PAL:
                d = (r - dk[0]) ** 2 + (g - dk[1]) ** 2 + (b - dk[2]) ** 2
                if d < bd:
                    bd, best = d, lt
            px[x, y] = (best[0], best[1], best[2], a)
    im.save(dst)
    print("hero_large palette-flipped ->", dst)

if __name__ == "__main__" and "--flip-hero-large" in sys.argv:
    flip_hero_large()
