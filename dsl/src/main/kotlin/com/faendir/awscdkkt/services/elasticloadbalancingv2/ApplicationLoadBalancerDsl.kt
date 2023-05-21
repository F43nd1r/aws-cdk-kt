package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.constructs.Construct

@Generated
public fun Construct.applicationLoadBalancer(
  id: String,
  props: ApplicationLoadBalancerProps,
  initializer: ApplicationLoadBalancer.() -> Unit = {},
): ApplicationLoadBalancer = ApplicationLoadBalancer(this, id, props).apply(initializer)
