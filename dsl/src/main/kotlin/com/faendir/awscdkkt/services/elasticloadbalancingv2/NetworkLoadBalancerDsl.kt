@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps
import software.constructs.Construct

public fun Construct.networkLoadBalancer(
  id: String,
  props: NetworkLoadBalancerProps,
  initializer: NetworkLoadBalancer.() -> Unit = {},
): NetworkLoadBalancer = NetworkLoadBalancer(this, id, props).apply(initializer)
