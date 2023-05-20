@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck

public fun healthCheck(initializer: HealthCheck.Builder.() -> Unit): HealthCheck =
    HealthCheck.builder().apply(initializer).build()
