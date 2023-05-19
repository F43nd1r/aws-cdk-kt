@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.amazon.awscdk.services.cloudformation.CfnStackProps
import software.constructs.Construct

public fun Construct.cfnStack(
  id: String,
  props: CfnStackProps,
  initializer: CfnStack.() -> Unit = {},
): CfnStack = CfnStack(this, id, props).apply(initializer)
