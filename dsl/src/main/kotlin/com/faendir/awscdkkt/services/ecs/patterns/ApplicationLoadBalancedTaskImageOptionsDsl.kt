package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions

@Generated
public
    fun applicationLoadBalancedTaskImageOptions(initializer: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit
    = {}): ApplicationLoadBalancedTaskImageOptions =
    ApplicationLoadBalancedTaskImageOptions.builder().apply(initializer).build()
