@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps
import software.constructs.Construct

public fun Construct.targetTrackingScalingPolicy(
  id: String,
  props: TargetTrackingScalingPolicyProps,
  initializer: TargetTrackingScalingPolicy.() -> Unit = {},
): TargetTrackingScalingPolicy = TargetTrackingScalingPolicy(this, id, props).apply(initializer)
