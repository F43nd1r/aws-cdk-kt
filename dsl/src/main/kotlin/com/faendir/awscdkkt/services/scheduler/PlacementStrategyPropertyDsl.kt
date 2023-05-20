@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun placementStrategyProperty(initializer: CfnSchedule.PlacementStrategyProperty.Builder.() -> Unit):
    CfnSchedule.PlacementStrategyProperty =
    CfnSchedule.PlacementStrategyProperty.builder().apply(initializer).build()
