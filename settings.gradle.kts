pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        extra["kotlin.version"] = "1.9.0"
        extra["agp.version"] = "7.4.0"
        extra["compose.version"] = " 1.5.0"

        val kotlinVersion = extra["kotlin.version"] as String
        val agpVersion = extra["agp.version"] as String
        val composeVersion = extra["compose.version"] as String

        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        kotlin("android").version(kotlinVersion)
        id ("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)
        id ("org.jetbrains.compose").version(
            composeVersion
        )
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "PROMOTA"
include(":androidApp")
include(":shared")
