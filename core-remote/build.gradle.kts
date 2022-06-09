plugins {
    id("appbuilder.android.library")
    id("dagger.hilt.android.plugin")
}

dependencies {
    implementation(project(":core-network"))
    implementation(project(":core-domain"))

    implementation(libs.retrofit)
    implementation(libs.converter.moshi)

    implementation(libs.logging.interceptor)
}
