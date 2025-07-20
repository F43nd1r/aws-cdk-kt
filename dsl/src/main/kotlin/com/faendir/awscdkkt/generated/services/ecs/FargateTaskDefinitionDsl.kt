package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.fargateTaskDefinition(id: String, initializer: @AwsCdkDsl FargateTaskDefinition.() -> Unit = {}): FargateTaskDefinition = FargateTaskDefinition(this, id).apply(initializer)

@Generated
public fun Construct.fargateTaskDefinition(
  id: String,
  props: FargateTaskDefinitionProps,
  initializer: @AwsCdkDsl FargateTaskDefinition.() -> Unit = {},
): FargateTaskDefinition = FargateTaskDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFargateTaskDefinition(id: String, initializer: @AwsCdkDsl FargateTaskDefinition.Builder.() -> Unit = {}): FargateTaskDefinition = FargateTaskDefinition.Builder.create(this, id).apply(initializer).build()
