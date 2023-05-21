package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun notificationConfigurationProperty(initializer: CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.NotificationConfigurationProperty =
    CfnAutoScalingGroup.NotificationConfigurationProperty.builder().apply(initializer).build()
