# 팀 작업 안내

CARTRY 팀원이 이 저장소에서 함께 작업할 때 지키는 순서와 규칙입니다. 앱 소개는 [README](README.md) 에 있습니다.

## 용어

| 용어 | 뜻 |
| --- | --- |
| Android Studio | 안드로이드 앱을 만드는 공식 개발 프로그램 |
| SDK | 앱이 차 기능을 쓰게 해 주는 라이브러리 묶음. CARTRY 는 Pleos 의 Vehicle SDK 로 차 상태(페달·기어·버튼)를 읽습니다 |
| minSdk | 앱이 설치될 수 있는 가장 낮은 안드로이드 버전 |
| Gradle | 안드로이드 프로젝트를 빌드(코드를 설치 파일로 만드는 일)하는 도구 |
| Pleos Connect Emulator | PC 에서 Pleos 차 화면을 흉내 내는 가상 기기. Android Studio 안에서 실행합니다 |
| Virtual Console | 에뮬레이터에 붙여 기어·페달·공조 같은 차 상태를 바꿔 보는 웹 화면 |
| GitHub Actions / workflow | PR 이 올라오면 GitHub 서버에서 자동으로 실행되는 작업. 이 저장소에서는 Claude 코드 리뷰가 이걸로 실행됩니다 |
| secret | GitHub Actions 가 읽는 비밀값 저장 칸. 저장소 admin 만 넣을 수 있습니다 |
| PR 양식 (PR template) | PR 을 열 때 본문 칸에 자동으로 채워지는 틀. `.github/pull_request_template.md` 파일입니다 |
| 머지 커밋 | PR 을 main 에 합칠 때 「Merge pull request #번호」 커밋을 하나 더 만들고, 브랜치의 커밋은 그대로 남기는 방식 |

## 개발 환경 (Pleos 개발자 문서 원문 기준, 2026-11-10 확인)

