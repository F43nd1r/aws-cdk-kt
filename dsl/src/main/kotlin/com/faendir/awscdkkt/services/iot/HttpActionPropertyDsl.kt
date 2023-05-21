package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun httpActionProperty(initializer: CfnTopicRule.HttpActionProperty.Builder.() -> Unit = {}):
    CfnTopicRule.HttpActionProperty =
    CfnTopicRule.HttpActionProperty.builder().apply(initializer).build()
