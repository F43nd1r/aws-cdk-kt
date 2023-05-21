package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun iotEventsActionProperty(initializer: CfnTopicRule.IotEventsActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.IotEventsActionProperty =
    CfnTopicRule.IotEventsActionProperty.builder().apply(initializer).build()
