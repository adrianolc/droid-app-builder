pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()

        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "AppBuilder"

include(":model")
include(":initializer")
include(":data")
include(":domain")
include(":app")

include(":feature-branches:impl")
include(":feature-branches:api")
include(":network")
include(":remote:api")
include(":remote:impl")
