package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun kinesisParametersProperty(initializer: CfnRule.KinesisParametersProperty.Builder.() -> Unit
    = {}): CfnRule.KinesisParametersProperty =
    CfnRule.KinesisParametersProperty.builder().apply(initializer).build()
