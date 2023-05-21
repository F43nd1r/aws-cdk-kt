package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@Generated
public
    fun scalingInstructionProperty(initializer: CfnScalingPlan.ScalingInstructionProperty.Builder.() -> Unit
    = {}): CfnScalingPlan.ScalingInstructionProperty =
    CfnScalingPlan.ScalingInstructionProperty.builder().apply(initializer).build()
