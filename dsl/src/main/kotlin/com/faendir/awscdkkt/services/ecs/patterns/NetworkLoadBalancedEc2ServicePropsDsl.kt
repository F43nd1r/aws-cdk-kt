package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps

@Generated
public
    fun networkLoadBalancedEc2ServiceProps(initializer: NetworkLoadBalancedEc2ServiceProps.Builder.() -> Unit
    = {}): NetworkLoadBalancedEc2ServiceProps =
    NetworkLoadBalancedEc2ServiceProps.builder().apply(initializer).build()
