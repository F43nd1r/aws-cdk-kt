package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun healthCheckProperty(initializer: CfnVirtualNode.HealthCheckProperty.Builder.() -> Unit =
    {}): CfnVirtualNode.HealthCheckProperty =
    CfnVirtualNode.HealthCheckProperty.builder().apply(initializer).build()
