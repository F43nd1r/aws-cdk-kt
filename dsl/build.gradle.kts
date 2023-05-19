plugins {
    alias(libs.plugins.kotlin)
}

version = "${libs.versions.cdk.get()}-$version"

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    api(libs.cdk)
}