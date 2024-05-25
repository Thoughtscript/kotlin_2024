plugins {
    application
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.serialization") version "1.9.22"
}

application {
    mainClass.set("io.thoughtscript.example.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    // These are all needed for Channels, GlobalScope.launch ...
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
}