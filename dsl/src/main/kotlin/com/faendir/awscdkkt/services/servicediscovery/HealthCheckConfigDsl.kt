@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig

public fun healthCheckConfig(initializer: HealthCheckConfig.Builder.() -> Unit): HealthCheckConfig =
    HealthCheckConfig.builder().apply(initializer).build()
