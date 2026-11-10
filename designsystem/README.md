# CARTRY 디자인 시스템 (다크)

UI 시안(6.39~6.40, 다크)의 색·글자·모서리·간격·그림자를 **디자인 토큰**으로, 화면마다 반복되는 부품을 **공통 컴포넌트**로 옮긴 코드다. 화면을 만들 때 색이나 크기를 직접 쓰지 않고 여기 있는 것을 가져다 쓴다.

![공통 컴포넌트 모음](docs/gallery.png)

아이콘 87개: [docs/icons.png](docs/icons.png)

## 용어

| 용어 | 뜻 |
| --- | --- |
| Compose (Jetpack Compose) | 안드로이드 화면을 Kotlin 함수로 그리는 방식. 이 폴더의 코드는 전부 Compose 다 |
| 디자인 토큰 | 색·글자 크기 같은 디자인 값에 이름을 붙인 것. `CartryTheme.colors.goal` 처럼 쓴다 |
| 컴포저블 | 화면 한 조각을 그리는 Compose 함수. `CartryButton(...)` 같은 것 |
| ImageVector | Compose 가 쓰는 벡터 그림 형식. 시안의 SVG 아이콘을 이 형식으로 바꿔 두었다 |
| dp / sp | 화면 밀도와 상관없이 같은 크기로 보이게 하는 단위(sp 는 글자용). Pleos 17인치는 160dpi 라 1dp = 1px 이고, 시안의 px 값을 그대로 쓴다 |
| @Preview | Android Studio 미리보기 창에 컴포저블을 그려 주는 표시. 에뮬레이터 없이 화면을 확인할 수 있다 |

## 폴더

```
designsystem/
├─ src/main/kotlin/com/cartry/designsystem/
│  ├─ theme/       토큰: CartryColors · CartryTypography · CartryShapes · CartrySpacing · CartryElevation · CartryTheme
│  ├─ component/   공통 컴포넌트 (아래 표)
│  ├─ icon/        CartryIcons.kt(아이콘 87개) · BuddyVector.kt(카트리 마스코트) — 자동 생성, 직접 고치지 않는다
│  └─ preview/     CartryComponentGallery · CartryIconGallery (모음 화면)
├─ icons-svg/      아이콘 원본 SVG 88개(마스코트 포함). 아이콘을 고칠 때는 이 파일을 고친다
└─ tools/svg_to_compose.py   SVG → Kotlin 변환기
```

## 프로젝트 틀에 넣는 법

프로젝트 틀(Android Studio 프로젝트)이 올라오면 둘 중 하나로 넣는다.

1. **app 모듈에 그대로 복사** (가장 간단): `src/main/kotlin/com/cartry/designsystem` 폴더를 `app/src/main/java/` 아래로 옮긴다.
2. **별도 모듈로**: Android Studio 의 New Module → Android Library 로 `designsystem` 모듈을 만들고 이 `src` 를 넣은 뒤, app 의 `build.gradle.kts` 에 `implementation(project(":designsystem"))` 를 추가한다.

필요한 것:

