package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun topicRulePayloadProperty(initializer: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit
    = {}): CfnTopicRule.TopicRulePayloadProperty =
    CfnTopicRule.TopicRulePayloadProperty.builder().apply(initializer).build()
