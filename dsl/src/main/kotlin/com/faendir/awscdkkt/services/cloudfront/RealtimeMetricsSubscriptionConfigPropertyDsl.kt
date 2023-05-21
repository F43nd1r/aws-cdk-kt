package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription

@Generated
public
    fun realtimeMetricsSubscriptionConfigProperty(initializer: CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty =
    CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.builder().apply(initializer).build()
