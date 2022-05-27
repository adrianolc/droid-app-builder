plugins {
    id("appbuilder.android.application")
    id("dagger.hilt.android.plugin")
}

android {
    defaultConfig {
        applicationId = "adrianolc.appbuilder"

        versionCode = 1
        versionName = "1.0"
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
}

dependencies {
    implementation(project(":initializer"))
    implementation(project(":core-domain"))

    implementation(project(":feature-branches:api"))

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
