package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.StepScalingAction
import software.amazon.awscdk.services.autoscaling.StepScalingActionProps
import software.constructs.Construct

@Generated
public fun Construct.stepScalingAction(
  id: String,
  props: StepScalingActionProps,
  initializer: StepScalingAction.() -> Unit = {},
): StepScalingAction = StepScalingAction(this, id, props).apply(initializer)
