plugins {
    id("appbuilder.android.library")
}

dependencies {
    implementation(project(":core-domain"))
    api(project(":core-network"))

    implementation(libs.retrofit)
    implementation(libs.converter.moshi)

    implementation(libs.logging.interceptor)
}
