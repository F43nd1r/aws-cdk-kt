@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

public
    fun notificationConfigurationProperty(initializer: CfnScheduledQuery.NotificationConfigurationProperty.Builder.() -> Unit):
    CfnScheduledQuery.NotificationConfigurationProperty =
    CfnScheduledQuery.NotificationConfigurationProperty.builder().apply(initializer).build()
