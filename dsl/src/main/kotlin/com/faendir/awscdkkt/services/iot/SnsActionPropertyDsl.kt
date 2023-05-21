package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun snsActionProperty(initializer: CfnTopicRule.SnsActionProperty.Builder.() -> Unit = {}):
    CfnTopicRule.SnsActionProperty =
    CfnTopicRule.SnsActionProperty.builder().apply(initializer).build()
