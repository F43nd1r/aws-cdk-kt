package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.networkLoadBalancedEc2Service(id: String,
    initializer: NetworkLoadBalancedEc2Service.() -> Unit = {}): NetworkLoadBalancedEc2Service =
    NetworkLoadBalancedEc2Service(this, id).apply(initializer)

@Generated
public fun Construct.networkLoadBalancedEc2Service(
  id: String,
  props: NetworkLoadBalancedEc2ServiceProps,
  initializer: NetworkLoadBalancedEc2Service.() -> Unit = {},
): NetworkLoadBalancedEc2Service = NetworkLoadBalancedEc2Service(this, id, props).apply(initializer)
