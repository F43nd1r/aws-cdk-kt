@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps
import software.constructs.Construct

public fun Construct.cfnPrimaryTaskSet(
  id: String,
  props: CfnPrimaryTaskSetProps,
  initializer: CfnPrimaryTaskSet.() -> Unit = {},
): CfnPrimaryTaskSet = CfnPrimaryTaskSet(this, id, props).apply(initializer)
