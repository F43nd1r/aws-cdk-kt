@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.StepScalingAction
import software.amazon.awscdk.services.autoscaling.StepScalingActionProps
import software.constructs.Construct

public fun Construct.stepScalingAction(
  id: String,
  props: StepScalingActionProps,
  initializer: StepScalingAction.() -> Unit = {},
): StepScalingAction = StepScalingAction(this, id, props).apply(initializer)
