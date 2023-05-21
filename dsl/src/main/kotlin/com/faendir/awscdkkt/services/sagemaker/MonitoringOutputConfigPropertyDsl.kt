package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun monitoringOutputConfigProperty(initializer: CfnMonitoringSchedule.MonitoringOutputConfigProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.MonitoringOutputConfigProperty =
    CfnMonitoringSchedule.MonitoringOutputConfigProperty.builder().apply(initializer).build()
