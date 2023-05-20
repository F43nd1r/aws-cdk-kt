@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps

public
    fun applicationLoadBalancedFargateServiceProps(initializer: ApplicationLoadBalancedFargateServiceProps.Builder.() -> Unit):
    ApplicationLoadBalancedFargateServiceProps =
    ApplicationLoadBalancedFargateServiceProps.builder().apply(initializer).build()
