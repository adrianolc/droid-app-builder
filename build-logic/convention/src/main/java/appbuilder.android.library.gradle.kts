import adrianolc.appbuilder.configureKotlinAndroid
import gradle.kotlin.dsl.accessors._52d5903b27a2445df1221261cf9ce911.android

plugins {
    id("com.android.library")
    kotlin("android")
}

android {

    configureKotlinAndroid(this)

    defaultConfig {
         targetSdk = 32
    }
}