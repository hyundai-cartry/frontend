"""CARTRY 아이콘 SVG 를 Compose ImageVector 코드로 바꾼다.

두 단계로 쓴다.
  1) export  : UI 시안 HTML 의 <symbol> 을 하나씩 떼어 독립 SVG 파일로 저장한다(아이콘 원본).
       python svg_to_compose.py export <시안 html> designsystem/icons-svg
  2) generate: icons-svg/*.svg 를 읽어 Kotlin 파일을 만든다.
       python svg_to_compose.py generate designsystem/icons-svg designsystem/src/main/kotlin/com/cartry/designsystem/icon

필요한 것: Python 3.10+, playwright(크로미움, 그라데이션 기준 상자 계산용), fonttools + Pretendard 글꼴(아이콘 안 글자를 선으로 바꿀 때).
지원하는 SVG: path · rect · circle · ellipse · g · text, fill · stroke · opacity · stroke-linecap/linejoin/width · stroke-dasharray(꺾은선 조각으로 바꾼다),
transform 의 rotate · translate, linearGradient(objectBoundingBox 기준). 이 밖의 것을 만나면 멈추고 알린다.
ImageVector 에는 그룹 투명도가 없어서 g 의 opacity 는 자식 도형의 fillAlpha/strokeAlpha 에 곱한다.
"""
from __future__ import annotations
import re, sys, json, math, pathlib, xml.etree.ElementTree as ET

SVG_NS = "http://www.w3.org/2000/svg"
ET.register_namespace("", SVG_NS)
FONT_DIRS = [pathlib.Path.home() / "AppData/Local/Microsoft/Windows/Fonts", pathlib.Path("C:/Windows/Fonts"),
             pathlib.Path("/usr/share/fonts"), pathlib.Path.home() / "Library/Fonts"]
WEIGHT_NAME = {100: "Thin", 200: "ExtraLight", 300: "Light", 400: "Regular", 500: "Medium", 600: "SemiBold", 700: "Bold", 800: "ExtraBold", 900: "Black"}

# 마스코트(buddy)는 CSS 변수로 표정·색을 바꾼다. 변수 → Kotlin 인자 이름
BUDDY_VARS = {"--bar": "bar", "--e-main": "eyesIdle", "--e-oops": "eyesOops", "--e-think": "eyesThink", "--e-happy": "eyesHappy",
              "--bang": "markOops", "--q": "markThink", "--spark": "markCheer", "--rain": "markRain",
              "--neg": "red", "--pos": "blue", "--act": "green"}


# ───────────────────────── 1) export ─────────────────────────
def export(html_path: str, out_dir: str):
    t = pathlib.Path(html_path).read_text(encoding="utf-8")
    out = pathlib.Path(out_dir); out.mkdir(parents=True, exist_ok=True)
    n = 0
    for sid, attrs, body in re.findall(r'<symbol id="([^"]+)"([^>]*)>(.*?)</symbol>', t, re.S):
        if not sid.startswith(("i3-", "p-", "buddy", "ic-app")):
            continue
        vb = re.search(r'viewBox="([^"]+)"', attrs).group(1)
        body = re.sub(r"<!--.*?-->", "", body, flags=re.S).strip()
        svg = f'<svg xmlns="{SVG_NS}" viewBox="{vb}">\n{body}\n</svg>\n'
        ET.fromstring(svg)  # 형식 검사
        (out / f"{sid}.svg").write_text(svg, encoding="utf-8")
        n += 1
    print(f"export: {n} 개 → {out}")


# ───────────────────────── 2) generate ─────────────────────────
def kname(sid: str) -> str:
    parts = re.split(r"[-_]", sid)
    head = {"i3": "I3", "p": "Line", "ic": "App"}.get(parts[0], parts[0].capitalize())
    return head + "".join(p[:1].upper() + p[1:] for p in parts[1:])


