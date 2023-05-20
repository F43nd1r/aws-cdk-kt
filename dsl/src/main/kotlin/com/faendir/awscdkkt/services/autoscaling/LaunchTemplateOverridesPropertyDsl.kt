@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

public
    fun launchTemplateOverridesProperty(initializer: CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder.() -> Unit):
    CfnAutoScalingGroup.LaunchTemplateOverridesProperty =
    CfnAutoScalingGroup.LaunchTemplateOverridesProperty.builder().apply(initializer).build()
