package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun monitoringOutputProperty(initializer: CfnMonitoringSchedule.MonitoringOutputProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.MonitoringOutputProperty =
    CfnMonitoringSchedule.MonitoringOutputProperty.builder().apply(initializer).build()
