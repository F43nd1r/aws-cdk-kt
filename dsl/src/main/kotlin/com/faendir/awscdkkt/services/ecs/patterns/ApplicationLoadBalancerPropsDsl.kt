@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps

public
    fun applicationLoadBalancerProps(initializer: ApplicationLoadBalancerProps.Builder.() -> Unit):
    ApplicationLoadBalancerProps = ApplicationLoadBalancerProps.builder().apply(initializer).build()
