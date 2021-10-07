import kr.entree.spigradle.kotlin.spigot
import kr.entree.spigradle.kotlin.spigotmc

plugins {
    kotlin("jvm") version "1.5.10"
    id("kr.entree.spigradle") version "2.2.4"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "cloud.acog"
version = "1.0-SNAPSHOT"

tasks.compileJava.get().options.encoding = "UTF-8"

repositories {
    mavenCentral()
    spigotmc()
}

dependencies {
    compileOnly(spigot("1.17.1"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

spigot {
    debug {
        buildVersion = "1.17.1"
    }

    description = "Minecraft Plugin Support API"
}