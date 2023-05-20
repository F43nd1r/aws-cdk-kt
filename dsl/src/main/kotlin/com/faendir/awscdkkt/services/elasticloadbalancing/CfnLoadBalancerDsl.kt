@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps
import software.constructs.Construct

public fun Construct.cfnLoadBalancer(
  id: String,
  props: CfnLoadBalancerProps,
  initializer: CfnLoadBalancer.() -> Unit = {},
): CfnLoadBalancer = CfnLoadBalancer(this, id, props).apply(initializer)
