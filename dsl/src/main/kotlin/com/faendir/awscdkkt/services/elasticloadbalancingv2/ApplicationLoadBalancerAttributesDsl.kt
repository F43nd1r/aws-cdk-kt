package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes

@Generated
public
    fun applicationLoadBalancerAttributes(initializer: ApplicationLoadBalancerAttributes.Builder.() -> Unit
    = {}): ApplicationLoadBalancerAttributes =
    ApplicationLoadBalancerAttributes.builder().apply(initializer).build()
