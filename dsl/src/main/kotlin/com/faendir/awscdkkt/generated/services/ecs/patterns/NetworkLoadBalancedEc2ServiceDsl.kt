package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.networkLoadBalancedEc2Service(id: String, initializer: @AwsCdkDsl
    NetworkLoadBalancedEc2Service.() -> Unit = {}): NetworkLoadBalancedEc2Service =
    NetworkLoadBalancedEc2Service(this, id).apply(initializer)

@Generated
public fun Construct.networkLoadBalancedEc2Service(
  id: String,
  props: NetworkLoadBalancedEc2ServiceProps,
  initializer: @AwsCdkDsl NetworkLoadBalancedEc2Service.() -> Unit = {},
): NetworkLoadBalancedEc2Service = NetworkLoadBalancedEc2Service(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNetworkLoadBalancedEc2Service(id: String, initializer: @AwsCdkDsl
    NetworkLoadBalancedEc2Service.Builder.() -> Unit = {}): NetworkLoadBalancedEc2Service =
    NetworkLoadBalancedEc2Service.Builder.create(this, id).apply(initializer).build()
