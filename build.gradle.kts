plugins {
    kotlin("multiplatform") version "2.0.21"
}

group = "io.github.mayachen350"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {}

kotlin {
    js(IR) {
        moduleName = "main"
        useEsModules()
        browser {
            binaries.executable()
        }
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

