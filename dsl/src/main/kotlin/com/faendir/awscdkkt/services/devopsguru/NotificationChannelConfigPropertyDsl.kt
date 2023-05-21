package com.faendir.awscdkkt.services.devopsguru

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

@Generated
public
    fun notificationChannelConfigProperty(initializer: CfnNotificationChannel.NotificationChannelConfigProperty.Builder.() -> Unit
    = {}): CfnNotificationChannel.NotificationChannelConfigProperty =
    CfnNotificationChannel.NotificationChannelConfigProperty.builder().apply(initializer).build()
