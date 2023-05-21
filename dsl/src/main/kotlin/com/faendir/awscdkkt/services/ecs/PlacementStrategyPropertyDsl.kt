package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun placementStrategyProperty(initializer: CfnService.PlacementStrategyProperty.Builder.() -> Unit
    = {}): CfnService.PlacementStrategyProperty =
    CfnService.PlacementStrategyProperty.builder().apply(initializer).build()
