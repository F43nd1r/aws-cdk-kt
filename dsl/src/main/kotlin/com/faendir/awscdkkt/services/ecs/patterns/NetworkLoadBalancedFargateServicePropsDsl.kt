package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps

@Generated
public
    fun networkLoadBalancedFargateServiceProps(initializer: NetworkLoadBalancedFargateServiceProps.Builder.() -> Unit
    = {}): NetworkLoadBalancedFargateServiceProps =
    NetworkLoadBalancedFargateServiceProps.builder().apply(initializer).build()
