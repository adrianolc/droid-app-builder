plugins {
    id("appbuilder.android.application")
}

android {
    compileSdk = 32
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "adrianolc.appbuilder"

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":initializer"))
    implementation(project(":domain"))

    implementation(project(":feature-branches:api"))
    implementation(project(":feature-branches:impl"))

    implementation(libs.koin.core)
    implementation(libs.koin.android)

    implementation(libs.androidx.core)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.layout)
    implementation(libs.androix.viewmodel)
    implementation(libs.androidx.lifecycle)
    implementation(libs.androidx.liveData)

    implementation(libs.google.material)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.espresso)

}
