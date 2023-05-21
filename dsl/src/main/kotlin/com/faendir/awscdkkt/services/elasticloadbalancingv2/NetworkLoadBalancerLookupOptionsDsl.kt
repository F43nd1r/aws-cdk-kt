package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions

@Generated
public
    fun networkLoadBalancerLookupOptions(initializer: NetworkLoadBalancerLookupOptions.Builder.() -> Unit
    = {}): NetworkLoadBalancerLookupOptions =
    NetworkLoadBalancerLookupOptions.builder().apply(initializer).build()
