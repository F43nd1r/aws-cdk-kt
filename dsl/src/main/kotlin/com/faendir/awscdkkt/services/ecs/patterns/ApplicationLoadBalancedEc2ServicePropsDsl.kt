@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps

public
    fun applicationLoadBalancedEc2ServiceProps(initializer: ApplicationLoadBalancedEc2ServiceProps.Builder.() -> Unit):
    ApplicationLoadBalancedEc2ServiceProps =
    ApplicationLoadBalancedEc2ServiceProps.builder().apply(initializer).build()
