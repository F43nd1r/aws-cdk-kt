package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.constructs.Construct

@Generated
public fun stack(initializer: @AwsCdkDsl Stack.() -> Unit = {}): Stack = Stack().apply(initializer)

@Generated
public fun Construct.stack(initializer: @AwsCdkDsl Stack.() -> Unit = {}): Stack =
    Stack(this).apply(initializer)

@Generated
public fun Construct.stack(id: String, initializer: @AwsCdkDsl Stack.() -> Unit = {}): Stack =
    Stack(this, id).apply(initializer)

@Generated
public fun Construct.stack(
  id: String,
  props: StackProps,
  initializer: @AwsCdkDsl Stack.() -> Unit = {},
): Stack = Stack(this, id, props).apply(initializer)

@Generated
public fun buildStack(initializer: @AwsCdkDsl Stack.Builder.() -> Unit = {}): Stack =
    Stack.Builder.create().apply(initializer).build()

@Generated
public fun Construct.buildStack(initializer: @AwsCdkDsl Stack.Builder.() -> Unit = {}): Stack =
    Stack.Builder.create(this).apply(initializer).build()

@Generated
public fun Construct.buildStack(id: String, initializer: @AwsCdkDsl Stack.Builder.() -> Unit = {}):
    Stack = Stack.Builder.create(this, id).apply(initializer).build()
