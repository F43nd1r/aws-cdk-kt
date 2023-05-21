package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAutoScalingGroup(
  id: String,
  props: CfnAutoScalingGroupProps,
  initializer: CfnAutoScalingGroup.() -> Unit = {},
): CfnAutoScalingGroup = CfnAutoScalingGroup(this, id, props).apply(initializer)
