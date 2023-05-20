@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig

public fun serviceDiscoveryConfig(initializer: ServiceDiscoveryConfig.Builder.() -> Unit):
    ServiceDiscoveryConfig = ServiceDiscoveryConfig.builder().apply(initializer).build()
