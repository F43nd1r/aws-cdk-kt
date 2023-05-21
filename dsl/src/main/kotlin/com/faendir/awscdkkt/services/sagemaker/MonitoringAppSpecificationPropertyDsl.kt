package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public
    fun monitoringAppSpecificationProperty(initializer: CfnMonitoringSchedule.MonitoringAppSpecificationProperty.Builder.() -> Unit
    = {}): CfnMonitoringSchedule.MonitoringAppSpecificationProperty =
    CfnMonitoringSchedule.MonitoringAppSpecificationProperty.builder().apply(initializer).build()
