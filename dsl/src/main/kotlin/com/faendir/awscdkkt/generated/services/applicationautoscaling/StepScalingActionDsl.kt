package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps
import software.constructs.Construct

@Generated
public fun Construct.stepScalingAction(
  id: String,
  props: StepScalingActionProps,
  initializer: @AwsCdkDsl StepScalingAction.() -> Unit = {},
): StepScalingAction = StepScalingAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStepScalingAction(id: String, initializer: @AwsCdkDsl
    StepScalingAction.Builder.() -> Unit = {}): StepScalingAction =
    StepScalingAction.Builder.create(this, id).apply(initializer).build()
