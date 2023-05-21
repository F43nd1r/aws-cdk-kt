package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun memoryGiBPerVCpuRequestProperty(initializer: CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty =
    CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.builder().apply(initializer).build()
