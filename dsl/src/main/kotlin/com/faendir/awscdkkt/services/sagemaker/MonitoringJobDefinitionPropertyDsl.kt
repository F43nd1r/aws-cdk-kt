package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun monitoringJobDefinitionProperty(initializer: CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.MonitoringJobDefinitionProperty =
    CfnMonitoringSchedule.MonitoringJobDefinitionProperty.builder().apply(initializer).build()
