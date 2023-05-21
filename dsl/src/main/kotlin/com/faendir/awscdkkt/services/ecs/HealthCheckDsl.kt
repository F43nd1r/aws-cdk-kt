package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.HealthCheck

@Generated
public fun healthCheck(initializer: HealthCheck.Builder.() -> Unit = {}): HealthCheck =
    HealthCheck.builder().apply(initializer).build()
