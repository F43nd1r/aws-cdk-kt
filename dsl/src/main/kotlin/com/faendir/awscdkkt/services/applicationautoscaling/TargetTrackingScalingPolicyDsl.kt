package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.targetTrackingScalingPolicy(
  id: String,
  props: TargetTrackingScalingPolicyProps,
  initializer: TargetTrackingScalingPolicy.() -> Unit = {},
): TargetTrackingScalingPolicy = TargetTrackingScalingPolicy(this, id, props).apply(initializer)
