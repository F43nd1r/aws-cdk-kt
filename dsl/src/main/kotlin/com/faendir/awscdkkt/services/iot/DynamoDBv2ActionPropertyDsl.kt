@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun dynamoDBv2ActionProperty(initializer: CfnTopicRule.DynamoDBv2ActionProperty.Builder.() -> Unit):
    CfnTopicRule.DynamoDBv2ActionProperty =
    CfnTopicRule.DynamoDBv2ActionProperty.builder().apply(initializer).build()
