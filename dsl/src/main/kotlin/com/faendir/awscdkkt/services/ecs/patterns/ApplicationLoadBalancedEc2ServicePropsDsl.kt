@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps

public
    fun applicationLoadBalancedEc2ServiceProps(initializer: ApplicationLoadBalancedEc2ServiceProps.Builder.() -> Unit):
    ApplicationLoadBalancedEc2ServiceProps =
    ApplicationLoadBalancedEc2ServiceProps.builder().apply(initializer).build()
