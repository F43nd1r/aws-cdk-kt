package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public fun buildStepAdjustmentProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.StepAdjustmentProperty.Builder.() -> Unit):
    CfnScalingPolicy.StepAdjustmentProperty =
    CfnScalingPolicy.StepAdjustmentProperty.Builder().apply(initializer).build()
