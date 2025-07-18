plugins {
    alias(libs.plugins.kotlin.multiplatform)
id("com.github.node-gradle.node") version "7.1.0"
}

kotlin {
    js {
        useEsModules()
        nodejs {
            binaries.executable()
        }
    }
    sourceSets {
        jsMain.dependencies {
            implementation(kotlin("stdlib-js"))
            implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.8.0")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
            implementation(npm("@discord/embedded-app-sdk", "1.9.0"))
            implementation(npm("dotenv", "16.4.7"))
implementation(npm("vite", "6.2.5"))
        }
    }
}

// WIP Vite tasks 
tasks {
    val viteDev by registering(NpmTask::class) {
        args.set(listOf("vite", "dev"))
        dependsOn("installDependencies") // Install dependencies before running Vite
    }

    val installDependencies by registering(NpmTask::class) {
        args.set(listOf("install"))
    }
}

// Inject the .env values in the code or smth because I'm extremely lost at this point I just want it to work
//tasks.named("build") {
//    doFirst {
//        val envClientId = System.getenv("VITE_DISCORD_CLIENT_ID") ?: "default-client-id"
//        val resourcesDir = project.layout.buildDirectory.dir("src/jsMain").get().asFile
//
//        resourcesDir.walk().forEach { file ->
//            if (file.isFile && file.extension == "kt") {
//                val content = file.readText()
//                val updatedContent = content.replace("\${VITE_DISCORD_CLIENT_ID}", envClientId)
//                file.writeText(updatedContent)
//            }
//        }
//    }
//}