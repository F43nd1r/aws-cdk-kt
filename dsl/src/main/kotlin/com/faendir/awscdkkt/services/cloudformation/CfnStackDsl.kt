package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.amazon.awscdk.services.cloudformation.CfnStackProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStack(
  id: String,
  props: CfnStackProps,
  initializer: CfnStack.() -> Unit = {},
): CfnStack = CfnStack(this, id, props).apply(initializer)
