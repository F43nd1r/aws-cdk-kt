package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnScheduleProps

@Generated
public fun cfnScheduleProps(initializer: CfnScheduleProps.Builder.() -> Unit = {}): CfnScheduleProps
    = CfnScheduleProps.builder().apply(initializer).build()
