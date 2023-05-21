package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps

@Generated
public fun applicationLoadBalancerProps(initializer: ApplicationLoadBalancerProps.Builder.() -> Unit
    = {}): ApplicationLoadBalancerProps =
    ApplicationLoadBalancerProps.builder().apply(initializer).build()
