package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun placementConstraintProperty(initializer: CfnPipe.PlacementConstraintProperty.Builder.() -> Unit
    = {}): CfnPipe.PlacementConstraintProperty =
    CfnPipe.PlacementConstraintProperty.builder().apply(initializer).build()
