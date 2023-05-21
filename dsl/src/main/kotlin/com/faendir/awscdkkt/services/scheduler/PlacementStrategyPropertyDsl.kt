package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun placementStrategyProperty(initializer: CfnSchedule.PlacementStrategyProperty.Builder.() -> Unit
    = {}): CfnSchedule.PlacementStrategyProperty =
    CfnSchedule.PlacementStrategyProperty.builder().apply(initializer).build()
