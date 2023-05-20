@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps
import software.constructs.Construct

public fun Construct.loadBalancer(
  id: String,
  props: LoadBalancerProps,
  initializer: LoadBalancer.() -> Unit = {},
): LoadBalancer = LoadBalancer(this, id, props).apply(initializer)
