package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun httpActionHeaderProperty(initializer: CfnTopicRule.HttpActionHeaderProperty.Builder.() -> Unit
    = {}): CfnTopicRule.HttpActionHeaderProperty =
    CfnTopicRule.HttpActionHeaderProperty.builder().apply(initializer).build()
