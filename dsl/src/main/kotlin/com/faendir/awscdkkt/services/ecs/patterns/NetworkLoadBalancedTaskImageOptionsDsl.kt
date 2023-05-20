@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions

public
    fun networkLoadBalancedTaskImageOptions(initializer: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit):
    NetworkLoadBalancedTaskImageOptions =
    NetworkLoadBalancedTaskImageOptions.builder().apply(initializer).build()
