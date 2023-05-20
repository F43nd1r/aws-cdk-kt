@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun dynamoDBActionProperty(initializer: CfnTopicRule.DynamoDBActionProperty.Builder.() -> Unit):
    CfnTopicRule.DynamoDBActionProperty =
    CfnTopicRule.DynamoDBActionProperty.builder().apply(initializer).build()
