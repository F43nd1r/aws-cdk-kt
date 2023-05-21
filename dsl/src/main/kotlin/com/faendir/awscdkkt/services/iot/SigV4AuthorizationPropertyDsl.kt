package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun sigV4AuthorizationProperty(initializer: CfnTopicRule.SigV4AuthorizationProperty.Builder.() -> Unit
    = {}): CfnTopicRule.SigV4AuthorizationProperty =
    CfnTopicRule.SigV4AuthorizationProperty.builder().apply(initializer).build()
