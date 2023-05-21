package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun healthCheckProperty(initializer: CfnTaskDefinition.HealthCheckProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.HealthCheckProperty =
    CfnTaskDefinition.HealthCheckProperty.builder().apply(initializer).build()
