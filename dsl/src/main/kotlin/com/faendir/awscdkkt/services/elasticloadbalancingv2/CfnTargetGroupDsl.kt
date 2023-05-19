@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps
import software.constructs.Construct

public fun Construct.cfnTargetGroup(id: String, initializer: CfnTargetGroup.() -> Unit = {}):
    CfnTargetGroup = CfnTargetGroup(this, id).apply(initializer)

public fun Construct.cfnTargetGroup(
  id: String,
  props: CfnTargetGroupProps,
  initializer: CfnTargetGroup.() -> Unit = {},
): CfnTargetGroup = CfnTargetGroup(this, id, props).apply(initializer)
