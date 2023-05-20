@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HealthCheckConfig

public fun healthCheckConfig(initializer: HealthCheckConfig.Builder.() -> Unit): HealthCheckConfig =
    HealthCheckConfig.builder().apply(initializer).build()
