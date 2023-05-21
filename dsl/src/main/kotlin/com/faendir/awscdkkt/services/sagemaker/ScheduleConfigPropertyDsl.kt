package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun scheduleConfigProperty(initializer: CfnMonitoringSchedule.ScheduleConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.ScheduleConfigProperty =
    CfnMonitoringSchedule.ScheduleConfigProperty.builder().apply(initializer).build()
