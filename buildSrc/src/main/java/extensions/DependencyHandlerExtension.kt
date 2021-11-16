package extensions

import Deps
import org.gradle.api.Action
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.accessors.runtime.addDependencyTo
import org.gradle.kotlin.dsl.exclude

/**
 * Adds the Compose dependencies on Gradle.
 */
fun DependencyHandler.addComposeDependencies() {
    implementation(Deps.compose.ui)
    implementation(Deps.compose.material)
    implementation(Deps.compose.tooling)
    implementation(Deps.compose.icons)

    androidTestImplementation(Deps.compose.uiTest) {
        exclude(group = "androidx.core", module = "core-ktx")
        exclude(group = "androidx.fragment", module = "fragment")
        exclude(group = "androidx.customview", module = "customview")
        exclude(group = "androidx.activity", module = "activity")
        exclude(group = "androidx.lifecycle", module = "lifecycle-runtime")
    }
    androidTestImplementation(Deps.compose.junit4) {
        exclude(group = "androidx.core", module = "core-ktx")
        exclude(group = "androidx.fragment", module = "fragment")
        exclude(group = "androidx.customview", module = "customview")
        exclude(group = "androidx.activity", module = "activity")
        exclude(group = "androidx.lifecycle", module = "lifecycle-runtime")
    }

    androidTestImplementation(Deps.compose.manifest)
}

/**
 * Adds the Test dependencies on Gradle.
 */
fun DependencyHandler.addTestDependencies() {
    testImplementation(Deps.test.junit)
    testImplementation(Deps.test.mockk)
    testImplementation(Deps.test.robolectric)
    testImplementation(Deps.test.junitExt)
    testImplementation(Deps.test.runner)
    testImplementation(Deps.test.core)
    testImplementation(Deps.test.espresso)
    testImplementation(Deps.test.composeJunit4)

    androidTestImplementation(Deps.test.junit)
    androidTestImplementation(Deps.test.runner)
    androidTestImplementation(Deps.test.core)
    androidTestImplementation(Deps.test.espresso)
    androidTestImplementation(Deps.test.mockk)
    androidTestImplementation(Deps.test.robolectricAnnotations)
    androidTestImplementation(Deps.test.composeJunit4)

    debugImplementation(Deps.test.composeJunit4)
}

private fun DependencyHandler.implementation(dependencyNotation: String): Dependency? =
    add("implementation", dependencyNotation)

private fun DependencyHandler.debugImplementation(dependencyNotation: String): Dependency? =
    add("debugImplementation", dependencyNotation)

private fun DependencyHandler.testImplementation(dependencyNotation: Any): Dependency? =
    add("testImplementation", dependencyNotation)

private fun DependencyHandler.androidTestImplementation(dependencyNotation: Any): Dependency? =
    add("androidTestImplementation", dependencyNotation)

private fun DependencyHandler.androidTestImplementation(
    dependencyNotation: String,
    dependencyConfiguration: Action<ExternalModuleDependency>
): ExternalModuleDependency = addDependencyTo(
    this, "androidTestImplementation", dependencyNotation, dependencyConfiguration
)