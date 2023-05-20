@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public fun lambdaActionProperty(initializer: CfnTopicRule.LambdaActionProperty.Builder.() -> Unit):
    CfnTopicRule.LambdaActionProperty =
    CfnTopicRule.LambdaActionProperty.builder().apply(initializer).build()
