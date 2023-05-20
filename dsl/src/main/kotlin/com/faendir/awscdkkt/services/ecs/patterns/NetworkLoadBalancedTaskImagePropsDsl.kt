@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps

public
    fun networkLoadBalancedTaskImageProps(initializer: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit):
    NetworkLoadBalancedTaskImageProps =
    NetworkLoadBalancedTaskImageProps.builder().apply(initializer).build()
