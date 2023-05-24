plugins {
    alias(libs.plugins.nexusPublish)
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.dokka)
}

tasks.register("build") {
    group = "build"
}

tasks.register("publish") {
    group = "publishing"
    subprojects {
        tasks.findByName("publish")?.let { dependsOn(it) }
    }
    dependsOn("closeAndReleaseSonatypeStagingRepository")
}

tasks.register<Delete>("clean") {
    group = "build"
    delete = setOf(buildDir)
}

nexusPublishing {
    this.repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
            username.set(project.findProperty("ossrhUser") as? String ?: System.getenv("OSSRH_USER"))
            password.set(project.findProperty("ossrhPassword") as? String ?: System.getenv("OSSRH_PASSWORD"))
        }
    }
}
