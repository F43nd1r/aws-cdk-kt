package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions

@Generated
public fun buildLoadBalancerTargetOptions(initializer: @AwsCdkDsl
    LoadBalancerTargetOptions.Builder.() -> Unit): LoadBalancerTargetOptions =
    LoadBalancerTargetOptions.Builder().apply(initializer).build()
