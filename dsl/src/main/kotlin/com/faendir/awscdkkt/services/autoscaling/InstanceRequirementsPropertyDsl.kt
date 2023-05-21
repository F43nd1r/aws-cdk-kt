package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun instanceRequirementsProperty(initializer: CfnAutoScalingGroup.InstanceRequirementsProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.InstanceRequirementsProperty =
    CfnAutoScalingGroup.InstanceRequirementsProperty.builder().apply(initializer).build()