- Compose UI **1.9 이상** (그림자에 `Modifier.dropShadow` · `innerShadow` 를 쓴다). Android Studio 최신 템플릿의 Compose BOM 이면 된다.
- 의존성: `androidx.compose.foundation`, `androidx.compose.ui`. Material 은 쓰지 않는다.
- 글꼴: [Pretendard](https://github.com/orioncactus/pretendard) Regular·Medium·SemiBold·Bold·ExtraBold 를 `app/src/main/res/font/` 에 `pretendard_regular.ttf` 처럼 소문자 이름으로 넣고 테마에 넘긴다.

```kotlin
val pretendard = FontFamily(
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_medium, FontWeight.Medium),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.pretendard_bold, FontWeight.Bold),
    Font(R.font.pretendard_extrabold, FontWeight.ExtraBold),
)
setContent { CartryTheme(fontFamily = pretendard) { /* 화면 */ } }
```

미리보기 창에서 모음 화면을 보려면 app 쪽에 아래 파일 하나를 만든다.

```kotlin
@Preview(widthDp = 2560, heightDp = 3200)
@Composable
fun GalleryPreview() = CartryTheme { CartryComponentGallery() }
```

## 토큰

값은 시안 HTML 을 브라우저로 렌더링해 **실제로 적용된 값**을 잰 것이다(48화면 전수). 괄호는 시안 CSS 변수 이름.

**색 (`CartryTheme.colors`)** — 뜻이 고정이다. 파랑 = 힌트·목표·지금 할 일, 초록 = 달성, 빨강 = 오작동.

| 이름 | 값 | 쓰는 곳 |
| --- | --- | --- |
| background | #1A1B1E | 앱 바탕 |
| surface (--b100) | #313236 | 카드·말풍선·보조 버튼·원형 버튼 |
| surfaceSelected (--b200) | #44464E | 고른 카드 |
| surfaceTrack (--b300) | #686A72 | 진행 막대 빈 칸, 번호 동그라미 |
| textPrimary / Secondary / Tertiary / Disabled | 흰색 100 / 84 / 64 / 32% | 제목 / 설명 / 보조 / 비활성 |
| goal (--pos) | #0082FF | 목표·힌트 (연한 바탕 goalSoft 16%) |
| success (--act) | #00E074 | 달성 (연한 바탕 successSoft 16%, 위 글자 onSuccess #06301A) |
| danger (--neg) | #FF4C28 | 오작동 |
| primaryFill | #1A90FF → #0078F0 | 주 버튼 그라데이션 |
| cardSheen | 위 흰 7.5% → 아래 검정 12% | 카드 위에 한 겹 덮는 광택 |

**글자 (`CartryTheme.type`)** — 크기/굵기/줄 높이

| 이름 | 값 | 쓰는 곳 |
| --- | --- | --- |
| display | 120/800 | 큰 숫자 |
| talkTitle · talkTitleCompact | 60/700/74 · 56/700/68 | 카트리 말풍선 제목 (넓은 · 좁은) |
| dialogTitle | 48/700/60 | 모달 제목 |
| tileTitle · cardTitle | 46/700/56 · 44/700/54 | 타일·카드 제목 |
| rowTitle · barTitle | 42/600 · 40/700 | 목록 행 제목 · 상태 막대 이름 |
| progressTitle · progressCounter | 40/600 · 40/800 | 진행 표시 |
| sectionTitle · lead · body | 36/700/46 · 36/400/48 · 34/400/48 | 소제목 · 말풍선 설명 · 본문 |
| button · appName · tileBody | 32/600 · 32/700 · 32/400/44 | 버튼 · 「CARTRY」 · 타일 설명 |
| rowBody · tag | 30/400 · 30/700 | 목록 행 설명 · 파란 꼬리표 |
| bodySmall · label · caption | 28/400 · 28/700 · 24/700 | 작은 글자 |
| pill | 22/600 | 「완료」 알약 — 아래 확인 필요 1번 |

**모서리** 카드·말풍선·타일·막대·모달 24 하나, 버튼·배지는 알약, 원형 버튼은 원, 헤더 앱 아이콘만 16.
**간격** 시안에 실제로 쓰인 6 · 8 · 10 · 12 · 14 · 16 · 20 · 24 · 28 · 32 · 36 · 40 · 44 · 48 · 56, 화면 좌우 여백 96, 헤더 높이 112, 누르는 영역 최소 76.
**그림자** raised(카드) · bar(상태 막대) · primaryButton(파란 그림자) · selectedTile · bubble · modal. 시안 CSS box-shadow 를 겹 단위로 옮겼다.

## 공통 컴포넌트

| 컴포저블 | 시안 이름 | 하는 일 |
| --- | --- | --- |
| `CartryButton` | btn | 알약 버튼. Primary(파랑) · Secondary(카드색), 높이 92, 아이콘 선택 |
| `CartryCard` | 카드 바탕 | 카드색 + 광택 + 그림자 + 모서리 24. selected 면 한 단계 밝게 |
| `CartryStatusBar` | sbar | 차 부위 하나의 상태 한 줄. Idle · Waiting · Target(파랑) · Success(초록) · Error(빨강) |
| `CartryStepProgress` | prog | 「1/4 단계 이름」 + 150×14 칸 막대 |
| `CartryPageDots` | dots | 온보딩 쪽 넘김 점 |
| `CartryTalk` | talk | 카트리 말풍선. 넓은 것(제목 60) · 좁은 것(compact, 제목 56) |
| `CartryBuddy` | buddy | 카트리 마스코트. Idle · Oops(!) · Think(?) · Cheer(✦), 비 오는 날 물방울 |
| `CartryStepTile` | ttile | 튜토리얼 단계 타일. selected 면 파란 그라데이션 |
| `CartryCategoryTile` | cat | 검색 카테고리 타일(완료 수 + 3D 아이콘) |
| `CartryListRow` | row | 3D 아이콘 + 제목 + 설명 + 꺾쇠 |
| `CartryModal` · `CartryDialog` | modal | 검정 55% 막 + 가운데 패널 · 아이콘→제목→설명→버튼 확인 창 |
| `CartryAppHeader` | apphead | 뒤로 · 앱 아이콘 · CARTRY · 화면 이름 · 더보기 |
| `CartrySwitch` | sw | 켜고 끄는 스위치. 보이는 막대 104×56, 누르는 영역 104×76 |
| `CartryBadge` · `CartryTag` | pill · xp · tag | 알약 배지(solid · soft) · 파란 글자 꼬리표 |
| `CartryText` | (h1 · lead) | 여러 줄 한국어 문장. 띄어쓰기 자리에서만 줄을 바꾸고, 말풍선 제목은 줄 길이를 고르게 맞춘다 |
| `CartryIcons.*` | i3-* · p-* | 3D 아이콘 44개(`I3…`), 선 아이콘 42개(`Line…`, tint 로 색을 입힌다), 앱 아이콘 1개 |

## 시안과 비교한 결과 (2026-11-10)

시안 HTML(6.40 작업 중 판)에서 컴포넌트 17개를 1:1 로 잘라 내고, 같은 문구로 Compose 렌더링한 것과 화소를 비교했다(PC 용 Compose 로 1dp = 1px 렌더링).

- 컴포넌트 17개: 컴포넌트 영역 평균 화소 차이 **0~4.5 / 255**, 40 넘게 다른 화소 **0~3.2%**. 남은 차이는 글자 안티에일리어싱(가장자리 부드럽게 처리)과 시안 뒤 배경 그림이다.
- 아이콘 87개: 원본 SVG(크롬 렌더)와 평균 화소 차이 **0.1 / 255**.

## 확인이 필요한 점

1. **「완료」 알약 글자가 22px** 이다(시안 값 그대로). 팀 규칙 「글자 24 이상」에 못 미친다. 시안을 24 로 고칠지 정해야 한다.
2. **스위치 꺼짐 색**은 시안에 없어서 진행 막대 빈 칸 색(#686A72)으로 정했다.
3. **안드로이드 실기 확인 전이다.** 이 코드는 PC 용 Compose(같은 API)로 컴파일하고 그려서 확인했다. 안드로이드 프로젝트 틀이 올라오면 빌드와 미리보기 창에서 한 번 더 확인한다.
4. 아이콘 안 글자(PRND, ECO/NORMAL/SPORT, 초보운전, N·R·60)는 Pretendard 글꼴 모양을 선으로 바꿔 넣었다. 기기 글꼴과 상관없이 같은 모양으로 나온다.
5. 시안이 6.40 으로 바뀌는 중이라 문구는 바뀔 수 있다. 컴포넌트는 문구를 인자로 받으므로 영향이 없다.

## 아이콘 다시 만들기

```bash
python designsystem/tools/svg_to_compose.py generate designsystem/icons-svg designsystem/src/main/kotlin/com/cartry/designsystem/icon
```

필요한 것: Python 3.10+, `pip install playwright fonttools` 후 `playwright install chromium`, Pretendard 글꼴 설치. 시안 HTML 에서 SVG 를 다시 떼어 낼 때는 `export <시안 html> designsystem/icons-svg` 를 먼저 실행한다.
