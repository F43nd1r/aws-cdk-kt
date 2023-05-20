@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.NestedStackProps
import software.constructs.Construct

public fun Construct.nestedStack(id: String, initializer: NestedStack.() -> Unit = {}): NestedStack
    = NestedStack(this, id).apply(initializer)

public fun Construct.nestedStack(
  id: String,
  props: NestedStackProps,
  initializer: NestedStack.() -> Unit = {},
): NestedStack = NestedStack(this, id, props).apply(initializer)
