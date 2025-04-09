plugins {
    alias(libs.plugins.kotlin.jvm)
//    alias(libs.plugins.ktor)
//    alias(libs.plugins.kotlin.plugin.serialization)
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}