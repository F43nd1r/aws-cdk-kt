package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun eventBridgeParametersProperty(initializer: CfnSchedule.EventBridgeParametersProperty.Builder.() -> Unit
    = {}): CfnSchedule.EventBridgeParametersProperty =
    CfnSchedule.EventBridgeParametersProperty.builder().apply(initializer).build()