| 항목 | 값 | 출처 |
| --- | --- | --- |
| 개발 도구 | Android Studio, 새 프로젝트 → Car/Automotive 카테고리 → Empty Activity | [Pleos Connect 앱 개발 시작하기](https://document.pleos.ai/docs/pleos-only/getting-started) |
| 언어 | Kotlin | 같은 문서 |
| minSdk | Android API 28 이상 (차량 보안 요건) | [에뮬레이터 설치 및 실행](https://document.pleos.ai/docs/connect/guide/getting-started/application-development/setup-connect-sdk-emulator) |
| Gradle | 8.0 이상 | 같은 문서 |
| 에뮬레이터 | Pleos Connect Emulator 2.1.0, Android API 34 system image, RAM 4GB, Cold boot | 같은 문서 |
| Vehicle SDK | `ai.pleos.playground:Vehicle:2.3.2`, 저장소 `https://nexus-playground.pleos.ai/repository/maven-releases/` | [Importing Vehicle SDK](https://document.pleos.ai/docs/pleos-only/connect-sdk-pleos/Vehicle/project-setup) |
| 공식 샘플 앱 기준 | JDK 17, Gradle wrapper 8.10.2, Android Gradle Plugin 8.8.2, Kotlin 2.0.0, compileSdk·targetSdk 35 | [Vehicle SDK Sample App](https://document.pleos.ai/docs/pleos-only/tutorial/vehicle-sdk-sample-app) |
| 화면 | 기본 화면 Connect-S-17 = 17인치 160dpi, 2560×1440dp (1dp = 1px). 주차 중 전체 화면은 2560 폭 | Pleos 디자인 가이드 해상도 표 |

**에뮬레이터는 외장 그래픽 카드가 필수입니다.** 최소 NVIDIA RTX 3060 Laptop 6GB 또는 AMD RX 6600M 8GB, 권장 RTX 4060 Laptop 8GB 이상
([에뮬레이터 설정](https://document.pleos.ai/docs/connect/guide/getting-started/application-development/configure-pleos-connect-emulator)).
내장 그래픽만 있는 노트북에서는 렉이 심합니다. 공통 컴포넌트·화면 작업은 Android Studio 미리보기 창으로 에뮬레이터 없이 확인하고, 차 연동 테스트만 사양이 되는 PC 에서 합니다.

## 프로젝트 틀(Android Studio 프로젝트)을 올리는 순서

이 저장소에는 이미 커밋이 있어서, 빈 폴더에서 `git init` 후 push 하면 거절됩니다.

1. `git clone https://github.com/hyundai-cartry/frontend.git`
2. Android Studio 에서 새 프로젝트를 만들 때 **저장 위치를 clone 한 `frontend` 폴더**로 지정합니다.
3. 브랜치를 만들어 push 하고 PR 을 엽니다.

이미 다른 폴더에 프로젝트를 만들었다면 그 폴더에서 `git remote add origin https://github.com/hyundai-cartry/frontend.git` 후 `git pull origin main --allow-unrelated-histories` 로 이 커밋을 받아 합친 다음 push 합니다.

## 브랜치와 PR

main 에는 직접 push 할 수 없습니다(저장소 규칙 「main 보호」). 모든 변경은 브랜치를 만들어 PR 로 올립니다. 승인 인원은 0명이라 리뷰가 끝나면 바로 머지할 수 있습니다.

| 항목 | 규칙 | 예시 |
| --- | --- | --- |
| 브랜치 이름 | `종류/영어-이름` (소문자, 낱말 사이는 `-`) | `feat/mission-defog`, `fix/switch-touch-area` |
| PR 제목 | `[종류] 무엇을 했는지 한국어 한 줄` | `[feat] 미션 A 앞유리 김서림 화면` |
| PR 본문 | PR 을 열면 본문 칸에 PR 양식이 자동으로 채워집니다. 네 칸을 채웁니다 | |
| 커밋 메시지 | 무엇을 했는지 한국어 한 줄. 이유가 필요하면 한 줄 띄우고 적습니다 | `스위치 누르는 영역을 76dp 로 넓힘` |
| 머지 | 머지 커밋 방식(Create a merge commit). 머지한 브랜치는 지우지 않습니다 | |

종류는 네 가지입니다. 브랜치 이름과 PR 제목에 같은 종류를 씁니다.

| 종류 | 쓰는 때 |
| --- | --- |
| `feat` | 새 화면이나 기능을 만들 때 |
| `fix` | 잘못된 동작이나 모양을 고칠 때 |
| `docs` | README, CONTRIBUTING 같은 문서만 바꿀 때 |
| `chore` | 빌드 설정, 라이브러리 버전, GitHub Actions 처럼 앱 동작이 바뀌지 않는 작업 |

브랜치 이름을 영어로 쓰는 이유는 한글 브랜치 이름이 터미널과 일부 도구에서 깨져 보일 때가 있어서입니다.

## Claude 코드 리뷰

PR 을 열거나 새 커밋을 올리면 `.github/workflows/claude-code-review.yml` 이 실행되어 Claude 가 PR 에 리뷰 코멘트를 답니다. 문제가 있는 줄마다 코멘트를 달고, 없으면 요약 코멘트 하나를 답니다. 승인·수정 요청은 하지 않습니다. 리뷰 기준은 [`CLAUDE.md`](CLAUDE.md) 에 있습니다.

- 이미 Claude 코멘트가 달린 PR, draft PR, 닫힌 PR 은 다시 리뷰하지 않습니다.
- 동작하려면 저장소 admin 이 두 가지를 해 둬야 합니다: Claude GitHub 앱 설치(https://github.com/apps/claude), 저장소 secret `CLAUDE_CODE_OAUTH_TOKEN` 등록(`claude setup-token` 으로 만든 값).
- 설정 출처: https://code.claude.com/docs/en/github-actions
