package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

@Generated
public fun scheduleProperty(initializer: CfnCanary.ScheduleProperty.Builder.() -> Unit = {}):
    CfnCanary.ScheduleProperty = CfnCanary.ScheduleProperty.builder().apply(initializer).build()
