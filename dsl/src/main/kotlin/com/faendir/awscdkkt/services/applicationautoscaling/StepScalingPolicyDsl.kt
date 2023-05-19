@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps
import software.constructs.Construct

public fun Construct.stepScalingPolicy(
  id: String,
  props: StepScalingPolicyProps,
  initializer: StepScalingPolicy.() -> Unit = {},
): StepScalingPolicy = StepScalingPolicy(this, id, props).apply(initializer)
