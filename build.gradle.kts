plugins {
    kotlin("multiplatform") version "1.4.0"
}
group = "com.localazy.example.kotlin-mpp-wininet"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {

    mingwX64("windows") {
        binaries {
            executable {
                entryPoint = "com.localazy.example.main"
            }
        }
    }

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }

        }

        all {
            languageSettings.useExperimentalAnnotation("kotlin.ExperimentalStdlibApi")
            languageSettings.useExperimentalAnnotation("kotlin.ExperimentalUnsignedTypes")
        }

    }

}