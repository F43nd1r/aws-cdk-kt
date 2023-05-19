@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

public
    fun stepAdjustmentProperty(initializer: CfnScalingPolicy.StepAdjustmentProperty.Builder.() -> Unit):
    CfnScalingPolicy.StepAdjustmentProperty =
    CfnScalingPolicy.StepAdjustmentProperty.builder().apply(initializer).build()
