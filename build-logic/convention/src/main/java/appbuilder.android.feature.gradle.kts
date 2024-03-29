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

kapt {
    correctErrorTypes = true
}

val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(project(":core-domain"))
    implementation(project(":core-remote"))

    implementation(libs.findLibrary("hilt-android").get())
    kapt(libs.findLibrary("hilt-compiler").get())

    implementation(libs.findLibrary("androidx.core").get())
    implementation(libs.findLibrary("androidx.appcompat").get())
    implementation(libs.findLibrary("androidx.layout").get())
    implementation(libs.findLibrary("androix.viewmodel").get())
    implementation(libs.findLibrary("androidx.lifecycle").get())
    implementation(libs.findLibrary("androidx.liveData").get())
    implementation(libs.findLibrary("androidx-activity").get())
    implementation(libs.findLibrary("androidx-fragment").get())
    implementation(libs.findLibrary("androidx-navigation-fragment").get())
    implementation(libs.findLibrary("androidx-navigation-ui").get())

    implementation(libs.findLibrary("google.material").get())

    testImplementation(libs.findLibrary("junit").get())
    androidTestImplementation(libs.findLibrary("androidx.test.ext").get())
    androidTestImplementation(libs.findLibrary("espresso").get())
}
