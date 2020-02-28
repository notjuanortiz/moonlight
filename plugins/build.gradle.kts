import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm")
    `java-library`
}

dependencies {
    api(rootProject)

    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.google.guava:guava:27.0.1-jre")
    implementation("org.apache.logging.log4j:log4j-core:2.11.1")
    implementation("org.apache.logging.log4j:log4j-api:2.11.1")

    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("script-runtime"))
    implementation(kotlin("reflect"))
    implementation(kotlin("scripting-common"))
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.jvmTarget = "1.8"
}