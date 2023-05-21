package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun sqsActionProperty(initializer: CfnTopicRule.SqsActionProperty.Builder.() -> Unit = {}):
    CfnTopicRule.SqsActionProperty =
    CfnTopicRule.SqsActionProperty.builder().apply(initializer).build()
