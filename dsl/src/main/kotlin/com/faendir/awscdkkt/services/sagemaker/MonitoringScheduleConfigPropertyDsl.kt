package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun monitoringScheduleConfigProperty(initializer: CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.MonitoringScheduleConfigProperty =
    CfnMonitoringSchedule.MonitoringScheduleConfigProperty.builder().apply(initializer).build()
