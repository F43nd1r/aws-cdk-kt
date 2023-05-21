package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun cloudwatchMetricActionProperty(initializer: CfnTopicRule.CloudwatchMetricActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.CloudwatchMetricActionProperty =
    CfnTopicRule.CloudwatchMetricActionProperty.builder().apply(initializer).build()
