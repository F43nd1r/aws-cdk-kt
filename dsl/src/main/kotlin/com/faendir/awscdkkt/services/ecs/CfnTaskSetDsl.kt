package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.CfnTaskSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTaskSet(
  id: String,
  props: CfnTaskSetProps,
  initializer: CfnTaskSet.() -> Unit = {},
): CfnTaskSet = CfnTaskSet(this, id, props).apply(initializer)
