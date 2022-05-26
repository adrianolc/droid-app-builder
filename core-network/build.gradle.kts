plugins {
    id("appbuilder.java.library")
}

dependencies {
    implementation(libs.koin.core)

    api(libs.retrofit)
    api(libs.converter.moshi)

    implementation(libs.logging.interceptor)
}
