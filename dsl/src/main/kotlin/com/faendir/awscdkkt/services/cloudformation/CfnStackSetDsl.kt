@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
