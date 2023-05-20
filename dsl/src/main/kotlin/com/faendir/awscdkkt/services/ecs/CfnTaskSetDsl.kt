@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.CfnTaskSetProps
import software.constructs.Construct

public fun Construct.cfnTaskSet(
  id: String,
  props: CfnTaskSetProps,
  initializer: CfnTaskSet.() -> Unit = {},
): CfnTaskSet = CfnTaskSet(this, id, props).apply(initializer)
