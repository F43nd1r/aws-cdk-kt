@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public fun httpActionProperty(initializer: CfnTopicRule.HttpActionProperty.Builder.() -> Unit):
    CfnTopicRule.HttpActionProperty =
    CfnTopicRule.HttpActionProperty.builder().apply(initializer).build()
