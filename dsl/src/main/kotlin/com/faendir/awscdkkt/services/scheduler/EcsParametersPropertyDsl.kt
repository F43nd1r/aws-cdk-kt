package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun ecsParametersProperty(initializer: CfnSchedule.EcsParametersProperty.Builder.() -> Unit =
    {}): CfnSchedule.EcsParametersProperty =
    CfnSchedule.EcsParametersProperty.builder().apply(initializer).build()
