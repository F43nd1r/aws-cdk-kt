@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

public fun healthCheckProperty(initializer: CfnLoadBalancer.HealthCheckProperty.Builder.() -> Unit):
    CfnLoadBalancer.HealthCheckProperty =
    CfnLoadBalancer.HealthCheckProperty.builder().apply(initializer).build()
