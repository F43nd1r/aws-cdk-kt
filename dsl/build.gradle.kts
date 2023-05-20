import de.undercouch.gradle.tasks.download.Download

plugins {
    alias(libs.plugins.kotlin)
    `maven-publish`
    signing
    alias(libs.plugins.dokka)
    alias(libs.plugins.download)
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

val javadocJar = tasks.register<Jar>("javadocJar") {
    group = "documentation"
    from(tasks["dokkaJavadoc"])
    archiveClassifier.set("javadoc")
}

val sourcesJar = tasks.register<Jar>("sourcesJar") {
    group = "documentation"
    from(project.extensions.getByType<SourceSetContainer>()["main"].allSource)
    archiveClassifier.set("sources")
}

val githubUser: String by lazy { project.findProperty("githubUser") as? String ?: System.getenv("GITHUB_USER") }
val githubPassword: String by lazy { project.findProperty("githubPackageKey") as? String ?: System.getenv("GITHUB_TOKEN") }
publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components.findByName("java"))

            artifact(sourcesJar)
            artifact(javadocJar)

            pom {
                name.set("aws-cdk-kt")
                description.set("Kotlin DSL for AWS CDK.")
                url.set("https://github.com/F43nd1r/aws-cdk-kt")
                scm {
                    connection.set("scm:git:https://github.com/F43nd1r/aws-cdk-kt.git")
                    developerConnection.set("scm:git:git@github.com:F43nd1r/aws-cdk-kt.git")
                    url.set("https://github.com/F43nd1r/aws-cdk-kt.git")
                }
                licenses {
                    license {
                        name.set("Apache-2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("f43nd1r")
                        name.set("Lukas Morawietz")
                    }
                }
            }
        }
    }
    repositories {
        mavenLocal()
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/F43nd1r/aws-cdk-kt")
            credentials {
                username = githubUser
                password = githubPassword
            }
        }
    }
}

signing {
    val signingKey = project.findProperty("signingKey") as? String ?: System.getenv("SIGNING_KEY")
    val signingPassword = project.findProperty("signingPassword") as? String ?: System.getenv("SIGNING_PASSWORD")
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications["maven"])
}

val downloadReleaseMetadata by tasks.registering(Download::class) {
    src("https://maven.pkg.github.com/F43nd1r/aws-cdk-kt/com/faendir/awscdkkt/dsl/maven-metadata.xml")
    username(githubUser)
    password(githubPassword)
    preemptiveAuth(true)
}

tasks.register("isNewRelease") {
    dependsOn(downloadReleaseMetadata)
    doLast {
        val metadata = downloadReleaseMetadata.get().outputFiles.single().readText()
        val isReleasedVersion = metadata.contains("<version>$version</version>")
        if (isReleasedVersion) {
            throw GradleException("Version $version is already released")
        }
    }
}