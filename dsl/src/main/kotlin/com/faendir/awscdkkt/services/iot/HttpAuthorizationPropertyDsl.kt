package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun httpAuthorizationProperty(initializer: CfnTopicRule.HttpAuthorizationProperty.Builder.() -> Unit
    = {}): CfnTopicRule.HttpAuthorizationProperty =
    CfnTopicRule.HttpAuthorizationProperty.builder().apply(initializer).build()
