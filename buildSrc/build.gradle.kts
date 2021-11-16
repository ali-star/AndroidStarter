repositories {
    google()
    mavenCentral()
}

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

object PluginsVersions {
    const val gradle = "7.0.3"
    const val kotlin = "1.5.31"
    const val detekt = "1.17.1"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginsVersions.gradle}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.kotlin}")

    implementation("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${PluginsVersions.detekt}")
}