def color_expr(v: str, cur: str = "Color.Black") -> str | None:
    v = v.strip()
    if v in ("none", "transparent"):
        return None
    if v == "currentColor":
        return cur
    m = re.fullmatch(r"var\((--[a-z0-9-]+)\)", v)
    if m:
        return BUDDY_VARS[m.group(1)]
    if v.startswith("#"):
        h = v[1:]
        if len(h) == 3:
            h = "".join(c * 2 for c in h)
        if len(h) != 6:
            raise ValueError(f"색 형식: {v}")
        return f"Color(0xFF{h.upper()})"
    names = {"white": "FFFFFF", "black": "000000", "#fff": "FFFFFF", "#000": "000000"}
    if v.lower() in names:
        return f"Color(0xFF{names[v.lower()]})"
    raise ValueError(f"지원하지 않는 색: {v}")


def num(v, default=0.0):
    if v is None:
        return default
    return float(str(v).replace("px", ""))


def f(x: float) -> str:
    s = f"{x:.3f}".rstrip("0").rstrip(".")
    return (s if s not in ("-0", "") else "0") + "f"


def rect_path(x, y, w, h, rx, ry):
    if rx <= 0 and ry <= 0:
        return f"M{x},{y}H{x + w}V{y + h}H{x}Z"
    rx = min(rx or ry, w / 2); ry = min(ry or rx, h / 2)
    return (f"M{x + rx},{y}H{x + w - rx}A{rx},{ry} 0 0 1 {x + w},{y + ry}V{y + h - ry}"
            f"A{rx},{ry} 0 0 1 {x + w - rx},{y + h}H{x + rx}A{rx},{ry} 0 0 1 {x},{y + h - ry}"
            f"V{y + ry}A{rx},{ry} 0 0 1 {x + rx},{y}Z")


def ellipse_path(cx, cy, rx, ry):
    return f"M{cx - rx},{cy}A{rx},{ry} 0 1 0 {cx + rx},{cy}A{rx},{ry} 0 1 0 {cx - rx},{cy}Z"


_font_cache: dict = {}


def text_path(text: str, x: float, y: float, size: float, weight: int, anchor: str) -> str:
    from fontTools.ttLib import TTFont
    from fontTools.pens.svgPathPen import SVGPathPen
    from fontTools.pens.transformPen import TransformPen
    wname = WEIGHT_NAME[min(WEIGHT_NAME, key=lambda k: abs(k - weight))]
    if wname not in _font_cache:
        for d in FONT_DIRS:
            for ext in ("ttf", "otf"):
                p = d / f"Pretendard-{wname}.{ext}"
                if p.exists():
                    _font_cache[wname] = TTFont(str(p)); break
            if wname in _font_cache:
                break
        else:
            raise FileNotFoundError(f"Pretendard-{wname} 글꼴을 찾지 못했다")
    font = _font_cache[wname]
    gs = font.getGlyphSet(); cmap = font.getBestCmap(); upm = font["head"].unitsPerEm
    sc = size / upm
    names = [cmap[ord(c)] for c in text]
    adv = sum(gs[g].width for g in names) * sc
    ox = x - (adv / 2 if anchor == "middle" else adv if anchor == "end" else 0)
    pen = SVGPathPen(gs)
    for g in names:
        gs[g].draw(TransformPen(pen, (sc, 0, 0, -sc, ox, y)))
        ox += gs[g].width * sc
    return pen.getCommands()


def parse_style(el) -> dict:
    d = {}
    for part in (el.get("style") or "").split(";"):
        if ":" in part:
            k, v = part.split(":", 1); d[k.strip()] = v.strip()
    return d


def transforms(tr: str | None):
    """rotate/translate 를 순서대로 돌려준다. 그 밖의 변환은 멈춘다."""
    out = []
    if not tr:
        return out
    for fn, args in re.findall(r"(\w+)\(([^)]*)\)", tr):
        a = [float(v) for v in re.split(r"[ ,]+", args.strip()) if v]
        if fn == "rotate":
            out.append(("rotate", a[0], a[1] if len(a) > 1 else 0.0, a[2] if len(a) > 2 else 0.0))
        elif fn == "translate":
            out.append(("translate", a[0], a[1] if len(a) > 1 else 0.0))
        else:
            raise ValueError(f"지원하지 않는 transform: {fn}")
    return out


