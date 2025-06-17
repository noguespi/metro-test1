plugins {
    // Apply the shared build logic from a convention plugin.
    // The shared code is located in `buildSrc/src/main/kotlin/kotlin-jvm.gradle.kts`.
    id("buildsrc.convention.kotlin-jvm")
    id("dev.zacsweers.metro") version "0.4.0"
}

dependencies {
    implementation(project(":module1"))
    testImplementation(kotlin("test"))
}