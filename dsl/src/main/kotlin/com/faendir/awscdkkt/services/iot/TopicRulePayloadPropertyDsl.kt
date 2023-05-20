@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun topicRulePayloadProperty(initializer: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit):
    CfnTopicRule.TopicRulePayloadProperty =
    CfnTopicRule.TopicRulePayloadProperty.builder().apply(initializer).build()
