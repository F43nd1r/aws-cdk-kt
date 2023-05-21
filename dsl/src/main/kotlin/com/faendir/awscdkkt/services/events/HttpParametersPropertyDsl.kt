package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun httpParametersProperty(initializer: CfnRule.HttpParametersProperty.Builder.() -> Unit =
    {}): CfnRule.HttpParametersProperty =
    CfnRule.HttpParametersProperty.builder().apply(initializer).build()
