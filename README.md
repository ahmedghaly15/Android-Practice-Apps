<div align="center">

# 📱 Android Practice Apps

**A living collection of native Android apps built with Kotlin — one project at a time.**

Learning Android development the only way that sticks: **build, break, fix, repeat.**

<br />

[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.10-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Material%203-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Android](https://img.shields.io/badge/Android-API%2024%2B-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Gradle](https://img.shields.io/badge/Gradle-AGP%209.5.1-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org/)

[![Status](https://img.shields.io/badge/status-actively%20growing-success?style=flat-square)](.)
[![Learning in Public](https://img.shields.io/badge/learning-in%20public-blueviolet?style=flat-square)](.)
[![Made with](https://img.shields.io/badge/made%20with-Kotlin%20%E2%9D%A4-red?style=flat-square)](.)

</div>

---

## 🚀 About This Repository

This repo is my **personal Android laboratory**. It contains the apps, experiments, and mini-projects I build while learning native Android development with **Kotlin** and **Jetpack Compose**.

Every project here represents a concept I wanted to understand by actually shipping something — layouts, state, theming, navigation, architecture, and everything in between.

> **This is a living repository.** New projects are added as I progress. Some are polished, some are experiments, but every single one taught me something. Star it and watch it grow. ⭐

---

## 🎯 Why This Repo Exists

| Goal | What it means in practice |
| :--- | :--- |
| **Learn by building** | No tutorial copy-paste. Each app is written, broken, and rebuilt from scratch. |
| **Track progress** | A public timeline of skills — from "Hello World" to real app architecture. |
| **Build a reference library** | Reusable patterns, themed components, and Compose snippets I can return to. |
| **Stay accountable** | Public commits > private intentions. |

---

## 📂 Projects

> All projects live inside [`Android-Practice-Apps/`](./Android-Practice-Apps). Each one is a standalone Gradle project that can be opened directly in Android Studio.

### ⭐ Featured Project

<table>
<tr>
<td width="100%">

### 🎂 Birthday Card App
<sub>`Android-Practice-Apps/Birthday-Card-App`</sub>

A static, full-screen birthday greeting card built entirely with **Jetpack Compose**. Displays a custom illustration with an overlaid greeting and signature, rendered edge-to-edge over a dark background.

**What I learned**
- Declarative UI with `@Composable` functions
- Composing layouts with `Box` (layering) and `Column` (stacking)
- Modifiers: `fillMaxSize()`, `padding()`, `background()`, `align()`
- Loading images with `painterResource()` and scaling with `ContentScale.Crop`
- Typography with `sp`, `lineHeight`, and `TextAlign`
- Material 3 theming and previewing UI with `@Preview`
- Externalizing copy into `strings.xml` with `stringResource()`

**Stack**

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Compose](https://img.shields.io/badge/Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)
![Material 3](https://img.shields.io/badge/Material%203-757575?style=flat-square&logo=materialdesign&logoColor=white)

`minSdk 24` · `targetSdk 37` · `compileSdk 37`

</td>
</tr>
</table>

### 🗂️ Full Project Index

| # | Project | Description | Key Concepts | Status |
| :-: | :--- | :--- | :--- | :---: |
| 01 | [🎂 Birthday Card App](./Android-Practice-Apps/Birthday-Card-App) | Full-screen themed birthday greeting card | Compose basics, `Box`/`Column`, image painting, string resources, previews | ✅ Complete |
| 02 | _Coming soon_ | _Next experiment in the works_ | _Stay tuned_ | 🚧 In progress |

<sub>🟢 Complete · 🟡 In progress · 🔵 Planned</sub>

---

## 🛠️ Tech Stack

<div align="center">

| Layer | Tools |
| :--- | :--- |
| **Language** | Kotlin 2.2.10 |
| **UI Toolkit** | Jetpack Compose · Material 3 |
| **Build System** | Gradle · Android Gradle Plugin 9.5.1 · Version Catalogs (`libs.versions.toml`) |
| **Android SDK** | minSdk 24 · targetSdk 37 |
| **Testing** | JUnit · Espresso · Compose UI Test |
| **IDE** | Android Studio |

</div>

---

## 📁 Repository Structure

```text
Android-Apps/
├── README.md
└── Android-Practice-Apps/
    └── Birthday-Card-App/              # Standalone Gradle project
        ├── app/
        │   ├── src/
        │   │   ├── main/
        │   │   │   ├── java/com/example/birthday_card_app/
        │   │   │   │   ├── MainActivity.kt
        │   │   │   │   └── ui/theme/   # Color.kt · Theme.kt · Type.kt
        │   │   │   ├── res/            # drawables, strings, themes
        │   │   │   └── AndroidManifest.xml
        │   │   ├── test/               # Unit tests
        │   │   └── androidTest/        # Instrumented tests
        │   ├── build.gradle.kts
        │   └── proguard-rules.pro
        ├── gradle/libs.versions.toml   # Dependency version catalog
        ├── build.gradle.kts
        └── settings.gradle.kts
```

---

## ⚡ Getting Started

### Prerequisites

- **Android Studio** (latest stable) with the Android SDK installed
- **JDK 11+**
- An emulator or physical device running **Android 7.0 (API 24)** or newer

### Run a project

```bash
# 1. Clone the repository
git clone https://github.com/<your-username>/Android-Apps.git
cd Android-Apps

# 2. Enter any project folder
cd Android-Practice-Apps/Birthday-Card-App

# 3. Build from the command line...
./gradlew assembleDebug

# ...or simply open the folder in Android Studio and hit Run ▶
```

Build output lands in `app/build/outputs/apk/debug/app-debug.apk`.

---

## 🧭 Learning Roadmap

A snapshot of where I am and where I'm heading.

- [x] Kotlin fundamentals — variables, functions, classes, null safety
- [x] Jetpack Compose basics — composables, layouts, modifiers
- [x] Material 3 theming & typography
- [x] Resource management — strings, drawables, previews
- [ ] State & recomposition — `remember`, `mutableStateOf`, state hoisting
- [ ] Navigation — `Navigation Compose`, multi-screen flows
- [ ] Lists & lazy layouts — `LazyColumn`, `LazyRow`, `LazyGrid`
- [ ] Local persistence — `DataStore`, `Room`
- [ ] Networking — Retrofit / Ktor, coroutines & Flow
- [ ] Architecture — MVVM, Clean Architecture, dependency injection (Hilt)
- [ ] Testing — unit, UI, and screenshot tests

---

## 📈 Repository Activity

<div align="center">

![Last Commit](https://img.shields.io/github/last-commit/<your-username>/Android-Apps?style=flat-square&color=7F52FF)
![Repo Size](https://img.shields.io/github/repo-size/<your-username>/Android-Apps?style=flat-square&color=3DDC84)
![Projects](https://img.shields.io/badge/projects-1%20%26%20counting-4285F4?style=flat-square)

</div>

---

## 🤝 Contributing

This is primarily a personal learning repo, but feedback is always welcome! If you spot a better pattern, an anti-pattern worth fixing, or a concept I should explore next:

1. Open an **issue** with your suggestion
2. Or start a **discussion** — I'm here to learn

---

<div align="center">

### ⭐ If you're also learning Android, star this repo and grow with it.

**Built with curiosity, Kotlin, and a lot of `./gradlew build`.**

<sub>Last updated: November 2026 · Continuously evolving 🚀</sub>

</div>
