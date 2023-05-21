package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceBaseProps

@Generated
public
    fun networkLoadBalancedServiceBaseProps(initializer: NetworkLoadBalancedServiceBaseProps.Builder.() -> Unit
    = {}): NetworkLoadBalancedServiceBaseProps =
    NetworkLoadBalancedServiceBaseProps.builder().apply(initializer).build()
