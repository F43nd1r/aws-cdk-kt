package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun ecsParametersProperty(initializer: CfnRule.EcsParametersProperty.Builder.() -> Unit =
    {}): CfnRule.EcsParametersProperty =
    CfnRule.EcsParametersProperty.builder().apply(initializer).build()
