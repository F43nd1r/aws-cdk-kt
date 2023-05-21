package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.constructs.Construct

@Generated
public fun stack(initializer: Stack.() -> Unit = {}): Stack = Stack().apply(initializer)

@Generated
public fun Construct.stack(initializer: Stack.() -> Unit = {}): Stack =
    Stack(this).apply(initializer)

@Generated
public fun Construct.stack(id: String, initializer: Stack.() -> Unit = {}): Stack = Stack(this,
    id).apply(initializer)

@Generated
public fun Construct.stack(
  id: String,
  props: StackProps,
  initializer: Stack.() -> Unit = {},
): Stack = Stack(this, id, props).apply(initializer)
