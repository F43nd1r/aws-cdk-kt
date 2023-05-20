@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck

public fun healthCheck(initializer: HealthCheck.Builder.() -> Unit): HealthCheck =
    HealthCheck.builder().apply(initializer).build()
