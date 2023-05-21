package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun mixedInstancesPolicyProperty(initializer: CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.MixedInstancesPolicyProperty =
    CfnAutoScalingGroup.MixedInstancesPolicyProperty.builder().apply(initializer).build()
