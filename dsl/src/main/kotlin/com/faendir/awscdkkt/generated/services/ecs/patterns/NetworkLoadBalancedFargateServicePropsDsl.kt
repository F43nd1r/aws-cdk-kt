package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps

@Generated
public fun buildNetworkLoadBalancedFargateServiceProps(initializer: @AwsCdkDsl
    NetworkLoadBalancedFargateServiceProps.Builder.() -> Unit):
    NetworkLoadBalancedFargateServiceProps =
    NetworkLoadBalancedFargateServiceProps.Builder().apply(initializer).build()
