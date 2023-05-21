package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun placementStrategyProperty(initializer: CfnPipe.PlacementStrategyProperty.Builder.() -> Unit
    = {}): CfnPipe.PlacementStrategyProperty =
    CfnPipe.PlacementStrategyProperty.builder().apply(initializer).build()
