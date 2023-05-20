@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.constructs.Construct

public fun Construct.fargateTaskDefinition(id: String, initializer: FargateTaskDefinition.() -> Unit
    = {}): FargateTaskDefinition = FargateTaskDefinition(this, id).apply(initializer)

public fun Construct.fargateTaskDefinition(
  id: String,
  props: FargateTaskDefinitionProps,
  initializer: FargateTaskDefinition.() -> Unit = {},
): FargateTaskDefinition = FargateTaskDefinition(this, id, props).apply(initializer)
