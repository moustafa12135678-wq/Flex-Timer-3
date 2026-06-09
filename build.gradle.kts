plugins {
    id("com.android.application") version "7.4.2" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.

dependencyResolutionManagement {
    repositoriesMode.set(org.gradle.api.initialization.dependencymanagement.RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.buildFileName = "build.gradle.kts"
