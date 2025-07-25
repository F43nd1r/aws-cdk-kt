package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl TargetTrackingScalingPolicy.() -> Unit = {},
): TargetTrackingScalingPolicy = TargetTrackingScalingPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTargetTrackingScalingPolicy(id: String, initializer: @AwsCdkDsl TargetTrackingScalingPolicy.Builder.() -> Unit = {}): TargetTrackingScalingPolicy = TargetTrackingScalingPolicy.Builder.create(this, id).apply(initializer).build()
