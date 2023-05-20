@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
import software.constructs.Construct

public fun Construct.cfnLoadBalancer(
  id: String,
  props: CfnLoadBalancerProps,
  initializer: CfnLoadBalancer.() -> Unit = {},
): CfnLoadBalancer = CfnLoadBalancer(this, id, props).apply(initializer)

public fun Construct.cfnLoadBalancer(id: String, initializer: CfnLoadBalancer.() -> Unit = {}):
    CfnLoadBalancer = CfnLoadBalancer(this, id).apply(initializer)
