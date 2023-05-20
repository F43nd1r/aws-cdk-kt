@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
import software.constructs.Construct

public fun Construct.autoScalingGroup(
  id: String,
  props: AutoScalingGroupProps,
  initializer: AutoScalingGroup.() -> Unit = {},
): AutoScalingGroup = AutoScalingGroup(this, id, props).apply(initializer)
