@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public fun sqsActionProperty(initializer: CfnTopicRule.SqsActionProperty.Builder.() -> Unit):
    CfnTopicRule.SqsActionProperty =
    CfnTopicRule.SqsActionProperty.builder().apply(initializer).build()
