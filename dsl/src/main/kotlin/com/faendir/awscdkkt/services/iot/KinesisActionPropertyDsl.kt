package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun kinesisActionProperty(initializer: CfnTopicRule.KinesisActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.KinesisActionProperty =
    CfnTopicRule.KinesisActionProperty.builder().apply(initializer).build()
