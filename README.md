# CARTRY frontend

CARTRY 는 현대자동차그룹 **Pleos Connect** 차량 화면에서 도는 학습 앱이다. 주차 중에만 열리고, 앱이 미션을 내면 운전자가 차의 실제 버튼·페달을 조작하고 차가 그 결과를 앱에 알려 준다.
이 저장소는 그 앱의 화면 쪽 코드다. **웹이 아니라 안드로이드 앱(Kotlin)** 이다.

## 용어

| 용어 | 뜻 |
| --- | --- |
| Android Studio | 안드로이드 앱을 만드는 공식 개발 프로그램 |
| SDK | 앱이 차 기능을 쓰게 해 주는 라이브러리 묶음. CARTRY 는 Pleos 의 **Vehicle SDK** 로 차 상태(페달·기어·버튼)를 읽는다 |
| minSdk | 앱이 설치될 수 있는 가장 낮은 안드로이드 버전 |
| Gradle | 안드로이드 프로젝트를 빌드(코드를 설치 파일로 만드는 일)하는 도구 |
| Pleos Connect Emulator | PC 에서 Pleos 차 화면을 흉내 내는 가상 기기. Android Studio 안에서 실행한다 |
| Virtual Console | 에뮬레이터에 붙여 기어·페달·공조 같은 차 상태를 바꿔 보는 웹 화면 |
| GitHub Actions / workflow | PR 이 올라오면 GitHub 서버에서 자동으로 실행되는 작업. 이 저장소에서는 Claude 코드 리뷰가 이걸로 실행된다 |
| secret | GitHub Actions 가 읽는 비밀값 저장 칸. 저장소 admin 만 넣을 수 있다 |

## 기술 틀 (Pleos 개발자 문서 원문 기준, 2026-11-10 확인)

| 항목 | 값 | 출처 |
| --- | --- | --- |
| 개발 도구 | Android Studio, 새 프로젝트 → Car/Automotive 카테고리 → Empty Activity | [Pleos Connect 앱 개발 시작하기](https://document.pleos.ai/docs/pleos-only/getting-started) |
| 언어 | Kotlin (Java 도 가능) | 같은 문서, [에뮬레이터 설치 및 실행](https://document.pleos.ai/docs/connect/guide/getting-started/application-development/setup-connect-sdk-emulator) |
| minSdk | Android API 28 이상 (차량 보안 요건) | 에뮬레이터 설치 및 실행 |
| Gradle | 8.0 이상 | 에뮬레이터 설치 및 실행 |
| 에뮬레이터 | Pleos Connect Emulator 2.1.0, Android API 34 system image, RAM 4GB, Cold boot | 에뮬레이터 설치 및 실행 |
| Vehicle SDK | `ai.pleos.playground:Vehicle:2.3.2`, 저장소 `https://nexus-playground.pleos.ai/repository/maven-releases/` | [Importing Vehicle SDK](https://document.pleos.ai/docs/pleos-only/connect-sdk-pleos/Vehicle/project-setup) |
| 공식 샘플 앱 기준 | JDK 17, Gradle wrapper 8.10.2, Android Gradle Plugin 8.8.2, Kotlin 2.0.0, compileSdk·targetSdk 35 | [Vehicle SDK Sample App](https://document.pleos.ai/docs/pleos-only/tutorial/vehicle-sdk-sample-app) |
| 화면 | 기본 화면 Connect-S-17 = 17인치 160dpi, 2560×1440dp (1dp = 1px). 앱 창은 가로 1700×1184dp, 세로 840×1184dp, 주차 중 전체 화면은 2560 폭 | Pleos 디자인 가이드 해상도 표 |

**에뮬레이터는 외장 그래픽 카드가 필수다.** 최소 NVIDIA RTX 3060 Laptop 6GB 또는 AMD RX 6600M 8GB, 권장 RTX 4060 Laptop 8GB 이상
([에뮬레이터 설정](https://document.pleos.ai/docs/connect/guide/getting-started/application-development/configure-pleos-connect-emulator)).
내장 그래픽만 있는 노트북에서는 렉이 심하다. 공통 컴포넌트·화면 작업은 Android Studio 의 미리보기 창으로 에뮬레이터 없이 확인할 수 있고, 차 연동 테스트만 사양이 되는 PC 에서 한다.

## 프로젝트 틀을 올리는 사람에게

이 저장소에는 이미 커밋이 있다(README·리뷰 설정). 빈 폴더에서 `git init` 후 push 하면 거절된다. 아래 순서로 한다.

1. `git clone https://github.com/hyundai-cartry/frontend.git`
2. Android Studio 에서 새 프로젝트를 만들 때 **저장 위치를 clone 한 `frontend` 폴더**로 지정한다.
3. 브랜치를 만들어 push 하고 PR 을 연다.

이미 다른 폴더에 프로젝트를 만들었다면 그 폴더에서 `git remote add origin https://github.com/hyundai-cartry/frontend.git` 후 `git pull origin main --allow-unrelated-histories` 로 이 커밋을 받아 합친 다음 push 한다.

## 브랜치와 PR

- 브랜치 이름: `feat/기능이름` (새 기능), `fix/기능이름` (고침)
- main 에 직접 push 하지 않고 PR 로 올린다.

## Claude 코드 리뷰

PR 을 열거나 새 커밋을 올리면 `.github/workflows/claude-code-review.yml` 이 실행되어 Claude 가 PR 에 리뷰 코멘트를 단다. 리뷰 기준은 [`CLAUDE.md`](CLAUDE.md) 에 있다.

- 이미 Claude 코멘트가 달린 PR, draft PR, 닫힌 PR 은 다시 리뷰하지 않는다.
- 동작하려면 저장소 admin 이 두 가지를 해 둬야 한다: Claude GitHub 앱 설치(https://github.com/apps/claude), 저장소 secret `CLAUDE_CODE_OAUTH_TOKEN` 등록(`claude setup-token` 으로 만든 값).
- 설정 출처: https://code.claude.com/docs/en/github-actions
