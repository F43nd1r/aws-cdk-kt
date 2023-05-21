package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun cloudwatchAlarmActionProperty(initializer: CfnTopicRule.CloudwatchAlarmActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.CloudwatchAlarmActionProperty =
    CfnTopicRule.CloudwatchAlarmActionProperty.builder().apply(initializer).build()
