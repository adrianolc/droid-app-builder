import adrianolc.appbuilder.configureKotlinAndroid

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    configureKotlinAndroid(this)

    defaultConfig {
         targetSdk = 32
    }
}

val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(libs.findLibrary("hilt-android").get())
    kapt(libs.findLibrary("hilt-compiler").get())
}