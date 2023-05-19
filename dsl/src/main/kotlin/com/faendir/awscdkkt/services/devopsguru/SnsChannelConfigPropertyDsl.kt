@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.devopsguru

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

public
    fun snsChannelConfigProperty(initializer: CfnNotificationChannel.SnsChannelConfigProperty.Builder.() -> Unit):
    CfnNotificationChannel.SnsChannelConfigProperty =
    CfnNotificationChannel.SnsChannelConfigProperty.builder().apply(initializer).build()
