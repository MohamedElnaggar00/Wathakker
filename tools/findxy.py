import sys, re
import xml.etree.ElementTree as ET
needle, path = sys.argv[1], sys.argv[2]
mode = sys.argv[3] if len(sys.argv) > 3 else 'click'
try:
    root = ET.parse(path).getroot()
except Exception:
    sys.exit(1)
parent = {}
for p in root.iter():
    for c in p:
        parent[c] = p
def center(node):
    m = re.match(r'\[(\d+),(\d+)\]\[(\d+),(\d+)\]', node.get('bounds') or '')
    if not m: return None
    x1, y1, x2, y2 = map(int, m.groups())
    return ((x1 + x2) // 2, (y1 + y2) // 2)
for node in root.iter('node'):
    for attr in ('text', 'content-desc'):
        v = node.get(attr) or ''
        hit = (needle == v) if mode == 'exact' else (needle in v)
        if hit:
            n = node
            if mode == 'cell':
                m = n
                while m is not None and 'WidgetCell' not in (m.get('class') or ''):
                    m = parent.get(m)
                if m is not None: n = m
            elif mode == 'long':
                while n is not None and n.get('long-clickable') != 'true':
                    n = parent.get(n)
            else:
                while n is not None and n.get('clickable') != 'true' and n.get('long-clickable') != 'true':
                    n = parent.get(n)
            if n is None: n = node
            c = center(n)
            if c:
                print(c[0], c[1])
                sys.exit(0)
sys.exit(1)
