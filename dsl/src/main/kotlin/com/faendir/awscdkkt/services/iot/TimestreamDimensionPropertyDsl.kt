package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun timestreamDimensionProperty(initializer: CfnTopicRule.TimestreamDimensionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.TimestreamDimensionProperty =
    CfnTopicRule.TimestreamDimensionProperty.builder().apply(initializer).build()
