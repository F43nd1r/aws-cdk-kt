@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions

public
    fun networkLoadBalancedTaskImageOptions(initializer: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit):
    NetworkLoadBalancedTaskImageOptions =
    NetworkLoadBalancedTaskImageOptions.builder().apply(initializer).build()
