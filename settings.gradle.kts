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
include(":core-domain")
include(":app")

include(":feature-branches:impl")
include(":feature-branches:api")
include(":core-network")
include(":core-remote")
