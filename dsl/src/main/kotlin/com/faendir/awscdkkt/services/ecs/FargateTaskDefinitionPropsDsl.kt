package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps

@Generated
public fun fargateTaskDefinitionProps(initializer: FargateTaskDefinitionProps.Builder.() -> Unit =
    {}): FargateTaskDefinitionProps =
    FargateTaskDefinitionProps.builder().apply(initializer).build()
