package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HealthCheckBindOptions

@Generated
public fun healthCheckBindOptions(initializer: HealthCheckBindOptions.Builder.() -> Unit = {}):
    HealthCheckBindOptions = HealthCheckBindOptions.builder().apply(initializer).build()
