package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck

@Generated
public fun healthCheck(initializer: HealthCheck.Builder.() -> Unit = {}): HealthCheck =
    HealthCheck.builder().apply(initializer).build()
