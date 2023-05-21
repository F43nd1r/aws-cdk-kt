package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions

@Generated
public
    fun baseLoadBalancerLookupOptions(initializer: BaseLoadBalancerLookupOptions.Builder.() -> Unit
    = {}): BaseLoadBalancerLookupOptions =
    BaseLoadBalancerLookupOptions.builder().apply(initializer).build()
