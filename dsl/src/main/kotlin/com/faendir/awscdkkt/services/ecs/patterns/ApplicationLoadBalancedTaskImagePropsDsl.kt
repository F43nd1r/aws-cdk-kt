package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps

@Generated
public
    fun applicationLoadBalancedTaskImageProps(initializer: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit
    = {}): ApplicationLoadBalancedTaskImageProps =
    ApplicationLoadBalancedTaskImageProps.builder().apply(initializer).build()
