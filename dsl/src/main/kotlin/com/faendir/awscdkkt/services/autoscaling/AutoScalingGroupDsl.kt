@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
