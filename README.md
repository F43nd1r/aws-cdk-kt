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

# How it works

DSL functions are generated for each:
 - CDK construct (e.g. `App`)
```kotlin
public fun app(initializer: @AwsCdkDsl App.() -> Unit = {}): App = App().apply(initializer)

public fun app(props: AppProps, initializer: @AwsCdkDsl App.() -> Unit = {}): App = App(props).apply(initializer)
```
 - CDK construct builder (e.g. `App.Builder`)
```kotlin
public fun buildApp(initializer: @AwsCdkDsl App.Builder.() -> Unit = {}): App = App.Builder.create().apply(initializer).build()
```
 - CDK constructs with a scope get functions with a receiver to enable easy nesting (e.g. `Stack`, `Stack.Builder`)
```kotlin
public fun stack(initializer: @AwsCdkDsl Stack.() -> Unit = {}): Stack = Stack().apply(initializer)

public fun Construct.stack(initializer: @AwsCdkDsl Stack.() -> Unit = {}): Stack = Stack(this).apply(initializer)

public fun Construct.stack(id: String, initializer: @AwsCdkDsl Stack.() -> Unit = {}): Stack = Stack(this, id).apply(initializer)

public fun Construct.stack(id: String, props: StackProps, initializer: @AwsCdkDsl Stack.() -> Unit = {}): Stack = Stack(this, id, props).apply(initializer)

public fun buildStack(initializer: @AwsCdkDsl Stack.Builder.() -> Unit = {}): Stack = Stack.Builder.create().apply(initializer).build()

public fun Construct.buildStack(initializer: @AwsCdkDsl Stack.Builder.() -> Unit = {}): Stack = Stack.Builder.create(this).apply(initializer).build()

public fun Construct.buildStack(id: String, initializer: @AwsCdkDsl Stack.Builder.() -> Unit = {}): Stack = Stack.Builder.create(this, id).apply(initializer).build()
```

# Acknowledgements

Parts of this project were created during [off-project-time](https://en.wikipedia.org/wiki/20%25_Project) graciously provided by [codecentric](https://codecentric.de/). Thank you!