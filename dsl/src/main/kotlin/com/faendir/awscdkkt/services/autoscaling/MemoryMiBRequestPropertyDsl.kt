package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun memoryMiBRequestProperty(initializer: CfnAutoScalingGroup.MemoryMiBRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.MemoryMiBRequestProperty =
    CfnAutoScalingGroup.MemoryMiBRequestProperty.builder().apply(initializer).build()
