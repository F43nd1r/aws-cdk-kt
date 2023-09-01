package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps
import software.constructs.Construct

@Generated
public fun Construct.networkLoadBalancer(
  id: String,
  props: NetworkLoadBalancerProps,
  initializer: @AwsCdkDsl NetworkLoadBalancer.() -> Unit = {},
): NetworkLoadBalancer = NetworkLoadBalancer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNetworkLoadBalancer(id: String, initializer: @AwsCdkDsl
    NetworkLoadBalancer.Builder.() -> Unit = {}): NetworkLoadBalancer =
    NetworkLoadBalancer.Builder.create(this, id).apply(initializer).build()
