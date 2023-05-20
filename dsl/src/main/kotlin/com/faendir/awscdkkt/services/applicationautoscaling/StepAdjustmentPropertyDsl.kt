@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

public
    fun stepAdjustmentProperty(initializer: CfnScalingPolicy.StepAdjustmentProperty.Builder.() -> Unit):
    CfnScalingPolicy.StepAdjustmentProperty =
    CfnScalingPolicy.StepAdjustmentProperty.builder().apply(initializer).build()
