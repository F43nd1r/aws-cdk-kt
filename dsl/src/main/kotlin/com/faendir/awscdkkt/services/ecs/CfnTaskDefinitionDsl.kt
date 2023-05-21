package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTaskDefinition(id: String, initializer: CfnTaskDefinition.() -> Unit = {}):
    CfnTaskDefinition = CfnTaskDefinition(this, id).apply(initializer)

@Generated
public fun Construct.cfnTaskDefinition(
  id: String,
  props: CfnTaskDefinitionProps,
  initializer: CfnTaskDefinition.() -> Unit = {},
): CfnTaskDefinition = CfnTaskDefinition(this, id, props).apply(initializer)
