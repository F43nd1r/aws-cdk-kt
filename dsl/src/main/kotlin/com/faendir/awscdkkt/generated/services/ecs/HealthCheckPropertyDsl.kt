package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildHealthCheckProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.HealthCheckProperty.Builder.() -> Unit = {}):
    CfnTaskDefinition.HealthCheckProperty =
    CfnTaskDefinition.HealthCheckProperty.Builder().apply(initializer).build()
