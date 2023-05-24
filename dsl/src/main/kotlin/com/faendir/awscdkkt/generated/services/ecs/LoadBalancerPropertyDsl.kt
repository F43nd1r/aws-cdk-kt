package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

@Generated
public fun buildLoadBalancerProperty(initializer: @AwsCdkDsl
    CfnTaskSet.LoadBalancerProperty.Builder.() -> Unit): CfnTaskSet.LoadBalancerProperty =
    CfnTaskSet.LoadBalancerProperty.Builder().apply(initializer).build()
