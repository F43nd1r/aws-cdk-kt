package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun republishActionHeadersProperty(initializer: CfnTopicRule.RepublishActionHeadersProperty.Builder.() -> Unit
    = {}): CfnTopicRule.RepublishActionHeadersProperty =
    CfnTopicRule.RepublishActionHeadersProperty.builder().apply(initializer).build()
