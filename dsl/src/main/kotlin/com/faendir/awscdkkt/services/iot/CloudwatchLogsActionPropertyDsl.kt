package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun cloudwatchLogsActionProperty(initializer: CfnTopicRule.CloudwatchLogsActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.CloudwatchLogsActionProperty =
    CfnTopicRule.CloudwatchLogsActionProperty.builder().apply(initializer).build()
