plugins {
    id("appbuilder.java.library")
}

dependencies {
    implementation(libs.kotlin.coroutines)

    implementation(libs.koin.core)
}
