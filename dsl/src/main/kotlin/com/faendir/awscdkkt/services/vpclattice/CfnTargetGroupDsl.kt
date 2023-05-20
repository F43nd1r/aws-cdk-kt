@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps
import software.constructs.Construct

public fun Construct.cfnTargetGroup(
  id: String,
  props: CfnTargetGroupProps,
  initializer: CfnTargetGroup.() -> Unit = {},
): CfnTargetGroup = CfnTargetGroup(this, id, props).apply(initializer)
