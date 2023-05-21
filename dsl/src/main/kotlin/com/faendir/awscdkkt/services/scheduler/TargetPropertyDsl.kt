package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun targetProperty(initializer: CfnSchedule.TargetProperty.Builder.() -> Unit = {}):
    CfnSchedule.TargetProperty = CfnSchedule.TargetProperty.builder().apply(initializer).build()
