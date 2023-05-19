rootProject.name = "aws-cdk-kt"

rootDir.listFiles()?.forEach {
    if (it.isDirectory && !it.name.equals("buildSrc", ignoreCase = true) && it.list()?.contains("build.gradle.kts") == true) {
        include(it.name)
    }
}

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

