package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps

@Generated
public
    fun applicationLoadBalancedFargateServiceProps(initializer: ApplicationLoadBalancedFargateServiceProps.Builder.() -> Unit
    = {}): ApplicationLoadBalancedFargateServiceProps =
    ApplicationLoadBalancedFargateServiceProps.builder().apply(initializer).build()
