package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions

@Generated
public fun loadBalancerTargetOptions(initializer: LoadBalancerTargetOptions.Builder.() -> Unit =
    {}): LoadBalancerTargetOptions = LoadBalancerTargetOptions.builder().apply(initializer).build()
