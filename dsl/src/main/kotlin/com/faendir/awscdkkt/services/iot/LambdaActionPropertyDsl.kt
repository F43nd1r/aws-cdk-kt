@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public fun lambdaActionProperty(initializer: CfnTopicRule.LambdaActionProperty.Builder.() -> Unit):
    CfnTopicRule.LambdaActionProperty =
    CfnTopicRule.LambdaActionProperty.builder().apply(initializer).build()