class Gen:
    def __init__(self, sid: str, root, bboxes: dict, cur: str):
        self.sid, self.root, self.bboxes, self.cur = sid, root, bboxes, cur
        self.grads = {}
        for g in root.iter(f"{{{SVG_NS}}}linearGradient"):
            if g.get("gradientUnits") not in (None, "objectBoundingBox") or g.get("gradientTransform"):
                raise ValueError(f"{sid}: 지원하지 않는 그라데이션 설정")
            stops = []
            for s in g.findall(f"{{{SVG_NS}}}stop"):
                st = parse_style(s)
                off = s.get("offset", "0"); off = float(off[:-1]) / 100 if off.endswith("%") else float(off)
                col = color_expr(st.get("stop-color", s.get("stop-color", "#000")))
                op = float(st.get("stop-opacity", s.get("stop-opacity", 1)))
                stops.append((off, col if op == 1 else f"{col}.copy(alpha = {f(op)})"))
            self.grads[g.get("id")] = (num(g.get("x1"), 0), num(g.get("y1"), 0), num(g.get("x2"), 1), num(g.get("y2"), 0), stops)
        self.lines: list[str] = []
        self.idx = 0  # 도형 순번(브라우저 bbox 와 짝)

    def brush(self, v: str | None, bbox, alpha_expr: str):
        if v is None:
            return None
        m = re.fullmatch(r"url\(#([^)]+)\)", v.strip())
        if m:
            x1, y1, x2, y2, stops = self.grads[m.group(1)]
            bx, by, bw, bh = bbox
            st = ", ".join(f"{f(o)} to {c}" for o, c in stops)
            return (f"Brush.linearGradient({st}, start = Offset({f(bx + x1 * bw)}, {f(by + y1 * bh)}), "
                    f"end = Offset({f(bx + x2 * bw)}, {f(by + y2 * bh)}))")
        c = color_expr(v, self.cur)
        return None if c is None else f"SolidColor({c})"

    def walk(self, el, inh: dict, ind: str):
        tag = el.tag.split("}")[1]
        if tag in ("defs", "linearGradient", "stop", "title", "desc"):
            return
        st = parse_style(el)
        a = dict(inh)
        for k in ("fill", "stroke", "stroke-width", "stroke-linecap", "stroke-linejoin", "font-size", "font-weight", "font-family", "text-anchor"):
            v = st.get(k, el.get(k))
            if v is not None:
                a[k] = v
        op = st.get("opacity", el.get("opacity"))
        if op is not None:
            mv = re.fullmatch(r"var\((--[a-z0-9-]+)\)", op.strip())
            term = BUDDY_VARS[mv.group(1)] if mv else f(float(op))
            a["alpha"] = term if inh.get("alpha", "1f") == "1f" else f"{inh['alpha']} * {term}"
        trs = transforms(el.get("transform"))
        opened = 0
        for t in trs:
            if t[0] == "rotate":
                self.lines.append(f"{ind}addGroup(rotate = {f(t[1])}, pivotX = {f(t[2])}, pivotY = {f(t[3])})")
            else:
                self.lines.append(f"{ind}addGroup(translationX = {f(t[1])}, translationY = {f(t[2])})")
            opened += 1
        if tag in ("svg", "g"):
            for c in el:
                self.walk(c, a, ind)
        elif tag in ("path", "rect", "circle", "ellipse", "text"):
            if tag == "path":
                d = el.get("d")
            elif tag == "rect":
                d = rect_path(num(el.get("x")), num(el.get("y")), num(el.get("width")), num(el.get("height")), num(el.get("rx")), num(el.get("ry")))
            elif tag == "circle":
                r = num(el.get("r")); d = ellipse_path(num(el.get("cx")), num(el.get("cy")), r, r)
            elif tag == "ellipse":
                d = ellipse_path(num(el.get("cx")), num(el.get("cy")), num(el.get("rx")), num(el.get("ry")))
            else:
                fw = a.get("font-weight", "400"); fw = {"bold": 700, "normal": 400}.get(fw, None) or int(fw)
                d = text_path("".join(el.itertext()), num(el.get("x")), num(el.get("y")), num(a.get("font-size", 16)), fw, a.get("text-anchor", "start"))
            info = self.bboxes[self.idx]; self.idx += 1
            bbox = info["bbox"]
            if info["dash"]:  # ImageVector 에는 점선이 없어서 점선 조각을 꺾은선으로 바꿔 둔다
                d = info["dash"]
            alpha = a.get("alpha", "1f")
            fill = self.brush(a.get("fill", "#000"), bbox, alpha)
            stroke = self.brush(a.get("stroke"), bbox, alpha)
            args = [f'pathData = addPathNodes("{d}")']
            if fill:
                args.append(f"fill = {fill}")
                if alpha != "1f":
                    args.append(f"fillAlpha = {alpha}")
            if stroke:
                args.append(f"stroke = {stroke}")
                if alpha != "1f":
                    args.append(f"strokeAlpha = {alpha}")
                args.append(f"strokeLineWidth = {f(num(a.get('stroke-width', 1)))}")
                cap = a.get("stroke-linecap", "butt"); join = a.get("stroke-linejoin", "miter")
                args.append(f"strokeLineCap = StrokeCap.{ {'butt': 'Butt', 'round': 'Round', 'square': 'Square'}[cap] }")
                args.append(f"strokeLineJoin = StrokeJoin.{ {'miter': 'Miter', 'round': 'Round', 'bevel': 'Bevel'}[join] }")
            if not fill and not stroke:
                pass
            else:
                self.lines.append(f"{ind}addPath({', '.join(args)})")
        else:
            raise ValueError(f"{self.sid}: 지원하지 않는 요소 <{tag}>")
        for _ in range(opened):
            self.lines.append(f"{ind}clearGroup()")


