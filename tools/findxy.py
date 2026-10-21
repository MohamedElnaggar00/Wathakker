import sys, re
import xml.etree.ElementTree as ET
needle, path = sys.argv[1], sys.argv[2]
try:
    root = ET.parse(path).getroot()
except Exception:
    sys.exit(1)
for node in root.iter('node'):
    for attr in ('text', 'content-desc'):
        v = node.get(attr) or ''
        if needle in v:
            b = node.get('bounds') or ''
            m = re.match(r'\[(\d+),(\d+)\]\[(\d+),(\d+)\]', b)
            if m:
                x1, y1, x2, y2 = map(int, m.groups())
                print((x1 + x2) // 2, (y1 + y2) // 2)
                sys.exit(0)
sys.exit(1)
