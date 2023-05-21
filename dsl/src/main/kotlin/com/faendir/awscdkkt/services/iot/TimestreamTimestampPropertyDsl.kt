package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun timestreamTimestampProperty(initializer: CfnTopicRule.TimestreamTimestampProperty.Builder.() -> Unit
    = {}): CfnTopicRule.TimestreamTimestampProperty =
    CfnTopicRule.TimestreamTimestampProperty.builder().apply(initializer).build()