BBOX_JS = r"""() => {
  // 각 도형의 기준 상자(그라데이션 좌표용)와, 점선이면 점선 조각을 꺾은선으로 바꾼 path 문자열을 돌려준다.
  // 점선은 Chrome(Skia)처럼 하위 경로(M 으로 시작하는 조각)마다 무늬를 처음부터 다시 시작한다.
  const svg = document.querySelector('svg');
  const shapes = [...svg.querySelectorAll('path,rect,circle,ellipse,text')].filter(e => !e.closest('defs'));
  const NS = 'http://www.w3.org/2000/svg';
  return shapes.map(e => {
    const b = e.getBBox(); const res = {bbox: [b.x, b.y, b.width, b.height], dash: null};
    const da = e.getAttribute('stroke-dasharray');
    if (da && e.tagName === 'path') {
      const pat = da.trim().split(/[ ,]+/).map(Number); const subs = e.getAttribute('d').match(/M[^M]*/g);
      const parts = [];
      for (const sd of subs) {
        const t = document.createElementNS(NS, 'path'); t.setAttribute('d', sd); svg.appendChild(t);
        const L = t.getTotalLength(); let pos = 0, i = 0;
        while (pos < L) {
          const len = pat[i % pat.length], on = i % 2 === 0, end = Math.min(pos + len, L);
          if (on) {
            const pts = []; const n = Math.max(1, Math.ceil((end - pos) / 0.5));
            for (let k = 0; k <= n; k++) { const q = t.getPointAtLength(pos + (end - pos) * k / n); pts.push(q.x.toFixed(3) + ',' + q.y.toFixed(3)); }
            parts.push('M' + pts[0] + 'L' + pts.slice(1).join(' '));
          }
          pos = end; i++;
        }
        t.remove();
      }
      res.dash = parts.join('');
    }
    return res;
  });
}"""


