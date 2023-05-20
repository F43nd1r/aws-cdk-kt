@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnStack
import software.amazon.awscdk.CfnStackProps
import software.constructs.Construct

public fun Construct.cfnStack(
  id: String,
  props: CfnStackProps,
  initializer: CfnStack.() -> Unit = {},
): CfnStack = CfnStack(this, id, props).apply(initializer)
