package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun batchParametersProperty(initializer: CfnRule.BatchParametersProperty.Builder.() -> Unit =
    {}): CfnRule.BatchParametersProperty =
    CfnRule.BatchParametersProperty.builder().apply(initializer).build()
