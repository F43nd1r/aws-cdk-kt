@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps
import software.constructs.Construct

public fun Construct.networkLoadBalancedFargateService(id: String,
    initializer: NetworkLoadBalancedFargateService.() -> Unit = {}):
    NetworkLoadBalancedFargateService = NetworkLoadBalancedFargateService(this,
    id).apply(initializer)

public fun Construct.networkLoadBalancedFargateService(
  id: String,
  props: NetworkLoadBalancedFargateServiceProps,
  initializer: NetworkLoadBalancedFargateService.() -> Unit = {},
): NetworkLoadBalancedFargateService = NetworkLoadBalancedFargateService(this, id,
    props).apply(initializer)
