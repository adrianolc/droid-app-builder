// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(libs.android.gradle.plugin)
        classpath(libs.kotlin.gradle.plugin)
        classpath(libs.hilt.gradle.plugin)
        classpath("com.vanniktech:gradle-dependency-graph-generator-plugin:0.8.0")
    }
}

apply(plugin="com.vanniktech.dependency.graph.generator")
