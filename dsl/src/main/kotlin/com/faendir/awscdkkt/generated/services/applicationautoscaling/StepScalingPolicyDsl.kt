package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.stepScalingPolicy(
  id: String,
  props: StepScalingPolicyProps,
  initializer: @AwsCdkDsl StepScalingPolicy.() -> Unit = {},
): StepScalingPolicy = StepScalingPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStepScalingPolicy(id: String, initializer: @AwsCdkDsl StepScalingPolicy.Builder.() -> Unit = {}): StepScalingPolicy = StepScalingPolicy.Builder.create(this, id).apply(initializer).build()
