@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

public
    fun targetTrackingConfigurationProperty(initializer: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit):
    CfnScalingPolicy.TargetTrackingConfigurationProperty =
    CfnScalingPolicy.TargetTrackingConfigurationProperty.builder().apply(initializer).build()
