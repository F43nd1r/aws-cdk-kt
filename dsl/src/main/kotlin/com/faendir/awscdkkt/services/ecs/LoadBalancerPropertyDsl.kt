@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

public fun loadBalancerProperty(initializer: CfnTaskSet.LoadBalancerProperty.Builder.() -> Unit):
    CfnTaskSet.LoadBalancerProperty =
    CfnTaskSet.LoadBalancerProperty.builder().apply(initializer).build()