def generate(svg_dir: str, kt_dir: str):
    from playwright.sync_api import sync_playwright
    svg_dir, kt_dir = pathlib.Path(svg_dir), pathlib.Path(kt_dir)
    kt_dir.mkdir(parents=True, exist_ok=True)
    files = sorted(svg_dir.glob("*.svg"))
    icons, buddy = [], None
    with sync_playwright() as p:
        b = p.chromium.launch(); pg = b.new_page()
        for fp in files:
            sid = fp.stem
            src = fp.read_text(encoding="utf-8")
            pg.set_content(f"<html><body style='margin:0;font-family:Pretendard'>{src}</body></html>")
            boxes = pg.evaluate(BBOX_JS)
            root = ET.fromstring(src)
            vb = [float(v) for v in root.get("viewBox").split()]
            g = Gen(sid, root, boxes, "Color.Black")
            g.walk(root, {}, "        ")
            if g.idx != len(boxes):
                raise RuntimeError(f"{sid}: 도형 수 불일치 {g.idx} != {len(boxes)}")
            if sid == "buddy":
                buddy = (vb, g.lines)
            else:
                icons.append((sid, vb, g.lines, "currentColor" in src))
        b.close()

    hdr = ("// 이 파일은 designsystem/tools/svg_to_compose.py 가 만든다. 직접 고치지 말고 icons-svg/*.svg 를 고친 뒤 다시 생성한다.\n"
           "package com.cartry.designsystem.icon\n\n"
           "import androidx.compose.ui.geometry.Offset\n"
           "import androidx.compose.ui.graphics.Brush\nimport androidx.compose.ui.graphics.Color\n"
           "import androidx.compose.ui.graphics.SolidColor\nimport androidx.compose.ui.graphics.StrokeCap\n"
           "import androidx.compose.ui.graphics.StrokeJoin\nimport androidx.compose.ui.graphics.vector.ImageVector\n"
           "import androidx.compose.ui.graphics.vector.addPathNodes\nimport androidx.compose.ui.unit.dp\n\n")
    body = [hdr, "/** 시안에서 직접 그린 아이콘. `I3*` = 3D 아이콘(색이 들어 있음), `Line*` = 선 아이콘(검정으로 그려 두고 쓸 때 tint 로 색을 입힌다). */\n",
            "object CartryIcons {\n"]
    for sid, vb, lines, tint in icons:
        nm = kname(sid)
        body.append(f"    /** `{sid}`{' — 선 아이콘, tint 로 색을 입힌다' if tint else ''} */\n")
        body.append(f"    val {nm}: ImageVector by lazy {{\n")
        body.append(f'        ImageVector.Builder(name = "{sid}", defaultWidth = {f(vb[2])[:-1]}.dp, defaultHeight = {f(vb[3])[:-1]}.dp, viewportWidth = {f(vb[2])}, viewportHeight = {f(vb[3])}).apply {{\n')
        if vb[0] or vb[1]:
            body.append(f"        addGroup(translationX = {f(-vb[0])}, translationY = {f(-vb[1])})\n")
        body.extend(l + "\n" for l in lines)
        body.append("        }.build()\n    }\n\n")
    body.append("    /** 전체 목록(미리보기용). */\n    val all: List<Pair<String, ImageVector>> by lazy {\n        listOf(\n")
    body.extend(f'            "{sid}" to {kname(sid)},\n' for sid, *_ in icons)
    body.append("        )\n    }\n}\n")
    (kt_dir / "CartryIcons.kt").write_text("".join(body), encoding="utf-8")

    if buddy:
        vb, lines = buddy
        params = ", ".join(f"{v}: {'Color' if v in ('bar', 'red', 'blue', 'green') else 'Float'}" for v in BUDDY_VARS.values())
        out = [hdr.replace("import androidx.compose.ui.unit.dp\n", "import androidx.compose.ui.unit.dp\n"),
               "/** 카트리 마스코트 벡터. 표정(eyes*)·표시(mark*)는 0f 또는 1f, bar 는 차 앞 빛줄 색. CartryBuddy 컴포저블이 쓴다. */\n",
               f"internal fun buddyVector({params}): ImageVector =\n",
               f'    ImageVector.Builder(name = "buddy", defaultWidth = {f(vb[2])[:-1]}.dp, defaultHeight = {f(vb[3])[:-1]}.dp, viewportWidth = {f(vb[2])}, viewportHeight = {f(vb[3])}).apply {{\n']
        if vb[0] or vb[1]:
            out.append(f"        addGroup(translationX = {f(-vb[0])}, translationY = {f(-vb[1])})\n")
        out.extend(l + "\n" for l in lines)
        out.append("    }.build()\n")
        (kt_dir / "BuddyVector.kt").write_text("".join(out), encoding="utf-8")
    print(f"generate: 아이콘 {len(icons)} 개{' + 마스코트' if buddy else ''} → {kt_dir}")


if __name__ == "__main__":
    sys.stdout.reconfigure(encoding="utf-8")
    cmd = sys.argv[1]
    {"export": export, "generate": generate}[cmd](*sys.argv[2:])
