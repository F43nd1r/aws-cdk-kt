package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@Generated
public
    fun scheduleConfigurationProperty(initializer: CfnScheduledQuery.ScheduleConfigurationProperty.Builder.() -> Unit
    = {}): CfnScheduledQuery.ScheduleConfigurationProperty =
    CfnScheduledQuery.ScheduleConfigurationProperty.builder().apply(initializer).build()
