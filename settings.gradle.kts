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

include(":app")

include(":core-domain")
include(":core-network")
include(":core-remote")

include(":feature-branches")

include(":model")
include(":initializer")
include(":data")
