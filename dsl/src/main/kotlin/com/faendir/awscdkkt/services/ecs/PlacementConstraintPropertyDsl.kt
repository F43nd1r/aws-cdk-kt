package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun placementConstraintProperty(initializer: CfnService.PlacementConstraintProperty.Builder.() -> Unit
    = {}): CfnService.PlacementConstraintProperty =
    CfnService.PlacementConstraintProperty.builder().apply(initializer).build()
