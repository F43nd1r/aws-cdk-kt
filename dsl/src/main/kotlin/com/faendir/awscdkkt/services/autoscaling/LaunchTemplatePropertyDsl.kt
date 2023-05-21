package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun launchTemplateProperty(initializer: CfnAutoScalingGroup.LaunchTemplateProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.LaunchTemplateProperty =
    CfnAutoScalingGroup.LaunchTemplateProperty.builder().apply(initializer).build()
