plugins {
    kotlin("js")
}

val projectGroupId: String by extra
val projectVersion: String by extra
val gradleWrapperVersion: String by extra
val kotlinXhtmlJsVersion: String by extra

group = projectGroupId
version = projectVersion

repositories {
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://dl.bintray.com/kotlin/kotlinx")
    maven("https://kotlin.bintray.com/kotlinx")
    maven("https://dl.bintray.com/jetbrains/kotlin-native-dependencies")
    google()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:$kotlinXhtmlJsVersion")
    testImplementation(kotlin("test-js"))
}

kotlin {
    target {
        browser {
            // // if you wanna run browser tests:
            // testTask {
            //     useKarma {
            //         usePhantomJS()
            //         useChromeHeadless()
            //         useChromeCanary()
            //         useChrome()
            //         useFirefox()
            //         useIe()
            //     }
            // }
        }
    }
    // // val reactVersion: String by extra
    // // if you wanna add for instance react library:
    // sourceSets["main"].dependencies {
    //     implementation(npm("react", reactVersion))
    // }
}

tasks {
    withType<Wrapper> {
        gradleVersion = gradleWrapperVersion
    }
}

defaultTasks("build")
