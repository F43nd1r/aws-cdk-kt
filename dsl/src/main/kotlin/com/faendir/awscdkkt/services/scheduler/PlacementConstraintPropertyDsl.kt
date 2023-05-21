package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun placementConstraintProperty(initializer: CfnSchedule.PlacementConstraintProperty.Builder.() -> Unit
    = {}): CfnSchedule.PlacementConstraintProperty =
    CfnSchedule.PlacementConstraintProperty.builder().apply(initializer).build()
