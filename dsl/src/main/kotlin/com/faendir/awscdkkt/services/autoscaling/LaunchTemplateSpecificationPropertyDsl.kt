@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

public
    fun launchTemplateSpecificationProperty(initializer: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
    CfnAutoScalingGroup.LaunchTemplateSpecificationProperty =
    CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.builder().apply(initializer).build()
