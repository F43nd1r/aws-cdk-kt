[![Maven Central](https://img.shields.io/maven-central/v/com.faendir.awscdkkt/dsl?style=for-the-badge)](https://central.sonatype.com/artifact/com.faendir.awscdkkt/dsl)

# AWS CDK KT

A generated Kotlin DSL for [AWS CDK](https://aws.amazon.com/cdk/).

# Usage

## Gradle

```kotlin
dependencies {
    implementation("com.faendir.awscdkkt:dsl:<version>")
}
```

## Maven

```xml

<dependency>
    <groupId>com.faendir.awscdkkt</groupId>
    <artifactId>dsl</artifactId>
    <version>VERSION</version>
</dependency>
```

# Example

```kotlin
app {
    stack("LambdaStack") {
        buildFunction("HelloHandler") {
            code(Code.fromInline("function handler() { console.log('Hello, CDK'); }"))
            handler("index.handler")
            runtime(Runtime.NODEJS_16_X)
        }
    }
}.synth()
```

# Acknowledgements

Parts of this project were created during [off-project-time](https://en.wikipedia.org/wiki/20%25_Project) graciously provided by [codecentric](https://codecentric.de/). Thank you!