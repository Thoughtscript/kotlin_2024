# kotlin_2024

[![](https://img.shields.io/badge/Kotlin-1.9.22-purple.svg)](https://kotlinlang.org/) [![](https://img.shields.io/badge/ktor-2.3.11-purple.svg)](https://ktor.io/docs/welcome.html)
[![](https://img.shields.io/badge/gradle-8.7-blue.svg)](https://docs.gradle.org/current/userguide/userguide.html)

Experiments with `Kotlin` and `Ktor` using `Docker` and `Gradle`.

## Setup and Installation

```bash
docker-compose up
```

## TODO 

- [ ] Practice Kotlin basics
- [ ] Implement API endpoints in `Ktor`
- [ ] Review some `Gradle` basics
  - [ ] Add **Version Variables**
- [x] Add newest `Gradle` with `Kotlin` and dependencies
  - [x] Update Desktop `Gradle` version to `8.7` to correctly initialize the `ktor` image
  - [x] Correctly initialize the `ktor` image with `8.7`
- [x] Dockerize everything with correct commands
  - [x] Ensure `Kotlin` installed correctly
  - [x] Verify compilation and build only requires plugins not `kotlinc`
  - [x] Determine if `kotlinc` is required at all (and if it's even present)
- [x] Review `Gradle` build topics specific to `Kotlin`

## Resources and Links 

1. https://kotlinlang.org/
1. https://github.com/ktorio/ktor-documentation/tree/2.3.11/codeSnippets/snippets/tutorial-http-api