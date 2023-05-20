@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.devopsguru

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

public
    fun snsChannelConfigProperty(initializer: CfnNotificationChannel.SnsChannelConfigProperty.Builder.() -> Unit):
    CfnNotificationChannel.SnsChannelConfigProperty =
    CfnNotificationChannel.SnsChannelConfigProperty.builder().apply(initializer).build()
