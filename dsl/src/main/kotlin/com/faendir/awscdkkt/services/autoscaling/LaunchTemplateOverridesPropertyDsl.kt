package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun launchTemplateOverridesProperty(initializer: CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.LaunchTemplateOverridesProperty =
    CfnAutoScalingGroup.LaunchTemplateOverridesProperty.builder().apply(initializer).build()
