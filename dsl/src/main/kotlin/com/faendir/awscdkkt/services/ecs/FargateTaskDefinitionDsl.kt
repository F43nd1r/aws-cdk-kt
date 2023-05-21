package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.fargateTaskDefinition(id: String, initializer: FargateTaskDefinition.() -> Unit
    = {}): FargateTaskDefinition = FargateTaskDefinition(this, id).apply(initializer)

@Generated
public fun Construct.fargateTaskDefinition(
  id: String,
  props: FargateTaskDefinitionProps,
  initializer: FargateTaskDefinition.() -> Unit = {},
): FargateTaskDefinition = FargateTaskDefinition(this, id, props).apply(initializer)
