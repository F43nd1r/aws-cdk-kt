@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

public
    fun targetTrackingConfigurationProperty(initializer: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit):
    CfnScalingPolicy.TargetTrackingConfigurationProperty =
    CfnScalingPolicy.TargetTrackingConfigurationProperty.builder().apply(initializer).build()
