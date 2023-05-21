package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck

@Generated
public fun healthCheck(initializer: HealthCheck.Builder.() -> Unit = {}): HealthCheck =
    HealthCheck.builder().apply(initializer).build()
