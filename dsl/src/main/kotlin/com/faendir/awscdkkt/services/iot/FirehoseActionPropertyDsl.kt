package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun firehoseActionProperty(initializer: CfnTopicRule.FirehoseActionProperty.Builder.() -> Unit =
    {}): CfnTopicRule.FirehoseActionProperty =
    CfnTopicRule.FirehoseActionProperty.builder().apply(initializer).build()
