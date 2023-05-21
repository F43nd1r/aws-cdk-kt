package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun vCpuCountRequestProperty(initializer: CfnAutoScalingGroup.VCpuCountRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.VCpuCountRequestProperty =
    CfnAutoScalingGroup.VCpuCountRequestProperty.builder().apply(initializer).build()
