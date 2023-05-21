package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun acceleratorTotalMemoryMiBRequestProperty(initializer: CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty =
    CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.builder().apply(initializer).build()
