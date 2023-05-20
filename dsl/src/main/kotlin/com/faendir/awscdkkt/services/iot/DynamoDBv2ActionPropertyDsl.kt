@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun dynamoDBv2ActionProperty(initializer: CfnTopicRule.DynamoDBv2ActionProperty.Builder.() -> Unit):
    CfnTopicRule.DynamoDBv2ActionProperty =
    CfnTopicRule.DynamoDBv2ActionProperty.builder().apply(initializer).build()
