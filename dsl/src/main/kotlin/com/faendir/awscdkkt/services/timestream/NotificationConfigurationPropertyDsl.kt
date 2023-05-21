package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun notificationConfigurationProperty(initializer: CfnScheduledQuery.NotificationConfigurationProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.NotificationConfigurationProperty =
    CfnScheduledQuery.NotificationConfigurationProperty.builder().apply(initializer).build()
