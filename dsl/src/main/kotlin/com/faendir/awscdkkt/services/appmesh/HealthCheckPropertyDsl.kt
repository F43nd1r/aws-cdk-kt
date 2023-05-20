@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

public fun healthCheckProperty(initializer: CfnVirtualNode.HealthCheckProperty.Builder.() -> Unit):
    CfnVirtualNode.HealthCheckProperty =
    CfnVirtualNode.HealthCheckProperty.builder().apply(initializer).build()
