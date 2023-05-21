package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps

@Generated
public fun networkLoadBalancerProps(initializer: NetworkLoadBalancerProps.Builder.() -> Unit = {}):
    NetworkLoadBalancerProps = NetworkLoadBalancerProps.builder().apply(initializer).build()
