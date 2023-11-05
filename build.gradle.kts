plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.4.0").apply(false)
    id("com.android.library").version("7.4.0").apply(false)
    kotlin("android").version("1.8.21").apply(false)
    kotlin("multiplatform").version("1.8.21").apply(false)
    id("org.jetbrains.compose").version("1.5.0").apply(false)
}

allprojects {
    apply(plugin = "kotlinx-atomicfu")
}
buildscript {
    repositories {
        gradlePluginPortal()
    }

    dependencies {
        classpath("dev.icerock.moko:resources-generator:0.23.0")
        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.17.3")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
