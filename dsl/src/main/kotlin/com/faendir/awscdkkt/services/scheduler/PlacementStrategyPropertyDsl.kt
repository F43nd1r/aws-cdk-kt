@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun placementStrategyProperty(initializer: CfnSchedule.PlacementStrategyProperty.Builder.() -> Unit):
    CfnSchedule.PlacementStrategyProperty =
    CfnSchedule.PlacementStrategyProperty.builder().apply(initializer).build()
