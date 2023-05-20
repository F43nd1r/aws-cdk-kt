@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps
import software.constructs.Construct

public fun Construct.stepScalingAction(
  id: String,
  props: StepScalingActionProps,
  initializer: StepScalingAction.() -> Unit = {},
): StepScalingAction = StepScalingAction(this, id, props).apply(initializer)
