@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

public
    fun notificationConfigurationProperty(initializer: CfnScheduledQuery.NotificationConfigurationProperty.Builder.() -> Unit):
    CfnScheduledQuery.NotificationConfigurationProperty =
    CfnScheduledQuery.NotificationConfigurationProperty.builder().apply(initializer).build()
