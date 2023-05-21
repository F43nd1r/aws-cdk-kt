package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun capacityProviderStrategyItemProperty(initializer: CfnSchedule.CapacityProviderStrategyItemProperty.Builder.() -> Unit
    = {}): CfnSchedule.CapacityProviderStrategyItemProperty =
    CfnSchedule.CapacityProviderStrategyItemProperty.builder().apply(initializer).build()
