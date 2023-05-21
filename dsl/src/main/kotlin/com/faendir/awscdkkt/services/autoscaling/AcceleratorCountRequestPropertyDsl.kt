package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun acceleratorCountRequestProperty(initializer: CfnAutoScalingGroup.AcceleratorCountRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.AcceleratorCountRequestProperty =
    CfnAutoScalingGroup.AcceleratorCountRequestProperty.builder().apply(initializer).build()
