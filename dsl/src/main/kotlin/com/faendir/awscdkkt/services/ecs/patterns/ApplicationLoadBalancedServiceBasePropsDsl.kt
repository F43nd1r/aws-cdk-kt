package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps

@Generated
public
    fun applicationLoadBalancedServiceBaseProps(initializer: ApplicationLoadBalancedServiceBaseProps.Builder.() -> Unit
    = {}): ApplicationLoadBalancedServiceBaseProps =
    ApplicationLoadBalancedServiceBaseProps.builder().apply(initializer).build()
