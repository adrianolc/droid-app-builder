import adrianolc.appbuilder.configureKotlinAndroid

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

val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(project(":domain"))
    implementation(project(":remote:api"))

    implementation(libs.findLibrary("koin.core").get())
    implementation(libs.findLibrary("koin.android").get())

    implementation(libs.findLibrary("androidx.core").get())
    implementation(libs.findLibrary("androidx.appcompat").get())
    implementation(libs.findLibrary("androidx.layout").get())
    implementation(libs.findLibrary("androix.viewmodel").get())
    implementation(libs.findLibrary("androidx.lifecycle").get())
    implementation(libs.findLibrary("androidx.liveData").get())

    implementation(libs.findLibrary("google.material").get())

    testImplementation(libs.findLibrary("junit").get())
    androidTestImplementation(libs.findLibrary("androidx.test.ext").get())
    androidTestImplementation(libs.findLibrary("espresso").get())
}