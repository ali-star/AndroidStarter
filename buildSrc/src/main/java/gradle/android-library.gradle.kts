package gradle

import Deps
import extensions.addDefaultConfig

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    addDefaultConfig()

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
            consumerProguardFiles("proguard-rules.pro")
        }
    }

    sourceSets {
        getByName("test") {
            java.srcDir("src/sharedTest/java")
        }
        getByName("androidTest") {
            java.srcDir("src/sharedTest/java")
        }
    }
}

dependencies {
    implementation(Deps.logging)
}
