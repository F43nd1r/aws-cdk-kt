package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun timestreamActionProperty(initializer: CfnTopicRule.TimestreamActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.TimestreamActionProperty =
    CfnTopicRule.TimestreamActionProperty.builder().apply(initializer).build()
