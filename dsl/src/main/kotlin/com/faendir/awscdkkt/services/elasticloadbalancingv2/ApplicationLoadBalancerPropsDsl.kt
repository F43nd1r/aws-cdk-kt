package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps

@Generated
public fun applicationLoadBalancerProps(initializer: ApplicationLoadBalancerProps.Builder.() -> Unit
    = {}): ApplicationLoadBalancerProps =
    ApplicationLoadBalancerProps.builder().apply(initializer).build()
