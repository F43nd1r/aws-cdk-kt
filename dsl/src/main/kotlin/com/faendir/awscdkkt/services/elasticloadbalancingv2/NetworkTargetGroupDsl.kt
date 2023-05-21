package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.networkTargetGroup(
  id: String,
  props: NetworkTargetGroupProps,
  initializer: NetworkTargetGroup.() -> Unit = {},
): NetworkTargetGroup = NetworkTargetGroup(this, id, props).apply(initializer)
