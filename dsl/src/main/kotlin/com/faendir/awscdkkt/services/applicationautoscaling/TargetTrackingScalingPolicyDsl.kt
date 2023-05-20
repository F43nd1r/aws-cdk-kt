@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps
import software.constructs.Construct

public fun Construct.targetTrackingScalingPolicy(
  id: String,
  props: TargetTrackingScalingPolicyProps,
  initializer: TargetTrackingScalingPolicy.() -> Unit = {},
): TargetTrackingScalingPolicy = TargetTrackingScalingPolicy(this, id, props).apply(initializer)
