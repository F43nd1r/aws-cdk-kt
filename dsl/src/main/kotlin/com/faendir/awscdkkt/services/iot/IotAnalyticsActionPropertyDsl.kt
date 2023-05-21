package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun iotAnalyticsActionProperty(initializer: CfnTopicRule.IotAnalyticsActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.IotAnalyticsActionProperty =
    CfnTopicRule.IotAnalyticsActionProperty.builder().apply(initializer).build()
