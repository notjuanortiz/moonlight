plugins {
    java
    kotlin("jvm")
}

val junitVersion: String by project

dependencies {
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("org.apache.logging.log4j:log4j-core:2.14.0")
    implementation("org.apache.logging.log4j:log4j-api:2.14.0")
    implementation("org.slf4j:slf4j-nop:1.7.30")
    implementation("com.lmax:disruptor:3.4.2")
    implementation("io.netty:netty-all:4.1.56.Final")
    implementation("com.google.guava:guava:30.1-jre")
    implementation("com.moandjiezana.toml:toml4j:0.7.2")
    implementation("org.mindrot:jbcrypt:0.4-atlassian-1")
    implementation("io.github.classgraph:classgraph:4.8.59")
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("script-runtime"))
    implementation(kotlin("reflect"))
    implementation(kotlin("scripting-common"))
    implementation("com.zaxxer:HikariCP:3.4.5")
    testImplementation("org.mockito:mockito-core:2.24.5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}