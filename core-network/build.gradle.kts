plugins {
    id("appbuilder.android.library")
    id("dagger.hilt.android.plugin")
}

dependencies {
    implementation(libs.koin.core)

    api(libs.retrofit)
    api(libs.converter.moshi)

    implementation(libs.logging.interceptor)
}
