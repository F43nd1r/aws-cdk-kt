plugins {
    alias(libs.plugins.kotlin)
}

version = "${libs.versions.cdk}-$version"

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    api(libs.cdk)
}