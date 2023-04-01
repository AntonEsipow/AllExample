import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {

    // Core
    private val coreKtx = "androidx.core:core-ktx:${Versions.kotlin}"
    private val runTimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runTimeKtx}"

    // Compose
    private val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    private val composeUiPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    private val composeMaterial3 = "androidx.compose.material3:material3:${Versions.composeMaterial3}"
    private val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"

    // Compose debug
    private val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    private val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"

    // Unit tests
    private val junit = "junit:junit:${Versions.junit}"

    // Ui tests
    private val uiJunit = "junit:junit:${Versions.uiJunit}"
    private val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    private val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"

    val core = mutableListOf<String>().apply {
        add(coreKtx)
        add(runTimeKtx)
    }

    val composeLib = mutableListOf<String>().apply {
        add(composeUi)
        add(composeUiPreview)
        add(composeMaterial3)
        add(composeActivity)
    }

    val uiTests = mutableListOf<String>().apply {
        add(uiJunit)
        add(espresso)
        add(composeUiTest)
    }

    val unitTest = mutableListOf<String>().apply{
        add(junit)
    }

    val composeDebug = mutableListOf<String>().apply{
        add(composeUiTooling)
        add(composeUiTestManifest)
    }
}

//util functions for adding the different type dependencies from build.gradle file
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}

fun DependencyHandler.debugImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("debugImplementation", dependency)
    }
}