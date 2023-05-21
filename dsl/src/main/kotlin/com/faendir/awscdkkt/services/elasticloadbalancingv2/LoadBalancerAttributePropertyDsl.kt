package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer

@Generated
public
    fun loadBalancerAttributeProperty(initializer: CfnLoadBalancer.LoadBalancerAttributeProperty.Builder.() -> Unit
    = {}): CfnLoadBalancer.LoadBalancerAttributeProperty =
    CfnLoadBalancer.LoadBalancerAttributeProperty.builder().apply(initializer).build()
