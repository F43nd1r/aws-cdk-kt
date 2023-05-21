package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HealthCheckConfig

@Generated
public fun healthCheckConfig(initializer: HealthCheckConfig.Builder.() -> Unit = {}):
    HealthCheckConfig = HealthCheckConfig.builder().apply(initializer).build()
