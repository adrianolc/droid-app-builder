plugins {
    id("appbuilder.android.library")
}

dependencies {
    implementation(project(":core-domain"))
    implementation(project(":core-network"))

    implementation(libs.retrofit)
    implementation(libs.converter.moshi)

    implementation(libs.logging.interceptor)
}
