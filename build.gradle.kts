buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
        maven("https://dl.bintray.com/icerockdev/plugins")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
        classpath("dev.icerock.moko:resources-generator:0.11.1")
        classpath("com.android.tools.build:gradle:3.5.2")
    }
}
group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

allprojects {
    repositories {
        maven("https://dl.bintray.com/icerockdev/moko")
    }
}
