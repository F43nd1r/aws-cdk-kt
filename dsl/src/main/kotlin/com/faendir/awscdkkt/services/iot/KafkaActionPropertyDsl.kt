@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public fun kafkaActionProperty(initializer: CfnTopicRule.KafkaActionProperty.Builder.() -> Unit):
    CfnTopicRule.KafkaActionProperty =
    CfnTopicRule.KafkaActionProperty.builder().apply(initializer).build()
