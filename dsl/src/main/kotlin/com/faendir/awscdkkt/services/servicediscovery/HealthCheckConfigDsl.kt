package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig

@Generated
public fun healthCheckConfig(initializer: HealthCheckConfig.Builder.() -> Unit = {}):
    HealthCheckConfig = HealthCheckConfig.builder().apply(initializer).build()
