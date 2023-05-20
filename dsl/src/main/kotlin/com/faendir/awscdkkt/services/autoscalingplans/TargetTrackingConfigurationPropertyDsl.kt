@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

public
    fun targetTrackingConfigurationProperty(initializer: CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.() -> Unit):
    CfnScalingPlan.TargetTrackingConfigurationProperty =
    CfnScalingPlan.TargetTrackingConfigurationProperty.builder().apply(initializer).build()
