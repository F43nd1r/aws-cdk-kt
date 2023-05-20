@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun httpActionHeaderProperty(initializer: CfnTopicRule.HttpActionHeaderProperty.Builder.() -> Unit):
    CfnTopicRule.HttpActionHeaderProperty =
    CfnTopicRule.HttpActionHeaderProperty.builder().apply(initializer).build()
