package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

@Generated
public fun loadBalancerProperty(initializer: CfnTaskSet.LoadBalancerProperty.Builder.() -> Unit =
    {}): CfnTaskSet.LoadBalancerProperty =
    CfnTaskSet.LoadBalancerProperty.builder().apply(initializer).build()
