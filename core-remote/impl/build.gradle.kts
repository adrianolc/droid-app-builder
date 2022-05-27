plugins {
    id("appbuilder.android.library")
    id("dagger.hilt.android.plugin")
}

dependencies {
    implementation(project(":core-domain"))
    implementation(project(":core-remote:api"))

    implementation(libs.koin.core)

    implementation(libs.retrofit)
    implementation(libs.converter.moshi)

    implementation(libs.logging.interceptor)
}
