package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions

@Generated
public
    fun applicationLoadBalancerLookupOptions(initializer: ApplicationLoadBalancerLookupOptions.Builder.() -> Unit
    = {}): ApplicationLoadBalancerLookupOptions =
    ApplicationLoadBalancerLookupOptions.builder().apply(initializer).build()
