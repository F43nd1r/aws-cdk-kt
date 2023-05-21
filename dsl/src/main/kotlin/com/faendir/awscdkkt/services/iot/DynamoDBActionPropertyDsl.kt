package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun dynamoDBActionProperty(initializer: CfnTopicRule.DynamoDBActionProperty.Builder.() -> Unit =
    {}): CfnTopicRule.DynamoDBActionProperty =
    CfnTopicRule.DynamoDBActionProperty.builder().apply(initializer).build()
