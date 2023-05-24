package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.networkLoadBalancedFargateService(id: String):
    NetworkLoadBalancedFargateService = NetworkLoadBalancedFargateService(this, id)

@Generated
public fun Construct.networkLoadBalancedFargateService(id: String, initializer: @AwsCdkDsl
    NetworkLoadBalancedFargateService.() -> Unit): NetworkLoadBalancedFargateService =
    NetworkLoadBalancedFargateService(this, id).apply(initializer)

@Generated
public fun Construct.networkLoadBalancedFargateService(id: String,
    props: NetworkLoadBalancedFargateServiceProps): NetworkLoadBalancedFargateService =
    NetworkLoadBalancedFargateService(this, id, props)

@Generated
public fun Construct.networkLoadBalancedFargateService(
  id: String,
  props: NetworkLoadBalancedFargateServiceProps,
  initializer: @AwsCdkDsl NetworkLoadBalancedFargateService.() -> Unit,
): NetworkLoadBalancedFargateService = NetworkLoadBalancedFargateService(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildNetworkLoadBalancedFargateService(id: String, initializer: @AwsCdkDsl
    NetworkLoadBalancedFargateService.Builder.() -> Unit): NetworkLoadBalancedFargateService =
    NetworkLoadBalancedFargateService.Builder.create(this, id).apply(initializer).build()
