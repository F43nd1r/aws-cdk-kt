package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.NestedStackProps
import software.constructs.Construct

@Generated
public fun Construct.nestedStack(id: String, initializer: NestedStack.() -> Unit = {}): NestedStack
    = NestedStack(this, id).apply(initializer)

@Generated
public fun Construct.nestedStack(
  id: String,
  props: NestedStackProps,
  initializer: NestedStack.() -> Unit = {},
): NestedStack = NestedStack(this, id, props).apply(initializer)
