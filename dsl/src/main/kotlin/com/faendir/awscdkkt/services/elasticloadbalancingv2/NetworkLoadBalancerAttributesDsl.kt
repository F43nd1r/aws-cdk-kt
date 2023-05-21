package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes

@Generated
public
    fun networkLoadBalancerAttributes(initializer: NetworkLoadBalancerAttributes.Builder.() -> Unit
    = {}): NetworkLoadBalancerAttributes =
    NetworkLoadBalancerAttributes.builder().apply(initializer).build()
