import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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
    implementation(libs.kotlinPoet)
    implementation(libs.kotlinBard)
    implementation(libs.cdk)
    implementation(libs.classgraph)
    implementation(libs.paranamer)
    implementation(kotlin("reflect"))
}

application {
    mainClass.set("com.faendir.awscdkkt.generator.MainKt")
}

tasks {
    run.configure {
        val dir = project(project.projects.dsl.path).layout.projectDirectory.dir("src/main/kotlin")
        println(dir)
        args(dir, libs.versions.cdk.get())
        doFirst {
            file("$dir/com/faendir/awscdkkt/generated").deleteRecursively()
        }
    }
    withType<KotlinCompile> {
        compilerOptions {
            javaParameters = true
        }
    }
}