package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public fun healthCheckProperty(initializer: CfnLoadBalancer.HealthCheckProperty.Builder.() -> Unit =
    {}): CfnLoadBalancer.HealthCheckProperty =
    CfnLoadBalancer.HealthCheckProperty.builder().apply(initializer).build()
