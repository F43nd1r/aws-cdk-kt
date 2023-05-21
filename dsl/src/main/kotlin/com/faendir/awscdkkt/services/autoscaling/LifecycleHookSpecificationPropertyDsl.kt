package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun lifecycleHookSpecificationProperty(initializer: CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.LifecycleHookSpecificationProperty =
    CfnAutoScalingGroup.LifecycleHookSpecificationProperty.builder().apply(initializer).build()
