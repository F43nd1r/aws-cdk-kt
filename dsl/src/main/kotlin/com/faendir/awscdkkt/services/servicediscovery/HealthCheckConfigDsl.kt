@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig

public fun healthCheckConfig(initializer: HealthCheckConfig.Builder.() -> Unit): HealthCheckConfig =
    HealthCheckConfig.builder().apply(initializer).build()
