@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun topicRulePayloadProperty(initializer: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit):
    CfnTopicRule.TopicRulePayloadProperty =
    CfnTopicRule.TopicRulePayloadProperty.builder().apply(initializer).build()
