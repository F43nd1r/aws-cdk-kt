package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun stepAdjustmentProperty(initializer: CfnScalingPolicy.StepAdjustmentProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.StepAdjustmentProperty =
    CfnScalingPolicy.StepAdjustmentProperty.builder().apply(initializer).build()
