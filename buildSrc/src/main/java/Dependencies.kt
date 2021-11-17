object Releases {
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    const val compileSdk = 31
    const val targetSdk = 31
    const val minSdk = 21

    const val material = "1.3.0"
    const val ktx = "1.0.2"
    const val room = "2.3.0"

    const val coroutines = "1.4.0"

    const val hilt = "2.38.1"

    const val logging = "2.0.6"

    const val testJunit = "4.12"
    const val testRunner = "1.1.1"
    const val testCore = "1.4.0"
    const val testMockk = "1.12.0"
    const val testUiAutomator = "2.2.0"
    const val testJunitExt = "1.1.0"
    const val testRoom = "2.1.0"
    const val espresso = "3.3.0"
    const val barista = "4.0.0"
    const val robolectric = "4.5.1"

    const val compose = "1.0.5"
    const val composeNav = "2.4.0-beta02"
    const val composeVm = "2.4.0"
    const val composeActivity = "1.4.0"

    const val buildGradle = "7.1.0-alpha08"
}

object Deps {
    const val logging = "io.github.microutils:kotlin-logging-jvm:${Versions.logging}"
    val android = AndroidDeps
    val coroutines = CoroutinesDeps
    val compose = ComposeDeps
    val hilt = HiltDeps
    val test = TestDeps
}

object AndroidDeps {
    const val material = "com.google.android.material:material:${Versions.material}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    val room = RoomDeps
}

object CoroutinesDeps {
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
}

object HiltDeps {
    const val android = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
}

object RoomDeps {
    const val runtime = "androidx.room:room-runtime:${Versions.room}"
    const val compiler = "androidx.room:room-compiler:${Versions.room}"
    const val ktx = "androidx.room:room-ktx:${Versions.room}"
}

object ComposeDeps {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val icons = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.composeNav}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeVm}"
    const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val uiTest = "androidx.compose.ui:ui-test:${Versions.compose}"
    const val junit4 = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val manifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"
}

object TestDeps {
    const val junit = "junit:junit:${Versions.testJunit}"
    const val runner = "androidx.test:runner:${Versions.testRunner}"
    const val core = "androidx.test:core:${Versions.testCore}"
    const val composeJunit4 = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"
    const val coreKtx = "androidx.test:core-ktx:${Versions.testCore}"
    const val uiAutomator = "androidx.test.uiautomator:uiautomator:${Versions.testUiAutomator}"
    const val junitExt = "androidx.test.ext:junit:${Versions.testJunitExt}"
    const val mockk = "io.mockk:mockk:${Versions.testMockk}"
    const val room = "androidx.room:room-testing:${Versions.testRoom}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val barista = "com.adevinta.android:barista:${Versions.barista}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val robolectricAnnotations = "org.robolectric:annotations:${Versions.robolectric}"
}