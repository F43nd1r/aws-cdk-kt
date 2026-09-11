plugins {
    alias(libs.plugins.kotlin)
    application
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation(projects.dsl)
}


application {
    mainClass.set("ExampleLambdaKt")
}