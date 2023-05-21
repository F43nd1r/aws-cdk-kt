package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun kafkaActionProperty(initializer: CfnTopicRule.KafkaActionProperty.Builder.() -> Unit =
    {}): CfnTopicRule.KafkaActionProperty =
    CfnTopicRule.KafkaActionProperty.builder().apply(initializer).build()
