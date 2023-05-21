package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun flexibleTimeWindowProperty(initializer: CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit
    = {}): CfnSchedule.FlexibleTimeWindowProperty =
    CfnSchedule.FlexibleTimeWindowProperty.builder().apply(initializer).build()
