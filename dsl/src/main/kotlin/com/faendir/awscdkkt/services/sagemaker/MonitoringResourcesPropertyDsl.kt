package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun monitoringResourcesProperty(initializer: CfnMonitoringSchedule.MonitoringResourcesProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.MonitoringResourcesProperty =
    CfnMonitoringSchedule.MonitoringResourcesProperty.builder().apply(initializer).build()
