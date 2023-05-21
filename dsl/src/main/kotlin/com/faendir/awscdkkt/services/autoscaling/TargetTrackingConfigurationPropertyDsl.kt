package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun targetTrackingConfigurationProperty(initializer: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.TargetTrackingConfigurationProperty =
    CfnScalingPolicy.TargetTrackingConfigurationProperty.builder().apply(initializer).build()
