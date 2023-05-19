@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import software.amazon.awscdk.services.cloudformation.CfnStackSetProps
import software.constructs.Construct

public fun Construct.cfnStackSet(
  id: String,
  props: CfnStackSetProps,
  initializer: CfnStackSet.() -> Unit = {},
): CfnStackSet = CfnStackSet(this, id, props).apply(initializer)
