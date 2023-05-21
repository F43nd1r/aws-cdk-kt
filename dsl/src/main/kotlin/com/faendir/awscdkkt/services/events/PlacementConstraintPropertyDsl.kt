package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun placementConstraintProperty(initializer: CfnRule.PlacementConstraintProperty.Builder.() -> Unit
    = {}): CfnRule.PlacementConstraintProperty =
    CfnRule.PlacementConstraintProperty.builder().apply(initializer).build()
