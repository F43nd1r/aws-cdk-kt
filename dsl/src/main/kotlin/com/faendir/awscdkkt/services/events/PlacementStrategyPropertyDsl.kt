package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun placementStrategyProperty(initializer: CfnRule.PlacementStrategyProperty.Builder.() -> Unit
    = {}): CfnRule.PlacementStrategyProperty =
    CfnRule.PlacementStrategyProperty.builder().apply(initializer).build()
