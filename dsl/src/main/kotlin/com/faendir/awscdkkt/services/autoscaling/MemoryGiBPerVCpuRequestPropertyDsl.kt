@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

public
    fun memoryGiBPerVCpuRequestProperty(initializer: CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit):
    CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty =
    CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.builder().apply(initializer).build()
