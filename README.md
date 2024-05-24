# kotlin_2024

[![](https://img.shields.io/badge/Kotlin-1.9.22-purple.svg)](https://kotlinlang.org/) [![](https://img.shields.io/badge/ktor-2.3.11-purple.svg)](https://ktor.io/docs/welcome.html)
[![](https://img.shields.io/badge/gradle-8.7-blue.svg)](https://docs.gradle.org/current/userguide/userguide.html)

Experiments with `Kotlin` and `Ktor` using `Docker` and `Gradle`.

## Setup and Installation

```bash
docker-compose up
```

## TODO 

- [x] Practice Kotlin basics
- [x] Implement API endpoints in `Ktor`
- [x] Review some `Gradle` basics
  - [x] Verify adding **Version Variables** in KTS
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
2. https://github.com/ktorio/ktor-documentation/tree/2.3.11/codeSnippets/snippets/tutorial-http-api
3. https://stackoverflow.com/questions/37231560/best-way-to-null-check-in-kotlin
4. https://www.baeldung.com/kotlin/void-type#:~:text=Nothing%20is%20a%20special%20type,the%20default%20return%20type%20Unit.
5. https://dev.to/nfrankel/the-pitfall-of-implicit-returns-41ln
6. https://www.geeksforgeeks.org/returns-jumps-and-labels-in-kotlin/
7. https://dev.to/vtsen/understand-kotlin-function-literal-with-receiver-by-example-1d13
8. https://kotlinlang.org/docs/lambdas.html