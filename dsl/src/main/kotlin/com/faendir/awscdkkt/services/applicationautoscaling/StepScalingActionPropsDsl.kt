package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps

@Generated
public fun stepScalingActionProps(initializer: StepScalingActionProps.Builder.() -> Unit = {}):
    StepScalingActionProps = StepScalingActionProps.builder().apply(initializer).build()
