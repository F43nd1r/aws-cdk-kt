package com.faendir.awscdkkt.services.devopsguru

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

@Generated
public
    fun snsChannelConfigProperty(initializer: CfnNotificationChannel.SnsChannelConfigProperty.Builder.() -> Unit
    = {}): CfnNotificationChannel.SnsChannelConfigProperty =
    CfnNotificationChannel.SnsChannelConfigProperty.builder().apply(initializer).build()
