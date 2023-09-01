package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public fun buildNotificationConfigurationProperty(initializer: @AwsCdkDsl
    CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.() -> Unit = {}):
    CfnAutoScalingGroup.NotificationConfigurationProperty =
    CfnAutoScalingGroup.NotificationConfigurationProperty.Builder().apply(initializer).build()
