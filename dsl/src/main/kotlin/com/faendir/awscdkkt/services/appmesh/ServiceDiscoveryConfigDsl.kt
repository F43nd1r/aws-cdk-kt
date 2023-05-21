package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig

@Generated
public fun serviceDiscoveryConfig(initializer: ServiceDiscoveryConfig.Builder.() -> Unit = {}):
    ServiceDiscoveryConfig = ServiceDiscoveryConfig.builder().apply(initializer).build()
