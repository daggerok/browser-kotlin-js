pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    val kotlinVersion: String by extra
    plugins {
        kotlin("js") version kotlinVersion
    }
}

val name: String by extra
rootProject.name = name
