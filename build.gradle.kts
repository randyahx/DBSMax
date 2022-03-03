buildscript {

    // Compose version handled in buildSrc/java/Compose

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Replaced the original classpath
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }// Dependencies have to be declared here before they can be used in module build.gradle
}// Top-level build file where you can add configuration options common to all sub-projects/modules.

// Replaced the original task-clean
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

