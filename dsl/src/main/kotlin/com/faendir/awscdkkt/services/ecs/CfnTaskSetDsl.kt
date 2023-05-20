@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
