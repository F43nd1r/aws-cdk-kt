package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps

@Generated
public
    fun networkLoadBalancedTaskImageProps(initializer: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit
    = {}): NetworkLoadBalancedTaskImageProps =
    NetworkLoadBalancedTaskImageProps.builder().apply(initializer).build()
