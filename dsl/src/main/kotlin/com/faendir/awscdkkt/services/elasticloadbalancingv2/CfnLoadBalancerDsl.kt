@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
import software.constructs.Construct

public fun Construct.cfnLoadBalancer(id: String, initializer: CfnLoadBalancer.() -> Unit = {}):
    CfnLoadBalancer = CfnLoadBalancer(this, id).apply(initializer)

public fun Construct.cfnLoadBalancer(
  id: String,
  props: CfnLoadBalancerProps,
  initializer: CfnLoadBalancer.() -> Unit = {},
): CfnLoadBalancer = CfnLoadBalancer(this, id, props).apply(initializer)
