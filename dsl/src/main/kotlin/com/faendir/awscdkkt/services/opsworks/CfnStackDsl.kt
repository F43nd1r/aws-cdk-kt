@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnStack
import software.amazon.awscdk.services.opsworks.CfnStackProps
import software.constructs.Construct

public fun Construct.cfnStack(
  id: String,
  props: CfnStackProps,
  initializer: CfnStack.() -> Unit = {},
): CfnStack = CfnStack(this, id, props).apply(initializer)
