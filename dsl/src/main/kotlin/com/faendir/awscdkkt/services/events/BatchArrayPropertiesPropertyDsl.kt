package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun batchArrayPropertiesProperty(initializer: CfnRule.BatchArrayPropertiesProperty.Builder.() -> Unit
    = {}): CfnRule.BatchArrayPropertiesProperty =
    CfnRule.BatchArrayPropertiesProperty.builder().apply(initializer).build()
