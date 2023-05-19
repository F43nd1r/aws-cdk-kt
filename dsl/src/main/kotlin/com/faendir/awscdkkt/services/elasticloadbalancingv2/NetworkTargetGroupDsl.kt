@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
import software.constructs.Construct

public fun Construct.networkTargetGroup(
  id: String,
  props: NetworkTargetGroupProps,
  initializer: NetworkTargetGroup.() -> Unit = {},
): NetworkTargetGroup = NetworkTargetGroup(this, id, props).apply(initializer)
