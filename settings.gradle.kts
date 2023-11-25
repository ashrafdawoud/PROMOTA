pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")

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
        id("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)
        id("org.jetbrains.compose").version(
            composeVersion
        )
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven {
            url = uri("https://maven.pkg.github.com/ashrafdawoud/PROMOTA")
            credentials {
                username = "ashrafdawoud"
                password = "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"
            }
        }
    }
}

rootProject.name = "PROMOTA"
include(":androidApp")
include(":shared")
include(":iosMain")
include(":notification-liberary")
