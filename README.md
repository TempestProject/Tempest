# KtDiscord

[![Kotlin](https://img.shields.io/badge/kotlin-1.8.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![License](https://img.shields.io/github/license/TempestProject/KtDiscord)](https://www.gnu.org/licenses/agpl-3.0.en.html)
[![Qodana](https://github.com/TempestProject/KtDiscord/actions/workflows/code_quality.yml/badge.svg)](https://github.com/TempestProject/KtDiscord/actions/workflows/code_quality.yml)

KtDiscord is a Kotlin Multiplatform and JavaScript/TypeScript library for working with Discord Interactions.

## Features

* All Discord Interactions objects are exposed as classes
* All Interactions endpoints are supported by KtDiscord and their usage is exposed as functions
* Helper functions are provided for creating Global/Guild Application Commands, as are classes that expose the
  Application Command objects

## Installation

KtDiscord is (currently) only available from GitHub Packages (for Kotlin) and npm (for JavaScript/TypeScript).

### Kotlin

Add the following to your `build.gradle.kts` file to install KtDiscord:

```kotlin
repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/TempestProject/KtDiscord")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}
    
dependencies {
    implementation("cloud.drakon:ktdiscord:5.0.0")
}
```

### JavaScript/TypeScript

### `package.json`

```json
"@tempestproject/ktdiscord": "5.0.0"
```

#### Command line

```commandline
npm install @tempestproject/ktdiscord
```

## Stability

KtDiscord will follow Semantic Versioning 2.0.0, meaning:

* A MAJOR version denotes incompatible API changes
* A MINOR version denotes adding functionality in a backwards compatible manner
* A PATCH version denotes backwards compatible bug fixes
