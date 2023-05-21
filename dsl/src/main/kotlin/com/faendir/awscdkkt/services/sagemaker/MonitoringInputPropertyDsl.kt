package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun monitoringInputProperty(initializer: CfnMonitoringSchedule.MonitoringInputProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.MonitoringInputProperty =
    CfnMonitoringSchedule.MonitoringInputProperty.builder().apply(initializer).build()
