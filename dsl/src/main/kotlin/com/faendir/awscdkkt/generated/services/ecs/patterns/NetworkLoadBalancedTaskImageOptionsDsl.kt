package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions

@Generated
public fun buildNetworkLoadBalancedTaskImageOptions(initializer: @AwsCdkDsl
    NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit = {}):
    NetworkLoadBalancedTaskImageOptions =
    NetworkLoadBalancedTaskImageOptions.Builder().apply(initializer).build()
