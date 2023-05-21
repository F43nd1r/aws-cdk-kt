package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription

@Generated
public
    fun monitoringSubscriptionProperty(initializer: CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder.() -> Unit
    = {}): CfnMonitoringSubscription.MonitoringSubscriptionProperty =
    CfnMonitoringSubscription.MonitoringSubscriptionProperty.builder().apply(initializer).build()
