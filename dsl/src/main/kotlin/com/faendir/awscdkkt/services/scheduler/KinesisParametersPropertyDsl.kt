package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun kinesisParametersProperty(initializer: CfnSchedule.KinesisParametersProperty.Builder.() -> Unit
    = {}): CfnSchedule.KinesisParametersProperty =
    CfnSchedule.KinesisParametersProperty.builder().apply(initializer).build()
