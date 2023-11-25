plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("maven-publish")
    id("signing")
}
group = "com.example.notifypro"
version = "1.1.7"
publishing {
    repositories {
        maven {
            name = "NotifyProPackages"
            url = uri("https://maven.pkg.github.com/ashrafdawoud/PROMOTA")
            credentials {
                username = "ashrafdawoud"
                password = "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"
            }
        }
    }
}
@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
        publishLibraryVariantsGroupedByFlavor = true
        publishLibraryVariants("release", "debug")
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        framework {
            baseName = "notification-liberary"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.example.notification_liberary"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}