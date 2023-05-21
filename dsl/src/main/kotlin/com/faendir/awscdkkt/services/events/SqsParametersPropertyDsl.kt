package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun sqsParametersProperty(initializer: CfnRule.SqsParametersProperty.Builder.() -> Unit =
    {}): CfnRule.SqsParametersProperty =
    CfnRule.SqsParametersProperty.builder().apply(initializer).build()
