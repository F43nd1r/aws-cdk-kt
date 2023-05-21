package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.StepScalingActionProps

@Generated
public fun stepScalingActionProps(initializer: StepScalingActionProps.Builder.() -> Unit = {}):
    StepScalingActionProps = StepScalingActionProps.builder().apply(initializer).build()
