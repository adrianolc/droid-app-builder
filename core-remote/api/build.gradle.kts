plugins {
    id("appbuilder.java.library")
}

dependencies {
    implementation(project(":core-domain"))
    implementation(project(":core-network"))

    implementation(libs.koin.core)

    implementation(libs.retrofit)
    implementation(libs.converter.moshi)

    implementation(libs.logging.interceptor)
}
