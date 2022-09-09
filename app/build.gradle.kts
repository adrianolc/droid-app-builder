plugins {
    id("appbuilder.android.application")
    id("dagger.hilt.android.plugin")
    alias(libs.plugins.module.graph.assertion)
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

hilt {
    enableAggregatingTask = true
}

dependencies {
    implementation(project(":feature-branches:impl"))

    implementation(libs.androidx.core)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.layout)
    implementation(libs.androix.viewmodel)
    implementation(libs.androidx.lifecycle)
    implementation(libs.androidx.liveData)

    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)

    implementation(libs.google.material)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.espresso)
}
