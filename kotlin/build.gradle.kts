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

}